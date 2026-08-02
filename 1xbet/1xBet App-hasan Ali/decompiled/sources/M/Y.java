package M;

import a.AbstractC0444a;
import h0.C1991e;
import java.util.List;
import java.util.NoSuchElementException;
import x0.InterfaceC2632s;
import z.C2681E;

/* loaded from: classes.dex */
public final class Y implements x0.O {

    /* renamed from: a, reason: collision with root package name */
    public final i4.c f3275a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3276b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3277c;

    /* renamed from: d, reason: collision with root package name */
    public final C2681E f3278d;

    public Y(i4.c cVar, boolean z3, float f, C2681E c2681e) {
        this.f3275a = cVar;
        this.f3276b = z3;
        this.f3277c = f;
        this.f3278d = c2681e;
    }

    @Override // x0.O
    public final int a(InterfaceC2632s interfaceC2632s, List list, int i) {
        return d(interfaceC2632s, list, i, W.f3259o);
    }

    @Override // x0.O
    public final int b(InterfaceC2632s interfaceC2632s, List list, int i) {
        return e(interfaceC2632s, list, i, W.f3260p);
    }

    @Override // x0.O
    public final x0.P c(x0.Q q5, List list, long j5) {
        Object obj;
        int i;
        Object obj2;
        int i5;
        x0.Z z3;
        Object obj3;
        x0.Z z5;
        int i6;
        x0.Z z6;
        Object obj4;
        int i7;
        x0.Z z7;
        Object obj5;
        int i8;
        Object obj6;
        Object obj7;
        Y y5 = this;
        List list2 = list;
        int i9 = 1;
        C2681E c2681e = y5.f3278d;
        int K = q5.K(c2681e.f21477d);
        long a5 = W0.a.a(j5, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i10);
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a((x0.N) obj), "Leading")) {
                break;
            }
            i10++;
        }
        x0.N n5 = (x0.N) obj;
        x0.Z e3 = n5 != null ? n5.e(a5) : null;
        float f = N.n.f3709b;
        int i11 = e3 != null ? e3.f20973k : 0;
        int max = Math.max(0, e3 != null ? e3.f20974l : 0);
        int size2 = list2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                i = i9;
                obj2 = null;
                break;
            }
            obj2 = list2.get(i12);
            i = i9;
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a((x0.N) obj2), "Trailing")) {
                break;
            }
            i12++;
            i9 = i;
        }
        x0.N n6 = (x0.N) obj2;
        if (n6 != null) {
            i5 = i11;
            z3 = n6.e(W0.b.j(-i11, 0, 2, a5));
        } else {
            i5 = i11;
            z3 = null;
        }
        int i13 = (z3 != null ? z3.f20973k : 0) + i5;
        int max2 = Math.max(max, z3 != null ? z3.f20974l : 0);
        int size3 = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i14);
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a((x0.N) obj3), "Prefix")) {
                break;
            }
            i14++;
        }
        x0.N n7 = (x0.N) obj3;
        if (n7 != null) {
            z5 = z3;
            i6 = i13;
            z6 = n7.e(W0.b.j(-i13, 0, 2, a5));
        } else {
            z5 = z3;
            i6 = i13;
            z6 = null;
        }
        int i15 = i6 + (z6 != null ? z6.f20973k : 0);
        int max3 = Math.max(max2, z6 != null ? z6.f20974l : 0);
        int size4 = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i16);
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a((x0.N) obj4), "Suffix")) {
                break;
            }
            i16++;
        }
        x0.N n8 = (x0.N) obj4;
        if (n8 != null) {
            i7 = i15;
            z7 = n8.e(W0.b.j(-i15, 0, 2, a5));
        } else {
            i7 = i15;
            z7 = null;
        }
        int i17 = (z7 != null ? z7.f20973k : 0) + i7;
        int max4 = Math.max(max3, z7 != null ? z7.f20974l : 0);
        int K5 = q5.K(c2681e.b(q5.getLayoutDirection())) + q5.K(c2681e.a(q5.getLayoutDirection()));
        int i18 = -i17;
        int G5 = G4.d.G(y5.f3277c, i18 - K5, -K5);
        int i19 = -K;
        long i20 = W0.b.i(G5, i19, a5);
        int size5 = list2.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list2.get(i21);
            int i22 = i21;
            int i23 = size5;
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a((x0.N) obj5), "Label")) {
                break;
            }
            i21 = i22 + 1;
            size5 = i23;
        }
        x0.N n9 = (x0.N) obj5;
        x0.Z e5 = n9 != null ? n9.e(i20) : null;
        y5.f3275a.c(new C1991e(e5 != null ? AbstractC0444a.d(e5.f20973k, e5.f20974l) : 0L));
        int size6 = list2.size();
        int i24 = 0;
        while (true) {
            if (i24 >= size6) {
                i8 = i19;
                obj6 = null;
                break;
            }
            obj6 = list2.get(i24);
            int i25 = size6;
            i8 = i19;
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a((x0.N) obj6), "Supporting")) {
                break;
            }
            i24++;
            i19 = i8;
            size6 = i25;
        }
        x0.N n10 = (x0.N) obj6;
        int U4 = n10 != null ? n10.U(W0.a.j(j5)) : 0;
        int max5 = Math.max((e5 != null ? e5.f20974l : 0) / 2, q5.K(c2681e.f21475b));
        long a6 = W0.a.a(W0.b.i(i18, (i8 - max5) - U4, j5), 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i26 = 0;
        while (i26 < size7) {
            x0.N n11 = (x0.N) list2.get(i26);
            int i27 = i26;
            int i28 = size7;
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a(n11), "TextField")) {
                x0.Z e6 = n11.e(a6);
                long a7 = W0.a.a(a6, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i29 = 0;
                while (true) {
                    if (i29 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i29);
                    int i30 = size8;
                    int i31 = i29;
                    if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a((x0.N) obj7), "Hint")) {
                        break;
                    }
                    i29 = i31 + 1;
                    size8 = i30;
                }
                x0.N n12 = (x0.N) obj7;
                x0.Z e7 = n12 != null ? n12.e(a7) : null;
                int max6 = Math.max(max4, Math.max(e6.f20974l, e7 != null ? e7.f20974l : 0) + max5 + K);
                x0.Z z8 = z5;
                int d5 = V.d(e3 != null ? e3.f20973k : 0, z5 != null ? z8.f20973k : 0, z6 != null ? z6.f20973k : 0, z7 != null ? z7.f20973k : 0, e6.f20973k, e5 != null ? e5.f20973k : 0, e7 != null ? e7.f20973k : 0, y5.f3277c, j5, q5.c(), y5.f3278d);
                x0.Z e8 = n10 != null ? n10.e(W0.a.a(W0.b.j(0, -max6, i, a5), 0, d5, 0, 0, 9)) : null;
                int i32 = e8 != null ? e8.f20974l : 0;
                int c5 = V.c(e3 != null ? e3.f20974l : 0, z8 != null ? z8.f20974l : 0, z6 != null ? z6.f20974l : 0, z7 != null ? z7.f20974l : 0, e6.f20974l, e5 != null ? e5.f20974l : 0, e7 != null ? e7.f20974l : 0, e8 != null ? e8.f20974l : 0, y5.f3277c, j5, q5.c(), y5.f3278d);
                int i33 = c5 - i32;
                int size9 = list2.size();
                int i34 = 0;
                while (i34 < size9) {
                    x0.N n13 = (x0.N) list2.get(i34);
                    int i35 = c5;
                    if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a(n13), "Container")) {
                        return q5.i(d5, i35, X3.w.f6091k, new X(i35, d5, e3, z8, z6, z7, e6, e5, e7, n13.e(W0.b.a(d5 != Integer.MAX_VALUE ? d5 : 0, d5, i33 != Integer.MAX_VALUE ? i33 : 0, i33)), e8, y5, q5));
                    }
                    c5 = i35;
                    i34++;
                    e3 = e3;
                    e5 = e5;
                    y5 = this;
                    list2 = list;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i26 = i27 + 1;
            e3 = e3;
            e5 = e5;
            y5 = this;
            size7 = i28;
            a6 = a6;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int d(InterfaceC2632s interfaceC2632s, List list, int i, i4.e eVar) {
        Object obj;
        int i5;
        int i6;
        Object obj2;
        int i7;
        Object obj3;
        Object obj4;
        int i8;
        Object obj5;
        int i9;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i10);
            if (kotlin.jvm.internal.l.a(N.n.d((x0.N) obj), "Leading")) {
                break;
            }
            i10++;
        }
        x0.N n5 = (x0.N) obj;
        if (n5 != null) {
            i5 = i == Integer.MAX_VALUE ? i : i - n5.T(Integer.MAX_VALUE);
            i6 = ((Number) eVar.invoke(n5, Integer.valueOf(i))).intValue();
        } else {
            i5 = i;
            i6 = 0;
        }
        int size2 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i11);
            if (kotlin.jvm.internal.l.a(N.n.d((x0.N) obj2), "Trailing")) {
                break;
            }
            i11++;
        }
        x0.N n6 = (x0.N) obj2;
        if (n6 != null) {
            int T4 = n6.T(Integer.MAX_VALUE);
            if (i5 != Integer.MAX_VALUE) {
                i5 -= T4;
            }
            i7 = ((Number) eVar.invoke(n6, Integer.valueOf(i))).intValue();
        } else {
            i7 = 0;
        }
        int size3 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i12);
            if (kotlin.jvm.internal.l.a(N.n.d((x0.N) obj3), "Label")) {
                break;
            }
            i12++;
        }
        Object obj8 = (x0.N) obj3;
        int intValue = obj8 != null ? ((Number) eVar.invoke(obj8, Integer.valueOf(G4.d.G(this.f3277c, i5, i)))).intValue() : 0;
        int size4 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i13);
            if (kotlin.jvm.internal.l.a(N.n.d((x0.N) obj4), "Prefix")) {
                break;
            }
            i13++;
        }
        x0.N n7 = (x0.N) obj4;
        if (n7 != null) {
            i8 = ((Number) eVar.invoke(n7, Integer.valueOf(i5))).intValue();
            int T5 = n7.T(Integer.MAX_VALUE);
            if (i5 != Integer.MAX_VALUE) {
                i5 -= T5;
            }
        } else {
            i8 = 0;
        }
        int size5 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i14);
            if (kotlin.jvm.internal.l.a(N.n.d((x0.N) obj5), "Suffix")) {
                break;
            }
            i14++;
        }
        x0.N n8 = (x0.N) obj5;
        if (n8 != null) {
            int intValue2 = ((Number) eVar.invoke(n8, Integer.valueOf(i5))).intValue();
            int T6 = n8.T(Integer.MAX_VALUE);
            if (i5 != Integer.MAX_VALUE) {
                i5 -= T6;
            }
            i9 = intValue2;
        } else {
            i9 = 0;
        }
        int size6 = list.size();
        for (int i15 = 0; i15 < size6; i15++) {
            Object obj9 = list.get(i15);
            if (kotlin.jvm.internal.l.a(N.n.d((x0.N) obj9), "TextField")) {
                int intValue3 = ((Number) eVar.invoke(obj9, Integer.valueOf(i5))).intValue();
                int size7 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i16);
                    if (kotlin.jvm.internal.l.a(N.n.d((x0.N) obj6), "Hint")) {
                        break;
                    }
                    i16++;
                }
                Object obj10 = (x0.N) obj6;
                int intValue4 = obj10 != null ? ((Number) eVar.invoke(obj10, Integer.valueOf(i5))).intValue() : 0;
                int size8 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i17);
                    if (kotlin.jvm.internal.l.a(N.n.d((x0.N) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i17++;
                }
                Object obj12 = (x0.N) obj7;
                return V.c(i6, i7, i8, i9, intValue3, intValue, intValue4, obj12 != null ? ((Number) eVar.invoke(obj12, Integer.valueOf(i))).intValue() : 0, this.f3277c, N.n.f3708a, interfaceC2632s.c(), this.f3278d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int e(InterfaceC2632s interfaceC2632s, List list, int i, i4.e eVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj7 = list.get(i5);
            if (kotlin.jvm.internal.l.a(N.n.d((x0.N) obj7), "TextField")) {
                int intValue = ((Number) eVar.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i6 = 0;
                while (true) {
                    obj = null;
                    if (i6 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i6);
                    if (kotlin.jvm.internal.l.a(N.n.d((x0.N) obj2), "Label")) {
                        break;
                    }
                    i6++;
                }
                x0.N n5 = (x0.N) obj2;
                int intValue2 = n5 != null ? ((Number) eVar.invoke(n5, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i7);
                    if (kotlin.jvm.internal.l.a(N.n.d((x0.N) obj3), "Trailing")) {
                        break;
                    }
                    i7++;
                }
                x0.N n6 = (x0.N) obj3;
                int intValue3 = n6 != null ? ((Number) eVar.invoke(n6, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i8);
                    if (kotlin.jvm.internal.l.a(N.n.d((x0.N) obj4), "Leading")) {
                        break;
                    }
                    i8++;
                }
                x0.N n7 = (x0.N) obj4;
                int intValue4 = n7 != null ? ((Number) eVar.invoke(n7, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i9);
                    if (kotlin.jvm.internal.l.a(N.n.d((x0.N) obj5), "Prefix")) {
                        break;
                    }
                    i9++;
                }
                x0.N n8 = (x0.N) obj5;
                int intValue5 = n8 != null ? ((Number) eVar.invoke(n8, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i10);
                    if (kotlin.jvm.internal.l.a(N.n.d((x0.N) obj6), "Suffix")) {
                        break;
                    }
                    i10++;
                }
                x0.N n9 = (x0.N) obj6;
                int intValue6 = n9 != null ? ((Number) eVar.invoke(n9, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i11);
                    if (kotlin.jvm.internal.l.a(N.n.d((x0.N) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i11++;
                }
                x0.N n10 = (x0.N) obj;
                return V.d(intValue4, intValue3, intValue5, intValue6, intValue, intValue2, n10 != null ? ((Number) eVar.invoke(n10, Integer.valueOf(i))).intValue() : 0, this.f3277c, N.n.f3708a, interfaceC2632s.c(), this.f3278d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // x0.O
    public final int h(InterfaceC2632s interfaceC2632s, List list, int i) {
        return d(interfaceC2632s, list, i, W.f3257m);
    }

    @Override // x0.O
    public final int j(InterfaceC2632s interfaceC2632s, List list, int i) {
        return e(interfaceC2632s, list, i, W.f3258n);
    }
}
