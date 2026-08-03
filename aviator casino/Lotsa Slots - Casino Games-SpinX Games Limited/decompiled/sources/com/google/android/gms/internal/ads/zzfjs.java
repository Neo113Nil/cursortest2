package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfjs implements com.google.android.gms.internal.ads.zzets {
    private final android.content.Context zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzcnj zzc;
    private final com.google.android.gms.internal.ads.zzfjj zzd;
    private final com.google.android.gms.internal.ads.zzfhw zze;
    private final com.google.android.gms.internal.ads.zzfkr zzf;
    private final com.google.android.gms.internal.ads.zzfqj zzg;
    private final com.google.android.gms.internal.ads.zzfkx zzh;
    private com.google.common.util.concurrent.ListenableFuture zzi;

    public zzfjs(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzcnj zzcnjVar, com.google.android.gms.internal.ads.zzfhw zzfhwVar, com.google.android.gms.internal.ads.zzfjj zzfjjVar, com.google.android.gms.internal.ads.zzfkx zzfkxVar, com.google.android.gms.internal.ads.zzfkr zzfkrVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcnjVar;
        this.zze = zzfhwVar;
        this.zzd = zzfjjVar;
        this.zzh = zzfkxVar;
        this.zzf = zzfkrVar;
        this.zzg = zzcnjVar.zzx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzdvq zze(com.google.android.gms.internal.ads.zzfhu zzfhuVar) {
        com.google.android.gms.internal.ads.zzdvq zzp = this.zzc.zzp();
        com.google.android.gms.internal.ads.zzdca zzdcaVar = new com.google.android.gms.internal.ads.zzdca();
        zzdcaVar.zza(this.zza);
        zzdcaVar.zzb(((com.google.android.gms.internal.ads.zzfjr) zzfhuVar).zza);
        zzdcaVar.zzf(this.zzf);
        zzp.zzd(zzdcaVar.zze());
        zzp.zze(new com.google.android.gms.internal.ads.zzdiq().zzn());
        return zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzets
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzetq zzetqVar, com.google.android.gms.internal.ads.zzetr zzetrVar) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzfqg zzfqgVar;
        com.google.android.gms.internal.ads.zzcbw zzcbwVar = new com.google.android.gms.internal.ads.zzcbw(zzmVar, str);
        java.lang.String str2 = zzcbwVar.zzb;
        if (str2 == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfjq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzfjs.this.zzc();
                }
            });
            return false;
        }
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzi;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            return false;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdi)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzfhw zzfhwVar = this.zze;
            if (zzfhwVar.zzd() != null) {
                com.google.android.gms.internal.ads.zzfqg zzd = ((com.google.android.gms.internal.ads.zzdvr) zzfhwVar.zzd()).zzd();
                zzd.zzi(5);
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzcbwVar.zza;
                zzd.zzc(zzmVar2.zzp);
                zzd.zzd(zzmVar2.zzm);
                zzfqgVar = zzd;
                android.content.Context context = this.zza;
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = zzcbwVar.zza;
                boolean z = zzmVar3.zzf;
                com.google.android.gms.internal.ads.zzflv.zzb(context, z);
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzko)).booleanValue() && z) {
                    this.zzc.zzw().zzc(true);
                }
                android.os.Bundle zza = com.google.android.gms.internal.ads.zzdyw.zza(new android.util.Pair(com.google.android.gms.internal.ads.zzdyu.PUBLIC_API_CALL.zza(), java.lang.Long.valueOf(zzmVar3.zzz)), new android.util.Pair(com.google.android.gms.internal.ads.zzdyu.DYNAMITE_ENTER.zza(), java.lang.Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
                com.google.android.gms.internal.ads.zzfkx zzfkxVar = this.zzh;
                zzfkxVar.zzg(str2);
                zzfkxVar.zzc(com.google.android.gms.ads.internal.client.zzr.zzc());
                zzfkxVar.zza(zzmVar3);
                zzfkxVar.zzv(zza);
                com.google.android.gms.internal.ads.zzfky zzB = zzfkxVar.zzB();
                com.google.android.gms.internal.ads.zzfpw zzo = com.google.android.gms.internal.ads.zzfpw.CC.zzo(context, com.google.android.gms.internal.ads.zzfqf.zzg(zzB), 5, zzmVar3);
                com.google.android.gms.internal.ads.zzfjr zzfjrVar = new com.google.android.gms.internal.ads.zzfjr(null);
                zzfjrVar.zza = zzB;
                com.google.common.util.concurrent.ListenableFuture zzc = this.zze.zzc(new com.google.android.gms.internal.ads.zzfhx(zzfjrVar, null), new com.google.android.gms.internal.ads.zzfhv() { // from class: com.google.android.gms.internal.ads.zzfjp
                    @Override // com.google.android.gms.internal.ads.zzfhv
                    public final /* synthetic */ com.google.android.gms.internal.ads.zzdby zza(com.google.android.gms.internal.ads.zzfhu zzfhuVar) {
                        return com.google.android.gms.internal.ads.zzfjs.this.zzd(zzfhuVar);
                    }
                }, null);
                this.zzi = zzc;
                com.google.android.gms.internal.ads.zzhbw.zzr(zzc, new com.google.android.gms.internal.ads.zzfjo(this, zzetrVar, zzfqgVar, zzo, zzfjrVar), this.zzb);
                return true;
            }
        }
        zzfqgVar = null;
        android.content.Context context2 = this.zza;
        com.google.android.gms.ads.internal.client.zzm zzmVar32 = zzcbwVar.zza;
        boolean z2 = zzmVar32.zzf;
        com.google.android.gms.internal.ads.zzflv.zzb(context2, z2);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzko)).booleanValue()) {
            this.zzc.zzw().zzc(true);
        }
        android.os.Bundle zza2 = com.google.android.gms.internal.ads.zzdyw.zza(new android.util.Pair(com.google.android.gms.internal.ads.zzdyu.PUBLIC_API_CALL.zza(), java.lang.Long.valueOf(zzmVar32.zzz)), new android.util.Pair(com.google.android.gms.internal.ads.zzdyu.DYNAMITE_ENTER.zza(), java.lang.Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
        com.google.android.gms.internal.ads.zzfkx zzfkxVar2 = this.zzh;
        zzfkxVar2.zzg(str2);
        zzfkxVar2.zzc(com.google.android.gms.ads.internal.client.zzr.zzc());
        zzfkxVar2.zza(zzmVar32);
        zzfkxVar2.zzv(zza2);
        com.google.android.gms.internal.ads.zzfky zzB2 = zzfkxVar2.zzB();
        com.google.android.gms.internal.ads.zzfpw zzo2 = com.google.android.gms.internal.ads.zzfpw.CC.zzo(context2, com.google.android.gms.internal.ads.zzfqf.zzg(zzB2), 5, zzmVar32);
        com.google.android.gms.internal.ads.zzfjr zzfjrVar2 = new com.google.android.gms.internal.ads.zzfjr(null);
        zzfjrVar2.zza = zzB2;
        com.google.common.util.concurrent.ListenableFuture zzc2 = this.zze.zzc(new com.google.android.gms.internal.ads.zzfhx(zzfjrVar2, null), new com.google.android.gms.internal.ads.zzfhv() { // from class: com.google.android.gms.internal.ads.zzfjp
            @Override // com.google.android.gms.internal.ads.zzfhv
            public final /* synthetic */ com.google.android.gms.internal.ads.zzdby zza(com.google.android.gms.internal.ads.zzfhu zzfhuVar) {
                return com.google.android.gms.internal.ads.zzfjs.this.zzd(zzfhuVar);
            }
        }, null);
        this.zzi = zzc2;
        com.google.android.gms.internal.ads.zzhbw.zzr(zzc2, new com.google.android.gms.internal.ads.zzfjo(this, zzetrVar, zzfqgVar, zzo2, zzfjrVar2), this.zzb);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzets
    public final boolean zzb() {
        throw null;
    }

    final /* synthetic */ void zzc() {
        this.zzd.zzdJ(com.google.android.gms.internal.ads.zzfma.zzd(6, null, null));
    }

    final /* synthetic */ java.util.concurrent.Executor zzf() {
        return this.zzb;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfjj zzg() {
        return this.zzd;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfhw zzh() {
        return this.zze;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfqj zzi() {
        return this.zzg;
    }

    final void zzj(int i) {
        this.zzh.zzj().zza(i);
    }
}
