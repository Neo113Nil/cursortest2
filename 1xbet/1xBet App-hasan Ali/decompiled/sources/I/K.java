package I;

import java.util.ArrayList;
import java.util.List;
import n.AbstractC2107A;
import x0.InterfaceC2632s;
import x0.Z;

/* loaded from: classes.dex */
public final class K implements x0.O {

    /* renamed from: a, reason: collision with root package name */
    public static final K f2411a = new K();

    @Override // x0.O
    public final /* synthetic */ int a(InterfaceC2632s interfaceC2632s, List list, int i) {
        return AbstractC2107A.h(this, interfaceC2632s, list, i);
    }

    @Override // x0.O
    public final /* synthetic */ int b(InterfaceC2632s interfaceC2632s, List list, int i) {
        return AbstractC2107A.k(this, interfaceC2632s, list, i);
    }

    @Override // x0.O
    public final x0.P c(x0.Q q5, List list, long j5) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        Integer num = 0;
        for (int i = 0; i < size; i++) {
            arrayList.add(((x0.N) list.get(i)).e(j5));
        }
        int size2 = arrayList.size();
        Integer num2 = num;
        for (int i5 = 0; i5 < size2; i5++) {
            num2 = Integer.valueOf(Math.max(num2.intValue(), ((Z) arrayList.get(i5)).f20973k));
        }
        int intValue = num2.intValue();
        int size3 = arrayList.size();
        for (int i6 = 0; i6 < size3; i6++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((Z) arrayList.get(i6)).f20974l));
        }
        return q5.i(intValue, num.intValue(), X3.w.f6091k, new J(0, arrayList));
    }

    @Override // x0.O
    public final /* synthetic */ int h(InterfaceC2632s interfaceC2632s, List list, int i) {
        return AbstractC2107A.b(this, interfaceC2632s, list, i);
    }

    @Override // x0.O
    public final /* synthetic */ int j(InterfaceC2632s interfaceC2632s, List list, int i) {
        return AbstractC2107A.e(this, interfaceC2632s, list, i);
    }
}
