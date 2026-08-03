package com.adjust.sdk;

/* loaded from: classes2.dex */
public class SdkClickHandler implements com.adjust.sdk.ISdkClickHandler {
    private static final double MILLISECONDS_TO_SECONDS_DIVISOR = 1000.0d;
    private static final java.lang.String SCHEDULED_EXECUTOR_SOURCE = "SdkClickHandler";
    private static final java.lang.String SOURCE_INSTALL_REFERRER = "install_referrer";
    private static final java.lang.String SOURCE_REFTAG = "reftag";
    private java.lang.ref.WeakReference<com.adjust.sdk.IActivityHandler> activityHandlerWeakRef;
    private com.adjust.sdk.network.IActivityPackageSender activityPackageSender;
    private com.adjust.sdk.BackoffStrategy backoffStrategy;
    private long lastPackageRetryInMilli = 0;
    private com.adjust.sdk.ILogger logger;
    private java.util.List<com.adjust.sdk.ActivityPackage> packageQueue;
    private boolean paused;
    private com.adjust.sdk.scheduler.ThreadScheduler scheduler;

    public SdkClickHandler(com.adjust.sdk.IActivityHandler iActivityHandler, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender) {
        init(iActivityHandler, z, iActivityPackageSender);
        this.logger = com.adjust.sdk.AdjustFactory.getLogger();
        this.backoffStrategy = com.adjust.sdk.AdjustFactory.getSdkClickBackoffStrategy();
        this.scheduler = new com.adjust.sdk.scheduler.SingleThreadCachedScheduler(SCHEDULED_EXECUTOR_SOURCE);
    }

    private java.util.Map<java.lang.String, java.lang.String> generateSendingParametersI() {
        java.util.HashMap hashMap = new java.util.HashMap();
        int size = this.packageQueue.size() - 1;
        if (size > 0) {
            com.adjust.sdk.PackageBuilder.addLong(hashMap, "queue_size", size);
        }
        return hashMap;
    }

    private void logErrorMessageI(com.adjust.sdk.ActivityPackage activityPackage, java.lang.String str, java.lang.Throwable th) {
        this.logger.error(com.adjust.sdk.Util.formatString("%s. (%s)", activityPackage.getFailureMessage(), com.adjust.sdk.Util.getReasonString(str, th)), new java.lang.Object[0]);
    }

    private void retrySendingI(com.adjust.sdk.ActivityPackage activityPackage, java.lang.Long l) {
        if (l == null || l.longValue() <= 0) {
            this.logger.error("Retrying sdk_click package for the %d time", java.lang.Integer.valueOf(activityPackage.increaseRetries()));
        } else {
            this.lastPackageRetryInMilli = l.longValue();
        }
        sendSdkClick(activityPackage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNextSdkClick() {
        this.scheduler.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.SdkClickHandler.4
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.SdkClickHandler.this.sendNextSdkClickI();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNextSdkClickI() {
        com.adjust.sdk.IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        if (iActivityHandler.getActivityState() == null || iActivityHandler.getActivityState().isGdprForgotten || this.paused || this.packageQueue.isEmpty()) {
            return;
        }
        final com.adjust.sdk.ActivityPackage remove = this.packageQueue.remove(0);
        int retries = remove.getRetries();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.adjust.sdk.SdkClickHandler.5
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.SdkClickHandler.this.sendSdkClickI(remove);
                com.adjust.sdk.SdkClickHandler.this.sendNextSdkClick();
            }
        };
        long waitTime = waitTime(retries);
        if (waitTime > 0) {
            this.scheduler.schedule(runnable, waitTime);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSdkClickI(com.adjust.sdk.ActivityPackage activityPackage) {
        long j;
        java.lang.String str;
        long j2;
        long j3;
        long j4;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Boolean bool;
        java.lang.Boolean bool2;
        java.lang.String str4;
        com.adjust.sdk.IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        java.lang.String str5 = activityPackage.getParameters().get("source");
        boolean z = str5 != null && str5.equals("reftag");
        java.lang.String str6 = activityPackage.getParameters().get("raw_referrer");
        if (z && com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext()).getRawReferrer(str6, activityPackage.getClickTimeInMilliseconds()) == null) {
            return;
        }
        boolean z2 = str5 != null && str5.equals("install_referrer");
        if (z2) {
            j = activityPackage.getClickTimeInSeconds();
            j3 = activityPackage.getInstallBeginTimeInSeconds();
            str = activityPackage.getParameters().get(com.adjust.sdk.Constants.REFERRER);
            j4 = activityPackage.getClickTimeServerInSeconds();
            long installBeginTimeServerInSeconds = activityPackage.getInstallBeginTimeServerInSeconds();
            str3 = activityPackage.getInstallVersion();
            bool = activityPackage.getGooglePlayInstant();
            bool2 = activityPackage.getIsClick();
            str2 = activityPackage.getParameters().get("referrer_api");
            j2 = installBeginTimeServerInSeconds;
        } else {
            j = -1;
            str = null;
            j2 = -1;
            j3 = -1;
            j4 = -1;
            str2 = null;
            str3 = null;
            bool = null;
            bool2 = null;
        }
        long j5 = j2;
        boolean z3 = str5 != null && str5.equals(com.adjust.sdk.Constants.PREINSTALL);
        boolean z4 = str5 != null && str5.equals(com.adjust.sdk.Constants.LICENSE_VERIFICATION);
        com.adjust.sdk.ResponseData sendActivityPackageSync = this.activityPackageSender.sendActivityPackageSync(activityPackage, generateSendingParametersI());
        if (sendActivityPackageSync instanceof com.adjust.sdk.SdkClickResponseData) {
            com.adjust.sdk.SdkClickResponseData sdkClickResponseData = (com.adjust.sdk.SdkClickResponseData) sendActivityPackageSync;
            if (sdkClickResponseData.willRetry) {
                retrySendingI(activityPackage, sdkClickResponseData.retryIn);
                return;
            }
            boolean z5 = z3;
            this.lastPackageRetryInMilli = 0L;
            if (iActivityHandler == null) {
                return;
            }
            if (sdkClickResponseData.trackingState == com.adjust.sdk.TrackingState.OPTED_OUT) {
                iActivityHandler.gotOptOutResponse();
                return;
            }
            if (z) {
                com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext()).removeRawReferrer(str6, activityPackage.getClickTimeInMilliseconds());
            }
            if (z2) {
                sdkClickResponseData.clickTime = j;
                sdkClickResponseData.installBegin = j3;
                sdkClickResponseData.installReferrer = str;
                sdkClickResponseData.clickTimeServer = j4;
                sdkClickResponseData.installBeginServer = j5;
                sdkClickResponseData.installVersion = str3;
                sdkClickResponseData.googlePlayInstant = bool;
                sdkClickResponseData.isClick = bool2;
                sdkClickResponseData.referrerApi = str2;
                sdkClickResponseData.isInstallReferrer = true;
            }
            if (z5 && (str4 = activityPackage.getParameters().get("found_location")) != null && !str4.isEmpty()) {
                com.adjust.sdk.SharedPreferencesManager defaultInstance = com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext());
                if (com.adjust.sdk.Constants.SYSTEM_INSTALLER_REFERRER.equalsIgnoreCase(str4)) {
                    defaultInstance.removePreinstallReferrer();
                } else {
                    defaultInstance.setPreinstallPayloadReadStatus(com.adjust.sdk.PreinstallUtil.markAsRead(str4, defaultInstance.getPreinstallPayloadReadStatus()));
                }
            }
            if (z4) {
                com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext()).setLicenseVerificationTracked();
            }
            iActivityHandler.finishedTrackingActivity(sdkClickResponseData);
        }
    }

    private long waitTime(int i) {
        long j = this.lastPackageRetryInMilli;
        if (j > 0) {
            return j;
        }
        if (i <= 0) {
            return 0L;
        }
        long waitingTime = com.adjust.sdk.Util.getWaitingTime(i, this.backoffStrategy);
        this.logger.verbose("Waiting for %s seconds before retrying sdk_click for the %d time", com.adjust.sdk.Util.SecondsDisplayFormat.format(waitingTime / MILLISECONDS_TO_SECONDS_DIVISOR), java.lang.Integer.valueOf(i));
        return waitingTime;
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void init(com.adjust.sdk.IActivityHandler iActivityHandler, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender) {
        this.paused = !z;
        this.packageQueue = new java.util.ArrayList();
        this.activityHandlerWeakRef = new java.lang.ref.WeakReference<>(iActivityHandler);
        this.activityPackageSender = iActivityPackageSender;
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void pauseSending() {
        this.paused = true;
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void resumeSending() {
        this.paused = false;
        sendNextSdkClick();
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void sendPreinstallPayload(final java.lang.String str, final java.lang.String str2) {
        this.scheduler.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.SdkClickHandler.3
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.IActivityHandler iActivityHandler = (com.adjust.sdk.IActivityHandler) com.adjust.sdk.SdkClickHandler.this.activityHandlerWeakRef.get();
                if (iActivityHandler == null) {
                    return;
                }
                com.adjust.sdk.SdkClickHandler.this.sendSdkClick(com.adjust.sdk.PackageFactory.buildPreinstallSdkClickPackage(str, str2, iActivityHandler.getActivityState(), iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getGlobalParameters(), iActivityHandler.getFirstSessionDelayManager()));
            }
        });
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void sendReftagReferrers() {
        this.scheduler.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.SdkClickHandler.2
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.IActivityHandler iActivityHandler = (com.adjust.sdk.IActivityHandler) com.adjust.sdk.SdkClickHandler.this.activityHandlerWeakRef.get();
                com.adjust.sdk.SharedPreferencesManager defaultInstance = com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext());
                try {
                    org.json.JSONArray rawReferrerArray = defaultInstance.getRawReferrerArray();
                    boolean z = false;
                    for (int i = 0; i < rawReferrerArray.length(); i++) {
                        org.json.JSONArray jSONArray = rawReferrerArray.getJSONArray(i);
                        if (jSONArray.optInt(2, -1) == 0) {
                            java.lang.String optString = jSONArray.optString(0, null);
                            long optLong = jSONArray.optLong(1, -1L);
                            jSONArray.put(2, 1);
                            com.adjust.sdk.SdkClickHandler.this.sendSdkClick(com.adjust.sdk.PackageFactory.buildReftagSdkClickPackage(optString, optLong, iActivityHandler.getActivityState(), iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getGlobalParameters(), iActivityHandler.getFirstSessionDelayManager(), iActivityHandler.getInternalState()));
                            z = true;
                        }
                    }
                    if (z) {
                        defaultInstance.saveRawReferrerArray(rawReferrerArray);
                    }
                } catch (org.json.JSONException e) {
                    com.adjust.sdk.SdkClickHandler.this.logger.error("Send saved raw referrers error (%s)", e.getMessage());
                }
            }
        });
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void sendSdkClick(final com.adjust.sdk.ActivityPackage activityPackage) {
        this.scheduler.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.SdkClickHandler.1
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.SdkClickHandler.this.packageQueue.add(activityPackage);
                com.adjust.sdk.SdkClickHandler.this.logger.debug("Added sdk_click %d", java.lang.Integer.valueOf(com.adjust.sdk.SdkClickHandler.this.packageQueue.size()));
                com.adjust.sdk.SdkClickHandler.this.logger.verbose("%s", activityPackage.getExtendedString());
                com.adjust.sdk.SdkClickHandler.this.sendNextSdkClick();
            }
        });
    }

    @Override // com.adjust.sdk.ISdkClickHandler
    public void teardown() {
        this.logger.verbose("SdkClickHandler teardown", new java.lang.Object[0]);
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
        this.backoffStrategy = null;
        this.scheduler = null;
    }
}
