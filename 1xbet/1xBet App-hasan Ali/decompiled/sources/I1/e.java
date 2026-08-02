package I1;

import X3.v;
import java.util.List;
import l4.C2062d;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2573a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2574b;

    public e(int i, List list) {
        this.f2573a = list;
        this.f2574b = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        StringBuilder v4 = AbstractC2107A.v(i, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '");
        v4.append(new C2062d(0, list.size() - 1, 1));
        v4.append("'.");
        throw new IllegalArgumentException(v4.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f2574b == eVar.f2574b && kotlin.jvm.internal.l.a(this.f2573a, eVar.f2573a);
    }

    public final int hashCode() {
        return this.f2573a.hashCode() + (this.f2574b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f2574b + ", mergedHistory=" + this.f2573a + ')';
    }

    public e() {
        this(-1, v.f6090k);
    }
}
