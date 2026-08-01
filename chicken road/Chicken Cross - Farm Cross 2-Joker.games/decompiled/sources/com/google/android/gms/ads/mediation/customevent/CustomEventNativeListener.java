package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
@Deprecated
/* loaded from: classes9.dex */
public interface CustomEventNativeListener extends CustomEventListener {
    void onAdImpression();

    void onAdLoaded(UnifiedNativeAdMapper unifiedNativeAdMapper);
}
