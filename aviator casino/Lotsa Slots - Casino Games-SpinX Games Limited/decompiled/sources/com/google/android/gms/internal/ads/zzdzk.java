package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdzk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzdzl zza;
    private final java.util.Map zzb;

    zzdzk(com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        java.util.Objects.requireNonNull(zzdzlVar);
        this.zza = zzdzlVar;
        this.zzb = new java.util.concurrent.ConcurrentHashMap();
    }

    public final com.google.android.gms.internal.ads.zzdzk zza(com.google.android.gms.internal.ads.zzfki zzfkiVar) {
        zzc("gqi", zzfkiVar.zzb);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzdzk zzb(com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        zzc("aai", zzfkfVar.zzw);
        zzc("request_id", zzfkfVar.zzan);
        zzc(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, com.google.android.gms.internal.ads.zzfkf.zza(zzfkfVar.zzb));
        return this;
    }

    public final com.google.android.gms.internal.ads.zzdzk zzc(java.lang.String str, java.lang.String str2) {
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final void zzd() {
        this.zza.zzd().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdzj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzdzk.this.zzh();
            }
        });
    }

    public final com.google.android.gms.ads.internal.util.client.zzt zze() {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpJ)).booleanValue()) {
            zzd();
            return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
        }
        com.google.android.gms.internal.ads.zzdzl zzdzlVar = this.zza;
        return zzdzlVar.zzc().zze(this.zzb);
    }

    public final void zzf() {
        this.zza.zzd().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdzi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzdzk.this.zzi();
            }
        });
    }

    public final java.lang.String zzg() {
        return this.zza.zzc().zzc(this.zzb);
    }

    final /* synthetic */ void zzh() {
        this.zza.zzc().zzb(this.zzb);
    }

    final /* synthetic */ void zzi() {
        this.zza.zzc().zzf(this.zzb);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdzk zzj() {
        this.zzb.putAll(this.zza.zze());
        return this;
    }
}
