package I3;

import I3.n;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return com.google.common.collect.r.i().e((n.i) Collections.max(list, new Comparator() { // from class: I3.w
            @Override // java.util.Comparator
            public final int compare(Object obj3, Object obj4) {
                return n.i.d((n.i) obj3, (n.i) obj4);
            }
        }), (n.i) Collections.max(list2, new Comparator() { // from class: I3.w
            @Override // java.util.Comparator
            public final int compare(Object obj3, Object obj4) {
                return n.i.d((n.i) obj3, (n.i) obj4);
            }
        }), new Comparator() { // from class: I3.w
            @Override // java.util.Comparator
            public final int compare(Object obj3, Object obj4) {
                return n.i.d((n.i) obj3, (n.i) obj4);
            }
        }).d(list.size(), list2.size()).e((n.i) Collections.max(list, new Comparator() { // from class: I3.x
            @Override // java.util.Comparator
            public final int compare(Object obj3, Object obj4) {
                return n.i.c((n.i) obj3, (n.i) obj4);
            }
        }), (n.i) Collections.max(list2, new Comparator() { // from class: I3.x
            @Override // java.util.Comparator
            public final int compare(Object obj3, Object obj4) {
                return n.i.c((n.i) obj3, (n.i) obj4);
            }
        }), new Comparator() { // from class: I3.x
            @Override // java.util.Comparator
            public final int compare(Object obj3, Object obj4) {
                return n.i.c((n.i) obj3, (n.i) obj4);
            }
        }).h();
    }
}
