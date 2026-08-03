package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgnb implements com.google.android.gms.internal.ads.zzgmw {
    private final com.google.android.gms.internal.ads.zzget zza;
    private final com.google.android.gms.internal.ads.zzget zzb;
    private final com.google.android.gms.internal.ads.zzget zzc;
    private final com.google.android.gms.internal.ads.zzget zzd;
    private final com.google.android.gms.internal.ads.zzimo zze;
    private final com.google.android.gms.internal.ads.zzimo zzf;
    private final java.io.File zzg;
    private final java.util.concurrent.ExecutorService zzh;
    private final com.google.android.gms.internal.ads.zzgqh zzi;

    zzgnb(com.google.android.gms.internal.ads.zzget zzgetVar, com.google.android.gms.internal.ads.zzget zzgetVar2, com.google.android.gms.internal.ads.zzimo zzimoVar, com.google.android.gms.internal.ads.zzget zzgetVar3, com.google.android.gms.internal.ads.zzget zzgetVar4, com.google.android.gms.internal.ads.zzimo zzimoVar2, java.io.File file, java.util.concurrent.ExecutorService executorService, com.google.android.gms.internal.ads.zzgqh zzgqhVar) {
        this.zza = zzgetVar;
        this.zzc = zzgetVar2;
        this.zze = zzimoVar;
        this.zzb = zzgetVar3;
        this.zzd = zzgetVar4;
        this.zzf = zzimoVar2;
        this.zzg = file;
        this.zzh = executorService;
        this.zzi = zzgqhVar;
    }

    private final com.google.common.util.concurrent.ListenableFuture zzj(byte[] bArr) {
        com.google.common.util.concurrent.ListenableFuture zzc = this.zzd.zzc(bArr);
        this.zzi.zze(15305, zzc);
        return zzc;
    }

    private final com.google.common.util.concurrent.ListenableFuture zzk(com.google.android.gms.internal.ads.zzgfq zzgfqVar) {
        com.google.common.util.concurrent.ListenableFuture zzc = this.zzb.zzc(zzgfqVar);
        this.zzi.zze(15303, zzc);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgmv
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return com.google.android.gms.internal.ads.zzhbw.zzd(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzgna
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return new java.lang.Boolean(com.google.android.gms.internal.ads.zzgnb.this.zzf());
            }
        }, this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgmv
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        com.google.common.util.concurrent.ListenableFuture zzb = this.zza.zzb();
        this.zzi.zze(15302, zzb);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgmv
    public final com.google.common.util.concurrent.ListenableFuture zzc(final com.google.android.gms.internal.ads.zzgfq zzgfqVar, byte[] bArr, byte[] bArr2) {
        com.google.common.util.concurrent.ListenableFuture zzc = ((com.google.android.gms.internal.ads.zzget) this.zzf.zzb()).zzc(bArr);
        this.zzi.zze(15307, zzc);
        return (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbo.zzw(com.google.android.gms.internal.ads.zzhbw.zzl(zzc, zzj(bArr2))), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzgmz
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgnb.this.zzi(zzgfqVar, (java.util.List) obj);
            }
        }, com.google.android.gms.internal.ads.zzhcn.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgmv
    public final com.google.common.util.concurrent.ListenableFuture zzd(final com.google.android.gms.internal.ads.zzgfq zzgfqVar, byte[] bArr) {
        return (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbo.zzw(zzj(bArr)), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzgmy
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgnb.this.zzh(zzgfqVar, (java.lang.Void) obj);
            }
        }, com.google.android.gms.internal.ads.zzhcn.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgmw
    public final com.google.common.util.concurrent.ListenableFuture zze() {
        com.google.android.gms.internal.ads.zzhbo zzhboVar = (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzk(com.google.android.gms.internal.ads.zzhbo.zzw(this.zza.zzb()), new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzgmx
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgnb.this.zzg((com.google.android.gms.internal.ads.zzgfq) obj);
            }
        }, com.google.android.gms.internal.ads.zzhcn.zza());
        this.zzi.zze(15314, zzhboVar);
        return zzhboVar;
    }

    final /* synthetic */ boolean zzf() {
        try {
            com.google.android.gms.internal.ads.zzget zzgetVar = this.zzb;
            java.io.File zza = zzgetVar.zza();
            if (zza.exists()) {
                java.io.File zza2 = ((com.google.android.gms.internal.ads.zzget) this.zzf.zzb()).zza();
                java.io.File zza3 = ((com.google.android.gms.internal.ads.zzget) this.zze.zzb()).zza();
                try {
                    if (zza2.exists()) {
                        java.io.File parentFile = zza3.getParentFile();
                        if (parentFile != null) {
                            com.google.android.gms.internal.ads.zzfyr.zze(parentFile);
                        }
                        com.google.android.gms.internal.ads.zzgzt.zzb(zza3);
                        com.google.android.gms.internal.ads.zzgzt.zzc(zza2, zza3);
                    }
                    java.io.File zza4 = this.zzd.zza();
                    java.io.File zza5 = this.zzc.zza();
                    try {
                        if (zza4.exists()) {
                            com.google.android.gms.internal.ads.zzgzt.zzb(zza5);
                            com.google.android.gms.internal.ads.zzgzt.zzc(zza4, zza5);
                        }
                        java.io.File zza6 = this.zza.zza();
                        try {
                            if (zza.exists()) {
                                com.google.android.gms.internal.ads.zzgzt.zzb(zza6);
                                com.google.android.gms.internal.ads.zzgzt.zzc(zza, zza6);
                            }
                            this.zzb.zza().delete();
                            ((com.google.android.gms.internal.ads.zzget) this.zzf.zzb()).zza().delete();
                            this.zzd.zza().delete();
                            return true;
                        } catch (java.io.IOException | java.lang.SecurityException e) {
                            this.zzi.zzd(15313, e);
                            zzgetVar = this.zzb;
                        }
                    } catch (java.io.IOException | java.lang.SecurityException e2) {
                        this.zzi.zzd(15312, e2);
                        zzgetVar = this.zzb;
                    }
                } catch (java.io.IOException | java.lang.SecurityException e3) {
                    this.zzi.zzd(15311, e3);
                    zzgetVar = this.zzb;
                }
            }
            zzgetVar.zza().delete();
            ((com.google.android.gms.internal.ads.zzget) this.zzf.zzb()).zza().delete();
            this.zzd.zza().delete();
            return false;
        } catch (java.lang.Throwable th) {
            this.zzb.zza().delete();
            ((com.google.android.gms.internal.ads.zzget) this.zzf.zzb()).zza().delete();
            this.zzd.zza().delete();
            throw th;
        }
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfyp zzg(com.google.android.gms.internal.ads.zzgfq zzgfqVar) {
        if (zzgfqVar == null || zzgfqVar.equals(com.google.android.gms.internal.ads.zzgfq.zzh())) {
            return null;
        }
        com.google.android.gms.internal.ads.zzbeb zza = zzgfqVar.zza();
        java.io.File zza2 = ((com.google.android.gms.internal.ads.zzget) this.zze.zzb()).zza();
        com.google.android.gms.internal.ads.zzget zzgetVar = this.zzc;
        return new com.google.android.gms.internal.ads.zzfyp(zza, zza2, zzgetVar.zza(), this.zzg);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzh(com.google.android.gms.internal.ads.zzgfq zzgfqVar, java.lang.Void r2) {
        return zzk(zzgfqVar);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzi(com.google.android.gms.internal.ads.zzgfq zzgfqVar, java.util.List list) {
        return zzk(zzgfqVar);
    }
}
