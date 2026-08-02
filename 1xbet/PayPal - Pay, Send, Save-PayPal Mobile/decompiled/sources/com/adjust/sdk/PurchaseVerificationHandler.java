package com.adjust.sdk;

/* loaded from: classes7.dex */
public class PurchaseVerificationHandler implements com.adjust.sdk.IPurchaseVerificationHandler {
    private static final double MILLISECONDS_TO_SECONDS_DIVISOR = 1000.0d;
    private static final java.lang.String SCHEDULED_EXECUTOR_SOURCE = "PurchaseVerificationHandler";
    private java.lang.ref.WeakReference<com.adjust.sdk.IActivityHandler> activityHandlerWeakRef;
    private com.adjust.sdk.network.IActivityPackageSender activityPackageSender;
    private boolean isSendingPurchaseVerificationPackage;
    private long lastPackageRetryInMilli = 0;
    private com.adjust.sdk.ILogger logger;
    private java.util.List<com.adjust.sdk.ActivityPackage> packageQueue;
    private boolean paused;
    private com.adjust.sdk.scheduler.ThreadScheduler scheduler;

    public PurchaseVerificationHandler(com.adjust.sdk.IActivityHandler iActivityHandler, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender) {
        init(iActivityHandler, z, iActivityPackageSender);
        this.logger = com.adjust.sdk.AdjustFactory.getLogger();
        this.scheduler = new com.adjust.sdk.scheduler.SingleThreadCachedScheduler(SCHEDULED_EXECUTOR_SOURCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNextPurchaseVerificationPackage() {
        this.scheduler.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.PurchaseVerificationHandler.2
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.PurchaseVerificationHandler.this.sendNextPurchaseVerificationPackageI();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNextPurchaseVerificationPackageI() {
        com.adjust.sdk.IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        if (iActivityHandler.getActivityState() == null || this.packageQueue.isEmpty()) {
            return;
        }
        if (iActivityHandler.getActivityState().isGdprForgotten) {
            this.logger.debug("purchase_verification request won't be sent for GDPR forgotten user", new java.lang.Object[0]);
            return;
        }
        if (this.paused) {
            this.logger.debug("PurchaseVerificationHandler is paused", new java.lang.Object[0]);
            return;
        }
        if (this.isSendingPurchaseVerificationPackage) {
            this.logger.debug("PurchaseVerificationHandler is is already sending a package", new java.lang.Object[0]);
            return;
        }
        long waitTime = waitTime();
        if (waitTime > 0) {
            this.scheduler.schedule(new java.lang.Runnable() { // from class: com.adjust.sdk.PurchaseVerificationHandler.3
                @Override // java.lang.Runnable
                public final void run() {
                    com.adjust.sdk.PurchaseVerificationHandler.this.lastPackageRetryInMilli = 0L;
                    com.adjust.sdk.PurchaseVerificationHandler.this.sendNextPurchaseVerificationPackage();
                }
            }, waitTime);
        } else {
            com.adjust.sdk.ActivityPackage activityPackage = this.packageQueue.get(0);
            this.isSendingPurchaseVerificationPackage = true;
            sendPurchaseVerificationPackageSync(activityPackage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendPurchaseVerificationPackageI(com.adjust.sdk.ActivityPackage activityPackage) {
        this.packageQueue.add(activityPackage);
        this.logger.debug("Added purchase_verification %d", java.lang.Integer.valueOf(this.packageQueue.size()));
        this.logger.verbose("%s", activityPackage.getExtendedString());
        sendNextPurchaseVerificationPackage();
    }

    private void sendPurchaseVerificationPackageSync(com.adjust.sdk.ActivityPackage activityPackage) {
        com.adjust.sdk.IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        com.adjust.sdk.ResponseData sendActivityPackageSync = this.activityPackageSender.sendActivityPackageSync(activityPackage, null);
        if (sendActivityPackageSync instanceof com.adjust.sdk.PurchaseVerificationResponseData) {
            this.isSendingPurchaseVerificationPackage = false;
            com.adjust.sdk.PurchaseVerificationResponseData purchaseVerificationResponseData = (com.adjust.sdk.PurchaseVerificationResponseData) sendActivityPackageSync;
            if (purchaseVerificationResponseData.jsonResponse == null) {
                this.logger.error("Could not get purchase_verification JSON response with message: %s", purchaseVerificationResponseData.message);
            } else {
                if (iActivityHandler == null) {
                    return;
                }
                if (purchaseVerificationResponseData.trackingState == com.adjust.sdk.TrackingState.OPTED_OUT) {
                    iActivityHandler.gotOptOutResponse();
                    return;
                }
                if (purchaseVerificationResponseData.willRetry) {
                    java.lang.Long l = sendActivityPackageSync.retryIn;
                    if (l != null && l.longValue() > 0) {
                        long longValue = sendActivityPackageSync.retryIn.longValue();
                        this.lastPackageRetryInMilli = longValue;
                        this.logger.error("Retrying purchase_verification package with retry in %d ms", java.lang.Long.valueOf(longValue));
                    }
                    sendNextPurchaseVerificationPackage();
                    return;
                }
                this.lastPackageRetryInMilli = 0L;
            }
            if (!this.packageQueue.isEmpty()) {
                this.packageQueue.remove(0);
            }
            iActivityHandler.finishedTrackingActivity(purchaseVerificationResponseData);
            sendNextPurchaseVerificationPackage();
        }
    }

    private long waitTime() {
        long j = this.lastPackageRetryInMilli;
        if (j <= 0) {
            return 0L;
        }
        this.logger.verbose("Waiting for %d ms before retrying purchase_verification with retry_in", java.lang.Long.valueOf(j));
        return this.lastPackageRetryInMilli;
    }

    @Override // com.adjust.sdk.IPurchaseVerificationHandler
    public void init(com.adjust.sdk.IActivityHandler iActivityHandler, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender) {
        this.paused = !z;
        this.packageQueue = new java.util.ArrayList();
        this.activityHandlerWeakRef = new java.lang.ref.WeakReference<>(iActivityHandler);
        this.activityPackageSender = iActivityPackageSender;
        this.isSendingPurchaseVerificationPackage = false;
        this.lastPackageRetryInMilli = 0L;
    }

    @Override // com.adjust.sdk.IPurchaseVerificationHandler
    public void pauseSending() {
        this.paused = true;
        this.isSendingPurchaseVerificationPackage = false;
        this.lastPackageRetryInMilli = 0L;
    }

    @Override // com.adjust.sdk.IPurchaseVerificationHandler
    public void resumeSending() {
        this.paused = false;
        sendNextPurchaseVerificationPackage();
    }

    @Override // com.adjust.sdk.IPurchaseVerificationHandler
    public void sendPurchaseVerificationPackage(final com.adjust.sdk.ActivityPackage activityPackage) {
        this.scheduler.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.PurchaseVerificationHandler.1
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.PurchaseVerificationHandler.this.sendPurchaseVerificationPackageI(activityPackage);
            }
        });
    }

    @Override // com.adjust.sdk.IPurchaseVerificationHandler
    public void teardown() {
        this.logger.verbose("PurchaseVerificationHandler teardown", new java.lang.Object[0]);
        com.adjust.sdk.scheduler.ThreadScheduler threadScheduler = this.scheduler;
        if (threadScheduler != null) {
            threadScheduler.teardown();
        }
        java.util.List<com.adjust.sdk.ActivityPackage> list = this.packageQueue;
        if (list != null) {
            list.clear();
        }
        java.lang.ref.WeakReference<com.adjust.sdk.IActivityHandler> weakReference = this.activityHandlerWeakRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.logger = null;
        this.packageQueue = null;
        this.scheduler = null;
        this.isSendingPurchaseVerificationPackage = false;
        this.lastPackageRetryInMilli = 0L;
    }
}
