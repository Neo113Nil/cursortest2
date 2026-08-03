package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfgs implements com.google.android.gms.internal.ads.zzets {
    private final android.content.Context zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzcnj zzc;
    private final com.google.android.gms.internal.ads.zzetc zzd;
    private final com.google.android.gms.internal.ads.zzetg zze;
    private final android.view.ViewGroup zzf;
    private com.google.android.gms.internal.ads.zzbjl zzg;
    private final com.google.android.gms.internal.ads.zzdfs zzh;
    private final com.google.android.gms.internal.ads.zzfqj zzi;
    private final com.google.android.gms.internal.ads.zzdhx zzj;
    private final com.google.android.gms.internal.ads.zzfkx zzk;
    private com.google.common.util.concurrent.ListenableFuture zzl;
    private boolean zzm;
    private com.google.android.gms.ads.internal.client.zze zzn;
    private com.google.android.gms.internal.ads.zzetr zzo;

    public zzfgs(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.internal.ads.zzcnj zzcnjVar, com.google.android.gms.internal.ads.zzetc zzetcVar, com.google.android.gms.internal.ads.zzetg zzetgVar, com.google.android.gms.internal.ads.zzfkx zzfkxVar, com.google.android.gms.internal.ads.zzdhx zzdhxVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcnjVar;
        this.zzd = zzetcVar;
        this.zze = zzetgVar;
        this.zzk = zzfkxVar;
        this.zzh = zzcnjVar.zzd();
        this.zzi = zzcnjVar.zzx();
        this.zzf = new android.widget.FrameLayout(context);
        this.zzj = zzdhxVar;
        zzfkxVar.zzc(zzrVar);
        this.zzm = true;
        this.zzn = null;
        this.zzo = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final void zzn() {
        this.zzl = null;
        final com.google.android.gms.ads.internal.client.zze zzeVar = this.zzn;
        this.zzn = null;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzju)).booleanValue() && zzeVar != null) {
            this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfgp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzfgs.this.zzm(zzeVar);
                }
            });
        }
        com.google.android.gms.internal.ads.zzetr zzetrVar = this.zzo;
        if (zzetrVar != null) {
            zzetrVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzets
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzetq zzetqVar, com.google.android.gms.internal.ads.zzetr zzetrVar) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzcwq zzh;
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfgq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzfgs.this.zzl();
                }
            });
            return false;
        }
        if (!zzb()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdi)).booleanValue()) {
                com.google.android.gms.ads.internal.client.zzay.zzc();
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzko)).booleanValue() && zzmVar.zzf) {
                this.zzc.zzw().zzc(true);
            }
            android.os.Bundle zza = com.google.android.gms.internal.ads.zzdyw.zza(new android.util.Pair(com.google.android.gms.internal.ads.zzdyu.PUBLIC_API_CALL.zza(), java.lang.Long.valueOf(zzmVar.zzz)), new android.util.Pair(com.google.android.gms.internal.ads.zzdyu.DYNAMITE_ENTER.zza(), java.lang.Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
            com.google.android.gms.internal.ads.zzfkx zzfkxVar = this.zzk;
            zzfkxVar.zzg(str);
            zzfkxVar.zza(zzmVar);
            zzfkxVar.zzv(zza);
            android.content.Context context = this.zza;
            com.google.android.gms.internal.ads.zzfky zzB = zzfkxVar.zzB();
            com.google.android.gms.internal.ads.zzfpw zzo = com.google.android.gms.internal.ads.zzfpw.CC.zzo(context, com.google.android.gms.internal.ads.zzfqf.zzg(zzB), 3, zzmVar);
            com.google.android.gms.internal.ads.zzfqg zzfqgVar = null;
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkw.zze.zze()).booleanValue() || !zzfkxVar.zzf().zzk) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzju)).booleanValue()) {
                    com.google.android.gms.internal.ads.zzcwp zzi = this.zzc.zzi();
                    com.google.android.gms.internal.ads.zzdca zzdcaVar = new com.google.android.gms.internal.ads.zzdca();
                    zzdcaVar.zza(context);
                    zzdcaVar.zzb(zzB);
                    zzi.zzl(zzdcaVar.zze());
                    com.google.android.gms.internal.ads.zzdiq zzdiqVar = new com.google.android.gms.internal.ads.zzdiq();
                    com.google.android.gms.internal.ads.zzetc zzetcVar = this.zzd;
                    java.util.concurrent.Executor executor = this.zzb;
                    zzdiqVar.zzm(zzetcVar, executor);
                    zzdiqVar.zze(zzetcVar, executor);
                    zzi.zzm(zzdiqVar.zzn());
                    zzi.zzk(new com.google.android.gms.internal.ads.zzeri(this.zzg));
                    zzi.zzd(new com.google.android.gms.internal.ads.zzdnx(com.google.android.gms.internal.ads.zzdqd.zza, null));
                    zzi.zzg(new com.google.android.gms.internal.ads.zzcxl(this.zzh, this.zzj));
                    zzi.zze(new com.google.android.gms.internal.ads.zzcvi(this.zzf));
                    zzh = zzi.zzh();
                } else {
                    com.google.android.gms.internal.ads.zzcwp zzi2 = this.zzc.zzi();
                    com.google.android.gms.internal.ads.zzdca zzdcaVar2 = new com.google.android.gms.internal.ads.zzdca();
                    zzdcaVar2.zza(context);
                    zzdcaVar2.zzb(zzB);
                    zzi2.zzl(zzdcaVar2.zze());
                    com.google.android.gms.internal.ads.zzdiq zzdiqVar2 = new com.google.android.gms.internal.ads.zzdiq();
                    com.google.android.gms.internal.ads.zzetc zzetcVar2 = this.zzd;
                    java.util.concurrent.Executor executor2 = this.zzb;
                    zzdiqVar2.zzm(zzetcVar2, executor2);
                    zzdiqVar2.zzf(zzetcVar2, executor2);
                    zzdiqVar2.zzf(this.zze, executor2);
                    zzdiqVar2.zzg(zzetcVar2, executor2);
                    zzdiqVar2.zzh(zzetcVar2, executor2);
                    zzdiqVar2.zza(zzetcVar2, executor2);
                    zzdiqVar2.zzb(zzetcVar2, executor2);
                    zzdiqVar2.zzc(zzetcVar2, executor2);
                    zzdiqVar2.zze(zzetcVar2, executor2);
                    zzdiqVar2.zzk(zzetcVar2, executor2);
                    zzi2.zzm(zzdiqVar2.zzn());
                    zzi2.zzk(new com.google.android.gms.internal.ads.zzeri(this.zzg));
                    zzi2.zzd(new com.google.android.gms.internal.ads.zzdnx(com.google.android.gms.internal.ads.zzdqd.zza, null));
                    zzi2.zzg(new com.google.android.gms.internal.ads.zzcxl(this.zzh, this.zzj));
                    zzi2.zze(new com.google.android.gms.internal.ads.zzcvi(this.zzf));
                    zzh = zzi2.zzh();
                }
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzc.zze()).booleanValue()) {
                    zzfqgVar = zzh.zze();
                    zzfqgVar.zzi(3);
                    zzfqgVar.zzc(zzmVar.zzp);
                    zzfqgVar.zzd(zzmVar.zzm);
                }
                this.zzo = zzetrVar;
                com.google.android.gms.internal.ads.zzcyx zzc = zzh.zzc();
                com.google.common.util.concurrent.ListenableFuture zzc2 = zzc.zzc(zzc.zzb());
                this.zzl = zzc2;
                com.google.android.gms.internal.ads.zzhbw.zzr(zzc2, new com.google.android.gms.internal.ads.zzfgo(this, zzfqgVar, zzo, zzh), this.zzb);
                return true;
            }
            com.google.android.gms.internal.ads.zzetc zzetcVar3 = this.zzd;
            if (zzetcVar3 != null) {
                zzetcVar3.zzdJ(com.google.android.gms.internal.ads.zzfma.zzd(7, null, null));
            }
        } else if (!this.zzk.zzC()) {
            this.zzm = true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzets
    public final boolean zzb() {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzl;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc() {
        synchronized (this) {
            com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzl;
            if (listenableFuture != null && listenableFuture.isDone()) {
                try {
                    com.google.android.gms.internal.ads.zzcvl zzcvlVar = (com.google.android.gms.internal.ads.zzcvl) this.zzl.get();
                    this.zzl = null;
                    android.view.ViewGroup viewGroup = this.zzf;
                    viewGroup.removeAllViews();
                    zzcvlVar.zza();
                    android.view.ViewParent parent = zzcvlVar.zza().getParent();
                    if (parent instanceof android.view.ViewGroup) {
                        java.lang.String zze = zzcvlVar.zzn() != null ? zzcvlVar.zzn().zze() : "";
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zze).length() + 78);
                        sb.append("Banner view provided from ");
                        sb.append(zze);
                        sb.append(" already has a parent view. Removing its old parent.");
                        java.lang.String sb2 = sb.toString();
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                        ((android.view.ViewGroup) parent).removeView(zzcvlVar.zza());
                    }
                    com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzju;
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
                        com.google.android.gms.internal.ads.zzdgh zzq = zzcvlVar.zzq();
                        zzq.zza(this.zzd);
                        zzq.zzb(this.zze);
                    }
                    viewGroup.addView(zzcvlVar.zza());
                    com.google.android.gms.internal.ads.zzetr zzetrVar = this.zzo;
                    if (zzetrVar != null) {
                        zzetrVar.zzb(zzcvlVar);
                    }
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
                        java.util.concurrent.Executor executor = this.zzb;
                        final com.google.android.gms.internal.ads.zzetc zzetcVar = this.zzd;
                        java.util.Objects.requireNonNull(zzetcVar);
                        executor.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfgr
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                com.google.android.gms.internal.ads.zzetc.this.zzg();
                            }
                        });
                    }
                    if (zzcvlVar.zzh() >= 0) {
                        this.zzm = false;
                        com.google.android.gms.internal.ads.zzdfs zzdfsVar = this.zzh;
                        zzdfsVar.zzd(zzcvlVar.zzh());
                        zzdfsVar.zze(zzcvlVar.zzg());
                    } else {
                        this.zzm = true;
                        this.zzh.zzd(zzcvlVar.zzg());
                    }
                } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                    zzn();
                    com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                    this.zzm = true;
                    this.zzh.zzc();
                }
            } else if (this.zzl != null) {
                com.google.android.gms.ads.internal.util.zze.zza("Show timer went off but there is an ongoing ad request.");
                this.zzm = true;
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                this.zzm = true;
                this.zzh.zzc();
            }
        }
    }

    public final android.view.ViewGroup zzd() {
        return this.zzf;
    }

    public final void zze(com.google.android.gms.internal.ads.zzbjl zzbjlVar) {
        this.zzg = zzbjlVar;
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        this.zze.zza(zzbeVar);
    }

    public final com.google.android.gms.internal.ads.zzfkx zzg() {
        return this.zzk;
    }

    public final boolean zzh() {
        java.lang.Object parent = this.zzf.getParent();
        if (!(parent instanceof android.view.View)) {
            return false;
        }
        android.view.View view = (android.view.View) parent;
        com.google.android.gms.ads.internal.zzt.zzc();
        return com.google.android.gms.ads.internal.util.zzs.zzab(view, view.getContext());
    }

    public final void zzi(com.google.android.gms.internal.ads.zzdfn zzdfnVar) {
        this.zzh.zzq(zzdfnVar, this.zzb);
    }

    public final void zzj() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzk() {
        this.zzh.zze(this.zzj.zzd());
    }

    final /* synthetic */ void zzl() {
        this.zzd.zzdJ(com.google.android.gms.internal.ads.zzfma.zzd(6, null, null));
    }

    final /* synthetic */ void zzm(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzd.zzdJ(zzeVar);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdfs zzo() {
        return this.zzh;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfqj zzp() {
        return this.zzi;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdhx zzq() {
        return this.zzj;
    }

    final /* synthetic */ boolean zzr() {
        return this.zzm;
    }

    final /* synthetic */ void zzs(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzn = zzeVar;
    }
}
