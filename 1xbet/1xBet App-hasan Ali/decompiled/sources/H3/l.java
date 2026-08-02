package H3;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class l implements Comparator {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2333k;

    public /* synthetic */ l(int i) {
        this.f2333k = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2333k) {
            case 0:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                return N4.b.n(((M4.g) obj).f3635a, ((M4.g) obj2).f3635a);
        }
    }
}
