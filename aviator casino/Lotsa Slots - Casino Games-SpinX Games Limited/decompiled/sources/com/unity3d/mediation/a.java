package com.unity3d.mediation;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.unity3d.mediation.a f8041a = new com.unity3d.mediation.a();

    /* renamed from: com.unity3d.mediation.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0331a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8042a;

        static {
            int[] iArr = new int[com.unity3d.mediation.LevelPlay.AdFormat.values().length];
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.BANNER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.REWARDED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f8042a = iArr;
        }
    }

    private a() {
    }

    @kotlin.jvm.JvmStatic
    public static final com.ironsource.mediationsdk.IronSource.a a(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "<this>");
        int i = com.unity3d.mediation.a.C0331a.f8042a[adFormat.ordinal()];
        if (i == 1) {
            return com.ironsource.mediationsdk.IronSource.a.BANNER;
        }
        if (i == 2) {
            return com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL;
        }
        if (i == 3) {
            return com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO;
        }
        if (i == 4) {
            return com.ironsource.mediationsdk.IronSource.a.NATIVE_AD;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
