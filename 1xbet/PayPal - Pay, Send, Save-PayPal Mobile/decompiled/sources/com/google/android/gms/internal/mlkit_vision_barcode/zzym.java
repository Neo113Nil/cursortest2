package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzym extends com.google.android.gms.internal.mlkit_vision_barcode.zza implements com.google.android.gms.internal.mlkit_vision_barcode.zzyo {
    zzym(android.os.IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzyo
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzyl zzd(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.mlkit_vision_barcode.zzyd zzydVar) throws android.os.RemoteException {
        com.google.android.gms.internal.mlkit_vision_barcode.zzyl zzylVar;
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.mlkit_vision_barcode.zzc.zzb(zza, iObjectWrapper);
        com.google.android.gms.internal.mlkit_vision_barcode.zzc.zza(zza, zzydVar);
        android.os.Parcel zzb = zzb(1, zza);
        android.os.IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzylVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            zzylVar = queryLocalInterface instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzyl ? (com.google.android.gms.internal.mlkit_vision_barcode.zzyl) queryLocalInterface : new com.google.android.gms.internal.mlkit_vision_barcode.zzyl(readStrongBinder);
        }
        zzb.recycle();
        return zzylVar;
    }
}
