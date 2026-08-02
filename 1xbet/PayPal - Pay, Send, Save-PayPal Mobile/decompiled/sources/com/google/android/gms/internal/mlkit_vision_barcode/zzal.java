package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public abstract class zzal extends com.google.android.gms.internal.mlkit_vision_barcode.zzb implements com.google.android.gms.internal.mlkit_vision_barcode.zzam {
    public static com.google.android.gms.internal.mlkit_vision_barcode.zzam zza(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
        return queryLocalInterface instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzam ? (com.google.android.gms.internal.mlkit_vision_barcode.zzam) queryLocalInterface : new com.google.android.gms.internal.mlkit_vision_barcode.zzak(iBinder);
    }
}
