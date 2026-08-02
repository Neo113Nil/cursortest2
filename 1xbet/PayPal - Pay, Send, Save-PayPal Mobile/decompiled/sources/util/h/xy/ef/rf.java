package util.h.xy.ef;

/* loaded from: classes5.dex */
public abstract class rf {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoSizes;

    /* renamed from: ˋ, reason: contains not printable characters */
    protected int f2152;

    /* renamed from: ˏ, reason: contains not printable characters */
    protected byte[] f2153;

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected byte[] f2154;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m26568(byte[] bArr, byte[] bArr2, int i) {
        int i2 = getHighSpeedVideoSizes;
        int i3 = (i2 ^ 89) + ((i2 & 89) << 1);
        getHighSpeedVideoFpsRanges = i3 % 128;
        this.f2154 = bArr;
        this.f2153 = bArr2;
        this.f2152 = i;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
