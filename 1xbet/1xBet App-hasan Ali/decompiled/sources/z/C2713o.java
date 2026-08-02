package z;

import java.util.List;
import n.AbstractC2107A;
import x0.InterfaceC2632s;
import x0.Z;

/* renamed from: z.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2713o implements x0.O {

    /* renamed from: a, reason: collision with root package name */
    public final b0.d f21562a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21563b;

    public C2713o(b0.d dVar, boolean z3) {
        this.f21562a = dVar;
        this.f21563b = z3;
    }

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
        boolean isEmpty = list.isEmpty();
        X3.w wVar = X3.w.f6091k;
        if (isEmpty) {
            return q5.i(W0.a.j(j5), W0.a.i(j5), wVar, C2708j.f21541n);
        }
        long a5 = this.f21563b ? j5 : W0.a.a(j5, 0, 0, 0, 0, 10);
        if (list.size() == 1) {
            x0.N n5 = (x0.N) list.get(0);
            boolean z3 = n5.k() instanceof C2707i;
            Z e3 = n5.e(a5);
            int max = Math.max(W0.a.j(j5), e3.f20973k);
            int max2 = Math.max(W0.a.i(j5), e3.f20974l);
            return q5.i(max, max2, wVar, new C2711m(e3, n5, q5, max, max2, this));
        }
        Z[] zArr = new Z[list.size()];
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        uVar.f17622k = W0.a.j(j5);
        kotlin.jvm.internal.u uVar2 = new kotlin.jvm.internal.u();
        uVar2.f17622k = W0.a.i(j5);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            x0.N n6 = (x0.N) list.get(i);
            boolean z5 = n6.k() instanceof C2707i;
            Z e5 = n6.e(a5);
            zArr[i] = e5;
            uVar.f17622k = Math.max(uVar.f17622k, e5.f20973k);
            uVar2.f17622k = Math.max(uVar2.f17622k, e5.f20974l);
        }
        return q5.i(uVar.f17622k, uVar2.f17622k, wVar, new C2712n(zArr, list, q5, uVar, uVar2, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2713o)) {
            return false;
        }
        C2713o c2713o = (C2713o) obj;
        return kotlin.jvm.internal.l.a(this.f21562a, c2713o.f21562a) && this.f21563b == c2713o.f21563b;
    }

    @Override // x0.O
    public final /* synthetic */ int h(InterfaceC2632s interfaceC2632s, List list, int i) {
        return AbstractC2107A.b(this, interfaceC2632s, list, i);
    }

    public final int hashCode() {
        return (this.f21562a.hashCode() * 31) + (this.f21563b ? 1231 : 1237);
    }

    @Override // x0.O
    public final /* synthetic */ int j(InterfaceC2632s interfaceC2632s, List list, int i) {
        return AbstractC2107A.e(this, interfaceC2632s, list, i);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f21562a + ", propagateMinConstraints=" + this.f21563b + ')';
    }
}
