package util.h.xy.bb;

/* loaded from: classes18.dex */
public final class me implements com.gemalto.mfs.mwsdk.mobilegateway.enrollment.ValidityPeriod {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoSizes = 1;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.ValidityPeriod
    public final java.lang.String getStartDate() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f397);
        sb.append(util.h.xy.al.ra.f677);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
        int i = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i ^ 31) + ((i & 31) << 1)) % 128;
        return str2;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.ValidityPeriod
    public final java.lang.String getEndDate() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f397);
        sb.append(util.h.xy.al.ra.f646);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighResolutionOutputSizeshNQ4ISI;
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i = ~((identityHashCode ^ 265968894) | (identityHashCode & 265968894));
        int i2 = ((i ^ 483656922) | (i & 483656922)) * 56;
        int i3 = ((i2 & 1720253080) + (i2 | 1720253080)) - 123447352;
        int i4 = ~identityHashCode;
        int i5 = ~((i4 ^ 483656922) | (i4 & 483656922));
        int i6 = -(-(((i5 ^ 265968894) | (i5 & 265968894)) * 56));
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i7 = 1717251752 - (~(-(-((~((identityHashCode2 ^ 375892630) | (identityHashCode2 & 375892630))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))));
        int i8 = ~identityHashCode2;
        if ((i3 ^ i6) + ((i6 & i3) << 1) <= ((((i7 | 603994056) << 1) - (603994056 ^ i7)) - (~(((~((i8 & 375892630) | (i8 ^ 375892630))) | 106954774) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))) - 1) {
            return str2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25331(java.lang.String str) {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 29) + ((i & 29) << 1);
        int i3 = i2 % 128;
        getHighSpeedVideoSizes = i3;
        if (i2 % 2 != 0) {
            this.getHighSpeedVideoFpsRanges = str;
            Camera2StreamConfigurationMap = (i3 + 105) % 128;
        } else {
            this.getHighSpeedVideoFpsRanges = str;
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25330(java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 115) + (i | 115);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            throw new java.lang.ArithmeticException();
        }
    }
}
