package com.adobe.marketing.mobile.services;

/* loaded from: classes3.dex */
public interface DeviceInforming {

    /* loaded from: classes7.dex */
    public enum ConnectionStatus {
        CONNECTED,
        DISCONNECTED,
        UNKNOWN
    }

    /* loaded from: classes7.dex */
    public enum DeviceType {
        PHONE,
        TABLET,
        WATCH,
        UNKNOWN
    }

    /* loaded from: classes7.dex */
    public interface DisplayInformation {
        int getDensityDpi();

        int getHeightPixels();

        int getWidthPixels();
    }

    /* loaded from: classes7.dex */
    public interface NetworkConnectionActiveListener {
        void onActive();
    }

    java.util.Locale getActiveLocale();

    java.io.File getApplicationBaseDir();

    java.io.File getApplicationCacheDir();

    java.lang.String getApplicationName();

    java.lang.String getApplicationPackageName();

    java.lang.String getApplicationVersion();

    java.lang.String getApplicationVersionCode();

    java.io.InputStream getAsset(java.lang.String str);

    java.lang.String getCanonicalPlatformName();

    int getCurrentOrientation();

    java.lang.String getDefaultUserAgent();

    java.lang.String getDevice();

    java.lang.String getDeviceBrand();

    java.lang.String getDeviceBuildId();

    java.lang.String getDeviceManufacturer();

    java.lang.String getDeviceName();

    com.adobe.marketing.mobile.services.DeviceInforming.DeviceType getDeviceType();

    java.lang.String getDeviceUniqueId();

    com.adobe.marketing.mobile.services.DeviceInforming.DisplayInformation getDisplayInformation();

    java.lang.String getLocaleString();

    java.lang.String getMobileCarrierName();

    com.adobe.marketing.mobile.services.DeviceInforming.ConnectionStatus getNetworkConnectionStatus();

    java.lang.String getOperatingSystemName();

    java.lang.String getOperatingSystemVersion();

    java.lang.String getPropertyFromManifest(java.lang.String str);

    java.lang.String getRunMode();

    java.util.Locale getSystemLocale();

    boolean registerOneTimeNetworkConnectionActiveListener(com.adobe.marketing.mobile.services.DeviceInforming.NetworkConnectionActiveListener networkConnectionActiveListener);
}
