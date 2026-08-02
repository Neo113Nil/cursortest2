package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
public abstract class zzn extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.internal.auth.zzo {
    public zzn() {
        super("com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 2) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.auth.zzc.zza(parcel, android.os.Bundle.CREATOR);
        com.google.android.gms.internal.auth.zzc.zzb(parcel);
        zzb(status, bundle);
        return true;
    }
}
