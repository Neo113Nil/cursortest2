package u2;

import x0.Y;
import x0.Z;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements i4.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f20026k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f20027l;

    public /* synthetic */ p(Z z3, int i) {
        this.f20026k = i;
        this.f20027l = z3;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        Y y5 = (Y) obj;
        switch (this.f20026k) {
            case 0:
                Y.g(y5, this.f20027l, 0, 0);
                break;
            default:
                Y.j(y5, this.f20027l, 0, 0);
                break;
        }
        return W3.o.f6046a;
    }
}
