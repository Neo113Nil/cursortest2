package B1;

import a.AbstractC0169a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.GoogleApiClient;
import h2.C0482c;
import java.util.HashMap;
import m1.InterfaceC1276c;
import n1.C1321h;
import n1.C1322i;
import o1.u;

/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ E1.b f235n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(GoogleApiClient googleApiClient, E1.b bVar) {
        super(googleApiClient);
        this.f235n = bVar;
    }

    @Override // B1.n
    public final void K(InterfaceC1276c interfaceC1276c) {
        IBinder iBinder;
        E1.b bVar = this.f235n;
        String simpleName = E1.b.class.getSimpleName();
        u.h(bVar, "Listener must not be null");
        u.d(simpleName, "Listener type must not be empty");
        C1321h c1321h = new C1321h(bVar, simpleName);
        o oVar = new o(this);
        B0.i iVar = ((i) interfaceC1276c).f219E;
        ((i) ((C0482c) iVar.f153b).f5783b).p();
        synchronized (((HashMap) iVar.f154c)) {
            h hVar = (h) ((HashMap) iVar.f154c).remove(c1321h);
            if (hVar != null) {
                synchronized (hVar) {
                    C1322i c1322i = hVar.f217e;
                    iBinder = null;
                    c1322i.f11388b = null;
                    c1322i.f11389c = null;
                }
                f j2 = ((C0482c) iVar.f153b).j();
                int i2 = h.f216f;
                IInterface queryLocalInterface = hVar.queryLocalInterface("com.google.android.gms.location.ILocationListener");
                IInterface dVar = queryLocalInterface instanceof E1.e ? (E1.e) queryLocalInterface : new E1.d(hVar, "com.google.android.gms.location.ILocationListener", 0);
                IInterface queryLocalInterface2 = oVar.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                IInterface dVar2 = queryLocalInterface2 instanceof e ? (e) queryLocalInterface2 : new d(oVar);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(j2.f211f);
                int i3 = k.f232a;
                obtain.writeInt(1);
                int R5 = AbstractC0169a.R(obtain, 20293);
                AbstractC0169a.T(obtain, 1, 4);
                obtain.writeInt(2);
                AbstractC0169a.M(obtain, 3, dVar == null ? null : dVar.asBinder());
                if (dVar2 != null) {
                    iBinder = dVar2.asBinder();
                }
                AbstractC0169a.M(obtain, 6, iBinder);
                AbstractC0169a.S(obtain, R5);
                j2.f(obtain, 59);
            }
        }
    }
}
