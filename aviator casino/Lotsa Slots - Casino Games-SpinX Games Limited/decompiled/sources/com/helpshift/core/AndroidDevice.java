package com.helpshift.core;

/* loaded from: classes.dex */
public class AndroidDevice implements com.helpshift.platform.Device {
    public static final java.lang.String LITE_SDK_VERSION = "10.5.0";
    private static final java.lang.String OS_TYPE = "android";
    private static final java.lang.String TAG = "Device";
    private final android.content.Context context;
    private final com.helpshift.storage.HSPersistentStorage persistentStorage;

    public AndroidDevice(android.content.Context context, com.helpshift.storage.HSPersistentStorage hSPersistentStorage) {
        this.context = context;
        this.persistentStorage = hSPersistentStorage;
    }

    @Override // com.helpshift.platform.Device
    public java.lang.String getSDKVersion() {
        return LITE_SDK_VERSION;
    }

    @Override // com.helpshift.platform.Device
    public java.lang.String getAppVersion() {
        try {
            return this.context.getPackageManager().getPackageInfo(getAppIdentifier(), 0).versionName;
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.d(TAG, "Error getting app version", e);
            return null;
        }
    }

    @Override // com.helpshift.platform.Device
    public java.lang.String getAppName() {
        java.lang.String str;
        try {
            str = this.context.getPackageManager().getApplicationLabel(this.context.getApplicationInfo()).toString();
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.d(TAG, "Error getting application name", e);
            str = null;
        }
        return str == null ? "Support" : str;
    }

    @Override // com.helpshift.platform.Device
    public java.lang.String getAppIdentifier() {
        return this.context.getPackageName();
    }

    @Override // com.helpshift.platform.Device
    public java.lang.String getDeviceModel() {
        return android.os.Build.MODEL;
    }

    @Override // com.helpshift.platform.Device
    public java.lang.String getBatteryLevel() {
        if (this.context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED")) == null) {
            return "";
        }
        return ((int) ((r0.getIntExtra(com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, -1) / r0.getIntExtra("scale", -1)) * 100.0f)) + "%";
    }

    @Override // com.helpshift.platform.Device
    public java.lang.String getBatteryStatus() {
        android.content.Intent registerReceiver = this.context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return "Not charging";
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        if (intExtra != 2 && intExtra != 5) {
            return "Not charging";
        }
        return "Charging";
    }

    @Override // com.helpshift.platform.Device
    public com.helpshift.util.ValuePair<java.lang.String, java.lang.String> getDiskSpace() {
        android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
        return new com.helpshift.util.ValuePair<>((java.lang.Math.round(((statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 1.073741824E9d) * 100.0d) / 100.0d) + " GB", (java.lang.Math.round(((statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1.073741824E9d) * 100.0d) / 100.0d) + " GB");
    }

    @Override // com.helpshift.platform.Device
    public java.lang.String getOsType() {
        return "android";
    }

    @Override // com.helpshift.platform.Device
    public java.lang.String getOSVersion() {
        return android.os.Build.VERSION.RELEASE;
    }

    @Override // com.helpshift.platform.Device
    public java.lang.String getCarrierName() {
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) this.context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
        return telephonyManager == null ? "" : telephonyManager.getNetworkOperatorName();
    }

    @Override // com.helpshift.platform.Device
    public java.lang.String getNetworkType() {
        android.net.NetworkInfo activeNetworkInfo;
        java.lang.String str = null;
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) this.context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                str = activeNetworkInfo.getTypeName();
            }
        } catch (java.lang.SecurityException unused) {
        }
        return str == null ? com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : str;
    }

    @Override // com.helpshift.platform.Device
    public java.lang.String getCountryCode() {
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) this.context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
        return telephonyManager == null ? "" : telephonyManager.getSimCountryIso();
    }

    @Override // com.helpshift.platform.Device
    public java.lang.String getRom() {
        return java.lang.System.getProperty("os.version") + ":" + android.os.Build.FINGERPRINT;
    }

    @Override // com.helpshift.platform.Device
    public java.lang.String getLanguage() {
        return com.helpshift.util.ApplicationUtil.getLanguage(this.context);
    }

    @Override // com.helpshift.platform.Device
    public boolean isOnline() {
        android.net.NetworkCapabilities networkCapabilities;
        if (com.helpshift.AndroidOSUtil.currentOSAPILevel() < 23) {
            return true;
        }
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) this.context.getSystemService("connectivity");
            android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            return networkCapabilities.hasCapability(12);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Exception while getting system connectivity service", e);
            return false;
        }
    }

    @Override // com.helpshift.platform.Device
    public java.lang.String encodeBase64(java.lang.String str) {
        return android.util.Base64.encodeToString(str.getBytes(), 2);
    }

    @Override // com.helpshift.platform.Device
    public java.lang.String getDeviceId() {
        java.lang.String hsDeviceId = this.persistentStorage.getHsDeviceId();
        if (!com.helpshift.util.Utils.isEmpty(hsDeviceId)) {
            return hsDeviceId;
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        this.persistentStorage.setHsDeviceId(uuid);
        return uuid;
    }

    @Override // com.helpshift.platform.Device
    public java.lang.String decodeBase64(java.lang.String str) {
        try {
            return new java.lang.String(android.util.Base64.decode(str, 8));
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.d(TAG, "Error in decoding string", e);
            return "";
        }
    }

    @Override // com.helpshift.platform.Device
    public java.lang.String decodeZlib(java.lang.String str) {
        try {
            return com.helpshift.util.Utils.decompressZlib(android.util.Base64.decode(str, 8));
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error is decoding gzip", e);
            return "";
        }
    }

    @Override // com.helpshift.platform.Device
    public java.lang.String getPackageName() {
        return this.context.getPackageName();
    }

    @Override // com.helpshift.platform.Device
    public int getResourceIdFromName(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return com.helpshift.util.ApplicationUtil.getResourceIdFromName(this.context, str, str2, str3);
    }

    @Override // com.helpshift.platform.Device
    public java.lang.String readAssetContent(java.lang.String str) {
        return com.helpshift.util.AssetsUtil.readAssetFileContents(this.context, str);
    }
}
