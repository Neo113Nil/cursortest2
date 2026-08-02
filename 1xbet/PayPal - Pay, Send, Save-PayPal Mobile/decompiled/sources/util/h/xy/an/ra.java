package util.h.xy.an;

/* loaded from: classes5.dex */
public final class ra<T> implements com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> {
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private final java.lang.String Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;
    private final T getInputFormats;
    private final java.util.HashMap<java.lang.String, java.lang.Object> getInputSizeshNQ4ISI;
    private java.lang.Throwable getOutputFormats;

    public ra(T t, boolean z, java.lang.String str, int i, java.lang.Throwable th, java.util.HashMap<java.lang.String, java.lang.Object> hashMap) {
        this.getInputFormats = t;
        this.getHighSpeedVideoFpsRanges = z;
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getOutputFormats = th;
        this.getInputSizeshNQ4ISI = hashMap;
        if (z) {
            return;
        }
        java.lang.String str2 = util.h.xy.al.ra.f526;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(util.h.xy.al.ra.f644);
        sb.append(i);
        sb.append(util.h.xy.al.ra.f644);
        sb.append(util.h.xy.al.rc.m25022(th));
        util.h.xy.am.ma.m25029(str2, sb.toString());
    }

    public ra(T t, boolean z, java.lang.String str) {
        this(t, z, str, -1, null, new java.util.HashMap());
    }

    public ra(T t, boolean z, java.lang.String str, int i) {
        this(t, z, str, i, null, new java.util.HashMap());
    }

    public ra(T t, boolean z, java.lang.String str, int i, java.util.HashMap<java.lang.String, java.lang.Object> hashMap) {
        this(t, z, str, i, null, hashMap);
    }

    public ra(java.lang.String str) {
        this(null, false, str, -1);
    }

    public ra(java.lang.String str, int i) {
        this(null, false, str, i);
    }

    @Override // com.gemalto.mfs.mwsdk.utils.async.AsyncResult
    public final boolean isSuccessful() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f764);
        sb.append(util.h.xy.al.ra.f292);
        util.h.xy.am.ma.m25027(str, sb.toString());
        boolean z = this.getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 35) % 128;
        return z;
    }

    @Override // com.gemalto.mfs.mwsdk.utils.async.AsyncResult
    public final T getResult() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f764);
        sb.append(util.h.xy.al.ra.f696);
        util.h.xy.am.ma.m25027(str, sb.toString());
        T t = this.getInputFormats;
        int i = getHighSpeedVideoSizes + 57;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return t;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.utils.async.AsyncResult
    public final java.lang.String getErrorMessage() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f764);
        sb.append(util.h.xy.al.ra.f496);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.Camera2StreamConfigurationMap;
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 85) + (i | 85);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return str2;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.utils.async.AsyncResult
    public final int getErrorCode() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f764);
        sb.append(util.h.xy.al.ra.f528);
        util.h.xy.am.ma.m25027(str, sb.toString());
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 9) % 128;
        return i;
    }

    @Override // com.gemalto.mfs.mwsdk.utils.async.AsyncResult
    public final java.util.HashMap<java.lang.String, java.lang.Object> getAdditionalInformation() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f764);
        sb.append(util.h.xy.al.ra.f560);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = this.getInputSizeshNQ4ISI;
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 125) + ((i & 125) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return hashMap;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.utils.async.AsyncResult
    public final java.lang.Throwable getCausingException() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f764);
        sb.append(util.h.xy.al.ra.f491);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.Throwable th = this.getOutputFormats;
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 9) + (i | 9);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return th;
        }
        throw null;
    }
}
