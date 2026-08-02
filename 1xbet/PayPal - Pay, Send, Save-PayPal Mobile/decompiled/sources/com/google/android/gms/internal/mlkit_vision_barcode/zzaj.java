package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzaj extends com.google.android.gms.internal.mlkit_vision_barcode.zza implements android.os.IInterface {
    zzaj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    public final void zzd() throws android.os.RemoteException {
        zzc(3, zza());
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzu[] zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.mlkit_vision_barcode.zzan zzanVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.mlkit_vision_barcode.zzc.zzb(zza, iObjectWrapper);
        com.google.android.gms.internal.mlkit_vision_barcode.zzc.zza(zza, zzanVar);
        android.os.Parcel zzb = zzb(1, zza);
        com.google.android.gms.internal.mlkit_vision_barcode.zzu[] zzuVarArr = (com.google.android.gms.internal.mlkit_vision_barcode.zzu[]) zzb.createTypedArray(com.google.android.gms.internal.mlkit_vision_barcode.zzu.CREATOR);
        zzb.recycle();
        return zzuVarArr;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzu[] zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.mlkit_vision_barcode.zzan zzanVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.mlkit_vision_barcode.zzc.zzb(zza, iObjectWrapper);
        com.google.android.gms.internal.mlkit_vision_barcode.zzc.zza(zza, zzanVar);
        android.os.Parcel zzb = zzb(2, zza);
        com.google.android.gms.internal.mlkit_vision_barcode.zzu[] zzuVarArr = (com.google.android.gms.internal.mlkit_vision_barcode.zzu[]) zzb.createTypedArray(com.google.android.gms.internal.mlkit_vision_barcode.zzu.CREATOR);
        zzb.recycle();
        return zzuVarArr;
    }
}
