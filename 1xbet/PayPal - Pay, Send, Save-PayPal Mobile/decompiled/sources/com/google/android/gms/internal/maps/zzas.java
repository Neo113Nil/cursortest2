package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public abstract class zzas extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.internal.maps.zzat {
    public zzas() {
        super("com.google.android.gms.maps.model.internal.IStyleFactory");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.maps.zzr zzpVar;
        if (i != 1) {
            return false;
        }
        android.os.IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zzpVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IFeatureDelegate");
            zzpVar = queryLocalInterface instanceof com.google.android.gms.internal.maps.zzr ? (com.google.android.gms.internal.maps.zzr) queryLocalInterface : new com.google.android.gms.internal.maps.zzp(readStrongBinder);
        }
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        com.google.android.gms.maps.model.FeatureStyle zzb = zzb(zzpVar);
        parcel2.writeNoException();
        com.google.android.gms.internal.maps.zzc.zzf(parcel2, zzb);
        return true;
    }
}
