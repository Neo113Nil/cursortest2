package util.h.xy.ep;

/* loaded from: classes5.dex */
public class mc implements util.h.xy.ef.mb {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: ˏ, reason: contains not printable characters */
    public byte[] m26663() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 51) + (i | 51);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
        throw null;
    }

    public mc(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.getHighResolutionOutputSizeshNQ4ISI = bArr2;
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    public mc(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }
}
