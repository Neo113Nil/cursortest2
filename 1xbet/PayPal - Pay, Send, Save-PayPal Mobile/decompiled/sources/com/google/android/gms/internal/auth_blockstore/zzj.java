package com.google.android.gms.internal.auth_blockstore;

/* loaded from: classes8.dex */
public abstract class zzj extends com.google.android.gms.internal.auth_blockstore.zzb implements com.google.android.gms.internal.auth_blockstore.zzk {
    public zzj() {
        super("com.google.android.gms.auth.blockstore.internal.IIsEndToEndEncryptionAvailableCallback");
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth_blockstore.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
        boolean zzd = com.google.android.gms.internal.auth_blockstore.zzc.zzd(parcel);
        enforceNoDataAvail(parcel);
        zza(status, zzd);
        return true;
    }
}
