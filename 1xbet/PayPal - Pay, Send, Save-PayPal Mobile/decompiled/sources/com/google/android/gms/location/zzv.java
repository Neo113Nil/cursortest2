package com.google.android.gms.location;

/* loaded from: classes8.dex */
public abstract class zzv extends com.google.android.gms.internal.identity.zzb implements com.google.android.gms.location.zzw {
    public zzv() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static com.google.android.gms.location.zzw zzb(android.os.IBinder iBinder) {
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof com.google.android.gms.location.zzw ? (com.google.android.gms.location.zzw) queryLocalInterface : new com.google.android.gms.location.zzu(iBinder);
    }

    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.location.LocationResult locationResult = (com.google.android.gms.location.LocationResult) com.google.android.gms.internal.identity.zzc.zza(parcel, com.google.android.gms.location.LocationResult.CREATOR);
            com.google.android.gms.internal.identity.zzc.zzd(parcel);
            zzd(locationResult);
        } else if (i == 2) {
            com.google.android.gms.location.LocationAvailability locationAvailability = (com.google.android.gms.location.LocationAvailability) com.google.android.gms.internal.identity.zzc.zza(parcel, com.google.android.gms.location.LocationAvailability.CREATOR);
            com.google.android.gms.internal.identity.zzc.zzd(parcel);
            zze(locationAvailability);
        } else {
            if (i != 3) {
                return false;
            }
            zzf();
        }
        return true;
    }
}
