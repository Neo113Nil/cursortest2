package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public abstract class zzn extends com.google.android.gms.internal.identity.zzb implements com.google.android.gms.internal.identity.zzo {
    public zzn() {
        super("com.google.android.gms.location.internal.IBooleanStatusCallback");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.identity.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
        boolean z = parcel.readInt() != 0;
        com.google.android.gms.internal.identity.zzc.zzd(parcel);
        zzb(status, z);
        return true;
    }
}
