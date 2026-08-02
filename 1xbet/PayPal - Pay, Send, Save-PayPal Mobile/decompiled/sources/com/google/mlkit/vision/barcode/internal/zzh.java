package com.google.mlkit.vision.barcode.internal;

/* loaded from: classes9.dex */
public final class zzh extends com.google.mlkit.vision.common.internal.MobileVisionBase implements com.google.mlkit.vision.barcode.BarcodeScanner {
    public static final /* synthetic */ int zzc = 0;
    private static final com.google.mlkit.vision.barcode.BarcodeScannerOptions zzd = new com.google.mlkit.vision.barcode.BarcodeScannerOptions.Builder().build();

    @javax.annotation.Nullable
    final com.google.android.gms.internal.mlkit_vision_barcode.zzxk zzb;
    private final boolean zze;
    private final com.google.mlkit.vision.barcode.BarcodeScannerOptions zzf;
    private int zzg;
    private boolean zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzh(com.google.mlkit.vision.barcode.BarcodeScannerOptions barcodeScannerOptions, com.google.mlkit.vision.barcode.internal.zzl zzlVar, java.util.concurrent.Executor executor, com.google.android.gms.internal.mlkit_vision_barcode.zzwp zzwpVar, com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext) {
        super(zzlVar, executor);
        com.google.android.gms.internal.mlkit_vision_barcode.zzxk zzd2;
        com.google.mlkit.vision.barcode.ZoomSuggestionOptions zzb = barcodeScannerOptions.zzb();
        if (zzb == null) {
            zzd2 = null;
        } else {
            zzd2 = com.google.android.gms.internal.mlkit_vision_barcode.zzxk.zzd(mlKitContext.getApplicationContext(), mlKitContext.getApplicationContext().getPackageName());
            zzd2.zzo(new com.google.mlkit.vision.barcode.internal.zze(zzb), com.google.android.gms.internal.mlkit_vision_barcode.zzeu.zza());
            if (zzb.zza() >= 1.0f) {
                zzd2.zzk(zzb.zza());
            }
            zzd2.zzm();
        }
        this.zzf = barcodeScannerOptions;
        boolean zzf = com.google.mlkit.vision.barcode.internal.zzb.zzf();
        this.zze = zzf;
        com.google.android.gms.internal.mlkit_vision_barcode.zzrp zzrpVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzrp();
        zzrpVar.zzi(com.google.mlkit.vision.barcode.internal.zzb.zzc(barcodeScannerOptions));
        com.google.android.gms.internal.mlkit_vision_barcode.zzrr zzj = zzrpVar.zzj();
        com.google.android.gms.internal.mlkit_vision_barcode.zzrd zzrdVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzrd();
        zzrdVar.zze(zzf ? com.google.android.gms.internal.mlkit_vision_barcode.zzra.TYPE_THICK : com.google.android.gms.internal.mlkit_vision_barcode.zzra.TYPE_THIN);
        zzrdVar.zzg(zzj);
        zzwpVar.zzd(com.google.android.gms.internal.mlkit_vision_barcode.zzws.zzg(zzrdVar, 1), com.google.android.gms.internal.mlkit_vision_barcode.zzrc.ON_DEVICE_BARCODE_CREATE);
        this.zzb = zzd2;
    }

    private final com.google.android.gms.tasks.Task zzf(com.google.android.gms.tasks.Task task, final int i, final int i2) {
        return task.onSuccessTask(new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.mlkit.vision.barcode.internal.zzf
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                return com.google.mlkit.vision.barcode.internal.zzh.this.zzd(i, i2, (java.util.List) obj);
            }
        });
    }

    @Override // com.google.mlkit.vision.common.internal.MobileVisionBase, java.io.Closeable, java.lang.AutoCloseable, com.google.mlkit.vision.barcode.BarcodeScanner
    public final void close() {
        synchronized (this) {
            com.google.android.gms.internal.mlkit_vision_barcode.zzxk zzxkVar = this.zzb;
            if (zzxkVar != null) {
                zzxkVar.zzn(this.zzh);
                this.zzb.zzj();
            }
            super.close();
        }
    }

    @Override // com.google.mlkit.vision.interfaces.Detector
    public final int getDetectorType() {
        return 1;
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final com.google.android.gms.common.Feature[] getOptionalFeatures() {
        return this.zze ? com.google.mlkit.common.sdkinternal.OptionalModuleUtils.EMPTY_FEATURES : new com.google.android.gms.common.Feature[]{com.google.mlkit.common.sdkinternal.OptionalModuleUtils.FEATURE_BARCODE};
    }

    @Override // com.google.mlkit.vision.barcode.BarcodeScanner
    public final com.google.android.gms.tasks.Task<java.util.List<com.google.mlkit.vision.barcode.common.Barcode>> process(com.google.android.odml.image.MlImage mlImage) {
        return zzf(super.processBase(mlImage), mlImage.getWidth(), mlImage.getHeight());
    }

    final /* synthetic */ com.google.android.gms.tasks.Task zzd(int i, int i2, java.util.List list) throws java.lang.Exception {
        if (this.zzb == null) {
            return com.google.android.gms.tasks.Tasks.forResult(list);
        }
        this.zzg++;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.mlkit.vision.barcode.common.Barcode barcode = (com.google.mlkit.vision.barcode.common.Barcode) it.next();
            if (barcode.getFormat() == -1) {
                arrayList2.add(barcode);
            } else {
                arrayList.add(barcode);
            }
        }
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                android.graphics.Point[] cornerPoints = ((com.google.mlkit.vision.barcode.common.Barcode) arrayList2.get(i3)).getCornerPoints();
                if (cornerPoints != null) {
                    this.zzb.zzi(this.zzg, com.google.android.gms.internal.mlkit_vision_barcode.zzxn.zzg(java.util.Arrays.asList(cornerPoints), i, i2, 0.0f));
                }
            }
        } else {
            this.zzh = true;
        }
        if (true != this.zzf.zzd()) {
            list = arrayList;
        }
        return com.google.android.gms.tasks.Tasks.forResult(list);
    }

    @Override // com.google.mlkit.vision.barcode.BarcodeScanner
    public final com.google.android.gms.tasks.Task<java.util.List<com.google.mlkit.vision.barcode.common.Barcode>> process(com.google.mlkit.vision.common.InputImage inputImage) {
        return zzf(super.processBase(inputImage), inputImage.getWidth(), inputImage.getHeight());
    }
}
