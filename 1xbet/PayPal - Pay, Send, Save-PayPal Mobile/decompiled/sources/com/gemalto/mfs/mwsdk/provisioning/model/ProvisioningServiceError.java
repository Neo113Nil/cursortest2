package com.gemalto.mfs.mwsdk.provisioning.model;

/* loaded from: classes3.dex */
public class ProvisioningServiceError {
    public static final int CPS_ERROR_CODE_DEFAULT = -1;
    private static int Camera2StreamConfigurationMap = 0;
    public static final int HTTP_STATUS_CODE_DEFAULT = -2;
    public static final int HTTP_STATUS_CODE_NO_INTERNET = -101;
    public static final int HTTP_STATUS_TIMEOUT = 504;
    public static final int RAGES_COMMON_NO_INTERNET = -103;
    public static final int RAGES_CONNECTION_ERROR = -104;
    public static final int RAGES_CRYPTO_ERROR = -109;
    public static final int RAGES_INTERNAL_ERROR = -102;
    public static final int RAGES_INVALID_JSON_FORMAT_ERROR = -106;
    public static final int RAGES_SERVER_ERROR = -105;
    public static final int RAGES_STORAGE_ERROR = -107;
    public static final int RAGES_USER_NOT_ENROLLED = -108;
    public static final int REPERSO_TIMEOUT_ERROR = -104;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static java.lang.String getHighSpeedVideoFpsRanges = null;
    private static char[] getHighSpeedVideoFpsRangesFor = null;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 1;
    private static long getOutputFormats;
    private final java.lang.Throwable getInputFormats;
    private final java.lang.String getInputSizeshNQ4ISI;
    private final int getOutputMinFrameDuration;
    private final com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes getOutputMinFrameDurationlomOqCM;
    private com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError getOutputSizes;
    private final int getOutputSizeshNQ4ISI;
    private final java.lang.String getOutputStallDuration;
    private final java.util.Map<java.lang.String, java.lang.String> getOutputStallDurationlomOqCM;

    static {
        Camera2StreamConfigurationMap();
        int i = 0;
        int blue = android.graphics.Color.blue(0);
        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        char c = (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2251);
        int i2 = 10 - blue;
        int i3 = lastIndexOf + 1;
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i2];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i2) {
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 9) % 128;
            jArr[rbVar.f2651] = (((char) (getHighSpeedVideoFpsRangesFor[rbVar.f2651 + i3] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputFormats))) ^ c;
            rbVar.f2651++;
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 99) % 128;
        }
        char[] cArr = new char[i2];
        while (true) {
            rbVar.f2651 = i;
            if (rbVar.f2651 >= i2) {
                getHighSpeedVideoFpsRanges = new java.lang.String(cArr).intern();
                getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 55) % 128;
                return;
            }
            int i4 = Camera2StreamConfigurationMap + 109;
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 == 0) {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                int i5 = rbVar.f2651;
                throw new java.lang.ArithmeticException();
            }
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            i = rbVar.f2651 + 1;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes, int i, int i2, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        this(provisioningServiceErrorCodes, i, i2, str, str2, null, map);
        if (str2 == null || str2.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getHighSpeedVideoFpsRanges);
            sb.append(i2);
            str2 = sb.toString();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes, int i, int i2, java.lang.String str, java.lang.String str2, java.lang.Throwable th, java.util.Map<java.lang.String, java.lang.String> map, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError) {
        this(provisioningServiceErrorCodes, i, i2, str, r7, th, map);
        java.lang.String obj;
        if (str2 == null || str2.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getHighSpeedVideoFpsRanges);
            sb.append(i2);
            obj = sb.toString();
        } else {
            obj = str2;
        }
        this.getOutputSizes = provisioningServiceError;
    }

    public ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes, int i, int i2, java.lang.String str, java.lang.String str2, java.lang.Throwable th, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String obj;
        this.getOutputSizes = null;
        java.lang.String str3 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f786);
        sb.append(util.h.xy.al.ra.f433);
        util.h.xy.am.ma.m25027(str3, sb.toString());
        this.getOutputMinFrameDurationlomOqCM = provisioningServiceErrorCodes;
        this.getOutputSizeshNQ4ISI = i;
        this.getOutputMinFrameDuration = i2;
        this.getOutputStallDuration = str;
        if (str2 == null || str2.isEmpty()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(getHighSpeedVideoFpsRanges);
            sb2.append(i2);
            obj = sb2.toString();
        } else {
            obj = str2;
        }
        this.getInputSizeshNQ4ISI = obj;
        this.getInputFormats = th;
        this.getOutputStallDurationlomOqCM = map == null ? new java.util.HashMap<>() : map;
        java.lang.String str4 = util.h.xy.al.ra.f500;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(str2);
        sb3.append(util.h.xy.al.ra.f644);
        sb3.append(util.h.xy.al.rc.m25022(th));
        util.h.xy.am.ma.m25029(str4, sb3.toString());
    }

    public com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes getSdkErrorCode() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f786);
        sb.append(util.h.xy.al.ra.f555);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = this.getOutputMinFrameDurationlomOqCM;
        getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 79) % 128;
        return provisioningServiceErrorCodes;
    }

    public int getHttpStatusCode() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f786);
        sb.append(util.h.xy.al.ra.f620);
        util.h.xy.am.ma.m25027(str, sb.toString());
        int i = this.getOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 79) % 128;
        return i;
    }

    public int getCpsErrorCode() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f786);
        sb.append(util.h.xy.al.ra.f581);
        util.h.xy.am.ma.m25027(str, sb.toString());
        int i = this.getOutputMinFrameDuration;
        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 53) % 128;
        return i;
    }

    public java.lang.String getTokenId() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f786);
        sb.append(util.h.xy.al.ra.f329);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getOutputStallDuration;
        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 103) % 128;
        return str2;
    }

    public java.lang.String getErrorMessage() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f786);
        sb.append(util.h.xy.al.ra.f496);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getInputSizeshNQ4ISI;
        int i = getHighSpeedVideoSizes + 75;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            return str2;
        }
        throw null;
    }

    public java.util.Map<java.lang.String, java.lang.String> getStatusAdditionalInfo() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f786);
        sb.append(util.h.xy.al.ra.f615);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.util.Map<java.lang.String, java.lang.String> map = this.getOutputStallDurationlomOqCM;
        int i = getHighSpeedVideoSizes + 93;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            return map;
        }
        throw null;
    }

    public java.lang.Throwable getCausingException() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f786);
        sb.append(util.h.xy.al.ra.f491);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.Throwable th = this.getInputFormats;
        getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 95) % 128;
        return th;
    }

    public com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError getLastError() {
        int i = (getHighSpeedVideoSizes + 73) % 128;
        getHighSpeedVideoSizesFor = i;
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError = this.getOutputSizes;
        getHighSpeedVideoSizes = (i + 97) % 128;
        return provisioningServiceError;
    }

    static void Camera2StreamConfigurationMap() {
        getHighSpeedVideoFpsRangesFor = new char[]{38025, 30899, 19659, 20625, 9259, 2165, 7246, 57786, 62960, 55707};
        getOutputFormats = 6144326788566642728L;
    }
}
