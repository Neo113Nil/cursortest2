package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public abstract class zzbv extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzbw {
    public zzbv() {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) com.google.android.gms.internal.maps.zzc.zza(parcel, android.graphics.Bitmap.CREATOR);
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            zzb(bitmap);
        } else {
            if (i != 2) {
                return false;
            }
            com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            zzc(asInterface);
        }
        parcel2.writeNoException();
        return true;
    }
}
