package E;

import i0.C2001f;
import i0.C2006k;
import i0.InterfaceC2009n;
import k0.C2022b;
import k0.C2023c;
import k4.AbstractC2036a;
import u.C2466m;
import x.S0;
import z0.C2733I;

/* renamed from: E.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0091c extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1124l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f1125m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1126n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1127o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0091c(float f, C2001f c2001f, C2006k c2006k) {
        super(1);
        this.f1125m = f;
        this.f1126n = c2001f;
        this.f1127o = c2006k;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        long V4;
        switch (this.f1124l) {
            case 0:
                C2733I c2733i = (C2733I) obj;
                c2733i.a();
                float f = this.f1125m;
                C2001f c2001f = (C2001f) this.f1126n;
                C2006k c2006k = (C2006k) this.f1127o;
                C2022b c2022b = c2733i.f21647k;
                v3.e eVar = c2022b.f17540l;
                long A3 = eVar.A();
                eVar.v().k();
                try {
                    C2023c c2023c = (C2023c) eVar.f20432l;
                    c2023c.B(f, 0.0f);
                    InterfaceC2009n v4 = ((v3.e) c2023c.f17544l).v();
                    int i = (int) 0;
                    v4.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i));
                    v4.h();
                    v4.g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i));
                    c2022b.e(c2001f, c2006k);
                    eVar.v().j();
                    eVar.P(A3);
                    return W3.o.f6046a;
                } catch (Throwable th) {
                    eVar.v().j();
                    eVar.P(A3);
                    throw th;
                }
            default:
                long longValue = ((Number) obj).longValue();
                S0 s02 = (S0) this.f1126n;
                if (s02.f20719b == Long.MIN_VALUE) {
                    s02.f20719b = longValue;
                }
                float f5 = s02.f20722e;
                C2466m c2466m = new C2466m(f5);
                float f6 = this.f1125m;
                C2466m c2466m2 = S0.f;
                if (f6 == 0.0f) {
                    V4 = s02.f20718a.m(new C2466m(f5), c2466m2, s02.f20720c);
                } else {
                    V4 = AbstractC2036a.V((longValue - s02.f20719b) / f6);
                }
                long j5 = V4;
                float f7 = ((C2466m) s02.f20718a.g(j5, c2466m, c2466m2, s02.f20720c)).f19873a;
                s02.f20720c = (C2466m) s02.f20718a.p(j5, c2466m, c2466m2, s02.f20720c);
                s02.f20719b = longValue;
                float f8 = s02.f20722e - f7;
                s02.f20722e = f7;
                ((i4.c) this.f1127o).c(Float.valueOf(f8));
                return W3.o.f6046a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0091c(S0 s02, float f, i4.c cVar) {
        super(1);
        this.f1126n = s02;
        this.f1125m = f;
        this.f1127o = cVar;
    }
}
