package com.google.mlkit.vision.barcode.internal;

/* loaded from: classes9.dex */
final class zzq implements com.google.mlkit.vision.barcode.internal.zzm {
    private boolean zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzah zzc;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzwp zzd;
    private com.google.android.gms.internal.mlkit_vision_barcode.zzaj zze;

    zzq(android.content.Context context, com.google.mlkit.vision.barcode.BarcodeScannerOptions barcodeScannerOptions, com.google.android.gms.internal.mlkit_vision_barcode.zzwp zzwpVar) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzah zzahVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzah();
        this.zzc = zzahVar;
        this.zzb = context;
        zzahVar.zza = barcodeScannerOptions.zza();
        this.zzd = zzwpVar;
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final java.util.List zza(com.google.mlkit.vision.common.InputImage inputImage) throws com.google.mlkit.common.MlKitException {
        com.google.android.gms.internal.mlkit_vision_barcode.zzu[] zzf;
        if (this.zze == null) {
            zzc();
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzaj zzajVar = this.zze;
        if (zzajVar == null) {
            throw new com.google.mlkit.common.MlKitException("Error initializing the legacy barcode scanner.", 14);
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzaj zzajVar2 = (com.google.android.gms.internal.mlkit_vision_barcode.zzaj) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzajVar);
        com.google.android.gms.internal.mlkit_vision_barcode.zzan zzanVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzan(inputImage.getWidth(), inputImage.getHeight(), 0, 0L, com.google.mlkit.vision.common.internal.CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees()));
        try {
            int format = inputImage.getFormat();
            if (format == -1) {
                zzf = zzajVar2.zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(inputImage.getBitmapInternal()), zzanVar);
            } else if (format == 17) {
                zzf = zzajVar2.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(inputImage.getByteBuffer()), zzanVar);
            } else if (format == 35) {
                android.media.Image.Plane[] planeArr = (android.media.Image.Plane[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(inputImage.getPlanes());
                zzanVar.zza = planeArr[0].getRowStride();
                zzf = zzajVar2.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(planeArr[0].getBuffer()), zzanVar);
            } else {
                if (format != 842094169) {
                    int format2 = inputImage.getFormat();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported image format: ");
                    sb.append(format2);
                    throw new com.google.mlkit.common.MlKitException(sb.toString(), 3);
                }
                zzf = zzajVar2.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(com.google.mlkit.vision.common.internal.ImageConvertUtils.getInstance().convertToNv21Buffer(inputImage, false)), zzanVar);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.google.android.gms.internal.mlkit_vision_barcode.zzu zzuVar : zzf) {
                arrayList.add(new com.google.mlkit.vision.barcode.common.Barcode(new com.google.mlkit.vision.barcode.internal.zzp(zzuVar), inputImage.getCoordinatesMatrix()));
            }
            return arrayList;
        } catch (android.os.RemoteException e) {
            throw new com.google.mlkit.common.MlKitException("Failed to detect with legacy barcode detector", 13, e);
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final void zzb() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzaj zzajVar = this.zze;
        if (zzajVar != null) {
            try {
                zzajVar.zzd();
            } catch (android.os.RemoteException unused) {
            }
            this.zze = null;
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final boolean zzc() throws com.google.mlkit.common.MlKitException {
        if (this.zze != null) {
            return false;
        }
        try {
            com.google.android.gms.internal.mlkit_vision_barcode.zzaj zzd = com.google.android.gms.internal.mlkit_vision_barcode.zzal.zza(com.google.android.gms.dynamite.DynamiteModule.load(this.zzb, com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE, com.google.mlkit.common.sdkinternal.OptionalModuleUtils.DEPRECATED_DYNAMITE_MODULE_ID).instantiate("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).zzd(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzb), this.zzc);
            this.zze = zzd;
            if (zzd == null && !this.zza) {
                com.google.mlkit.common.sdkinternal.OptionalModuleUtils.requestDownload(this.zzb, com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE);
                this.zza = true;
                com.google.mlkit.vision.barcode.internal.zzb.zze(this.zzd, com.google.android.gms.internal.mlkit_vision_barcode.zzrb.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new com.google.mlkit.common.MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            com.google.mlkit.vision.barcode.internal.zzb.zze(this.zzd, com.google.android.gms.internal.mlkit_vision_barcode.zzrb.NO_ERROR);
            return false;
        } catch (android.os.RemoteException e) {
            throw new com.google.mlkit.common.MlKitException("Failed to create legacy barcode detector.", 13, e);
        } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e2) {
            throw new com.google.mlkit.common.MlKitException("Failed to load deprecated vision dynamite module.", 13, e2);
        }
    }
}
