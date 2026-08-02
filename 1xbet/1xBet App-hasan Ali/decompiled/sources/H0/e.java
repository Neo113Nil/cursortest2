package H0;

import h0.C1989c;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class e implements Comparator {

    /* renamed from: l, reason: collision with root package name */
    public static final e f2068l = new e(0);

    /* renamed from: m, reason: collision with root package name */
    public static final e f2069m = new e(1);

    /* renamed from: n, reason: collision with root package name */
    public static final e f2070n = new e(2);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2071k;

    public /* synthetic */ e(int i) {
        this.f2071k = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2071k) {
            case 0:
                C1989c h3 = ((n) obj).h();
                C1989c h4 = ((n) obj2).h();
                int compare = Float.compare(h3.f17193a, h4.f17193a);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(h3.f17194b, h4.f17194b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(h3.f17196d, h4.f17196d);
                return compare3 != 0 ? compare3 : Float.compare(h3.f17195c, h4.f17195c);
            case 1:
                C1989c h5 = ((n) obj).h();
                C1989c h6 = ((n) obj2).h();
                int compare4 = Float.compare(h6.f17195c, h5.f17195c);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(h5.f17194b, h6.f17194b);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(h5.f17196d, h6.f17196d);
                return compare6 != 0 ? compare6 : Float.compare(h6.f17193a, h5.f17193a);
            default:
                W3.h hVar = (W3.h) obj;
                W3.h hVar2 = (W3.h) obj2;
                int compare7 = Float.compare(((C1989c) hVar.f6036k).f17194b, ((C1989c) hVar2.f6036k).f17194b);
                return compare7 != 0 ? compare7 : Float.compare(((C1989c) hVar.f6036k).f17196d, ((C1989c) hVar2.f6036k).f17196d);
        }
    }
}
