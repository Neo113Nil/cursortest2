package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public abstract class zzaa extends com.google.android.gms.internal.identity.zzb implements com.google.android.gms.internal.identity.zzab {
    public zzaa() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.location.LocationSettingsResult locationSettingsResult = (com.google.android.gms.location.LocationSettingsResult) com.google.android.gms.internal.identity.zzc.zza(parcel, com.google.android.gms.location.LocationSettingsResult.CREATOR);
        com.google.android.gms.internal.identity.zzc.zzd(parcel);
        zzb(locationSettingsResult);
        return true;
    }
}
