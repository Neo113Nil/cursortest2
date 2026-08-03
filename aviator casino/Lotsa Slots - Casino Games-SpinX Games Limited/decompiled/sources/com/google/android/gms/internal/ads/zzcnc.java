package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcnc {
    private final com.google.android.gms.internal.ads.zzcmt zza;
    private final com.google.android.gms.internal.ads.zzdzl zzb;

    zzcnc(com.google.android.gms.internal.ads.zzcmt zzcmtVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zza = zzcmtVar;
        this.zzb = zzdzlVar;
    }

    public final void zza(final android.content.Context context, final com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzps)).booleanValue()) {
            java.util.concurrent.Executor executor = com.google.android.gms.internal.ads.zzcfr.zza;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpu)).booleanValue()) {
                com.google.android.gms.internal.ads.zzcnb zzcnbVar = new com.google.android.gms.internal.ads.zzcnb(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpw)).intValue(), null);
                int intValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpv)).intValue();
                executor = new java.util.concurrent.ThreadPoolExecutor(intValue, intValue, 10L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), zzcnbVar);
            }
            executor.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcmz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzcnc.this.zzb(context, versionInfoParcel);
                }
            });
        }
    }

    final /* synthetic */ void zzb(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        com.google.android.gms.ads.internal.zzt.zzc().zze(context, versionInfoParcel.afmaVersion);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpt)).booleanValue()) {
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
            com.google.android.gms.internal.ads.zzdzk zza = this.zzb.zza();
            zza.zzc("action", "webview_startup_l");
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(elapsedRealtime2).length());
            sb.append(elapsedRealtime2);
            zza.zzc("webview_startup_l", sb.toString());
            zza.zzd();
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpz)).booleanValue() || android.os.Build.VERSION.SDK_INT < 24) {
            return;
        }
        com.google.android.gms.internal.ads.zzcfr.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcmy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzcnc.this.zzc();
            }
        });
    }

    final /* synthetic */ void zzc() {
        this.zza.zzb(new com.google.android.gms.internal.ads.zzcmx(this, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()));
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdzl zzd() {
        return this.zzb;
    }
}
