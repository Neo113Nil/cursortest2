package W5;

import A1.C0011c;
import a.AbstractC0603a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import n1.C1450e;

/* loaded from: classes2.dex */
public final class h2 implements InterfaceC0546v {

    /* renamed from: d, reason: collision with root package name */
    public static final f2 f7230d = new f2(18);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7231a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7232b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7233c;

    public /* synthetic */ h2(int i7, Object obj, Object obj2) {
        this.f7231a = i7;
        this.f7233c = obj;
        this.f7232b = obj2;
    }

    @Override // W5.InterfaceC0546v
    public void F(U5.l0 l0Var, EnumC0543u enumC0543u, U5.b0 b0Var) {
        boolean z4;
        D3.p pVar;
        F0 f02;
        C0011c c0011c;
        switch (this.f7231a) {
            case 2:
                k1.g gVar = ((C0524n0) this.f7233c).f7294b.f7301b;
                if (l0Var.e()) {
                    ((A0) gVar.f14676c).c();
                } else {
                    ((A0) gVar.f14677d).c();
                }
                ((InterfaceC0546v) this.f7232b).F(l0Var, enumC0543u, b0Var);
                return;
            default:
                synchronized (((F0) this.f7233c).f6785i) {
                    F0 f03 = (F0) this.f7233c;
                    f03.f6790o = f03.f6790o.d((M1) this.f7232b);
                    ((ArrayList) ((F0) this.f7233c).f6789n.f6064b).add(String.valueOf(l0Var.f6547a));
                }
                if (((F0) this.f7233c).f6793r.decrementAndGet() == Integer.MIN_VALUE) {
                    ((F0) this.f7233c).f6779c.execute(new L1(this, 0));
                    return;
                }
                M1 m12 = (M1) this.f7232b;
                if (m12.f6879c) {
                    F0 f04 = (F0) this.f7233c;
                    A1 o7 = f04.o(m12);
                    if (o7 != null) {
                        f04.f6778b.execute(o7);
                    }
                    if (((F0) this.f7233c).f6790o.f6835f == ((M1) this.f7232b)) {
                        ((F0) this.f7233c).u(l0Var, enumC0543u, b0Var);
                        return;
                    }
                    return;
                }
                EnumC0543u enumC0543u2 = EnumC0543u.f7375d;
                if (enumC0543u == enumC0543u2 && ((F0) this.f7233c).f6792q.incrementAndGet() > 1000) {
                    F0 f05 = (F0) this.f7233c;
                    A1 o8 = f05.o((M1) this.f7232b);
                    if (o8 != null) {
                        f05.f6778b.execute(o8);
                    }
                    if (((F0) this.f7233c).f6790o.f6835f == ((M1) this.f7232b)) {
                        ((F0) this.f7233c).u(U5.l0.f6543m.g("Too many transparent retries. Might be a bug in gRPC").f(new U5.n0(l0Var)), enumC0543u, b0Var);
                        return;
                    }
                    return;
                }
                if (((F0) this.f7233c).f6790o.f6835f == null) {
                    if (enumC0543u == enumC0543u2 || (enumC0543u == EnumC0543u.f7373b && ((F0) this.f7233c).f6791p.compareAndSet(false, true))) {
                        M1 p5 = ((F0) this.f7233c).p(((M1) this.f7232b).f6880d, true);
                        if (p5 == null) {
                            return;
                        }
                        F0 f06 = (F0) this.f7233c;
                        if (f06.f6784h) {
                            synchronized (f06.f6785i) {
                                F0 f07 = (F0) this.f7233c;
                                f07.f6790o = f07.f6790o.c((M1) this.f7232b, p5);
                            }
                        }
                        ((F0) this.f7233c).f6778b.execute(new K1(this, p5, 1));
                        return;
                    }
                    if (enumC0543u == EnumC0543u.f7374c) {
                        F0 f08 = (F0) this.f7233c;
                        if (f08.f6784h) {
                            f08.s();
                        }
                    } else {
                        ((F0) this.f7233c).f6791p.set(true);
                        F0 f09 = (F0) this.f7233c;
                        Integer num = null;
                        if (f09.f6784h) {
                            String str = (String) b0Var.c(F0.f6770F);
                            if (str != null) {
                                try {
                                    num = Integer.valueOf(str);
                                } catch (NumberFormatException unused) {
                                    num = -1;
                                }
                            }
                            F0 f010 = (F0) this.f7233c;
                            boolean contains = f010.f6783g.f7205c.contains(l0Var.f6547a);
                            boolean z7 = (f010.f6788m == null || (!contains && (num == null || num.intValue() >= 0))) ? false : !f010.f6788m.a();
                            if (contains && !z7 && !l0Var.e() && num != null && num.intValue() > 0) {
                                num = 0;
                            }
                            boolean z8 = contains && !z7;
                            if (z8) {
                                F0.n((F0) this.f7233c, num);
                            }
                            synchronized (((F0) this.f7233c).f6785i) {
                                try {
                                    F0 f011 = (F0) this.f7233c;
                                    f011.f6790o = f011.f6790o.b((M1) this.f7232b);
                                    if (z8) {
                                        F0 f012 = (F0) this.f7233c;
                                        if (!f012.t(f012.f6790o)) {
                                            if (!((F0) this.f7233c).f6790o.f6833d.isEmpty()) {
                                            }
                                        }
                                        return;
                                    }
                                } finally {
                                }
                            }
                        } else {
                            O1 o12 = f09.f6782f;
                            long j = 0;
                            if (o12 == null) {
                                pVar = new D3.p(0L, false);
                            } else {
                                boolean contains2 = o12.f6900f.contains(l0Var.f6547a);
                                String str2 = (String) b0Var.c(F0.f6770F);
                                if (str2 != null) {
                                    try {
                                        num = Integer.valueOf(str2);
                                    } catch (NumberFormatException unused2) {
                                        num = -1;
                                    }
                                }
                                boolean z9 = (f09.f6788m == null || (!contains2 && (num == null || num.intValue() >= 0))) ? false : !f09.f6788m.a();
                                if (f09.f6782f.f6895a > ((M1) this.f7232b).f6880d + 1 && !z9) {
                                    if (num == null) {
                                        if (contains2) {
                                            j = (long) (F0.f6772H.nextDouble() * f09.f6799x);
                                            double d7 = f09.f6799x;
                                            O1 o13 = f09.f6782f;
                                            f09.f6799x = Math.min((long) (d7 * o13.f6898d), o13.f6897c);
                                            z4 = true;
                                        }
                                    } else if (num.intValue() >= 0) {
                                        j = TimeUnit.MILLISECONDS.toNanos(num.intValue());
                                        f09.f6799x = f09.f6782f.f6896b;
                                        z4 = true;
                                    }
                                    pVar = new D3.p(j, z4);
                                }
                                z4 = false;
                                pVar = new D3.p(j, z4);
                            }
                            if (pVar.f1738b) {
                                M1 p7 = ((F0) this.f7233c).p(((M1) this.f7232b).f6880d + 1, false);
                                if (p7 == null) {
                                    return;
                                }
                                synchronized (((F0) this.f7233c).f6785i) {
                                    f02 = (F0) this.f7233c;
                                    c0011c = new C0011c(f02.f6785i);
                                    f02.f6797v = c0011c;
                                }
                                c0011c.i(f02.f6780d.schedule(new K1(this, p7, 0), pVar.f1739c, TimeUnit.NANOSECONDS));
                                return;
                            }
                        }
                    }
                }
                F0 f013 = (F0) this.f7233c;
                A1 o9 = f013.o((M1) this.f7232b);
                if (o9 != null) {
                    f013.f6778b.execute(o9);
                }
                if (((F0) this.f7233c).f6790o.f6835f == ((M1) this.f7232b)) {
                    ((F0) this.f7233c).u(l0Var, enumC0543u, b0Var);
                    return;
                }
                return;
        }
    }

    @Override // W5.InterfaceC0546v
    public void J(C1450e c1450e) {
        switch (this.f7231a) {
            case 2:
                ((InterfaceC0546v) this.f7232b).J(c1450e);
                break;
            default:
                J1 j12 = ((F0) this.f7233c).f6790o;
                p3.f.q("Headers should be received prior to messages.", j12.f6835f != null);
                if (j12.f6835f == ((M1) this.f7232b)) {
                    ((F0) this.f7233c).f6779c.execute(new E(23, this, c1450e));
                    break;
                } else {
                    Logger logger = AbstractC0494d0.f7163a;
                    while (true) {
                        InputStream w7 = c1450e.w();
                        if (w7 == null) {
                            break;
                        } else {
                            AbstractC0494d0.b(w7);
                        }
                    }
                }
        }
    }

    @Override // W5.InterfaceC0546v
    public void d(U5.b0 b0Var) {
        AtomicInteger atomicInteger;
        int i7;
        int i8;
        switch (this.f7231a) {
            case 2:
                ((InterfaceC0546v) this.f7232b).d(b0Var);
                break;
            default:
                if (((M1) this.f7232b).f6880d > 0) {
                    U5.W w7 = F0.f6769E;
                    b0Var.a(w7);
                    b0Var.f(w7, String.valueOf(((M1) this.f7232b).f6880d));
                }
                F0 f02 = (F0) this.f7233c;
                M1 m12 = (M1) this.f7232b;
                U5.W w8 = F0.f6769E;
                A1 o7 = f02.o(m12);
                if (o7 != null) {
                    f02.f6778b.execute(o7);
                }
                if (((F0) this.f7233c).f6790o.f6835f == ((M1) this.f7232b)) {
                    N1 n12 = ((F0) this.f7233c).f6788m;
                    if (n12 != null) {
                        do {
                            atomicInteger = n12.f6890d;
                            i7 = atomicInteger.get();
                            i8 = n12.f6887a;
                            if (i7 == i8) {
                            }
                        } while (!atomicInteger.compareAndSet(i7, Math.min(n12.f6889c + i7, i8)));
                    }
                    ((F0) this.f7233c).f6779c.execute(new E(22, this, b0Var));
                    break;
                }
                break;
        }
    }

    public String toString() {
        switch (this.f7231a) {
            case 2:
                D3.j u02 = AbstractC0603a.u0(this);
                u02.a((InterfaceC0546v) this.f7232b, "delegate");
                return u02.toString();
            default:
                return super.toString();
        }
    }

    @Override // W5.InterfaceC0546v
    public void u() {
        switch (this.f7231a) {
            case 2:
                ((InterfaceC0546v) this.f7232b).u();
                break;
            default:
                F0 f02 = (F0) this.f7233c;
                if (f02.b()) {
                    f02.f6779c.execute(new L1(this, 1));
                    break;
                }
                break;
        }
    }

    public h2() {
        this.f7231a = 0;
        f2 f2Var = f2.f7216b;
        this.f7233c = Z1.n();
        this.f7232b = f2Var;
    }

    public h2(String str) {
        this.f7231a = 1;
        U5.P a2 = U5.P.a();
        p3.f.k(a2, "registry");
        this.f7232b = a2;
        p3.f.k(str, "defaultPolicy");
        this.f7233c = str;
    }
}
