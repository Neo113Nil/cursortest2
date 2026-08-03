package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzggh implements com.google.android.gms.internal.ads.zzgfr {
    private final java.util.concurrent.ExecutorService zza;
    private final com.google.android.gms.internal.ads.zzimo zzb;
    private final com.google.android.gms.internal.ads.zzimo zzc;
    private final com.google.android.gms.internal.ads.zzgpc zzd;
    private final com.google.android.gms.internal.ads.zzimo zze;
    private final com.google.android.gms.internal.ads.zzinj zzf;
    private final com.google.android.gms.internal.ads.zzgdf zzg;

    zzggh(java.util.concurrent.ExecutorService executorService, com.google.android.gms.internal.ads.zzimo zzimoVar, com.google.android.gms.internal.ads.zzimo zzimoVar2, com.google.android.gms.internal.ads.zzgpc zzgpcVar, com.google.android.gms.internal.ads.zzimo zzimoVar3, com.google.android.gms.internal.ads.zzinj zzinjVar, com.google.android.gms.internal.ads.zzgdf zzgdfVar) {
        this.zza = executorService;
        this.zzb = zzimoVar;
        this.zzc = zzimoVar2;
        this.zzd = zzgpcVar;
        this.zze = zzimoVar3;
        this.zzf = zzinjVar;
        this.zzg = zzgdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final java.lang.String zza() {
        return "1.878096153";
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return com.google.android.gms.internal.ads.zzhbw.zzd(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzggg
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                com.google.android.gms.internal.ads.zzggh.this.zzh();
                return null;
            }
        }, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final com.google.common.util.concurrent.ListenableFuture zzc(android.content.Context context) {
        com.google.android.gms.internal.ads.zzggx zzh = ((com.google.android.gms.internal.ads.zzggx) this.zzf.zzb()).zzh(context);
        zzh.zzd(this.zzd.zzb());
        zzh.zzc(com.google.android.gms.internal.ads.zzaym.zzj());
        zzh.zzb(com.google.android.gms.internal.ads.zzgec.QUERY);
        return zzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final com.google.common.util.concurrent.ListenableFuture zzd(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        com.google.android.gms.internal.ads.zzggx zzh = ((com.google.android.gms.internal.ads.zzggx) this.zzf.zzb()).zzh(context);
        zzh.zzg(view);
        zzh.zzf(activity);
        zzh.zze(true != this.zzg.zzh() ? "" : null);
        zzh.zzd(this.zzd.zzc(context, view));
        zzh.zzc(com.google.android.gms.internal.ads.zzaym.zzj());
        zzh.zzb(com.google.android.gms.internal.ads.zzgec.VIEW);
        return zzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final com.google.common.util.concurrent.ListenableFuture zze(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        com.google.android.gms.internal.ads.zzimo zzimoVar = this.zze;
        java.util.Map zzd = this.zzd.zzd();
        ((com.google.android.gms.internal.ads.zzggp) zzimoVar.zzb()).zzb(zzd);
        com.google.android.gms.internal.ads.zzggx zzh = ((com.google.android.gms.internal.ads.zzggx) this.zzf.zzb()).zzh(context);
        zzh.zzg(view);
        zzh.zzf(null);
        zzh.zze(str);
        zzh.zzd(zzd);
        zzh.zzb(com.google.android.gms.internal.ads.zzgec.CLICK);
        zzh.zzc(com.google.android.gms.internal.ads.zzaym.zzj());
        return zzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final void zzf(android.view.InputEvent inputEvent) {
        if (inputEvent instanceof android.view.MotionEvent) {
            ((com.google.android.gms.internal.ads.zzggp) this.zze.zzb()).zza((android.view.MotionEvent) inputEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final int zzg() {
        return 2;
    }

    final /* synthetic */ java.lang.Void zzh() {
        ((com.google.android.gms.internal.ads.zzgha) this.zzc.zzb()).zza();
        ((com.google.android.gms.internal.ads.zzght) this.zzb.zzb()).zza();
        return null;
    }
}
