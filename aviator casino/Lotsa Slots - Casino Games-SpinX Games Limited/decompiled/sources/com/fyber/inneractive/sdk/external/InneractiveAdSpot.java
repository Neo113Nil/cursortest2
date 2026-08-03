package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public interface InneractiveAdSpot {

    public static abstract class NativeAdRequestListener implements com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener {
        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public final void onInneractiveSuccessfulAdRequest(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        }

        public abstract void onInneractiveSuccessfulNativeAdRequest(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot, com.fyber.inneractive.sdk.external.NativeAdContent nativeAdContent);
    }

    public interface RequestListener {
        void onInneractiveFailedAdRequest(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot, com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode);

        void onInneractiveSuccessfulAdRequest(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot);
    }

    public static abstract class RequestListenerAdapter implements com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener {
        public abstract void onInneractiveAdRequestResult(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot, boolean z, com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode);

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveFailedAdRequest(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot, com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode) {
            onInneractiveAdRequestResult(inneractiveAdSpot, false, inneractiveErrorCode);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveSuccessfulAdRequest(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
            onInneractiveAdRequestResult(inneractiveAdSpot, true, null);
        }
    }

    void addUnitController(com.fyber.inneractive.sdk.external.InneractiveUnitController inneractiveUnitController);

    void destroy();

    com.fyber.inneractive.sdk.flow.x getAdContent();

    com.fyber.inneractive.sdk.external.InneractiveAdRequest getCurrentProcessedRequest();

    java.lang.String getLocalUniqueId();

    com.fyber.inneractive.sdk.external.InneractiveMediationName getMediationName();

    java.lang.String getMediationNameString();

    java.lang.String getMediationVersion();

    java.lang.String getRequestedSpotId();

    com.fyber.inneractive.sdk.external.InneractiveUnitController getSelectedUnitController();

    boolean isReady();

    void loadAd(java.lang.String str);

    void loadAd(java.lang.String str, java.lang.String str2);

    void removeUnitController(com.fyber.inneractive.sdk.external.InneractiveUnitController inneractiveUnitController);

    void requestAd(com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest);

    void setMediationName(com.fyber.inneractive.sdk.external.InneractiveMediationName inneractiveMediationName);

    void setMediationName(java.lang.String str);

    void setMediationVersion(java.lang.String str);

    void setRequestListener(com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener requestListener);
}
