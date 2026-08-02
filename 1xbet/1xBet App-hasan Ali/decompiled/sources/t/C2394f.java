package t;

import a.AbstractC0444a;
import x0.Y;
import x0.Z;

/* renamed from: t.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2394f extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z[] f19373l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2395g f19374m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f19375n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f19376o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2394f(Z[] zArr, C2395g c2395g, int i, int i5) {
        super(1);
        this.f19373l = zArr;
        this.f19374m = c2395g;
        this.f19375n = i;
        this.f19376o = i5;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        Y y5 = (Y) obj;
        for (Z z3 : this.f19373l) {
            if (z3 != null) {
                long a5 = this.f19374m.f19377a.f19386b.a(AbstractC0444a.b(z3.f20973k, z3.f20974l), AbstractC0444a.b(this.f19375n, this.f19376o), W0.m.f6016k);
                Y.g(y5, z3, (int) (a5 >> 32), (int) (a5 & 4294967295L));
            }
        }
        return W3.o.f6046a;
    }
}
