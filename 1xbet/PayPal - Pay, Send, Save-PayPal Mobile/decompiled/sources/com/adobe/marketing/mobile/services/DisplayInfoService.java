package com.adobe.marketing.mobile.services;

/* loaded from: classes7.dex */
class DisplayInfoService implements com.adobe.marketing.mobile.services.DeviceInforming.DisplayInformation {
    private final android.util.DisplayMetrics Camera2StreamConfigurationMap;

    DisplayInfoService(android.util.DisplayMetrics displayMetrics) {
        this.Camera2StreamConfigurationMap = displayMetrics;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming.DisplayInformation
    public int getWidthPixels() {
        return this.Camera2StreamConfigurationMap.widthPixels;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming.DisplayInformation
    public int getHeightPixels() {
        return this.Camera2StreamConfigurationMap.heightPixels;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming.DisplayInformation
    public int getDensityDpi() {
        return this.Camera2StreamConfigurationMap.densityDpi;
    }
}
