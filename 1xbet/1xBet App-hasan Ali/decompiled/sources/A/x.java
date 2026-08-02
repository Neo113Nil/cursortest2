package A;

import B.M;
import x0.Y;
import x0.Z;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f138l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f139m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f140n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i, int i5, Object obj) {
        super(1);
        this.f138l = i5;
        this.f140n = obj;
        this.f139m = i;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f138l) {
            case 0:
                B.y yVar = (B.y) obj;
                C0001a c0001a = ((E) this.f140n).f9a;
                Z.f d5 = Z.q.d();
                Z.q.k(d5, Z.q.g(d5), d5 != null ? d5.e() : null);
                for (int i = 0; i < 2; i++) {
                    int i5 = this.f139m + i;
                    yVar.getClass();
                    long j5 = B.B.f609a;
                    B.A a5 = yVar.f725b;
                    v3.e eVar = a5.f608c;
                    if (eVar != null) {
                        yVar.f724a.add(new M(eVar, i5, j5, a5.f607b));
                    }
                }
                return W3.o.f6046a;
            case 1:
                Y.g((Y) obj, (Z) this.f140n, 0, -this.f139m);
                return W3.o.f6046a;
            default:
                Boolean valueOf = Boolean.valueOf(((g0.s) obj).C0(this.f139m));
                ((kotlin.jvm.internal.w) this.f140n).f17624k = valueOf;
                return valueOf;
        }
    }
}
