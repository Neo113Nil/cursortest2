package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class H implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0810f f11260b;

    public H(AbstractC0810f abstractC0810f, int i7) {
        this.f11260b = abstractC0810f;
        this.f11259a = i7;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC0810f abstractC0810f = this.f11260b;
        if (iBinder == null) {
            AbstractC0810f.zzk(abstractC0810f, 16);
            return;
        }
        synchronized (abstractC0810f.zzq) {
            try {
                AbstractC0810f abstractC0810f2 = this.f11260b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC0810f2.zzr = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0818n)) ? new C(iBinder) : (InterfaceC0818n) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f11260b.zzl(0, null, this.f11259a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f11260b.zzq) {
            this.f11260b.zzr = null;
        }
        AbstractC0810f abstractC0810f = this.f11260b;
        int i7 = this.f11259a;
        Handler handler = abstractC0810f.zzb;
        handler.sendMessage(handler.obtainMessage(6, i7, 1));
    }
}
