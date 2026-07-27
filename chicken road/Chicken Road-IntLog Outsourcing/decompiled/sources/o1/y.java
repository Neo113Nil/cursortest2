package o1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class y extends r {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f11609g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f11610h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.google.android.gms.common.internal.a aVar, int i2, IBinder iBinder, Bundle bundle) {
        super(aVar, i2, bundle);
        this.f11610h = aVar;
        this.f11609g = iBinder;
    }

    @Override // o1.r
    public final void a(l1.b bVar) {
        com.google.android.gms.common.internal.a aVar = this.f11610h;
        C1371i c1371i = aVar.f5012t;
        if (c1371i != null) {
            ((m1.j) c1371i.f11562a).onConnectionFailed(bVar);
        }
        aVar.f4996d = bVar.f11000b;
        aVar.f4997e = System.currentTimeMillis();
    }

    @Override // o1.r
    public final boolean b() {
        IBinder iBinder = this.f11609g;
        try {
            u.g(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            com.google.android.gms.common.internal.a aVar = this.f11610h;
            if (!aVar.u().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + aVar.u() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface q5 = aVar.q(iBinder);
            if (q5 == null || !(com.google.android.gms.common.internal.a.y(aVar, 2, 4, q5) || com.google.android.gms.common.internal.a.y(aVar, 3, 4, q5))) {
                return false;
            }
            aVar.f5016x = null;
            C1371i c1371i = aVar.f5011s;
            if (c1371i == null) {
                return true;
            }
            ((m1.i) c1371i.f11562a).onConnected(null);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
