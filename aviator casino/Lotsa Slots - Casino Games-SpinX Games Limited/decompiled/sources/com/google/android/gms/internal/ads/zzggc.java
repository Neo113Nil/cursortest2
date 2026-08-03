package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzggc implements com.google.android.gms.internal.ads.zzgfd {
    private final com.google.android.gms.internal.ads.zzgdf zza;
    private final com.google.android.gms.internal.ads.zzgfy zzb;
    private final com.google.android.gms.internal.ads.zzgfs zzc;
    private final java.util.concurrent.ExecutorService zzd;
    private final com.google.android.gms.internal.ads.zzgqh zze;
    private final java.util.concurrent.atomic.AtomicReference zzf = new java.util.concurrent.atomic.AtomicReference();

    zzggc(com.google.android.gms.internal.ads.zzgdf zzgdfVar, com.google.android.gms.internal.ads.zzgfy zzgfyVar, com.google.android.gms.internal.ads.zzgfs zzgfsVar, java.util.concurrent.ExecutorService executorService, com.google.android.gms.internal.ads.zzgqh zzgqhVar) {
        this.zza = zzgdfVar;
        this.zzb = zzgfyVar;
        this.zzc = zzgfsVar;
        this.zzd = executorService;
        this.zze = zzgqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfd
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        com.google.android.gms.internal.ads.zzgfy zzgfyVar = this.zzb;
        com.google.android.gms.internal.ads.zzgdf zzgdfVar = this.zza;
        com.google.android.gms.internal.ads.zzhbo zzhboVar = (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzk(com.google.android.gms.internal.ads.zzhbo.zzw(zzgfyVar.zzb(zzgdfVar.zzG(), zzgdfVar.zza())), new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzggb
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzgfr zzgfrVar = (com.google.android.gms.internal.ads.zzgfr) obj;
                com.google.android.gms.internal.ads.zzggc.this.zzf(zzgfrVar);
                return zzgfrVar;
            }
        }, com.google.android.gms.internal.ads.zzhcn.zza());
        com.google.android.gms.internal.ads.zzhbw.zzr(zzhboVar, new com.google.android.gms.internal.ads.zzgga(this), this.zzd);
        return zzhboVar;
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(android.content.Context context) {
        return ((com.google.android.gms.internal.ads.zzgfr) this.zzf.get()).zzc(context);
    }

    public final com.google.common.util.concurrent.ListenableFuture zzc(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        return ((com.google.android.gms.internal.ads.zzgfr) this.zzf.get()).zzd(context, null, view, activity);
    }

    public final com.google.common.util.concurrent.ListenableFuture zzd(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        return ((com.google.android.gms.internal.ads.zzgfr) this.zzf.get()).zze(context, str, view, null);
    }

    public final void zze(android.view.InputEvent inputEvent) {
        com.google.android.gms.internal.ads.zzgfr zzgfrVar = (com.google.android.gms.internal.ads.zzgfr) this.zzf.get();
        if (zzgfrVar == null) {
            this.zze.zzb(54);
        } else {
            zzgfrVar.zzf(inputEvent);
        }
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzgfr zzf(com.google.android.gms.internal.ads.zzgfr zzgfrVar) {
        this.zzf.set(zzgfrVar);
        return zzgfrVar;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzgfs zzg() {
        return this.zzc;
    }

    public final int zzh() {
        com.google.android.gms.internal.ads.zzgfr zzgfrVar = (com.google.android.gms.internal.ads.zzgfr) this.zzf.get();
        if (zzgfrVar == null) {
            return 1;
        }
        return zzgfrVar.zzg();
    }
}
