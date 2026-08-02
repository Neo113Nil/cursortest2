package t0;

import A0.q1;
import b4.EnumC0510a;
import c4.AbstractC0540a;
import p4.AbstractC2282w;
import p4.C2268h;
import p4.C2285z;
import r0.AbstractC2346c;
import z0.AbstractC2749f;

/* loaded from: classes.dex */
public final class E implements W0.c, a4.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ H f19439k;

    /* renamed from: l, reason: collision with root package name */
    public final C2268h f19440l;

    /* renamed from: m, reason: collision with root package name */
    public C2268h f19441m;

    /* renamed from: n, reason: collision with root package name */
    public k f19442n = k.f19490l;

    /* renamed from: o, reason: collision with root package name */
    public final a4.i f19443o = a4.i.f6649k;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ H f19444p;

    public E(H h3, C2268h c2268h) {
        this.f19444p = h3;
        this.f19439k = h3;
        this.f19440l = c2268h;
    }

    @Override // W0.c
    public final float D(long j5) {
        H h3 = this.f19439k;
        h3.getClass();
        return L1.a.c(j5, h3);
    }

    @Override // W0.c
    public final int K(float f) {
        H h3 = this.f19439k;
        h3.getClass();
        return L1.a.b(f, h3);
    }

    @Override // W0.c
    public final long S(long j5) {
        H h3 = this.f19439k;
        h3.getClass();
        return L1.a.f(j5, h3);
    }

    @Override // W0.c
    public final float V(long j5) {
        H h3 = this.f19439k;
        h3.getClass();
        return L1.a.e(j5, h3);
    }

    public final Object b(k kVar, AbstractC0540a abstractC0540a) {
        C2268h c2268h = new C2268h(1, AbstractC2346c.v(abstractC0540a));
        c2268h.r();
        this.f19442n = kVar;
        this.f19441m = c2268h;
        return c2268h.q();
    }

    @Override // W0.c
    public final long b0(float f) {
        return this.f19439k.b0(f);
    }

    @Override // W0.c
    public final float c() {
        return this.f19439k.c();
    }

    public final long e() {
        H h3 = this.f19444p;
        h3.getClass();
        long f = L1.a.f(AbstractC2749f.v(h3).J.g(), h3);
        long j5 = h3.f19457I;
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (f >> 32)) - ((int) (j5 >> 32))) / 2.0f;
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (f & 4294967295L)) - ((int) (j5 & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public final q1 f() {
        H h3 = this.f19444p;
        h3.getClass();
        return AbstractC2749f.v(h3).J;
    }

    @Override // a4.c
    public final a4.h getContext() {
        return this.f19443o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1, types: [p4.U] */
    /* JADX WARN: Type inference failed for: r7v4, types: [p4.U] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [i4.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(long j5, i4.e eVar, AbstractC0540a abstractC0540a) {
        C c5;
        int i;
        C2268h c2268h;
        try {
            if (abstractC0540a instanceof C) {
                c5 = (C) abstractC0540a;
                int i5 = c5.f19435n;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    c5.f19435n = i5 - Integer.MIN_VALUE;
                    Object obj = c5.f19433l;
                    EnumC0510a enumC0510a = EnumC0510a.f7289k;
                    i = c5.f19435n;
                    if (i != 0) {
                        G4.l.N(obj);
                        if (j5 <= 0 && (c2268h = this.f19441m) != null) {
                            c2268h.resumeWith(G4.l.p(new l(j5)));
                        }
                        C2285z p5 = AbstractC2282w.p(this.f19444p.k0(), null, new D(j5, this, null), 3);
                        c5.f19432k = p5;
                        c5.f19435n = 1;
                        obj = eVar.invoke(this, c5);
                        j5 = p5;
                        if (obj == enumC0510a) {
                            return enumC0510a;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C2285z c2285z = c5.f19432k;
                        G4.l.N(obj);
                        j5 = c2285z;
                    }
                    return obj;
                }
            }
            if (i != 0) {
            }
            return obj;
        } finally {
            j5.d(C2405b.f19461l);
        }
        c5 = new C(this, abstractC0540a);
        Object obj2 = c5.f19433l;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = c5.f19435n;
    }

    @Override // W0.c
    public final float h0(int i) {
        return this.f19439k.h0(i);
    }

    @Override // W0.c
    public final float i0(float f) {
        return f / this.f19439k.c();
    }

    @Override // W0.c
    public final float n() {
        return this.f19439k.n();
    }

    @Override // a4.c
    public final void resumeWith(Object obj) {
        H h3 = this.f19444p;
        synchronized (h3.f19454F) {
            h3.f19453E.k(this);
        }
        this.f19440l.resumeWith(obj);
    }

    @Override // W0.c
    public final long x(long j5) {
        H h3 = this.f19439k;
        h3.getClass();
        return L1.a.d(j5, h3);
    }

    @Override // W0.c
    public final float y(float f) {
        return this.f19439k.c() * f;
    }
}
