package B;

import E.Z;
import G1.C0140k;
import P.C0305m0;
import P.InterfaceC0289e0;
import P.d1;
import android.os.Bundle;
import p4.InterfaceC2280u;
import u.AbstractC2453d;
import u.AbstractC2462i;
import u.C2435F;
import u.C2438I;
import u.C2451c;
import u.C2463j;
import u.C2465l;
import u.m0;
import x.C2592m;
import x.C2595n0;
import x0.i0;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f707l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f708m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f709n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f710o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f711p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(1);
        this.f707l = i;
        this.f708m = obj;
        this.f709n = obj2;
        this.f710o = obj3;
        this.f711p = obj4;
    }

    /* JADX WARN: Type inference failed for: r14v12, types: [i4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r14v31, types: [i4.a, kotlin.jvm.internal.m] */
    @Override // i4.c
    public final Object c(Object obj) {
        boolean z3;
        switch (this.f707l) {
            case 0:
                v3.e eVar = new v3.e((q) this.f709n, (i0) this.f710o, (RunnableC0073b) this.f711p, 2);
                A a5 = (A) this.f708m;
                a5.f608c = eVar;
                break;
            case 1:
                Z z5 = (Z) this.f708m;
                if (z5.b()) {
                    kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
                    A.s sVar = new A.s(z5.f1091d, z5.f1105t, wVar, 3);
                    P0.x xVar = (P0.x) this.f709n;
                    P0.r rVar = xVar.f4682a;
                    rVar.d((P0.w) this.f710o, (P0.k) this.f711p, sVar, z5.f1106u);
                    P0.C c5 = new P0.C(xVar, rVar);
                    xVar.f4683b.set(c5);
                    wVar.f17624k = c5;
                    z5.f1092e = c5;
                }
                break;
            case 2:
                C0140k c0140k = (C0140k) obj;
                kotlin.jvm.internal.l.f("it", c0140k);
                ((kotlin.jvm.internal.s) this.f708m).f17620k = true;
                ((G1.E) this.f709n).a((G1.y) this.f710o, (Bundle) this.f711p, c0140k, X3.v.f6090k);
                break;
            case 3:
                C2463j c2463j = (C2463j) obj;
                C2451c c2451c = (C2451c) this.f708m;
                AbstractC2453d.n(c2463j, c2451c.f19762c);
                C0305m0 c0305m0 = c2463j.f19830e;
                Object a6 = C2451c.a(c2451c, c0305m0.getValue());
                boolean a7 = kotlin.jvm.internal.l.a(a6, c0305m0.getValue());
                i4.c cVar = (i4.c) this.f710o;
                if (!a7) {
                    c2451c.f19762c.f19846l.setValue(a6);
                    ((C2465l) this.f709n).f19846l.setValue(a6);
                    if (cVar != null) {
                        cVar.c(c2451c);
                    }
                    c2463j.i.setValue(Boolean.FALSE);
                    c2463j.f19829d.invoke();
                    ((kotlin.jvm.internal.s) this.f711p).f17620k = true;
                } else if (cVar != null) {
                    cVar.c(c2451c);
                }
                break;
            case 4:
                long longValue = ((Number) obj).longValue();
                d1 d1Var = (d1) ((InterfaceC0289e0) this.f708m).getValue();
                long longValue2 = d1Var != null ? ((Number) d1Var.getValue()).longValue() : longValue;
                C2438I c2438i = (C2438I) this.f709n;
                long j5 = c2438i.f19681c;
                R.e eVar2 = c2438i.f19679a;
                InterfaceC2280u interfaceC2280u = (InterfaceC2280u) this.f711p;
                int i = 0;
                kotlin.jvm.internal.t tVar = (kotlin.jvm.internal.t) this.f710o;
                if (j5 == Long.MIN_VALUE || tVar.f17621k != AbstractC2453d.i(interfaceC2280u.i())) {
                    c2438i.f19681c = longValue;
                    int i5 = eVar2.f5108m;
                    if (i5 > 0) {
                        Object[] objArr = eVar2.f5106k;
                        int i6 = 0;
                        do {
                            ((C2435F) objArr[i6]).f19667q = true;
                            i6++;
                        } while (i6 < i5);
                    }
                    tVar.f17621k = AbstractC2453d.i(interfaceC2280u.i());
                }
                float f = tVar.f17621k;
                if (f == 0.0f) {
                    int i7 = eVar2.f5108m;
                    if (i7 > 0) {
                        Object[] objArr2 = eVar2.f5106k;
                        do {
                            C2435F c2435f = (C2435F) objArr2[i];
                            c2435f.f19664n.setValue(c2435f.f19665o.f19876c);
                            c2435f.f19667q = true;
                            i++;
                        } while (i < i7);
                    }
                } else {
                    long j6 = (long) ((longValue2 - c2438i.f19681c) / f);
                    int i8 = eVar2.f5108m;
                    if (i8 > 0) {
                        Object[] objArr3 = eVar2.f5106k;
                        z3 = true;
                        int i9 = 0;
                        do {
                            C2435F c2435f2 = (C2435F) objArr3[i9];
                            if (!c2435f2.f19666p) {
                                c2435f2.f19669s.f19680b.setValue(Boolean.FALSE);
                                if (c2435f2.f19667q) {
                                    c2435f2.f19667q = false;
                                    c2435f2.f19668r = j6;
                                }
                                long j7 = j6 - c2435f2.f19668r;
                                c2435f2.f19664n.setValue(c2435f2.f19665o.c(j7));
                                m0 m0Var = c2435f2.f19665o;
                                m0Var.getClass();
                                c2435f2.f19666p = AbstractC2462i.a(m0Var, j7);
                            }
                            if (!c2435f2.f19666p) {
                                z3 = false;
                            }
                            i9++;
                        } while (i9 < i8);
                    } else {
                        z3 = true;
                    }
                    c2438i.f19682d.setValue(Boolean.valueOf(!z3));
                }
                break;
            default:
                C2463j c2463j2 = (C2463j) obj;
                float floatValue = ((Number) c2463j2.f19830e.getValue()).floatValue();
                kotlin.jvm.internal.t tVar2 = (kotlin.jvm.internal.t) this.f708m;
                float f5 = floatValue - tVar2.f17621k;
                float a8 = ((C2595n0) this.f709n).a(f5);
                tVar2.f17621k = ((Number) c2463j2.f19830e.getValue()).floatValue();
                ((kotlin.jvm.internal.t) this.f710o).f17621k = ((Number) c2463j2.f19826a.f19644b.c(c2463j2.f)).floatValue();
                if (Math.abs(f5 - a8) > 0.5f) {
                    c2463j2.i.setValue(Boolean.FALSE);
                    c2463j2.f19829d.invoke();
                }
                ((C2592m) this.f711p).getClass();
                break;
        }
        return W3.o.f6046a;
    }
}
