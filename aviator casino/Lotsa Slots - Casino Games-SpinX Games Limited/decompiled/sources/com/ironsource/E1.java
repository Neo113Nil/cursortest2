package com.ironsource;

/* loaded from: classes5.dex */
public class E1 {
    public static int a(android.app.Activity activity) {
        return activity.getRequestedOrientation();
    }

    public static java.lang.String b(android.content.Context context) {
        try {
            return a(context).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    public static java.lang.String c(android.content.Context context) {
        java.io.File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            return cacheDir.getPath();
        }
        return null;
    }

    public static boolean d(android.content.Context context, java.lang.String str) {
        boolean z = false;
        int i = 0;
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            if (packageInfo.requestedPermissions == null) {
                return false;
            }
            boolean z2 = false;
            while (true) {
                try {
                    java.lang.String[] strArr = packageInfo.requestedPermissions;
                    if (i >= strArr.length || z2) {
                        break;
                    }
                    z2 = str.equals(strArr[i]);
                    i++;
                } catch (java.lang.Exception e) {
                    e = e;
                    z = z2;
                    com.ironsource.C3180n4.d().a(e);
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                    return z;
                }
            }
            return z2;
        } catch (java.lang.Exception e2) {
            e = e2;
        }
    }

    public static java.lang.String e(android.content.Context context) {
        java.lang.String str;
        try {
            str = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            str = null;
        }
        return android.text.TextUtils.isEmpty(str) ? "" : str;
    }

    public static long f(android.content.Context context) {
        try {
            return a(context).lastUpdateTime;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return -1L;
        }
    }

    public static java.lang.String g(android.content.Context context) {
        return context.getPackageName();
    }

    public static org.json.JSONObject a(android.content.Context context, org.json.JSONArray jSONArray) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            int i = 0;
            if (jSONArray.length() == 0) {
                while (true) {
                    java.lang.String[] strArr = packageInfo.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    jSONObject.put(strArr[i], (packageInfo.requestedPermissionsFlags[i] & 2) != 0 ? "Granted" : "Rejected");
                    i++;
                }
            } else {
                java.util.List asList = java.util.Arrays.asList(packageInfo.requestedPermissions);
                while (i < jSONArray.length()) {
                    java.lang.String string = jSONArray.getString(i);
                    int indexOf = asList.indexOf(string);
                    if (indexOf != -1) {
                        jSONObject.put(string, (packageInfo.requestedPermissionsFlags[indexOf] & 2) != 0 ? "Granted" : "Rejected");
                    } else {
                        jSONObject.put(string, "notFoundInManifest");
                    }
                    i++;
                }
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }

    public static boolean c(android.content.Context context, java.lang.String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static java.lang.String b(android.content.Context context, java.lang.String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            return "";
        }
    }

    public static long d(android.content.Context context) {
        try {
            return a(context).firstInstallTime;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return -1L;
        }
    }

    static android.content.pm.PackageInfo a(android.content.Context context) throws android.content.pm.PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(g(context), 0);
    }

    public static java.lang.String a(android.content.Context context, java.lang.String str) {
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && !android.text.TextUtils.isEmpty(str)) {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
        }
        return null;
    }

    public static boolean a() {
        try {
            java.lang.Class.forName("kotlin.jvm.internal.Intrinsics");
            return true;
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            android.util.Log.d("ApplicationContext", "Kotlin Intrinsics not found");
            return false;
        }
    }
}
