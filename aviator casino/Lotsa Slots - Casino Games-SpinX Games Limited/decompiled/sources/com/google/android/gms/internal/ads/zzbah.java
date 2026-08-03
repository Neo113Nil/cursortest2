package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbah implements com.google.android.gms.internal.ads.zzbak {
    private static com.google.android.gms.internal.ads.zzbah zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzfyq zzd;
    private final com.google.android.gms.internal.ads.zzfyx zze;
    private final com.google.android.gms.internal.ads.zzfyz zzf;
    private final com.google.android.gms.internal.ads.zzbbm zzg;
    private final com.google.android.gms.internal.ads.zzfxg zzh;
    private final java.util.concurrent.Executor zzi;
    private final com.google.android.gms.internal.ads.zzbds zzj;
    private final com.google.android.gms.internal.ads.zzfyw zzk;
    private final com.google.android.gms.internal.ads.zzbcb zzm;
    private final com.google.android.gms.internal.ads.zzbbt zzn;
    private final com.google.android.gms.internal.ads.zzbbk zzo;
    private volatile boolean zzq;
    private volatile boolean zzr;
    volatile long zza = 0;
    private final java.lang.Object zzp = new java.lang.Object();
    private final java.util.concurrent.CountDownLatch zzl = new java.util.concurrent.CountDownLatch(1);

    zzbah(android.content.Context context, com.google.android.gms.internal.ads.zzfxg zzfxgVar, com.google.android.gms.internal.ads.zzfyq zzfyqVar, com.google.android.gms.internal.ads.zzfyx zzfyxVar, com.google.android.gms.internal.ads.zzfyz zzfyzVar, com.google.android.gms.internal.ads.zzbbm zzbbmVar, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzfxb zzfxbVar, com.google.android.gms.internal.ads.zzbds zzbdsVar, com.google.android.gms.internal.ads.zzbcb zzbcbVar, com.google.android.gms.internal.ads.zzbbt zzbbtVar, com.google.android.gms.internal.ads.zzbbk zzbbkVar) {
        this.zzr = false;
        this.zzc = context;
        this.zzh = zzfxgVar;
        this.zzd = zzfyqVar;
        this.zze = zzfyxVar;
        this.zzf = zzfyzVar;
        this.zzg = zzbbmVar;
        this.zzi = executor;
        this.zzj = zzbdsVar;
        this.zzm = zzbcbVar;
        this.zzn = zzbbtVar;
        this.zzo = zzbbkVar;
        this.zzr = false;
        this.zzk = new com.google.android.gms.internal.ads.zzbaf(this, zzfxbVar);
    }

    public static synchronized com.google.android.gms.internal.ads.zzbah zza(android.content.Context context, com.google.android.gms.internal.ads.zzawo zzawoVar, boolean z) {
        com.google.android.gms.internal.ads.zzbah zzs;
        synchronized (com.google.android.gms.internal.ads.zzbah.class) {
            com.google.android.gms.internal.ads.zzfxh zzh = com.google.android.gms.internal.ads.zzfxi.zzh();
            zzh.zza(zzawoVar.zza());
            zzh.zzb(zzawoVar.zzb());
            zzs = zzs(context, java.util.concurrent.Executors.newCachedThreadPool(), zzh.zzh(), z);
        }
        return zzs;
    }

    private static synchronized com.google.android.gms.internal.ads.zzbah zzs(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzfxi zzfxiVar, boolean z) {
        com.google.android.gms.internal.ads.zzbah zzbahVar;
        synchronized (com.google.android.gms.internal.ads.zzbah.class) {
            if (zzb == null) {
                com.google.android.gms.internal.ads.zzfxg zza = com.google.android.gms.internal.ads.zzfxg.zza(context, executor, z);
                com.google.android.gms.internal.ads.zzbav zza2 = com.google.android.gms.internal.ads.zzbav.zza(context);
                com.google.android.gms.internal.ads.zzbcb zza3 = com.google.android.gms.internal.ads.zzbcb.zza(context, executor);
                com.google.android.gms.internal.ads.zzbbt zzbbtVar = new com.google.android.gms.internal.ads.zzbbt();
                com.google.android.gms.internal.ads.zzbbk zzbbkVar = new com.google.android.gms.internal.ads.zzbbk();
                com.google.android.gms.internal.ads.zzfxw zza4 = com.google.android.gms.internal.ads.zzfxw.zza(context, executor, zza, zzfxiVar);
                com.google.android.gms.internal.ads.zzbbl zzbblVar = new com.google.android.gms.internal.ads.zzbbl(context);
                com.google.android.gms.internal.ads.zzbbm zzbbmVar = new com.google.android.gms.internal.ads.zzbbm(zzfxiVar, zza4, new com.google.android.gms.internal.ads.zzbbz(context, zzbblVar), zzbblVar, zza2, zza3, zzbbtVar, zzbbkVar);
                com.google.android.gms.internal.ads.zzbds zzb2 = com.google.android.gms.internal.ads.zzfyd.zzb(context, zza);
                com.google.android.gms.internal.ads.zzfxb zzfxbVar = new com.google.android.gms.internal.ads.zzfxb();
                com.google.android.gms.internal.ads.zzbah zzbahVar2 = new com.google.android.gms.internal.ads.zzbah(context, zza, new com.google.android.gms.internal.ads.zzfyq(context, zzb2), new com.google.android.gms.internal.ads.zzfyx(context, zzb2, new com.google.android.gms.internal.ads.zzbae(zza), ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdl)).booleanValue()), new com.google.android.gms.internal.ads.zzfyz(context, zzbbmVar, zza, zzfxbVar, false), zzbbmVar, executor, zzfxbVar, zzb2, zza3, zzbbtVar, zzbbkVar);
                zzb = zzbahVar2;
                zzbahVar2.zzc();
                zzb.zzm();
            }
            zzbahVar = zzb;
        }
        return zzbahVar;
    }

    private final com.google.android.gms.internal.ads.zzfyp zzt(int i) {
        if (com.google.android.gms.internal.ads.zzfyd.zza(this.zzj)) {
            return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdj)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzb(1);
        }
        return null;
    }

    public final synchronized boolean zzb() {
        return this.zzr;
    }

    final synchronized void zzc() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.google.android.gms.internal.ads.zzfyp zzt = zzt(1);
        if (zzt == null) {
            this.zzh.zzb(4013, java.lang.System.currentTimeMillis() - currentTimeMillis);
        } else if (this.zzf.zza(zzt)) {
            this.zzr = true;
            this.zzl.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zzd(android.view.MotionEvent motionEvent) {
        com.google.android.gms.internal.ads.zzfxj zzb2 = this.zzf.zzb();
        if (zzb2 != null) {
            try {
                zzb2.zzd(null, motionEvent);
            } catch (com.google.android.gms.internal.ads.zzfyy e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zze(int i, int i2, int i3) {
        android.util.DisplayMetrics displayMetrics;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznv)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f2 = i2;
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(0L, 0L, 0, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(obtain);
        obtain.recycle();
        android.view.MotionEvent obtain2 = android.view.MotionEvent.obtain(0L, 0L, 2, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(obtain2);
        obtain2.recycle();
        android.view.MotionEvent obtain3 = android.view.MotionEvent.obtain(0L, i3, 1, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(obtain3);
        obtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final java.lang.String zzf(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        this.zzm.zzb();
        this.zzn.zzc();
        zzm();
        com.google.android.gms.internal.ads.zzfxj zzb2 = this.zzf.zzb();
        if (zzb2 == null) {
            return "";
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String zzc = zzb2.zzc(context, null, str, view, activity);
        this.zzh.zzd(5000, java.lang.System.currentTimeMillis() - currentTimeMillis, zzc, null);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final java.lang.String zzg(android.content.Context context, java.lang.String str, android.view.View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zzh(android.view.View view) {
        this.zzg.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final void zzi(java.lang.StackTraceElement[] stackTraceElementArr) {
        this.zzo.zza(java.util.Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final java.lang.String zzj(android.content.Context context, android.view.View view, android.app.Activity activity) {
        this.zzm.zzb();
        this.zzn.zzb(context, view);
        zzm();
        com.google.android.gms.internal.ads.zzfxj zzb2 = this.zzf.zzb();
        if (zzb2 == null) {
            return "";
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String zzb3 = zzb2.zzb(context, null, view, activity);
        this.zzh.zzd(5002, java.lang.System.currentTimeMillis() - currentTimeMillis, zzb3, null);
        return zzb3;
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final java.lang.String zzk(android.content.Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzbak
    public final java.lang.String zzl(android.content.Context context) {
        this.zzm.zzb();
        this.zzn.zza();
        zzm();
        com.google.android.gms.internal.ads.zzfxj zzb2 = this.zzf.zzb();
        if (zzb2 == null) {
            return "";
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String zza = zzb2.zza(context, null);
        this.zzh.zzd(5001, java.lang.System.currentTimeMillis() - currentTimeMillis, zza, null);
        return zza;
    }

    public final void zzm() {
        if (this.zzq) {
            return;
        }
        synchronized (this.zzp) {
            if (!this.zzq) {
                if ((java.lang.System.currentTimeMillis() / 1000) - this.zza < 3600) {
                    return;
                }
                com.google.android.gms.internal.ads.zzfyp zzc = this.zzf.zzc();
                if ((zzc == null || zzc.zze(3600L)) && com.google.android.gms.internal.ads.zzfyd.zza(this.zzj)) {
                    this.zzi.execute(new com.google.android.gms.internal.ads.zzbag(this));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x009d, code lost:
    
        if (r3.zza().zzb().equals(r5.zzb()) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ void zzn() {
        java.lang.String str;
        java.lang.String str2;
        int length;
        boolean zza;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.google.android.gms.internal.ads.zzfyp zzt = zzt(1);
        if (zzt != null) {
            java.lang.String zza2 = zzt.zza().zza();
            str2 = zzt.zza().zzb();
            str = zza2;
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                android.content.Context context = this.zzc;
                com.google.android.gms.internal.ads.zzbds zzbdsVar = this.zzj;
                com.google.android.gms.internal.ads.zzfxg zzfxgVar = this.zzh;
                com.google.android.gms.internal.ads.zzfyu zza3 = com.google.android.gms.internal.ads.zzfxp.zza(context, 1, zzbdsVar, str, str2, "1", zzfxgVar);
                byte[] bArr = zza3.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzfxgVar.zzb(com.ironsource.mediationsdk.utils.IronSourceConstants.errorCode_adClosed, java.lang.System.currentTimeMillis() - currentTimeMillis);
                } else {
                    try {
                        com.google.android.gms.internal.ads.zzbdu zzd = com.google.android.gms.internal.ads.zzbdu.zzd(com.google.android.gms.internal.ads.zzida.zzt(bArr, 0, length), com.google.android.gms.internal.ads.zzido.zza());
                        if (!zzd.zza().zza().isEmpty()) {
                            if (!zzd.zza().zzb().isEmpty()) {
                                if (zzd.zzc().zzA().length != 0) {
                                    com.google.android.gms.internal.ads.zzfyp zzt2 = zzt(1);
                                    if (zzt2 != null) {
                                        com.google.android.gms.internal.ads.zzbeb zza4 = zzt2.zza();
                                        if (zza4 != null) {
                                            if (zzd.zza().zza().equals(zza4.zza())) {
                                            }
                                        }
                                    }
                                    com.google.android.gms.internal.ads.zzfyw zzfywVar = this.zzk;
                                    int i = zza3.zzc;
                                    if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdj)).booleanValue()) {
                                        zza = this.zzd.zza(zzd, zzfywVar);
                                    } else if (i == 3) {
                                        zza = this.zze.zzb(zzd);
                                    } else {
                                        if (i == 4) {
                                            zza = this.zze.zza(zzd, zzfywVar);
                                        }
                                        this.zzh.zzb(4009, java.lang.System.currentTimeMillis() - currentTimeMillis);
                                    }
                                    if (zza) {
                                        com.google.android.gms.internal.ads.zzfyp zzt3 = zzt(1);
                                        if (zzt3 != null) {
                                            if (this.zzf.zza(zzt3)) {
                                                this.zzr = true;
                                            }
                                            this.zza = java.lang.System.currentTimeMillis() / 1000;
                                        }
                                    }
                                    this.zzh.zzb(4009, java.lang.System.currentTimeMillis() - currentTimeMillis);
                                }
                            }
                        }
                        this.zzh.zzb(com.ironsource.mediationsdk.utils.IronSourceConstants.errorCode_destroy, java.lang.System.currentTimeMillis() - currentTimeMillis);
                    } catch (java.lang.NullPointerException unused) {
                        this.zzh.zzb(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, java.lang.System.currentTimeMillis() - currentTimeMillis);
                    }
                }
            } catch (com.google.android.gms.internal.ads.zziet e) {
                this.zzh.zzc(4002, java.lang.System.currentTimeMillis() - currentTimeMillis, e);
            }
        } finally {
            this.zzl.countDown();
        }
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfxg zzo() {
        return this.zzh;
    }

    final /* synthetic */ java.lang.Object zzp() {
        return this.zzp;
    }

    final /* synthetic */ boolean zzq() {
        return this.zzq;
    }

    final /* synthetic */ void zzr(boolean z) {
        this.zzq = z;
    }
}
