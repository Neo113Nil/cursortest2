package x;

import a.AbstractC0444a;
import h0.C1988b;
import h0.C1989c;
import h0.C1991e;
import k0.C2023c;
import p4.AbstractC2282w;
import x0.InterfaceC2637x;
import z0.AbstractC2749f;
import z0.InterfaceC2754k;
import z0.InterfaceC2764v;

/* renamed from: x.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2588k extends b0.o implements InterfaceC2764v, InterfaceC2754k {

    /* renamed from: A, reason: collision with root package name */
    public boolean f20790A;

    /* renamed from: C, reason: collision with root package name */
    public InterfaceC2637x f20792C;

    /* renamed from: D, reason: collision with root package name */
    public C1989c f20793D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f20794E;

    /* renamed from: G, reason: collision with root package name */
    public boolean f20796G;

    /* renamed from: y, reason: collision with root package name */
    public P f20797y;

    /* renamed from: z, reason: collision with root package name */
    public final C2604s0 f20798z;

    /* renamed from: B, reason: collision with root package name */
    public final C2023c f20791B = new C2023c(16);

    /* renamed from: F, reason: collision with root package name */
    public long f20795F = 0;

    public C2588k(P p5, C2604s0 c2604s0, boolean z3) {
        this.f20797y = p5;
        this.f20798z = c2604s0;
        this.f20790A = z3;
    }

    public static final float y0(C2588k c2588k, InterfaceC2574d interfaceC2574d) {
        C1989c c1989c;
        int compare;
        if (W0.l.a(c2588k.f20795F, 0L)) {
            return 0.0f;
        }
        R.e eVar = (R.e) c2588k.f20791B.f17544l;
        int i = eVar.f5108m;
        if (i > 0) {
            int i5 = i - 1;
            Object[] objArr = eVar.f5106k;
            c1989c = null;
            while (true) {
                C1989c c1989c2 = (C1989c) ((C2582h) objArr[i5]).f20767a.invoke();
                if (c1989c2 != null) {
                    long b3 = c1989c2.b();
                    long d02 = AbstractC0444a.d0(c2588k.f20795F);
                    int ordinal = c2588k.f20797y.ordinal();
                    if (ordinal == 0) {
                        compare = Float.compare(C1991e.b(b3), C1991e.b(d02));
                    } else {
                        if (ordinal != 1) {
                            throw new D2.e();
                        }
                        compare = Float.compare(C1991e.d(b3), C1991e.d(d02));
                    }
                    if (compare <= 0) {
                        c1989c = c1989c2;
                    } else if (c1989c == null) {
                        c1989c = c1989c2;
                    }
                }
                i5--;
                if (i5 < 0) {
                    break;
                }
            }
        } else {
            c1989c = null;
        }
        if (c1989c == null) {
            C1989c z02 = c2588k.f20794E ? c2588k.z0() : null;
            if (z02 == null) {
                return 0.0f;
            }
            c1989c = z02;
        }
        long d03 = AbstractC0444a.d0(c2588k.f20795F);
        int ordinal2 = c2588k.f20797y.ordinal();
        if (ordinal2 == 0) {
            float f = c1989c.f17196d;
            float f5 = c1989c.f17194b;
            return interfaceC2574d.a(f5, f - f5, C1991e.b(d03));
        }
        if (ordinal2 != 1) {
            throw new D2.e();
        }
        float f6 = c1989c.f17195c;
        float f7 = c1989c.f17193a;
        return interfaceC2574d.a(f7, f6 - f7, C1991e.d(d03));
    }

    public final boolean A0(C1989c c1989c, long j5) {
        long C02 = C0(c1989c, j5);
        return Math.abs(C1988b.d(C02)) <= 0.5f && Math.abs(C1988b.e(C02)) <= 0.5f;
    }

    public final void B0() {
        InterfaceC2574d interfaceC2574d = (InterfaceC2574d) AbstractC2749f.i(this, AbstractC2580g.f20763a);
        if (this.f20796G) {
            throw new IllegalStateException("launchAnimation called when previous animation was running");
        }
        AbstractC2282w.p(k0(), null, new C2586j(this, new S0(interfaceC2574d.b()), interfaceC2574d, null), 1);
    }

    public final long C0(C1989c c1989c, long j5) {
        long d02 = AbstractC0444a.d0(j5);
        int ordinal = this.f20797y.ordinal();
        if (ordinal == 0) {
            InterfaceC2574d interfaceC2574d = (InterfaceC2574d) AbstractC2749f.i(this, AbstractC2580g.f20763a);
            float f = c1989c.f17196d;
            float f5 = c1989c.f17194b;
            return G4.d.d(0.0f, interfaceC2574d.a(f5, f - f5, C1991e.b(d02)));
        }
        if (ordinal != 1) {
            throw new D2.e();
        }
        InterfaceC2574d interfaceC2574d2 = (InterfaceC2574d) AbstractC2749f.i(this, AbstractC2580g.f20763a);
        float f6 = c1989c.f17195c;
        float f7 = c1989c.f17193a;
        return G4.d.d(interfaceC2574d2.a(f7, f6 - f7, C1991e.d(d02)), 0.0f);
    }

    @Override // b0.o
    public final boolean l0() {
        return false;
    }

    @Override // z0.InterfaceC2764v
    public final void s(long j5) {
        int g5;
        C1989c z02;
        long j6 = this.f20795F;
        this.f20795F = j5;
        int ordinal = this.f20797y.ordinal();
        if (ordinal == 0) {
            g5 = kotlin.jvm.internal.l.g((int) (j5 & 4294967295L), (int) (4294967295L & j6));
        } else {
            if (ordinal != 1) {
                throw new D2.e();
            }
            g5 = kotlin.jvm.internal.l.g((int) (j5 >> 32), (int) (j6 >> 32));
        }
        if (g5 < 0 && (z02 = z0()) != null) {
            C1989c c1989c = this.f20793D;
            if (c1989c == null) {
                c1989c = z02;
            }
            if (!this.f20796G && !this.f20794E && A0(c1989c, j6) && !A0(z02, j5)) {
                this.f20794E = true;
                B0();
            }
            this.f20793D = z02;
        }
    }

    @Override // z0.InterfaceC2764v
    public final /* synthetic */ void u(InterfaceC2637x interfaceC2637x) {
    }

    public final C1989c z0() {
        if (this.f7175x) {
            z0.e0 u5 = AbstractC2749f.u(this);
            InterfaceC2637x interfaceC2637x = this.f20792C;
            if (interfaceC2637x != null) {
                if (!interfaceC2637x.F()) {
                    interfaceC2637x = null;
                }
                if (interfaceC2637x != null) {
                    return u5.s(interfaceC2637x, false);
                }
            }
        }
        return null;
    }
}
