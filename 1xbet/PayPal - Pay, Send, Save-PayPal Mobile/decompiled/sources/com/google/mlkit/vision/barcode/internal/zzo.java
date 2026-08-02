package com.google.mlkit.vision.barcode.internal;

/* loaded from: classes9.dex */
final class zzo implements com.google.mlkit.vision.barcode.internal.zzm {
    private static final com.google.android.gms.internal.mlkit_vision_barcode.zzcs zza = com.google.android.gms.internal.mlkit_vision_barcode.zzcs.zzh(com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE_MODULE_ID, com.google.mlkit.common.sdkinternal.OptionalModuleUtils.TFLITE_DYNAMITE_MODULE_ID);
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private final android.content.Context zze;
    private final com.google.mlkit.vision.barcode.BarcodeScannerOptions zzf;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzwp zzg;
    private com.google.android.gms.internal.mlkit_vision_barcode.zzyl zzh;

    static boolean zzd(android.content.Context context) {
        return com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(context, "com.google.mlkit.dynamite.barcode") > 0;
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final java.util.List zza(com.google.mlkit.vision.common.InputImage inputImage) throws com.google.mlkit.common.MlKitException {
        if (this.zzh == null) {
            zzc();
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzyl zzylVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzyl) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzh);
        if (!this.zzb) {
            try {
                zzylVar.zze();
                this.zzb = true;
            } catch (android.os.RemoteException e) {
                throw new com.google.mlkit.common.MlKitException("Failed to init barcode scanner.", 13, e);
            }
        }
        int width = inputImage.getWidth();
        if (inputImage.getFormat() == 35) {
            width = ((android.media.Image.Plane[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(inputImage.getPlanes()))[0].getRowStride();
        }
        try {
            java.util.List zzd = zzylVar.zzd(com.google.mlkit.vision.common.internal.ImageUtils.getInstance().getImageDataWrapper(inputImage), new com.google.android.gms.internal.mlkit_vision_barcode.zzyu(inputImage.getFormat(), width, inputImage.getHeight(), com.google.mlkit.vision.common.internal.CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees()), android.os.SystemClock.elapsedRealtime()));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = zzd.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.google.mlkit.vision.barcode.common.Barcode(new com.google.mlkit.vision.barcode.internal.zzn((com.google.android.gms.internal.mlkit_vision_barcode.zzyb) it.next()), inputImage.getCoordinatesMatrix()));
            }
            return arrayList;
        } catch (android.os.RemoteException e2) {
            throw new com.google.mlkit.common.MlKitException("Failed to run barcode scanner.", 13, e2);
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final void zzb() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzyl zzylVar = this.zzh;
        if (zzylVar != null) {
            try {
                zzylVar.zzf();
            } catch (android.os.RemoteException unused) {
            }
            this.zzh = null;
            this.zzb = false;
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final boolean zzc() throws com.google.mlkit.common.MlKitException {
        if (this.zzh != null) {
            return this.zzc;
        }
        if (zzd(this.zze)) {
            this.zzc = true;
            try {
                this.zzh = zze(com.google.android.gms.dynamite.DynamiteModule.PREFER_LOCAL, "com.google.mlkit.dynamite.barcode", "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (android.os.RemoteException e) {
                throw new com.google.mlkit.common.MlKitException("Failed to create thick barcode scanner.", 13, e);
            } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e2) {
                throw new com.google.mlkit.common.MlKitException("Failed to load the bundled barcode module.", 13, e2);
            }
        } else {
            this.zzc = false;
            if (!com.google.mlkit.common.sdkinternal.OptionalModuleUtils.areAllRequiredModulesAvailable(this.zze, zza)) {
                if (!this.zzd) {
                    com.google.mlkit.common.sdkinternal.OptionalModuleUtils.requestDownload(this.zze, com.google.android.gms.internal.mlkit_vision_barcode.zzcs.zzh(com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE, com.google.mlkit.common.sdkinternal.OptionalModuleUtils.TFLITE_DYNAMITE));
                    this.zzd = true;
                }
                com.google.mlkit.vision.barcode.internal.zzb.zze(this.zzg, com.google.android.gms.internal.mlkit_vision_barcode.zzrb.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new com.google.mlkit.common.MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.zzh = zze(com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE, com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE_MODULE_ID, "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (android.os.RemoteException | com.google.android.gms.dynamite.DynamiteModule.LoadingException e3) {
                com.google.mlkit.vision.barcode.internal.zzb.zze(this.zzg, com.google.android.gms.internal.mlkit_vision_barcode.zzrb.OPTIONAL_MODULE_INIT_ERROR);
                throw new com.google.mlkit.common.MlKitException("Failed to create thin barcode scanner.", 13, e3);
            }
        }
        com.google.mlkit.vision.barcode.internal.zzb.zze(this.zzg, com.google.android.gms.internal.mlkit_vision_barcode.zzrb.NO_ERROR);
        return this.zzc;
    }

    final com.google.android.gms.internal.mlkit_vision_barcode.zzyl zze(com.google.android.gms.dynamite.DynamiteModule.VersionPolicy versionPolicy, java.lang.String str, java.lang.String str2) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException, android.os.RemoteException {
        com.google.android.gms.internal.mlkit_vision_barcode.zzyo zza2 = com.google.android.gms.internal.mlkit_vision_barcode.zzyn.zza(com.google.android.gms.dynamite.DynamiteModule.load(this.zze, versionPolicy, str).instantiate(str2));
        com.google.mlkit.vision.barcode.BarcodeScannerOptions barcodeScannerOptions = this.zzf;
        com.google.android.gms.dynamic.IObjectWrapper wrap = com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zze);
        int zza3 = barcodeScannerOptions.zza();
        boolean z = true;
        if (!barcodeScannerOptions.zzd() && this.zzf.zzb() == null) {
            z = false;
        }
        return zza2.zzd(wrap, new com.google.android.gms.internal.mlkit_vision_barcode.zzyd(zza3, z));
    }

    zzo(android.content.Context context, com.google.mlkit.vision.barcode.BarcodeScannerOptions barcodeScannerOptions, com.google.android.gms.internal.mlkit_vision_barcode.zzwp zzwpVar) {
        this.zze = context;
        this.zzf = barcodeScannerOptions;
        this.zzg = zzwpVar;
    }
}
