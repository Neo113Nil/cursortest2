package com.daon.dmds.activities;

/* loaded from: classes7.dex */
public final /* synthetic */ class DefaultScanActivity$$ExternalSyntheticLambda1 implements java.lang.Runnable {
    public final /* synthetic */ com.daon.dmds.activities.DefaultScanActivity f$0;

    @Override // java.lang.Runnable
    public final void run() {
        com.daon.dmds.activities.DefaultScanActivity defaultScanActivity = this.f$0;
        com.daon.dmds.models.DMDSOrientation deviceOrientation = com.daon.dmds.utils.DMDSDocumentUtils.getDeviceOrientation(defaultScanActivity);
        int measuredWidth = defaultScanActivity.Camera2StreamConfigurationMap.getMeasuredWidth();
        int measuredHeight = defaultScanActivity.Camera2StreamConfigurationMap.getMeasuredHeight();
        com.daon.dmds.models.DMDSRect portraitScanningRegion = deviceOrientation == com.daon.dmds.models.DMDSOrientation.DMDS_ORIENTATION_PORTRAIT ? defaultScanActivity.getHighSpeedVideoFpsRanges.getUiOptions().getPortraitScanningRegion() : defaultScanActivity.getHighSpeedVideoFpsRanges.getUiOptions().getLandscapeScanningRegion();
        defaultScanActivity.Camera2StreamConfigurationMap.setScanningRegion(measuredWidth, measuredHeight, portraitScanningRegion, deviceOrientation.ordinal());
        defaultScanActivity.getHighSpeedVideoSizes.setScanningRegion(portraitScanningRegion, false);
    }
}
