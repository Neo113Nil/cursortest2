package util.h.xy.v;

/* loaded from: classes5.dex */
public final class mc<T> implements com.gemalto.mfs.mwsdk.sdkconfig.SDKError {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getInputSizeshNQ4ISI;
    java.lang.Throwable Camera2StreamConfigurationMap;
    java.util.HashMap<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRanges;
    java.lang.String getHighSpeedVideoFpsRangesFor;
    T getHighSpeedVideoSizes;

    public mc(T t, java.lang.String str, java.lang.Throwable th, java.util.HashMap<java.lang.String, java.lang.Object> hashMap) {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoSizes = null;
        new java.util.HashMap();
        this.getHighSpeedVideoSizes = t;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = th;
        this.getHighSpeedVideoFpsRanges = hashMap;
        java.lang.String str2 = util.h.xy.al.ra.f648;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(util.h.xy.al.ra.f644);
        sb.append(t);
        sb.append(util.h.xy.al.ra.f644);
        sb.append(util.h.xy.al.rc.m25022(th));
        util.h.xy.am.ma.m25029(str2, sb.toString());
    }

    public mc(T t, java.lang.String str, java.lang.Throwable th) {
        this(t, str, th, new java.util.HashMap());
    }

    public mc(T t, java.lang.String str) {
        this(t, str, null, new java.util.HashMap());
    }

    @Override // com.gemalto.mfs.mwsdk.sdkconfig.SDKError
    public final java.lang.String getErrorMessage() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f789);
        sb.append(util.h.xy.al.ra.f496);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 75) % 128;
        return str2;
    }

    @Override // com.gemalto.mfs.mwsdk.sdkconfig.SDKError
    public final T getErrorCode() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f789);
        sb.append(util.h.xy.al.ra.f528);
        util.h.xy.am.ma.m25027(str, sb.toString());
        T t = this.getHighSpeedVideoSizes;
        int i = getInputSizeshNQ4ISI;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 1) + ((i & 1) << 1)) % 128;
        return t;
    }

    @Override // com.gemalto.mfs.mwsdk.sdkconfig.SDKError
    public final java.util.HashMap<java.lang.String, java.lang.Object> getAdditionalInformation() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f789);
        sb.append(util.h.xy.al.ra.f560);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = this.getHighSpeedVideoFpsRanges;
        int i = getHighResolutionOutputSizeshNQ4ISI + 29;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return hashMap;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.sdkconfig.SDKError
    public final java.lang.Throwable getCausingException() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f789);
        sb.append(util.h.xy.al.ra.f767);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.Throwable th = this.Camera2StreamConfigurationMap;
        int i = getInputSizeshNQ4ISI + 101;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return th;
        }
        throw new java.lang.ArithmeticException();
    }
}
