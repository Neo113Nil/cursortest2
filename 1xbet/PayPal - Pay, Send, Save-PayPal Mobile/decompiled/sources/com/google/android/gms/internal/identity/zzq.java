package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public abstract class zzq extends com.google.android.gms.internal.identity.zzb implements com.google.android.gms.internal.identity.zzr {
    public zzq() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.internal.identity.zzl zzlVar = (com.google.android.gms.internal.identity.zzl) com.google.android.gms.internal.identity.zzc.zza(parcel, com.google.android.gms.internal.identity.zzl.CREATOR);
            com.google.android.gms.internal.identity.zzc.zzd(parcel);
            zzd(zzlVar);
        } else {
            if (i != 2) {
                return false;
            }
            zze();
        }
        return true;
    }
}
