package com.google.android.gms.location;

/* loaded from: classes8.dex */
public abstract class zzy extends com.google.android.gms.internal.identity.zzb implements com.google.android.gms.location.zzz {
    public zzy() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static com.google.android.gms.location.zzz zzb(android.os.IBinder iBinder) {
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof com.google.android.gms.location.zzz ? (com.google.android.gms.location.zzz) queryLocalInterface : new com.google.android.gms.location.zzx(iBinder);
    }

    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            android.location.Location location = (android.location.Location) com.google.android.gms.internal.identity.zzc.zza(parcel, android.location.Location.CREATOR);
            com.google.android.gms.internal.identity.zzc.zzd(parcel);
            zzd(location);
        } else {
            if (i != 2) {
                return false;
            }
            zze();
        }
        return true;
    }
}
