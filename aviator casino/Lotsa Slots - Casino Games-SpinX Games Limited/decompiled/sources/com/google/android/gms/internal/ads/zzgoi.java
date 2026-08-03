package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgoi implements com.google.android.gms.internal.ads.zzgoe {
    private final com.google.android.gms.internal.ads.zzget zza;
    private final com.google.android.gms.internal.ads.zzget zzb;
    private final com.google.android.gms.internal.ads.zzimo zzc;
    private final com.google.android.gms.internal.ads.zzgow zzd;
    private final com.google.android.gms.internal.ads.zzgqh zze;
    private final java.util.concurrent.ExecutorService zzf;

    zzgoi(com.google.android.gms.internal.ads.zzget zzgetVar, com.google.android.gms.internal.ads.zzget zzgetVar2, com.google.android.gms.internal.ads.zzimo zzimoVar, com.google.android.gms.internal.ads.zzgow zzgowVar, java.util.concurrent.ExecutorService executorService, com.google.android.gms.internal.ads.zzgqh zzgqhVar) {
        this.zza = zzgetVar;
        this.zzb = zzgetVar2;
        this.zzc = zzimoVar;
        this.zzd = zzgowVar;
        this.zze = zzgqhVar;
        this.zzf = executorService;
    }

    private final com.google.common.util.concurrent.ListenableFuture zzj(com.google.android.gms.internal.ads.zzgfq zzgfqVar) {
        com.google.common.util.concurrent.ListenableFuture zzc = this.zza.zzc(zzgfqVar);
        this.zze.zze(20303, zzc);
        return zzc;
    }

    private final com.google.common.util.concurrent.ListenableFuture zzk(byte[] bArr) {
        com.google.common.util.concurrent.ListenableFuture zzc = this.zzb.zzc(bArr);
        this.zze.zze(20305, zzc);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgmv
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return com.google.android.gms.internal.ads.zzhbw.zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzgmv
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        com.google.common.util.concurrent.ListenableFuture zzb = this.zza.zzb();
        this.zze.zze(20302, zzb);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgmv
    public final com.google.common.util.concurrent.ListenableFuture zzc(final com.google.android.gms.internal.ads.zzgfq zzgfqVar, byte[] bArr, byte[] bArr2) {
        com.google.common.util.concurrent.ListenableFuture zzc = ((com.google.android.gms.internal.ads.zzget) this.zzc.zzb()).zzc(bArr);
        this.zze.zze(20307, zzc);
        return (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbo.zzw(com.google.android.gms.internal.ads.zzhbw.zzl(zzc, zzk(bArr2))), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzgog
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgoi.this.zzi(zzgfqVar, (java.util.List) obj);
            }
        }, com.google.android.gms.internal.ads.zzhcn.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgmv
    public final com.google.common.util.concurrent.ListenableFuture zzd(final com.google.android.gms.internal.ads.zzgfq zzgfqVar, byte[] bArr) {
        return (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbo.zzw(zzk(bArr)), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzgof
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgoi.this.zzh(zzgfqVar, (java.lang.Void) obj);
            }
        }, com.google.android.gms.internal.ads.zzhcn.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final com.google.common.util.concurrent.ListenableFuture zze() {
        com.google.common.util.concurrent.ListenableFuture zzb = this.zzb.zzb();
        this.zze.zze(20304, zzb);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgoe
    public final com.google.common.util.concurrent.ListenableFuture zzf() {
        com.google.common.util.concurrent.ListenableFuture zzd = com.google.android.gms.internal.ads.zzhbw.zzd(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzgoh
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzgoi.this.zzg();
            }
        }, this.zzf);
        this.zze.zze(20312, zzd);
        return zzd;
    }

    final /* synthetic */ byte[] zzg() {
        return com.google.android.gms.internal.ads.zzgea.zzb(this.zzd.zza(), false);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzh(com.google.android.gms.internal.ads.zzgfq zzgfqVar, java.lang.Void r2) {
        return zzj(zzgfqVar);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzi(com.google.android.gms.internal.ads.zzgfq zzgfqVar, java.util.List list) {
        return zzj(zzgfqVar);
    }
}
