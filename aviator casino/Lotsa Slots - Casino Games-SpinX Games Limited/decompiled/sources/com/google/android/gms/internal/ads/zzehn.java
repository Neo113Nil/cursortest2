package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzehn {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzhcg zzb;
    private final com.google.android.gms.internal.ads.zzhcg zzc;
    private final com.google.android.gms.internal.ads.zzimo zzd;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zze;
    private final com.google.android.gms.internal.ads.zzehj zzf;
    private final com.google.android.gms.internal.ads.zzdzl zzg;

    zzehn(android.content.Context context, com.google.android.gms.internal.ads.zzhcg zzhcgVar, com.google.android.gms.internal.ads.zzhcg zzhcgVar2, com.google.android.gms.internal.ads.zzimo zzimoVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzehj zzehjVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zza = context;
        this.zzb = zzhcgVar;
        this.zzc = zzhcgVar2;
        this.zzd = zzimoVar;
        this.zze = versionInfoParcel;
        this.zzf = zzehjVar;
        this.zzg = zzdzlVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zze, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzc() {
        try {
            ((com.google.android.gms.internal.ads.zzeii) this.zzd.zzb()).zzi(this.zze.afmaVersion);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpC)).booleanValue()) {
                com.google.android.gms.internal.ads.zzdzk zza = this.zzg.zza();
                zza.zzc("action", "ptard");
                zza.zzc("ptard", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE);
                zza.zzd();
            }
        } catch (android.os.RemoteException | java.lang.NullPointerException e) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpD)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "Preconnect Local");
            }
        }
    }

    public final void zza() {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzF(this.zza.getPackageName())) {
            this.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzehl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzehn.this.zzb();
                }
            });
            return;
        }
        com.google.android.gms.internal.ads.zzehk zzehkVar = new com.google.android.gms.internal.ads.zzehk(this);
        com.google.android.gms.internal.ads.zzehp zzb = this.zzf.zzb();
        zzb.zzb(zzehkVar);
        final com.google.android.gms.internal.ads.zzefx zza = zzb.zza().zza();
        com.google.android.gms.internal.ads.zzhcg zzhcgVar = this.zzb;
        java.util.Objects.requireNonNull(zza);
        zzhcgVar.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzehm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzefx.this.zza();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdzl zzd() {
        return this.zzg;
    }
}
