package S0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class v extends o {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f1366g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f1367h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.google.android.gms.common.internal.a aVar, int i3, IBinder iBinder, Bundle bundle) {
        super(aVar, i3, bundle);
        this.f1367h = aVar;
        this.f1366g = iBinder;
    }

    @Override // S0.o
    public final void a(P0.b bVar) {
        g gVar = this.f1367h.f2585o;
        if (gVar != null) {
            ((Q0.h) gVar.f1329a).a(bVar);
        }
        System.currentTimeMillis();
    }

    @Override // S0.o
    public final boolean b() {
        IBinder iBinder = this.f1366g;
        try {
            r.c(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            com.google.android.gms.common.internal.a aVar = this.f1367h;
            if (!aVar.r().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + aVar.r() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface n3 = aVar.n(iBinder);
            if (n3 == null || !(com.google.android.gms.common.internal.a.v(aVar, 2, 4, n3) || com.google.android.gms.common.internal.a.v(aVar, 3, 4, n3))) {
                return false;
            }
            aVar.f2589s = null;
            g gVar = aVar.f2584n;
            if (gVar == null) {
                return true;
            }
            ((Q0.g) gVar.f1329a).c();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
