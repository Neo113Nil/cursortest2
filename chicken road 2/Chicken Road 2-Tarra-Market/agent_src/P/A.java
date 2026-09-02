package P;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class A extends u {

    /* renamed from: b, reason: collision with root package name */
    public final e0.d f285b;

    public A(e0.d dVar) {
        super(4);
        this.f285b = dVar;
    }

    @Override // P.u
    public final boolean a(o oVar) {
        if (oVar.f333f.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // P.u
    public final N.d[] b(o oVar) {
        if (oVar.f333f.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // P.u
    public final void c(Status status) {
        this.f285b.a(new O.d(status));
    }

    @Override // P.u
    public final void d(RuntimeException runtimeException) {
        this.f285b.a(runtimeException);
    }

    @Override // P.u
    public final void e(o oVar) {
        try {
            h(oVar);
        } catch (DeadObjectException e2) {
            c(u.g(e2));
            throw e2;
        } catch (RemoteException e3) {
            c(u.g(e3));
        } catch (RuntimeException e4) {
            this.f285b.a(e4);
        }
    }

    public final void h(o oVar) {
        if (oVar.f333f.remove(null) != null) {
            throw new ClassCastException();
        }
        e0.d dVar = this.f285b;
        Boolean bool = Boolean.FALSE;
        e0.k kVar = dVar.f954a;
        synchronized (kVar.f968a) {
            try {
                if (kVar.f970c) {
                    return;
                }
                kVar.f970c = true;
                kVar.f972e = bool;
                kVar.f969b.d(kVar);
            } finally {
            }
        }
    }

    @Override // P.u
    public final /* bridge */ /* synthetic */ void f(Y.e eVar, boolean z2) {
    }
}
