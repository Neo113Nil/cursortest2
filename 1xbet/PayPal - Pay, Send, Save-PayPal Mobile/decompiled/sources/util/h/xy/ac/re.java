package util.h.xy.ac;

/* loaded from: classes5.dex */
public class re {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static java.lang.String f73 = "util.h.xy.ac.re";

    static {
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 31) + (i | 31)) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (java.util.Arrays.equals(r3, r4) == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039 A[RETURN] */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static boolean m24547(byte[] bArr, byte[] bArr2) {
        boolean z;
        int i;
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = ((i2 | 41) << 1) - (i2 ^ 41);
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            if (!java.util.Arrays.equals(bArr, bArr2)) {
                z = false;
                int i4 = getHighSpeedVideoFpsRanges;
                i = (i4 ^ 103) + ((i4 & 103) << 1);
                getHighResolutionOutputSizeshNQ4ISI = i % 128;
                if (i % 2 != 0) {
                    return z;
                }
                throw new java.lang.ArithmeticException();
            }
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 109) % 128;
        z = true;
        int i42 = getHighSpeedVideoFpsRanges;
        i = (i42 ^ 103) + ((i42 & 103) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
        }
    }
}
