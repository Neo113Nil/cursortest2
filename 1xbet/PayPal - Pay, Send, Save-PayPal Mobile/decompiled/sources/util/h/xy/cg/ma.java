package util.h.xy.cg;

/* loaded from: classes5.dex */
public class ma {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;
    private static java.lang.String getHighSpeedVideoSizes = util.h.xy.cg.ma.class.getName().toString();

    static {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i ^ 73) + ((i & 73) << 1)) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public boolean m25915(java.lang.String str) {
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 95) % 128;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus> m25926 = util.h.xy.cg.ra.m25926(str);
        if (!m25926.isSuccessful()) {
            int i = getHighSpeedVideoFpsRanges;
            getHighResolutionOutputSizeshNQ4ISI = (((i | 101) << 1) - (i ^ 101)) % 128;
            return false;
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 53) % 128;
        boolean needsReplenishment = m25926.getResult().needsReplenishment();
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 69) % 128;
        return needsReplenishment;
    }
}
