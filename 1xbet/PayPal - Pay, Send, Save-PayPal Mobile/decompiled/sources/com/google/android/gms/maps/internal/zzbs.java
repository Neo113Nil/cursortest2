package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public abstract class zzbs extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzbt {
    public zzbs() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate zzbxVar;
        if (i != 1) {
            return false;
        }
        android.os.IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zzbxVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            zzbxVar = queryLocalInterface instanceof com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate ? (com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate) queryLocalInterface : new com.google.android.gms.maps.internal.zzbx(readStrongBinder);
        }
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(zzbxVar);
        parcel2.writeNoException();
        return true;
    }
}
