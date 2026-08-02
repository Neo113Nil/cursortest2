package util.h.xy.cm;

/* loaded from: classes18.dex */
public final class b implements javax.security.auth.Destroyable {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoSizes;

    public b(byte[] bArr, byte[] bArr2) {
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        if (bArr == null) {
            this.getHighSpeedVideoSizes = new byte[0];
        } else {
            byte[] bArr3 = new byte[bArr.length];
            this.getHighSpeedVideoSizes = bArr3;
            java.lang.System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        }
        if (bArr2 == null) {
            this.getHighSpeedVideoFpsRanges = new byte[0];
        } else {
            byte[] bArr4 = new byte[bArr2.length];
            this.getHighSpeedVideoFpsRanges = bArr4;
            java.lang.System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = false;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m25960() {
        byte[] bArr;
        int i = Camera2StreamConfigurationMap;
        int i2 = (i & 21) + (i | 21);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            byte[] bArr2 = this.getHighSpeedVideoSizes;
            bArr = new byte[bArr2.length];
            java.lang.System.arraycopy(bArr2, 0, bArr, 1, bArr2.length);
        } else {
            byte[] bArr3 = this.getHighSpeedVideoSizes;
            bArr = new byte[bArr3.length];
            java.lang.System.arraycopy(bArr3, 0, bArr, 0, bArr3.length);
        }
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 3) % 128;
        return bArr;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m25959() {
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 69) % 128;
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        byte[] bArr2 = new byte[bArr.length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 49) + ((i & 49) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr2;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() throws javax.security.auth.DestroyFailedException {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i & 23) + (i | 23);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            util.h.xy.cv.ra.m26066(this.getHighSpeedVideoSizes);
            util.h.xy.cv.ra.m26066(this.getHighSpeedVideoFpsRanges);
            this.getHighResolutionOutputSizeshNQ4ISI = false;
        } else {
            util.h.xy.cv.ra.m26066(this.getHighSpeedVideoSizes);
            util.h.xy.cv.ra.m26066(this.getHighSpeedVideoFpsRanges);
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        }
        int i3 = Camera2StreamConfigurationMap;
        int i4 = ((i3 | 19) << 1) - (i3 ^ 19);
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (i + 85) % 128;
        boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i + 61) % 128;
        return z;
    }
}
