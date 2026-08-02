package v;

import P.C0305m0;
import a.AbstractC0444a;
import a3.AbstractC0467k;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import h0.C1988b;
import h0.C1991e;
import k4.AbstractC2036a;
import r0.AbstractC2346c;
import x.C2601q0;
import x.C2604s0;

/* renamed from: v.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2518m implements k0 {

    /* renamed from: k, reason: collision with root package name */
    public C1988b f20266k;

    /* renamed from: l, reason: collision with root package name */
    public final I f20267l;

    /* renamed from: m, reason: collision with root package name */
    public final C0305m0 f20268m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f20269n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f20270o;

    /* renamed from: p, reason: collision with root package name */
    public long f20271p;

    /* renamed from: q, reason: collision with root package name */
    public t0.r f20272q;

    /* renamed from: r, reason: collision with root package name */
    public final b0.p f20273r;

    public C2518m(Context context, i0 i0Var) {
        I i = new I(context, i0.F.u(i0Var.f20252a));
        this.f20267l = i;
        W3.o oVar = W3.o.f6046a;
        this.f20268m = new C0305m0(oVar, P.Z.f4431m);
        this.f20269n = true;
        this.f20271p = 0L;
        this.f20273r = AbstractC0467k.d(new SuspendPointerInputElement(oVar, null, new t0.z(new C2517l(this, null)), 6), Build.VERSION.SDK_INT >= 31 ? new H(this, i) : new H(this, i, i0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0253 A[ADDED_TO_REGION] */
    @Override // v.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j5, int i, t0.F f) {
        float h3;
        float j6;
        long d5;
        boolean z3;
        boolean z5;
        EdgeEffect b3;
        EdgeEffect e3;
        EdgeEffect d6;
        boolean z6;
        boolean z7;
        if (C1991e.e(this.f20271p)) {
            f.getClass();
            C2604s0 c2604s0 = (C2604s0) f.f19446m;
            return new C1988b(C2604s0.a(c2604s0, c2604s0.f20869h, j5, c2604s0.f20868g)).f17191a;
        }
        boolean z8 = this.f20270o;
        boolean z9 = true;
        I i5 = this.f20267l;
        if (!z8) {
            if (I.g(i5.f)) {
                i(0L);
            }
            if (I.g(i5.f20158g)) {
                j(0L);
            }
            if (I.g(i5.f20156d)) {
                k(0L);
            }
            if (I.g(i5.f20157e)) {
                h(0L);
            }
            this.f20270o = true;
        }
        if (C1988b.e(j5) != 0.0f) {
            if (I.g(i5.f20156d)) {
                h3 = k(j5);
                if (!I.g(i5.f20156d)) {
                    i5.e().onRelease();
                }
            } else if (I.g(i5.f20157e)) {
                h3 = h(j5);
                if (!I.g(i5.f20157e)) {
                    i5.b().onRelease();
                }
            }
            if (C1988b.d(j5) != 0.0f) {
                if (I.g(i5.f)) {
                    j6 = i(j5);
                    if (!I.g(i5.f)) {
                        i5.c().onRelease();
                    }
                } else if (I.g(i5.f20158g)) {
                    j6 = j(j5);
                    if (!I.g(i5.f20158g)) {
                        i5.d().onRelease();
                    }
                }
                d5 = G4.d.d(j6, h3);
                if (!C1988b.b(d5, 0L)) {
                    g();
                }
                long g5 = C1988b.g(j5, d5);
                f.getClass();
                C2604s0 c2604s02 = (C2604s0) f.f19446m;
                long j7 = new C1988b(C2604s0.a(c2604s02, c2604s02.f20869h, g5, c2604s02.f20868g)).f17191a;
                long g6 = C1988b.g(g5, j7);
                if (i == 1) {
                    if (C1988b.d(g6) > 0.5f) {
                        i(g6);
                    } else {
                        if (C1988b.d(g6) >= -0.5f) {
                            z6 = false;
                            if (C1988b.e(g6) <= 0.5f) {
                                k(g6);
                            } else if (C1988b.e(g6) < -0.5f) {
                                h(g6);
                            } else {
                                z7 = false;
                                if (!z6 || z7) {
                                    z3 = true;
                                    if (I.f(i5.f) || C1988b.d(j5) >= 0.0f) {
                                        z5 = false;
                                    } else {
                                        EdgeEffect c5 = i5.c();
                                        float d7 = C1988b.d(j5);
                                        if (c5 instanceof S) {
                                            S s2 = (S) c5;
                                            float f5 = s2.f20182b + d7;
                                            s2.f20182b = f5;
                                            if (Math.abs(f5) > s2.f20181a) {
                                                s2.onRelease();
                                            }
                                        } else {
                                            c5.onRelease();
                                        }
                                        z5 = !I.f(i5.f);
                                    }
                                    if (I.f(i5.f20158g) && C1988b.d(j5) > 0.0f) {
                                        d6 = i5.d();
                                        float d8 = C1988b.d(j5);
                                        if (d6 instanceof S) {
                                            d6.onRelease();
                                        } else {
                                            S s5 = (S) d6;
                                            float f6 = s5.f20182b + d8;
                                            s5.f20182b = f6;
                                            if (Math.abs(f6) > s5.f20181a) {
                                                s5.onRelease();
                                            }
                                        }
                                        z5 = (z5 && I.f(i5.f20158g)) ? false : true;
                                    }
                                    if (I.f(i5.f20156d) && C1988b.e(j5) < 0.0f) {
                                        e3 = i5.e();
                                        float e5 = C1988b.e(j5);
                                        if (e3 instanceof S) {
                                            e3.onRelease();
                                        } else {
                                            S s6 = (S) e3;
                                            float f7 = s6.f20182b + e5;
                                            s6.f20182b = f7;
                                            if (Math.abs(f7) > s6.f20181a) {
                                                s6.onRelease();
                                            }
                                        }
                                        z5 = (z5 && I.f(i5.f20156d)) ? false : true;
                                    }
                                    if (I.f(i5.f20157e) && C1988b.e(j5) > 0.0f) {
                                        b3 = i5.b();
                                        float e6 = C1988b.e(j5);
                                        if (b3 instanceof S) {
                                            b3.onRelease();
                                        } else {
                                            S s7 = (S) b3;
                                            float f8 = s7.f20182b + e6;
                                            s7.f20182b = f8;
                                            if (Math.abs(f8) > s7.f20181a) {
                                                s7.onRelease();
                                            }
                                        }
                                        z5 = (z5 && I.f(i5.f20157e)) ? false : true;
                                    }
                                    if (!z5 && !z3) {
                                        z9 = false;
                                    }
                                    if (z9) {
                                        g();
                                    }
                                    return C1988b.h(d5, j7);
                                }
                            }
                            z7 = true;
                            if (!z6) {
                            }
                            z3 = true;
                            if (I.f(i5.f)) {
                            }
                            z5 = false;
                            if (I.f(i5.f20158g)) {
                                d6 = i5.d();
                                float d82 = C1988b.d(j5);
                                if (d6 instanceof S) {
                                }
                                if (z5) {
                                }
                            }
                            if (I.f(i5.f20156d)) {
                                e3 = i5.e();
                                float e52 = C1988b.e(j5);
                                if (e3 instanceof S) {
                                }
                                if (z5) {
                                }
                            }
                            if (I.f(i5.f20157e)) {
                                b3 = i5.b();
                                float e62 = C1988b.e(j5);
                                if (b3 instanceof S) {
                                }
                                if (z5) {
                                }
                            }
                            if (!z5) {
                                z9 = false;
                            }
                            if (z9) {
                            }
                            return C1988b.h(d5, j7);
                        }
                        j(g6);
                    }
                    z6 = true;
                    if (C1988b.e(g6) <= 0.5f) {
                    }
                    z7 = true;
                    if (!z6) {
                    }
                    z3 = true;
                    if (I.f(i5.f)) {
                    }
                    z5 = false;
                    if (I.f(i5.f20158g)) {
                    }
                    if (I.f(i5.f20156d)) {
                    }
                    if (I.f(i5.f20157e)) {
                    }
                    if (!z5) {
                    }
                    if (z9) {
                    }
                    return C1988b.h(d5, j7);
                }
                z3 = false;
                if (I.f(i5.f)) {
                }
                z5 = false;
                if (I.f(i5.f20158g)) {
                }
                if (I.f(i5.f20156d)) {
                }
                if (I.f(i5.f20157e)) {
                }
                if (!z5) {
                }
                if (z9) {
                }
                return C1988b.h(d5, j7);
            }
            j6 = 0.0f;
            d5 = G4.d.d(j6, h3);
            if (!C1988b.b(d5, 0L)) {
            }
            long g52 = C1988b.g(j5, d5);
            f.getClass();
            C2604s0 c2604s022 = (C2604s0) f.f19446m;
            long j72 = new C1988b(C2604s0.a(c2604s022, c2604s022.f20869h, g52, c2604s022.f20868g)).f17191a;
            long g62 = C1988b.g(g52, j72);
            if (i == 1) {
            }
            z3 = false;
            if (I.f(i5.f)) {
            }
            z5 = false;
            if (I.f(i5.f20158g)) {
            }
            if (I.f(i5.f20156d)) {
            }
            if (I.f(i5.f20157e)) {
            }
            if (!z5) {
            }
            if (z9) {
            }
            return C1988b.h(d5, j72);
        }
        h3 = 0.0f;
        if (C1988b.d(j5) != 0.0f) {
        }
        j6 = 0.0f;
        d5 = G4.d.d(j6, h3);
        if (!C1988b.b(d5, 0L)) {
        }
        long g522 = C1988b.g(j5, d5);
        f.getClass();
        C2604s0 c2604s0222 = (C2604s0) f.f19446m;
        long j722 = new C1988b(C2604s0.a(c2604s0222, c2604s0222.f20869h, g522, c2604s0222.f20868g)).f17191a;
        long g622 = C1988b.g(g522, j722);
        if (i == 1) {
        }
        z3 = false;
        if (I.f(i5.f)) {
        }
        z5 = false;
        if (I.f(i5.f20158g)) {
        }
        if (I.f(i5.f20156d)) {
        }
        if (I.f(i5.f20157e)) {
        }
        if (!z5) {
        }
        if (z9) {
        }
        return C1988b.h(d5, j722);
    }

    public final void b() {
        boolean z3;
        I i = this.f20267l;
        EdgeEffect edgeEffect = i.f20156d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z3 = edgeEffect.isFinished();
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = i.f20157e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z3 = edgeEffect2.isFinished() || z3;
        }
        EdgeEffect edgeEffect3 = i.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z3 = edgeEffect3.isFinished() || z3;
        }
        EdgeEffect edgeEffect4 = i.f20158g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z3 = edgeEffect4.isFinished() || z3;
        }
        if (z3) {
            g();
        }
    }

    @Override // v.k0
    public final boolean c() {
        I i = this.f20267l;
        EdgeEffect edgeEffect = i.f20156d;
        C2519n c2519n = C2519n.f20274a;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c2519n.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = i.f20157e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c2519n.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = i.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c2519n.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = i.f20158g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? c2519n.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    @Override // v.k0
    public final b0.p d() {
        return this.f20273r;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // v.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(long j5, C2601q0 c2601q0, a4.c cVar) {
        C2515j c2515j;
        int i;
        long j6;
        float f;
        float f5;
        long d5;
        C2518m c2518m;
        long d6;
        float b3;
        if (cVar instanceof C2515j) {
            c2515j = (C2515j) cVar;
            int i5 = c2515j.f20258o;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2515j.f20258o = i5 - Integer.MIN_VALUE;
                Object obj = c2515j.f20256m;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = c2515j.f20258o;
                W3.o oVar = W3.o.f6046a;
                if (i != 0) {
                    G4.l.N(obj);
                    j6 = 0;
                    if (C1991e.e(this.f20271p)) {
                        c2515j.f20258o = 1;
                        c2601q0.getClass();
                        C2601q0 c2601q02 = new C2601q0(c2601q0.f20856n, c2515j);
                        c2601q02.f20855m = j5;
                        if (c2601q02.invokeSuspend(oVar) != enumC0510a) {
                            return oVar;
                        }
                    } else {
                        float b5 = W0.q.b(j5);
                        I i6 = this.f20267l;
                        if (b5 > 0.0f && I.g(i6.f)) {
                            EdgeEffect c5 = i6.c();
                            int U4 = AbstractC2036a.U(W0.q.b(j5));
                            if (Build.VERSION.SDK_INT >= 31) {
                                c5.onAbsorb(U4);
                            } else if (c5.isFinished()) {
                                c5.onAbsorb(U4);
                            }
                            f = W0.q.b(j5);
                        } else if (W0.q.b(j5) >= 0.0f || !I.g(i6.f20158g)) {
                            f = 0.0f;
                        } else {
                            EdgeEffect d7 = i6.d();
                            int i7 = -AbstractC2036a.U(W0.q.b(j5));
                            if (Build.VERSION.SDK_INT >= 31) {
                                d7.onAbsorb(i7);
                            } else if (d7.isFinished()) {
                                d7.onAbsorb(i7);
                            }
                            f = W0.q.b(j5);
                        }
                        if (W0.q.c(j5) > 0.0f && I.g(i6.f20156d)) {
                            EdgeEffect e3 = i6.e();
                            int U5 = AbstractC2036a.U(W0.q.c(j5));
                            if (Build.VERSION.SDK_INT >= 31) {
                                e3.onAbsorb(U5);
                            } else if (e3.isFinished()) {
                                e3.onAbsorb(U5);
                            }
                            f5 = W0.q.c(j5);
                        } else if (W0.q.c(j5) >= 0.0f || !I.g(i6.f20157e)) {
                            f5 = 0.0f;
                        } else {
                            EdgeEffect b6 = i6.b();
                            int i8 = -AbstractC2036a.U(W0.q.c(j5));
                            if (Build.VERSION.SDK_INT >= 31) {
                                b6.onAbsorb(i8);
                            } else if (b6.isFinished()) {
                                b6.onAbsorb(i8);
                            }
                            f5 = W0.q.c(j5);
                        }
                        long c6 = AbstractC2346c.c(f, f5);
                        if (c6 != 0) {
                            g();
                        }
                        d5 = W0.q.d(j5, c6);
                        c2515j.f20254k = this;
                        c2515j.f20255l = d5;
                        c2515j.f20258o = 2;
                        c2601q0.getClass();
                        C2601q0 c2601q03 = new C2601q0(c2601q0.f20856n, c2515j);
                        c2601q03.f20855m = d5;
                        obj = c2601q03.invokeSuspend(oVar);
                        if (obj != enumC0510a) {
                            c2518m = this;
                        }
                    }
                    return enumC0510a;
                }
                if (i == 1) {
                    G4.l.N(obj);
                    return oVar;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d5 = c2515j.f20255l;
                c2518m = c2515j.f20254k;
                G4.l.N(obj);
                j6 = 0;
                d6 = W0.q.d(d5, ((W0.q) obj).f6024a);
                c2518m.f20270o = false;
                b3 = W0.q.b(d6);
                I i9 = c2518m.f20267l;
                if (b3 <= 0.0f) {
                    EdgeEffect c7 = i9.c();
                    int U6 = AbstractC2036a.U(W0.q.b(d6));
                    if (Build.VERSION.SDK_INT >= 31) {
                        c7.onAbsorb(U6);
                    } else if (c7.isFinished()) {
                        c7.onAbsorb(U6);
                    }
                } else if (W0.q.b(d6) < 0.0f) {
                    EdgeEffect d8 = i9.d();
                    int i10 = -AbstractC2036a.U(W0.q.b(d6));
                    if (Build.VERSION.SDK_INT >= 31) {
                        d8.onAbsorb(i10);
                    } else if (d8.isFinished()) {
                        d8.onAbsorb(i10);
                    }
                }
                if (W0.q.c(d6) <= 0.0f) {
                    EdgeEffect e5 = i9.e();
                    int U7 = AbstractC2036a.U(W0.q.c(d6));
                    if (Build.VERSION.SDK_INT >= 31) {
                        e5.onAbsorb(U7);
                    } else if (e5.isFinished()) {
                        e5.onAbsorb(U7);
                    }
                } else if (W0.q.c(d6) < 0.0f) {
                    EdgeEffect b7 = i9.b();
                    int i11 = -AbstractC2036a.U(W0.q.c(d6));
                    if (Build.VERSION.SDK_INT >= 31) {
                        b7.onAbsorb(i11);
                    } else if (b7.isFinished()) {
                        b7.onAbsorb(i11);
                    }
                }
                if (d6 != j6) {
                    c2518m.g();
                }
                c2518m.b();
                return oVar;
            }
        }
        c2515j = new C2515j(this, (AbstractC0542c) cVar);
        Object obj2 = c2515j.f20256m;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = c2515j.f20258o;
        W3.o oVar2 = W3.o.f6046a;
        if (i != 0) {
        }
        d6 = W0.q.d(d5, ((W0.q) obj2).f6024a);
        c2518m.f20270o = false;
        b3 = W0.q.b(d6);
        I i92 = c2518m.f20267l;
        if (b3 <= 0.0f) {
        }
        if (W0.q.c(d6) <= 0.0f) {
        }
        if (d6 != j6) {
        }
        c2518m.b();
        return oVar2;
    }

    public final long f() {
        C1988b c1988b = this.f20266k;
        long L5 = c1988b != null ? c1988b.f17191a : AbstractC0444a.L(this.f20271p);
        return G4.d.d(C1988b.d(L5) / C1991e.d(this.f20271p), C1988b.e(L5) / C1991e.b(this.f20271p));
    }

    public final void g() {
        if (this.f20269n) {
            this.f20268m.setValue(W3.o.f6046a);
        }
    }

    public final float h(long j5) {
        float d5 = C1988b.d(f());
        float e3 = C1988b.e(j5) / C1991e.b(this.f20271p);
        EdgeEffect b3 = this.f20267l.b();
        float f = -e3;
        float f5 = 1 - d5;
        int i = Build.VERSION.SDK_INT;
        C2519n c2519n = C2519n.f20274a;
        if (i >= 31) {
            f = c2519n.c(b3, f, f5);
        } else {
            b3.onPull(f, f5);
        }
        return (i >= 31 ? c2519n.b(b3) : 0.0f) == 0.0f ? C1991e.b(this.f20271p) * (-f) : C1988b.e(j5);
    }

    public final float i(long j5) {
        float e3 = C1988b.e(f());
        float d5 = C1988b.d(j5) / C1991e.d(this.f20271p);
        EdgeEffect c5 = this.f20267l.c();
        float f = 1 - e3;
        int i = Build.VERSION.SDK_INT;
        C2519n c2519n = C2519n.f20274a;
        if (i >= 31) {
            d5 = c2519n.c(c5, d5, f);
        } else {
            c5.onPull(d5, f);
        }
        return (i >= 31 ? c2519n.b(c5) : 0.0f) == 0.0f ? C1991e.d(this.f20271p) * d5 : C1988b.d(j5);
    }

    public final float j(long j5) {
        float e3 = C1988b.e(f());
        float d5 = C1988b.d(j5) / C1991e.d(this.f20271p);
        EdgeEffect d6 = this.f20267l.d();
        float f = -d5;
        int i = Build.VERSION.SDK_INT;
        C2519n c2519n = C2519n.f20274a;
        if (i >= 31) {
            f = c2519n.c(d6, f, e3);
        } else {
            d6.onPull(f, e3);
        }
        return (i >= 31 ? c2519n.b(d6) : 0.0f) == 0.0f ? C1991e.d(this.f20271p) * (-f) : C1988b.d(j5);
    }

    public final float k(long j5) {
        float d5 = C1988b.d(f());
        float e3 = C1988b.e(j5) / C1991e.b(this.f20271p);
        EdgeEffect e5 = this.f20267l.e();
        int i = Build.VERSION.SDK_INT;
        C2519n c2519n = C2519n.f20274a;
        if (i >= 31) {
            e3 = c2519n.c(e5, e3, d5);
        } else {
            e5.onPull(e3, d5);
        }
        return (i >= 31 ? c2519n.b(e5) : 0.0f) == 0.0f ? C1991e.b(this.f20271p) * e3 : C1988b.e(j5);
    }

    public final void l(long j5) {
        boolean a5 = C1991e.a(this.f20271p, 0L);
        boolean a6 = C1991e.a(j5, this.f20271p);
        this.f20271p = j5;
        if (!a6) {
            long b3 = AbstractC0444a.b(AbstractC2036a.U(C1991e.d(j5)), AbstractC2036a.U(C1991e.b(j5)));
            I i = this.f20267l;
            i.f20155c = b3;
            EdgeEffect edgeEffect = i.f20156d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (b3 >> 32), (int) (b3 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = i.f20157e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (b3 >> 32), (int) (b3 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = i.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (b3 & 4294967295L), (int) (b3 >> 32));
            }
            EdgeEffect edgeEffect4 = i.f20158g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (b3 & 4294967295L), (int) (b3 >> 32));
            }
            EdgeEffect edgeEffect5 = i.f20159h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (b3 >> 32), (int) (b3 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = i.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (b3 >> 32), (int) (b3 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = i.f20160j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (b3 & 4294967295L), (int) (b3 >> 32));
            }
            EdgeEffect edgeEffect8 = i.f20161k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & b3), (int) (b3 >> 32));
            }
        }
        if (a5 || a6) {
            return;
        }
        g();
        b();
    }
}
