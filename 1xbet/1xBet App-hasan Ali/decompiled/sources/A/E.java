package A;

import B.C0075d;
import B.C0078g;
import B.M;
import B.RunnableC0073b;
import K0.C0196a;
import P.AbstractC0329z;
import P.C0299j0;
import P.C0305m0;
import P.InterfaceC0289e0;
import P.Z;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import e2.C1930k;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;
import u.AbstractC2470q;
import u.B0;
import u.C2465l;
import u.C2466m;
import v.d0;
import x.C2600q;
import x.InterfaceC2591l0;
import y.C2654j;
import z0.C2731G;

/* loaded from: classes.dex */
public final class E implements InterfaceC2591l0 {

    /* renamed from: w, reason: collision with root package name */
    public static final v3.g f8w;

    /* renamed from: a, reason: collision with root package name */
    public final C0001a f9a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10b;

    /* renamed from: c, reason: collision with root package name */
    public t f11c;

    /* renamed from: d, reason: collision with root package name */
    public final v f12d;

    /* renamed from: e, reason: collision with root package name */
    public final C0305m0 f13e;
    public final C2654j f;

    /* renamed from: g, reason: collision with root package name */
    public float f14g;

    /* renamed from: h, reason: collision with root package name */
    public final C2600q f15h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public C2731G f16j;

    /* renamed from: k, reason: collision with root package name */
    public final y f17k;

    /* renamed from: l, reason: collision with root package name */
    public final C0075d f18l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.a f19m;

    /* renamed from: n, reason: collision with root package name */
    public final C1930k f20n;

    /* renamed from: o, reason: collision with root package name */
    public final B.A f21o;

    /* renamed from: p, reason: collision with root package name */
    public final C1930k f22p;

    /* renamed from: q, reason: collision with root package name */
    public final B.x f23q;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC0289e0 f24r;

    /* renamed from: s, reason: collision with root package name */
    public final C0305m0 f25s;

    /* renamed from: t, reason: collision with root package name */
    public final C0305m0 f26t;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC0289e0 f27u;

    /* renamed from: v, reason: collision with root package name */
    public C2465l f28v;

    static {
        w wVar = w.f137l;
        r rVar = r.f98n;
        C0196a c0196a = new C0196a(wVar);
        kotlin.jvm.internal.z.b(1, rVar);
        f8w = new v3.g(13, c0196a, rVar);
    }

    public E(int i, int i5) {
        C0001a c0001a = new C0001a();
        c0001a.f31a = -1;
        this.f9a = c0001a;
        v vVar = new v();
        vVar.f133b = new C0299j0(i);
        vVar.f134c = new C0299j0(i5);
        vVar.f136e = new B.v(i);
        this.f12d = vVar;
        t tVar = H.f30b;
        Z z3 = Z.f4431m;
        this.f13e = new C0305m0(tVar, z3);
        this.f = new C2654j();
        this.f15h = new C2600q(new B(0, this));
        this.i = true;
        this.f17k = new y(this);
        this.f18l = new C0075d();
        this.f19m = new androidx.compose.foundation.lazy.layout.a();
        this.f20n = new C1930k(3);
        this.f21o = new B.A(new x(i, 0, this));
        this.f22p = new C1930k(1, this);
        this.f23q = new B.x();
        W3.o oVar = W3.o.f6046a;
        this.f24r = new C0305m0(oVar, z3);
        Boolean bool = Boolean.FALSE;
        this.f25s = AbstractC0329z.t(bool);
        this.f26t = AbstractC0329z.t(bool);
        this.f27u = new C0305m0(oVar, z3);
        this.f28v = new C2465l(B0.f19645a, Float.valueOf(0.0f), new C2466m(0.0f), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // x.InterfaceC2591l0
    public final boolean a() {
        return ((Boolean) this.f26t.getValue()).booleanValue();
    }

    @Override // x.InterfaceC2591l0
    public final boolean b() {
        return this.f15h.b();
    }

    @Override // x.InterfaceC2591l0
    public final boolean c() {
        return ((Boolean) this.f25s.getValue()).booleanValue();
    }

    @Override // x.InterfaceC2591l0
    public final float d(float f) {
        return this.f15h.d(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (r8.e(r6, r7, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // x.InterfaceC2591l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(d0 d0Var, i4.e eVar, AbstractC0542c abstractC0542c) {
        z zVar;
        int i;
        E e3;
        if (abstractC0542c instanceof z) {
            zVar = (z) abstractC0542c;
            int i5 = zVar.f147p;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                zVar.f147p = i5 - Integer.MIN_VALUE;
                Object obj = zVar.f145n;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = zVar.f147p;
                if (i != 0) {
                    G4.l.N(obj);
                    zVar.f142k = this;
                    zVar.f143l = d0Var;
                    zVar.f144m = eVar;
                    zVar.f147p = 1;
                    if (this.f18l.i(zVar) != enumC0510a) {
                        e3 = this;
                    }
                    return enumC0510a;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    G4.l.N(obj);
                    return W3.o.f6046a;
                }
                eVar = zVar.f144m;
                d0Var = zVar.f143l;
                e3 = zVar.f142k;
                G4.l.N(obj);
                C2600q c2600q = e3.f15h;
                zVar.f142k = null;
                zVar.f143l = null;
                zVar.f144m = null;
                zVar.f147p = 2;
            }
        }
        zVar = new z(this, abstractC0542c);
        Object obj2 = zVar.f145n;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = zVar.f147p;
        if (i != 0) {
        }
        C2600q c2600q2 = e3.f15h;
        zVar.f142k = null;
        zVar.f143l = null;
        zVar.f144m = null;
        zVar.f147p = 2;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void f(t tVar, boolean z3, boolean z5) {
        if (!z3 && this.f10b) {
            this.f11c = tVar;
            return;
        }
        if (z3) {
            this.f10b = true;
        }
        u uVar = tVar.f104a;
        this.f26t.setValue(Boolean.valueOf(((uVar != null ? uVar.f119a : 0) == 0 && tVar.f105b == 0) ? false : true));
        this.f25s.setValue(Boolean.valueOf(tVar.f106c));
        this.f14g -= tVar.f107d;
        this.f13e.setValue(tVar);
        AbstractC2470q abstractC2470q = null;
        v vVar = this.f12d;
        if (z5) {
            int i = tVar.f105b;
            if (i < 0.0f) {
                vVar.getClass();
                throw new IllegalStateException(("scrollOffset should be non-negative (" + i + ')').toString());
            }
            ((C0299j0) vVar.f134c).i(i);
        } else {
            vVar.getClass();
            vVar.f135d = uVar != null ? uVar.f124g : null;
            if (vVar.f132a || tVar.f114m > 0) {
                vVar.f132a = true;
                int i5 = tVar.f105b;
                if (i5 < 0.0f) {
                    throw new IllegalStateException(("scrollOffset should be non-negative (" + i5 + ')').toString());
                }
                vVar.k(uVar != null ? uVar.f119a : 0, i5);
            }
            if (this.i) {
                C0001a c0001a = this.f9a;
                if (c0001a.f31a != -1) {
                    ?? r42 = tVar.f111j;
                    if (!r42.isEmpty()) {
                        if (c0001a.f31a != (c0001a.f32b ? ((u) X3.m.e0(r42)).f119a + 1 : ((u) X3.m.Y(r42)).f119a - 1)) {
                            c0001a.f31a = -1;
                            B.z zVar = (B.z) c0001a.f33c;
                            if (zVar != null) {
                                zVar.cancel();
                            }
                            c0001a.f33c = null;
                        }
                    }
                }
            }
        }
        if (z3) {
            float y5 = tVar.f110h.y(H.f29a);
            float f = tVar.f108e;
            if (f <= y5) {
                return;
            }
            Z.f d5 = Z.q.d();
            i4.c e3 = d5 != null ? d5.e() : null;
            Z.f g5 = Z.q.g(d5);
            try {
                float floatValue = ((Number) this.f28v.f19846l.getValue()).floatValue();
                C2465l c2465l = this.f28v;
                boolean z6 = c2465l.f19850p;
                InterfaceC2280u interfaceC2280u = tVar.f109g;
                if (z6) {
                    this.f28v = new C2465l(c2465l.f19845k, Float.valueOf(floatValue - f), new C2466m(((C2466m) c2465l.f19847m).f19873a), c2465l.f19848n, c2465l.f19849o, z6);
                    AbstractC2282w.p(interfaceC2280u, null, new C(this, null), 3);
                } else {
                    this.f28v = new C2465l(B0.f19645a, Float.valueOf(-f), abstractC2470q, 60);
                    AbstractC2282w.p(interfaceC2280u, null, new D(this, null), 3);
                }
                Z.q.k(d5, g5, e3);
            } catch (Throwable th) {
                Z.q.k(d5, g5, e3);
                throw th;
            }
        }
    }

    public final t g() {
        return (t) this.f13e.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public final void h(float f, t tVar) {
        B.z zVar;
        B.z zVar2;
        Object obj;
        B.z zVar3;
        if (this.i) {
            C0001a c0001a = this.f9a;
            if (tVar.f111j.isEmpty()) {
                return;
            }
            boolean z3 = f < 0.0f;
            ?? r32 = tVar.f111j;
            int i = z3 ? ((u) X3.m.e0(r32)).f119a + 1 : ((u) X3.m.Y(r32)).f119a - 1;
            if (i < 0 || i >= tVar.f114m) {
                return;
            }
            if (i != c0001a.f31a) {
                if (c0001a.f32b != z3 && (zVar3 = (B.z) c0001a.f33c) != null) {
                    zVar3.cancel();
                }
                c0001a.f32b = z3;
                c0001a.f31a = i;
                E e3 = (E) this.f22p.f16910l;
                Z.f d5 = Z.q.d();
                i4.c e5 = d5 != null ? d5.e() : null;
                Z.f g5 = Z.q.g(d5);
                try {
                    long j5 = ((t) e3.f13e.getValue()).i;
                    Z.q.k(d5, g5, e5);
                    B.A a5 = e3.f21o;
                    v3.e eVar = a5.f608c;
                    if (eVar != null) {
                        obj = new M(eVar, i, j5, a5.f607b);
                        RunnableC0073b runnableC0073b = (RunnableC0073b) eVar.f20434n;
                        runnableC0073b.f661l.c(obj);
                        if (!runnableC0073b.f662m) {
                            runnableC0073b.f662m = true;
                            runnableC0073b.f660k.post(runnableC0073b);
                        }
                    } else {
                        obj = C0078g.f673a;
                    }
                    c0001a.f33c = obj;
                } catch (Throwable th) {
                    Z.q.k(d5, g5, e5);
                    throw th;
                }
            }
            if (!z3) {
                if (tVar.f112k - ((u) X3.m.Y(r32)).f126j >= f || (zVar = (B.z) c0001a.f33c) == null) {
                    return;
                }
                zVar.a();
                return;
            }
            u uVar = (u) X3.m.e0(r32);
            if (((uVar.f126j + uVar.f127k) + tVar.f117p) - tVar.f113l >= (-f) || (zVar2 = (B.z) c0001a.f33c) == null) {
                return;
            }
            zVar2.a();
        }
    }
}
