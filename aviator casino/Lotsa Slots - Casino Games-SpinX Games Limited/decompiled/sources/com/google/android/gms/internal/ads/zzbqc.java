package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbqc {
    public static final android.content.Intent zza(android.net.Uri uri, android.content.Context context, com.google.android.gms.internal.ads.zzbap zzbapVar, android.view.View view, com.google.android.gms.internal.ads.zzflc zzflcVar) {
        if (uri == null) {
            return null;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    public static final android.content.pm.ResolveInfo zzb(android.content.Intent intent, android.content.Context context, com.google.android.gms.internal.ads.zzbap zzbapVar, android.view.View view, com.google.android.gms.internal.ads.zzflc zzflcVar) {
        return zzc(intent, new java.util.ArrayList(), context, zzbapVar, view, zzflcVar);
    }

    public static final android.content.pm.ResolveInfo zzc(android.content.Intent intent, java.util.ArrayList arrayList, android.content.Context context, com.google.android.gms.internal.ads.zzbap zzbapVar, android.view.View view, com.google.android.gms.internal.ads.zzflc zzflcVar) {
        android.content.pm.PackageManager packageManager;
        android.content.pm.ResolveInfo resolveInfo = null;
        try {
            packageManager = context.getPackageManager();
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
        if (packageManager == null) {
            return null;
        }
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        android.content.pm.ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
        if (queryIntentActivities != null && resolveActivity != null) {
            int i = 0;
            while (true) {
                if (i >= queryIntentActivities.size()) {
                    break;
                }
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                    resolveInfo = resolveActivity;
                    break;
                }
                i++;
            }
        }
        arrayList.addAll(queryIntentActivities);
        return resolveInfo;
    }

    public static final android.content.Intent zzd(android.content.Intent intent, android.content.pm.ResolveInfo resolveInfo, android.content.Context context, com.google.android.gms.internal.ads.zzbap zzbapVar, android.view.View view, com.google.android.gms.internal.ads.zzflc zzflcVar) {
        android.content.Intent intent2 = new android.content.Intent(intent);
        intent2.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        return intent2;
    }
}
