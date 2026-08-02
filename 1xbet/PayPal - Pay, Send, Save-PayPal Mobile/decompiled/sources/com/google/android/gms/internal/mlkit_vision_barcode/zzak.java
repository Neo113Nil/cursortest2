package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzak extends com.google.android.gms.internal.mlkit_vision_barcode.zza implements com.google.android.gms.internal.mlkit_vision_barcode.zzam {
    zzak(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzam
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzaj zzd(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.mlkit_vision_barcode.zzah zzahVar) throws android.os.RemoteException {
        com.google.android.gms.internal.mlkit_vision_barcode.zzaj zzajVar;
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.mlkit_vision_barcode.zzc.zzb(zza, iObjectWrapper);
        com.google.android.gms.internal.mlkit_vision_barcode.zzc.zza(zza, zzahVar);
        android.os.Parcel zzb = zzb(1, zza);
        android.os.IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzajVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            zzajVar = queryLocalInterface instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzaj ? (com.google.android.gms.internal.mlkit_vision_barcode.zzaj) queryLocalInterface : new com.google.android.gms.internal.mlkit_vision_barcode.zzaj(readStrongBinder);
        }
        zzb.recycle();
        return zzajVar;
    }
}
