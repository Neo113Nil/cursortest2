package u;

import a.AbstractC0444a;
import k4.AbstractC2036a;
import l4.C2062d;
import r.C2316B;

/* loaded from: classes.dex */
public final class S extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f19705l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2452c0 f19706m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S(C2452c0 c2452c0, int i) {
        super(1);
        this.f19705l = i;
        this.f19706m = c2452c0;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f19705l) {
            case 0:
                long longValue = ((Number) obj).longValue();
                C2452c0 c2452c0 = this.f19706m;
                long j5 = longValue - c2452c0.f19778l;
                c2452c0.f19778l = longValue;
                long V4 = AbstractC2036a.V(j5 / c2452c0.f19782p);
                C2316B c2316b = c2452c0.f19779m;
                if (c2316b.h()) {
                    Object[] objArr = c2316b.f18904a;
                    int i = c2316b.f18905b;
                    int i5 = 0;
                    for (int i6 = 0; i6 < i; i6++) {
                        C2446Q c2446q = (C2446Q) objArr[i6];
                        C2452c0.n(c2452c0, c2446q, V4);
                        c2446q.f19700c = true;
                    }
                    t0 t0Var = c2452c0.f19773e;
                    if (t0Var != null) {
                        t0Var.p();
                    }
                    int i7 = c2316b.f18905b;
                    Object[] objArr2 = c2316b.f18904a;
                    C2062d f02 = AbstractC0444a.f0(0, i7);
                    int i8 = f02.f17851k;
                    int i9 = f02.f17852l;
                    if (i8 <= i9) {
                        while (true) {
                            objArr2[i8 - i5] = objArr2[i8];
                            if (((C2446Q) objArr2[i8]).f19700c) {
                                i5++;
                            }
                            if (i8 != i9) {
                                i8++;
                            }
                        }
                    }
                    X3.l.B0(objArr2, i7 - i5, i7);
                    c2316b.f18905b -= i5;
                }
                C2446Q c2446q2 = c2452c0.f19780n;
                if (c2446q2 != null) {
                    c2446q2.f19703g = c2452c0.f;
                    C2452c0.n(c2452c0, c2446q2, V4);
                    c2452c0.v(c2446q2.f19701d);
                    if (c2446q2.f19701d == 1.0f) {
                        c2452c0.f19780n = null;
                    }
                    c2452c0.u();
                }
                break;
            default:
                this.f19706m.f19778l = ((Number) obj).longValue();
                break;
        }
        return W3.o.f6046a;
    }
}
