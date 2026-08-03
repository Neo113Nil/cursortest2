package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0775vi extends io.appmetrica.analytics.impl.C0521ln {

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.RunnableC0749ui f6979d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor f6980e;

    public C0775vi(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.impl.Kl kl, io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor iCommonExecutor) {
        super(x4, kl);
        this.f6979d = new io.appmetrica.analytics.impl.RunnableC0749ui(this);
        this.f6980e = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.C0521ln
    public final void a() {
        this.f6980e.remove(this.f6979d);
    }

    @Override // io.appmetrica.analytics.impl.C0521ln
    public final void f() {
        this.f6376b.a();
        io.appmetrica.analytics.impl.C0489kh c0489kh = (io.appmetrica.analytics.impl.C0489kh) ((io.appmetrica.analytics.impl.X4) this.f6375a).f5265k.a();
        if (c0489kh.f6291k.a(c0489kh.f6290j)) {
            java.lang.String str = c0489kh.f6293m;
            if (android.text.TextUtils.isEmpty(str) || "-1".equals(str)) {
                return;
            }
            try {
                a(io.appmetrica.analytics.impl.Vd.a((io.appmetrica.analytics.impl.X4) this.f6375a));
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.C0521ln
    public final void g() {
        this.f6980e.executeDelayed(this.f6979d, java.util.concurrent.TimeUnit.SECONDS.toMillis(1L));
    }

    public final void h() {
        if (this.f6377c.get()) {
            return;
        }
        this.f6980e.remove(this.f6979d);
        if (((io.appmetrica.analytics.impl.C0489kh) ((io.appmetrica.analytics.impl.X4) this.f6375a).f5265k.a()).f6287g > 0) {
            this.f6980e.executeDelayed(this.f6979d, java.util.concurrent.TimeUnit.SECONDS.toMillis(((io.appmetrica.analytics.impl.C0489kh) ((io.appmetrica.analytics.impl.X4) this.f6375a).f5265k.a()).f6287g));
        }
    }
}
