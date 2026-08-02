package util.h.xy.b;

/* loaded from: classes5.dex */
public final class a {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r4 >= 4) goto L17;
     */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static char[] m25282(long j, char[] cArr) {
        char[] cArr2;
        int i;
        int i2 = Camera2StreamConfigurationMap;
        int i3 = (i2 ^ 91) + ((i2 & 91) << 1);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            cArr2 = new char[cArr.length];
            i = 1;
        } else {
            cArr2 = new char[cArr.length];
            i = 0;
        }
        int i4 = i;
        int i5 = 4;
        while (i < cArr.length) {
            int i6 = getHighSpeedVideoFpsRangesFor;
            int i7 = (i6 & 11) + (i6 | 11);
            int i8 = i7 % 128;
            Camera2StreamConfigurationMap = i8;
            if (i7 % 2 == 0 ? ((j >>> i) & 1) == 1 : (j >> i) == 0) {
            }
            if (i5 < cArr2.length) {
                int i9 = ((i6 | 39) << 1) - (i6 ^ 39);
                Camera2StreamConfigurationMap = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr2[i5] = cArr[i];
                    int i10 = (i5 ^ 88) + ((i5 & 88) << 1);
                    i5 = (i10 ^ (-85)) + ((i10 & (-85)) << 1);
                } else {
                    cArr2[i5] = cArr[i];
                    int i11 = i5 + 80;
                    i5 = ((i11 | (-79)) << 1) - (i11 ^ (-79));
                }
                int i12 = (i ^ 118) + ((i & 118) << 1);
                i = ((i12 | (-117)) << 1) - (i12 ^ (-117));
            }
            cArr2[i4] = cArr[i];
            i4++;
            getHighSpeedVideoFpsRangesFor = (((i8 | 41) << 1) - (i8 ^ 41)) % 128;
            int i122 = (i ^ 118) + ((i & 118) << 1);
            i = ((i122 | (-117)) << 1) - (i122 ^ (-117));
        }
        return cArr2;
    }
}
