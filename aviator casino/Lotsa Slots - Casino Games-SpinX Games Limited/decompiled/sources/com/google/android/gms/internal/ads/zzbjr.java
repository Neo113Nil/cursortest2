package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzbjr {
    private androidx.browser.customtabs.CustomTabsSession zza;
    private androidx.browser.customtabs.CustomTabsClient zzb;
    private androidx.browser.customtabs.CustomTabsServiceConnection zzc;
    private com.google.android.gms.internal.ads.zzbjq zzd;

    public static boolean zza(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("http://www.example.com"));
            android.content.pm.ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                for (int i = 0; i < queryIntentActivities.size(); i++) {
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                        return resolveActivity.activityInfo.packageName.equals(com.google.android.gms.internal.ads.zzink.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final void zzb(android.app.Activity activity) {
        androidx.browser.customtabs.CustomTabsServiceConnection customTabsServiceConnection = this.zzc;
        if (customTabsServiceConnection == null) {
            return;
        }
        activity.unbindService(customTabsServiceConnection);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }

    public final androidx.browser.customtabs.CustomTabsSession zzc() {
        androidx.browser.customtabs.CustomTabsClient customTabsClient = this.zzb;
        if (customTabsClient == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = customTabsClient.newSession(null);
        }
        return this.zza;
    }

    public final void zzd(com.google.android.gms.internal.ads.zzbjq zzbjqVar) {
        this.zzd = zzbjqVar;
    }

    public final void zze(android.app.Activity activity) {
        java.lang.String zza;
        if (this.zzb == null && (zza = com.google.android.gms.internal.ads.zzink.zza(activity)) != null) {
            com.google.android.gms.internal.ads.zzinl zzinlVar = new com.google.android.gms.internal.ads.zzinl(this);
            this.zzc = zzinlVar;
            androidx.browser.customtabs.CustomTabsClient.bindCustomTabsService(activity, zza, zzinlVar);
        }
    }

    public final void zzf(androidx.browser.customtabs.CustomTabsClient customTabsClient) {
        this.zzb = customTabsClient;
        customTabsClient.warmup(0L);
        com.google.android.gms.internal.ads.zzbjq zzbjqVar = this.zzd;
        if (zzbjqVar != null) {
            zzbjqVar.zza();
        }
    }

    public final void zzg() {
        this.zzb = null;
        this.zza = null;
    }
}
