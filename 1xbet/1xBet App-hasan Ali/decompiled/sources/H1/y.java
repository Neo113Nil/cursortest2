package H1;

import A0.C0022e0;
import G1.C0140k;
import P.C0315s;
import P.InterfaceC0289e0;
import P.d1;
import a.AbstractC0444a;
import java.util.List;
import java.util.ListIterator;
import t.C2396h;
import u.C2452c0;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.m implements i4.g {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2452c0 f2267l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0140k f2268m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y.d f2269n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f2270o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d1 f2271p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C2452c0 c2452c0, C0140k c0140k, Y.d dVar, InterfaceC0289e0 interfaceC0289e0, d1 d1Var) {
        super(4);
        this.f2267l = c2452c0;
        this.f2268m = c0140k;
        this.f2269n = dVar;
        this.f2270o = interfaceC0289e0;
        this.f2271p = d1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // i4.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        C0140k c0140k;
        C2396h c2396h = (C2396h) obj;
        C0140k c0140k2 = (C0140k) obj2;
        C0315s c0315s = (C0315s) obj3;
        ((Number) obj4).intValue();
        boolean a5 = kotlin.jvm.internal.l.a(this.f2267l.f19771c.getValue(), this.f2268m);
        if (!((Boolean) this.f2270o.getValue()).booleanValue() && !a5) {
            List list = (List) this.f2271p.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c0140k = 0;
                    break;
                }
                c0140k = listIterator.previous();
                if (kotlin.jvm.internal.l.a(c0140k2, (C0140k) c0140k)) {
                    break;
                }
            }
            c0140k2 = c0140k;
        }
        if (c0140k2 != null) {
            AbstractC0444a.c(c0140k2, this.f2269n, X.e.d(-1263531443, new C0022e0(7, c0140k2, c2396h), c0315s), c0315s, 384);
        }
        return W3.o.f6046a;
    }
}
