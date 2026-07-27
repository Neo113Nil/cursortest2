package S0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class u implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f1364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f1365b;

    public u(com.google.android.gms.common.internal.a aVar, int i3) {
        this.f1365b = aVar;
        this.f1364a = i3;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i3;
        int i4;
        com.google.android.gms.common.internal.a aVar = this.f1365b;
        if (iBinder == null) {
            synchronized (aVar.f) {
                i3 = aVar.f2583m;
            }
            if (i3 == 3) {
                aVar.f2590t = true;
                i4 = 5;
            } else {
                i4 = 4;
            }
            s sVar = aVar.f2576e;
            sVar.sendMessage(sVar.obtainMessage(i4, aVar.f2592v.get(), 16));
            return;
        }
        synchronized (aVar.f2577g) {
            try {
                com.google.android.gms.common.internal.a aVar2 = this.f1365b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar2.f2578h = (queryLocalInterface == null || !(queryLocalInterface instanceof q)) ? new q(iBinder) : (q) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.a aVar3 = this.f1365b;
        int i5 = this.f1364a;
        aVar3.getClass();
        w wVar = new w(aVar3, 0);
        s sVar2 = aVar3.f2576e;
        sVar2.sendMessage(sVar2.obtainMessage(7, i5, -1, wVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.a aVar;
        synchronized (this.f1365b.f2577g) {
            aVar = this.f1365b;
            aVar.f2578h = null;
        }
        int i3 = this.f1364a;
        s sVar = aVar.f2576e;
        sVar.sendMessage(sVar.obtainMessage(6, i3, 1));
    }
}
