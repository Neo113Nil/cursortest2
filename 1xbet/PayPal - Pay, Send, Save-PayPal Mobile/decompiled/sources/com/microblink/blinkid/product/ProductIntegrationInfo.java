package com.microblink.blinkid.product;

/* loaded from: classes10.dex */
public final class ProductIntegrationInfo {
    private static com.microblink.blinkid.product.ProductIntegrationInfo getHighSpeedVideoSizes;
    private final java.lang.String Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizesFor;
    private final java.lang.String getInputFormats = "ANDROID";
    private final java.lang.String getInputSizeshNQ4ISI;
    private final java.lang.String getOutputFormats;
    private final java.lang.String getOutputMinFrameDuration;
    private final java.lang.String getOutputMinFrameDurationlomOqCM;

    private ProductIntegrationInfo(android.content.Context context) {
        this.getOutputMinFrameDurationlomOqCM = com.microblink.blinkid.secured.IlIIlIllll.llIIlIlIIl(context);
        com.microblink.blinkid.secured.IIlIIllIII IllIIIllII = com.microblink.blinkid.settings.NativeLibraryInfo.IllIIIllII();
        this.getOutputMinFrameDuration = com.microblink.blinkid.secured.lIIllllllI.llIIlIlIIl(IllIIIllII.llIIlIlIIl);
        this.getOutputFormats = IllIIIllII.IlIllIlIIl;
        this.getInputSizeshNQ4ISI = android.os.Build.VERSION.RELEASE;
        java.lang.String str = android.os.Build.MANUFACTURER;
        java.lang.String upperCase = str == null ? "" : str.toUpperCase(java.util.Locale.US);
        java.lang.String str2 = android.os.Build.MODEL;
        java.lang.String upperCase2 = str2 != null ? str2.toUpperCase(java.util.Locale.US) : "";
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(upperCase);
        sb.append(" - ");
        sb.append(upperCase2);
        this.getHighSpeedVideoFpsRanges = sb.toString();
        this.Camera2StreamConfigurationMap = com.microblink.blinkid.recognition.RightsManager.IlIllIlIIl();
        this.getHighSpeedVideoFpsRangesFor = com.microblink.blinkid.recognition.RightsManager.IllIIIllII();
        this.getHighResolutionOutputSizeshNQ4ISI = com.microblink.blinkid.recognition.RightsManager.llIIlIlIIl()[0];
        this.getHighSpeedVideoSizesFor = context.getPackageName();
    }

    public static final com.microblink.blinkid.product.ProductIntegrationInfo getProductIntegrationInfo(android.content.Context context) {
        if (getHighSpeedVideoSizes == null) {
            getHighSpeedVideoSizes = new com.microblink.blinkid.product.ProductIntegrationInfo(context);
        }
        return getHighSpeedVideoSizes;
    }

    public final java.lang.String getApplicationID() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String getDeviceName() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String getLicenseId() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String getLicensee() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String getOsVersion() {
        return this.getInputSizeshNQ4ISI;
    }

    public final java.lang.String getPackageName() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final java.lang.String getPlatform() {
        return "ANDROID";
    }

    public final java.lang.String getProduct() {
        return this.getOutputMinFrameDuration;
    }

    public final java.lang.String getProductVersion() {
        return this.getOutputFormats;
    }

    public final java.lang.String getUserId() {
        return this.getOutputMinFrameDurationlomOqCM;
    }
}
