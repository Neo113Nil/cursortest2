package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzxk {
    private static final com.google.android.gms.common.internal.GmsLogger zzf = new com.google.android.gms.common.internal.GmsLogger("AutoZoom");
    final com.google.android.gms.internal.mlkit_vision_barcode.zzxm zza;
    final com.google.android.gms.internal.mlkit_vision_barcode.zzbw zzb;

    @javax.annotation.Nullable
    java.util.concurrent.ScheduledFuture zzc;

    @javax.annotation.Nullable
    java.lang.String zzd;
    int zze;
    private final java.util.concurrent.atomic.AtomicBoolean zzg;
    private final java.lang.Object zzh;
    private final java.util.concurrent.ScheduledExecutorService zzi;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzbb zzj;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzwp zzk;
    private final java.lang.String zzl;
    private java.util.concurrent.Executor zzm;
    private float zzn;
    private float zzo;
    private long zzp;
    private long zzq;
    private boolean zzr;
    private com.google.mlkit.vision.barcode.internal.zze zzs;

    private zzxk(android.content.Context context, com.google.android.gms.internal.mlkit_vision_barcode.zzxm zzxmVar, java.lang.String str) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzg.zza();
        java.util.concurrent.ScheduledExecutorService unconfigurableScheduledExecutorService = java.util.concurrent.Executors.unconfigurableScheduledExecutorService(java.util.concurrent.Executors.newScheduledThreadPool(2));
        com.google.android.gms.internal.mlkit_vision_barcode.zzbb zza = com.google.android.gms.internal.mlkit_vision_barcode.zzar.zza();
        com.google.android.gms.internal.mlkit_vision_barcode.zzwp zzwpVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzwp(context, new com.google.mlkit.common.sdkinternal.SharedPrefManager(context), new com.google.android.gms.internal.mlkit_vision_barcode.zzwi(context, com.google.android.gms.internal.mlkit_vision_barcode.zzwh.zzd("scanner-auto-zoom").zzd()), "scanner-auto-zoom");
        this.zzh = new java.lang.Object();
        this.zza = zzxmVar;
        this.zzg = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.zzb = com.google.android.gms.internal.mlkit_vision_barcode.zzbw.zzz();
        this.zzi = unconfigurableScheduledExecutorService;
        this.zzj = zza;
        this.zzk = zzwpVar;
        this.zzl = str;
        this.zze = 1;
        this.zzn = 1.0f;
        this.zzo = -1.0f;
        this.zzp = zza.zza();
    }

    public static com.google.android.gms.internal.mlkit_vision_barcode.zzxk zzd(android.content.Context context, java.lang.String str) {
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzxk(context, com.google.android.gms.internal.mlkit_vision_barcode.zzxm.zza, str);
    }

    public static /* synthetic */ void zzf(com.google.android.gms.internal.mlkit_vision_barcode.zzxk zzxkVar) {
        java.util.concurrent.ScheduledFuture scheduledFuture;
        synchronized (zzxkVar.zzh) {
            if (zzxkVar.zze == 2 && !zzxkVar.zzg.get() && (scheduledFuture = zzxkVar.zzc) != null && !scheduledFuture.isCancelled()) {
                if (zzxkVar.zzn > 1.0f && zzxkVar.zza() >= zzxkVar.zza.zzi()) {
                    zzf.i("AutoZoom", "Reset zoom = 1");
                    zzxkVar.zzl(1.0f, com.google.android.gms.internal.mlkit_vision_barcode.zzrc.SCANNER_AUTO_ZOOM_AUTO_RESET, null);
                }
            }
        }
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.mlkit_vision_barcode.zzxk zzxkVar, float f) {
        synchronized (zzxkVar.zzh) {
            zzxkVar.zzn = f;
            zzxkVar.zzr(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzq(com.google.android.gms.internal.mlkit_vision_barcode.zzrc zzrcVar, float f, float f2, @javax.annotation.Nullable com.google.android.gms.internal.mlkit_vision_barcode.zzxn zzxnVar) {
        long convert;
        if (this.zzd != null) {
            com.google.android.gms.internal.mlkit_vision_barcode.zzuo zzuoVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzuo();
            zzuoVar.zza(this.zzl);
            java.lang.String str = this.zzd;
            str.getClass();
            zzuoVar.zze(str);
            zzuoVar.zzf(java.lang.Float.valueOf(f));
            zzuoVar.zzc(java.lang.Float.valueOf(f2));
            synchronized (this.zzh) {
                convert = java.util.concurrent.TimeUnit.MILLISECONDS.convert(this.zzj.zza() - this.zzq, java.util.concurrent.TimeUnit.NANOSECONDS);
            }
            zzuoVar.zzb(java.lang.Long.valueOf(convert));
            if (zzxnVar != null) {
                com.google.android.gms.internal.mlkit_vision_barcode.zzup zzupVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzup();
                zzupVar.zzc(java.lang.Float.valueOf(zzxnVar.zzc()));
                zzupVar.zze(java.lang.Float.valueOf(zzxnVar.zze()));
                zzupVar.zzb(java.lang.Float.valueOf(zzxnVar.zzb()));
                zzupVar.zzd(java.lang.Float.valueOf(zzxnVar.zzd()));
                zzupVar.zza(java.lang.Float.valueOf(0.0f));
                zzuoVar.zzd(zzupVar.zzf());
            }
            com.google.android.gms.internal.mlkit_vision_barcode.zzwp zzwpVar = this.zzk;
            com.google.android.gms.internal.mlkit_vision_barcode.zzrd zzrdVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzrd();
            zzrdVar.zzi(zzuoVar.zzh());
            zzwpVar.zzd(com.google.android.gms.internal.mlkit_vision_barcode.zzws.zzf(zzrdVar), zzrcVar);
        }
    }

    private final void zzr(boolean z) {
        java.util.concurrent.ScheduledFuture scheduledFuture;
        synchronized (this.zzh) {
            this.zzb.zzs();
            this.zzp = this.zzj.zza();
            if (z && (scheduledFuture = this.zzc) != null) {
                scheduledFuture.cancel(false);
                this.zzc = null;
            }
        }
    }

    public final long zza() {
        long convert;
        synchronized (this.zzh) {
            convert = java.util.concurrent.TimeUnit.MILLISECONDS.convert(this.zzj.zza() - this.zzp, java.util.concurrent.TimeUnit.NANOSECONDS);
        }
        return convert;
    }

    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzet zzc(float f) throws java.lang.Exception {
        com.google.mlkit.vision.barcode.internal.zze zzeVar = this.zzs;
        float zzp = zzp(f);
        com.google.mlkit.vision.barcode.ZoomSuggestionOptions zoomSuggestionOptions = zzeVar.zza;
        int i = com.google.mlkit.vision.barcode.internal.zzh.zzc;
        if (true != zoomSuggestionOptions.zzb().setZoom(zzp)) {
            zzp = 0.0f;
        }
        return com.google.android.gms.internal.mlkit_vision_barcode.zzej.zza(java.lang.Float.valueOf(zzp));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(int i, com.google.android.gms.internal.mlkit_vision_barcode.zzxn zzxnVar) {
        float f;
        synchronized (this.zzh) {
            if (this.zze != 2) {
                return;
            }
            if (zzxnVar.zzh() && (!this.zza.zzl() || this.zza.zzb() <= 0.0f)) {
                if (!this.zzr) {
                    com.google.android.gms.internal.mlkit_vision_barcode.zzrc zzrcVar = com.google.android.gms.internal.mlkit_vision_barcode.zzrc.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                    float f2 = this.zzn;
                    zzq(zzrcVar, f2, f2, zzxnVar);
                    this.zzr = true;
                }
                com.google.android.gms.common.internal.GmsLogger gmsLogger = zzf;
                java.util.Locale locale = java.util.Locale.getDefault();
                float zzc = zzxnVar.zzc();
                float zze = zzxnVar.zze();
                float zzb = zzxnVar.zzb();
                float zzd = zzxnVar.zzd();
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
                gmsLogger.i("AutoZoom", java.lang.String.format(locale, "Process PredictedArea: [%.2f, %.2f, %.2f, %.2f, %.2f], frameIndex = %d", java.lang.Float.valueOf(zzc), java.lang.Float.valueOf(zze), java.lang.Float.valueOf(zzb), java.lang.Float.valueOf(zzd), java.lang.Float.valueOf(0.0f), valueOf));
                this.zzb.zzt(valueOf, zzxnVar);
                java.util.Set zzw = this.zzb.zzw();
                if (zzw.size() - 1 > this.zza.zzh()) {
                    java.util.Iterator it = zzw.iterator();
                    int i2 = i;
                    while (it.hasNext()) {
                        int intValue = ((java.lang.Integer) it.next()).intValue();
                        if (i2 > intValue) {
                            i2 = intValue;
                        }
                    }
                    zzf.i("AutoZoom", "Removing recent frameIndex = " + i2);
                    this.zzb.zzf(java.lang.Integer.valueOf(i2));
                }
                java.util.HashSet hashSet = new java.util.HashSet();
                for (java.util.Map.Entry entry : this.zzb.zzu()) {
                    if (((java.lang.Integer) entry.getKey()).intValue() != i) {
                        com.google.android.gms.internal.mlkit_vision_barcode.zzxn zzxnVar2 = (com.google.android.gms.internal.mlkit_vision_barcode.zzxn) entry.getValue();
                        if (zzxnVar2.zzh() && zzxnVar.zzh()) {
                            com.google.android.gms.internal.mlkit_vision_barcode.zzxg zzxgVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzxg(java.lang.Math.max(zzxnVar2.zzc(), zzxnVar.zzc()), java.lang.Math.max(zzxnVar2.zze(), zzxnVar.zze()), java.lang.Math.min(zzxnVar2.zzb(), zzxnVar.zzb()), java.lang.Math.min(zzxnVar2.zzd(), zzxnVar.zzd()), 0.0f);
                            f = zzxgVar.zzf() / ((zzxnVar2.zzf() + zzxnVar.zzf()) - zzxgVar.zzf());
                            if (f < this.zza.zzd()) {
                                hashSet.add((java.lang.Integer) entry.getKey());
                            }
                        }
                        f = 0.0f;
                        if (f < this.zza.zzd()) {
                        }
                    }
                }
                if (hashSet.size() >= this.zza.zzg() || (this.zza.zzl() && this.zza.zza() <= 0.0f)) {
                    synchronized (this.zzh) {
                        if (zza() >= this.zza.zzj()) {
                            com.google.android.gms.internal.mlkit_vision_barcode.zzdv listIterator = com.google.android.gms.internal.mlkit_vision_barcode.zzcs.zzi(java.lang.Float.valueOf(zzxnVar.zzc()), java.lang.Float.valueOf(zzxnVar.zze()), java.lang.Float.valueOf(zzxnVar.zzb()), java.lang.Float.valueOf(zzxnVar.zzd())).listIterator(0);
                            float f3 = 1.0E9f;
                            while (listIterator.hasNext()) {
                                float zzc2 = (this.zza.zzc() / 2.0f) / java.lang.Math.max(java.lang.Math.abs(((java.lang.Float) listIterator.next()).floatValue() - 0.5f), 0.001f);
                                if (f3 > zzc2) {
                                    f3 = zzc2;
                                }
                            }
                            float zzp = zzp(this.zzn * f3);
                            if (this.zza.zzk()) {
                                float f4 = this.zzn;
                                float f5 = (zzp - f4) / f4;
                                if (f5 <= this.zza.zze() && f5 >= (-this.zza.zzf())) {
                                    zzf.i("AutoZoom", "Auto zoom to " + zzp + " is filtered by threshold");
                                    this.zzp = this.zzj.zza();
                                }
                            }
                            zzf.i("AutoZoom", "Going to set zoom = " + zzp);
                            zzl(zzp, com.google.android.gms.internal.mlkit_vision_barcode.zzrc.SCANNER_AUTO_ZOOM_AUTO_ZOOM, zzxnVar);
                        }
                    }
                }
            }
        }
    }

    public final void zzj() {
        synchronized (this.zzh) {
            if (this.zze == 4) {
                return;
            }
            zzn(false);
            this.zzi.shutdown();
            this.zze = 4;
        }
    }

    public final void zzk(float f) {
        synchronized (this.zzh) {
            com.google.android.gms.internal.mlkit_vision_barcode.zzaz.zzd(f >= 1.0f);
            this.zzo = f;
        }
    }

    final void zzl(float f, com.google.android.gms.internal.mlkit_vision_barcode.zzrc zzrcVar, @javax.annotation.Nullable com.google.android.gms.internal.mlkit_vision_barcode.zzxn zzxnVar) {
        synchronized (this.zzh) {
            if (this.zzm != null && this.zzs != null && this.zze == 2) {
                if (this.zzg.compareAndSet(false, true)) {
                    com.google.android.gms.internal.mlkit_vision_barcode.zzej.zzb(com.google.android.gms.internal.mlkit_vision_barcode.zzej.zzc(new com.google.android.gms.internal.mlkit_vision_barcode.zzxh(this, f), this.zzm), new com.google.android.gms.internal.mlkit_vision_barcode.zzxj(this, zzrcVar, this.zzn, zzxnVar, f), com.google.android.gms.internal.mlkit_vision_barcode.zzeu.zza());
                }
            }
        }
    }

    public final void zzm() {
        synchronized (this.zzh) {
            int i = this.zze;
            if (i != 2 && i != 4) {
                zzr(true);
                this.zzc = this.zzi.scheduleWithFixedDelay(new java.lang.Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzxi
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.internal.mlkit_vision_barcode.zzxk.zzf(com.google.android.gms.internal.mlkit_vision_barcode.zzxk.this);
                    }
                }, 500L, 500L, java.util.concurrent.TimeUnit.MILLISECONDS);
                if (this.zze == 1) {
                    this.zzd = java.util.UUID.randomUUID().toString();
                    this.zzq = this.zzj.zza();
                    this.zzr = false;
                    com.google.android.gms.internal.mlkit_vision_barcode.zzrc zzrcVar = com.google.android.gms.internal.mlkit_vision_barcode.zzrc.SCANNER_AUTO_ZOOM_START;
                    float f = this.zzn;
                    zzq(zzrcVar, f, f, null);
                } else {
                    com.google.android.gms.internal.mlkit_vision_barcode.zzrc zzrcVar2 = com.google.android.gms.internal.mlkit_vision_barcode.zzrc.SCANNER_AUTO_ZOOM_RESUME;
                    float f2 = this.zzn;
                    zzq(zzrcVar2, f2, f2, null);
                }
                this.zze = 2;
            }
        }
    }

    public final void zzn(boolean z) {
        synchronized (this.zzh) {
            int i = this.zze;
            if (i != 1 && i != 4) {
                zzr(true);
                if (z) {
                    if (!this.zzr) {
                        com.google.android.gms.internal.mlkit_vision_barcode.zzrc zzrcVar = com.google.android.gms.internal.mlkit_vision_barcode.zzrc.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                        float f = this.zzn;
                        zzq(zzrcVar, f, f, null);
                    }
                    com.google.android.gms.internal.mlkit_vision_barcode.zzrc zzrcVar2 = com.google.android.gms.internal.mlkit_vision_barcode.zzrc.SCANNER_AUTO_ZOOM_SCAN_SUCCESS;
                    float f2 = this.zzn;
                    zzq(zzrcVar2, f2, f2, null);
                } else {
                    com.google.android.gms.internal.mlkit_vision_barcode.zzrc zzrcVar3 = com.google.android.gms.internal.mlkit_vision_barcode.zzrc.SCANNER_AUTO_ZOOM_SCAN_FAILED;
                    float f3 = this.zzn;
                    zzq(zzrcVar3, f3, f3, null);
                }
                this.zzr = false;
                this.zze = 1;
                this.zzd = null;
            }
        }
    }

    public final void zzo(com.google.mlkit.vision.barcode.internal.zze zzeVar, java.util.concurrent.Executor executor) {
        this.zzs = zzeVar;
        this.zzm = executor;
    }

    private final float zzp(float f) {
        float f2 = this.zzo;
        if (f < 1.0f) {
            f = 1.0f;
        }
        return (f2 <= 0.0f || f <= f2) ? f : f2;
    }
}
