package util.h.xy.en;

/* loaded from: classes5.dex */
public final class b implements util.h.xy.en.ma {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoSizes;
    private byte[] Camera2StreamConfigurationMap;
    private long[][] getHighResolutionOutputSizeshNQ4ISI;

    @Override // util.h.xy.en.ma
    /* renamed from: ˎ, reason: contains not printable characters */
    public final void mo26616(byte[] bArr) {
        long j;
        long j2;
        int i;
        int i2 = getHighSpeedVideoSizes;
        int i3 = ((i2 | 23) << 1) - (i2 ^ 23);
        int i4 = i3 % 128;
        getHighSpeedVideoFpsRanges = i4;
        if (i3 % 2 == 0) {
            j = this.getHighResolutionOutputSizeshNQ4ISI[bArr[112] & 6702][1];
            i = 11;
            j2 = j;
        } else {
            long[] jArr = this.getHighResolutionOutputSizeshNQ4ISI[bArr[15] & 255];
            j = jArr[0];
            j2 = jArr[1];
            i = 14;
        }
        getHighSpeedVideoSizes = ((i4 ^ 83) + ((i4 & 83) << 1)) % 128;
        while (i >= 0) {
            int i5 = getHighSpeedVideoFpsRanges;
            int i6 = ((i5 ^ 47) + ((i5 & 47) << 1)) % 128;
            getHighSpeedVideoSizes = i6;
            long[] jArr2 = this.getHighResolutionOutputSizeshNQ4ISI[bArr[i] & 255];
            long j3 = j2 << 56;
            j2 = jArr2[1] ^ ((j2 >>> 8) | (j << 56));
            j = ((((jArr2[0] ^ (j >>> 8)) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2)) ^ (j3 >>> 7);
            i--;
            getHighSpeedVideoFpsRanges = (i6 + 51) % 128;
        }
        util.h.xy.fb.rb.m26848(j, bArr, 0);
        util.h.xy.fb.rb.m26848(j2, bArr, 8);
        int i7 = getHighSpeedVideoSizes;
        int i8 = (i7 & 95) + (i7 | 95);
        getHighSpeedVideoFpsRanges = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    @Override // util.h.xy.en.ma
    /* renamed from: ˏ, reason: contains not printable characters */
    public final void mo26617(byte[] bArr) {
        int i = 2;
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 11) % 128;
            this.getHighResolutionOutputSizeshNQ4ISI = (long[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Long.TYPE, 256, 2);
        } else if (util.h.xy.en.ra.m26621(this.Camera2StreamConfigurationMap, bArr) != 0) {
            return;
        }
        byte[] bArr2 = new byte[16];
        this.Camera2StreamConfigurationMap = bArr2;
        util.h.xy.en.ra.m26630(bArr, bArr2);
        util.h.xy.en.ra.m26627(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI[1]);
        long[] jArr = this.getHighResolutionOutputSizeshNQ4ISI[1];
        util.h.xy.en.ra.m26632(jArr, jArr);
        int i2 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = ((i2 ^ 43) + ((i2 & 43) << 1)) % 128;
        while (i < 256) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 13) % 128;
            long[][] jArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
            util.h.xy.en.ra.m26635(jArr2[i >> 1], jArr2[i]);
            long[][] jArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
            util.h.xy.en.ra.m26619(jArr3[i], jArr3[1], jArr3[(i ^ 1) + ((i & 1) << 1)]);
            i += 2;
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 11) % 128;
        }
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 15) % 128;
    }
}
