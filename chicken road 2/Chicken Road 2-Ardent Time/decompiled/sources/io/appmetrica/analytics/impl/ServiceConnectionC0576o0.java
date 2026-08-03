package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC0576o0 implements android.content.ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0602p0 f6549a;

    public ServiceConnectionC0576o0(io.appmetrica.analytics.impl.C0602p0 c0602p0) {
        this.f6549a = c0602p0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        synchronized (this.f6549a) {
            this.f6549a.f6614d = io.appmetrica.analytics.internal.IAppMetricaService.Stub.asInterface(iBinder);
            this.f6549a.f6615e.countDown();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        synchronized (this.f6549a) {
            this.f6549a.f6614d = null;
        }
    }
}
