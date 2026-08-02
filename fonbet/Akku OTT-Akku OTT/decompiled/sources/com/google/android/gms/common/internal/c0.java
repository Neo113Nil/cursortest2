package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes4.dex */
public final class c0 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ AbstractC0861c b;

    public c0(AbstractC0861c abstractC0861c, int i) {
        this.b = abstractC0861c;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        AbstractC0861c abstractC0861c = this.b;
        if (iBinder == null) {
            AbstractC0861c.zzk(abstractC0861c, 16);
            return;
        }
        obj = abstractC0861c.zzq;
        synchronized (obj) {
            try {
                AbstractC0861c abstractC0861c2 = this.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC0861c2.zzr = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0871m)) ? new S(iBinder) : (InterfaceC0871m) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.zzl(0, null, this.a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.b.zzq;
        synchronized (obj) {
            this.b.zzr = null;
        }
        AbstractC0861c abstractC0861c = this.b;
        int i = this.a;
        Handler handler = abstractC0861c.zzb;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
