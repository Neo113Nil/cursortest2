package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbjp extends androidx.browser.customtabs.CustomTabsServiceConnection {
    public static final /* synthetic */ int zza = 0;
    private final java.util.concurrent.atomic.AtomicBoolean zzb = new java.util.concurrent.atomic.AtomicBoolean(false);
    private android.content.Context zzc;
    private com.google.android.gms.internal.ads.zzdzl zzd;
    private androidx.browser.customtabs.CustomTabsSession zze;
    private androidx.browser.customtabs.CustomTabsClient zzf;

    private final void zzf(android.content.Context context) {
        java.lang.String packageName;
        if (this.zzf != null || context == null || (packageName = androidx.browser.customtabs.CustomTabsClient.getPackageName(context, null)) == null || packageName.equals(context.getPackageName())) {
            return;
        }
        androidx.browser.customtabs.CustomTabsClient.bindCustomTabsService(context, packageName, this);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(android.content.ComponentName componentName, androidx.browser.customtabs.CustomTabsClient customTabsClient) {
        this.zzf = customTabsClient;
        customTabsClient.warmup(0L);
        this.zze = customTabsClient.newSession(new com.google.android.gms.internal.ads.zzbjm(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final void zza(android.content.Context context, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzdzlVar;
        zzf(context);
    }

    public final androidx.browser.customtabs.CustomTabsSession zzb() {
        if (this.zze == null) {
            com.google.android.gms.internal.ads.zzcfr.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbjo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzbjp.this.zzd();
                }
            });
        }
        return this.zze;
    }

    public final void zzc(final int i) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfz)).booleanValue() || this.zzd == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzcfr.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbjn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzbjp.this.zze(i);
            }
        });
    }

    final /* synthetic */ void zzd() {
        zzf(this.zzc);
    }

    final /* synthetic */ void zze(int i) {
        com.google.android.gms.internal.ads.zzdzl zzdzlVar = this.zzd;
        if (zzdzlVar != null) {
            com.google.android.gms.internal.ads.zzdzk zza2 = zzdzlVar.zza();
            zza2.zzc("action", "cct_nav");
            zza2.zzc("cct_navs", java.lang.String.valueOf(i));
            zza2.zzd();
        }
    }
}
