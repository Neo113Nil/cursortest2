package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public abstract class zzbm extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzbn {
    public zzbm() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.maps.model.StreetViewPanoramaLocation streetViewPanoramaLocation = (com.google.android.gms.maps.model.StreetViewPanoramaLocation) com.google.android.gms.internal.maps.zzc.zza(parcel, com.google.android.gms.maps.model.StreetViewPanoramaLocation.CREATOR);
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(streetViewPanoramaLocation);
        parcel2.writeNoException();
        return true;
    }
}
