package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfii implements com.google.android.gms.internal.ads.zzets {
    private final android.content.Context zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzcnj zzc;
    private final com.google.android.gms.internal.ads.zzetc zzd;
    private final com.google.android.gms.internal.ads.zzfjj zze;
    private com.google.android.gms.internal.ads.zzbjl zzf;
    private final com.google.android.gms.internal.ads.zzfqj zzg;
    private final com.google.android.gms.internal.ads.zzfkx zzh;
    private com.google.common.util.concurrent.ListenableFuture zzi;

    public zzfii(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzcnj zzcnjVar, com.google.android.gms.internal.ads.zzetc zzetcVar, com.google.android.gms.internal.ads.zzfjj zzfjjVar, com.google.android.gms.internal.ads.zzfkx zzfkxVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcnjVar;
        this.zzd = zzetcVar;
        this.zzh = zzfkxVar;
        this.zze = zzfjjVar;
        this.zzg = zzcnjVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzets
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzetq zzetqVar, com.google.android.gms.internal.ads.zzetr zzetrVar) {
        com.google.android.gms.internal.ads.zzdng zzh;
        com.google.android.gms.internal.ads.zzfqg zzfqgVar;
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfih
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzfii.this.zzd();
                }
            });
            return false;
        }
        if (zzb()) {
            return false;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdi)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzko)).booleanValue() && zzmVar.zzf) {
            this.zzc.zzw().zzc(true);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar = ((com.google.android.gms.internal.ads.zzfib) zzetqVar).zza;
        android.os.Bundle zza = com.google.android.gms.internal.ads.zzdyw.zza(new android.util.Pair(com.google.android.gms.internal.ads.zzdyu.PUBLIC_API_CALL.zza(), java.lang.Long.valueOf(zzmVar.zzz)), new android.util.Pair(com.google.android.gms.internal.ads.zzdyu.DYNAMITE_ENTER.zza(), java.lang.Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
        com.google.android.gms.internal.ads.zzfkx zzfkxVar = this.zzh;
        zzfkxVar.zzg(str);
        zzfkxVar.zzc(zzrVar);
        zzfkxVar.zza(zzmVar);
        zzfkxVar.zzv(zza);
        android.content.Context context = this.zza;
        com.google.android.gms.internal.ads.zzfky zzB = zzfkxVar.zzB();
        com.google.android.gms.internal.ads.zzfpw zzo = com.google.android.gms.internal.ads.zzfpw.CC.zzo(context, com.google.android.gms.internal.ads.zzfqf.zzg(zzB), 4, zzmVar);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjw)).booleanValue()) {
            com.google.android.gms.internal.ads.zzdnf zzm = this.zzc.zzm();
            com.google.android.gms.internal.ads.zzdca zzdcaVar = new com.google.android.gms.internal.ads.zzdca();
            zzdcaVar.zza(context);
            zzdcaVar.zzb(zzB);
            zzm.zze(zzdcaVar.zze());
            com.google.android.gms.internal.ads.zzdiq zzdiqVar = new com.google.android.gms.internal.ads.zzdiq();
            com.google.android.gms.internal.ads.zzetc zzetcVar = this.zzd;
            java.util.concurrent.Executor executor = this.zzb;
            zzdiqVar.zzm(zzetcVar, executor);
            zzdiqVar.zze(zzetcVar, executor);
            zzm.zzf(zzdiqVar.zzn());
            zzm.zzd(new com.google.android.gms.internal.ads.zzeri(this.zzf));
            zzh = zzm.zzh();
        } else {
            com.google.android.gms.internal.ads.zzdiq zzdiqVar2 = new com.google.android.gms.internal.ads.zzdiq();
            com.google.android.gms.internal.ads.zzfjj zzfjjVar = this.zze;
            if (zzfjjVar != null) {
                java.util.concurrent.Executor executor2 = this.zzb;
                zzdiqVar2.zza(zzfjjVar, executor2);
                zzdiqVar2.zzb(zzfjjVar, executor2);
                zzdiqVar2.zzc(zzfjjVar, executor2);
            }
            com.google.android.gms.internal.ads.zzdnf zzm2 = this.zzc.zzm();
            com.google.android.gms.internal.ads.zzdca zzdcaVar2 = new com.google.android.gms.internal.ads.zzdca();
            zzdcaVar2.zza(context);
            zzdcaVar2.zzb(zzB);
            zzm2.zze(zzdcaVar2.zze());
            com.google.android.gms.internal.ads.zzetc zzetcVar2 = this.zzd;
            java.util.concurrent.Executor executor3 = this.zzb;
            zzdiqVar2.zzm(zzetcVar2, executor3);
            zzdiqVar2.zza(zzetcVar2, executor3);
            zzdiqVar2.zzb(zzetcVar2, executor3);
            zzdiqVar2.zzc(zzetcVar2, executor3);
            zzdiqVar2.zzf(zzetcVar2, executor3);
            zzdiqVar2.zzg(zzetcVar2, executor3);
            zzdiqVar2.zze(zzetcVar2, executor3);
            zzdiqVar2.zzk(zzetcVar2, executor3);
            zzdiqVar2.zzd(zzetcVar2, executor3);
            zzm2.zzf(zzdiqVar2.zzn());
            zzm2.zzd(new com.google.android.gms.internal.ads.zzeri(this.zzf));
            zzh = zzm2.zzh();
        }
        com.google.android.gms.internal.ads.zzdng zzdngVar = zzh;
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzfqg zzc = zzdngVar.zzc();
            zzc.zzi(4);
            zzc.zzc(zzmVar.zzp);
            zzc.zzd(zzmVar.zzm);
            zzfqgVar = zzc;
        } else {
            zzfqgVar = null;
        }
        com.google.android.gms.internal.ads.zzcyx zzb = zzdngVar.zzb();
        com.google.common.util.concurrent.ListenableFuture zzc2 = zzb.zzc(zzb.zzb());
        this.zzi = zzc2;
        com.google.android.gms.internal.ads.zzhbw.zzr(zzc2, new com.google.android.gms.internal.ads.zzfig(this, zzetrVar, zzfqgVar, zzo, zzdngVar), this.zzb);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzets
    public final boolean zzb() {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzi;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    public final void zzc(com.google.android.gms.internal.ads.zzbjl zzbjlVar) {
        this.zzf = zzbjlVar;
    }

    final /* synthetic */ void zzd() {
        this.zzd.zzdJ(com.google.android.gms.internal.ads.zzfma.zzd(6, null, null));
    }

    final /* synthetic */ java.util.concurrent.Executor zze() {
        return this.zzb;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzetc zzf() {
        return this.zzd;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfjj zzg() {
        return this.zze;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfqj zzh() {
        return this.zzg;
    }

    final /* synthetic */ void zzi(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        this.zzi = null;
    }
}
