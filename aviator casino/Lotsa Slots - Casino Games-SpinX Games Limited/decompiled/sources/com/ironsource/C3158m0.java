package com.ironsource;

/* renamed from: com.ironsource.m0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3158m0 extends com.ironsource.C3312ub {
    private final com.ironsource.C3396z5 b;
    private final com.ironsource.Ff.b c;
    private final com.ironsource.H8 d;

    public C3158m0() {
        com.ironsource.mediationsdk.IronSource.a aVar = com.ironsource.mediationsdk.IronSource.a.BANNER;
        this.b = new com.ironsource.C3396z5(aVar, com.ironsource.F0.b.MEDIATION, null, null, 12, null);
        com.ironsource.Ff.b b = com.ironsource.Ff.b(aVar);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "createLogFactory(IronSource.AD_UNIT.BANNER)");
        this.c = b;
        this.d = com.ironsource.Jb.u.d().f();
    }

    public static /* synthetic */ java.lang.String a(com.ironsource.C3158m0 c3158m0, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c3158m0.a(str, str2);
    }

    private final com.ironsource.mediationsdk.ISBannerSize c(com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize) {
        return kotlin.jvm.internal.Intrinsics.areEqual(levelPlayAdSize, com.unity3d.mediation.LevelPlayAdSize.LARGE) ? new com.ironsource.mediationsdk.ISBannerSize(com.ironsource.mediationsdk.j.b, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : kotlin.jvm.internal.Intrinsics.areEqual(levelPlayAdSize, com.unity3d.mediation.LevelPlayAdSize.MEDIUM_RECTANGLE) ? new com.ironsource.mediationsdk.ISBannerSize(com.ironsource.mediationsdk.j.c, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : kotlin.jvm.internal.Intrinsics.areEqual(levelPlayAdSize, com.unity3d.mediation.LevelPlayAdSize.LEADERBOARD) ? new com.ironsource.mediationsdk.ISBannerSize(com.ironsource.mediationsdk.j.e, 0, 0) : kotlin.jvm.internal.Intrinsics.areEqual(levelPlayAdSize, com.unity3d.mediation.LevelPlayAdSize.Companion.createCustomSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight())) ? new com.ironsource.mediationsdk.ISBannerSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : new com.ironsource.mediationsdk.ISBannerSize(com.ironsource.mediationsdk.j.f6439a, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
    }

    public final java.util.List<com.unity3d.mediation.LevelPlayAdSize> b() {
        com.ironsource.Ua a2 = this.d.a();
        if (a2 != null) {
            return a2.k();
        }
        throw new java.lang.IllegalStateException("Error getting sdk configurations");
    }

    public final boolean d() {
        return com.ironsource.Jb.u.d().f().c();
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.String a2 = this.c.a(str, str2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "logFactory.createLogMessage(message, suffix)");
        return a2;
    }

    public final int a(int i) {
        return com.ironsource.mediationsdk.j.a(i);
    }

    private final com.ironsource.mediationsdk.ISBannerSize a(com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize) {
        com.unity3d.mediation.LevelPlayAdSize fallbackAdSize$mediationsdk_release = levelPlayAdSize.getFallbackAdSize$mediationsdk_release();
        if (fallbackAdSize$mediationsdk_release == null) {
            fallbackAdSize$mediationsdk_release = com.unity3d.mediation.LevelPlayAdSize.BANNER;
        }
        com.ironsource.mediationsdk.ISBannerSize b = b(fallbackAdSize$mediationsdk_release);
        b.setAdaptive(true);
        com.ironsource.mediationsdk.m.f6449a.a(b, new com.ironsource.T7(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()));
        return b;
    }

    public final java.lang.Integer b(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.Float c = c();
        if (c != null) {
            return java.lang.Integer.valueOf(kotlin.math.MathKt.roundToInt(c.floatValue() * com.ironsource.Z4.f6111a.a(context)));
        }
        return null;
    }

    public final com.ironsource.mediationsdk.ISBannerSize b(com.unity3d.mediation.LevelPlayAdSize size) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "size");
        boolean isAdaptive = size.isAdaptive();
        if (isAdaptive) {
            return a(size);
        }
        if (isAdaptive) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return c(size);
    }

    private final java.lang.Float c() {
        com.ironsource.Ua a2 = this.d.a();
        java.lang.Float valueOf = a2 != null ? java.lang.Float.valueOf(a2.l()) : null;
        if (valueOf != null) {
            return valueOf;
        }
        this.b.h().f("MaxScreenSizePercentageForBannerHeight is null: Error getting sdk configurations");
        return null;
    }
}
