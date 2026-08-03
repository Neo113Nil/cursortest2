package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzffn implements com.google.android.gms.internal.ads.zzets {
    protected final com.google.android.gms.internal.ads.zzcnj zza;
    private final android.content.Context zzb;
    private final java.util.concurrent.Executor zzc;
    private final com.google.android.gms.internal.ads.zzfge zzd;
    private final com.google.android.gms.internal.ads.zzfhw zze;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;
    private final android.view.ViewGroup zzg;
    private final com.google.android.gms.internal.ads.zzfqj zzh;
    private final com.google.android.gms.internal.ads.zzfkx zzi;

    @javax.annotation.Nullable
    private com.google.common.util.concurrent.ListenableFuture zzj;

    protected zzffn(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzcnj zzcnjVar, com.google.android.gms.internal.ads.zzfhw zzfhwVar, com.google.android.gms.internal.ads.zzfge zzfgeVar, com.google.android.gms.internal.ads.zzfkx zzfkxVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcnjVar;
        this.zze = zzfhwVar;
        this.zzd = zzfgeVar;
        this.zzi = zzfkxVar;
        this.zzf = versionInfoParcel;
        this.zzg = new android.widget.FrameLayout(context);
        this.zzh = zzcnjVar.zzx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized com.google.android.gms.internal.ads.zzdby zzg(com.google.android.gms.internal.ads.zzfhu zzfhuVar) {
        com.google.android.gms.internal.ads.zzffk zzffkVar = (com.google.android.gms.internal.ads.zzffk) zzfhuVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjv)).booleanValue()) {
            com.google.android.gms.internal.ads.zzcvi zzcviVar = new com.google.android.gms.internal.ads.zzcvi(this.zzg);
            com.google.android.gms.internal.ads.zzdca zzdcaVar = new com.google.android.gms.internal.ads.zzdca();
            zzdcaVar.zza(this.zzb);
            zzdcaVar.zzb(zzffkVar.zza);
            com.google.android.gms.internal.ads.zzdcb zze = zzdcaVar.zze();
            com.google.android.gms.internal.ads.zzdiq zzdiqVar = new com.google.android.gms.internal.ads.zzdiq();
            com.google.android.gms.internal.ads.zzfge zzfgeVar = this.zzd;
            java.util.concurrent.Executor executor = this.zzc;
            zzdiqVar.zzd(zzfgeVar, executor);
            zzdiqVar.zzg(zzfgeVar, executor);
            return zzc(zzcviVar, zze, zzdiqVar.zzn());
        }
        com.google.android.gms.internal.ads.zzfge zzn = com.google.android.gms.internal.ads.zzfge.zzn(this.zzd);
        com.google.android.gms.internal.ads.zzdiq zzdiqVar2 = new com.google.android.gms.internal.ads.zzdiq();
        java.util.concurrent.Executor executor2 = this.zzc;
        zzdiqVar2.zzc(zzn, executor2);
        zzdiqVar2.zzi(zzn, executor2);
        zzdiqVar2.zzj(zzn, executor2);
        zzdiqVar2.zzk(zzn, executor2);
        zzdiqVar2.zzd(zzn, executor2);
        zzdiqVar2.zzg(zzn, executor2);
        zzdiqVar2.zzl(zzn);
        com.google.android.gms.internal.ads.zzcvi zzcviVar2 = new com.google.android.gms.internal.ads.zzcvi(this.zzg);
        com.google.android.gms.internal.ads.zzdca zzdcaVar2 = new com.google.android.gms.internal.ads.zzdca();
        zzdcaVar2.zza(this.zzb);
        zzdcaVar2.zzb(zzffkVar.zza);
        return zzc(zzcviVar2, zzdcaVar2.zze(), zzdiqVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzets
    public final synchronized boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzetq zzetqVar, com.google.android.gms.internal.ads.zzetr zzetrVar) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzfqg zzfqgVar;
        com.google.android.gms.internal.ads.zzcuv zzcuvVar;
        if (!zzmVar.zzb()) {
            boolean z = ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbko.zzd.zze()).booleanValue() && ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmD)).booleanValue();
            if (this.zzf.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmE)).intValue() || !z) {
                com.google.android.gms.common.internal.Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
        }
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for app open ad.");
            this.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzffm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzffn.this.zze();
                }
            });
            return false;
        }
        if (this.zzj != null) {
            return false;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdi)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue() || (zzcuvVar = (com.google.android.gms.internal.ads.zzcuv) this.zze.zzd()) == null) {
            zzfqgVar = null;
        } else {
            com.google.android.gms.internal.ads.zzfqg zzd = zzcuvVar.zzd();
            zzd.zzi(7);
            zzd.zzc(zzmVar.zzp);
            zzd.zzd(zzmVar.zzm);
            zzfqgVar = zzd;
        }
        android.content.Context context = this.zzb;
        boolean z2 = zzmVar.zzf;
        com.google.android.gms.internal.ads.zzflv.zzb(context, z2);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzko)).booleanValue() && z2) {
            this.zza.zzw().zzc(true);
        }
        android.os.Bundle zza = com.google.android.gms.internal.ads.zzdyw.zza(new android.util.Pair(com.google.android.gms.internal.ads.zzdyu.PUBLIC_API_CALL.zza(), java.lang.Long.valueOf(zzmVar.zzz)), new android.util.Pair(com.google.android.gms.internal.ads.zzdyu.DYNAMITE_ENTER.zza(), java.lang.Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
        com.google.android.gms.internal.ads.zzfkx zzfkxVar = this.zzi;
        zzfkxVar.zzg(str);
        zzfkxVar.zzc(com.google.android.gms.ads.internal.client.zzr.zzd());
        zzfkxVar.zza(zzmVar);
        zzfkxVar.zzv(zza);
        com.google.android.gms.internal.ads.zzfky zzB = zzfkxVar.zzB();
        com.google.android.gms.internal.ads.zzfpw zzo = com.google.android.gms.internal.ads.zzfpw.CC.zzo(context, com.google.android.gms.internal.ads.zzfqf.zzg(zzB), 7, zzmVar);
        com.google.android.gms.internal.ads.zzffk zzffkVar = new com.google.android.gms.internal.ads.zzffk(null);
        zzffkVar.zza = zzB;
        com.google.common.util.concurrent.ListenableFuture zzc = this.zze.zzc(new com.google.android.gms.internal.ads.zzfhx(zzffkVar, null), new com.google.android.gms.internal.ads.zzfhv() { // from class: com.google.android.gms.internal.ads.zzffl
            @Override // com.google.android.gms.internal.ads.zzfhv
            public final /* synthetic */ com.google.android.gms.internal.ads.zzdby zza(com.google.android.gms.internal.ads.zzfhu zzfhuVar) {
                return com.google.android.gms.internal.ads.zzffn.this.zzf(zzfhuVar);
            }
        }, null);
        this.zzj = zzc;
        com.google.android.gms.internal.ads.zzhbw.zzr(zzc, new com.google.android.gms.internal.ads.zzffj(this, zzetrVar, zzfqgVar, zzo, zzffkVar), this.zzc);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzets
    public final boolean zzb() {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzj;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    protected abstract com.google.android.gms.internal.ads.zzdby zzc(com.google.android.gms.internal.ads.zzcvi zzcviVar, com.google.android.gms.internal.ads.zzdcb zzdcbVar, com.google.android.gms.internal.ads.zzdir zzdirVar);

    public final void zzd(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzi.zzp(zzxVar);
    }

    final /* synthetic */ void zze() {
        this.zzd.zzdJ(com.google.android.gms.internal.ads.zzfma.zzd(6, null, null));
    }

    final /* synthetic */ java.util.concurrent.Executor zzh() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfge zzi() {
        return this.zzd;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfhw zzj() {
        return this.zze;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfqj zzk() {
        return this.zzh;
    }

    final /* synthetic */ void zzl(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        this.zzj = null;
    }
}
