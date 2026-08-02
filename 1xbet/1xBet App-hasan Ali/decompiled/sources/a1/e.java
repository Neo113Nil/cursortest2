package a1;

import E.D0;
import I.J;
import java.util.ArrayList;
import java.util.List;
import n.AbstractC2107A;
import x0.InterfaceC2632s;
import x0.N;
import x0.O;
import x0.P;
import x0.Q;
import x0.Z;

/* loaded from: classes.dex */
public final class e implements O {

    /* renamed from: b, reason: collision with root package name */
    public static final e f6392b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f6393c = new e(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6394a;

    public /* synthetic */ e(int i) {
        this.f6394a = i;
    }

    @Override // x0.O
    public final /* synthetic */ int a(InterfaceC2632s interfaceC2632s, List list, int i) {
        int i5 = this.f6394a;
        return AbstractC2107A.h(this, interfaceC2632s, list, i);
    }

    @Override // x0.O
    public final /* synthetic */ int b(InterfaceC2632s interfaceC2632s, List list, int i) {
        int i5 = this.f6394a;
        return AbstractC2107A.k(this, interfaceC2632s, list, i);
    }

    @Override // x0.O
    public final P c(Q q5, List list, long j5) {
        switch (this.f6394a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < size; i6++) {
                    Z e3 = ((N) list.get(i6)).e(j5);
                    i = Math.max(i, e3.f20973k);
                    i5 = Math.max(i5, e3.f20974l);
                    arrayList.add(e3);
                }
                if (list.isEmpty()) {
                    i = W0.a.j(j5);
                    i5 = W0.a.i(j5);
                }
                return q5.i(i, i5, X3.w.f6091k, new J(1, arrayList));
            default:
                int size2 = list.size();
                X3.w wVar = X3.w.f6091k;
                if (size2 == 0) {
                    return q5.i(0, 0, wVar, c.f6385q);
                }
                if (size2 == 1) {
                    Z e5 = ((N) list.get(0)).e(j5);
                    return q5.i(e5.f20973k, e5.f20974l, wVar, new D0(e5, 2));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int i7 = 0;
                int i8 = 0;
                for (int i9 = 0; i9 < size3; i9++) {
                    Z e6 = ((N) list.get(i9)).e(j5);
                    i7 = Math.max(i7, e6.f20973k);
                    i8 = Math.max(i8, e6.f20974l);
                    arrayList2.add(e6);
                }
                return q5.i(i7, i8, wVar, new J(2, arrayList2));
        }
    }

    @Override // x0.O
    public final /* synthetic */ int h(InterfaceC2632s interfaceC2632s, List list, int i) {
        int i5 = this.f6394a;
        return AbstractC2107A.b(this, interfaceC2632s, list, i);
    }

    @Override // x0.O
    public final /* synthetic */ int j(InterfaceC2632s interfaceC2632s, List list, int i) {
        int i5 = this.f6394a;
        return AbstractC2107A.e(this, interfaceC2632s, list, i);
    }
}
