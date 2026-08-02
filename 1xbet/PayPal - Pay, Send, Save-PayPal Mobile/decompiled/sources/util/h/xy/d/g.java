package util.h.xy.d;

/* loaded from: classes5.dex */
public final class g extends java.lang.Exception {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI;
    private com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes getHighSpeedVideoFpsRangesFor;
    private java.util.HashMap<java.lang.String, java.lang.Object> getHighSpeedVideoSizes;

    public g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes dCMErrorCodes, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.Object> hashMap) {
        super(str);
        this.getHighSpeedVideoSizes = new java.util.HashMap<>();
        this.getHighSpeedVideoFpsRangesFor = dCMErrorCodes;
        if (hashMap != null) {
            this.getHighSpeedVideoSizes = hashMap;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final java.util.HashMap<java.lang.String, java.lang.Object> m26182() {
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 51) << 1) - (i ^ 51)) % 128;
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = this.getHighSpeedVideoSizes;
        int i2 = ((i | 21) << 1) - (i ^ 21);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return hashMap;
        }
        throw null;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = (((i | 83) << 1) - (i ^ 83)) % 128;
        java.lang.String message = super.getMessage();
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i2 ^ 77) + ((i2 & 77) << 1)) % 128;
        return message;
    }
}
