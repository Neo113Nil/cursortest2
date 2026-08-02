package util.h.xy.ad;

/* loaded from: classes5.dex */
abstract class ra implements util.h.xy.ad.ma {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private long getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes = new byte[4];
    private int Camera2StreamConfigurationMap = 0;

    protected abstract void getHighSpeedVideoFpsRanges();

    protected abstract void getHighSpeedVideoFpsRanges(byte[] bArr, int i);

    protected abstract void getHighSpeedVideoSizes(long j);

    protected ra() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r4 == r0.length) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r0.length == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        r7 = (r1 & 35) + (r1 | 35);
        util.h.xy.ad.ra.getHighResolutionOutputSizeshNQ4ISI = r7 % 128;
        r7 = r7 % 2;
        getHighSpeedVideoFpsRanges(r6.getHighSpeedVideoSizes, 0);
        r6.Camera2StreamConfigurationMap = 0;
        r7 = util.h.xy.ad.ra.getHighSpeedVideoFpsRanges;
        util.h.xy.ad.ra.getHighResolutionOutputSizeshNQ4ISI = ((r7 ^ 95) + ((r7 & 95) << 1)) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighSpeedVideoFpsRanges(byte b) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 85;
        int i2 = i % 128;
        getHighSpeedVideoFpsRanges = i2;
        if (i % 2 == 0) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            int i3 = this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = 0;
            bArr[i3] = b;
        } else {
            byte[] bArr2 = this.getHighSpeedVideoSizes;
            int i4 = this.Camera2StreamConfigurationMap;
            int i5 = ((i4 | 1) << 1) - (i4 ^ 1);
            this.Camera2StreamConfigurationMap = i5;
            bArr2[i4] = b;
        }
        this.getHighSpeedVideoFpsRangesFor++;
    }

    @Override // util.h.xy.ad.b
    public final void Camera2StreamConfigurationMap(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = getHighResolutionOutputSizeshNQ4ISI + 17;
        getHighSpeedVideoFpsRanges = i7 % 128;
        if (i7 % 2 != 0) {
            while (this.Camera2StreamConfigurationMap != 0) {
                int i8 = getHighSpeedVideoFpsRanges;
                getHighResolutionOutputSizeshNQ4ISI = (i8 + 101) % 128;
                if (i2 <= 0) {
                    break;
                }
                int i9 = (i8 & 81) + (i8 | 81);
                getHighResolutionOutputSizeshNQ4ISI = i9 % 128;
                if (i9 % 2 != 0) {
                    getHighSpeedVideoFpsRanges(bArr[i]);
                    i5 = (i ^ 36) + ((i & 36) << 1);
                    i6 = (i2 ^ 45) + ((i2 & 45) << 1);
                } else {
                    getHighSpeedVideoFpsRanges(bArr[i]);
                    i5 = ((i | 1) << 1) - (i ^ 1);
                    i6 = (-2) - (~i2);
                }
                i2 = i6;
                i = i5;
                int i10 = getHighSpeedVideoFpsRanges;
                getHighResolutionOutputSizeshNQ4ISI = ((i10 ^ 57) + ((i10 & 57) << 1)) % 128;
            }
            while (i2 > this.getHighSpeedVideoSizes.length) {
                int i11 = getHighSpeedVideoFpsRanges;
                int i12 = ((i11 | 1) << 1) - (i11 ^ 1);
                getHighResolutionOutputSizeshNQ4ISI = i12 % 128;
                if (i12 % 2 != 0) {
                    getHighSpeedVideoFpsRanges(bArr, i);
                    byte[] bArr2 = this.getHighSpeedVideoSizes;
                    i <<= bArr2.length;
                    i2 >>= bArr2.length;
                    this.getHighSpeedVideoFpsRangesFor &= bArr2.length;
                } else {
                    getHighSpeedVideoFpsRanges(bArr, i);
                    byte[] bArr3 = this.getHighSpeedVideoSizes;
                    int i13 = -(-bArr3.length);
                    i = (i & i13) + (i | i13);
                    i2 = (i2 - (~(-bArr3.length))) - 1;
                    this.getHighSpeedVideoFpsRangesFor += bArr3.length;
                }
            }
            while (i2 > 0) {
                int i14 = getHighSpeedVideoFpsRanges;
                int i15 = (i14 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i14 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                getHighResolutionOutputSizeshNQ4ISI = i15 % 128;
                if (i15 % 2 != 0) {
                    getHighSpeedVideoFpsRanges(bArr[i]);
                    int i16 = ((i | 18) << 1) - (i ^ 18);
                    i = (i16 ^ 102) + ((i16 & 102) << 1);
                    i4 = i2 ^ 53;
                    i3 = (i2 & 53) << 1;
                } else {
                    getHighSpeedVideoFpsRanges(bArr[i]);
                    int i17 = i + 73;
                    int i18 = ((i17 & (-72)) << 1) + (i17 ^ (-72));
                    int i19 = i2 + 63;
                    int i20 = i19 & (-64);
                    i3 = i19 | (-64);
                    i4 = i20;
                    i = i18;
                }
                i2 = i3 + i4;
            }
            return;
        }
        throw null;
    }

    public final void Camera2StreamConfigurationMap() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i & 105) + (i | 105)) % 128;
        long j = this.getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges(Byte.MIN_VALUE);
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 11;
        getHighSpeedVideoFpsRanges = i2 % 128;
        int i3 = i2 % 2;
        while (this.Camera2StreamConfigurationMap != 0) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 39) % 128;
            getHighSpeedVideoFpsRanges((byte) 0);
            int i4 = getHighResolutionOutputSizeshNQ4ISI;
            int i5 = ((i4 | 39) << 1) - (i4 ^ 39);
            getHighSpeedVideoFpsRanges = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 / 2;
            }
        }
        getHighSpeedVideoSizes(j << 3);
        getHighSpeedVideoFpsRanges();
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i7 = ~identityHashCode;
        int i8 = (((i7 ^ (-33686273)) | (i7 & (-33686273))) * (-490)) + 1333163101;
        int i9 = ~(identityHashCode | 2111110205);
        int i10 = ((i9 ^ (-2144796478)) | (i9 & (-2144796478))) * 490;
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i11 = ~identityHashCode2;
        int i12 = ~((i11 & (-844313260)) | (i11 ^ (-844313260)));
        int i13 = ((i12 ^ 1743895461) | (i12 & 1743895461)) * (-90);
        int i14 = ((i13 | (-1201483168)) << 1) - (i13 ^ (-1201483168));
        int i15 = ((~((identityHashCode2 ^ (-844313260)) | (identityHashCode2 & (-844313260)))) | (-2012462000)) * (-45);
        int i16 = (i14 & i15) + (i15 | i14);
        int i17 = ~((identityHashCode2 ^ (-1743895462)) | (identityHashCode2 & (-1743895462)));
        int i18 = ((i17 ^ (-844313260)) | (i17 & (-844313260)) | (~((i11 ^ 1743895461) | (i11 & 1743895461)))) * 45;
        if ((((i8 | i10) << 1) - (i10 ^ i8)) + 1991620404 <= ((i16 | i18) << 1) - (i18 ^ i16)) {
            throw null;
        }
    }

    @Override // util.h.xy.ad.b
    public void getHighSpeedVideoFpsRangesFor() {
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 23) + (i | 23)) % 128;
        this.getHighSpeedVideoFpsRangesFor = 0L;
        this.Camera2StreamConfigurationMap = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            if (i2 >= bArr.length) {
                int i3 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoFpsRanges = (((i3 | 23) << 1) - (i3 ^ 23)) % 128;
                return;
            }
            int i4 = getHighResolutionOutputSizeshNQ4ISI;
            int i5 = ((i4 | 125) << 1) - (i4 ^ 125);
            getHighSpeedVideoFpsRanges = i5 % 128;
            if (i5 % 2 == 0) {
                bArr[i2] = 1;
                i2 += 98;
            } else {
                bArr[i2] = 0;
                i2++;
            }
        }
    }

    @Override // util.h.xy.ad.ma
    public final int getHighSpeedVideoSizes() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i ^ 73) + ((i & 73) << 1)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        getHighResolutionOutputSizeshNQ4ISI = ((i2 & 51) + (i2 | 51)) % 128;
        return 64;
    }
}
