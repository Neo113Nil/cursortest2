package com.google.android.gms.auth.blockstore.restorecredential.internal;

/* loaded from: classes8.dex */
public interface IClearRestoreCredentialCallback extends android.os.IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.auth_blockstore.zzb implements com.google.android.gms.auth.blockstore.restorecredential.internal.IClearRestoreCredentialCallback {
        public Stub() {
            super("com.google.android.gms.auth.blockstore.restorecredential.internal.IClearRestoreCredentialCallback");
        }

        @Override // com.google.android.gms.internal.auth_blockstore.zzb
        public boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i != 1) {
                return false;
            }
            com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth_blockstore.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
            boolean zzd = com.google.android.gms.internal.auth_blockstore.zzc.zzd(parcel);
            enforceNoDataAvail(parcel);
            onClearRestoreCredential(status, zzd);
            return true;
        }
    }

    void onClearRestoreCredential(com.google.android.gms.common.api.Status status, boolean z) throws android.os.RemoteException;
}
