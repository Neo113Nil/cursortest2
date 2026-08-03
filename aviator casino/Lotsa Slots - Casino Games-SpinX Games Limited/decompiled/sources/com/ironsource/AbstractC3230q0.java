package com.ironsource;

/* renamed from: com.ironsource.q0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3230q0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.AbstractC3355x0 f6561a;
    private final com.ironsource.S6 b;
    private final com.ironsource.V0 c;
    private com.ironsource.M0 d;
    private com.ironsource.InterfaceC3391z0 e;
    private final com.ironsource.Eg f;
    private final java.lang.ref.WeakReference<com.ironsource.K0> g;
    private com.ironsource.C3056g5 h;
    private final com.ironsource.C3396z5 i;

    /* renamed from: com.ironsource.q0$b */
    public static final class b implements com.ironsource.Mg {
        b() {
        }

        @Override // com.ironsource.Mg
        public void a(int i, java.lang.String errorReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            com.ironsource.AbstractC3230q0.this.a(i, errorReason);
        }

        @Override // com.ironsource.Mg
        public void b(com.ironsource.B instance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
            com.ironsource.AbstractC3230q0.this.i.e().a(com.ironsource.C3056g5.a(com.ironsource.AbstractC3230q0.this.h), com.ironsource.AbstractC3230q0.this.e().u());
            com.ironsource.M0 j = com.ironsource.AbstractC3230q0.this.j();
            if (j != null) {
                j.a(new com.ironsource.C3301u0(com.ironsource.AbstractC3230q0.this, instance.e()));
            }
        }

        @Override // com.ironsource.Mg
        public void a(com.ironsource.B instance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
            com.ironsource.AbstractC3230q0.this.f().e().a().e(com.ironsource.AbstractC3230q0.this.h());
            com.ironsource.M0 j = com.ironsource.AbstractC3230q0.this.j();
            if (j != null) {
                j.b(new com.ironsource.C3301u0(com.ironsource.AbstractC3230q0.this, instance.e()));
            }
        }
    }

    public AbstractC3230q0(com.ironsource.C3212p0 adTools, com.ironsource.AbstractC3355x0 adUnitData, com.ironsource.K0 listener, com.ironsource.S6 taskScheduler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        this.f6561a = adUnitData;
        this.b = taskScheduler;
        com.ironsource.V0 v0 = new com.ironsource.V0(adTools, adUnitData, com.ironsource.F0.b.MEDIATION);
        this.c = v0;
        this.f = new com.ironsource.Eg(v0, adUnitData, false, c(), null, null, 48, null);
        this.g = new java.lang.ref.WeakReference<>(listener);
        this.i = v0.e();
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("adFormat = " + adUnitData.b().a() + ", adUnitId = " + adUnitData.b().c());
    }

    protected abstract com.ironsource.E a();

    public com.ironsource.InterfaceC3122k0 d() {
        return this.f.h() ? com.ironsource.InterfaceC3122k0.b.f6332a : new com.ironsource.InterfaceC3122k0.a(null, 1, null);
    }

    protected final com.ironsource.AbstractC3355x0 e() {
        return this.f6561a;
    }

    protected final com.ironsource.V0 f() {
        return this.c;
    }

    protected final com.ironsource.C3064gd g() {
        return this.f6561a.b().f();
    }

    protected final java.lang.String h() {
        return this.f6561a.l();
    }

    protected final com.ironsource.InterfaceC3391z0 i() {
        return this.e;
    }

    protected final com.ironsource.M0 j() {
        return this.d;
    }

    protected final com.ironsource.Eg k() {
        return this.f;
    }

    private final com.ironsource.AbstractC3230q0.b c() {
        return new com.ironsource.AbstractC3230q0.b();
    }

    protected final void a(com.ironsource.InterfaceC3391z0 interfaceC3391z0) {
        this.e = interfaceC3391z0;
    }

    protected final void b(com.ironsource.M0 m0) {
        this.d = m0;
    }

    public void a(com.ironsource.M0 loadListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.c, (java.lang.String) null, (java.lang.String) null, 3, (java.lang.Object) null));
        this.c.a(b());
        this.d = loadListener;
        this.i.a(this.f6561a.u());
        this.h = new com.ironsource.C3056g5();
        this.f.a(a());
    }

    public com.ironsource.C3265s0 b() {
        return new com.ironsource.C3265s0(this.f6561a.b());
    }

    /* renamed from: com.ironsource.q0$a */
    protected class a implements com.ironsource.F {
        public a() {
        }

        @Override // com.ironsource.F
        public void a(com.ironsource.B instance, com.ironsource.mediationsdk.logger.IronSourceError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.AbstractC3230q0.this.a(instance.q()));
            com.ironsource.AbstractC3230q0.this.i.a().a(com.ironsource.AbstractC3230q0.this.h(), error.getErrorCode(), error.getErrorMessage(), null);
            com.ironsource.InterfaceC3391z0 i = com.ironsource.AbstractC3230q0.this.i();
            if (i != null) {
                i.c(error);
            }
        }

        @Override // com.ironsource.F
        public void b(com.ironsource.B instance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.AbstractC3230q0.this.a(instance.q()));
            com.ironsource.AbstractC3230q0.this.k().d(instance);
            com.ironsource.AbstractC3230q0.this.i.a().g(com.ironsource.AbstractC3230q0.this.h());
            com.ironsource.AbstractC3230q0.this.f().l().b(com.ironsource.AbstractC3230q0.this.e().b().a());
        }

        @Override // com.ironsource.F
        public void a(com.ironsource.B instance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
            com.ironsource.AbstractC3230q0.this.i.a().a(com.ironsource.AbstractC3230q0.this.h());
            com.ironsource.K0 k0 = (com.ironsource.K0) com.ironsource.AbstractC3230q0.this.g.get();
            if (k0 != null) {
                k0.e();
            }
        }
    }

    public final void a(com.ironsource.K adInstancePresenter, com.ironsource.InterfaceC3391z0 displayListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        this.e = displayListener;
        this.f.a(adInstancePresenter, false);
    }

    public final void a(boolean z) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.c, (java.lang.String) null, (java.lang.String) null, 3, (java.lang.Object) null));
        this.f.d();
        if (z) {
            this.c.e().e().a(this.c.f());
        }
    }

    protected final void a(int i, java.lang.String errorReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(a("errorCode = " + i + ", errorReason = " + errorReason));
        this.i.e().a(com.ironsource.C3056g5.a(this.h), i, errorReason, this.f6561a.u());
        com.ironsource.M0 m0 = this.d;
        if (m0 != null) {
            m0.a(new com.ironsource.mediationsdk.logger.IronSourceError(i, errorReason));
        }
    }

    protected final java.lang.String a(java.lang.String str) {
        return com.ironsource.C3212p0.a(this.c, str, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public /* synthetic */ AbstractC3230q0(com.ironsource.C3212p0 c3212p0, com.ironsource.AbstractC3355x0 abstractC3355x0, com.ironsource.K0 k0, com.ironsource.S6 s6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(c3212p0, abstractC3355x0, k0, (i & 8) != 0 ? new com.ironsource.S6(com.ironsource.T6.a(c3212p0.a())) : s6);
    }
}
