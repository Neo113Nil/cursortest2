package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzyl extends com.google.android.gms.internal.mlkit_vision_barcode.zza implements android.os.IInterface {
    zzyl(android.os.IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    public final java.util.List zzd(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.mlkit_vision_barcode.zzyu zzyuVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.mlkit_vision_barcode.zzc.zzb(zza, iObjectWrapper);
        com.google.android.gms.internal.mlkit_vision_barcode.zzc.zza(zza, zzyuVar);
        android.os.Parcel zzb = zzb(3, zza);
        java.util.ArrayList createTypedArrayList = zzb.createTypedArrayList(com.google.android.gms.internal.mlkit_vision_barcode.zzyb.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    public final void zze() throws android.os.RemoteException {
        zzc(1, zza());
    }

    public final void zzf() throws android.os.RemoteException {
        zzc(2, zza());
    }
}
