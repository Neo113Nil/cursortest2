package com.google.mlkit.vision.barcode;

/* loaded from: classes9.dex */
public class BarcodeScanning {
    public static com.google.mlkit.vision.barcode.BarcodeScanner getClient() {
        return ((com.google.mlkit.vision.barcode.internal.zzg) com.google.mlkit.common.sdkinternal.MlKitContext.getInstance().get(com.google.mlkit.vision.barcode.internal.zzg.class)).zza();
    }

    public static com.google.mlkit.vision.barcode.BarcodeScanner getClient(com.google.mlkit.vision.barcode.BarcodeScannerOptions barcodeScannerOptions) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(barcodeScannerOptions, "You must provide a valid BarcodeScannerOptions.");
        return ((com.google.mlkit.vision.barcode.internal.zzg) com.google.mlkit.common.sdkinternal.MlKitContext.getInstance().get(com.google.mlkit.vision.barcode.internal.zzg.class)).zzb(barcodeScannerOptions);
    }

    private BarcodeScanning() {
    }
}
