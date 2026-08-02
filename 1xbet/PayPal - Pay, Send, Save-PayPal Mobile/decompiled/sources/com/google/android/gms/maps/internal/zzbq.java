package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public abstract class zzbq extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzbr {
    public zzbq() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation = (com.google.android.gms.maps.model.StreetViewPanoramaOrientation) com.google.android.gms.internal.maps.zzc.zza(parcel, com.google.android.gms.maps.model.StreetViewPanoramaOrientation.CREATOR);
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(streetViewPanoramaOrientation);
        parcel2.writeNoException();
        return true;
    }
}
