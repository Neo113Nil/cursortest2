package com.inmobi.media;

/* renamed from: com.inmobi.media.pa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2666pa extends com.inmobi.media.AbstractC2640oa {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.ads.listeners.InterstitialAdEventListener f5387a;

    public C2666pa(com.inmobi.ads.listeners.InterstitialAdEventListener adEventListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adEventListener, "adEventListener");
        this.f5387a = adEventListener;
    }

    @Override // com.inmobi.media.J
    public final void a(java.lang.Object obj, java.util.Map params) {
        com.inmobi.ads.InMobiInterstitial ad = (com.inmobi.ads.InMobiInterstitial) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        this.f5387a.onAdClicked(ad, params);
    }

    @Override // com.inmobi.media.J
    public final void b(java.lang.Object obj, com.inmobi.ads.AdMetaInfo info) {
        com.inmobi.ads.InMobiInterstitial ad = (com.inmobi.ads.InMobiInterstitial) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        this.f5387a.onAdLoadSucceeded(ad, info);
    }

    @Override // com.inmobi.media.J
    public final void a(java.lang.Object obj, com.inmobi.ads.AdMetaInfo info) {
        com.inmobi.ads.InMobiInterstitial ad = (com.inmobi.ads.InMobiInterstitial) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        this.f5387a.onAdFetchSuccessful(ad, info);
    }

    @Override // com.inmobi.media.J
    public final void a(java.lang.Object obj, com.inmobi.ads.InMobiAdRequestStatus status) {
        com.inmobi.ads.InMobiInterstitial ad = (com.inmobi.ads.InMobiInterstitial) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        this.f5387a.onAdLoadFailed(ad, status);
    }

    @Override // com.inmobi.media.J
    public final void a(java.lang.Object obj, java.lang.String data) {
        com.inmobi.ads.InMobiInterstitial ad = (com.inmobi.ads.InMobiInterstitial) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("IMraidLog");
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("imraidLog", com.inmobi.ads.listeners.InterstitialAdEventListener.class, com.inmobi.ads.InMobiInterstitial.class, java.lang.String.class);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f5387a, ad, data);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
