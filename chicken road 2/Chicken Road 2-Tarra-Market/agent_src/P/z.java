package P;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class z extends u {

    /* renamed from: b, reason: collision with root package name */
    public final i f375b;

    /* renamed from: c, reason: collision with root package name */
    public final e0.d f376c;

    /* renamed from: d, reason: collision with root package name */
    public final N.i f377d;

    public z(int i2, i iVar, e0.d dVar, N.i iVar2) {
        super(i2);
        this.f376c = dVar;
        this.f375b = iVar;
        this.f377d = iVar2;
        if (i2 == 2 && iVar.f318c) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // P.u
    public final boolean a(o oVar) {
        return this.f375b.f318c;
    }

    @Override // P.u
    public final N.d[] b(o oVar) {
        return (N.d[]) this.f375b.f317b;
    }

    @Override // P.u
    public final void c(Status status) {
        this.f377d.getClass();
        this.f376c.a(status.f729c != null ? new O.j(status) : new O.d(status));
    }

    @Override // P.u
    public final void d(RuntimeException runtimeException) {
        this.f376c.a(runtimeException);
    }

    @Override // P.u
    public final void e(o oVar) {
        e0.d dVar = this.f376c;
        try {
            i iVar = this.f375b;
            ((h) ((i) iVar.f320e).f320e).f(oVar.f329b, dVar);
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (RemoteException e3) {
            c(u.g(e3));
        } catch (RuntimeException e4) {
            dVar.a(e4);
        }
    }

    @Override // P.u
    public final void f(Y.e eVar, boolean z2) {
        Boolean valueOf = Boolean.valueOf(z2);
        Map map = (Map) eVar.f524c;
        e0.d dVar = this.f376c;
        map.put(dVar, valueOf);
        Y.e eVar2 = new Y.e(14, eVar, dVar);
        e0.k kVar = dVar.f954a;
        kVar.getClass();
        kVar.f969b.c(new e0.f(e0.e.f955a, eVar2));
        kVar.h();
    }
}
