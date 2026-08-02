package com.adjust.sdk;

/* loaded from: classes7.dex */
public class StoreInfoUtil {
    public static java.lang.String getInitiatingPackageName(android.content.Context context) {
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            java.lang.String packageName = context.getPackageName();
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                return packageManager.getInstallSourceInfo(packageName).getInitiatingPackageName();
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.String getOriginatingPackageName(android.content.Context context) {
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            java.lang.String packageName = context.getPackageName();
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                return packageManager.getInstallSourceInfo(packageName).getOriginatingPackageName();
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.String getStoreIdFromSystem(android.content.Context context) {
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            java.lang.String packageName = context.getPackageName();
            return android.os.Build.VERSION.SDK_INT >= 30 ? packageManager.getInstallSourceInfo(packageName).getInstallingPackageName() : packageManager.getInstallerPackageName(packageName);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static com.adjust.sdk.AdjustStoreInfo getStoreInfoFromClient(com.adjust.sdk.AdjustConfig adjustConfig, android.content.Context context) {
        try {
            android.os.Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return adjustConfig.storeInfo;
            }
            java.lang.String string = bundle.getString("ADJUST_STORE_NAME");
            if (string != null && !string.isEmpty()) {
                java.lang.String string2 = bundle.getString("ADJUST_STORE_APP_ID");
                com.adjust.sdk.AdjustStoreInfo adjustStoreInfo = new com.adjust.sdk.AdjustStoreInfo(string);
                adjustStoreInfo.setStoreAppId(string2);
                return adjustStoreInfo;
            }
            return adjustConfig.storeInfo;
        } catch (java.lang.Exception unused) {
            return adjustConfig.storeInfo;
        }
    }
}
