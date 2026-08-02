package E;

/* loaded from: classes8.dex */
public final class B implements N.o {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int a(int i11, int i12, int i13, boolean z11) {
        if (i12 >= i13) {
            if (z11) {
                return 0;
            }
            return i13 - i12;
        }
        if (z11) {
            if (z11) {
                if (z11) {
                }
            } else if (z11) {
            }
        } else {
            if (z11 ? i13 - i12 <= i11 : i12 > i11) {
                if (z11) {
                    return i13 - i12;
                }
                return 0;
            }
            if (z11) {
                return i11 - i12;
            }
        }
        return i11;
    }
}
