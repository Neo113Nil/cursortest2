package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.y1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0836y1 extends io.appmetrica.analytics.internal.IAppMetricaService.Stub {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.A1 f7132a;

    public BinderC0836y1(io.appmetrica.analytics.impl.A1 a12) {
        this.f7132a = a12;
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void pauseUserSession(android.os.Bundle bundle) {
        ((io.appmetrica.analytics.impl.B1) this.f7132a).pauseUserSession(bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void reportData(int i2, android.os.Bundle bundle) {
        ((io.appmetrica.analytics.impl.B1) this.f7132a).reportData(i2, bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void resumeUserSession(android.os.Bundle bundle) {
        ((io.appmetrica.analytics.impl.B1) this.f7132a).resumeUserSession(bundle);
    }
}
