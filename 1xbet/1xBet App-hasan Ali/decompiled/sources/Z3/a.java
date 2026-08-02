package Z3;

import java.util.Comparator;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class a implements Comparator {

    /* renamed from: l, reason: collision with root package name */
    public static final a f6354l = new a(0);

    /* renamed from: m, reason: collision with root package name */
    public static final a f6355m = new a(1);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6356k;

    public /* synthetic */ a(int i) {
        this.f6356k = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f6356k) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                l.f("a", comparable);
                l.f("b", comparable2);
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                l.f("a", comparable3);
                l.f("b", comparable4);
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f6356k) {
            case 0:
                return f6355m;
            default:
                return f6354l;
        }
    }
}
