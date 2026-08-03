package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgfy {
    private final com.google.android.gms.internal.ads.zzimo zza;
    private final com.google.android.gms.internal.ads.zzimo zzb;
    private final com.google.android.gms.internal.ads.zzimo zzc;
    private final java.util.concurrent.ExecutorService zzd;
    private final com.google.android.gms.internal.ads.zzgqh zze;
    private final int zzf;

    zzgfy(com.google.android.gms.internal.ads.zzimo zzimoVar, com.google.android.gms.internal.ads.zzimo zzimoVar2, com.google.android.gms.internal.ads.zzimo zzimoVar3, com.google.android.gms.internal.ads.zzgdf zzgdfVar, java.util.concurrent.ExecutorService executorService, com.google.android.gms.internal.ads.zzgqh zzgqhVar) {
        this.zza = zzimoVar;
        this.zzb = zzimoVar2;
        this.zzc = zzimoVar3;
        this.zzd = executorService;
        this.zze = zzgqhVar;
        this.zzf = zzgdfVar.zzH();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final com.google.common.util.concurrent.ListenableFuture zzd(final int i) {
        return (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbo.zzw(com.google.android.gms.internal.ads.zzhbw.zzd(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzgfu
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzgfy.this.zzc(i);
            }
        }, this.zzd)), com.google.android.gms.internal.ads.zzgfv.zza, com.google.android.gms.internal.ads.zzhcn.zza());
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzgqh zza() {
        return this.zze;
    }

    final com.google.common.util.concurrent.ListenableFuture zzb(int i, boolean z) {
        com.google.common.util.concurrent.ListenableFuture zzd = zzd(i);
        return (!z || i == this.zzf) ? zzd : (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzj((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzg(com.google.android.gms.internal.ads.zzhbo.zzw(zzd), java.lang.Throwable.class, com.google.android.gms.internal.ads.zzgfx.zza, com.google.android.gms.internal.ads.zzhcn.zza()), new com.google.android.gms.internal.ads.zzgft(this), com.google.android.gms.internal.ads.zzhcn.zza());
    }

    final /* synthetic */ int zze() {
        return this.zzf;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzgfr zzc(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return (com.google.android.gms.internal.ads.zzgfr) this.zza.zzb();
        }
        if (i2 == 2) {
            return (com.google.android.gms.internal.ads.zzgfr) this.zzb.zzb();
        }
        if (i2 == 3) {
            return (com.google.android.gms.internal.ads.zzgfr) this.zzc.zzb();
        }
        throw new java.lang.IllegalArgumentException();
    }
}
