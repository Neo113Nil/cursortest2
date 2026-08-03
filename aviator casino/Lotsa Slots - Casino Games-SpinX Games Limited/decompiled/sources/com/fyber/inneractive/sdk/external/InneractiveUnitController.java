package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public interface InneractiveUnitController<EL extends com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener> {

    public static class AdDisplayError extends java.lang.Exception {
        public AdDisplayError() {
        }

        public AdDisplayError(java.lang.String str) {
            super(str);
        }

        public AdDisplayError(java.lang.String str, java.lang.Throwable th) {
            super(str, th);
        }

        public AdDisplayError(java.lang.Throwable th) {
            super(th);
        }

        public AdDisplayError(java.lang.String str, java.lang.Throwable th, boolean z, boolean z2) {
            super(str, th, z, z2);
        }
    }

    public interface EventsListener {
        void onAdClicked(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot);

        void onAdEnteredErrorState(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot, com.fyber.inneractive.sdk.external.InneractiveUnitController.AdDisplayError adDisplayError);

        void onAdImpression(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot);

        void onAdWillCloseInternalBrowser(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot);

        void onAdWillOpenExternalApp(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot);
    }

    public static abstract class EventsListenerAdapter implements com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener {
        @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdClicked(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdImpression(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillCloseInternalBrowser(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillOpenExternalApp(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        }
    }

    void addContentController(com.fyber.inneractive.sdk.external.InneractiveContentController inneractiveContentController);

    void destroy();

    com.fyber.inneractive.sdk.external.InneractiveAdSpot getAdSpot();

    EL getEventsListener();

    com.fyber.inneractive.sdk.external.InneractiveContentController getSelectedContentController();

    void setEventsListener(EL el);
}
