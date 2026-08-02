package util.h.xy.ew;

/* loaded from: classes18.dex */
public final class mc extends java.io.OutputStream {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoSizes;
    private final java.io.OutputStream getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor = 0;

    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m26728() {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 125) << 1) - (i ^ 125);
        getHighSpeedVideoSizes = i2 % 128;
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        if (i2 % 2 == 0) {
            return util.h.xy.fb.a.m26821(bArr);
        }
        util.h.xy.fb.a.m26821(bArr);
        throw null;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws java.io.IOException {
        int i2 = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = (i2 + 101) % 128;
        int i3 = this.getHighSpeedVideoFpsRangesFor;
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        if (i3 == bArr.length) {
            getHighSpeedVideoSizes = ((i2 & 125) + (i2 | 125)) % 128;
            byte b = bArr[0];
            java.lang.System.arraycopy(bArr, 1, bArr, 0, bArr.length - 1);
            byte[] bArr2 = this.getHighSpeedVideoFpsRanges;
            int length = bArr2.length;
            bArr2[(~length) + (length << 1)] = (byte) i;
            this.getHighResolutionOutputSizeshNQ4ISI.write(b);
            int i4 = Camera2StreamConfigurationMap;
            int i5 = ((i4 | 51) << 1) - (i4 ^ 51);
            getHighSpeedVideoSizes = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 / 2;
            }
        } else {
            int i7 = -(-(i3 * (-1917)));
            int i8 = (i7 & 960) + (i7 | 960);
            int i9 = ~i3;
            int i10 = ~i;
            int i11 = ~((i9 & i10) | (i9 ^ i10));
            int i12 = ~((i ^ 1) | (i & 1));
            int i13 = -(-(((i11 ^ i12) | (i11 & i12)) * 959));
            int i14 = (((i8 ^ i13) + ((i8 & i13) << 1)) - (~(-(-(i9 * (-959)))))) - 1;
            int i15 = ~((i9 ^ i) | (i9 & i));
            int i16 = ~((i10 & 1) | (1 ^ i10));
            int i17 = ((i15 ^ i16) | (i15 & i16)) * 959;
            this.getHighSpeedVideoFpsRangesFor = (i14 & i17) + (i17 | i14);
            bArr[i3] = (byte) i;
        }
        int i18 = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i18 & 49) + (i18 | 49)) % 128;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = getHighSpeedVideoSizes;
        int i4 = (i3 ^ 33) + ((i3 & 33) << 1);
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 == 0) {
            int length = this.getHighSpeedVideoFpsRanges.length;
            throw null;
        }
        byte[] bArr2 = this.getHighSpeedVideoFpsRanges;
        int i5 = 0;
        if (i2 >= bArr2.length) {
            this.getHighResolutionOutputSizeshNQ4ISI.write(bArr2, 0, this.getHighSpeedVideoFpsRangesFor);
            byte[] bArr3 = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = bArr3.length;
            int i6 = (i - (~(-(-i2)))) - 1;
            int i7 = -bArr3.length;
            java.lang.System.arraycopy(bArr, ((i6 | i7) << 1) - (i6 ^ i7), bArr3, 0, bArr3.length);
            java.io.OutputStream outputStream = this.getHighResolutionOutputSizeshNQ4ISI;
            int i8 = -this.getHighSpeedVideoFpsRanges.length;
            outputStream.write(bArr, i, (i2 ^ i8) + ((i2 & i8) << 1));
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        } else {
            Camera2StreamConfigurationMap = ((i3 & 125) + (i3 | 125)) % 128;
            while (i5 != i2) {
                write(bArr[(i & i5) + (i | i5)]);
                int i9 = (i5 ^ 13) + ((i5 & 13) << 1);
                i5 = ((i9 | (-12)) << 1) - (i9 ^ (-12));
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 53) % 128;
            }
        }
        int i10 = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i10 ^ 107) + ((i10 & 107) << 1)) % 128;
    }

    public mc(java.io.OutputStream outputStream, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = outputStream;
        this.getHighSpeedVideoFpsRanges = new byte[i];
    }
}
