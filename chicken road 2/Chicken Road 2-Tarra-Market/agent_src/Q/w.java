package Q;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class w extends p {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f477g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f478h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.google.android.gms.common.internal.a aVar, int i2, IBinder iBinder, Bundle bundle) {
        super(aVar, i2, bundle);
        this.f478h = aVar;
        this.f477g = iBinder;
    }

    @Override // Q.p
    public final void a(N.b bVar) {
        h hVar = this.f478h.f746o;
        if (hVar != null) {
            ((O.h) hVar.f439a).a(bVar);
        }
        System.currentTimeMillis();
    }

    @Override // Q.p
    public final boolean b() {
        IBinder iBinder = this.f477g;
        try {
            s.c(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            com.google.android.gms.common.internal.a aVar = this.f478h;
            if (!aVar.r().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + aVar.r() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface n2 = aVar.n(iBinder);
            if (n2 == null || !(com.google.android.gms.common.internal.a.u(aVar, 2, 4, n2) || com.google.android.gms.common.internal.a.u(aVar, 3, 4, n2))) {
                return false;
            }
            aVar.f750s = null;
            h hVar = aVar.f745n;
            if (hVar == null) {
                return true;
            }
            ((O.g) hVar.f439a).c();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
