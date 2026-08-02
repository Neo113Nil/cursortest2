package com.google.android.gms.auth.blockstore.restorecredential.internal;

/* loaded from: classes8.dex */
public interface IRestoreCredentialService extends android.os.IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.auth_blockstore.zzb implements com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService {

        public static class Proxy extends com.google.android.gms.internal.auth_blockstore.zza implements com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService {
            Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
            }

            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService
            public void clearRestoreCredential(com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest clearRestoreCredentialRequest, com.google.android.gms.auth.blockstore.restorecredential.internal.IClearRestoreCredentialCallback iClearRestoreCredentialCallback) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.auth_blockstore.zzc.zzb(obtainAndWriteInterfaceToken, clearRestoreCredentialRequest);
                com.google.android.gms.internal.auth_blockstore.zzc.zzc(obtainAndWriteInterfaceToken, iClearRestoreCredentialCallback);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService
            public void createRestoreCredential(com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest createRestoreCredentialRequest, com.google.android.gms.auth.blockstore.restorecredential.internal.ICreateRestoreCredentialCallback iCreateRestoreCredentialCallback) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.auth_blockstore.zzc.zzb(obtainAndWriteInterfaceToken, createRestoreCredentialRequest);
                com.google.android.gms.internal.auth_blockstore.zzc.zzc(obtainAndWriteInterfaceToken, iCreateRestoreCredentialCallback);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService
            public void getRestoreCredential(com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest getRestoreCredentialRequest, com.google.android.gms.auth.blockstore.restorecredential.internal.IGetRestoreCredentialCallback iGetRestoreCredentialCallback) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.auth_blockstore.zzc.zzb(obtainAndWriteInterfaceToken, getRestoreCredentialRequest);
                com.google.android.gms.internal.auth_blockstore.zzc.zzc(obtainAndWriteInterfaceToken, iGetRestoreCredentialCallback);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public static com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
            return queryLocalInterface instanceof com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService ? (com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService) queryLocalInterface : new com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService.Stub.Proxy(iBinder);
        }
    }

    void clearRestoreCredential(com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest clearRestoreCredentialRequest, com.google.android.gms.auth.blockstore.restorecredential.internal.IClearRestoreCredentialCallback iClearRestoreCredentialCallback) throws android.os.RemoteException;

    void createRestoreCredential(com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest createRestoreCredentialRequest, com.google.android.gms.auth.blockstore.restorecredential.internal.ICreateRestoreCredentialCallback iCreateRestoreCredentialCallback) throws android.os.RemoteException;

    void getRestoreCredential(com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest getRestoreCredentialRequest, com.google.android.gms.auth.blockstore.restorecredential.internal.IGetRestoreCredentialCallback iGetRestoreCredentialCallback) throws android.os.RemoteException;
}
