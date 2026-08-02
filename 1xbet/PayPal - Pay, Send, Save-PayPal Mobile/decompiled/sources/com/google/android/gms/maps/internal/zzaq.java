package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public abstract class zzaq extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzar {
    public zzaq() {
        super("com.google.android.gms.maps.internal.IOnMapLongClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.maps.model.LatLng latLng = (com.google.android.gms.maps.model.LatLng) com.google.android.gms.internal.maps.zzc.zza(parcel, com.google.android.gms.maps.model.LatLng.CREATOR);
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(latLng);
        parcel2.writeNoException();
        return true;
    }
}
