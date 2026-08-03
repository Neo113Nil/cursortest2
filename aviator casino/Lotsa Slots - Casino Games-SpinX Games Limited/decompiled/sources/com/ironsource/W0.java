package com.ironsource;

/* loaded from: classes5.dex */
public final class W0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.W0 f6033a = new com.ironsource.W0();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6034a;

        static {
            int[] iArr = new int[com.ironsource.mediationsdk.IronSource.a.values().length];
            try {
                iArr[com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.ironsource.mediationsdk.IronSource.a.BANNER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.ironsource.mediationsdk.IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f6034a = iArr;
        }
    }

    private W0() {
    }

    @kotlin.jvm.JvmStatic
    public static final com.ironsource.M6.a a(com.ironsource.mediationsdk.IronSource.a adUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        int i = com.ironsource.W0.a.f6034a[adUnit.ordinal()];
        if (i == 1) {
            return com.ironsource.M6.a.REWARDED_VIDEO;
        }
        if (i == 2) {
            return com.ironsource.M6.a.INTERSTITIAL;
        }
        if (i == 3) {
            return com.ironsource.M6.a.BANNER;
        }
        if (i == 4) {
            return com.ironsource.M6.a.NATIVE_AD;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
