package com.google.mlkit.vision.barcode.internal;

/* loaded from: classes9.dex */
public final class zzl extends com.google.mlkit.common.sdkinternal.MLTask {
    private final com.google.mlkit.vision.barcode.BarcodeScannerOptions zzc;
    private final com.google.mlkit.vision.barcode.internal.zzm zzd;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzwp zze;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzwr zzf;
    private final com.google.mlkit.vision.common.internal.BitmapInStreamingChecker zzg = new com.google.mlkit.vision.common.internal.BitmapInStreamingChecker();
    private boolean zzh;
    private static final com.google.mlkit.vision.common.internal.ImageUtils zzb = com.google.mlkit.vision.common.internal.ImageUtils.getInstance();
    static boolean zza = true;

    public zzl(com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext, com.google.mlkit.vision.barcode.BarcodeScannerOptions barcodeScannerOptions, com.google.mlkit.vision.barcode.internal.zzm zzmVar, com.google.android.gms.internal.mlkit_vision_barcode.zzwp zzwpVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(mlKitContext, "MlKitContext can not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(barcodeScannerOptions, "BarcodeScannerOptions can not be null");
        this.zzc = barcodeScannerOptions;
        this.zzd = zzmVar;
        this.zze = zzwpVar;
        this.zzf = com.google.android.gms.internal.mlkit_vision_barcode.zzwr.zza(mlKitContext.getApplicationContext());
    }

    private final void zzf(final com.google.android.gms.internal.mlkit_vision_barcode.zzrb zzrbVar, long j, final com.google.mlkit.vision.common.InputImage inputImage, java.util.List list) {
        final com.google.android.gms.internal.mlkit_vision_barcode.zzcp zzcpVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzcp();
        final com.google.android.gms.internal.mlkit_vision_barcode.zzcp zzcpVar2 = new com.google.android.gms.internal.mlkit_vision_barcode.zzcp();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.mlkit.vision.barcode.common.Barcode barcode = (com.google.mlkit.vision.barcode.common.Barcode) it.next();
                zzcpVar.zzd(com.google.mlkit.vision.barcode.internal.zzb.zza(barcode.getFormat()));
                zzcpVar2.zzd(com.google.mlkit.vision.barcode.internal.zzb.zzb(barcode.getValueType()));
            }
        }
        final long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j;
        this.zze.zzf(new com.google.android.gms.internal.mlkit_vision_barcode.zzwo() { // from class: com.google.mlkit.vision.barcode.internal.zzj
            @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwo
            public final com.google.android.gms.internal.mlkit_vision_barcode.zzwe zza() {
                return com.google.mlkit.vision.barcode.internal.zzl.this.zzc(elapsedRealtime, zzrbVar, zzcpVar, zzcpVar2, inputImage);
            }
        }, com.google.android.gms.internal.mlkit_vision_barcode.zzrc.ON_DEVICE_BARCODE_DETECT);
        com.google.android.gms.internal.mlkit_vision_barcode.zzfr zzfrVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzfr();
        zzfrVar.zze(zzrbVar);
        zzfrVar.zzf(java.lang.Boolean.valueOf(zza));
        zzfrVar.zzg(com.google.mlkit.vision.barcode.internal.zzb.zzc(this.zzc));
        zzfrVar.zzc(zzcpVar.zzf());
        zzfrVar.zzd(zzcpVar2.zzf());
        final com.google.android.gms.internal.mlkit_vision_barcode.zzft zzh = zzfrVar.zzh();
        final com.google.mlkit.vision.barcode.internal.zzk zzkVar = new com.google.mlkit.vision.barcode.internal.zzk(this);
        final com.google.android.gms.internal.mlkit_vision_barcode.zzwp zzwpVar = this.zze;
        final com.google.android.gms.internal.mlkit_vision_barcode.zzrc zzrcVar = com.google.android.gms.internal.mlkit_vision_barcode.zzrc.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        com.google.mlkit.common.sdkinternal.MLTaskExecutor.workerThreadExecutor().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwn
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.mlkit_vision_barcode.zzwp.this.zzh(zzrcVar, zzh, elapsedRealtime, zzkVar);
            }
        });
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.zzf.zzc(true != this.zzh ? 24301 : 24302, zzrbVar.zza(), currentTimeMillis - elapsedRealtime, currentTimeMillis);
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final void load() throws com.google.mlkit.common.MlKitException {
        synchronized (this) {
            this.zzh = this.zzd.zzc();
        }
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final void release() {
        synchronized (this) {
            this.zzd.zzb();
            zza = true;
            com.google.android.gms.internal.mlkit_vision_barcode.zzrd zzrdVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzrd();
            com.google.android.gms.internal.mlkit_vision_barcode.zzra zzraVar = this.zzh ? com.google.android.gms.internal.mlkit_vision_barcode.zzra.TYPE_THICK : com.google.android.gms.internal.mlkit_vision_barcode.zzra.TYPE_THIN;
            com.google.android.gms.internal.mlkit_vision_barcode.zzwp zzwpVar = this.zze;
            zzrdVar.zze(zzraVar);
            com.google.android.gms.internal.mlkit_vision_barcode.zzrp zzrpVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzrp();
            zzrpVar.zzi(com.google.mlkit.vision.barcode.internal.zzb.zzc(this.zzc));
            zzrdVar.zzg(zzrpVar.zzj());
            zzwpVar.zzd(com.google.android.gms.internal.mlkit_vision_barcode.zzws.zzf(zzrdVar), com.google.android.gms.internal.mlkit_vision_barcode.zzrc.ON_DEVICE_BARCODE_CLOSE);
        }
    }

    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzwe zzc(long j, com.google.android.gms.internal.mlkit_vision_barcode.zzrb zzrbVar, com.google.android.gms.internal.mlkit_vision_barcode.zzcp zzcpVar, com.google.android.gms.internal.mlkit_vision_barcode.zzcp zzcpVar2, com.google.mlkit.vision.common.InputImage inputImage) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzrp zzrpVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzrp();
        com.google.android.gms.internal.mlkit_vision_barcode.zzqo zzqoVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzqo();
        zzqoVar.zzc(java.lang.Long.valueOf(j));
        zzqoVar.zzd(zzrbVar);
        zzqoVar.zze(java.lang.Boolean.valueOf(zza));
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        zzqoVar.zza(bool);
        zzqoVar.zzb(bool);
        zzrpVar.zzh(zzqoVar.zzf());
        zzrpVar.zzi(com.google.mlkit.vision.barcode.internal.zzb.zzc(this.zzc));
        zzrpVar.zze(zzcpVar.zzf());
        zzrpVar.zzf(zzcpVar2.zzf());
        int format = inputImage.getFormat();
        int mobileVisionImageSize = zzb.getMobileVisionImageSize(inputImage);
        com.google.android.gms.internal.mlkit_vision_barcode.zzqh zzqhVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzqh();
        zzqhVar.zza(format != -1 ? format != 35 ? format != 842094169 ? format != 16 ? format != 17 ? com.google.android.gms.internal.mlkit_vision_barcode.zzqi.UNKNOWN_FORMAT : com.google.android.gms.internal.mlkit_vision_barcode.zzqi.NV21 : com.google.android.gms.internal.mlkit_vision_barcode.zzqi.NV16 : com.google.android.gms.internal.mlkit_vision_barcode.zzqi.YV12 : com.google.android.gms.internal.mlkit_vision_barcode.zzqi.YUV_420_888 : com.google.android.gms.internal.mlkit_vision_barcode.zzqi.BITMAP);
        zzqhVar.zzb(java.lang.Integer.valueOf(mobileVisionImageSize));
        zzrpVar.zzg(zzqhVar.zzd());
        com.google.android.gms.internal.mlkit_vision_barcode.zzrd zzrdVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzrd();
        zzrdVar.zze(this.zzh ? com.google.android.gms.internal.mlkit_vision_barcode.zzra.TYPE_THICK : com.google.android.gms.internal.mlkit_vision_barcode.zzra.TYPE_THIN);
        zzrdVar.zzg(zzrpVar.zzj());
        return com.google.android.gms.internal.mlkit_vision_barcode.zzws.zzf(zzrdVar);
    }

    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzwe zzd(com.google.android.gms.internal.mlkit_vision_barcode.zzft zzftVar, int i, com.google.android.gms.internal.mlkit_vision_barcode.zzqd zzqdVar) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzrd zzrdVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzrd();
        zzrdVar.zze(this.zzh ? com.google.android.gms.internal.mlkit_vision_barcode.zzra.TYPE_THICK : com.google.android.gms.internal.mlkit_vision_barcode.zzra.TYPE_THIN);
        com.google.android.gms.internal.mlkit_vision_barcode.zzfq zzfqVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzfq();
        zzfqVar.zza(java.lang.Integer.valueOf(i));
        zzfqVar.zzc(zzftVar);
        zzfqVar.zzb(zzqdVar);
        zzrdVar.zzd(zzfqVar.zze());
        return com.google.android.gms.internal.mlkit_vision_barcode.zzws.zzf(zzrdVar);
    }

    @Override // com.google.mlkit.common.sdkinternal.MLTask
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final java.util.List run(com.google.mlkit.vision.common.InputImage inputImage) throws com.google.mlkit.common.MlKitException {
        java.util.List zza2;
        synchronized (this) {
            com.google.mlkit.vision.common.internal.BitmapInStreamingChecker bitmapInStreamingChecker = this.zzg;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            bitmapInStreamingChecker.check(inputImage);
            try {
                zza2 = this.zzd.zza(inputImage);
                zzf(com.google.android.gms.internal.mlkit_vision_barcode.zzrb.NO_ERROR, elapsedRealtime, inputImage, zza2);
                zza = false;
            } catch (com.google.mlkit.common.MlKitException e) {
                zzf(e.getErrorCode() == 14 ? com.google.android.gms.internal.mlkit_vision_barcode.zzrb.MODEL_NOT_DOWNLOADED : com.google.android.gms.internal.mlkit_vision_barcode.zzrb.UNKNOWN_ERROR, elapsedRealtime, inputImage, null);
                throw e;
            }
        }
        return zza2;
    }
}
