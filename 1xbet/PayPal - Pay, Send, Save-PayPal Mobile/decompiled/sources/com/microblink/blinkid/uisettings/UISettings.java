package com.microblink.blinkid.uisettings;

/* loaded from: classes10.dex */
public abstract class UISettings<ScanOverlayType extends com.microblink.blinkid.fragment.overlay.ScanningOverlay> {
    private static final java.lang.String Camera2StreamConfigurationMap;
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private static final java.lang.String getHighSpeedVideoFpsRanges;
    private static final java.lang.String getHighSpeedVideoSizes;
    private final android.os.Bundle getHighSpeedVideoFpsRangesFor;

    public UISettings() {
        this.getHighSpeedVideoFpsRangesFor = new android.os.Bundle();
    }

    public abstract ScanOverlayType createOverlayController(android.app.Activity activity, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener);

    public final int getActivityTheme() {
        return this.getHighSpeedVideoFpsRangesFor.getInt(Camera2StreamConfigurationMap, 0);
    }

    public final boolean getFilterTouchesWhenObscured() {
        return this.getHighSpeedVideoFpsRangesFor.getBoolean(getHighSpeedVideoSizes, false);
    }

    final com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings getHighResolutionOutputSizeshNQ4ISI() {
        com.microblink.blinkid.uisettings.CameraSettings cameraSettings = (com.microblink.blinkid.uisettings.CameraSettings) this.getHighSpeedVideoFpsRangesFor.getParcelable(getHighSpeedVideoFpsRanges);
        com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings.Builder builder = new com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings.Builder();
        if (cameraSettings != null) {
            builder.setAspectMode(cameraSettings.aspectMode);
            builder.setPreviewZoomScale(cameraSettings.previewZoomScale);
            builder.setForceLegacyApi(cameraSettings.forceLegacyApi);
            builder.setIsOptimizedForNearScan(cameraSettings.isOptimizedForNearScan);
            builder.setIsPinchToZoomAllowed(cameraSettings.isPinchToZoomAllowed);
            builder.setSurface(cameraSettings.surface);
            builder.setType(cameraSettings.type);
            builder.setVideoResolutionPreset(cameraSettings.videoResolutionPreset);
        }
        return builder.build();
    }

    final android.os.Parcelable getHighSpeedVideoFpsRangesFor(java.lang.String str, android.os.Parcelable parcelable) {
        android.os.Parcelable parcelable2 = this.getHighSpeedVideoFpsRangesFor.getParcelable(str);
        return parcelable2 == null ? parcelable : parcelable2;
    }

    public abstract java.lang.Class<?> getTargetActivity();

    public final boolean getUsingFlagSecure() {
        return this.getHighSpeedVideoFpsRangesFor.getBoolean(getHighResolutionOutputSizeshNQ4ISI, false);
    }

    public void saveToIntent(android.content.Intent intent) {
        intent.putExtra("com.microblink.blinkid.activity.extras.settingsBundle", this.getHighSpeedVideoFpsRangesFor);
    }

    public final void setActivityTheme(int i) {
        this.getHighSpeedVideoFpsRangesFor.putInt(Camera2StreamConfigurationMap, i);
    }

    public final void setCameraSettings(com.microblink.blinkid.uisettings.CameraSettings cameraSettings) {
        this.getHighSpeedVideoFpsRangesFor.putParcelable(getHighSpeedVideoFpsRanges, cameraSettings);
    }

    public final void setFilterTouchesWhenObscured(boolean z) {
        this.getHighSpeedVideoFpsRangesFor.putBoolean(getHighSpeedVideoSizes, z);
    }

    public final void setUsingFlagSecure(boolean z) {
        this.getHighSpeedVideoFpsRangesFor.putBoolean(getHighResolutionOutputSizeshNQ4ISI, z);
    }

    final java.io.Serializable getHighSpeedVideoSizes(java.lang.String str) {
        return this.getHighSpeedVideoFpsRangesFor.getSerializable(str);
    }

    UISettings(android.content.Intent intent) {
        android.os.Bundle bundleExtra = intent.getBundleExtra("com.microblink.blinkid.activity.extras.settingsBundle");
        this.getHighSpeedVideoFpsRangesFor = bundleExtra;
        if (bundleExtra == null) {
            this.getHighSpeedVideoFpsRangesFor = new android.os.Bundle();
        }
    }

    final int getHighSpeedVideoFpsRanges(java.lang.String str, int i) {
        return this.getHighSpeedVideoFpsRangesFor.getInt(str, i);
    }

    final boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, boolean z) {
        return this.getHighSpeedVideoFpsRangesFor.getBoolean(str, z);
    }

    final long getHighSpeedVideoFpsRanges(long j, java.lang.String str) {
        return this.getHighSpeedVideoFpsRangesFor.getLong(str, j);
    }

    final void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, android.os.Parcelable parcelable) {
        this.getHighSpeedVideoFpsRangesFor.putParcelable(str, parcelable);
    }

    final android.os.Parcelable getHighSpeedVideoFpsRanges(java.lang.String str) {
        return this.getHighSpeedVideoFpsRangesFor.getParcelable(str);
    }

    final void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, com.microblink.blinkid.uisettings.options.OverlayOrientation overlayOrientation) {
        this.getHighSpeedVideoFpsRangesFor.putSerializable(str, overlayOrientation);
    }

    final void getHighSpeedVideoSizes(java.lang.String str, int i) {
        this.getHighSpeedVideoFpsRangesFor.putInt(str, i);
    }

    final void getHighSpeedVideoFpsRanges(java.lang.String str, boolean z) {
        this.getHighSpeedVideoFpsRangesFor.putBoolean(str, z);
    }

    final void getHighResolutionOutputSizeshNQ4ISI(long j, java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor.putLong(str, j);
    }

    static {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("mb.");
        sb.append("Common");
        sb.append(".");
        sb.append("usingFlagSecure");
        getHighResolutionOutputSizeshNQ4ISI = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("mb.");
        sb2.append("Common");
        sb2.append(".");
        sb2.append("filterTouchesWhenObscured");
        getHighSpeedVideoSizes = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("mb.");
        sb3.append("Common");
        sb3.append(".");
        sb3.append("cameraSettings");
        getHighSpeedVideoFpsRanges = sb3.toString();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("mb.");
        sb4.append("Common");
        sb4.append(".");
        sb4.append("activityTheme");
        Camera2StreamConfigurationMap = sb4.toString();
    }
}
