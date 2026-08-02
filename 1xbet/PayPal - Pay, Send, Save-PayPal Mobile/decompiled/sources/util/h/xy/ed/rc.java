package util.h.xy.ed;

/* loaded from: classes5.dex */
public final class rc extends util.h.xy.dh.mh {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getInputSizeshNQ4ISI = 1;
    private util.h.xy.dh.ma getHighSpeedVideoSizesFor;
    private static char[] getOutputFormats = {64415, 64369, 64365, 64385, 64359, 64373, 64371, 64428, 64458, 64442, 64354};
    private static int getHighSpeedVideoSizes = -1074856982;
    private static boolean getOutputMinFrameDuration = true;
    private static boolean getHighSpeedVideoFpsRangesFor = true;

    private static void getHighSpeedVideoFpsRanges(int i, java.lang.String str, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = i2 + 11;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Camera2StreamConfigurationMap = (i2 + 71) % 128;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getOutputFormats;
        if (cArr != null) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 67) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = getHighSpeedVideoFpsRanges + 55;
                Camera2StreamConfigurationMap = i5 % 128;
                if (i5 % 2 != 0) {
                    cArr2[i4] = (char) (cArr[i4] - 3299939579226817547L);
                    throw new java.lang.ArithmeticException();
                }
                cArr2[i4] = (char) (cArr[i4] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i6 = (int) ((-3299939579226817547L) ^ getHighSpeedVideoSizes);
        if (!getHighSpeedVideoFpsRangesFor) {
            if (!getOutputMinFrameDuration) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i6);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 67;
        getInputSizeshNQ4ISI = i % 128;
        util.h.xy.dh.ma maVar = this.getHighSpeedVideoSizesFor;
        if (i % 2 != 0) {
            return maVar;
        }
        throw new java.lang.ArithmeticException();
    }

    public final java.lang.String toString() {
        byte[] m26310 = this.getHighSpeedVideoSizesFor.m26310();
        if (m26310.length == 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(127 - android.view.KeyEvent.keyCodeFromString(""), "\u008b\u008a\u0089\u0088\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(java.lang.Integer.toHexString(m26310[0] & 255));
            java.lang.String obj = sb.toString();
            int i = getHighResolutionOutputSizeshNQ4ISI + 7;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                return obj;
            }
            throw null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 126, "\u008b\u008a\u0089\u0088\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
            sb2.append(((java.lang.String) objArr2[0]).intern());
            sb2.append(java.lang.Integer.toHexString((m26310[0] & 255) | ((m26310[1] & 255) << 8)));
            java.lang.String obj2 = sb2.toString();
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 59;
            getInputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                return obj2;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public rc(int i) {
        this.getHighSpeedVideoSizesFor = new util.h.xy.dh.rw(i);
    }
}
