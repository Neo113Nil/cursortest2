package W5;

import G4.C0282o;
import U5.AbstractC0438e;
import U5.C0437d;
import U5.C0452t;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: renamed from: W5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0487b extends Z1 implements InterfaceC0540t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Logger f7123i = Logger.getLogger(AbstractC0487b.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h2 f7124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0485a0 f7125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f7126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f7127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public U5.b0 f7128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f7129h;

    public AbstractC0487b(p036e6.c cVar, d2 d2Var, h2 h2Var, U5.b0 b0Var, C0437d c0437d, boolean z4) {
        p113p3.f.k(b0Var, "headers");
        p113p3.f.k(h2Var, "transportTracer");
        this.f7124c = h2Var;
        this.f7126e = !Boolean.TRUE.equals(c0437d.a(AbstractC0494d0.f7175n));
        this.f7127f = z4;
        if (!z4) {
            this.f7125d = new C0498e1(this, cVar, d2Var);
            this.f7128g = b0Var;
            return;
        }
        C0282o c0282o = new C0282o();
        c0282o.f3013e = this;
        p113p3.f.k(b0Var, "headers");
        c0282o.f3010b = b0Var;
        c0282o.f3011c = d2Var;
        this.f7125d = c0282o;
    }

    @Override // W5.e2
    public final boolean b() {
        return ((X5.j) this).f7555n.e() && !this.f7129h;
    }

    @Override // W5.InterfaceC0540t
    public final void c(int i7) {
        this.f7125d.c(i7);
    }

    @Override // W5.InterfaceC0540t
    public final void d(R4.c cVar) {
        cVar.y(((X5.j) this).f7557p.f6455a.get(AbstractC0438e.f6489a), "remote_addr");
    }

    @Override // W5.InterfaceC0540t
    public final void e(InterfaceC0546v interfaceC0546v) {
        X5.j jVar = (X5.j) this;
        X5.i iVar = jVar.f7555n;
        p113p3.f.q("Already called setListener", iVar.j == null);
        p113p3.f.k(interfaceC0546v, "listener");
        iVar.j = interfaceC0546v;
        if (this.f7127f) {
            return;
        }
        jVar.f7556o.d0(this.f7128g, null);
        this.f7128g = null;
    }

    @Override // W5.InterfaceC0540t
    public final void f(U5.l0 l0Var) {
        p113p3.f.d("Should not cancel with OK status", !l0Var.e());
        this.f7129h = true;
        p033e3.h hVar = ((X5.j) this).f7556o;
        hVar.getClass();
        p036e6.b.c();
        try {
            synchronized (((X5.j) hVar.f12673a).f7555n.f7547w) {
                ((X5.j) hVar.f12673a).f7555n.l(l0Var, true, null);
            }
            p036e6.b.f12742a.getClass();
        } catch (Throwable th) {
            try {
                p036e6.b.f12742a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // W5.InterfaceC0540t
    public final void h() {
        X5.j jVar = (X5.j) this;
        if (jVar.f7555n.f7117n) {
            return;
        }
        jVar.f7555n.f7117n = true;
        this.f7125d.close();
    }

    @Override // W5.InterfaceC0540t
    public final void j(int i7) {
        ((X5.j) this).f7555n.f7105a.f7140b = i7;
    }

    @Override // W5.InterfaceC0540t
    public final void k(C0452t c0452t) {
        X5.i iVar = ((X5.j) this).f7555n;
        p113p3.f.q("Already called start", iVar.j == null);
        p113p3.f.k(c0452t, "decompressorRegistry");
        iVar.f7114k = c0452t;
    }

    @Override // W5.InterfaceC0540t
    public final void l(U5.r rVar) {
        U5.b0 b0Var = this.f7128g;
        U5.W w7 = AbstractC0494d0.f7165c;
        b0Var.a(w7);
        this.f7128g.f(w7, Long.valueOf(Math.max(0L, rVar.b(TimeUnit.NANOSECONDS))));
    }

    public final void v(X5.t tVar, boolean z4, boolean z7, int i7) {
        N6.d dVar;
        p113p3.f.d("null frame before EOS", tVar != null || z4);
        p033e3.h hVar = ((X5.j) this).f7556o;
        hVar.getClass();
        p036e6.b.c();
        try {
            if (tVar == null) {
                dVar = X5.j.f7551r;
            } else {
                dVar = tVar.f7624a;
                int i8 = (int) dVar.f4797b;
                if (i8 > 0) {
                    X5.j jVar = (X5.j) hVar.f12673a;
                    jVar.getClass();
                    X5.i iVar = jVar.f7555n;
                    synchronized (iVar.f7106b) {
                        iVar.f7109e += i8;
                    }
                }
            }
            synchronized (((X5.j) hVar.f12673a).f7555n.f7547w) {
                X5.i.k(((X5.j) hVar.f12673a).f7555n, dVar, z4, z7);
                h2 h2Var = ((X5.j) hVar.f12673a).f7124c;
                if (i7 == 0) {
                    h2Var.getClass();
                } else {
                    h2Var.getClass();
                    ((f2) h2Var.f7232b).d();
                }
            }
            p036e6.b.f12742a.getClass();
        } catch (Throwable th) {
            try {
                p036e6.b.f12742a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
