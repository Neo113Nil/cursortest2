package com.google.mlkit.vision.barcode.internal;

/* loaded from: classes9.dex */
public final class zzg {
    private final com.google.mlkit.vision.barcode.internal.zzi zza;
    private final com.google.mlkit.common.sdkinternal.ExecutorSelector zzb;
    private final com.google.mlkit.common.sdkinternal.MlKitContext zzc;

    public final com.google.mlkit.vision.barcode.internal.zzh zza() {
        com.google.mlkit.vision.barcode.BarcodeScannerOptions barcodeScannerOptions;
        barcodeScannerOptions = com.google.mlkit.vision.barcode.internal.zzh.zzd;
        return zzb(barcodeScannerOptions);
    }

    public final com.google.mlkit.vision.barcode.internal.zzh zzb(com.google.mlkit.vision.barcode.BarcodeScannerOptions barcodeScannerOptions) {
        return new com.google.mlkit.vision.barcode.internal.zzh(barcodeScannerOptions, (com.google.mlkit.vision.barcode.internal.zzl) this.zza.get(barcodeScannerOptions), this.zzb.getExecutorToUse(barcodeScannerOptions.zzc()), com.google.android.gms.internal.mlkit_vision_barcode.zzxa.zzb(com.google.mlkit.vision.barcode.internal.zzb.zzd()), this.zzc);
    }

    zzg(com.google.mlkit.vision.barcode.internal.zzi zziVar, com.google.mlkit.common.sdkinternal.ExecutorSelector executorSelector, com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext) {
        this.zza = zziVar;
        this.zzb = executorSelector;
        this.zzc = mlKitContext;
    }
}
