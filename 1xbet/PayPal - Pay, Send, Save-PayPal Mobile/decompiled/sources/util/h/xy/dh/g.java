package util.h.xy.dh;

/* loaded from: classes5.dex */
public abstract class g extends util.h.xy.dh.mi {
    private static int[] Camera2StreamConfigurationMap = null;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    static final util.h.xy.dh.p getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private static int getOutputFormats;

    private static void getHighSpeedVideoFpsRanges(int[] iArr, int i, java.lang.Object[] objArr) {
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = Camera2StreamConfigurationMap;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 11) % 128;
                iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = Camera2StreamConfigurationMap;
        if (iArr5 != null) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 89) % 128;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 85) % 128;
                iArr6[i3] = (int) (iArr5[i3] ^ (-5569649899877129369L));
            }
            iArr5 = iArr6;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            for (int i4 = 0; i4 < 16; i4++) {
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 81) % 128;
                cVar.f2627 ^= iArr4[i4];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i5 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i5;
            }
            int i6 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i6;
            cVar.f2625 ^= iArr4[16];
            cVar.f2627 ^= iArr4[17];
            int i7 = cVar.f2627;
            int i8 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr4);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    static {
        getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRanges = new util.h.xy.dh.p(util.h.xy.dh.g.class) { // from class: util.h.xy.dh.g.5
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighSpeedVideoSizes;

            @Override // util.h.xy.dh.p
            final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mz mzVar) {
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 93) % 128;
                util.h.xy.dh.g highResolutionOutputSizeshNQ4ISI = util.h.xy.dh.g.getHighResolutionOutputSizeshNQ4ISI(mzVar.m26337());
                int i = Camera2StreamConfigurationMap;
                getHighSpeedVideoSizes = ((i & 29) + (i | 29)) % 128;
                return highResolutionOutputSizeshNQ4ISI;
            }
        };
        getHighSpeedVideoFpsRangesFor = (getOutputFormats + 107) % 128;
    }

    static util.h.xy.dh.g getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        getHighSpeedVideoFpsRangesFor = (getOutputFormats + 65) % 128;
        if (bArr.length == 0) {
            util.h.xy.dh.ry ryVar = util.h.xy.dh.ry.f1213;
            getHighSpeedVideoFpsRangesFor = (getOutputFormats + 75) % 128;
            return ryVar;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{519234437, 1642698490, -533220029, 148983351, 307744872, 10693885, 1244379496, -1513001980, 1829544125, 848237933, -2051311429, 1754340446, 1050782619, 1278189727, -641979402, -1254190656, -1076736444, 683353337}, 35 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr);
        throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
    }

    public java.lang.String toString() {
        java.lang.Object obj;
        int i = getHighSpeedVideoFpsRangesFor + 121;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-1959837366, 1642504072}, 4 % android.text.TextUtils.getOffsetBefore("", 0), objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-1959837366, 1642504072}, android.text.TextUtils.getOffsetBefore("", 0) + 4, objArr2);
            obj = objArr2[0];
        }
        java.lang.String intern = ((java.lang.String) obj).intern();
        int i2 = getOutputFormats + 65;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return intern;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        if (miVar instanceof util.h.xy.dh.g) {
            return true;
        }
        int i = (getOutputFormats + 67) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        int i2 = i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getOutputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public int hashCode() {
        int i = (getHighSpeedVideoFpsRangesFor + 67) % 128;
        getOutputFormats = i;
        getHighSpeedVideoFpsRangesFor = (i + 37) % 128;
        return -1;
    }

    g() {
    }

    static void getHighSpeedVideoSizes() {
        Camera2StreamConfigurationMap = new int[]{-1564848428, 1289020432, 795776622, 1274329818, -83845112, 1028538870, -180664619, -106284657, 1726797955, -84912092, 370618414, 1633086374, -803703375, 2144199943, 1904935662, -1556577764, -13369242, 981985273};
    }
}
