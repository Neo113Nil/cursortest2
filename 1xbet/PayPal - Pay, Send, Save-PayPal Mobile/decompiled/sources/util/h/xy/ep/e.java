package util.h.xy.ep;

/* loaded from: classes5.dex */
public final class e implements util.h.xy.ef.mb {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoFpsRanges;
    private util.h.xy.ef.mb getHighSpeedVideoSizes;

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.ef.mb m26659() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 3) + ((i & 3) << 1)) % 128;
        util.h.xy.ef.mb mbVar = this.getHighSpeedVideoSizes;
        int i2 = (i ^ 37) + ((i & 37) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return mbVar;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m26658() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = (i + 23) % 128;
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        int i2 = (i & 65) + (i | 65);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    public e(util.h.xy.ef.mb mbVar, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.getHighSpeedVideoFpsRanges = bArr2;
        this.getHighSpeedVideoSizes = mbVar;
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    public e(util.h.xy.ef.mb mbVar, byte[] bArr) {
        this(mbVar, bArr, 0, bArr.length);
    }
}
