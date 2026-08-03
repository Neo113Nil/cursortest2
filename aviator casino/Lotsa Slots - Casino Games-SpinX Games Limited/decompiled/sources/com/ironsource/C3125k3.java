package com.ironsource;

/* renamed from: com.ironsource.k3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3125k3 implements com.ironsource.InterfaceC3052g1 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.N3 f6334a;
    private final com.ironsource.Ld b;
    private final com.ironsource.mediationsdk.IronSource.a c;

    /* renamed from: com.ironsource.k3$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6335a;

        static {
            int[] iArr = new int[com.ironsource.mediationsdk.IronSource.a.values().length];
            try {
                iArr[com.ironsource.mediationsdk.IronSource.a.BANNER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f6335a = iArr;
        }
    }

    public C3125k3(com.ironsource.N3 adFormatConfigurations, com.ironsource.Ld ld, com.ironsource.mediationsdk.IronSource.a adFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f6334a = adFormatConfigurations;
        this.b = ld;
        this.c = adFormat;
    }

    @Override // com.ironsource.InterfaceC3052g1
    public com.ironsource.InterfaceC3149l9 a(com.ironsource.Ed providerName) {
        com.ironsource.mediationsdk.model.NetworkSettings b;
        com.ironsource.C3029ee f;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerName, "providerName");
        com.ironsource.Ld ld = this.b;
        if (ld == null || (b = ld.b(providerName.value())) == null) {
            return null;
        }
        int i = com.ironsource.C3125k3.a.f6335a[this.c.ordinal()];
        if (i == 1) {
            com.ironsource.U2 c = this.f6334a.c();
            if (c != null) {
                return new com.ironsource.Z2(new com.ironsource.C3016e1(b, b.getBannerSettings(), this.c), c);
            }
            return null;
        }
        if (i != 2) {
            if (i == 3 && (f = this.f6334a.f()) != null) {
                return new com.ironsource.Vd(new com.ironsource.C3016e1(b, b.getRewardedVideoSettings(), this.c), f);
            }
            return null;
        }
        com.ironsource.D9 d = this.f6334a.d();
        if (d != null) {
            return new com.ironsource.G9(new com.ironsource.C3016e1(b, b.getInterstitialSettings(), this.c), d);
        }
        return null;
    }
}
