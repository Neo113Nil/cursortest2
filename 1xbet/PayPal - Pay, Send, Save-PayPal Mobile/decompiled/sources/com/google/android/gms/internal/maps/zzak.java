package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public abstract class zzak extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.internal.maps.zzal {
    public zzak() {
        super("com.google.android.gms.maps.model.internal.IOnFeatureClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.maps.zzo zzoVar;
        if (i != 1) {
            return false;
        }
        android.os.IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zzoVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IFeatureClickEventDelegate");
            zzoVar = queryLocalInterface instanceof com.google.android.gms.internal.maps.zzo ? (com.google.android.gms.internal.maps.zzo) queryLocalInterface : new com.google.android.gms.internal.maps.zzo(readStrongBinder);
        }
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(zzoVar);
        parcel2.writeNoException();
        return true;
    }
}
