package o1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class x implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f11607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f11608b;

    public x(com.google.android.gms.common.internal.a aVar, int i2) {
        this.f11608b = aVar;
        this.f11607a = i2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i2;
        int i3;
        com.google.android.gms.common.internal.a aVar = this.f11608b;
        if (iBinder == null) {
            synchronized (aVar.f5003k) {
                i2 = aVar.f5010r;
            }
            if (i2 == 3) {
                aVar.f5017y = true;
                i3 = 5;
            } else {
                i3 = 4;
            }
            v vVar = aVar.f5002j;
            vVar.sendMessage(vVar.obtainMessage(i3, aVar.f4991A.get(), 16));
            return;
        }
        synchronized (aVar.f5004l) {
            try {
                com.google.android.gms.common.internal.a aVar2 = this.f11608b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar2.f5005m = (queryLocalInterface == null || !(queryLocalInterface instanceof t)) ? new t(iBinder) : (t) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.a aVar3 = this.f11608b;
        int i6 = this.f11607a;
        aVar3.getClass();
        z zVar = new z(aVar3, 0);
        v vVar2 = aVar3.f5002j;
        vVar2.sendMessage(vVar2.obtainMessage(7, i6, -1, zVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.a aVar;
        synchronized (this.f11608b.f5004l) {
            aVar = this.f11608b;
            aVar.f5005m = null;
        }
        int i2 = this.f11607a;
        v vVar = aVar.f5002j;
        vVar.sendMessage(vVar.obtainMessage(6, i2, 1));
    }
}
