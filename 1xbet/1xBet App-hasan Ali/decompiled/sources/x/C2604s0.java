package x;

import b4.EnumC0510a;
import c4.AbstractC0542c;
import h0.C1988b;
import s0.C2355d;
import s0.C2358g;
import z0.AbstractC2749f;

/* renamed from: x.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2604s0 {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC2591l0 f20863a;

    /* renamed from: b, reason: collision with root package name */
    public v.k0 f20864b;

    /* renamed from: c, reason: collision with root package name */
    public C2592m f20865c;

    /* renamed from: d, reason: collision with root package name */
    public P f20866d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20867e;
    public C2355d f;

    /* renamed from: g, reason: collision with root package name */
    public int f20868g = 1;

    /* renamed from: h, reason: collision with root package name */
    public U f20869h = androidx.compose.foundation.gestures.a.f6841a;
    public final C2599p0 i = new C2599p0(this);

    /* renamed from: j, reason: collision with root package name */
    public final t0.F f20870j = new t0.F(7, this);

    public C2604s0(InterfaceC2591l0 interfaceC2591l0, v.k0 k0Var, C2592m c2592m, P p5, boolean z3, C2355d c2355d) {
        this.f20863a = interfaceC2591l0;
        this.f20864b = k0Var;
        this.f20865c = c2592m;
        this.f20866d = p5;
        this.f20867e = z3;
        this.f = c2355d;
    }

    public static final long a(C2604s0 c2604s0, U u5, long j5, int i) {
        C2358g c2358g = c2604s0.f.f19158a;
        C2358g c2358g2 = null;
        C2358g c2358g3 = (c2358g == null || !c2358g.f7175x) ? null : (C2358g) AbstractC2749f.k(c2358g);
        long c02 = c2358g3 != null ? c2358g3.c0(i, j5) : 0L;
        long g5 = C1988b.g(j5, c02);
        long d5 = c2604s0.d(c2604s0.g(u5.a(c2604s0.f(c2604s0.d(C1988b.a(g5, 0.0f, c2604s0.f20866d == P.f20696l ? 1 : 2))))));
        long g6 = C1988b.g(g5, d5);
        C2358g c2358g4 = c2604s0.f.f19158a;
        if (c2358g4 != null && c2358g4.f7175x) {
            c2358g2 = (C2358g) AbstractC2749f.k(c2358g4);
        }
        C2358g c2358g5 = c2358g2;
        return C1988b.h(C1988b.h(c02, d5), c2358g5 != null ? c2358g5.I(i, d5, g6) : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j5, AbstractC0542c abstractC0542c) {
        C2593m0 c2593m0;
        int i;
        kotlin.jvm.internal.v vVar;
        if (abstractC0542c instanceof C2593m0) {
            c2593m0 = (C2593m0) abstractC0542c;
            int i5 = c2593m0.f20827n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2593m0.f20827n = i5 - Integer.MIN_VALUE;
                Object obj = c2593m0.f20825l;
                Object obj2 = EnumC0510a.f7289k;
                i = c2593m0.f20827n;
                if (i != 0) {
                    G4.l.N(obj);
                    kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
                    vVar2.f17623k = j5;
                    v.d0 d0Var = v.d0.f20222k;
                    i4.e c2597o0 = new C2597o0(this, vVar2, j5, null);
                    c2593m0.f20824k = vVar2;
                    c2593m0.f20827n = 1;
                    if (e(d0Var, c2597o0, c2593m0) == obj2) {
                        return obj2;
                    }
                    vVar = vVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vVar = c2593m0.f20824k;
                    G4.l.N(obj);
                }
                return new W0.q(vVar.f17623k);
            }
        }
        c2593m0 = new C2593m0(this, abstractC0542c);
        Object obj3 = c2593m0.f20825l;
        Object obj22 = EnumC0510a.f7289k;
        i = c2593m0.f20827n;
        if (i != 0) {
        }
        return new W0.q(vVar.f17623k);
    }

    public final float c(float f) {
        return this.f20867e ? f * (-1) : f;
    }

    public final long d(long j5) {
        return this.f20867e ? C1988b.i(-1.0f, j5) : j5;
    }

    public final Object e(v.d0 d0Var, i4.e eVar, AbstractC0542c abstractC0542c) {
        Object e3 = this.f20863a.e(d0Var, new C2602r0(this, eVar, null), abstractC0542c);
        return e3 == EnumC0510a.f7289k ? e3 : W3.o.f6046a;
    }

    public final float f(long j5) {
        return this.f20866d == P.f20696l ? C1988b.d(j5) : C1988b.e(j5);
    }

    public final long g(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        return this.f20866d == P.f20696l ? G4.d.d(f, 0.0f) : G4.d.d(0.0f, f);
    }
}
