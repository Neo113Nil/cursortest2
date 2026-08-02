package H0;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements Comparator {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2187k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Serializable f2188l;

    public /* synthetic */ w(int i, Serializable serializable) {
        this.f2187k = i;
        this.f2188l = serializable;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2187k) {
            case 0:
                return ((Number) ((r) this.f2188l).invoke(obj, obj2)).intValue();
            default:
                for (i4.c cVar : (i4.c[]) this.f2188l) {
                    int n5 = N4.b.n((Comparable) cVar.c(obj), (Comparable) cVar.c(obj2));
                    if (n5 != 0) {
                        return n5;
                    }
                }
                return 0;
        }
    }
}
