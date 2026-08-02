package I;

import com.google.android.gms.internal.ads.AbstractC1674uy;
import com.google.android.gms.internal.ads.C0794bC;
import com.google.android.gms.internal.ads.GB;
import com.google.android.gms.internal.ads.InterfaceC1554sC;
import com.google.android.gms.internal.ads.MB;
import com.google.android.gms.internal.ads.NB;
import com.google.android.gms.internal.ads.UB;
import com.google.android.gms.internal.ads.VB;
import com.google.android.gms.internal.ads.WB;
import com.google.android.gms.internal.ads.XB;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import n.AbstractC2107A;

/* renamed from: I.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2497a;

    /* renamed from: b, reason: collision with root package name */
    public int f2498b;

    /* renamed from: c, reason: collision with root package name */
    public int f2499c;

    /* renamed from: d, reason: collision with root package name */
    public int f2500d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2501e;

    public /* synthetic */ C0160m(int i) {
        this.f2497a = i;
    }

    public static final void w(int i) {
        if ((i & 3) != 0) {
            throw new XB("Failed to parse the message.");
        }
    }

    public static final void x(int i) {
        if ((i & 7) != 0) {
            throw new XB("Failed to parse the message.");
        }
    }

    public void A(UB ub) {
        int w5;
        int i = this.f2498b & 7;
        AbstractC1674uy abstractC1674uy = (AbstractC1674uy) this.f2501e;
        if (i == 0) {
            do {
                ub.add(Boolean.valueOf(abstractC1674uy.g()));
                if (abstractC1674uy.f()) {
                    return;
                } else {
                    w5 = abstractC1674uy.w();
                }
            } while (w5 == this.f2498b);
            this.f2500d = w5;
            return;
        }
        if (i != 2) {
            throw new WB();
        }
        int o5 = abstractC1674uy.o() + abstractC1674uy.x();
        do {
            ub.add(Boolean.valueOf(abstractC1674uy.g()));
        } while (abstractC1674uy.o() < o5);
        u(o5);
    }

    public void B(UB ub) {
        int w5;
        if ((this.f2498b & 7) != 2) {
            throw new WB();
        }
        do {
            v(2);
            AbstractC1674uy abstractC1674uy = (AbstractC1674uy) this.f2501e;
            ub.add(abstractC1674uy.D());
            if (abstractC1674uy.f()) {
                return;
            } else {
                w5 = abstractC1674uy.w();
            }
        } while (w5 == this.f2498b);
        this.f2500d = w5;
    }

    public void C(UB ub) {
        int w5;
        int i = this.f2498b & 7;
        AbstractC1674uy abstractC1674uy = (AbstractC1674uy) this.f2501e;
        if (i == 1) {
            do {
                ub.add(Double.valueOf(abstractC1674uy.k()));
                if (abstractC1674uy.f()) {
                    return;
                } else {
                    w5 = abstractC1674uy.w();
                }
            } while (w5 == this.f2498b);
            this.f2500d = w5;
            return;
        }
        if (i != 2) {
            throw new WB();
        }
        int x5 = abstractC1674uy.x();
        x(x5);
        int o5 = abstractC1674uy.o() + x5;
        do {
            ub.add(Double.valueOf(abstractC1674uy.k()));
        } while (abstractC1674uy.o() < o5);
    }

    public void D(UB ub) {
        int w5;
        int i;
        boolean z3 = ub instanceof NB;
        AbstractC1674uy abstractC1674uy = (AbstractC1674uy) this.f2501e;
        if (z3) {
            NB nb = (NB) ub;
            int i5 = this.f2498b & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw new WB();
                }
                int o5 = abstractC1674uy.o() + abstractC1674uy.x();
                do {
                    nb.f(abstractC1674uy.r());
                } while (abstractC1674uy.o() < o5);
                u(o5);
                return;
            }
            do {
                nb.f(abstractC1674uy.r());
                if (abstractC1674uy.f()) {
                    return;
                } else {
                    i = abstractC1674uy.w();
                }
            } while (i == this.f2498b);
        } else {
            int i6 = this.f2498b & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new WB();
                }
                int o6 = abstractC1674uy.o() + abstractC1674uy.x();
                do {
                    ub.add(Integer.valueOf(abstractC1674uy.r()));
                } while (abstractC1674uy.o() < o6);
                u(o6);
                return;
            }
            do {
                ub.add(Integer.valueOf(abstractC1674uy.r()));
                if (abstractC1674uy.f()) {
                    return;
                } else {
                    w5 = abstractC1674uy.w();
                }
            } while (w5 == this.f2498b);
            i = w5;
        }
        this.f2500d = i;
    }

    public void E(UB ub) {
        int w5;
        int i;
        boolean z3 = ub instanceof NB;
        AbstractC1674uy abstractC1674uy = (AbstractC1674uy) this.f2501e;
        if (z3) {
            NB nb = (NB) ub;
            int i5 = this.f2498b & 7;
            if (i5 == 2) {
                int x5 = abstractC1674uy.x();
                w(x5);
                int o5 = abstractC1674uy.o() + x5;
                do {
                    nb.f(abstractC1674uy.s());
                } while (abstractC1674uy.o() < o5);
                return;
            }
            if (i5 != 5) {
                throw new WB();
            }
            do {
                nb.f(abstractC1674uy.s());
                if (abstractC1674uy.f()) {
                    return;
                } else {
                    i = abstractC1674uy.w();
                }
            } while (i == this.f2498b);
        } else {
            int i6 = this.f2498b & 7;
            if (i6 == 2) {
                int x6 = abstractC1674uy.x();
                w(x6);
                int o6 = abstractC1674uy.o() + x6;
                do {
                    ub.add(Integer.valueOf(abstractC1674uy.s()));
                } while (abstractC1674uy.o() < o6);
                return;
            }
            if (i6 != 5) {
                throw new WB();
            }
            do {
                ub.add(Integer.valueOf(abstractC1674uy.s()));
                if (abstractC1674uy.f()) {
                    return;
                } else {
                    w5 = abstractC1674uy.w();
                }
            } while (w5 == this.f2498b);
            i = w5;
        }
        this.f2500d = i;
    }

    public void a(int i) {
        int[] iArr = (int[]) this.f2501e;
        int i5 = this.f2499c;
        iArr[i5] = i;
        int i6 = this.f2500d & (i5 + 1);
        this.f2499c = i6;
        int i7 = this.f2498b;
        if (i6 == i7) {
            int length = iArr.length;
            int i8 = length - i7;
            int i9 = length << 1;
            if (i9 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i9];
            X3.l.s0(0, i7, length, iArr, iArr2);
            X3.l.s0(i8, 0, this.f2498b, (int[]) this.f2501e, iArr2);
            this.f2501e = iArr2;
            this.f2498b = 0;
            this.f2499c = length;
            this.f2500d = i9 - 1;
        }
    }

    public C0161n b(int i) {
        return new C0161n(G4.d.A((K0.L) this.f2501e, i), i, 1L);
    }

    public int c() {
        return this.f2500d - this.f2499c;
    }

    public int d(int i) {
        return ((Q.K) this.f2501e).f4811h[this.f2499c + i];
    }

    public Object e(int i) {
        return ((Q.K) this.f2501e).f4812j[this.f2500d + i];
    }

    public void f(UB ub) {
        int w5;
        int i;
        boolean z3 = ub instanceof C0794bC;
        AbstractC1674uy abstractC1674uy = (AbstractC1674uy) this.f2501e;
        if (z3) {
            C0794bC c0794bC = (C0794bC) ub;
            int i5 = this.f2498b & 7;
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new WB();
                }
                int x5 = abstractC1674uy.x();
                x(x5);
                int o5 = abstractC1674uy.o() + x5;
                do {
                    c0794bC.f(abstractC1674uy.y());
                } while (abstractC1674uy.o() < o5);
                return;
            }
            do {
                c0794bC.f(abstractC1674uy.y());
                if (abstractC1674uy.f()) {
                    return;
                } else {
                    i = abstractC1674uy.w();
                }
            } while (i == this.f2498b);
        } else {
            int i6 = this.f2498b & 7;
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new WB();
                }
                int x6 = abstractC1674uy.x();
                x(x6);
                int o6 = abstractC1674uy.o() + x6;
                do {
                    ub.add(Long.valueOf(abstractC1674uy.y()));
                } while (abstractC1674uy.o() < o6);
                return;
            }
            do {
                ub.add(Long.valueOf(abstractC1674uy.y()));
                if (abstractC1674uy.f()) {
                    return;
                } else {
                    w5 = abstractC1674uy.w();
                }
            } while (w5 == this.f2498b);
            i = w5;
        }
        this.f2500d = i;
    }

    public void g(UB ub) {
        int w5;
        int i = this.f2498b & 7;
        AbstractC1674uy abstractC1674uy = (AbstractC1674uy) this.f2501e;
        if (i == 2) {
            int x5 = abstractC1674uy.x();
            w(x5);
            int o5 = abstractC1674uy.o() + x5;
            do {
                ub.add(Float.valueOf(abstractC1674uy.m()));
            } while (abstractC1674uy.o() < o5);
            return;
        }
        if (i != 5) {
            throw new WB();
        }
        do {
            ub.add(Float.valueOf(abstractC1674uy.m()));
            if (abstractC1674uy.f()) {
                return;
            } else {
                w5 = abstractC1674uy.w();
            }
        } while (w5 == this.f2498b);
        this.f2500d = w5;
    }

    public void h(UB ub, InterfaceC1554sC interfaceC1554sC, GB gb) {
        int w5;
        int i = this.f2498b;
        if ((i & 7) != 3) {
            throw new WB();
        }
        do {
            MB b3 = interfaceC1554sC.b();
            s(b3, interfaceC1554sC, gb);
            interfaceC1554sC.a(b3);
            ub.add(b3);
            AbstractC1674uy abstractC1674uy = (AbstractC1674uy) this.f2501e;
            if (abstractC1674uy.f() || this.f2500d != 0) {
                return;
            } else {
                w5 = abstractC1674uy.w();
            }
        } while (w5 == i);
        this.f2500d = w5;
    }

    public void i(UB ub) {
        int w5;
        int i;
        boolean z3 = ub instanceof NB;
        AbstractC1674uy abstractC1674uy = (AbstractC1674uy) this.f2501e;
        if (z3) {
            NB nb = (NB) ub;
            int i5 = this.f2498b & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw new WB();
                }
                int o5 = abstractC1674uy.o() + abstractC1674uy.x();
                do {
                    nb.f(abstractC1674uy.t());
                } while (abstractC1674uy.o() < o5);
                u(o5);
                return;
            }
            do {
                nb.f(abstractC1674uy.t());
                if (abstractC1674uy.f()) {
                    return;
                } else {
                    i = abstractC1674uy.w();
                }
            } while (i == this.f2498b);
        } else {
            int i6 = this.f2498b & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new WB();
                }
                int o6 = abstractC1674uy.o() + abstractC1674uy.x();
                do {
                    ub.add(Integer.valueOf(abstractC1674uy.t()));
                } while (abstractC1674uy.o() < o6);
                u(o6);
                return;
            }
            do {
                ub.add(Integer.valueOf(abstractC1674uy.t()));
                if (abstractC1674uy.f()) {
                    return;
                } else {
                    w5 = abstractC1674uy.w();
                }
            } while (w5 == this.f2498b);
            i = w5;
        }
        this.f2500d = i;
    }

    public void j(UB ub) {
        int w5;
        int i;
        boolean z3 = ub instanceof C0794bC;
        AbstractC1674uy abstractC1674uy = (AbstractC1674uy) this.f2501e;
        if (z3) {
            C0794bC c0794bC = (C0794bC) ub;
            int i5 = this.f2498b & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw new WB();
                }
                int o5 = abstractC1674uy.o() + abstractC1674uy.x();
                do {
                    c0794bC.f(abstractC1674uy.z());
                } while (abstractC1674uy.o() < o5);
                u(o5);
                return;
            }
            do {
                c0794bC.f(abstractC1674uy.z());
                if (abstractC1674uy.f()) {
                    return;
                } else {
                    i = abstractC1674uy.w();
                }
            } while (i == this.f2498b);
        } else {
            int i6 = this.f2498b & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new WB();
                }
                int o6 = abstractC1674uy.o() + abstractC1674uy.x();
                do {
                    ub.add(Long.valueOf(abstractC1674uy.z()));
                } while (abstractC1674uy.o() < o6);
                u(o6);
                return;
            }
            do {
                ub.add(Long.valueOf(abstractC1674uy.z()));
                if (abstractC1674uy.f()) {
                    return;
                } else {
                    w5 = abstractC1674uy.w();
                }
            } while (w5 == this.f2498b);
            i = w5;
        }
        this.f2500d = i;
    }

    public void k(UB ub, InterfaceC1554sC interfaceC1554sC, GB gb) {
        int w5;
        int i = this.f2498b;
        if ((i & 7) != 2) {
            throw new WB();
        }
        do {
            MB b3 = interfaceC1554sC.b();
            t(b3, interfaceC1554sC, gb);
            interfaceC1554sC.a(b3);
            ub.add(b3);
            AbstractC1674uy abstractC1674uy = (AbstractC1674uy) this.f2501e;
            if (abstractC1674uy.f() || this.f2500d != 0) {
                return;
            } else {
                w5 = abstractC1674uy.w();
            }
        } while (w5 == i);
        this.f2500d = w5;
    }

    public void l(UB ub) {
        int w5;
        int i;
        boolean z3 = ub instanceof NB;
        AbstractC1674uy abstractC1674uy = (AbstractC1674uy) this.f2501e;
        if (z3) {
            NB nb = (NB) ub;
            int i5 = this.f2498b & 7;
            if (i5 == 2) {
                int x5 = abstractC1674uy.x();
                w(x5);
                int o5 = abstractC1674uy.o() + x5;
                do {
                    nb.f(abstractC1674uy.u());
                } while (abstractC1674uy.o() < o5);
                return;
            }
            if (i5 != 5) {
                throw new WB();
            }
            do {
                nb.f(abstractC1674uy.u());
                if (abstractC1674uy.f()) {
                    return;
                } else {
                    i = abstractC1674uy.w();
                }
            } while (i == this.f2498b);
        } else {
            int i6 = this.f2498b & 7;
            if (i6 == 2) {
                int x6 = abstractC1674uy.x();
                w(x6);
                int o6 = abstractC1674uy.o() + x6;
                do {
                    ub.add(Integer.valueOf(abstractC1674uy.u()));
                } while (abstractC1674uy.o() < o6);
                return;
            }
            if (i6 != 5) {
                throw new WB();
            }
            do {
                ub.add(Integer.valueOf(abstractC1674uy.u()));
                if (abstractC1674uy.f()) {
                    return;
                } else {
                    w5 = abstractC1674uy.w();
                }
            } while (w5 == this.f2498b);
            i = w5;
        }
        this.f2500d = i;
    }

    public void m(UB ub) {
        int w5;
        int i;
        boolean z3 = ub instanceof C0794bC;
        AbstractC1674uy abstractC1674uy = (AbstractC1674uy) this.f2501e;
        if (z3) {
            C0794bC c0794bC = (C0794bC) ub;
            int i5 = this.f2498b & 7;
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new WB();
                }
                int x5 = abstractC1674uy.x();
                x(x5);
                int o5 = abstractC1674uy.o() + x5;
                do {
                    c0794bC.f(abstractC1674uy.A());
                } while (abstractC1674uy.o() < o5);
                return;
            }
            do {
                c0794bC.f(abstractC1674uy.A());
                if (abstractC1674uy.f()) {
                    return;
                } else {
                    i = abstractC1674uy.w();
                }
            } while (i == this.f2498b);
        } else {
            int i6 = this.f2498b & 7;
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new WB();
                }
                int x6 = abstractC1674uy.x();
                x(x6);
                int o6 = abstractC1674uy.o() + x6;
                do {
                    ub.add(Long.valueOf(abstractC1674uy.A()));
                } while (abstractC1674uy.o() < o6);
                return;
            }
            do {
                ub.add(Long.valueOf(abstractC1674uy.A()));
                if (abstractC1674uy.f()) {
                    return;
                } else {
                    w5 = abstractC1674uy.w();
                }
            } while (w5 == this.f2498b);
            i = w5;
        }
        this.f2500d = i;
    }

    public void n(UB ub) {
        int w5;
        int i;
        boolean z3 = ub instanceof NB;
        AbstractC1674uy abstractC1674uy = (AbstractC1674uy) this.f2501e;
        if (z3) {
            NB nb = (NB) ub;
            int i5 = this.f2498b & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw new WB();
                }
                int o5 = abstractC1674uy.o() + abstractC1674uy.x();
                do {
                    nb.f(abstractC1674uy.v());
                } while (abstractC1674uy.o() < o5);
                u(o5);
                return;
            }
            do {
                nb.f(abstractC1674uy.v());
                if (abstractC1674uy.f()) {
                    return;
                } else {
                    i = abstractC1674uy.w();
                }
            } while (i == this.f2498b);
        } else {
            int i6 = this.f2498b & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new WB();
                }
                int o6 = abstractC1674uy.o() + abstractC1674uy.x();
                do {
                    ub.add(Integer.valueOf(abstractC1674uy.v()));
                } while (abstractC1674uy.o() < o6);
                u(o6);
                return;
            }
            do {
                ub.add(Integer.valueOf(abstractC1674uy.v()));
                if (abstractC1674uy.f()) {
                    return;
                } else {
                    w5 = abstractC1674uy.w();
                }
            } while (w5 == this.f2498b);
            i = w5;
        }
        this.f2500d = i;
    }

    public void o(UB ub) {
        int w5;
        int i;
        boolean z3 = ub instanceof C0794bC;
        AbstractC1674uy abstractC1674uy = (AbstractC1674uy) this.f2501e;
        if (z3) {
            C0794bC c0794bC = (C0794bC) ub;
            int i5 = this.f2498b & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw new WB();
                }
                int o5 = abstractC1674uy.o() + abstractC1674uy.x();
                do {
                    c0794bC.f(abstractC1674uy.B());
                } while (abstractC1674uy.o() < o5);
                u(o5);
                return;
            }
            do {
                c0794bC.f(abstractC1674uy.B());
                if (abstractC1674uy.f()) {
                    return;
                } else {
                    i = abstractC1674uy.w();
                }
            } while (i == this.f2498b);
        } else {
            int i6 = this.f2498b & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new WB();
                }
                int o6 = abstractC1674uy.o() + abstractC1674uy.x();
                do {
                    ub.add(Long.valueOf(abstractC1674uy.B()));
                } while (abstractC1674uy.o() < o6);
                u(o6);
                return;
            }
            do {
                ub.add(Long.valueOf(abstractC1674uy.B()));
                if (abstractC1674uy.f()) {
                    return;
                } else {
                    w5 = abstractC1674uy.w();
                }
            } while (w5 == this.f2498b);
            i = w5;
        }
        this.f2500d = i;
    }

    public void p(UB ub, boolean z3) {
        String E5;
        int w5;
        if ((this.f2498b & 7) != 2) {
            throw new WB();
        }
        do {
            AbstractC1674uy abstractC1674uy = (AbstractC1674uy) this.f2501e;
            if (z3) {
                v(2);
                E5 = abstractC1674uy.F();
            } else {
                v(2);
                E5 = abstractC1674uy.E();
            }
            ub.add(E5);
            if (abstractC1674uy.f()) {
                return;
            } else {
                w5 = abstractC1674uy.w();
            }
        } while (w5 == this.f2498b);
        this.f2500d = w5;
    }

    public void q(UB ub) {
        int w5;
        int i;
        boolean z3 = ub instanceof NB;
        AbstractC1674uy abstractC1674uy = (AbstractC1674uy) this.f2501e;
        if (z3) {
            NB nb = (NB) ub;
            int i5 = this.f2498b & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw new WB();
                }
                int o5 = abstractC1674uy.o() + abstractC1674uy.x();
                do {
                    nb.f(abstractC1674uy.x());
                } while (abstractC1674uy.o() < o5);
                u(o5);
                return;
            }
            do {
                nb.f(abstractC1674uy.x());
                if (abstractC1674uy.f()) {
                    return;
                } else {
                    i = abstractC1674uy.w();
                }
            } while (i == this.f2498b);
        } else {
            int i6 = this.f2498b & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new WB();
                }
                int o6 = abstractC1674uy.o() + abstractC1674uy.x();
                do {
                    ub.add(Integer.valueOf(abstractC1674uy.x()));
                } while (abstractC1674uy.o() < o6);
                u(o6);
                return;
            }
            do {
                ub.add(Integer.valueOf(abstractC1674uy.x()));
                if (abstractC1674uy.f()) {
                    return;
                } else {
                    w5 = abstractC1674uy.w();
                }
            } while (w5 == this.f2498b);
            i = w5;
        }
        this.f2500d = i;
    }

    public void r(UB ub) {
        int w5;
        int i;
        boolean z3 = ub instanceof C0794bC;
        AbstractC1674uy abstractC1674uy = (AbstractC1674uy) this.f2501e;
        if (z3) {
            C0794bC c0794bC = (C0794bC) ub;
            int i5 = this.f2498b & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw new WB();
                }
                int o5 = abstractC1674uy.o() + abstractC1674uy.x();
                do {
                    c0794bC.f(abstractC1674uy.C());
                } while (abstractC1674uy.o() < o5);
                u(o5);
                return;
            }
            do {
                c0794bC.f(abstractC1674uy.C());
                if (abstractC1674uy.f()) {
                    return;
                } else {
                    i = abstractC1674uy.w();
                }
            } while (i == this.f2498b);
        } else {
            int i6 = this.f2498b & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new WB();
                }
                int o6 = abstractC1674uy.o() + abstractC1674uy.x();
                do {
                    ub.add(Long.valueOf(abstractC1674uy.C()));
                } while (abstractC1674uy.o() < o6);
                u(o6);
                return;
            }
            do {
                ub.add(Long.valueOf(abstractC1674uy.C()));
                if (abstractC1674uy.f()) {
                    return;
                } else {
                    w5 = abstractC1674uy.w();
                }
            } while (w5 == this.f2498b);
            i = w5;
        }
        this.f2500d = i;
    }

    public void s(Object obj, InterfaceC1554sC interfaceC1554sC, GB gb) {
        int i = this.f2499c;
        this.f2499c = ((this.f2498b >>> 3) << 3) | 4;
        try {
            interfaceC1554sC.h(obj, this, gb);
            if (this.f2498b == this.f2499c) {
            } else {
                throw new XB("Failed to parse the message.");
            }
        } finally {
            this.f2499c = i;
        }
    }

    public void t(Object obj, InterfaceC1554sC interfaceC1554sC, GB gb) {
        AbstractC1674uy abstractC1674uy = (AbstractC1674uy) this.f2501e;
        int x5 = abstractC1674uy.x();
        if (abstractC1674uy.f15938k >= 100) {
            throw new XB("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int q5 = abstractC1674uy.q(x5);
        abstractC1674uy.f15938k++;
        interfaceC1554sC.h(obj, this, gb);
        abstractC1674uy.G();
        abstractC1674uy.f15938k--;
        abstractC1674uy.H(q5);
    }

    public String toString() {
        switch (this.f2497a) {
            case 0:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i = this.f2498b;
                sb.append(i);
                sb.append('-');
                K0.L l5 = (K0.L) this.f2501e;
                sb.append(G4.d.A(l5, i));
                sb.append(',');
                int i5 = this.f2499c;
                sb.append(i5);
                sb.append('-');
                sb.append(G4.d.A(l5, i5));
                sb.append("), prevOffset=");
                return AbstractC2107A.t(sb, this.f2500d, ')');
            case 1:
                return "";
            default:
                return super.toString();
        }
    }

    public void u(int i) {
        if (((AbstractC1674uy) this.f2501e).o() != i) {
            throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public void v(int i) {
        if ((this.f2498b & 7) != i) {
            throw new WB();
        }
    }

    public long y() {
        int i = this.f2499c;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int i5 = this.f2498b;
        long j5 = ((long[]) this.f2501e)[i5];
        this.f2498b = (i5 + 1) & this.f2500d;
        this.f2499c = i - 1;
        return j5;
    }

    public int z() {
        int i = this.f2500d;
        if (i != 0) {
            this.f2498b = i;
            this.f2500d = 0;
        } else {
            i = ((AbstractC1674uy) this.f2501e).w();
            this.f2498b = i;
        }
        if (i == 0 || i == this.f2499c) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    public C0160m(AbstractC1674uy abstractC1674uy) {
        this.f2497a = 4;
        this.f2500d = 0;
        Charset charset = VB.f11871a;
        if (abstractC1674uy == null) {
            throw new NullPointerException("input");
        }
        this.f2501e = abstractC1674uy;
        abstractC1674uy.f15939l = this;
    }

    public C0160m() {
        this.f2497a = 5;
        int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f2500d = highestOneBit - 1;
        this.f2501e = new int[highestOneBit];
    }

    public C0160m(Q.K k5) {
        this.f2497a = 2;
        this.f2501e = k5;
    }

    public C0160m(int i, int i5, int i6, K0.L l5) {
        this.f2497a = 0;
        this.f2498b = i;
        this.f2499c = i5;
        this.f2500d = i6;
        this.f2501e = l5;
    }
}
