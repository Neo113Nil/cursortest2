package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0614pc extends io.appmetrica.analytics.impl.X4 implements io.appmetrica.analytics.impl.Ma, io.appmetrica.analytics.impl.La {

    /* renamed from: w, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0514lg f6646w;

    /* renamed from: x, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0618pg f6647x;

    /* renamed from: y, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.E6 f6648y;

    public C0614pc(android.content.Context context, io.appmetrica.analytics.impl.C0365fm c0365fm, io.appmetrica.analytics.impl.Q4 q4, io.appmetrica.analytics.impl.C0580o4 c0580o4, io.appmetrica.analytics.impl.C0514lg c0514lg, io.appmetrica.analytics.impl.E6 e6, io.appmetrica.analytics.impl.V4 v4) {
        this(context, q4, c0580o4, new io.appmetrica.analytics.impl.C0472k0(), new io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker(), new io.appmetrica.analytics.impl.C0665rc(context, q4, c0580o4, v4, c0365fm, new io.appmetrica.analytics.impl.C0484kc(e6), io.appmetrica.analytics.impl.C0560na.k().w().c(), io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils.getAppVersionCodeInt(context), io.appmetrica.analytics.impl.C0560na.k().w(), io.appmetrica.analytics.impl.C0560na.k().l(), new io.appmetrica.analytics.impl.C0329ec()), c0514lg, e6);
    }

    @Override // io.appmetrica.analytics.impl.X4
    public final void C() {
        this.f6646w.a(this.f6647x);
    }

    public final boolean D() {
        boolean optBoolean;
        io.appmetrica.analytics.impl.C0833xo c0833xo = this.t;
        synchronized (c0833xo) {
            optBoolean = c0833xo.f7123a.a().optBoolean("referrer_handled", false);
        }
        return optBoolean;
    }

    @Override // io.appmetrica.analytics.impl.X4, io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Ea
    public final synchronized void a(io.appmetrica.analytics.impl.C0580o4 c0580o4) {
        super.a(c0580o4);
        this.f6648y.a(c0580o4.f6561i);
    }

    @Override // io.appmetrica.analytics.impl.X4, io.appmetrica.analytics.impl.Ea
    public final io.appmetrica.analytics.internal.CounterConfigurationReporterType c() {
        return io.appmetrica.analytics.internal.CounterConfigurationReporterType.MAIN;
    }

    @Override // io.appmetrica.analytics.impl.La
    public final void a() {
        io.appmetrica.analytics.impl.C0833xo c0833xo = this.t;
        synchronized (c0833xo) {
            io.appmetrica.analytics.impl.C0859yo c0859yo = c0833xo.f7123a;
            c0859yo.a(c0859yo.a().put("referrer_handled", true));
        }
    }

    public C0614pc(android.content.Context context, io.appmetrica.analytics.impl.Q4 q4, io.appmetrica.analytics.impl.C0580o4 c0580o4, io.appmetrica.analytics.impl.C0472k0 c0472k0, io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker timePassedChecker, io.appmetrica.analytics.impl.C0665rc c0665rc, io.appmetrica.analytics.impl.C0514lg c0514lg, io.appmetrica.analytics.impl.E6 e6) {
        super(context, q4, c0472k0, timePassedChecker, c0665rc, c0580o4);
        this.f6646w = c0514lg;
        io.appmetrica.analytics.impl.X8 k2 = k();
        k2.a(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_REGULAR, new io.appmetrica.analytics.impl.Hg(k2.b()));
        this.f6647x = c0665rc.a(this);
        this.f6648y = e6;
        io.appmetrica.analytics.impl.C0560na.k().x().onMainReporterCreated(new io.appmetrica.analytics.impl.C0777vk(this, c0580o4));
    }
}
