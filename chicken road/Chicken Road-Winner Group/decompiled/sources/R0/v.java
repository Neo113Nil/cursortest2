package R0;

import I1.y;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import i1.AbstractC0336f;
import i1.C0335e;
import i1.C0337g;
import i1.C0341k;
import java.util.Map;

/* loaded from: classes.dex */
public final class v extends q {

    /* renamed from: b, reason: collision with root package name */
    public final y f1249b;

    /* renamed from: c, reason: collision with root package name */
    public final C0335e f1250c;

    /* renamed from: d, reason: collision with root package name */
    public final P0.j f1251d;

    public v(int i3, y yVar, C0335e c0335e, P0.j jVar) {
        super(i3);
        this.f1250c = c0335e;
        this.f1249b = yVar;
        this.f1251d = jVar;
        if (i3 == 2 && yVar.f684a) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // R0.q
    public final boolean a(l lVar) {
        return this.f1249b.f684a;
    }

    @Override // R0.q
    public final P0.d[] b(l lVar) {
        return (P0.d[]) this.f1249b.f686c;
    }

    @Override // R0.q
    public final void c(Status status) {
        this.f1251d.getClass();
        this.f1250c.a(status.f2569c != null ? new Q0.j(status) : new Q0.d(status));
    }

    @Override // R0.q
    public final void d(RuntimeException runtimeException) {
        this.f1250c.a(runtimeException);
    }

    @Override // R0.q
    public final void e(l lVar) {
        C0335e c0335e = this.f1250c;
        try {
            y yVar = this.f1249b;
            ((h) ((y) yVar.f687d).f686c).accept(lVar.f1209d, c0335e);
        } catch (DeadObjectException e3) {
            throw e3;
        } catch (RemoteException e4) {
            c(q.g(e4));
        } catch (RuntimeException e5) {
            c0335e.a(e5);
        }
    }

    @Override // R0.q
    public final void f(a1.e eVar, boolean z3) {
        Boolean valueOf = Boolean.valueOf(z3);
        Map map = (Map) eVar.f1789c;
        C0335e c0335e = this.f1250c;
        map.put(c0335e, valueOf);
        a1.e eVar2 = new a1.e(eVar, c0335e, 13, false);
        C0341k c0341k = c0335e.f5011a;
        c0341k.getClass();
        c0341k.f5023b.d(new C0337g(AbstractC0336f.f5012a, eVar2));
        c0341k.g();
    }
}
