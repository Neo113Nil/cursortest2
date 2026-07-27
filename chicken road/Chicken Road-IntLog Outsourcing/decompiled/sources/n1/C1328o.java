package n1;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Set;
import m1.C1277d;
import m1.InterfaceC1276c;

/* renamed from: n1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1328o implements InterfaceC1338y {

    /* renamed from: a, reason: collision with root package name */
    public final C1297A f11404a;

    public C1328o(C1297A c1297a) {
        this.f11404a = c1297a;
    }

    @Override // n1.InterfaceC1338y
    public final void g(int i2) {
        C1297A c1297a = this.f11404a;
        c1297a.f();
        c1297a.f11290q.y(i2);
    }

    @Override // n1.InterfaceC1338y
    public final boolean r() {
        C1297A c1297a = this.f11404a;
        c1297a.f11289p.getClass();
        c1297a.f();
        return true;
    }

    @Override // n1.InterfaceC1338y
    public final B1.n s(B1.n nVar) {
        C1297A c1297a = this.f11404a;
        try {
            S s2 = c1297a.f11289p.f11461w;
            ((Set) s2.f11345a).add(nVar);
            nVar.f4986g.set((W1.e) s2.f11346b);
            C1277d c1277d = nVar.f236l;
            InterfaceC1276c interfaceC1276c = (InterfaceC1276c) c1297a.f11289p.f11453o.getOrDefault(c1277d, null);
            o1.u.h(interfaceC1276c, "Appropriate Api was not requested.");
            if (interfaceC1276c.a() || !c1297a.f11283j.containsKey(c1277d)) {
                try {
                    nVar.K(interfaceC1276c);
                } catch (DeadObjectException e3) {
                    nVar.L(new Status(8, e3.getLocalizedMessage(), null, null));
                    throw e3;
                } catch (RemoteException e6) {
                    nVar.L(new Status(8, e6.getLocalizedMessage(), null, null));
                }
            } else {
                nVar.L(new Status(17, null, null, null));
            }
        } catch (DeadObjectException unused) {
            C1327n c1327n = new C1327n(this, this);
            HandlerC1335v handlerC1335v = c1297a.f11281h;
            handlerC1335v.sendMessage(handlerC1335v.obtainMessage(1, c1327n));
        }
        return nVar;
    }

    @Override // n1.InterfaceC1338y
    public final void j() {
    }

    @Override // n1.InterfaceC1338y
    public final void n() {
    }

    @Override // n1.InterfaceC1338y
    public final void c(Bundle bundle) {
    }

    @Override // n1.InterfaceC1338y
    public final void x(l1.b bVar, m1.e eVar, boolean z) {
    }
}
