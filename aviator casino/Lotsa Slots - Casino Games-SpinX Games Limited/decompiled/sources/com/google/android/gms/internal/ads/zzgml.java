package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgml implements com.google.android.gms.internal.ads.zzgme {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzimo zzb;
    private final com.google.android.gms.internal.ads.zzgmv zzc;
    private final com.google.android.gms.internal.ads.zzgqh zzd;
    private final java.util.concurrent.ExecutorService zze;
    private final com.google.android.gms.internal.ads.zzgla zzf;
    private final com.google.android.gms.internal.ads.zzfxg zzg;

    zzgml(android.content.Context context, com.google.android.gms.internal.ads.zzimo zzimoVar, com.google.android.gms.internal.ads.zzgmv zzgmvVar, com.google.android.gms.internal.ads.zzgqh zzgqhVar, java.util.concurrent.ExecutorService executorService, com.google.android.gms.internal.ads.zzgla zzglaVar, com.google.android.gms.internal.ads.zzfxg zzfxgVar) {
        this.zza = context;
        this.zzb = zzimoVar;
        this.zzc = zzgmvVar;
        this.zzd = zzgqhVar;
        this.zze = executorService;
        this.zzf = zzglaVar;
        this.zzg = zzfxgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.internal.ads.zzgfo zzf(int i) {
        com.google.android.gms.internal.ads.zzgfn zzd = com.google.android.gms.internal.ads.zzgfo.zzd();
        zzd.zzd(i);
        return (com.google.android.gms.internal.ads.zzgfo) zzd.zzbu();
    }

    @Override // com.google.android.gms.internal.ads.zzgme
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        final com.google.android.gms.internal.ads.zzimo zzimoVar = this.zzb;
        java.util.Objects.requireNonNull(zzimoVar);
        java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzgmg
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzimo.this.zzb();
            }
        };
        java.util.concurrent.ExecutorService executorService = this.zze;
        com.google.android.gms.internal.ads.zzhbo zzhboVar = (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzg((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzk((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzj((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzk(com.google.android.gms.internal.ads.zzhbo.zzw(com.google.android.gms.internal.ads.zzhbw.zzd(callable, executorService)), new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzgmk
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzgml.this.zzb((com.google.android.gms.internal.ads.zzbds) obj);
                return new java.lang.Integer(0);
            }
        }, com.google.android.gms.internal.ads.zzhcn.zza()), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzgmh
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgml.this.zzc((java.lang.Integer) obj);
            }
        }, com.google.android.gms.internal.ads.zzhcn.zza()), new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzgmi
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgml.this.zzd((com.google.android.gms.internal.ads.zzgfq) obj);
            }
        }, executorService), com.google.android.gms.internal.ads.zzgmf.class, com.google.android.gms.internal.ads.zzgmj.zza, com.google.android.gms.internal.ads.zzhcn.zza());
        this.zzd.zze(15202, zzhboVar);
        return zzhboVar;
    }

    final /* synthetic */ int zzb(com.google.android.gms.internal.ads.zzbds zzbdsVar) {
        if (com.google.android.gms.internal.ads.zzfyd.zza(zzbdsVar)) {
            return 0;
        }
        this.zzd.zzc(15204, zzbdsVar.name());
        throw new com.google.android.gms.internal.ads.zzgmf(null);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(java.lang.Integer num) {
        return this.zzc.zzb();
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzgfo zzd(com.google.android.gms.internal.ads.zzgfq zzgfqVar) {
        java.lang.String zza = zzgfqVar.zza().zza();
        java.lang.String zzb = zzgfqVar.zza().zzb();
        com.google.android.gms.internal.ads.zzgqf zza2 = this.zzd.zza(15203);
        try {
            zza2.zza();
            com.google.android.gms.internal.ads.zzfyu zza3 = com.google.android.gms.internal.ads.zzfxp.zza(this.zza, 1, (com.google.android.gms.internal.ads.zzbds) this.zzb.zzb(), zza, zzb, "1", this.zzg);
            zza2.zzc();
            int i = 2;
            if (zza3.zzc == 2) {
                this.zzd.zzb(15208);
                return zzf(4);
            }
            byte[] bArr = zza3.zzb;
            if (bArr == null || bArr.length == 0) {
                this.zzd.zzb(com.ironsource.mediationsdk.utils.IronSourceConstants.errorCode_destroy);
                return zzf(8);
            }
            try {
                com.google.android.gms.internal.ads.zzbdu zze = com.google.android.gms.internal.ads.zzbdu.zze(bArr, com.google.android.gms.internal.ads.zzido.zzb());
                if (zze.zza().zza().isEmpty() || zze.zza().zzb().isEmpty() || zze.zzc().zzA().length == 0) {
                    this.zzd.zzb(15207);
                } else {
                    if (zzgfqVar.equals(com.google.android.gms.internal.ads.zzgfq.zzh()) || !android.text.TextUtils.equals(zzgfqVar.zza().zza(), zze.zza().zza()) || !android.text.TextUtils.equals(zzgfqVar.zza().zzb(), zze.zza().zzb())) {
                        int i2 = zza3.zzc;
                        if (i2 == 4) {
                            if (!this.zzf.zza(zze.zzb().zzA())) {
                                this.zzd.zzb(15206);
                                return zzf(12);
                            }
                            i2 = 4;
                        }
                        com.google.android.gms.internal.ads.zzgfn zzd = com.google.android.gms.internal.ads.zzgfo.zzd();
                        if (i2 == 2) {
                            i = 4;
                        } else if (i2 != 3) {
                            i = i2 != 4 ? i2 != 6 ? 1 : 5 : 3;
                        }
                        zzd.zzd(i);
                        com.google.android.gms.internal.ads.zzgfp zzg = com.google.android.gms.internal.ads.zzgfq.zzg();
                        zzg.zza(zze.zza());
                        zzg.zzc((com.google.android.gms.internal.ads.zzbds) this.zzb.zzb());
                        zzd.zza((com.google.android.gms.internal.ads.zzgfq) zzg.zzbu());
                        zzd.zzc(zze.zzb());
                        zzd.zzb(zze.zzc());
                        return (com.google.android.gms.internal.ads.zzgfo) zzd.zzbu();
                    }
                    this.zzd.zzb(15209);
                }
                return zzf(11);
            } catch (com.google.android.gms.internal.ads.zziet e) {
                this.zzd.zzd(15205, e);
                return zzf(9);
            } catch (java.lang.NullPointerException unused) {
                this.zzd.zzb(15210);
                return zzf(10);
            }
        } catch (java.lang.Throwable th) {
            try {
                zza2.zzb(th);
                throw th;
            } catch (java.lang.Throwable th2) {
                zza2.zzc();
                throw th2;
            }
        }
    }
}
