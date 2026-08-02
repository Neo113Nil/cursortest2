package x0;

import E.D0;
import java.util.ArrayList;
import java.util.List;
import z0.AbstractC2728D;

/* loaded from: classes.dex */
public final class c0 extends AbstractC2728D {

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f20987b = new c0("Undefined intrinsics block and it is required");

    @Override // x0.O
    public final P c(Q q5, List list, long j5) {
        int size = list.size();
        X3.w wVar = X3.w.f6091k;
        if (size == 0) {
            return q5.i(W0.a.j(j5), W0.a.i(j5), wVar, a0.f20980n);
        }
        if (size == 1) {
            Z e3 = ((N) list.get(0)).e(j5);
            return q5.i(W0.b.g(e3.f20973k, j5), W0.b.f(e3.f20974l, j5), wVar, new D0(e3, 6));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int i = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < size2; i6++) {
            Z e5 = ((N) list.get(i6)).e(j5);
            i = Math.max(e5.f20973k, i);
            i5 = Math.max(e5.f20974l, i5);
            arrayList.add(e5);
        }
        return q5.i(W0.b.g(i, j5), W0.b.f(i5, j5), wVar, new I.J(4, arrayList));
    }
}
