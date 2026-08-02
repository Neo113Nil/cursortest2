package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public abstract class zzj extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.ILocationSourceDelegate {
    public zzj() {
        super("com.google.android.gms.maps.internal.ILocationSourceDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.maps.internal.zzaj zzaiVar;
        if (i == 1) {
            android.os.IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzaiVar = null;
            } else {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                zzaiVar = queryLocalInterface instanceof com.google.android.gms.maps.internal.zzaj ? (com.google.android.gms.maps.internal.zzaj) queryLocalInterface : new com.google.android.gms.maps.internal.zzai(readStrongBinder);
            }
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            activate(zzaiVar);
        } else {
            if (i != 2) {
                return false;
            }
            deactivate();
        }
        parcel2.writeNoException();
        return true;
    }
}
