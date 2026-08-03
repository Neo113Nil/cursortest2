package com.adjust.sdk;

/* loaded from: classes2.dex */
public class AttributionHandler implements com.adjust.sdk.IAttributionHandler, com.adjust.sdk.network.IActivityPackageSender.ResponseDataCallbackSubscriber {
    private static final java.lang.String ATTRIBUTION_TIMER_NAME = "Attribution timer";
    private java.lang.ref.WeakReference<com.adjust.sdk.IActivityHandler> activityHandlerWeakRef;
    private com.adjust.sdk.network.IActivityPackageSender activityPackageSender;
    private java.lang.String lastInitiatedBy;
    private boolean paused;
    private com.adjust.sdk.ILogger logger = com.adjust.sdk.AdjustFactory.getLogger();
    private com.adjust.sdk.scheduler.ThreadScheduler scheduler = new com.adjust.sdk.scheduler.SingleThreadCachedScheduler("AttributionHandler");
    private com.adjust.sdk.scheduler.TimerOnce timer = new com.adjust.sdk.scheduler.TimerOnce(new java.lang.Runnable() { // from class: com.adjust.sdk.AttributionHandler.1
        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.AttributionHandler.this.sendAttributionRequest();
        }
    }, ATTRIBUTION_TIMER_NAME);

    public AttributionHandler(com.adjust.sdk.IActivityHandler iActivityHandler, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender) {
        init(iActivityHandler, z, iActivityPackageSender);
    }

    private com.adjust.sdk.ActivityPackage buildAndGetAttributionPackage(com.adjust.sdk.ActivityHandler.InternalState internalState) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.adjust.sdk.IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getActivityState(), iActivityHandler.getGlobalParameters(), iActivityHandler.getFirstSessionDelayManager(), currentTimeMillis);
        packageBuilder.internalState = internalState;
        com.adjust.sdk.ActivityPackage buildAttributionPackage = packageBuilder.buildAttributionPackage(this.lastInitiatedBy);
        this.lastInitiatedBy = null;
        return buildAttributionPackage;
    }

    private void checkAttributionI(com.adjust.sdk.IActivityHandler iActivityHandler, com.adjust.sdk.ResponseData responseData) {
        if (responseData.jsonResponse == null) {
            return;
        }
        java.lang.Long l = responseData.askIn;
        if (l == null || l.longValue() < 0) {
            iActivityHandler.setAskingAttribution(false);
            return;
        }
        iActivityHandler.setAskingAttribution(true);
        this.lastInitiatedBy = "backend";
        getAttributionI(l.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkAttributionResponseI(com.adjust.sdk.IActivityHandler iActivityHandler, com.adjust.sdk.AttributionResponseData attributionResponseData) {
        checkAttributionI(iActivityHandler, attributionResponseData);
        checkDeeplinkInAttributionResponseI(attributionResponseData);
        iActivityHandler.launchAttributionResponseTasks(attributionResponseData);
    }

    private void checkDeeplinkInAttributionResponseI(com.adjust.sdk.AttributionResponseData attributionResponseData) {
        org.json.JSONObject optJSONObject;
        java.lang.String optString;
        org.json.JSONObject jSONObject = attributionResponseData.jsonResponse;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(com.ironsource.Y3.c)) == null || (optString = optJSONObject.optString(com.adjust.sdk.Constants.DEEPLINK, null)) == null) {
            return;
        }
        attributionResponseData.deeplink = android.net.Uri.parse(optString);
    }

    private void checkDeeplinkInSessionResponseI(com.adjust.sdk.SessionResponseData sessionResponseData) {
        java.lang.String optString;
        org.json.JSONObject jSONObject = sessionResponseData.jsonResponse;
        if (jSONObject == null || (optString = jSONObject.optString(com.adjust.sdk.Constants.DEEPLINK, null)) == null) {
            return;
        }
        sessionResponseData.deeplink = android.net.Uri.parse(optString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkSdkClickResponseI(com.adjust.sdk.IActivityHandler iActivityHandler, com.adjust.sdk.SdkClickResponseData sdkClickResponseData) {
        checkAttributionI(iActivityHandler, sdkClickResponseData);
        iActivityHandler.launchSdkClickResponseTasks(sdkClickResponseData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkSessionResponseI(com.adjust.sdk.IActivityHandler iActivityHandler, com.adjust.sdk.SessionResponseData sessionResponseData) {
        checkAttributionI(iActivityHandler, sessionResponseData);
        checkDeeplinkInSessionResponseI(sessionResponseData);
        iActivityHandler.launchSessionResponseTasks(sessionResponseData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getAttributionI(long j) {
        if (this.timer.getFireIn() > j) {
            return;
        }
        if (j != 0) {
            this.logger.debug("Waiting to query attribution in %s seconds", com.adjust.sdk.Util.SecondsDisplayFormat.format(j / 1000.0d));
        }
        this.timer.startIn(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAttributionRequest() {
        this.scheduler.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.AttributionHandler.6
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.AttributionHandler.this.sendAttributionRequestI();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAttributionRequestI() {
        if (this.activityHandlerWeakRef.get().getActivityState().isGdprForgotten) {
            return;
        }
        if (this.paused) {
            this.logger.debug("Attribution handler is paused", new java.lang.Object[0]);
            return;
        }
        com.adjust.sdk.ActivityPackage buildAndGetAttributionPackage = buildAndGetAttributionPackage(this.activityHandlerWeakRef.get().getInternalState());
        this.logger.verbose("%s", buildAndGetAttributionPackage.getExtendedString());
        this.activityPackageSender.sendActivityPackage(buildAndGetAttributionPackage, null, this);
    }

    public void checkAttributionResponse(final com.adjust.sdk.AttributionResponseData attributionResponseData) {
        this.scheduler.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.AttributionHandler.5
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.IActivityHandler iActivityHandler = (com.adjust.sdk.IActivityHandler) com.adjust.sdk.AttributionHandler.this.activityHandlerWeakRef.get();
                if (iActivityHandler == null) {
                    return;
                }
                com.adjust.sdk.AttributionHandler.this.checkAttributionResponseI(iActivityHandler, attributionResponseData);
            }
        });
    }

    @Override // com.adjust.sdk.IAttributionHandler
    public void checkSdkClickResponse(final com.adjust.sdk.SdkClickResponseData sdkClickResponseData) {
        this.scheduler.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.AttributionHandler.4
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.IActivityHandler iActivityHandler = (com.adjust.sdk.IActivityHandler) com.adjust.sdk.AttributionHandler.this.activityHandlerWeakRef.get();
                if (iActivityHandler == null) {
                    return;
                }
                com.adjust.sdk.AttributionHandler.this.checkSdkClickResponseI(iActivityHandler, sdkClickResponseData);
            }
        });
    }

    @Override // com.adjust.sdk.IAttributionHandler
    public void checkSessionResponse(final com.adjust.sdk.SessionResponseData sessionResponseData) {
        this.scheduler.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.AttributionHandler.3
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.IActivityHandler iActivityHandler = (com.adjust.sdk.IActivityHandler) com.adjust.sdk.AttributionHandler.this.activityHandlerWeakRef.get();
                if (iActivityHandler == null) {
                    return;
                }
                com.adjust.sdk.AttributionHandler.this.checkSessionResponseI(iActivityHandler, sessionResponseData);
            }
        });
    }

    @Override // com.adjust.sdk.IAttributionHandler
    public void getAttribution() {
        this.scheduler.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.AttributionHandler.2
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.AttributionHandler.this.lastInitiatedBy = "sdk";
                com.adjust.sdk.AttributionHandler.this.getAttributionI(0L);
            }
        });
    }

    @Override // com.adjust.sdk.IAttributionHandler
    public void init(com.adjust.sdk.IActivityHandler iActivityHandler, boolean z, com.adjust.sdk.network.IActivityPackageSender iActivityPackageSender) {
        this.activityHandlerWeakRef = new java.lang.ref.WeakReference<>(iActivityHandler);
        this.paused = !z;
        this.activityPackageSender = iActivityPackageSender;
    }

    @Override // com.adjust.sdk.network.IActivityPackageSender.ResponseDataCallbackSubscriber
    public void onResponseDataCallback(final com.adjust.sdk.ResponseData responseData) {
        this.scheduler.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.AttributionHandler.7
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.IActivityHandler iActivityHandler = (com.adjust.sdk.IActivityHandler) com.adjust.sdk.AttributionHandler.this.activityHandlerWeakRef.get();
                if (iActivityHandler == null) {
                    return;
                }
                com.adjust.sdk.ResponseData responseData2 = responseData;
                if (responseData2.trackingState == com.adjust.sdk.TrackingState.OPTED_OUT) {
                    iActivityHandler.gotOptOutResponse();
                } else if (responseData2 instanceof com.adjust.sdk.AttributionResponseData) {
                    com.adjust.sdk.AttributionHandler.this.checkAttributionResponseI(iActivityHandler, (com.adjust.sdk.AttributionResponseData) responseData2);
                }
            }
        });
    }

    @Override // com.adjust.sdk.IAttributionHandler
    public void pauseSending() {
        this.paused = true;
    }

    @Override // com.adjust.sdk.IAttributionHandler
    public void resumeSending() {
        this.paused = false;
    }

    @Override // com.adjust.sdk.IAttributionHandler
    public void teardown() {
        this.logger.verbose("AttributionHandler teardown", new java.lang.Object[0]);
        com.adjust.sdk.scheduler.TimerOnce timerOnce = this.timer;
        if (timerOnce != null) {
            timerOnce.teardown();
        }
        com.adjust.sdk.scheduler.ThreadScheduler threadScheduler = this.scheduler;
        if (threadScheduler != null) {
            threadScheduler.teardown();
        }
        java.lang.ref.WeakReference<com.adjust.sdk.IActivityHandler> weakReference = this.activityHandlerWeakRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.timer = null;
        this.logger = null;
        this.scheduler = null;
        this.activityHandlerWeakRef = null;
    }
}
