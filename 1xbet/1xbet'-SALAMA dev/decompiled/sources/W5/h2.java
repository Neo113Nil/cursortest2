package W5;

import A1.C0011c;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class h2 implements InterfaceC0546v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f2 f7230d = new f2(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7233c;

    public /* synthetic */ h2(int i7, Object obj, Object obj2) {
        this.f7231a = i7;
        this.f7233c = obj;
        this.f7232b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0231  */
    @Override // W5.InterfaceC0546v
    public void F(U5.l0 l0Var, EnumC0543u enumC0543u, U5.b0 b0Var) {
        boolean z4;
        D3.p pVar;
        F0 f7;
        C0011c c0011c;
        switch (this.f7231a) {
            case 2:
                p072k1.g gVar = ((C0524n0) this.f7233c).f7294b.f7301b;
                if (l0Var.e()) {
                    ((A0) gVar.f14682c).c();
                } else {
                    ((A0) gVar.f14683d).c();
                }
                ((InterfaceC0546v) this.f7232b).F(l0Var, enumC0543u, b0Var);
                return;
            default:
                synchronized (((F0) this.f7233c).f6785i) {
                    F0 f8 = (F0) this.f7233c;
                    f8.f6790o = f8.f6790o.d((M1) this.f7232b);
                    ((ArrayList) ((F0) this.f7233c).f6789n.f6064b).add(String.valueOf(l0Var.f6547a));
                    break;
                }
                if (((F0) this.f7233c).f6793r.decrementAndGet() == Integer.MIN_VALUE) {
                    ((F0) this.f7233c).f6779c.execute(new L1(this, 0));
                    return;
                }
                M1 m7 = (M1) this.f7232b;
                if (m7.f6879c) {
                    F0 f9 = (F0) this.f7233c;
                    A1 a1O = f9.o(m7);
                    if (a1O != null) {
                        f9.f6778b.execute(a1O);
                    }
                    if (((F0) this.f7233c).f6790o.f6835f == ((M1) this.f7232b)) {
                        ((F0) this.f7233c).u(l0Var, enumC0543u, b0Var);
                        return;
                    }
                    return;
                }
                EnumC0543u enumC0543u2 = EnumC0543u.f7375d;
                if (enumC0543u == enumC0543u2 && ((F0) this.f7233c).f6792q.incrementAndGet() > 1000) {
                    F0 f10 = (F0) this.f7233c;
                    A1 a1O2 = f10.o((M1) this.f7232b);
                    if (a1O2 != null) {
                        f10.f6778b.execute(a1O2);
                    }
                    if (((F0) this.f7233c).f6790o.f6835f == ((M1) this.f7232b)) {
                        ((F0) this.f7233c).u(U5.l0.f6543m.g("Too many transparent retries. Might be a bug in gRPC").f(new U5.n0(l0Var)), enumC0543u, b0Var);
                        return;
                    }
                    return;
                }
                if (((F0) this.f7233c).f6790o.f6835f == null) {
                    if (enumC0543u == enumC0543u2 || (enumC0543u == EnumC0543u.f7373b && ((F0) this.f7233c).f6791p.compareAndSet(false, true))) {
                        M1 m1P = ((F0) this.f7233c).p(((M1) this.f7232b).f6880d, true);
                        if (m1P == null) {
                            return;
                        }
                        F0 f11 = (F0) this.f7233c;
                        if (f11.f6784h) {
                            synchronized (f11.f6785i) {
                                F0 f12 = (F0) this.f7233c;
                                f12.f6790o = f12.f6790o.c((M1) this.f7232b, m1P);
                                break;
                            }
                        }
                        ((F0) this.f7233c).f6778b.execute(new K1(this, m1P, 1));
                        return;
                    }
                    if (enumC0543u != EnumC0543u.f7374c) {
                        ((F0) this.f7233c).f6791p.set(true);
                        F0 f13 = (F0) this.f7233c;
                        Integer numValueOf = null;
                        if (!f13.f6784h) {
                            O1 o7 = f13.f6782f;
                            long nanos = 0;
                            if (o7 == null) {
                                pVar = new D3.p(0L, false);
                            } else {
                                boolean zContains = o7.f6900f.contains(l0Var.f6547a);
                                String str = (String) b0Var.c(F0.f6770F);
                                if (str != null) {
                                    try {
                                        numValueOf = Integer.valueOf(str);
                                    } catch (NumberFormatException unused) {
                                        numValueOf = -1;
                                    }
                                }
                                boolean z7 = (f13.f6788m == null || (!zContains && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !f13.f6788m.a();
                                if (f13.f6782f.f6895a <= ((M1) this.f7232b).f6880d + 1 || z7) {
                                    z4 = false;
                                } else if (numValueOf == null) {
                                    if (zContains) {
                                        nanos = (long) (F0.f6772H.nextDouble() * f13.f6799x);
                                        double d7 = f13.f6799x;
                                        O1 o8 = f13.f6782f;
                                        f13.f6799x = Math.min((long) (d7 * o8.f6898d), o8.f6897c);
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                } else if (numValueOf.intValue() >= 0) {
                                    nanos = TimeUnit.MILLISECONDS.toNanos(numValueOf.intValue());
                                    f13.f6799x = f13.f6782f.f6896b;
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                pVar = new D3.p(nanos, z4);
                            }
                            if (pVar.f1738b) {
                                M1 m1P2 = ((F0) this.f7233c).p(((M1) this.f7232b).f6880d + 1, false);
                                if (m1P2 == null) {
                                    return;
                                }
                                synchronized (((F0) this.f7233c).f6785i) {
                                    f7 = (F0) this.f7233c;
                                    c0011c = new C0011c(f7.f6785i);
                                    f7.f6797v = c0011c;
                                    break;
                                }
                                c0011c.i(f7.f6780d.schedule(new K1(this, m1P2, 0), pVar.f1739c, TimeUnit.NANOSECONDS));
                                return;
                            }
                            break;
                        } else {
                            String str2 = (String) b0Var.c(F0.f6770F);
                            if (str2 != null) {
                                try {
                                    numValueOf = Integer.valueOf(str2);
                                } catch (NumberFormatException unused2) {
                                    numValueOf = -1;
                                }
                            }
                            F0 f14 = (F0) this.f7233c;
                            boolean zContains2 = f14.f6783g.f7205c.contains(l0Var.f6547a);
                            boolean z8 = (f14.f6788m == null || (!zContains2 && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !f14.f6788m.a();
                            if (zContains2 && !z8 && !l0Var.e() && numValueOf != null && numValueOf.intValue() > 0) {
                                numValueOf = 0;
                            }
                            boolean z9 = zContains2 && !z8;
                            if (z9) {
                                F0.n((F0) this.f7233c, numValueOf);
                            }
                            synchronized (((F0) this.f7233c).f6785i) {
                                try {
                                    F0 f15 = (F0) this.f7233c;
                                    f15.f6790o = f15.f6790o.b((M1) this.f7232b);
                                    if (z9) {
                                        F0 f16 = (F0) this.f7233c;
                                        if (!f16.t(f16.f6790o)) {
                                            if (!((F0) this.f7233c).f6790o.f6833d.isEmpty()) {
                                            }
                                        }
                                        return;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } else {
                        F0 f17 = (F0) this.f7233c;
                        if (f17.f6784h) {
                            f17.s();
                        }
                    }
                    break;
                }
                F0 f18 = (F0) this.f7233c;
                A1 a1O3 = f18.o((M1) this.f7232b);
                if (a1O3 != null) {
                    f18.f6778b.execute(a1O3);
                }
                if (((F0) this.f7233c).f6790o.f6835f == ((M1) this.f7232b)) {
                    ((F0) this.f7233c).u(l0Var, enumC0543u, b0Var);
                    return;
                }
                return;
        }
    }

    @Override // W5.InterfaceC0546v
    public void J(p096n1.e eVar) {
        switch (this.f7231a) {
            case 2:
                ((InterfaceC0546v) this.f7232b).J(eVar);
                break;
            default:
                J1 j3 = ((F0) this.f7233c).f6790o;
                p113p3.f.q("Headers should be received prior to messages.", j3.f6835f != null);
                if (j3.f6835f == ((M1) this.f7232b)) {
                    ((F0) this.f7233c).f6779c.execute(new E(23, this, eVar));
                } else {
                    Logger logger = AbstractC0494d0.f7163a;
                    while (true) {
                        InputStream inputStreamW = eVar.w();
                        if (inputStreamW != null) {
                            AbstractC0494d0.b(inputStreamW);
                        }
                    }
                }
                break;
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
                F0 f7 = (F0) this.f7233c;
                M1 m7 = (M1) this.f7232b;
                U5.W w8 = F0.f6769E;
                A1 a1O = f7.o(m7);
                if (a1O != null) {
                    f7.f6778b.execute(a1O);
                }
                if (((F0) this.f7233c).f6790o.f6835f == ((M1) this.f7232b)) {
                    N1 n2 = ((F0) this.f7233c).f6788m;
                    if (n2 != null) {
                        do {
                            atomicInteger = n2.f6890d;
                            i7 = atomicInteger.get();
                            i8 = n2.f6887a;
                            if (i7 == i8) {
                            }
                        } while (!atomicInteger.compareAndSet(i7, Math.min(n2.f6889c + i7, i8)));
                    }
                    ((F0) this.f7233c).f6779c.execute(new E(22, this, b0Var));
                }
                break;
        }
    }

    public String toString() {
        switch (this.f7231a) {
            case 2:
                D3.j jVarU0 = p003a.a.u0(this);
                jVarU0.a((InterfaceC0546v) this.f7232b, "delegate");
                return jVarU0.toString();
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
                F0 f7 = (F0) this.f7233c;
                if (f7.b()) {
                    f7.f6779c.execute(new L1(this, 1));
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
        U5.P pA = U5.P.a();
        p113p3.f.k(pA, "registry");
        this.f7232b = pA;
        p113p3.f.k(str, "defaultPolicy");
        this.f7233c = str;
    }
}
