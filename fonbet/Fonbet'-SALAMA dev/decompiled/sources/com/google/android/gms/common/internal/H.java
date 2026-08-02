package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class H implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f11259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0854f f11260b;

    public H(AbstractC0854f abstractC0854f, int i7) {
        this.f11260b = abstractC0854f;
        this.f11259a = i7;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        AbstractC0854f abstractC0854f = this.f11260b;
        if (iBinder == null) {
            AbstractC0854f.zzk(abstractC0854f, 16);
            return;
        }
        obj = abstractC0854f.zzq;
        synchronized (obj) {
            try {
                AbstractC0854f abstractC0854f2 = this.f11260b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC0854f2.zzr = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0862n)) ? new C(iBinder) : (InterfaceC0862n) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f11260b.zzl(0, null, this.f11259a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f11260b.zzq;
        synchronized (obj) {
            this.f11260b.zzr = null;
        }
        AbstractC0854f abstractC0854f = this.f11260b;
        int i7 = this.f11259a;
        Handler handler = abstractC0854f.zzb;
        handler.sendMessage(handler.obtainMessage(6, i7, 1));
    }
}
