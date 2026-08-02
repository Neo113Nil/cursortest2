package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public abstract class zzas extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzat {
    public zzas() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.maps.internal.IGoogleMapDelegate zzgVar;
        if (i != 1) {
            return false;
        }
        android.os.IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zzgVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            zzgVar = queryLocalInterface instanceof com.google.android.gms.maps.internal.IGoogleMapDelegate ? (com.google.android.gms.maps.internal.IGoogleMapDelegate) queryLocalInterface : new com.google.android.gms.maps.internal.zzg(readStrongBinder);
        }
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(zzgVar);
        parcel2.writeNoException();
        return true;
    }
}
