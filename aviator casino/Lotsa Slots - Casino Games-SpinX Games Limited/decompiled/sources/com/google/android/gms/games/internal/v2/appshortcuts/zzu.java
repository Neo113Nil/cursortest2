package com.google.android.gms.games.internal.v2.appshortcuts;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public final class zzu {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x001d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.games.internal.v2.appshortcuts.zzs zza(android.content.Context context, java.lang.Class cls) {
        android.os.Bundle bundle;
        java.lang.Long valueOf;
        android.content.pm.ActivityInfo activityInfo;
        android.os.Bundle bundle2;
        android.content.pm.ApplicationInfo applicationInfo;
        try {
            applicationInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        if (applicationInfo != null) {
            bundle = applicationInfo.metaData;
            java.lang.String str = "";
            if (bundle != null) {
                try {
                    valueOf = java.lang.Long.valueOf(java.lang.Long.parseLong(bundle.getString("com.google.android.gms.games.APP_ID", "")));
                } catch (java.lang.NumberFormatException unused2) {
                }
                if (valueOf == null) {
                    return null;
                }
                java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new android.content.Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setPackage(context.getPackageName()), 795136);
                com.google.android.gms.internal.games_v2.zzgd zzgdVar = new com.google.android.gms.internal.games_v2.zzgd();
                for (android.content.pm.ResolveInfo resolveInfo : queryIntentActivities) {
                    android.content.pm.ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                    if (activityInfo2 != null) {
                        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new android.content.ComponentName(activityInfo2.packageName, activityInfo2.name));
                        if (componentEnabledSetting == 0) {
                            if (activityInfo2.enabled) {
                                if (!resolveInfo.activityInfo.exported) {
                                    zzgdVar.zza(resolveInfo);
                                }
                            }
                        } else if (componentEnabledSetting == 1) {
                            if (!resolveInfo.activityInfo.exported) {
                            }
                        }
                    }
                }
                com.google.android.gms.internal.games_v2.zzgg zzb = zzgdVar.zzb();
                int size = zzb.size();
                int i = Integer.MAX_VALUE;
                for (int i2 = 0; i2 < size; i2++) {
                    android.content.pm.ActivityInfo activityInfo3 = ((android.content.pm.ResolveInfo) zzb.get(i2)).activityInfo;
                    if (activityInfo3 != null) {
                        try {
                            activityInfo = context.getPackageManager().getActivityInfo(new android.content.ComponentName(activityInfo3.packageName, activityInfo3.name), 795264);
                        } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
                            activityInfo = null;
                        }
                        if (activityInfo != null && (bundle2 = activityInfo.metaData) != null) {
                            i = java.lang.Math.min(i, bundle2.getInt("com.google.android.gms.games.APP_SHORTCUTS_MAX_NUMBER", Integer.MAX_VALUE));
                            str = bundle2.getString("com.google.android.gms.games.APP_SHORTCUTS_TARGET_ACTIVITY", str);
                        }
                    }
                }
                android.util.Pair pair = new android.util.Pair(java.lang.Integer.valueOf(i), str);
                return new com.google.android.gms.games.internal.v2.appshortcuts.zzs(valueOf.longValue(), context.getPackageName(), ((java.lang.Integer) pair.first).intValue(), new android.content.ComponentName(context, (java.lang.Class<?>) cls), ((java.lang.String) pair.second).trim());
            }
            valueOf = null;
            if (valueOf == null) {
            }
        }
        bundle = null;
        java.lang.String str2 = "";
        if (bundle != null) {
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }
}
