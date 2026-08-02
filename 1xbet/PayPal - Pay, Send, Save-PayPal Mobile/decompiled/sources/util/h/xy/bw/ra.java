package util.h.xy.bw;

/* loaded from: classes18.dex */
final class ra<T> implements com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationResult {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private final T Camera2StreamConfigurationMap;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoSizes;

    public ra(boolean z, T t, java.lang.String str) {
        java.lang.String str2 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f660);
        sb.append(util.h.xy.al.ra.f433);
        util.h.xy.am.ma.m25027(str2, sb.toString());
        this.Camera2StreamConfigurationMap = t;
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoFpsRanges = str;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationResult
    public final boolean isSuccessful() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f660);
        sb.append(util.h.xy.al.ra.f292);
        util.h.xy.am.ma.m25027(str, sb.toString());
        boolean z = this.getHighSpeedVideoSizes;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 111) + (i | 111);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationResult
    public final T getResult() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f660);
        sb.append(util.h.xy.al.ra.f696);
        util.h.xy.am.ma.m25027(str, sb.toString());
        T t = this.Camera2StreamConfigurationMap;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 45) << 1) - (i ^ 45);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return t;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationResult
    public final java.lang.String getErrorMessage() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f660);
        sb.append(util.h.xy.al.ra.f496);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 75) % 128;
        return str2;
    }
}
