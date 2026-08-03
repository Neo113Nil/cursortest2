package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public class NativeAdImageContentController extends com.fyber.inneractive.sdk.flow.j0 {
    @Override // com.fyber.inneractive.sdk.flow.j0
    public boolean canControl(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.inneractive.sdk.flow.x adContent = inneractiveAdSpot.getAdContent();
        return (adContent instanceof com.fyber.inneractive.sdk.external.NativeAdContent) && !adContent.isVideoAd();
    }
}
