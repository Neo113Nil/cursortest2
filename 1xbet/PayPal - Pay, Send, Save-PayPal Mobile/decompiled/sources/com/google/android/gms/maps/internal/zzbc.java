package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public abstract class zzbc extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzbd {
    public zzbc() {
        super("com.google.android.gms.maps.internal.IOnMyLocationClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        android.location.Location location = (android.location.Location) com.google.android.gms.internal.maps.zzc.zza(parcel, android.location.Location.CREATOR);
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(location);
        parcel2.writeNoException();
        return true;
    }
}
