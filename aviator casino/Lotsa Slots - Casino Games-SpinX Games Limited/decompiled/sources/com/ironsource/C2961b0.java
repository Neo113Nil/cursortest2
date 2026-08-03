package com.ironsource;

/* renamed from: com.ironsource.b0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2961b0 implements com.ironsource.InterfaceC2943a0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.InterfaceC3295tc f6144a;

    /* renamed from: com.ironsource.b0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.C2961b0.a f6145a = new com.ironsource.C2961b0.a();
        public static final int b = 1000;

        private a() {
        }
    }

    public C2961b0(com.ironsource.InterfaceC3295tc networkLoadApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        this.f6144a = networkLoadApi;
    }

    @Override // com.ironsource.InterfaceC2943a0
    public java.lang.String a() {
        return this.f6144a.a();
    }

    @Override // com.ironsource.InterfaceC2943a0
    public void a(com.ironsource.J9 adInstance, java.util.Map<java.lang.String, java.lang.String> loadParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        try {
            this.f6144a.a(adInstance, new com.ironsource.C3331vc(null, false, 3, null));
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API.verbose("load ad with identifier: " + adInstance.e() + " failed. error: " + e.getMessage());
            java.lang.String message = e.getMessage();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("1000: loadAd failed: ");
            sb.append(message);
            java.lang.String sb2 = sb.toString();
            com.ironsource.Gc b = adInstance.b();
            if (b instanceof com.ironsource.Z5) {
                com.ironsource.Gc b2 = adInstance.b();
                kotlin.jvm.internal.Intrinsics.checkNotNull(b2, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.FullScreenAdInstanceListenerWrapper");
                ((com.ironsource.Z5) b2).onInterstitialLoadFailed(sb2);
            } else if (b instanceof com.ironsource.Ic) {
                com.ironsource.Gc b3 = adInstance.b();
                kotlin.jvm.internal.Intrinsics.checkNotNull(b3, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.OnBannerListenerWrapper");
                ((com.ironsource.Ic) b3).onBannerLoadFail(sb2);
            }
        }
    }
}
