package Q;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class v implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f476b;

    public v(com.google.android.gms.common.internal.a aVar, int i2) {
        this.f476b = aVar;
        this.f475a = i2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i2;
        int i3;
        com.google.android.gms.common.internal.a aVar = this.f476b;
        if (iBinder == null) {
            synchronized (aVar.f737f) {
                i2 = aVar.f744m;
            }
            if (i2 == 3) {
                aVar.f751t = true;
                i3 = 5;
            } else {
                i3 = 4;
            }
            t tVar = aVar.f736e;
            tVar.sendMessage(tVar.obtainMessage(i3, aVar.f753v.get(), 16));
            return;
        }
        synchronized (aVar.f738g) {
            try {
                com.google.android.gms.common.internal.a aVar2 = this.f476b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar2.f739h = (queryLocalInterface == null || !(queryLocalInterface instanceof r)) ? new r(iBinder) : (r) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.a aVar3 = this.f476b;
        int i4 = this.f475a;
        aVar3.getClass();
        x xVar = new x(aVar3, 0);
        t tVar2 = aVar3.f736e;
        tVar2.sendMessage(tVar2.obtainMessage(7, i4, -1, xVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.a aVar;
        synchronized (this.f476b.f738g) {
            aVar = this.f476b;
            aVar.f739h = null;
        }
        int i2 = this.f475a;
        t tVar = aVar.f736e;
        tVar.sendMessage(tVar.obtainMessage(6, i2, 1));
    }
}
