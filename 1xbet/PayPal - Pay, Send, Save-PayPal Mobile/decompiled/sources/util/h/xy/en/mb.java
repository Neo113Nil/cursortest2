package util.h.xy.en;

/* loaded from: classes5.dex */
public final class mb implements util.h.xy.en.a {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private long[] getHighSpeedVideoFpsRanges;

    @Override // util.h.xy.en.a
    /* renamed from: ˎ */
    public final void mo26614(long j, byte[] bArr) {
        long[] m26620 = util.h.xy.en.ra.m26620();
        if (j > 0) {
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 5) % 128;
            long[] jArr = new long[2];
            util.h.xy.en.ra.m26618(this.getHighSpeedVideoFpsRanges, jArr);
            int i = getHighResolutionOutputSizeshNQ4ISI;
            Camera2StreamConfigurationMap = ((i & 93) + (i | 93)) % 128;
            do {
                if ((1 & j) != 0) {
                    int i2 = getHighResolutionOutputSizeshNQ4ISI;
                    Camera2StreamConfigurationMap = (((i2 | 63) << 1) - (i2 ^ 63)) % 128;
                    util.h.xy.en.ra.m26623(m26620, jArr);
                }
                util.h.xy.en.ra.m26628(jArr, jArr);
                j >>>= 1;
            } while (j > 0);
        }
        util.h.xy.en.ra.m26631(m26620, bArr);
    }

    @Override // util.h.xy.en.a
    /* renamed from: ˏ */
    public final void mo26615(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 59) << 1) - (i ^ 59);
        Camera2StreamConfigurationMap = i2 % 128;
        int i3 = i2 % 2;
        this.getHighSpeedVideoFpsRanges = util.h.xy.en.ra.m26624(bArr);
        if (i3 != 0) {
            throw null;
        }
    }
}
