package com.gemalto.mfs.mwsdk.payment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes8.dex */
public final class CVMType {
    private static char[] Camera2StreamConfigurationMap = null;
    public static final com.gemalto.mfs.mwsdk.payment.CVMType FACIAL;
    public static final com.gemalto.mfs.mwsdk.payment.CVMType FINGERPRINT;
    public static final com.gemalto.mfs.mwsdk.payment.CVMType NONE;
    public static final com.gemalto.mfs.mwsdk.payment.CVMType PASSWORD;
    public static final com.gemalto.mfs.mwsdk.payment.CVMType PATTERN;
    public static final com.gemalto.mfs.mwsdk.payment.CVMType PIN;
    public static final com.gemalto.mfs.mwsdk.payment.CVMType RETINA;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static final /* synthetic */ com.gemalto.mfs.mwsdk.payment.CVMType[] getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 0;
    private static int getOutputMinFrameDuration = 1;
    private final byte getOutputFormats;

    public static com.gemalto.mfs.mwsdk.payment.CVMType valueOf(java.lang.String str) {
        int i = getOutputMinFrameDuration + 5;
        getHighSpeedVideoSizes = i % 128;
        com.gemalto.mfs.mwsdk.payment.CVMType cVMType = (com.gemalto.mfs.mwsdk.payment.CVMType) java.lang.Enum.valueOf(com.gemalto.mfs.mwsdk.payment.CVMType.class, str);
        if (i % 2 != 0) {
            throw null;
        }
        int i2 = getHighSpeedVideoSizes + 115;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 != 0) {
            return cVMType;
        }
        throw null;
    }

    public static com.gemalto.mfs.mwsdk.payment.CVMType[] values() {
        int i = getHighSpeedVideoSizes + 121;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        com.gemalto.mfs.mwsdk.payment.CVMType[] cVMTypeArr = (com.gemalto.mfs.mwsdk.payment.CVMType[]) getHighSpeedVideoFpsRanges.clone();
        getOutputMinFrameDuration = (getHighSpeedVideoSizes + 27) % 128;
        return cVMTypeArr;
    }

    static {
        getHighSpeedVideoSizes();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(false, new int[]{0, 4, 0, 0}, "\u0000\u0001\u0001\u0001", objArr);
        com.gemalto.mfs.mwsdk.payment.CVMType cVMType = new com.gemalto.mfs.mwsdk.payment.CVMType(((java.lang.String) objArr[0]).intern(), 0, (byte) 0);
        NONE = cVMType;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(false, new int[]{4, 11, 0, 0}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000", objArr2);
        com.gemalto.mfs.mwsdk.payment.CVMType cVMType2 = new com.gemalto.mfs.mwsdk.payment.CVMType(((java.lang.String) objArr2[0]).intern(), 1, (byte) 1);
        FINGERPRINT = cVMType2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(true, new int[]{15, 7, 77, 6}, null, objArr3);
        com.gemalto.mfs.mwsdk.payment.CVMType cVMType3 = new com.gemalto.mfs.mwsdk.payment.CVMType(((java.lang.String) objArr3[0]).intern(), 2, (byte) 2);
        PATTERN = cVMType3;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(true, new int[]{22, 3, 0, 3}, "\u0000\u0001\u0001", objArr4);
        com.gemalto.mfs.mwsdk.payment.CVMType cVMType4 = new com.gemalto.mfs.mwsdk.payment.CVMType(((java.lang.String) objArr4[0]).intern(), 3, (byte) 3);
        PIN = cVMType4;
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(false, new int[]{25, 8, 136, 0}, "\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000", objArr5);
        com.gemalto.mfs.mwsdk.payment.CVMType cVMType5 = new com.gemalto.mfs.mwsdk.payment.CVMType(((java.lang.String) objArr5[0]).intern(), 4, (byte) 4);
        PASSWORD = cVMType5;
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(false, new int[]{33, 6, 81, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001", objArr6);
        com.gemalto.mfs.mwsdk.payment.CVMType cVMType6 = new com.gemalto.mfs.mwsdk.payment.CVMType(((java.lang.String) objArr6[0]).intern(), 5, (byte) 5);
        RETINA = cVMType6;
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(true, new int[]{39, 6, 6, 1}, "\u0000\u0000\u0001\u0000\u0000\u0000", objArr7);
        com.gemalto.mfs.mwsdk.payment.CVMType cVMType7 = new com.gemalto.mfs.mwsdk.payment.CVMType(((java.lang.String) objArr7[0]).intern(), 6, (byte) 6);
        FACIAL = cVMType7;
        int i = (getOutputMinFrameDuration + 23) % 128;
        getHighSpeedVideoSizes = i;
        com.gemalto.mfs.mwsdk.payment.CVMType[] cVMTypeArr = {cVMType, cVMType2, cVMType3, cVMType4, cVMType5, cVMType6, cVMType7};
        int i2 = i + 97;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 != 0) {
            getHighSpeedVideoFpsRanges = cVMTypeArr;
            getOutputMinFrameDuration = (i + 61) % 128;
            return;
        }
        throw null;
    }

    private CVMType(java.lang.String str, int i, byte b) {
        this.getOutputFormats = b;
    }

    public final byte getValue() {
        int i = getHighSpeedVideoSizes;
        int i2 = i + 65;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        byte b = this.getOutputFormats;
        getOutputMinFrameDuration = (i + 97) % 128;
        return b;
    }

    private static void getHighSpeedVideoFpsRanges(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 119) % 128;
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = Camera2StreamConfigurationMap;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr2[i5] = (char) (cArr[i5] ^ (-8125198844289309347L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        java.lang.System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bArr2 != null) {
            char[] cArr4 = new char[i2];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i2) {
                if (bArr2[maVar.f2631] == 1) {
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                } else {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            char[] cArr5 = new char[i2];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i6 = i2 - i4;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i6, i4);
            java.lang.System.arraycopy(cArr5, i4, cArr3, 0, i6);
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 73) % 128;
        }
        if (z) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 21) % 128;
            char[] cArr6 = new char[i2];
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                cArr6[maVar.f2631] = cArr3[(i2 - maVar.f2631) - 1];
                maVar.f2631++;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            maVar.f2631 = 0;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 105) % 128;
            while (maVar.f2631 < i2) {
                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void getHighSpeedVideoSizes() {
        Camera2StreamConfigurationMap = new char[]{42362, 42259, 42259, 42260, 42366, 42266, 42262, 42263, 42267, 42262, 42252, 42252, 42256, 42262, 42252, 42434, 42447, 42492, 42492, 42451, 42432, 42438, 42362, 42262, 42257, 42289, 42381, 42383, 42374, 42368, 42374, 42373, 42382, 42252, 42433, 42432, 42434, 42433, 42437, 42363, 42258, 42257, 42262, 42257, 42261};
    }
}
