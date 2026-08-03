package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ei extends io.appmetrica.analytics.impl.AbstractCallableC0826xh {

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Bf f4270e;

    public Ei(io.appmetrica.analytics.impl.C0602p0 c0602p0, io.appmetrica.analytics.impl.Zk zk, io.appmetrica.analytics.impl.Bf bf) {
        super(c0602p0, zk);
        this.f4270e = bf;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0826xh
    public final void a(io.appmetrica.analytics.internal.IAppMetricaService iAppMetricaService) {
        android.os.Bundle bundle = new android.os.Bundle();
        io.appmetrica.analytics.impl.Bf bf = this.f4270e;
        synchronized (bf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", bf);
        }
        iAppMetricaService.resumeUserSession(bundle);
    }
}
