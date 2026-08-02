package com.google.android.gms.common.util;

/* loaded from: classes8.dex */
public class ClientLibraryUtils {
    public static int getClientVersion(android.content.Context context, java.lang.String str) {
        android.os.Bundle bundle;
        android.content.pm.PackageInfo packageInfo = getPackageInfo(context, str);
        if (packageInfo == null || packageInfo.applicationInfo == null || (bundle = packageInfo.applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    public static android.content.pm.PackageInfo getPackageInfo(android.content.Context context, java.lang.String str) {
        try {
            return com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(str, 128);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean isPackageSide() {
        return false;
    }

    private ClientLibraryUtils() {
    }
}
