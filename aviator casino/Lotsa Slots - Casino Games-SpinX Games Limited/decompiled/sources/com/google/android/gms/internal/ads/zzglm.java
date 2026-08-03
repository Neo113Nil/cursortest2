package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzglm implements com.google.android.gms.internal.ads.zzglb {
    private final com.google.android.gms.internal.ads.zzfyz zza;
    private final com.google.android.gms.internal.ads.zzgmw zzb;
    private final com.google.android.gms.internal.ads.zzgox zzc;
    private final com.google.android.gms.internal.ads.zzgqh zzd;
    private final java.util.concurrent.ExecutorService zze;
    private final java.util.concurrent.atomic.AtomicReference zzf = new java.util.concurrent.atomic.AtomicReference("2.878096153.-1");

    zzglm(com.google.android.gms.internal.ads.zzfyz zzfyzVar, com.google.android.gms.internal.ads.zzgmw zzgmwVar, com.google.android.gms.internal.ads.zzgox zzgoxVar, com.google.android.gms.internal.ads.zzgqh zzgqhVar, java.util.concurrent.ExecutorService executorService) {
        this.zza = zzfyzVar;
        this.zzb = zzgmwVar;
        this.zzc = zzgoxVar;
        this.zzd = zzgqhVar;
        this.zze = executorService;
    }

    @Override // com.google.android.gms.internal.ads.zzglb
    public final java.lang.String zza() {
        return (java.lang.String) this.zzf.get();
    }

    @Override // com.google.android.gms.internal.ads.zzglb
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzk((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzk((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzj((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzk((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzg(com.google.android.gms.internal.ads.zzhbo.zzw(this.zzb.zzb()), java.lang.Throwable.class, com.google.android.gms.internal.ads.zzgll.zza, com.google.android.gms.internal.ads.zzhcn.zza()), new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzgld
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzglm.this.zzh((com.google.android.gms.internal.ads.zzgfq) obj);
                return new java.lang.Boolean(true);
            }
        }, com.google.android.gms.internal.ads.zzhcn.zza()), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzgle
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzglm.this.zzi((java.lang.Boolean) obj);
            }
        }, com.google.android.gms.internal.ads.zzhcn.zza()), new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzglf
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzglm.this.zzj((com.google.android.gms.internal.ads.zzfyp) obj);
                return new java.lang.Boolean(true);
            }
        }, com.google.android.gms.internal.ads.zzhcn.zza()), com.google.android.gms.internal.ads.zzglg.zza, com.google.android.gms.internal.ads.zzhcn.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzglb
    public final com.google.common.util.concurrent.ListenableFuture zzc(final android.content.Context context) {
        return com.google.android.gms.internal.ads.zzhbw.zzd(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzglh
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzglm.this.zzk(context);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzglb
    public final com.google.common.util.concurrent.ListenableFuture zzd(final android.content.Context context, java.lang.String str, final android.view.View view, final android.app.Activity activity) {
        final java.lang.String str2 = null;
        return com.google.android.gms.internal.ads.zzhbw.zzd(new java.util.concurrent.Callable(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgli
            private final /* synthetic */ android.content.Context zzb;
            private final /* synthetic */ android.view.View zzc;
            private final /* synthetic */ android.app.Activity zzd;

            {
                this.zzc = view;
                this.zzd = activity;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzglm.this.zzl(this.zzb, null, this.zzc, this.zzd);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzglb
    public final com.google.common.util.concurrent.ListenableFuture zze(final android.content.Context context, final java.lang.String str, final android.view.View view, android.app.Activity activity) {
        final android.app.Activity activity2 = null;
        return com.google.android.gms.internal.ads.zzhbw.zzd(new java.util.concurrent.Callable(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzglj
            private final /* synthetic */ android.content.Context zzb;
            private final /* synthetic */ java.lang.String zzc;
            private final /* synthetic */ android.view.View zzd;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzglm.this.zzm(this.zzb, this.zzc, this.zzd, null);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzglb
    public final void zzf(android.view.InputEvent inputEvent) {
        com.google.android.gms.internal.ads.zzfxj zzb = this.zza.zzb();
        if (zzb == null) {
            this.zzd.zzb(15004);
        } else if (inputEvent instanceof android.view.MotionEvent) {
            try {
                zzb.zzd(null, (android.view.MotionEvent) inputEvent);
            } catch (com.google.android.gms.internal.ads.zzfyy e) {
                this.zzd.zzd(15005, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzglb
    public final int zzg() {
        return 3;
    }

    final /* synthetic */ boolean zzh(com.google.android.gms.internal.ads.zzgfq zzgfqVar) {
        if (this.zzc.zzb(zzgfqVar) && zzgfqVar != null) {
            return true;
        }
        this.zzd.zzb(15003);
        throw new com.google.android.gms.internal.ads.zzglc(1);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzi(java.lang.Boolean bool) {
        return this.zzb.zze();
    }

    final /* synthetic */ boolean zzj(final com.google.android.gms.internal.ads.zzfyp zzfypVar) {
        if (zzfypVar == null) {
            throw new com.google.android.gms.internal.ads.zzglc(3);
        }
        java.io.File zzb = zzfypVar.zzb();
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            zzb.setReadOnly();
        }
        this.zzd.zzf(15002, new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzglk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzglm.this.zzn(zzfypVar);
            }
        });
        return true;
    }

    final /* synthetic */ java.lang.String zzk(android.content.Context context) {
        com.google.android.gms.internal.ads.zzfxj zzb = this.zza.zzb();
        if (zzb == null) {
            this.zzd.zzb(15004);
            return "";
        }
        java.lang.String zza = zzb.zza(context, null);
        if (zza != null) {
            return zza;
        }
        this.zzd.zzb(15006);
        return "";
    }

    final /* synthetic */ java.lang.String zzl(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        com.google.android.gms.internal.ads.zzfxj zzb = this.zza.zzb();
        if (zzb == null) {
            this.zzd.zzb(15004);
            return "";
        }
        java.lang.String zzb2 = zzb.zzb(context, null, view, activity);
        if (zzb2 != null) {
            return zzb2;
        }
        this.zzd.zzb(15007);
        return "";
    }

    final /* synthetic */ java.lang.String zzm(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        com.google.android.gms.internal.ads.zzfxj zzb = this.zza.zzb();
        if (zzb == null) {
            this.zzd.zzb(15004);
            return "";
        }
        java.lang.String zzc = zzb.zzc(context, null, str, view, null);
        if (zzc != null) {
            return zzc;
        }
        this.zzd.zzb(15008);
        return "";
    }

    final /* synthetic */ void zzn(com.google.android.gms.internal.ads.zzfyp zzfypVar) {
        if (!this.zza.zza(zzfypVar)) {
            throw new com.google.android.gms.internal.ads.zzglc(2);
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzf;
        java.lang.String zza = zzfypVar.zza().zza();
        java.lang.String.valueOf(zza);
        atomicReference.set("2.878096153.".concat(java.lang.String.valueOf(zza)));
    }
}
