package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC0713o0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0739p0 f7972a;

    public ServiceConnectionC0713o0(C0739p0 c0739p0) {
        this.f7972a = c0739p0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f7972a) {
            this.f7972a.f8033d = IAppMetricaService.Stub.asInterface(iBinder);
            this.f7972a.f8034e.countDown();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f7972a) {
            this.f7972a.f8033d = null;
        }
    }
}
