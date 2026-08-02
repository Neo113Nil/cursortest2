package H0;

import A.B;
import h0.C1989c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import r.AbstractC2334l;
import r.C2343v;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator[] f2191a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f2192b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new x(new x(i == 0 ? e.f2069m : e.f2068l));
            i++;
        }
        f2191a = comparatorArr;
        f2192b = r.f2128E;
    }

    public static final void a(n nVar, ArrayList arrayList, B b3, B b5, C2343v c2343v) {
        j jVar = nVar.f2114d;
        Object g5 = jVar.f2103k.g(s.f2167m);
        if (g5 == null) {
            g5 = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) g5).booleanValue();
        if ((booleanValue || ((Boolean) b5.c(nVar)).booleanValue()) && ((Boolean) b3.c(nVar)).booleanValue()) {
            arrayList.add(nVar);
        }
        if (booleanValue) {
            c2343v.g(nVar.f2116g, b(nVar, b3, b5, n.j(7, nVar)));
            return;
        }
        List j5 = n.j(7, nVar);
        int size = j5.size();
        for (int i = 0; i < size; i++) {
            a((n) j5.get(i), arrayList, b3, b5, c2343v);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f2 A[LOOP:1: B:11:0x0044->B:29:0x00f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f9 A[EDGE_INSN: B:30:0x00f9->B:31:0x00f9 BREAK  A[LOOP:1: B:11:0x0044->B:29:0x00f2], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList b(n nVar, B b3, B b5, List list) {
        int i;
        int i5;
        int i6;
        int i7 = 1;
        C2343v c2343v = AbstractC2334l.f19016a;
        C2343v c2343v2 = new C2343v();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            a((n) list.get(i8), arrayList, b3, b5, c2343v2);
        }
        char c5 = nVar.f2113c.f21608I == W0.m.f6017l ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int N5 = X3.n.N(arrayList);
        if (N5 >= 0) {
            int i9 = 0;
            while (true) {
                n nVar2 = (n) arrayList.get(i9);
                if (i9 != 0) {
                    C1989c h3 = nVar2.h();
                    C1989c h4 = nVar2.h();
                    float f = h3.f17194b;
                    float f5 = h4.f17196d;
                    int i10 = f >= f5 ? i7 : 0;
                    int N6 = X3.n.N(arrayList2);
                    if (N6 >= 0) {
                        int i11 = 0;
                        while (true) {
                            C1989c c1989c = (C1989c) ((W3.h) arrayList2.get(i11)).f6036k;
                            i = 0;
                            float f6 = c1989c.f17194b;
                            i5 = i7;
                            float f7 = c1989c.f17196d;
                            int i12 = f6 >= f7 ? i5 : 0;
                            if (i10 == 0 && i12 == 0 && Math.max(f, f6) < Math.min(f5, f7)) {
                                arrayList2.set(i11, new W3.h(new C1989c(Math.max(c1989c.f17193a, 0.0f), Math.max(c1989c.f17194b, f), Math.min(c1989c.f17195c, Float.POSITIVE_INFINITY), Math.min(f7, f5)), ((W3.h) arrayList2.get(i11)).f6037l));
                                ((List) ((W3.h) arrayList2.get(i11)).f6037l).add(nVar2);
                                i6 = i5;
                                break;
                            }
                            if (i11 == N6) {
                                break;
                            }
                            i11++;
                            i7 = i5;
                        }
                        if (i9 != N5) {
                            break;
                        }
                        i9 += i6;
                        i7 = i6;
                    }
                }
                i5 = i7;
                i = 0;
                C1989c h5 = nVar2.h();
                i6 = i5;
                n[] nVarArr = new n[i6];
                nVarArr[i] = nVar2;
                arrayList2.add(new W3.h(h5, X3.n.P(nVarArr)));
                if (i9 != N5) {
                }
            }
        } else {
            i = 0;
        }
        X3.r.T(arrayList2, e.f2070n);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = f2191a[c5 ^ 1];
        int size2 = arrayList2.size();
        for (int i13 = i; i13 < size2; i13++) {
            W3.h hVar = (W3.h) arrayList2.get(i13);
            X3.r.T((List) hVar.f6037l, comparator);
            arrayList3.addAll((Collection) hVar.f6037l);
        }
        int i14 = i;
        X3.r.T(arrayList3, new w(i14, f2192b));
        while (i14 <= X3.n.N(arrayList3)) {
            List list2 = (List) c2343v2.b(((n) arrayList3.get(i14)).f2116g);
            if (list2 != null) {
                if (((Boolean) b5.c(arrayList3.get(i14))).booleanValue()) {
                    i14++;
                } else {
                    arrayList3.remove(i14);
                }
                arrayList3.addAll(i14, list2);
                i14 += list2.size();
            } else {
                i14++;
            }
        }
        return arrayList3;
    }
}
