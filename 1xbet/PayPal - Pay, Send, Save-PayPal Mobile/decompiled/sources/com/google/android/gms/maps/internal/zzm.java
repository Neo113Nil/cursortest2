package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public abstract class zzm extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzn {
    public zzm() {
        super("com.google.android.gms.maps.internal.IOnCameraChangeListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.maps.model.CameraPosition cameraPosition = (com.google.android.gms.maps.model.CameraPosition) com.google.android.gms.internal.maps.zzc.zza(parcel, com.google.android.gms.maps.model.CameraPosition.CREATOR);
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(cameraPosition);
        parcel2.writeNoException();
        return true;
    }
}
