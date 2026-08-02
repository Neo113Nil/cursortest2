package com.google.android.gms.auth.blockstore.restorecredential.internal;

/* loaded from: classes8.dex */
public interface ICreateRestoreCredentialCallback extends android.os.IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.auth_blockstore.zzb implements com.google.android.gms.auth.blockstore.restorecredential.internal.ICreateRestoreCredentialCallback {
        public Stub() {
            super("com.google.android.gms.auth.blockstore.restorecredential.internal.ICreateRestoreCredentialCallback");
        }

        @Override // com.google.android.gms.internal.auth_blockstore.zzb
        public boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i != 1) {
                return false;
            }
            com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth_blockstore.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
            com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse createRestoreCredentialResponse = (com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse) com.google.android.gms.internal.auth_blockstore.zzc.zza(parcel, com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse.CREATOR);
            enforceNoDataAvail(parcel);
            onCreateRestoreCredential(status, createRestoreCredentialResponse);
            return true;
        }
    }

    void onCreateRestoreCredential(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse createRestoreCredentialResponse) throws android.os.RemoteException;
}
