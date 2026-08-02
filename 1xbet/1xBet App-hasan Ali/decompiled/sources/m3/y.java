package m3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class y implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f18113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2095e f18114b;

    public y(AbstractC2095e abstractC2095e, int i) {
        this.f18114b = abstractC2095e;
        this.f18113a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC2095e abstractC2095e = this.f18114b;
        if (iBinder == null) {
            AbstractC2095e.x(abstractC2095e);
            return;
        }
        synchronized (abstractC2095e.f18029h) {
            try {
                AbstractC2095e abstractC2095e2 = this.f18114b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC2095e2.i = (queryLocalInterface == null || !(queryLocalInterface instanceof u)) ? new u(iBinder) : (u) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC2095e abstractC2095e3 = this.f18114b;
        int i = this.f18113a;
        abstractC2095e3.getClass();
        C2090A c2090a = new C2090A(abstractC2095e3, 0);
        w wVar = abstractC2095e3.f;
        wVar.sendMessage(wVar.obtainMessage(7, i, -1, c2090a));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC2095e abstractC2095e;
        synchronized (this.f18114b.f18029h) {
            abstractC2095e = this.f18114b;
            abstractC2095e.i = null;
        }
        int i = this.f18113a;
        w wVar = abstractC2095e.f;
        wVar.sendMessage(wVar.obtainMessage(6, i, 1));
    }
}
