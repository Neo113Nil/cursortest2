package U;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;

/* renamed from: U.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0068h implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0070j c0070j = (C0070j) obj;
        C0070j c0070j2 = (C0070j) obj2;
        RecyclerView recyclerView = c0070j.f1565d;
        if ((recyclerView == null) == (c0070j2.f1565d == null)) {
            boolean z3 = c0070j.f1562a;
            if (z3 == c0070j2.f1562a) {
                int i3 = c0070j2.f1563b - c0070j.f1563b;
                if (i3 != 0) {
                    return i3;
                }
                int i4 = c0070j.f1564c - c0070j2.f1564c;
                if (i4 != 0) {
                    return i4;
                }
                return 0;
            }
            if (z3) {
                return -1;
            }
        } else if (recyclerView != null) {
            return -1;
        }
        return 1;
    }
}
