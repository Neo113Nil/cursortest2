package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public abstract class zzbk extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzbl {
    public zzbk() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera = (com.google.android.gms.maps.model.StreetViewPanoramaCamera) com.google.android.gms.internal.maps.zzc.zza(parcel, com.google.android.gms.maps.model.StreetViewPanoramaCamera.CREATOR);
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(streetViewPanoramaCamera);
        parcel2.writeNoException();
        return true;
    }
}
