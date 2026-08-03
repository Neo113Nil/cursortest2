package com.ironsource;

/* renamed from: com.ironsource.p0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3212p0 extends com.ironsource.C3312ub {
    private final com.ironsource.mediationsdk.IronSource.a b;
    private final com.ironsource.Ff.b c;
    private final com.ironsource.C3396z5 d;
    private final com.ironsource.H8 e;
    private final long f;

    /* renamed from: com.ironsource.p0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.C3212p0.a f6547a = new com.ironsource.C3212p0.a();

        private a() {
        }

        @kotlin.jvm.JvmStatic
        public static final com.ironsource.C3212p0 a(com.ironsource.mediationsdk.IronSource.a adFormat, com.ironsource.F0.b level) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "level");
            return new com.ironsource.C3212p0(adFormat, level);
        }
    }

    public C3212p0(com.ironsource.mediationsdk.IronSource.a adFormat, com.ironsource.F0.b level) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "level");
        this.e = com.ironsource.Jb.u.d().f();
        this.f = java.util.concurrent.TimeUnit.HOURS.toMillis(1L);
        this.b = adFormat;
        this.d = new com.ironsource.C3396z5(adFormat, level, null, null, 12, null);
        com.ironsource.Ff.b b = com.ironsource.Ff.b(adFormat);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "createLogFactory(adFormat)");
        this.c = b;
    }

    public static /* synthetic */ java.lang.String a(com.ironsource.C3212p0 c3212p0, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c3212p0.a(str, str2);
    }

    public final java.lang.String b(java.lang.String str) {
        return a(this, str, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final java.lang.String c() {
        return a(this, (java.lang.String) null, (java.lang.String) null, 3, (java.lang.Object) null);
    }

    protected final com.ironsource.mediationsdk.IronSource.a d() {
        return this.b;
    }

    public final com.ironsource.C3396z5 e() {
        return this.d;
    }

    public final int f() {
        return com.ironsource.Jb.u.d().s().a(this.b);
    }

    public final boolean g() {
        return com.ironsource.Jb.u.d().f().c();
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.String a2 = this.c.a(str, str2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "logFactory.createLogMessage(message, suffix)");
        return a2;
    }

    public final com.ironsource.lifecycle.b b() {
        com.ironsource.lifecycle.b d = com.ironsource.lifecycle.b.d();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "getInstance()");
        return d;
    }

    public final com.ironsource.C3064gd c(java.lang.String placementName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
        com.ironsource.Ua a2 = this.e.a();
        if (a2 == null) {
            throw new java.lang.IllegalStateException("Error getting sdk configurations");
        }
        com.ironsource.C3064gd c = a2.c(com.unity3d.mediation.LevelPlay.AdFormat.NATIVE_AD, placementName);
        if (c != null) {
            return c;
        }
        throw new java.lang.IllegalStateException("Error getting sdk configurations");
    }

    public final com.ironsource.Ta.a d(java.lang.String adUnitId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        com.ironsource.Ua a2 = this.e.a();
        if (a2 != null) {
            return a2.a(adUnitId);
        }
        throw new java.lang.IllegalStateException("Error getting sdk configurations");
    }

    public final com.ironsource.C3064gd a(java.lang.String placementName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
        com.ironsource.Ua a2 = this.e.a();
        if (a2 != null) {
            com.ironsource.C3064gd c = a2.c(com.unity3d.mediation.LevelPlay.AdFormat.BANNER, placementName);
            if (c != null) {
                return c;
            }
            throw new java.lang.IllegalStateException("Error getting placement");
        }
        throw new java.lang.IllegalStateException("Error getting sdk configurations");
    }

    public final com.ironsource.InterfaceC3307u6.a b(com.unity3d.mediation.LevelPlay.AdFormat adFormat, java.lang.String adUnitId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        com.ironsource.Ua a2 = this.e.a();
        if (a2 != null) {
            return a2.b(adFormat, adUnitId);
        }
        throw new java.lang.IllegalStateException("Error getting sdk configurations");
    }

    public final long b(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        com.ironsource.Ua a2 = this.e.a();
        return a2 != null ? a2.b(adFormat) : this.f;
    }

    public final com.ironsource.C3064gd a(com.unity3d.mediation.LevelPlay.AdFormat adFormat, java.lang.String str) {
        com.ironsource.Ua a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        if (str == null || (a2 = this.e.a()) == null) {
            return null;
        }
        return a2.c(adFormat, str);
    }

    public C3212p0(com.ironsource.C3212p0 adTools, com.ironsource.F0.b level) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "level");
        this.e = com.ironsource.Jb.u.d().f();
        this.f = java.util.concurrent.TimeUnit.HOURS.toMillis(1L);
        com.ironsource.mediationsdk.IronSource.a aVar = adTools.b;
        this.b = aVar;
        this.c = adTools.c;
        this.d = new com.ironsource.C3396z5(aVar, level, adTools.d.c(), null, 8, null);
    }

    public final void a(java.util.Map<java.lang.String, java.lang.Object> data, com.ironsource.mediationsdk.ISBannerSize size) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "size");
        com.ironsource.mediationsdk.j.a(data, size);
    }

    public final com.ironsource.mediationsdk.ISBannerSize a(com.unity3d.mediation.LevelPlayAdSize adSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSize, "adSize");
        return new com.ironsource.C3158m0().b(adSize);
    }
}
