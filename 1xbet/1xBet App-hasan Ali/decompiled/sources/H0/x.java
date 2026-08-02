package H0;

import java.util.Comparator;
import z0.C2731G;

/* loaded from: classes.dex */
public final class x implements Comparator {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2189k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Comparator f2190l;

    public x(x xVar) {
        this.f2190l = xVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2189k) {
            case 0:
                int compare = this.f2190l.compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return C2731G.f21599c0.compare(((n) obj).f2113c, ((n) obj2).f2113c);
            default:
                int compare2 = ((x) this.f2190l).compare(obj, obj2);
                return compare2 != 0 ? compare2 : N4.b.n(Integer.valueOf(((n) obj).f2116g), Integer.valueOf(((n) obj2).f2116g));
        }
    }

    public x(Comparator comparator) {
        this.f2190l = comparator;
    }
}
