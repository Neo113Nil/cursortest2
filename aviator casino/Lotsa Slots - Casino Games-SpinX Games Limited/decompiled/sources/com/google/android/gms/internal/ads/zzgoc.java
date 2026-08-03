package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgoc implements com.google.android.gms.internal.ads.zzgmw {
    private final com.google.android.gms.internal.ads.zzgkz zza;
    private final java.util.concurrent.ExecutorService zzb;
    private final com.google.android.gms.internal.ads.zzgqh zzc;

    zzgoc(com.google.android.gms.internal.ads.zzgkz zzgkzVar, java.util.concurrent.ExecutorService executorService, com.google.android.gms.internal.ads.zzgqh zzgqhVar) {
        this.zza = zzgkzVar;
        this.zzb = executorService;
        this.zzc = zzgqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgmv
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return com.google.android.gms.internal.ads.zzhbw.zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzgmv
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        com.google.common.util.concurrent.ListenableFuture zzd = com.google.android.gms.internal.ads.zzhbw.zzd(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzgob
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzgoc.this.zzf();
            }
        }, this.zzb);
        this.zzc.zze(15302, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgmv
    public final com.google.common.util.concurrent.ListenableFuture zzc(final com.google.android.gms.internal.ads.zzgfq zzgfqVar, final byte[] bArr, final byte[] bArr2) {
        com.google.common.util.concurrent.ListenableFuture zzd = com.google.android.gms.internal.ads.zzhbw.zzd(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzgoa
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                com.google.android.gms.internal.ads.zzgoc.this.zzi(zzgfqVar, bArr, bArr2);
                return null;
            }
        }, this.zzb);
        this.zzc.zze(15321, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgmv
    public final com.google.common.util.concurrent.ListenableFuture zzd(final com.google.android.gms.internal.ads.zzgfq zzgfqVar, final byte[] bArr) {
        com.google.common.util.concurrent.ListenableFuture zzd = com.google.android.gms.internal.ads.zzhbw.zzd(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzgnz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                com.google.android.gms.internal.ads.zzgoc.this.zzh(zzgfqVar, bArr);
                return null;
            }
        }, this.zzb);
        this.zzc.zze(15305, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgmw
    public final com.google.common.util.concurrent.ListenableFuture zze() {
        com.google.common.util.concurrent.ListenableFuture zzd = com.google.android.gms.internal.ads.zzhbw.zzd(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzgny
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzgoc.this.zzg();
            }
        }, this.zzb);
        this.zzc.zze(15314, zzd);
        return zzd;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzgfq zzf() {
        com.google.android.gms.internal.ads.zzgfq zzc = this.zza.zzc(1);
        return zzc == null ? com.google.android.gms.internal.ads.zzgfq.zzh() : zzc;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfyp zzg() {
        return this.zza.zzb(1);
    }

    final /* synthetic */ java.lang.Void zzh(com.google.android.gms.internal.ads.zzgfq zzgfqVar, byte[] bArr) {
        this.zza.zza(zzgfqVar, null, bArr);
        return null;
    }

    final /* synthetic */ java.lang.Void zzi(com.google.android.gms.internal.ads.zzgfq zzgfqVar, byte[] bArr, byte[] bArr2) {
        this.zza.zza(zzgfqVar, bArr, bArr2);
        return null;
    }
}
