package com.vungle.ads;

/* compiled from: InterstitialAd.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0010¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/vungle/ads/InterstitialAd;", "Lcom/vungle/ads/BaseFullscreenAd;", "context", "Landroid/content/Context;", "placementId", "", "adConfig", "Lcom/vungle/ads/AdConfig;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/AdConfig;)V", "constructAdInternal", "Lcom/vungle/ads/internal/InterstitialAdInternal;", "constructAdInternal$vungle_ads_release", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class InterstitialAd extends com.vungle.ads.BaseFullscreenAd {
    public /* synthetic */ InterstitialAd(android.content.Context context, java.lang.String str, com.vungle.ads.AdConfig adConfig, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? new com.vungle.ads.AdConfig() : adConfig);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialAd(android.content.Context context, java.lang.String placementId, com.vungle.ads.AdConfig adConfig) {
        super(context, placementId, adConfig);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adConfig, "adConfig");
    }

    @Override // com.vungle.ads.BaseAd
    public com.vungle.ads.internal.InterstitialAdInternal constructAdInternal$vungle_ads_release(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return new com.vungle.ads.internal.InterstitialAdInternal(context);
    }
}
