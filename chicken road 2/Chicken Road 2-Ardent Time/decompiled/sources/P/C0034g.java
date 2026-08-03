package P;

/* renamed from: P.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034g implements java.util.Comparator {
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
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        P.C0036i c0036i = (P.C0036i) obj;
        P.C0036i c0036i2 = (P.C0036i) obj2;
        androidx.recyclerview.widget.RecyclerView recyclerView = c0036i.f1276d;
        if ((recyclerView == null) == (c0036i2.f1276d == null)) {
            boolean z2 = c0036i.f1273a;
            if (z2 == c0036i2.f1273a) {
                int i2 = c0036i2.f1274b - c0036i.f1274b;
                if (i2 != 0) {
                    return i2;
                }
                int i3 = c0036i.f1275c - c0036i2.f1275c;
                if (i3 != 0) {
                    return i3;
                }
                return 0;
            }
        }
    }
}
