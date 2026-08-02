package com.google.mlkit.vision.barcode.internal;

/* loaded from: classes9.dex */
public final class zzi extends com.google.mlkit.common.sdkinternal.LazyInstanceMap {
    private final com.google.mlkit.common.sdkinternal.MlKitContext zza;

    public zzi(com.google.mlkit.common.sdkinternal.MlKitContext mlKitContext) {
        this.zza = mlKitContext;
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final /* synthetic */ java.lang.Object create(java.lang.Object obj) {
        com.google.mlkit.vision.barcode.BarcodeScannerOptions barcodeScannerOptions = (com.google.mlkit.vision.barcode.BarcodeScannerOptions) obj;
        android.content.Context applicationContext = this.zza.getApplicationContext();
        com.google.android.gms.internal.mlkit_vision_barcode.zzwp zzb = com.google.android.gms.internal.mlkit_vision_barcode.zzxa.zzb(com.google.mlkit.vision.barcode.internal.zzb.zzd());
        return new com.google.mlkit.vision.barcode.internal.zzl(this.zza, barcodeScannerOptions, (com.google.mlkit.vision.barcode.internal.zzo.zzd(applicationContext) || com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getApkVersion(applicationContext) >= 204500000) ? new com.google.mlkit.vision.barcode.internal.zzo(applicationContext, barcodeScannerOptions, zzb) : new com.google.mlkit.vision.barcode.internal.zzq(applicationContext, barcodeScannerOptions, zzb), zzb);
    }
}
