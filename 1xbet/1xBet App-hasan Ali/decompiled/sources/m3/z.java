package m3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class z extends s {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f18115g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC2095e f18116h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(AbstractC2095e abstractC2095e, int i, IBinder iBinder, Bundle bundle) {
        super(abstractC2095e, i, bundle);
        this.f18116h = abstractC2095e;
        this.f18115g = iBinder;
    }

    @Override // m3.s
    public final void a(j3.b bVar) {
        InterfaceC2093c interfaceC2093c = this.f18116h.f18036p;
        if (interfaceC2093c != null) {
            interfaceC2093c.Y(bVar);
        }
        System.currentTimeMillis();
    }

    @Override // m3.s
    public final boolean b() {
        IBinder iBinder = this.f18115g;
        try {
            v.e(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC2095e abstractC2095e = this.f18116h;
            if (!abstractC2095e.u().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + abstractC2095e.u() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface o5 = abstractC2095e.o(iBinder);
            if (o5 == null || !(AbstractC2095e.y(abstractC2095e, 2, 4, o5) || AbstractC2095e.y(abstractC2095e, 3, 4, o5))) {
                return false;
            }
            abstractC2095e.f18040t = null;
            InterfaceC2092b interfaceC2092b = abstractC2095e.f18035o;
            if (interfaceC2092b == null) {
                return true;
            }
            interfaceC2092b.N();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
