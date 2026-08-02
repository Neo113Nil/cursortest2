package util.h.xy.ef;

/* loaded from: classes18.dex */
public class a {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRangesFor;

    /* renamed from: ˊ, reason: contains not printable characters */
    protected java.security.SecureRandom f2141;

    /* renamed from: ˏ, reason: contains not printable characters */
    protected int f2142;

    /* renamed from: ˎ, reason: contains not printable characters */
    public byte[] mo26533() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 77) + ((i & 77) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        byte[] bArr = new byte[this.f2142];
        int i3 = i2 % 2;
        this.f2141.nextBytes(bArr);
        if (i3 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void mo26532(util.h.xy.ef.re reVar) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (((i | 47) << 1) - (i ^ 47)) % 128;
        this.f2141 = reVar.m26566();
        int m26567 = reVar.m26567();
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i2 = -(-(m26567 * com.visa.cbp.getCertUsage.setODAData));
        int i3 = ~identityHashCode;
        int i4 = ~((i3 ^ (-8)) | (i3 & (-8)));
        int i5 = ~((m26567 ^ identityHashCode) | (m26567 & identityHashCode));
        int i6 = ~((identityHashCode ^ (-8)) | (identityHashCode & (-8)));
        int i7 = ~((m26567 ^ i3) | (m26567 & i3));
        this.f2142 = ((((((i2 ^ (-4655)) + ((i2 & (-4655)) << 1)) + 2664) + (((i4 & i5) | (i4 ^ i5)) * com.visa.cbp.getCertUsage.getODAData)) - (~(-(-(((i7 ^ i6) | (i7 & i6)) * com.visa.cbp.getCertUsage.getODAData))))) - 1) / 8;
        int i8 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = ((i8 & 37) + (i8 | 37)) % 128;
    }
}
