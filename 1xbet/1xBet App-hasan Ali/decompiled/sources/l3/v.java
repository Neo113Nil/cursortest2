package l3;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class v extends q {

    /* renamed from: b, reason: collision with root package name */
    public final j f17844b;

    /* renamed from: c, reason: collision with root package name */
    public final D3.f f17845c;

    /* renamed from: d, reason: collision with root package name */
    public final C2054a f17846d;

    public v(int i, j jVar, D3.f fVar, C2054a c2054a) {
        super(i);
        this.f17845c = fVar;
        this.f17844b = jVar;
        this.f17846d = c2054a;
        if (i == 2 && jVar.f17802c) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // l3.q
    public final boolean a(m mVar) {
        return this.f17844b.f17802c;
    }

    @Override // l3.q
    public final j3.d[] b(m mVar) {
        return (j3.d[]) this.f17844b.f17801b;
    }

    @Override // l3.q
    public final void c(Status status) {
        this.f17846d.getClass();
        this.f17845c.a(status.f7485m != null ? new k3.j(status) : new k3.d(status));
    }

    @Override // l3.q
    public final void d(RuntimeException runtimeException) {
        this.f17845c.a(runtimeException);
    }

    @Override // l3.q
    public final void e(m mVar) {
        D3.f fVar = this.f17845c;
        try {
            j jVar = this.f17844b;
            ((i) ((j) jVar.f17804e).f17804e).f(mVar.f17807l, fVar);
        } catch (DeadObjectException e3) {
            throw e3;
        } catch (RemoteException e5) {
            c(q.g(e5));
        } catch (RuntimeException e6) {
            fVar.a(e6);
        }
    }

    @Override // l3.q
    public final void f(v3.g gVar, boolean z3) {
        Boolean valueOf = Boolean.valueOf(z3);
        Map map = (Map) gVar.f20440m;
        D3.f fVar = this.f17845c;
        map.put(fVar, valueOf);
        G.v vVar = new G.v(15, gVar, fVar, false);
        D3.o oVar = fVar.f946a;
        oVar.getClass();
        oVar.f967b.e(new D3.i(D3.g.f947a, vVar));
        oVar.i();
    }
}
