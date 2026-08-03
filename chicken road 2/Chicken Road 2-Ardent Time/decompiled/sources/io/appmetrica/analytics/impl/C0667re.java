package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.re, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0667re extends io.appmetrica.analytics.impl.AbstractCallableC0826xh {

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Bf f6729e;

    public C0667re(io.appmetrica.analytics.impl.C0602p0 c0602p0, io.appmetrica.analytics.impl.Zk zk, io.appmetrica.analytics.impl.Bf bf) {
        super(c0602p0, zk);
        this.f6729e = bf;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0826xh
    public final void a(io.appmetrica.analytics.internal.IAppMetricaService iAppMetricaService) {
        android.os.Bundle bundle = new android.os.Bundle();
        io.appmetrica.analytics.impl.Bf bf = this.f6729e;
        synchronized (bf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", bf);
        }
        iAppMetricaService.pauseUserSession(bundle);
    }
}
