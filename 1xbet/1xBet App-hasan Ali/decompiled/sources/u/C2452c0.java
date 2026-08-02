package u;

import A0.C0040k0;
import G1.C0140k;
import P.AbstractC0329z;
import P.C0297i0;
import P.C0305m0;
import a.AbstractC0444a;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import c4.AbstractC0548i;
import java.util.concurrent.CancellationException;
import k4.AbstractC2036a;
import p4.C2268h;
import r.C2316B;
import r0.AbstractC2346c;

/* renamed from: u.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2452c0 extends J2.a {

    /* renamed from: r, reason: collision with root package name */
    public static final C2466m f19768r = new C2466m(0.0f);

    /* renamed from: s, reason: collision with root package name */
    public static final C2466m f19769s = new C2466m(1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final C0305m0 f19770b;

    /* renamed from: c, reason: collision with root package name */
    public final C0305m0 f19771c;

    /* renamed from: d, reason: collision with root package name */
    public Object f19772d;

    /* renamed from: e, reason: collision with root package name */
    public t0 f19773e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public final C0040k0 f19774g;

    /* renamed from: h, reason: collision with root package name */
    public final C0297i0 f19775h;
    public C2268h i;

    /* renamed from: j, reason: collision with root package name */
    public final x4.c f19776j;

    /* renamed from: k, reason: collision with root package name */
    public final C2444O f19777k;

    /* renamed from: l, reason: collision with root package name */
    public long f19778l;

    /* renamed from: m, reason: collision with root package name */
    public final C2316B f19779m;

    /* renamed from: n, reason: collision with root package name */
    public C2446Q f19780n;

    /* renamed from: o, reason: collision with root package name */
    public final S f19781o;

    /* renamed from: p, reason: collision with root package name */
    public float f19782p;

    /* renamed from: q, reason: collision with root package name */
    public final S f19783q;

    public C2452c0(C0140k c0140k) {
        super(4);
        this.f19770b = AbstractC0329z.t(c0140k);
        this.f19771c = AbstractC0329z.t(c0140k);
        this.f19772d = c0140k;
        this.f19774g = new C0040k0(26, this);
        this.f19775h = new C0297i0(0.0f);
        this.f19776j = new x4.c();
        this.f19777k = new C2444O();
        this.f19778l = Long.MIN_VALUE;
        this.f19779m = new C2316B();
        this.f19781o = new S(this, 1);
        this.f19783q = new S(this, 0);
    }

    public static final void m(C2452c0 c2452c0) {
        t0 t0Var = c2452c0.f19773e;
        if (t0Var == null) {
            return;
        }
        C2446Q c2446q = c2452c0.f19780n;
        if (c2446q == null) {
            if (c2452c0.f > 0) {
                C0297i0 c0297i0 = c2452c0.f19775h;
                if (c0297i0.h() != 1.0f && !kotlin.jvm.internal.l.a(c2452c0.f19771c.getValue(), c2452c0.f19770b.getValue())) {
                    C2446Q c2446q2 = new C2446Q();
                    c2446q2.f19701d = c0297i0.h();
                    long j5 = c2452c0.f;
                    c2446q2.f19703g = j5;
                    c2446q2.f19704h = AbstractC2036a.V((1.0d - c0297i0.h()) * j5);
                    c2446q2.f19702e.e(0, c0297i0.h());
                    c2446q = c2446q2;
                }
            }
            c2446q = null;
        }
        if (c2446q != null) {
            c2446q.f19703g = c2452c0.f;
            c2452c0.f19779m.a(c2446q);
            t0Var.n(c2446q);
        }
        c2452c0.f19780n = null;
    }

    public static final void n(C2452c0 c2452c0, C2446Q c2446q, long j5) {
        c2452c0.getClass();
        long j6 = c2446q.f19698a + j5;
        c2446q.f19698a = j6;
        long j7 = c2446q.f19704h;
        if (j6 >= j7) {
            c2446q.f19701d = 1.0f;
            return;
        }
        E0 e02 = c2446q.f19699b;
        if (e02 == null) {
            float a5 = c2446q.f19702e.a(0);
            float f = j6 / j7;
            A0 a02 = B0.f19645a;
            c2446q.f19701d = (1.0f * f) + ((1 - f) * a5);
            return;
        }
        C2466m c2466m = f19769s;
        C2466m c2466m2 = c2446q.f;
        if (c2466m2 == null) {
            c2466m2 = f19768r;
        }
        c2446q.f19701d = AbstractC0444a.s(((C2466m) e02.g(j6, c2446q.f19702e, c2466m, c2466m2)).a(0), 0.0f, 1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0077, code lost:
    
        if (P.AbstractC0329z.q(r0.getContext()).n(r10.f19781o, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(C2452c0 c2452c0, AbstractC0542c abstractC0542c) {
        V v4;
        EnumC0510a enumC0510a;
        int i;
        c2452c0.getClass();
        if (abstractC0542c instanceof V) {
            v4 = (V) abstractC0542c;
            int i5 = v4.f19720n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                v4.f19720n = i5 - Integer.MIN_VALUE;
                Object obj = v4.f19718l;
                enumC0510a = EnumC0510a.f7289k;
                i = v4.f19720n;
                W3.o oVar = W3.o.f6046a;
                if (i != 0) {
                    G4.l.N(obj);
                    if (c2452c0.f19779m.g() && c2452c0.f19780n == null) {
                        return oVar;
                    }
                    if (AbstractC2453d.i(v4.getContext()) == 0.0f) {
                        c2452c0.s();
                        c2452c0.f19778l = Long.MIN_VALUE;
                        return oVar;
                    }
                    if (c2452c0.f19778l == Long.MIN_VALUE) {
                        v4.f19717k = c2452c0;
                        v4.f19720n = 1;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2452c0 = v4.f19717k;
                    G4.l.N(obj);
                }
                do {
                    if (c2452c0.f19779m.h() && c2452c0.f19780n == null) {
                        c2452c0.f19778l = Long.MIN_VALUE;
                        return oVar;
                    }
                    v4.f19717k = c2452c0;
                    v4.f19720n = 2;
                } while (c2452c0.r(v4) != enumC0510a);
                return enumC0510a;
            }
        }
        v4 = new V(c2452c0, abstractC0542c);
        Object obj2 = v4.f19718l;
        enumC0510a = EnumC0510a.f7289k;
        i = v4.f19720n;
        W3.o oVar2 = W3.o.f6046a;
        if (i != 0) {
        }
        do {
            if (c2452c0.f19779m.h()) {
            }
            v4.f19717k = c2452c0;
            v4.f19720n = 2;
        } while (c2452c0.r(v4) != enumC0510a);
        return enumC0510a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r6.f19776j.c(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(C2452c0 c2452c0, AbstractC0542c abstractC0542c) {
        C2448a0 c2448a0;
        EnumC0510a enumC0510a;
        int i;
        Object value;
        Object q5;
        C2452c0 c2452c02;
        Object obj;
        c2452c0.getClass();
        if (abstractC0542c instanceof C2448a0) {
            c2448a0 = (C2448a0) abstractC0542c;
            int i5 = c2448a0.f19752o;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2448a0.f19752o = i5 - Integer.MIN_VALUE;
                Object obj2 = c2448a0.f19750m;
                enumC0510a = EnumC0510a.f7289k;
                i = c2448a0.f19752o;
                if (i != 0) {
                    G4.l.N(obj2);
                    value = c2452c0.f19770b.getValue();
                    c2448a0.f19748k = c2452c0;
                    c2448a0.f19749l = value;
                    c2448a0.f19752o = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = c2448a0.f19749l;
                        c2452c02 = c2448a0.f19748k;
                        G4.l.N(obj2);
                        if (!kotlin.jvm.internal.l.a(obj2, obj)) {
                            return W3.o.f6046a;
                        }
                        c2452c02.f19778l = Long.MIN_VALUE;
                        throw new CancellationException("targetState while waiting for composition");
                    }
                    Object obj3 = c2448a0.f19749l;
                    C2452c0 c2452c03 = c2448a0.f19748k;
                    G4.l.N(obj2);
                    value = obj3;
                    c2452c0 = c2452c03;
                }
                c2448a0.f19748k = c2452c0;
                c2448a0.f19749l = value;
                c2448a0.f19752o = 2;
                C2268h c2268h = new C2268h(1, AbstractC2346c.v(c2448a0));
                c2268h.r();
                c2452c0.i = c2268h;
                c2452c0.f19776j.d(null);
                q5 = c2268h.q();
                if (q5 != enumC0510a) {
                    c2452c02 = c2452c0;
                    obj = value;
                    obj2 = q5;
                    if (!kotlin.jvm.internal.l.a(obj2, obj)) {
                    }
                }
                return enumC0510a;
            }
        }
        c2448a0 = new C2448a0(c2452c0, abstractC0542c);
        Object obj22 = c2448a0.f19750m;
        enumC0510a = EnumC0510a.f7289k;
        i = c2448a0.f19752o;
        if (i != 0) {
        }
        c2448a0.f19748k = c2452c0;
        c2448a0.f19749l = value;
        c2448a0.f19752o = 2;
        C2268h c2268h2 = new C2268h(1, AbstractC2346c.v(c2448a0));
        c2268h2.r();
        c2452c0.i = c2268h2;
        c2452c0.f19776j.d(null);
        q5 = c2268h2.q();
        if (q5 != enumC0510a) {
        }
        return enumC0510a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(C2452c0 c2452c0, AbstractC0542c abstractC0542c) {
        C2450b0 c2450b0;
        int i;
        C2452c0 c2452c02;
        Object obj;
        boolean a5;
        C2452c0 c2452c03;
        c2452c0.getClass();
        if (abstractC0542c instanceof C2450b0) {
            c2450b0 = (C2450b0) abstractC0542c;
            int i5 = c2450b0.f19759o;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2450b0.f19759o = i5 - Integer.MIN_VALUE;
                Object obj2 = c2450b0.f19757m;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = c2450b0.f19759o;
                if (i != 0) {
                    G4.l.N(obj2);
                    Object value = c2452c0.f19770b.getValue();
                    c2450b0.f19755k = c2452c0;
                    c2450b0.f19756l = value;
                    c2450b0.f19759o = 1;
                    if (c2452c0.f19776j.c(c2450b0) != enumC0510a) {
                        c2452c02 = c2452c0;
                        obj = value;
                    }
                    return enumC0510a;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = c2450b0.f19756l;
                    c2452c03 = c2450b0.f19755k;
                    G4.l.N(obj2);
                    if (!kotlin.jvm.internal.l.a(obj2, obj)) {
                        c2452c03.f19778l = Long.MIN_VALUE;
                        throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                    }
                    return W3.o.f6046a;
                }
                obj = c2450b0.f19756l;
                c2452c02 = c2450b0.f19755k;
                G4.l.N(obj2);
                a5 = kotlin.jvm.internal.l.a(obj, c2452c02.f19772d);
                x4.c cVar = c2452c02.f19776j;
                if (!a5) {
                    cVar.d(null);
                    return W3.o.f6046a;
                }
                c2450b0.f19755k = c2452c02;
                c2450b0.f19756l = obj;
                c2450b0.f19759o = 2;
                C2268h c2268h = new C2268h(1, AbstractC2346c.v(c2450b0));
                c2268h.r();
                c2452c02.i = c2268h;
                cVar.d(null);
                obj2 = c2268h.q();
                if (obj2 != enumC0510a) {
                    c2452c03 = c2452c02;
                    if (!kotlin.jvm.internal.l.a(obj2, obj)) {
                    }
                    return W3.o.f6046a;
                }
                return enumC0510a;
            }
        }
        c2450b0 = new C2450b0(c2452c0, abstractC0542c);
        Object obj22 = c2450b0.f19757m;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = c2450b0.f19759o;
        if (i != 0) {
        }
        a5 = kotlin.jvm.internal.l.a(obj, c2452c02.f19772d);
        x4.c cVar2 = c2452c02.f19776j;
        if (!a5) {
        }
    }

    @Override // J2.a
    public final Object e() {
        return this.f19771c.getValue();
    }

    @Override // J2.a
    public final Object f() {
        return this.f19770b.getValue();
    }

    @Override // J2.a
    public final void h(Object obj) {
        this.f19771c.setValue(obj);
    }

    @Override // J2.a
    public final void i(t0 t0Var) {
        t0 t0Var2 = this.f19773e;
        if (!(t0Var2 == null || kotlin.jvm.internal.l.a(t0Var, t0Var2))) {
            AbstractC2445P.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f19773e + ", new instance: " + t0Var);
        }
        this.f19773e = t0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [W3.e, java.lang.Object] */
    @Override // J2.a
    public final void j() {
        this.f19773e = null;
        ((Z.s) y0.f19969a.getValue()).b(this);
    }

    public final Object r(AbstractC0542c abstractC0542c) {
        float i = AbstractC2453d.i(abstractC0542c.getContext());
        W3.o oVar = W3.o.f6046a;
        if (i <= 0.0f) {
            s();
            return oVar;
        }
        this.f19782p = i;
        Object n5 = AbstractC0329z.q(abstractC0542c.getContext()).n(this.f19783q, abstractC0542c);
        return n5 == EnumC0510a.f7289k ? n5 : oVar;
    }

    public final void s() {
        t0 t0Var = this.f19773e;
        if (t0Var != null) {
            t0Var.c();
        }
        this.f19779m.c();
        if (this.f19780n != null) {
            this.f19780n = null;
            v(1.0f);
            u();
        }
    }

    public final Object t(float f, Object obj, AbstractC0548i abstractC0548i) {
        if (0.0f > f || f > 1.0f) {
            AbstractC2445P.a("Expecting fraction between 0 and 1. Got " + f);
        }
        t0 t0Var = this.f19773e;
        W3.o oVar = W3.o.f6046a;
        if (t0Var != null) {
            Object a5 = C2444O.a(this.f19777k, new Y(obj, this.f19770b.getValue(), this, t0Var, f, null), abstractC0548i);
            if (a5 == EnumC0510a.f7289k) {
                return a5;
            }
        }
        return oVar;
    }

    public final void u() {
        t0 t0Var = this.f19773e;
        if (t0Var == null) {
            return;
        }
        t0Var.m(AbstractC2036a.V(this.f19775h.h() * ((Number) t0Var.f19946l.getValue()).longValue()));
    }

    public final void v(float f) {
        this.f19775h.i(f);
    }
}
