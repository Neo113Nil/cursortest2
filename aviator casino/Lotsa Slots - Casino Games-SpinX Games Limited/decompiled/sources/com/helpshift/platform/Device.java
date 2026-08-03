package com.helpshift.platform;

/* loaded from: classes2.dex */
public interface Device {
    java.lang.String decodeBase64(java.lang.String str);

    java.lang.String decodeZlib(java.lang.String str);

    java.lang.String encodeBase64(java.lang.String str);

    java.lang.String getAppIdentifier();

    java.lang.String getAppName();

    java.lang.String getAppVersion();

    java.lang.String getBatteryLevel();

    java.lang.String getBatteryStatus();

    java.lang.String getCarrierName();

    java.lang.String getCountryCode();

    java.lang.String getDeviceId();

    java.lang.String getDeviceModel();

    com.helpshift.util.ValuePair<java.lang.String, java.lang.String> getDiskSpace();

    java.lang.String getLanguage();

    java.lang.String getNetworkType();

    java.lang.String getOSVersion();

    java.lang.String getOsType();

    java.lang.String getPackageName();

    int getResourceIdFromName(java.lang.String str, java.lang.String str2, java.lang.String str3);

    java.lang.String getRom();

    java.lang.String getSDKVersion();

    boolean isOnline();

    java.lang.String readAssetContent(java.lang.String str);
}
