package util.h.xy.fb;

/* loaded from: classes5.dex */
public final class d {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static int m26831(java.lang.Object obj) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 115;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        getHighSpeedVideoFpsRangesFor = (((i | 31) << 1) - (i ^ 31)) % 128;
        int i3 = i + 77;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        int i4 = i3 % 2;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r3.equals(r4) != false) goto L20;
     */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m26832(java.lang.Object obj, java.lang.Object obj2) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 99) + ((i & 99) << 1);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (obj != obj2) {
            int i4 = ((i3 | 79) << 1) - (i3 ^ 79);
            int i5 = i4 % 128;
            getHighSpeedVideoFpsRanges = i5;
            if (i4 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (obj != null) {
                int i6 = (i5 & 43) + (i5 | 43);
                getHighSpeedVideoFpsRangesFor = i6 % 128;
                if (i6 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                if (obj2 != null) {
                }
            }
            int i7 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRangesFor = ((i7 & 97) + (i7 | 97)) % 128;
            return false;
        }
        return true;
    }
}
