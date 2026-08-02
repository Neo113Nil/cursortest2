package com.google.android.gms.internal.auth_blockstore;

/* loaded from: classes8.dex */
public abstract class zzl extends com.google.android.gms.internal.auth_blockstore.zzb implements com.google.android.gms.internal.auth_blockstore.zzm {
    public zzl() {
        super("com.google.android.gms.auth.blockstore.internal.IRetrieveBytesCallback");
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth_blockstore.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
            byte[] createByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            zza(status, createByteArray);
        } else {
            if (i != 2) {
                return false;
            }
            com.google.android.gms.common.api.Status status2 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth_blockstore.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
            com.google.android.gms.auth.blockstore.RetrieveBytesResponse retrieveBytesResponse = (com.google.android.gms.auth.blockstore.RetrieveBytesResponse) com.google.android.gms.internal.auth_blockstore.zzc.zza(parcel, com.google.android.gms.auth.blockstore.RetrieveBytesResponse.CREATOR);
            enforceNoDataAvail(parcel);
            zzb(status2, retrieveBytesResponse);
        }
        return true;
    }
}
