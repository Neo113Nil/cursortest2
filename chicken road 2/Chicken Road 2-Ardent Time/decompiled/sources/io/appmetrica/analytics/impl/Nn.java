package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Nn extends io.appmetrica.analytics.impl.AbstractCallableC0826xh {

    /* renamed from: e, reason: collision with root package name */
    public final int f4748e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Bundle f4749f;

    public Nn(io.appmetrica.analytics.impl.C0602p0 c0602p0, io.appmetrica.analytics.impl.Zk zk, int i2, android.os.Bundle bundle) {
        super(c0602p0, zk);
        this.f4748e = i2;
        this.f4749f = bundle;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0826xh
    public final void a(io.appmetrica.analytics.internal.IAppMetricaService iAppMetricaService) {
        iAppMetricaService.reportData(this.f4748e, this.f4749f);
    }
}
