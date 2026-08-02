package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public abstract class zzbe extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzbf {
    public zzbe() {
        super("com.google.android.gms.maps.internal.IOnPoiClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.maps.model.PointOfInterest pointOfInterest = (com.google.android.gms.maps.model.PointOfInterest) com.google.android.gms.internal.maps.zzc.zza(parcel, com.google.android.gms.maps.model.PointOfInterest.CREATOR);
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(pointOfInterest);
        parcel2.writeNoException();
        return true;
    }
}
