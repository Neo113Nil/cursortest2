package x0;

import A0.C0022e0;
import A0.L1;
import A0.RunnableC0049o;
import P.AbstractC0321v;
import P.AbstractC0329z;
import P.C0315s;
import P.C0327y;
import P.InterfaceC0298j;
import android.os.Handler;
import android.view.ViewGroup;
import java.util.List;
import n.AbstractC2107A;
import r.C2318D;
import r.C2321G;
import r.C2322H;
import w0.AbstractC2540a;
import z0.AbstractC2734J;
import z0.C2731G;
import z0.C2735K;
import z0.EnumC2729E;

/* loaded from: classes.dex */
public final class K implements InterfaceC0298j {

    /* renamed from: k, reason: collision with root package name */
    public final C2731G f20941k;

    /* renamed from: l, reason: collision with root package name */
    public AbstractC0321v f20942l;

    /* renamed from: m, reason: collision with root package name */
    public k0 f20943m;

    /* renamed from: n, reason: collision with root package name */
    public int f20944n;

    /* renamed from: o, reason: collision with root package name */
    public int f20945o;

    /* renamed from: p, reason: collision with root package name */
    public final C2321G f20946p;

    /* renamed from: q, reason: collision with root package name */
    public final C2321G f20947q;

    /* renamed from: r, reason: collision with root package name */
    public final E f20948r;

    /* renamed from: s, reason: collision with root package name */
    public final C2613B f20949s;

    /* renamed from: t, reason: collision with root package name */
    public final C2321G f20950t;

    /* renamed from: u, reason: collision with root package name */
    public final r.V f20951u;

    /* renamed from: v, reason: collision with root package name */
    public final C2321G f20952v;

    /* renamed from: w, reason: collision with root package name */
    public final R.e f20953w;

    /* renamed from: x, reason: collision with root package name */
    public int f20954x;

    /* renamed from: y, reason: collision with root package name */
    public int f20955y;

    /* renamed from: z, reason: collision with root package name */
    public final String f20956z;

    public K(C2731G c2731g, k0 k0Var) {
        this.f20941k = c2731g;
        this.f20943m = k0Var;
        long[] jArr = r.O.f18957a;
        this.f20946p = new C2321G();
        this.f20947q = new C2321G();
        this.f20948r = new E(this);
        this.f20949s = new C2613B(this);
        this.f20950t = new C2321G();
        this.f20951u = new r.V();
        this.f20952v = new C2321G();
        this.f20953w = new R.e(new Object[16]);
        this.f20956z = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public final void a(int i) {
        boolean z3;
        boolean z5 = false;
        this.f20954x = 0;
        List o5 = this.f20941k.o();
        R.b bVar = (R.b) o5;
        int i5 = (bVar.f5100k.f5108m - this.f20955y) - 1;
        if (i <= i5) {
            this.f20951u.clear();
            if (i <= i5) {
                int i6 = i;
                while (true) {
                    Object g5 = this.f20946p.g((C2731G) bVar.get(i6));
                    kotlin.jvm.internal.l.c(g5);
                    ((C2318D) this.f20951u.f18979l).a(((C2614C) g5).f20913a);
                    if (i6 == i5) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.f20943m.c(this.f20951u);
            Z.f d5 = Z.q.d();
            i4.c e3 = d5 != null ? d5.e() : null;
            Z.f g6 = Z.q.g(d5);
            z3 = false;
            while (i5 >= i) {
                try {
                    C2731G c2731g = (C2731G) ((R.b) o5).get(i5);
                    Object g7 = this.f20946p.g(c2731g);
                    kotlin.jvm.internal.l.c(g7);
                    C2614C c2614c = (C2614C) g7;
                    Object obj = c2614c.f20913a;
                    if (((C2318D) this.f20951u.f18979l).c(obj)) {
                        this.f20954x++;
                        if (((Boolean) c2614c.f.getValue()).booleanValue()) {
                            C2735K c2735k = c2731g.f21613P;
                            z0.Y y5 = c2735k.f21663p;
                            EnumC2729E enumC2729E = EnumC2729E.f21594m;
                            y5.f21756v = enumC2729E;
                            z0.U u5 = c2735k.f21664q;
                            if (u5 != null) {
                                u5.f21713t = enumC2729E;
                            }
                            e(c2614c, false);
                            if (c2614c.f20918g) {
                                z3 = true;
                            }
                        }
                    } else {
                        C2731G c2731g2 = this.f20941k;
                        c2731g2.f21639z = true;
                        this.f20946p.k(c2731g);
                        C0327y c0327y = c2614c.f20915c;
                        if (c0327y != null) {
                            c0327y.l();
                        }
                        this.f20941k.R(i5, 1);
                        c2731g2.f21639z = false;
                    }
                    this.f20947q.k(obj);
                    i5--;
                } catch (Throwable th) {
                    Z.q.k(d5, g6, e3);
                    throw th;
                }
            }
            Z.q.k(d5, g6, e3);
        } else {
            z3 = false;
        }
        if (z3) {
            synchronized (Z.l.f6208c) {
                C2322H c2322h = Z.l.f6213j.f6178h;
                if (c2322h != null) {
                    if (c2322h.h()) {
                        z5 = true;
                    }
                }
            }
            if (z5) {
                Z.l.a();
            }
        }
        b();
    }

    public final void b() {
        int i = ((R.b) this.f20941k.o()).f5100k.f5108m;
        C2321G c2321g = this.f20946p;
        if (c2321g.f18932e != i) {
            AbstractC2540a.a("Inconsistency between the count of nodes tracked by the state (" + c2321g.f18932e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.f20954x) - this.f20955y < 0) {
            StringBuilder v4 = AbstractC2107A.v(i, "Incorrect state. Total children ", ". Reusable children ");
            v4.append(this.f20954x);
            v4.append(". Precomposed children ");
            v4.append(this.f20955y);
            AbstractC2540a.a(v4.toString());
        }
        C2321G c2321g2 = this.f20950t;
        if (c2321g2.f18932e == this.f20955y) {
            return;
        }
        AbstractC2540a.a("Incorrect state. Precomposed children " + this.f20955y + ". Map size " + c2321g2.f18932e);
    }

    public final void c(boolean z3) {
        this.f20955y = 0;
        this.f20950t.a();
        List o5 = this.f20941k.o();
        int i = ((R.b) o5).f5100k.f5108m;
        if (this.f20954x != i) {
            this.f20954x = i;
            Z.f d5 = Z.q.d();
            i4.c e3 = d5 != null ? d5.e() : null;
            Z.f g5 = Z.q.g(d5);
            for (int i5 = 0; i5 < i; i5++) {
                try {
                    C2731G c2731g = (C2731G) ((R.b) o5).get(i5);
                    C2614C c2614c = (C2614C) this.f20946p.g(c2731g);
                    if (c2614c != null && ((Boolean) c2614c.f.getValue()).booleanValue()) {
                        C2735K c2735k = c2731g.f21613P;
                        z0.Y y5 = c2735k.f21663p;
                        EnumC2729E enumC2729E = EnumC2729E.f21594m;
                        y5.f21756v = enumC2729E;
                        z0.U u5 = c2735k.f21664q;
                        if (u5 != null) {
                            u5.f21713t = enumC2729E;
                        }
                        e(c2614c, z3);
                        c2614c.f20913a = f0.f20995a;
                    }
                } catch (Throwable th) {
                    Z.q.k(d5, g5, e3);
                    throw th;
                }
            }
            Z.q.k(d5, g5, e3);
            this.f20947q.a();
        }
        b();
    }

    public final g0 d(i4.e eVar, Object obj) {
        C2731G c2731g = this.f20941k;
        if (c2731g.I()) {
            b();
            if (!this.f20947q.c(obj)) {
                this.f20952v.k(obj);
                C2321G c2321g = this.f20950t;
                Object g5 = c2321g.g(obj);
                if (g5 == null) {
                    g5 = i(obj);
                    if (g5 != null) {
                        int j5 = ((R.b) c2731g.o()).f5100k.j(g5);
                        int i = ((R.b) c2731g.o()).f5100k.f5108m;
                        c2731g.f21639z = true;
                        c2731g.M(j5, i, 1);
                        c2731g.f21639z = false;
                        this.f20955y++;
                    } else {
                        int i5 = ((R.b) c2731g.o()).f5100k.f5108m;
                        C2731G c2731g2 = new C2731G(2);
                        c2731g.f21639z = true;
                        c2731g.B(i5, c2731g2);
                        c2731g.f21639z = false;
                        this.f20955y++;
                        g5 = c2731g2;
                    }
                    c2321g.m(obj, g5);
                }
                f((C2731G) g5, obj, eVar);
            }
        }
        return !c2731g.I() ? new H() : new I(this, obj);
    }

    public final void e(C2614C c2614c, boolean z3) {
        C0327y c0327y;
        if (z3 || !c2614c.f20918g) {
            c2614c.f = AbstractC0329z.t(Boolean.FALSE);
        } else {
            c2614c.f.setValue(Boolean.FALSE);
        }
        c2614c.getClass();
        if (z3) {
            C0327y c0327y2 = c2614c.f20915c;
            if (c0327y2 != null) {
                c0327y2.k();
                return;
            }
            return;
        }
        z0.l0 m5getOutOfFrameExecutor = ((A0.F) AbstractC2734J.a(this.f20941k)).m5getOutOfFrameExecutor();
        if (m5getOutOfFrameExecutor == null) {
            if (c2614c.f20918g || (c0327y = c2614c.f20915c) == null) {
                return;
            }
            c0327y.k();
            return;
        }
        J j5 = new J(0, c2614c);
        Handler handler = ((A0.F) m5getOutOfFrameExecutor).getHandler();
        if (handler == null) {
            throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
        }
        handler.postAtFrontOfQueue(new RunnableC0049o(1, j5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        if ((r5.f4585E == 3) != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(C2731G c2731g, Object obj, i4.e eVar) {
        boolean z3;
        C2321G c2321g = this.f20946p;
        Object g5 = c2321g.g(c2731g);
        Object obj2 = g5;
        if (g5 == null) {
            X.d dVar = AbstractC2622h.f20997a;
            C2614C c2614c = new C2614C();
            c2614c.f20913a = obj;
            c2614c.f20914b = dVar;
            c2614c.f20915c = null;
            c2614c.f = AbstractC0329z.t(Boolean.TRUE);
            c2321g.m(c2731g, c2614c);
            obj2 = c2614c;
        }
        C2614C c2614c2 = (C2614C) obj2;
        boolean z5 = c2614c2.f20914b != eVar;
        C0327y c0327y = c2614c2.f20915c;
        if (c0327y != null) {
            synchronized (c0327y.f4589n) {
                z3 = c0327y.f4599x.f18932e > 0;
            }
        } else {
            z3 = true;
        }
        if (z5 || z3 || c2614c2.f20916d) {
            c2614c2.f20914b = eVar;
            Z.f d5 = Z.q.d();
            i4.c e3 = d5 != null ? d5.e() : null;
            Z.f g6 = Z.q.g(d5);
            try {
                C2731G c2731g2 = this.f20941k;
                c2731g2.f21639z = true;
                C0327y c0327y2 = c2614c2.f20915c;
                AbstractC0321v abstractC0321v = this.f20942l;
                if (abstractC0321v == null) {
                    AbstractC2540a.c("parent composition reference not set");
                    throw new D2.e();
                }
                if (c0327y2 != null) {
                }
                ViewGroup.LayoutParams layoutParams = L1.f326a;
                c0327y2 = new C0327y(abstractC0321v, new v3.e(c2731g));
                c2614c2.f20915c = c0327y2;
                i4.e eVar2 = c2614c2.f20914b;
                if (((A0.F) AbstractC2734J.a(this.f20941k)).m5getOutOfFrameExecutor() != null) {
                    c2614c2.f20918g = false;
                } else {
                    c2614c2.f20918g = true;
                    eVar2 = new X.d(1524156494, new C0022e0(19, c2614c2, eVar2), true);
                }
                if (c2614c2.f20917e) {
                    c0327y2.i();
                    c0327y2.p();
                    C0315s c0315s = c0327y2.f4584D;
                    c0315s.f4556z = 100;
                    c0315s.f4555y = true;
                    c0327y2.f4586k.a(c0327y2, eVar2);
                    c0315s.u();
                } else {
                    c0327y2.A(eVar2);
                }
                c2614c2.f20917e = false;
                c2731g2.f21639z = false;
                Z.q.k(d5, g6, e3);
                c2614c2.f20916d = false;
            } catch (Throwable th) {
                Z.q.k(d5, g6, e3);
                throw th;
            }
        }
    }

    @Override // P.InterfaceC0298j
    public final void g() {
        C0327y c0327y;
        C2731G c2731g = this.f20941k;
        c2731g.f21639z = true;
        C2321G c2321g = this.f20946p;
        Object[] objArr = c2321g.f18930c;
        long[] jArr = c2321g.f18928a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j5 = jArr[i];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j5) < 128 && (c0327y = ((C2614C) objArr[(i << 3) + i6]).f20915c) != null) {
                            c0327y.l();
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        c2731g.Q();
        c2731g.f21639z = false;
        c2321g.a();
        this.f20947q.a();
        this.f20955y = 0;
        this.f20954x = 0;
        this.f20950t.a();
        b();
    }

    @Override // P.InterfaceC0298j
    public final void h() {
        c(true);
    }

    public final C2731G i(Object obj) {
        C2321G c2321g;
        int i;
        if (this.f20954x == 0) {
            return null;
        }
        C2731G c2731g = this.f20941k;
        R.b bVar = (R.b) c2731g.o();
        int i5 = bVar.f5100k.f5108m - this.f20955y;
        int i6 = i5 - this.f20954x;
        int i7 = i5 - 1;
        int i8 = i7;
        while (true) {
            c2321g = this.f20946p;
            if (i8 < i6) {
                i = -1;
                break;
            }
            Object g5 = c2321g.g((C2731G) bVar.get(i8));
            kotlin.jvm.internal.l.c(g5);
            if (((C2614C) g5).f20913a.equals(obj)) {
                i = i8;
                break;
            }
            i8--;
        }
        if (i == -1) {
            while (i7 >= i6) {
                Object g6 = c2321g.g((C2731G) bVar.get(i7));
                kotlin.jvm.internal.l.c(g6);
                C2614C c2614c = (C2614C) g6;
                Object obj2 = c2614c.f20913a;
                if (obj2 == f0.f20995a || this.f20943m.e(obj, obj2)) {
                    c2614c.f20913a = obj;
                    i8 = i7;
                    i = i8;
                    break;
                }
                i7--;
            }
            i8 = i7;
        }
        if (i == -1) {
            return null;
        }
        if (i8 != i6) {
            c2731g.f21639z = true;
            c2731g.M(i8, i6, 1);
            c2731g.f21639z = false;
        }
        this.f20954x--;
        C2731G c2731g2 = (C2731G) bVar.get(i6);
        Object g7 = c2321g.g(c2731g2);
        kotlin.jvm.internal.l.c(g7);
        C2614C c2614c2 = (C2614C) g7;
        c2614c2.f = AbstractC0329z.t(Boolean.TRUE);
        c2614c2.f20917e = true;
        c2614c2.f20916d = true;
        return c2731g2;
    }
}
