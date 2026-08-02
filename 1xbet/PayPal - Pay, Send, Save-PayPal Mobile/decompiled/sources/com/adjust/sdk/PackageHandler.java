package com.adjust.sdk;

/* loaded from: classes7.dex */
public class PackageHandler implements com.adjust.sdk.IPackageHandler, com.adjust.sdk.network.IActivityPackageSender.ResponseDataCallbackSubscriber {
    private static final java.lang.String PACKAGE_QUEUE_FILENAME = "AdjustIoPackageQueue";
    private static final java.lang.String PACKAGE_QUEUE_NAME = "Package queue";
    private java.lang.ref.WeakReference<com.adjust.sdk.IActivityHandler> activityHandlerWeakRef;
    private com.adjust.sdk.network.IActivityPackageSender activityPackageSender;
    private android.content.Context context;
    private java.util.concurrent.atomic.AtomicBoolean isSending;
    private java.util.List<com.adjust.sdk.ActivityPackage> packageQueue;
    private boolean paused;
    private long retryStartedAtTimeMilliSeconds;
    private com.adjust.sdk.scheduler.ThreadScheduler scheduler = new com.adjust.sdk.scheduler.SingleThreadCachedScheduler("PackageHandler");
    private com.adjust.sdk.ILogger logger = com.adjust.sdk.AdjustFactory.getLogger();
    private com.adjust.sdk.BackoffStrategy backoffStrategy = com.adjust.sdk.AdjustFactory.getPackageHandlerBackoffStrategy();
    private com.adjust.sdk.BackoffStrategy backoffStrategyForInstallSession = com.adjust.sdk.AdjustFactory.getInstallSessionBackoffStrategy();
    private boolean isRetrying = false;
    private double totalWaitTimeSeconds = 0.0d;

    public PackageHandler(com.adjust.sdk.IActivityHandler iActivityHandler, android.content.Context context, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender) {
        init(iActivityHandler, context, z, iActivityPackageSender);
        this.scheduler.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.PackageHandler.1
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.PackageHandler.this.initI();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addI(com.adjust.sdk.ActivityPackage activityPackage) {
        if (this.isRetrying) {
            activityPackage.setWaitBeforeSendTimeSeconds(this.totalWaitTimeSeconds - ((java.lang.System.currentTimeMillis() - this.retryStartedAtTimeMilliSeconds) / 1000.0d));
        }
        com.adjust.sdk.PackageBuilder.addLong(activityPackage.getParameters(), "enqueue_size", this.packageQueue.size());
        this.packageQueue.add(activityPackage);
        this.logger.debug("Added package %d (%s)", java.lang.Integer.valueOf(this.packageQueue.size()), activityPackage);
        this.logger.verbose("%s", activityPackage.getExtendedString());
        writePackageQueueI();
    }

    public static java.lang.Boolean deletePackageQueue(android.content.Context context) {
        return java.lang.Boolean.valueOf(context.deleteFile(PACKAGE_QUEUE_FILENAME));
    }

    public static void deleteState(android.content.Context context) {
        deletePackageQueue(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flushI() {
        this.packageQueue.clear();
        writePackageQueueI();
    }

    private java.util.Map<java.lang.String, java.lang.String> generateSendingParametersI() {
        java.util.HashMap hashMap = new java.util.HashMap();
        int size = this.packageQueue.size() - 1;
        if (size > 0) {
            com.adjust.sdk.PackageBuilder.addLong(hashMap, "queue_size", size);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initI() {
        this.isSending = new java.util.concurrent.atomic.AtomicBoolean();
        readPackageQueueI();
    }

    private void readPackageQueueI() {
        try {
            this.packageQueue = (java.util.List) com.adjust.sdk.Util.readObject(this.context, PACKAGE_QUEUE_FILENAME, PACKAGE_QUEUE_NAME, java.util.List.class);
        } catch (java.lang.Exception e) {
            this.logger.error("Failed to read %s file (%s)", PACKAGE_QUEUE_NAME, e.getMessage());
            this.packageQueue = null;
        }
        java.util.List<com.adjust.sdk.ActivityPackage> list = this.packageQueue;
        if (list != null) {
            this.logger.debug("Package handler read %d packages", java.lang.Integer.valueOf(list.size()));
        } else {
            this.packageQueue = new java.util.ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendFirstI() {
        if (this.packageQueue.isEmpty()) {
            return;
        }
        if (this.paused) {
            this.logger.debug("Package handler is paused", new java.lang.Object[0]);
            return;
        }
        if (this.isSending.getAndSet(true)) {
            this.logger.verbose("Package handler is already sending", new java.lang.Object[0]);
            return;
        }
        java.util.Map<java.lang.String, java.lang.String> generateSendingParametersI = generateSendingParametersI();
        com.adjust.sdk.ActivityPackage activityPackage = this.packageQueue.get(0);
        com.adjust.sdk.PackageBuilder.addLong(generateSendingParametersI, "retry_count", activityPackage.getRetryCount());
        com.adjust.sdk.PackageBuilder.addLong(generateSendingParametersI, "first_error", activityPackage.getFirstErrorCode());
        com.adjust.sdk.PackageBuilder.addLong(generateSendingParametersI, "last_error", activityPackage.getLastErrorCode());
        com.adjust.sdk.PackageBuilder.addDouble(generateSendingParametersI, "wait_total", this.totalWaitTimeSeconds);
        com.adjust.sdk.PackageBuilder.addDouble(generateSendingParametersI, "wait_time", activityPackage.getWaitBeforeSendTimeSeconds());
        this.activityPackageSender.sendActivityPackage(activityPackage, generateSendingParametersI, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNextI(java.lang.Long l) {
        this.isRetrying = false;
        this.retryStartedAtTimeMilliSeconds = 0L;
        if (this.packageQueue.isEmpty()) {
            this.totalWaitTimeSeconds = 0.0d;
            return;
        }
        this.packageQueue.remove(0);
        writePackageQueueI();
        if (l == null || l.longValue() <= 0) {
            this.logger.verbose("Package handler can send", new java.lang.Object[0]);
            this.isSending.set(false);
            sendFirstI();
        } else {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.adjust.sdk.PackageHandler.7
                @Override // java.lang.Runnable
                public final void run() {
                    com.adjust.sdk.PackageHandler.this.logger.verbose("Package handler finished waiting to continue", new java.lang.Object[0]);
                    com.adjust.sdk.PackageHandler.this.isSending.set(false);
                    com.adjust.sdk.PackageHandler.this.sendFirstPackage();
                }
            };
            this.logger.verbose("Waiting for %d seconds before continuing for next package in continue_in", java.lang.Double.valueOf(l.longValue() / 1000.0d));
            this.scheduler.schedule(runnable, l.longValue());
        }
    }

    private void writePackageQueueI() {
        com.adjust.sdk.Util.writeObject(this.packageQueue, this.context, PACKAGE_QUEUE_FILENAME, PACKAGE_QUEUE_NAME);
        this.logger.debug("Package handler wrote %d packages", java.lang.Integer.valueOf(this.packageQueue.size()));
    }

    @Override // com.adjust.sdk.IPackageHandler
    public void addPackage(final com.adjust.sdk.ActivityPackage activityPackage) {
        this.scheduler.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.PackageHandler.2
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.PackageHandler.this.addI(activityPackage);
            }
        });
    }

    @Override // com.adjust.sdk.IPackageHandler
    public void flush() {
        this.scheduler.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.PackageHandler.6
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.PackageHandler.this.flushI();
            }
        });
    }

    @Override // com.adjust.sdk.IPackageHandler
    public void init(com.adjust.sdk.IActivityHandler iActivityHandler, android.content.Context context, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender) {
        this.activityHandlerWeakRef = new java.lang.ref.WeakReference<>(iActivityHandler);
        this.context = context;
        this.paused = !z;
        this.activityPackageSender = iActivityPackageSender;
    }

    @Override // com.adjust.sdk.network.IActivityPackageSender.ResponseDataCallbackSubscriber
    public void onResponseDataCallback(final com.adjust.sdk.ResponseData responseData) {
        this.logger.debug("Got response in PackageHandler", new java.lang.Object[0]);
        com.adjust.sdk.IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        if (iActivityHandler != null && responseData.trackingState == com.adjust.sdk.TrackingState.OPTED_OUT) {
            iActivityHandler.gotOptOutResponse();
        }
        if (!responseData.willRetry) {
            this.scheduler.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.PackageHandler.4
                @Override // java.lang.Runnable
                public final void run() {
                    com.adjust.sdk.PackageHandler.this.sendNextI(responseData.continueIn);
                }
            });
            if (iActivityHandler != null) {
                iActivityHandler.finishedTrackingActivity(responseData);
                return;
            }
            return;
        }
        if (!this.isRetrying) {
            this.isRetrying = true;
            this.retryStartedAtTimeMilliSeconds = java.lang.System.currentTimeMillis();
        }
        writePackageQueueI();
        if (iActivityHandler != null) {
            iActivityHandler.finishedTrackingActivity(responseData);
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.adjust.sdk.PackageHandler.5
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.PackageHandler.this.logger.verbose("Package handler can send", new java.lang.Object[0]);
                com.adjust.sdk.PackageHandler.this.isSending.set(false);
                com.adjust.sdk.PackageHandler.this.sendFirstPackage();
            }
        };
        java.lang.Long l = responseData.retryIn;
        if (l != null) {
            this.scheduler.schedule(runnable, l.longValue());
            return;
        }
        int increaseRetries = responseData.activityPackage.increaseRetries();
        long waitingTime = (responseData.activityPackage.getActivityKind() != com.adjust.sdk.ActivityKind.SESSION || com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.context).getInstallTracked()) ? com.adjust.sdk.Util.getWaitingTime(increaseRetries, this.backoffStrategy) : com.adjust.sdk.Util.getWaitingTime(increaseRetries, this.backoffStrategyForInstallSession);
        double d = waitingTime / 1000.0d;
        java.lang.String format = com.adjust.sdk.Util.SecondsDisplayFormat.format(d);
        this.totalWaitTimeSeconds += d;
        this.logger.verbose("Waiting for %s seconds before retrying %s for the %d time", format, responseData.activityPackage.getActivityKind().toString(), java.lang.Integer.valueOf(increaseRetries));
        this.scheduler.schedule(runnable, waitingTime);
        com.adjust.sdk.ActivityPackage activityPackage = responseData.activityPackage;
        activityPackage.setWaitBeforeSendTimeSeconds(activityPackage.getWaitBeforeSendTimeSeconds() + d);
    }

    @Override // com.adjust.sdk.IPackageHandler
    public void pauseSending() {
        this.paused = true;
    }

    @Override // com.adjust.sdk.IPackageHandler
    public void resumeSending() {
        this.paused = false;
    }

    @Override // com.adjust.sdk.IPackageHandler
    public void sendFirstPackage() {
        this.scheduler.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.PackageHandler.3
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.PackageHandler.this.sendFirstI();
            }
        });
    }

    @Override // com.adjust.sdk.IPackageHandler
    public void teardown() {
        this.logger.verbose("PackageHandler teardown", new java.lang.Object[0]);
        com.adjust.sdk.scheduler.ThreadScheduler threadScheduler = this.scheduler;
        if (threadScheduler != null) {
            threadScheduler.teardown();
        }
        java.lang.ref.WeakReference<com.adjust.sdk.IActivityHandler> weakReference = this.activityHandlerWeakRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        java.util.List<com.adjust.sdk.ActivityPackage> list = this.packageQueue;
        if (list != null) {
            list.clear();
        }
        this.scheduler = null;
        this.activityHandlerWeakRef = null;
        this.packageQueue = null;
        this.isSending = null;
        this.context = null;
        this.logger = null;
        this.backoffStrategy = null;
    }
}
