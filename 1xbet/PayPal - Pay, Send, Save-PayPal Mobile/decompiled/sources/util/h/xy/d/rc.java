package util.h.xy.d;

/* loaded from: classes5.dex */
public final class rc {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoSizes;
    private final byte[] getHighSpeedVideoSizesFor;
    private final byte[] getInputFormats;
    private final byte[] getInputSizeshNQ4ISI;
    private final byte[] getOutputFormats;
    private final byte[] getOutputMinFrameDuration;
    private final int getOutputMinFrameDurationlomOqCM;

    public rc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, int i, int i2, byte[] bArr7) {
        byte[] bArr8 = new byte[bArr.length];
        this.getHighSpeedVideoSizes = bArr8;
        java.lang.System.arraycopy(bArr, 0, bArr8, 0, bArr.length);
        if (bArr2 == null) {
            this.getOutputFormats = null;
        } else {
            byte[] bArr9 = new byte[bArr2.length];
            this.getOutputFormats = bArr9;
            java.lang.System.arraycopy(bArr2, 0, bArr9, 0, bArr2.length);
        }
        if (bArr3 == null) {
            this.getOutputMinFrameDuration = null;
        } else {
            byte[] bArr10 = new byte[bArr3.length];
            this.getOutputMinFrameDuration = bArr10;
            java.lang.System.arraycopy(bArr3, 0, bArr10, 0, bArr3.length);
        }
        if (bArr4 == null) {
            this.getInputFormats = null;
        } else {
            byte[] bArr11 = new byte[bArr4.length];
            this.getInputFormats = bArr11;
            java.lang.System.arraycopy(bArr4, 0, bArr11, 0, bArr4.length);
        }
        if (bArr5 == null) {
            this.getHighSpeedVideoSizesFor = null;
        } else {
            int length = bArr5.length;
            byte[] bArr12 = new byte[length];
            this.getHighSpeedVideoSizesFor = bArr12;
            java.lang.System.arraycopy(bArr5, 0, bArr12, 0, length);
        }
        if (bArr6 == null) {
            this.getHighSpeedVideoFpsRangesFor = null;
        } else {
            byte[] bArr13 = new byte[bArr6.length];
            this.getHighSpeedVideoFpsRangesFor = bArr13;
            java.lang.System.arraycopy(bArr6, 0, bArr13, 0, bArr6.length);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getOutputMinFrameDurationlomOqCM = i2;
        if (bArr7 == null) {
            this.getInputSizeshNQ4ISI = null;
            return;
        }
        int length2 = bArr7.length;
        byte[] bArr14 = new byte[length2];
        this.getInputSizeshNQ4ISI = bArr14;
        java.lang.System.arraycopy(bArr7, 0, bArr14, 0, length2);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m26245() {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 81) % 128;
        util.h.xy.ar.b.m25100(this.getHighSpeedVideoSizes, this.getOutputFormats, this.getOutputMinFrameDuration, this.getInputFormats, this.getHighSpeedVideoSizesFor, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
        int i = getHighSpeedVideoFpsRanges + 5;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m26240() {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 97) % 128;
        byte[] bArr = this.getHighSpeedVideoSizes;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (((i | 117) << 1) - (i ^ 117)) % 128;
        return bArr2;
    }

    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m26241() {
        byte[] bArr;
        int i = (getHighSpeedVideoFpsRanges + 97) % 128;
        Camera2StreamConfigurationMap = i;
        byte[] bArr2 = this.getOutputFormats;
        if (bArr2 != null) {
            getHighSpeedVideoFpsRanges = (((i | 19) << 1) - (i ^ 19)) % 128;
            int length = bArr2.length;
            bArr = new byte[length];
            java.lang.System.arraycopy(bArr2, 0, bArr, 0, length);
            int i2 = getHighSpeedVideoFpsRanges;
            Camera2StreamConfigurationMap = (((i2 | 15) << 1) - (i2 ^ 15)) % 128;
        } else {
            bArr = null;
        }
        int i3 = getHighSpeedVideoFpsRanges;
        int i4 = (i3 ^ 55) + ((i3 & 55) << 1);
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m26243() {
        byte[] bArr;
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i & 97) + (i | 97)) % 128;
        Camera2StreamConfigurationMap = i2;
        byte[] bArr2 = this.getOutputMinFrameDuration;
        if (bArr2 != null) {
            getHighSpeedVideoFpsRanges = (i2 + 109) % 128;
            int length = bArr2.length;
            bArr = new byte[length];
            util.h.xy.ad.a.m24549(bArr2, 0, bArr, 0, length);
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 113) % 128;
        } else {
            bArr = null;
        }
        int i3 = Camera2StreamConfigurationMap;
        int i4 = (i3 & 83) + (i3 | 83);
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @util.h.xy.a.a
    /* renamed from: ˎ, reason: contains not printable characters */
    public final byte[] m26242() {
        byte[] bArr;
        int i = (Camera2StreamConfigurationMap + 83) % 128;
        getHighSpeedVideoFpsRanges = i;
        byte[] bArr2 = this.getInputFormats;
        if (bArr2 != null) {
            Camera2StreamConfigurationMap = ((i ^ 125) + ((i & 125) << 1)) % 128;
            int length = bArr2.length;
            bArr = new byte[length];
            java.lang.System.arraycopy(bArr2, 0, bArr, 0, length);
            int i2 = Camera2StreamConfigurationMap + 79;
            getHighSpeedVideoFpsRanges = i2 % 128;
            int i3 = i2 % 2;
        } else {
            bArr = null;
        }
        int i4 = Camera2StreamConfigurationMap + 11;
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    @util.h.xy.a.a
    /* renamed from: ʽ, reason: contains not printable characters */
    public final byte[] m26239() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 57) + ((i & 57) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        byte[] bArr = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        byte[] bArr2 = this.getHighSpeedVideoSizesFor;
        if (bArr2 != null) {
            int length = bArr2.length;
            byte[] bArr3 = new byte[length];
            java.lang.System.arraycopy(bArr2, 0, bArr3, 0, length);
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 55) % 128;
            bArr = bArr3;
        }
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 53) % 128;
        return bArr;
    }

    @util.h.xy.a.a
    /* renamed from: ʻ, reason: contains not printable characters */
    public final byte[] m26237() {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 21) << 1) - (i ^ 21);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            if (bArr == null) {
                return null;
            }
            int i3 = ((i | 17) << 1) - (i ^ 17);
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 != 0) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                java.lang.System.arraycopy(bArr, 1, bArr2, 0, length);
                return bArr2;
            }
            int length2 = bArr.length;
            byte[] bArr3 = new byte[length2];
            java.lang.System.arraycopy(bArr, 0, bArr3, 0, length2);
            return bArr3;
        }
        throw null;
    }

    @util.h.xy.a.a
    /* renamed from: ι, reason: contains not printable characters */
    public final int m26246() {
        int i = getHighSpeedVideoFpsRanges + 111;
        int i2 = i % 128;
        Camera2StreamConfigurationMap = i2;
        if (i % 2 == 0) {
            throw null;
        }
        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i4 = i2 + 45;
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 == 0) {
            return i3;
        }
        throw new java.lang.ArithmeticException();
    }

    @util.h.xy.a.a
    /* renamed from: ʼ, reason: contains not printable characters */
    public final int m26238() {
        int i = (getHighSpeedVideoFpsRanges + 97) % 128;
        Camera2StreamConfigurationMap = i;
        int i2 = this.getOutputMinFrameDurationlomOqCM;
        int i3 = (i & 103) + (i | 103);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw new java.lang.ArithmeticException();
    }

    @util.h.xy.a.a
    /* renamed from: ͺ, reason: contains not printable characters */
    public final byte[] m26244() {
        byte[] bArr;
        int i = Camera2StreamConfigurationMap + 103;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            byte[] bArr2 = this.getInputSizeshNQ4ISI;
            if (bArr2 != null) {
                int length = bArr2.length;
                bArr = new byte[length];
                java.lang.System.arraycopy(bArr2, 0, bArr, 0, length);
                int i2 = getHighSpeedVideoFpsRanges;
                Camera2StreamConfigurationMap = (((i2 | 11) << 1) - (i2 ^ 11)) % 128;
            } else {
                bArr = null;
            }
            int i3 = Camera2StreamConfigurationMap + 21;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 == 0) {
                return bArr;
            }
            throw null;
        }
        throw null;
    }
}
