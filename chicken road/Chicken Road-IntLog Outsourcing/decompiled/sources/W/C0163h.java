package W;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;

/* renamed from: W.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0163h implements Comparator {
    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
    
        if (r0 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r0 == null) goto L13;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        C0165j c0165j = (C0165j) obj;
        C0165j c0165j2 = (C0165j) obj2;
        RecyclerView recyclerView = c0165j.f3345d;
        if ((recyclerView == null) == (c0165j2.f3345d == null)) {
            boolean z = c0165j.f3342a;
            if (z == c0165j2.f3342a) {
                int i2 = c0165j2.f3343b - c0165j.f3343b;
                if (i2 != 0) {
                    return i2;
                }
                int i3 = c0165j.f3344c - c0165j2.f3344c;
                if (i3 != 0) {
                    return i3;
                }
                return 0;
            }
        }
    }
}
