package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzink {
    private static java.lang.String zza;

    public static java.lang.String zza(android.content.Context context) {
        java.lang.String str = zza;
        if (str != null) {
            return str;
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://www.example.com"));
        android.content.pm.ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        java.lang.String str2 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.content.pm.ResolveInfo resolveInfo : queryIntentActivities) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setAction(androidx.browser.customtabs.CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            zza = null;
        } else if (arrayList.size() == 1) {
            zza = (java.lang.String) arrayList.get(0);
        } else {
            if (!android.text.TextUtils.isEmpty(str2)) {
                try {
                    java.util.List<android.content.pm.ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                    if (queryIntentActivities2 != null && queryIntentActivities2.size() != 0) {
                        for (android.content.pm.ResolveInfo resolveInfo2 : queryIntentActivities2) {
                            android.content.IntentFilter intentFilter = resolveInfo2.filter;
                            if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo2.activityInfo != null) {
                                break;
                            }
                        }
                    }
                } catch (java.lang.RuntimeException unused) {
                    android.util.Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
                }
                if (arrayList.contains(str2)) {
                    zza = str2;
                }
            }
            if (arrayList.contains("com.android.chrome")) {
                zza = "com.android.chrome";
            } else if (arrayList.contains("com.chrome.beta")) {
                zza = "com.chrome.beta";
            } else if (arrayList.contains("com.chrome.dev")) {
                zza = "com.chrome.dev";
            }
        }
        return zza;
    }
}
