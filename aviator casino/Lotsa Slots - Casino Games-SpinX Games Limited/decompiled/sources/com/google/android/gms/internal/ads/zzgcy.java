package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgcy {
    private final com.google.android.gms.internal.ads.zzgff zza;
    private final com.google.android.gms.internal.ads.zzggc zzb;
    private final com.google.android.gms.internal.ads.zzgpc zzc;
    private final com.google.android.gms.internal.ads.zzgqh zzd;
    private final com.google.android.gms.internal.ads.zzgel zze;
    private final long zzf;
    private final com.google.android.gms.internal.ads.zzimo zzg;
    private final long zzh;
    private final long zzi = java.lang.System.currentTimeMillis();
    private final boolean zzj;
    private final long zzk;

    zzgcy(com.google.android.gms.internal.ads.zzgff zzgffVar, com.google.android.gms.internal.ads.zzggc zzggcVar, com.google.android.gms.internal.ads.zzgpc zzgpcVar, com.google.android.gms.internal.ads.zzgqh zzgqhVar, com.google.android.gms.internal.ads.zzgel zzgelVar, com.google.android.gms.internal.ads.zzimo zzimoVar, com.google.android.gms.internal.ads.zzgdf zzgdfVar) {
        this.zza = zzgffVar;
        this.zzb = zzggcVar;
        this.zzc = zzgpcVar;
        this.zzd = zzgqhVar;
        this.zze = zzgelVar;
        this.zzf = zzgdfVar.zzj();
        this.zzg = zzimoVar;
        this.zzh = zzgdfVar.zzi();
        this.zzj = zzgdfVar.zzs();
        this.zzk = zzgdfVar.zzr();
    }

    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return this.zza.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String zzb(final android.content.Context context) {
        java.lang.String num;
        boolean z = false;
        if (this.zzj) {
            if (java.lang.System.currentTimeMillis() - this.zzi <= this.zzk) {
                z = true;
            }
        }
        com.google.android.gms.internal.ads.zzgqf zza = this.zzd.zza(3);
        try {
            try {
                try {
                    zza.zza();
                    num = (java.lang.String) com.google.android.gms.internal.ads.zzhbw.zzj(this.zza.zzb(), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzgcx
                        @Override // com.google.android.gms.internal.ads.zzhbe
                        public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                            return com.google.android.gms.internal.ads.zzgcy.this.zzg(context, (java.lang.Void) obj);
                        }
                    }, com.google.android.gms.internal.ads.zzhcn.zza()).get(z ? this.zzh : this.zzf, java.util.concurrent.TimeUnit.MILLISECONDS);
                } catch (java.lang.InterruptedException e) {
                    java.lang.Thread.currentThread().interrupt();
                    zza.zzb(e);
                    num = "";
                } catch (java.util.concurrent.ExecutionException e2) {
                    e = e2;
                    java.lang.Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    zza.zzb(e);
                    num = java.lang.Integer.toString(3);
                }
            } catch (java.util.concurrent.TimeoutException unused) {
                if (z) {
                    num = ((com.google.android.gms.internal.ads.zzgje) this.zzg.zzb()).zza(true, this.zzi);
                } else {
                    this.zzd.zzb(56);
                    num = java.lang.Integer.toString(17);
                }
            } catch (java.lang.Throwable th) {
                zza.zzb(th);
                throw th;
            }
            zza.zzc();
            this.zze.zzb();
            return num;
        } catch (java.lang.Throwable th2) {
            zza.zzc();
            this.zze.zzb();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String zzc(final android.content.Context context, java.lang.String str, final android.view.View view, final android.app.Activity activity) {
        java.lang.String num;
        com.google.android.gms.internal.ads.zzgqf zza = this.zzd.zza(4);
        try {
            try {
                try {
                    try {
                        zza.zza();
                        final java.lang.String str2 = null;
                        num = (java.lang.String) com.google.android.gms.internal.ads.zzhbw.zzj(this.zza.zzb(), new com.google.android.gms.internal.ads.zzhbe(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgcv
                            private final /* synthetic */ android.content.Context zzb;
                            private final /* synthetic */ android.view.View zzc;
                            private final /* synthetic */ android.app.Activity zzd;

                            {
                                this.zzc = view;
                                this.zzd = activity;
                            }

                            @Override // com.google.android.gms.internal.ads.zzhbe
                            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                                return com.google.android.gms.internal.ads.zzgcy.this.zzh(this.zzb, null, this.zzc, this.zzd, (java.lang.Void) obj);
                            }
                        }, com.google.android.gms.internal.ads.zzhcn.zza()).get(this.zzf, java.util.concurrent.TimeUnit.MILLISECONDS);
                    } catch (java.util.concurrent.ExecutionException e) {
                        e = e;
                        java.lang.Throwable cause = e.getCause();
                        if (cause != null) {
                            e = cause;
                        }
                        zza.zzb(e);
                        num = java.lang.Integer.toString(3);
                    }
                } catch (java.lang.Throwable th) {
                    zza.zzb(th);
                    throw th;
                }
            } catch (java.lang.InterruptedException e2) {
                java.lang.Thread.currentThread().interrupt();
                zza.zzb(e2);
                num = "";
            } catch (java.util.concurrent.TimeoutException unused) {
                this.zzd.zzb(57);
                num = java.lang.Integer.toString(17);
            }
            zza.zzc();
            this.zze.zzb();
            return num;
        } catch (java.lang.Throwable th2) {
            zza.zzc();
            this.zze.zzb();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String zzd(final android.content.Context context, final java.lang.String str, final android.view.View view, android.app.Activity activity) {
        java.lang.String num;
        com.google.android.gms.internal.ads.zzgqf zza = this.zzd.zza(5);
        try {
            try {
                try {
                    try {
                        zza.zza();
                        final android.app.Activity activity2 = null;
                        num = (java.lang.String) com.google.android.gms.internal.ads.zzhbw.zzj(this.zza.zzb(), new com.google.android.gms.internal.ads.zzhbe(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgcw
                            private final /* synthetic */ android.content.Context zzb;
                            private final /* synthetic */ java.lang.String zzc;
                            private final /* synthetic */ android.view.View zzd;

                            @Override // com.google.android.gms.internal.ads.zzhbe
                            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                                return com.google.android.gms.internal.ads.zzgcy.this.zzi(this.zzb, this.zzc, this.zzd, null, (java.lang.Void) obj);
                            }
                        }, com.google.android.gms.internal.ads.zzhcn.zza()).get(this.zzf, java.util.concurrent.TimeUnit.MILLISECONDS);
                    } catch (java.util.concurrent.ExecutionException e) {
                        e = e;
                        java.lang.Throwable cause = e.getCause();
                        if (cause != null) {
                            e = cause;
                        }
                        zza.zzb(e);
                        num = java.lang.Integer.toString(3);
                    }
                } catch (java.lang.Throwable th) {
                    zza.zzb(th);
                    throw th;
                }
            } catch (java.lang.InterruptedException e2) {
                java.lang.Thread.currentThread().interrupt();
                zza.zzb(e2);
                num = "";
            } catch (java.util.concurrent.TimeoutException unused) {
                this.zzd.zzb(58);
                num = java.lang.Integer.toString(17);
            }
            zza.zzc();
            this.zze.zzb();
            return num;
        } catch (java.lang.Throwable th2) {
            zza.zzc();
            this.zze.zzb();
            throw th2;
        }
    }

    public final void zze(java.util.List list) {
        this.zzc.zza(list);
    }

    public final void zzf(android.view.InputEvent inputEvent) {
        this.zzb.zze(inputEvent);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzg(android.content.Context context, java.lang.Void r2) {
        return this.zzb.zzb(context);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzh(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity, java.lang.Void r5) {
        return this.zzb.zzc(context, null, view, activity);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzi(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity, java.lang.Void r5) {
        return this.zzb.zzd(context, str, view, null);
    }

    public final int zzj() {
        return this.zzb.zzh();
    }
}
