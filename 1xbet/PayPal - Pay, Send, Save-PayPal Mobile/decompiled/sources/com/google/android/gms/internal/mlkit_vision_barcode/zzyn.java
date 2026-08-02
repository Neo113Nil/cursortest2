package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public abstract class zzyn extends com.google.android.gms.internal.mlkit_vision_barcode.zzb implements com.google.android.gms.internal.mlkit_vision_barcode.zzyo {
    public static com.google.android.gms.internal.mlkit_vision_barcode.zzyo zza(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        return queryLocalInterface instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzyo ? (com.google.android.gms.internal.mlkit_vision_barcode.zzyo) queryLocalInterface : new com.google.android.gms.internal.mlkit_vision_barcode.zzym(iBinder);
    }
}
