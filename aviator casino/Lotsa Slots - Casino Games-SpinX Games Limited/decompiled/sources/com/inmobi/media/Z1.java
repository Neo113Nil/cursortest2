package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Z1 extends com.inmobi.media.Y1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.ads.listeners.BannerAdEventListener f5076a;

    public Z1(com.inmobi.ads.listeners.BannerAdEventListener adEventListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adEventListener, "adEventListener");
        this.f5076a = adEventListener;
    }

    @Override // com.inmobi.media.J
    public final void a(java.lang.Object obj, java.util.Map params) {
        com.inmobi.ads.InMobiBanner ad = (com.inmobi.ads.InMobiBanner) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        this.f5076a.onAdClicked(ad, params);
    }

    @Override // com.inmobi.media.J
    public final void b(java.lang.Object obj, com.inmobi.ads.AdMetaInfo info) {
        com.inmobi.ads.InMobiBanner ad = (com.inmobi.ads.InMobiBanner) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        this.f5076a.onAdLoadSucceeded(ad, info);
    }

    @Override // com.inmobi.media.J
    public final void a(java.lang.Object obj, com.inmobi.ads.AdMetaInfo info) {
        com.inmobi.ads.InMobiBanner ad = (com.inmobi.ads.InMobiBanner) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        this.f5076a.onAdFetchSuccessful(ad, info);
    }

    @Override // com.inmobi.media.J
    public final void a(java.lang.Object obj, com.inmobi.ads.InMobiAdRequestStatus status) {
        com.inmobi.ads.InMobiBanner ad = (com.inmobi.ads.InMobiBanner) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Y1", "getSimpleName(...)");
        this.f5076a.onAdLoadFailed(ad, status);
    }

    @Override // com.inmobi.media.J
    public final void a(java.lang.Object obj, java.lang.String data) {
        com.inmobi.ads.InMobiBanner ad = (com.inmobi.ads.InMobiBanner) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("IMraidLog");
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("imraidLog", com.inmobi.ads.listeners.BannerAdEventListener.class, com.inmobi.ads.InMobiBanner.class, java.lang.String.class);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f5076a, ad, data);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
