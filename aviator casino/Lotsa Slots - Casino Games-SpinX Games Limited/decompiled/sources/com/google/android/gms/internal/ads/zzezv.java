package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzezv implements com.google.android.gms.internal.ads.zzfck {
    private final android.content.Context zza;
    private final android.content.Intent zzb;

    zzezv(android.content.Context context, android.content.Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        com.google.android.gms.ads.internal.util.zze.zza("HsdpMigrationSignal.produce");
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzon)).booleanValue()) {
            return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzezw(null));
        }
        boolean z = false;
        try {
            if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                com.google.android.gms.ads.internal.util.zze.zza("HSDP intent is supported");
                z = true;
            }
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzezw(java.lang.Boolean.valueOf(z)));
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 60;
    }
}
