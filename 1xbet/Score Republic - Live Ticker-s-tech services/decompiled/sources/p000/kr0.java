package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class kr0 {

    /* JADX INFO: renamed from: a */
    public final List f4503a;

    /* JADX INFO: renamed from: b */
    public final int f4504b;

    public kr0(int i, List list) {
        this.f4503a = list;
        this.f4504b = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        throw new IllegalArgumentException(("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '" + i + "', bounds = '" + new be0(0, list.size() - 1, 1) + "'.").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kr0.class != obj.getClass()) {
            return false;
        }
        kr0 kr0Var = (kr0) obj;
        return this.f4504b == kr0Var.f4504b && af0.m187a(this.f4503a, kr0Var.f4503a);
    }

    public final int hashCode() {
        return this.f4503a.hashCode() + (this.f4504b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f4504b + ", mergedHistory=" + this.f4503a + ')';
    }

    public kr0() {
        this(-1, C0411kw.f4584j);
    }
}
