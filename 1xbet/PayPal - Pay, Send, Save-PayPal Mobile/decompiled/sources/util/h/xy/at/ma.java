package util.h.xy.at;

/* loaded from: classes5.dex */
public final class ma {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoSizes;
    private static byte[] getInputSizeshNQ4ISI;
    private static char[] getInputFormats = {64168, 64161, 64156, 64212, 64147, 64173, 64163, 64157, 64144, 64169, 64146, 64153, 64179, 64176, 64148, 64162, 64151, 64149};
    private static int getHighSpeedVideoFpsRangesFor = -1074857210;
    private static boolean getHighSpeedVideoFpsRanges = true;
    private static boolean getHighResolutionOutputSizeshNQ4ISI = true;

    private ma() {
    }

    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m25117() {
        byte[] Camera2StreamConfigurationMap2 = new util.h.xy.at.ma().Camera2StreamConfigurationMap();
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 59) % 128;
        return Camera2StreamConfigurationMap2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r7v3 */
    @util.h.xy.a.a
    private byte[] Camera2StreamConfigurationMap() {
        byte[] bArr;
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 61) << 1) - (i ^ 61);
        getHighSpeedVideoSizes = i2 % 128;
        byte[] bArr2 = i2 % 2;
        byte[] bArr3 = null;
        try {
            try {
                try {
                    if (bArr2 != 0) {
                        util.h.xy.ar.b.m25076(util.h.xy.al.ra.f649);
                        util.h.xy.ar.b.m25076(util.h.xy.al.ra.f734);
                        util.h.xy.ar.b.m25070(getInputSizeshNQ4ISI);
                        throw new java.lang.ArithmeticException();
                    }
                    bArr2 = util.h.xy.ar.b.m25076(util.h.xy.al.ra.f649);
                    bArr = util.h.xy.ar.b.m25076(util.h.xy.al.ra.f734);
                    if (util.h.xy.ar.b.m25070(getInputSizeshNQ4ISI)) {
                        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 125) % 128;
                        try {
                            int alpha = android.graphics.Color.alpha(0);
                            int identityHashCode = java.lang.System.identityHashCode(this);
                            int i3 = ~((identityHashCode & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (identityHashCode ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                            int i4 = ~((~identityHashCode) | 127);
                            int i5 = ~(alpha | identityHashCode);
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            getHighSpeedVideoSizes((alpha * 628) + 79756 + ((identityHashCode | 127 | (~alpha)) * (-627)) + (((alpha ^ i3) | (i3 & alpha)) * (-627)) + (((i5 & i4) | (i4 ^ i5)) * 627), "\u0092\u0091\u0090\u008f\u0082\u008e\u0086\u0089\u0088\u0087\u0086\u008d\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr);
                            java.security.SecureRandom secureRandom = (java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr[0]).getDeclaredConstructor(null).newInstance(null);
                            byte[] bArr4 = new byte[bArr2.length];
                            getInputSizeshNQ4ISI = bArr4;
                            secureRandom.nextBytes(bArr4);
                            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 61) % 128;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    try {
                        byte[] bArr5 = new byte[bArr2.length];
                        int length = bArr2.length;
                        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 97) % 128;
                        int i6 = 0;
                        for (int i7 = 0; i7 < length; i7 = ((i7 | 1) << 1) - (i7 ^ 1)) {
                            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 39) % 128;
                            byte b = (byte) (bArr2[i7] ^ bArr[i6]);
                            byte b2 = getInputSizeshNQ4ISI[i6];
                            bArr5[i6] = (byte) ((b & (~b2)) | ((~b) & b2));
                            int i8 = (i6 ^ 86) + ((i6 & 86) << 1);
                            i6 = (i8 ^ (-85)) + ((i8 & (-85)) << 1);
                        }
                        util.h.xy.ar.b.m25095(bArr2);
                        util.h.xy.ar.b.m25095(bArr);
                        int i9 = Camera2StreamConfigurationMap;
                        int i10 = ((i9 | 119) << 1) - (i9 ^ 119);
                        getHighSpeedVideoSizes = i10 % 128;
                        if (i10 % 2 == 0) {
                            return bArr5;
                        }
                        throw new java.lang.ArithmeticException();
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        bArr3 = bArr2;
                        util.h.xy.ar.b.m25095(bArr3);
                        util.h.xy.ar.b.m25095(bArr);
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    bArr3 = bArr;
                    bArr = bArr3;
                    bArr3 = bArr2;
                    th = th;
                    util.h.xy.ar.b.m25095(bArr3);
                    util.h.xy.ar.b.m25095(bArr);
                    throw th;
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                bArr = bArr3;
                bArr3 = bArr2;
                th = th;
                util.h.xy.ar.b.m25095(bArr3);
                util.h.xy.ar.b.m25095(bArr);
                throw th;
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            bArr = null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m25116() {
        int i = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i & 111) + (i | 111)) % 128;
        util.h.xy.ar.b.m25095(getInputSizeshNQ4ISI);
        getInputSizeshNQ4ISI = null;
        int i2 = getHighSpeedVideoSizes;
        int i3 = (i2 ^ 77) + ((i2 & 77) << 1);
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static void getHighSpeedVideoSizes(int i, java.lang.String str, java.lang.Object[] objArr) {
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getInputFormats;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i3 = (int) ((-3299939579226817547L) ^ getHighSpeedVideoFpsRangesFor);
        if (getHighResolutionOutputSizeshNQ4ISI) {
            mdVar.f2642 = bytes.length;
            char[] cArr3 = new char[mdVar.f2642];
            mdVar.f2643 = 0;
            while (mdVar.f2643 < mdVar.f2642) {
                cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
                mdVar.f2643++;
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (getHighSpeedVideoFpsRanges) {
            throw null;
        }
        throw null;
    }
}
