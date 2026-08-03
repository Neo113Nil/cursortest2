package com.google.ads.mediation.vungle.rtb;

/* compiled from: VungleRtbAppOpenAd.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u0012"}, d2 = {"Lcom/google/ads/mediation/vungle/rtb/VungleRtbAppOpenAd;", "Lcom/google/ads/mediation/vungle/renderers/VungleAppOpenAd;", "mediationAdLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAd;", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAdCallback;", "vungleFactory", "Lcom/google/ads/mediation/vungle/VungleFactory;", "<init>", "(Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;Lcom/google/ads/mediation/vungle/VungleFactory;)V", "getAdMarkup", "", "mediationAppOpenAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAdConfiguration;", "maybeAddWatermarkToVungleAdConfig", "", "adConfig", "Lcom/vungle/ads/AdConfig;", "liftoffmonetize_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VungleRtbAppOpenAd extends com.google.ads.mediation.vungle.renderers.VungleAppOpenAd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleRtbAppOpenAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationAppOpenAd, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback> mediationAdLoadCallback, com.google.ads.mediation.vungle.VungleFactory vungleFactory) {
        super(mediationAdLoadCallback, vungleFactory);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationAdLoadCallback, "mediationAdLoadCallback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vungleFactory, "vungleFactory");
    }

    @Override // com.google.ads.mediation.vungle.renderers.VungleAppOpenAd
    public java.lang.String getAdMarkup(com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        java.lang.String bidResponse = mediationAppOpenAdConfiguration.getBidResponse();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bidResponse, "getBidResponse(...)");
        return bidResponse;
    }

    @Override // com.google.ads.mediation.vungle.renderers.VungleAppOpenAd
    public void maybeAddWatermarkToVungleAdConfig(com.vungle.ads.AdConfig adConfig, com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        java.lang.String watermark = mediationAppOpenAdConfiguration.getWatermark();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(watermark, "getWatermark(...)");
        if (watermark.length() > 0) {
            adConfig.setWatermark(watermark);
        }
    }
}
