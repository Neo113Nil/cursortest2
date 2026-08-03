package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public class Pg extends io.appmetrica.analytics.impl.AbstractCallableC0826xh {

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0774vh f4842e;

    public Pg(io.appmetrica.analytics.impl.C0602p0 c0602p0, io.appmetrica.analytics.impl.Zk zk, io.appmetrica.analytics.impl.C0774vh c0774vh) {
        super(c0602p0, zk);
        this.f4842e = c0774vh;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0826xh
    public final void a(java.lang.Throwable th) {
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0826xh
    public final void a(io.appmetrica.analytics.internal.IAppMetricaService iAppMetricaService) {
        io.appmetrica.analytics.impl.C0774vh c0774vh = this.f4842e;
        iAppMetricaService.reportData(c0774vh.f6976c, c0774vh.f6974a.d(c0774vh.f6978e.c()));
    }
}
