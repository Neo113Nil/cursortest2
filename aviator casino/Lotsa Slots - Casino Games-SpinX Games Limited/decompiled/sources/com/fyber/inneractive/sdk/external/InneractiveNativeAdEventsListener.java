package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public interface InneractiveNativeAdEventsListener extends com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener {
    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    void onAdClicked(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot);

    void onAdCollapsed(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot);

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    void onAdEnteredErrorState(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot, com.fyber.inneractive.sdk.external.InneractiveUnitController.AdDisplayError adDisplayError);

    void onAdExpanded(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot);

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    void onAdImpression(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot);

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    void onAdWillCloseInternalBrowser(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot);

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    void onAdWillOpenExternalApp(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot);
}
