package com.inmobi.media;

/* renamed from: com.inmobi.media.k5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2528k5 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f5287a;

    public static final java.lang.String a(android.content.Context context) {
        com.inmobi.media.B5.f4614a.getClass();
        if (!com.inmobi.media.B5.w()) {
            return null;
        }
        if (context == null || f5287a != null) {
            return f5287a;
        }
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("http://www.google.com"));
            android.content.pm.ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            java.lang.String str = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
            java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.content.pm.ResolveInfo resolveInfo : queryIntentActivities) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setAction(androidx.browser.customtabs.CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    java.lang.String packageName = resolveInfo.activityInfo.packageName;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                    arrayList.add(packageName);
                }
            }
            if (arrayList.isEmpty()) {
                f5287a = null;
            } else if (arrayList.size() == 1) {
                f5287a = (java.lang.String) arrayList.get(0);
            } else if (!android.text.TextUtils.isEmpty(str) && !a(context, intent) && kotlin.collections.CollectionsKt.contains(arrayList, str)) {
                f5287a = str;
            } else if (arrayList.contains("com.android.chrome")) {
                f5287a = "com.android.chrome";
            } else if (arrayList.contains("com.chrome.beta")) {
                f5287a = "com.chrome.beta";
            } else if (arrayList.contains("com.chrome.dev")) {
                f5287a = "com.chrome.dev";
            } else if (arrayList.contains("com.google.android.apps.chrome")) {
                f5287a = "com.google.android.apps.chrome";
            }
        } catch (java.lang.Exception unused) {
        }
        return f5287a;
    }

    public static boolean a(android.content.Context context, android.content.Intent intent) {
        try {
            java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
            for (android.content.pm.ResolveInfo resolveInfo : queryIntentActivities) {
                android.content.IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.RuntimeException unused) {
            android.util.Log.e("k5", "Runtime exception while getting specialized handlers");
            return false;
        }
    }
}
