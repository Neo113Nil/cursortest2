package util.h.xy.et;

/* loaded from: classes5.dex */
public final class b implements util.h.xy.et.ra {
    private static int[] Camera2StreamConfigurationMap = {-1067006175, -1467089050, 295414868, 1732101651, -1056268436, 1504550251, 797931002, 483684497, -377705283, 680883483, -935902239, 1660065555, -2079165662, 2045058903, -567662321, 2032983774, 652212015, -632784843};
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;

    @Override // util.h.xy.et.ra
    /* renamed from: ˋ, reason: contains not printable characters */
    public final int mo26709(byte[] bArr) throws util.h.xy.ef.md {
        int i;
        int[] iArr;
        int i2 = bArr[bArr.length - 1] & 255;
        byte b = (byte) i2;
        boolean z = (i2 > bArr.length) | (i2 == 0);
        for (int i3 = 0; i3 < bArr.length; i3++) {
            z |= (bArr.length - i3 <= i2) & (bArr[i3] != b);
        }
        if (!z) {
            return i2;
        }
        int[] iArr2 = {602789345, 1732561081, -1851002882, -1838214457, 261124304, -590463989, 637478176, -1198123772, 1564025257, -305779088};
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            int intValue = ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 19;
            util.h.xz.b.c cVar = new util.h.xz.b.c();
            char[] cArr = new char[4];
            char[] cArr2 = new char[20];
            int[] iArr3 = Camera2StreamConfigurationMap;
            if (iArr3 != null) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 5) % 128;
                int length = iArr3.length;
                int[] iArr4 = new int[length];
                int i4 = 0;
                while (i4 < length) {
                    iArr4[i4] = (int) (iArr3[i4] ^ (-5569649899877129369L));
                    i4++;
                    intValue = intValue;
                }
                i = intValue;
                iArr3 = iArr4;
            } else {
                i = intValue;
            }
            int length2 = iArr3.length;
            int[] iArr5 = new int[length2];
            int[] iArr6 = Camera2StreamConfigurationMap;
            if (iArr6 != null) {
                int length3 = iArr6.length;
                int[] iArr7 = new int[length3];
                int i5 = 0;
                while (i5 < length3) {
                    iArr7[i5] = (int) (iArr6[i5] ^ (-5569649899877129369L));
                    i5++;
                    iArr2 = iArr2;
                }
                iArr = iArr2;
                iArr6 = iArr7;
            } else {
                iArr = iArr2;
            }
            java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length2);
            cVar.f2626 = 0;
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 75) % 128;
            while (cVar.f2626 < 10) {
                cArr[0] = (char) (iArr[cVar.f2626] >> 16);
                cArr[1] = (char) iArr[cVar.f2626];
                cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
                cArr[3] = (char) iArr[cVar.f2626 + 1];
                cVar.f2627 = (cArr[0] << 16) + cArr[1];
                cVar.f2625 = (cArr[2] << 16) + cArr[3];
                util.h.xz.b.c.m27723(iArr5);
                for (int i6 = 0; i6 < 16; i6++) {
                    cVar.f2627 ^= iArr5[i6];
                    cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                    int i7 = cVar.f2627;
                    cVar.f2627 = cVar.f2625;
                    cVar.f2625 = i7;
                }
                int i8 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i8;
                cVar.f2625 ^= iArr5[16];
                cVar.f2627 ^= iArr5[17];
                int i9 = cVar.f2627;
                int i10 = cVar.f2625;
                cArr[0] = (char) (cVar.f2627 >>> 16);
                cArr[1] = (char) cVar.f2627;
                cArr[2] = (char) (cVar.f2625 >>> 16);
                cArr[3] = (char) cVar.f2625;
                util.h.xz.b.c.m27723(iArr5);
                cArr2[cVar.f2626 * 2] = cArr[0];
                cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
                cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
                cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
                cVar.f2626 += 2;
            }
            objArr[0] = new java.lang.String(cArr2, 0, i);
            throw new util.h.xy.ef.md(((java.lang.String) objArr[0]).intern());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // util.h.xy.et.ra
    /* renamed from: ˏ, reason: contains not printable characters */
    public final int mo26710(byte[] bArr, int i) {
        int i2 = (getHighSpeedVideoSizes + 97) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        byte length = (byte) (bArr.length - i);
        int i3 = i2 + 21;
        while (true) {
            getHighSpeedVideoSizes = i3 % 128;
            if (i >= bArr.length) {
                return length;
            }
            bArr[i] = length;
            i++;
            i3 = getHighResolutionOutputSizeshNQ4ISI + 17;
        }
    }
}
