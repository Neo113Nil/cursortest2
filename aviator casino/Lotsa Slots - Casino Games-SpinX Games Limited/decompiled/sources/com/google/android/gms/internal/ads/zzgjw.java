package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgjw implements com.google.android.gms.internal.ads.zzgfr {
    private final com.google.android.gms.internal.ads.zzimo zza;
    private final com.google.android.gms.internal.ads.zzimo zzb;
    private final com.google.android.gms.internal.ads.zzimo zzc;
    private final boolean zzd;
    private final long zze;

    zzgjw(com.google.android.gms.internal.ads.zzimo zzimoVar, com.google.android.gms.internal.ads.zzimo zzimoVar2, com.google.android.gms.internal.ads.zzimo zzimoVar3, boolean z, long j) {
        this.zza = zzimoVar;
        this.zzb = zzimoVar2;
        this.zzc = zzimoVar3;
        this.zzd = z;
        this.zze = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final java.lang.String zza() {
        return ((com.google.android.gms.internal.ads.zzglb) this.zzb.zzb()).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        if (this.zzd) {
            return (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzj((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzj((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzg(com.google.android.gms.internal.ads.zzhbo.zzw(((com.google.android.gms.internal.ads.zzgko) this.zza.zzb()).zzb()), java.lang.Throwable.class, com.google.android.gms.internal.ads.zzgjs.zza, com.google.android.gms.internal.ads.zzhcn.zza()), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzgjt
                @Override // com.google.android.gms.internal.ads.zzhbe
                public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                    return com.google.android.gms.internal.ads.zzgjw.this.zzj((com.google.android.gms.internal.ads.zzgkn) obj);
                }
            }, com.google.android.gms.internal.ads.zzhcn.zza()), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzgju
                @Override // com.google.android.gms.internal.ads.zzhbe
                public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                    return com.google.android.gms.internal.ads.zzgjw.this.zzk((java.lang.Boolean) obj);
                }
            }, com.google.android.gms.internal.ads.zzhcn.zza());
        }
        com.google.android.gms.internal.ads.zzhbo zzhboVar = (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzj((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzg(com.google.android.gms.internal.ads.zzhbo.zzw(((com.google.android.gms.internal.ads.zzgmv) this.zzc.zzb()).zza()), java.lang.Throwable.class, com.google.android.gms.internal.ads.zzgjv.zza, com.google.android.gms.internal.ads.zzhcn.zza()), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzgjq
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgjw.this.zzh((java.lang.Boolean) obj);
            }
        }, com.google.android.gms.internal.ads.zzhcn.zza());
        zzhboVar.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzgjr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzgjw.this.zzi();
            }
        }, com.google.android.gms.internal.ads.zzhcn.zza());
        return zzhboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final com.google.common.util.concurrent.ListenableFuture zzc(android.content.Context context) {
        return ((com.google.android.gms.internal.ads.zzglb) this.zzb.zzb()).zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final com.google.common.util.concurrent.ListenableFuture zzd(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        return ((com.google.android.gms.internal.ads.zzglb) this.zzb.zzb()).zzd(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final com.google.common.util.concurrent.ListenableFuture zze(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        return ((com.google.android.gms.internal.ads.zzglb) this.zzb.zzb()).zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final void zzf(android.view.InputEvent inputEvent) {
        ((com.google.android.gms.internal.ads.zzglb) this.zzb.zzb()).zzf(inputEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzgfr
    public final int zzg() {
        return ((com.google.android.gms.internal.ads.zzglb) this.zzb.zzb()).zzg();
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzh(java.lang.Boolean bool) {
        return ((com.google.android.gms.internal.ads.zzglb) this.zzb.zzb()).zzb();
    }

    final /* synthetic */ void zzi() {
        ((com.google.android.gms.internal.ads.zzgko) this.zza.zzb()).zza(this.zze);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzj(com.google.android.gms.internal.ads.zzgkn zzgknVar) {
        return ((com.google.android.gms.internal.ads.zzgmv) this.zzc.zzb()).zza();
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzk(java.lang.Boolean bool) {
        return ((com.google.android.gms.internal.ads.zzglb) this.zzb.zzb()).zzb();
    }
}
