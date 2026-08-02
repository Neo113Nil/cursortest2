package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public abstract class zzw extends com.google.android.gms.internal.identity.zzb implements com.google.android.gms.internal.identity.zzx {
    public zzw() {
        super("com.google.android.gms.location.internal.ILocationAvailabilityStatusCallback");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.identity.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
        com.google.android.gms.location.LocationAvailability locationAvailability = (com.google.android.gms.location.LocationAvailability) com.google.android.gms.internal.identity.zzc.zza(parcel, com.google.android.gms.location.LocationAvailability.CREATOR);
        com.google.android.gms.internal.identity.zzc.zzd(parcel);
        zzb(status, locationAvailability);
        return true;
    }
}
