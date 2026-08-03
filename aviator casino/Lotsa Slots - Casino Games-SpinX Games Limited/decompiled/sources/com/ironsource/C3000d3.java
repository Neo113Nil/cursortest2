package com.ironsource;

/* renamed from: com.ironsource.d3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3000d3 implements com.ironsource.Db {

    /* renamed from: a, reason: collision with root package name */
    private final com.unity3d.ironsourceads.banner.BannerAdRequest f6196a;
    private final com.unity3d.ironsourceads.banner.BannerAdLoaderListener b;
    private final com.ironsource.InterfaceC3052g1 c;
    private final com.ironsource.InterfaceC3248r1 d;

    public C3000d3(com.unity3d.ironsourceads.banner.BannerAdRequest adRequest, com.unity3d.ironsourceads.banner.BannerAdLoaderListener publisherListener, com.ironsource.InterfaceC3052g1 adapterConfigProvider, com.ironsource.InterfaceC3248r1 analyticsFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterConfigProvider, "adapterConfigProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsFactory, "analyticsFactory");
        this.f6196a = adRequest;
        this.b = publisherListener;
        this.c = adapterConfigProvider;
        this.d = analyticsFactory;
    }

    @Override // com.ironsource.Db
    public com.ironsource.Ab a() throws java.lang.Exception {
        com.ironsource.mediationsdk.logger.IronSourceError a2;
        java.lang.String instanceId = this.f6196a.getInstanceId();
        java.lang.String sDKVersion = com.ironsource.sdk.utils.SDKUtils.getSDKVersion();
        com.ironsource.mediationsdk.IronSource.a aVar = com.ironsource.mediationsdk.IronSource.a.BANNER;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        com.ironsource.InterfaceC3266s1 a3 = this.d.a(new com.ironsource.C3159m1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            com.ironsource.Bb a4 = new com.ironsource.Cb(this.f6196a.getAdm(), this.f6196a.getProviderName$mediationsdk_release(), this.c, com.ironsource.C3099ic.e.a().c().get()).a();
            new com.ironsource.C2964b3(a4, this.f6196a.getSize()).a();
            com.ironsource.C3313uc c3313uc = new com.ironsource.C3313uc();
            com.ironsource.C3196o2 c3196o2 = new com.ironsource.C3196o2(this.f6196a.getAdm(), this.f6196a.getProviderName$mediationsdk_release());
            com.unity3d.ironsourceads.banner.BannerAdRequest bannerAdRequest = this.f6196a;
            com.unity3d.ironsourceads.AdSize size = bannerAdRequest.getSize();
            kotlin.jvm.internal.Intrinsics.checkNotNull(a4);
            com.ironsource.Q7 q7 = com.ironsource.Q7.f5934a;
            return new com.ironsource.C2946a3(bannerAdRequest, size, c3196o2, a4, c3313uc, a3, new com.ironsource.C2982c3(q7, this.b), new com.ironsource.I2(a3, q7.d()), null, null, 768, null);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            if (e instanceof com.ironsource.C3261re) {
                a2 = ((com.ironsource.C3261re) e).a();
            } else {
                com.ironsource.C3306u5 c3306u5 = com.ironsource.C3306u5.f6757a;
                java.lang.String message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                a2 = c3306u5.a(message);
            }
            return new com.ironsource.C3288t5(a2, new com.ironsource.C2982c3(com.ironsource.Q7.f5934a, this.b), a3);
        }
    }

    public /* synthetic */ C3000d3(com.unity3d.ironsourceads.banner.BannerAdRequest bannerAdRequest, com.unity3d.ironsourceads.banner.BannerAdLoaderListener bannerAdLoaderListener, com.ironsource.InterfaceC3052g1 interfaceC3052g1, com.ironsource.InterfaceC3248r1 interfaceC3248r1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdRequest, bannerAdLoaderListener, interfaceC3052g1, (i & 8) != 0 ? new com.ironsource.C3231q1(com.ironsource.mediationsdk.IronSource.a.BANNER) : interfaceC3248r1);
    }
}
