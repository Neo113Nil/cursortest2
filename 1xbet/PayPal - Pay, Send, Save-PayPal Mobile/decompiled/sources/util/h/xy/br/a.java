package util.h.xy.br;

/* loaded from: classes18.dex */
public final class a {
    private static int Camera2StreamConfigurationMap = 1;
    private static char[] getHighResolutionOutputSizeshNQ4ISI = null;
    private static int[] getHighSpeedVideoFpsRanges = null;
    private static boolean getHighSpeedVideoFpsRangesFor = false;
    private static int getHighSpeedVideoSizes = 0;
    private static boolean getHighSpeedVideoSizesFor = false;
    private static int getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = 1;
    private static int getOutputFormats;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final java.lang.String f1029;

    static {
        getHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoFpsRanges();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(android.view.KeyEvent.normalizeMetaState(0) + 127, "\u0084\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(new int[]{1460440573, -1862171140, -1271027162, 273338815, 990081605, 1577765932, -1849983466, -1507316214}, 16 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr2);
        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(new int[]{-92946474, -1857618277, -1469245641, 2105457553, -189565039, 538705573}, 12 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr3);
        sb.append((java.lang.String) cls.getField((java.lang.String) objArr3[0]).get(null));
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(android.view.View.getDefaultSize(0, 0) + 127, "\u0084", objArr4);
        sb.append(((java.lang.String) objArr4[0]).intern());
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(new int[]{1460440573, -1862171140, -1271027162, 273338815, 990081605, 1577765932, -1849983466, -1507316214}, android.view.View.getDefaultSize(0, 0) + 16, objArr5);
        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(new int[]{-300677478, 1920180113, 554250184, -107599529}, 5 - android.text.TextUtils.indexOf("", ""), objArr6);
        sb.append((java.lang.String) cls2.getField((java.lang.String) objArr6[0]).get(null));
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(127 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\u0084", objArr7);
        sb.append(((java.lang.String) objArr7[0]).intern());
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(new int[]{1460440573, -1862171140, -1271027162, 273338815, 990081605, 1577765932, -1849983466, -1507316214}, 16 - (android.os.Process.myTid() >> 22), objArr8);
        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr8[0]);
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(new int[]{970216219, -990849569, 1940874420, 914946723}, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5, objArr9);
        sb.append((java.lang.String) cls3.getField((java.lang.String) objArr9[0]).get(null));
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, "\u0089\u0082\u0088\u0087", objArr10);
        sb.append(((java.lang.String) objArr10[0]).intern());
        f1029 = sb.toString();
        getOutputFormats = (getInputSizeshNQ4ISI + 15) % 128;
    }

    private static void getHighSpeedVideoFpsRangesFor(int[] iArr, int i, java.lang.Object[] objArr) {
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getHighSpeedVideoFpsRanges;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getHighSpeedVideoFpsRanges;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i3 = 0; i3 < length3; i3++) {
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

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, java.lang.String str, java.lang.Object[] objArr) {
        int i2;
        int i3 = Camera2StreamConfigurationMap + 63;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getHighResolutionOutputSizeshNQ4ISI;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = getHighSpeedVideoSizes + 5;
                Camera2StreamConfigurationMap = i5 % 128;
                if (i5 % 2 == 0) {
                    cArr2[i4] = (char) (cArr[i4] ^ (-3299939579226817547L));
                    i4 >>= 1;
                } else {
                    cArr2[i4] = (char) (cArr[i4] ^ (-3299939579226817547L));
                    i4++;
                }
            }
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 119) % 128;
            cArr = cArr2;
        }
        int i6 = (int) ((-3299939579226817547L) ^ getInputFormats);
        if (!getHighSpeedVideoFpsRangesFor) {
            if (!getHighSpeedVideoSizesFor) {
                throw null;
            }
            throw null;
        }
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 75) % 128;
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            int i7 = getHighSpeedVideoSizes + 23;
            Camera2StreamConfigurationMap = i7 % 128;
            if (i7 % 2 == 0) {
                cArr3[mdVar.f2643] = (char) (cArr[bytes[mdVar.f2642 / mdVar.f2643] / i] + i6);
                i2 = mdVar.f2643;
            } else {
                cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i6);
                i2 = mdVar.f2643 + 1;
            }
            mdVar.f2643 = i2;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoFpsRanges = new int[]{1006047700, 1715698508, 1403388349, -1447011965, -2138266671, -742054212, 46863267, 318291547, -945480897, 1282553184, 763192790, -517804424, -1991144663, -1828564941, 1662948684, 1754589542, 44142893, -1419628156};
    }

    static void getHighSpeedVideoFpsRanges() {
        getHighResolutionOutputSizeshNQ4ISI = new char[]{64382, 64383, 64394, 64387, 64396, 64369, 64432, 64399, 64376};
        getInputFormats = -1074856990;
        getHighSpeedVideoSizesFor = true;
        getHighSpeedVideoFpsRangesFor = true;
    }
}
