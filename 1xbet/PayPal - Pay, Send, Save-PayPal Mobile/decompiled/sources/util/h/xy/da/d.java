package util.h.xy.da;

/* loaded from: classes5.dex */
public final class d {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.da.ra m26260(util.h.xy.da.ma maVar, java.lang.String str) throws util.h.xy.da.b {
        int i = getHighResolutionOutputSizeshNQ4ISI + 85;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            getHighSpeedVideoFpsRanges(maVar, str);
            throw null;
        }
        util.h.xy.da.ra highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(maVar, str);
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i2 & 63) + (i2 | 63)) % 128;
        return highSpeedVideoFpsRanges;
    }

    private static util.h.xy.da.ra getHighSpeedVideoFpsRanges(util.h.xy.da.ma maVar, java.lang.String str) throws util.h.xy.da.b {
        util.h.xy.da.ra m26096 = new util.h.xy.cw.rb().m26096(maVar, str);
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i ^ 111) + ((i & 111) << 1)) % 128;
        return m26096;
    }
}
