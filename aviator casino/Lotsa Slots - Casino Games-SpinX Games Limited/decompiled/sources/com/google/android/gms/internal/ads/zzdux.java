package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdux {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzdzl zzd;
    private final java.util.concurrent.Executor zze;
    private final com.google.android.gms.internal.ads.zzbap zzf;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzg;
    private final com.google.android.gms.internal.ads.zzekg zzi;
    private final com.google.android.gms.internal.ads.zzfsc zzj;
    private final com.google.android.gms.internal.ads.zzekr zzk;
    private final com.google.android.gms.internal.ads.zzflc zzl;
    private com.google.common.util.concurrent.ListenableFuture zzm;
    private final com.google.android.gms.internal.ads.zzdul zza = new com.google.android.gms.internal.ads.zzdul();
    private final com.google.android.gms.internal.ads.zzbqh zzh = new com.google.android.gms.internal.ads.zzbqh();

    zzdux(com.google.android.gms.internal.ads.zzduv zzduvVar) {
        this.zzc = zzduvVar.zzb();
        this.zze = zzduvVar.zze();
        this.zzf = zzduvVar.zzf();
        this.zzg = zzduvVar.zzg();
        this.zzb = zzduvVar.zza();
        this.zzi = zzduvVar.zzd();
        this.zzj = zzduvVar.zzh();
        this.zzd = zzduvVar.zzc();
        this.zzk = zzduvVar.zzi();
        this.zzl = zzduvVar.zzj();
    }

    public final synchronized void zza() {
        java.lang.String str = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeF);
        com.google.android.gms.internal.ads.zzbap zzbapVar = this.zzf;
        com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        com.google.android.gms.internal.ads.zzekr zzekrVar = this.zzk;
        com.google.common.util.concurrent.ListenableFuture zzk = com.google.android.gms.internal.ads.zzhbw.zzk(com.google.android.gms.internal.ads.zzclk.zzb(this.zzc, this.zzg, str, zzbapVar, zzaVar, zzekrVar, this.zzl, this.zzd), new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzduu
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) obj;
                com.google.android.gms.internal.ads.zzdux.this.zzi(zzckuVar);
                return zzckuVar;
            }
        }, this.zze);
        this.zzm = zzk;
        com.google.android.gms.internal.ads.zzcfu.zza(zzk, "NativeJavascriptExecutor.initializeEngine", com.google.android.gms.internal.ads.zzcfr.zzh);
    }

    public final synchronized void zzb() {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzhbw.zzr(listenableFuture, new com.google.android.gms.internal.ads.zzdum(this), this.zze);
        this.zzm = null;
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zzc(final java.lang.String str, final org.json.JSONObject jSONObject) {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return com.google.android.gms.internal.ads.zzhbw.zza(null);
        }
        return com.google.android.gms.internal.ads.zzhbw.zzj(listenableFuture, new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzdut
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzdux.this.zzj(str, jSONObject, (com.google.android.gms.internal.ads.zzcku) obj);
            }
        }, this.zze);
    }

    public final synchronized void zzd(java.lang.String str, com.google.android.gms.internal.ads.zzbpq zzbpqVar) {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzhbw.zzr(listenableFuture, new com.google.android.gms.internal.ads.zzdun(this, str, zzbpqVar), this.zze);
    }

    public final synchronized void zze(java.lang.String str, com.google.android.gms.internal.ads.zzbpq zzbpqVar) {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzhbw.zzr(listenableFuture, new com.google.android.gms.internal.ads.zzduo(this, str, zzbpqVar), this.zze);
    }

    public final synchronized void zzf(java.lang.String str, java.util.Map map) {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzhbw.zzr(listenableFuture, new com.google.android.gms.internal.ads.zzdup(this, "sendMessageToNativeJs", map), this.zze);
    }

    public final synchronized void zzg(com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfki zzfkiVar, com.google.android.gms.internal.ads.zzctj zzctjVar) {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzhbw.zzr(listenableFuture, new com.google.android.gms.internal.ads.zzduq(this, zzfkfVar, zzfkiVar, zzctjVar), this.zze);
    }

    public final void zzh(java.lang.ref.WeakReference weakReference, java.lang.String str, com.google.android.gms.internal.ads.zzbpq zzbpqVar) {
        zzd(str, new com.google.android.gms.internal.ads.zzduw(this, weakReference, str, zzbpqVar, null));
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzcku zzi(com.google.android.gms.internal.ads.zzcku zzckuVar) {
        zzckuVar.zzab("/result", this.zzh);
        com.google.android.gms.internal.ads.zzcms zzP = zzckuVar.zzP();
        com.google.android.gms.ads.internal.zzb zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzc, null, null);
        com.google.android.gms.internal.ads.zzekg zzekgVar = this.zzi;
        com.google.android.gms.internal.ads.zzfsc zzfscVar = this.zzj;
        com.google.android.gms.internal.ads.zzdzl zzdzlVar = this.zzd;
        com.google.android.gms.internal.ads.zzdul zzdulVar = this.zza;
        zzP.zzab(null, zzdulVar, zzdulVar, zzdulVar, zzdulVar, false, null, zzbVar, null, null, zzekgVar, zzfscVar, zzdzlVar, null, null, null, null, null, null, null, null, null);
        return zzckuVar;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzj(java.lang.String str, org.json.JSONObject jSONObject, com.google.android.gms.internal.ads.zzcku zzckuVar) {
        return this.zzh.zzc(zzckuVar, str, jSONObject);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdul zzk() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdzl zzl() {
        return this.zzd;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzekg zzm() {
        return this.zzi;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfsc zzn() {
        return this.zzj;
    }
}
