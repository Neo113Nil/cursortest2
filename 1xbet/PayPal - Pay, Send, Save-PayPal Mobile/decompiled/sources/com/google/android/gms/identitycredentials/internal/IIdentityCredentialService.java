package com.google.android.gms.identitycredentials.internal;

/* loaded from: classes8.dex */
public interface IIdentityCredentialService extends android.os.IInterface {
    void clearCreationOptions(com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks iIdentityCredentialCallbacks, com.google.android.gms.identitycredentials.ClearCreationOptionsRequest clearCreationOptionsRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException;

    void clearCredentialState(com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks iIdentityCredentialCallbacks, com.google.android.gms.identitycredentials.ClearCredentialStateRequest clearCredentialStateRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException;

    void clearRegistry(com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks iIdentityCredentialCallbacks, com.google.android.gms.identitycredentials.ClearRegistryRequest clearRegistryRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException;

    void createCredential(com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks iIdentityCredentialCallbacks, com.google.android.gms.identitycredentials.CreateCredentialRequest createCredentialRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException;

    void getCredential(com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks iIdentityCredentialCallbacks, com.google.android.gms.identitycredentials.GetCredentialRequest getCredentialRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException;

    void importCredentials(com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks iIdentityCredentialCallbacks, com.google.android.gms.identitycredentials.ImportCredentialsRequest importCredentialsRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException;

    void registerCreationOptions(com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks iIdentityCredentialCallbacks, com.google.android.gms.identitycredentials.RegisterCreationOptionsRequest registerCreationOptionsRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException;

    void registerCredentials(com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks iIdentityCredentialCallbacks, com.google.android.gms.identitycredentials.RegistrationRequest registrationRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException;

    void registerExport(com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks iIdentityCredentialCallbacks, com.google.android.gms.identitycredentials.RegisterExportRequest registerExportRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException;

    void signalCredentialState(com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks iIdentityCredentialCallbacks, com.google.android.gms.identitycredentials.SignalCredentialStateRequest signalCredentialStateRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException;

    public static abstract class Stub extends com.google.android.gms.internal.identity_credentials.zzb implements com.google.android.gms.identitycredentials.internal.IIdentityCredentialService {

        public static class Proxy extends com.google.android.gms.internal.identity_credentials.zza implements com.google.android.gms.identitycredentials.internal.IIdentityCredentialService {
            Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void clearCreationOptions(com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks iIdentityCredentialCallbacks, com.google.android.gms.identitycredentials.ClearCreationOptionsRequest clearCreationOptionsRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzc(obtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, clearCreationOptionsRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void clearCredentialState(com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks iIdentityCredentialCallbacks, com.google.android.gms.identitycredentials.ClearCredentialStateRequest clearCredentialStateRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzc(obtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, clearCredentialStateRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void clearRegistry(com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks iIdentityCredentialCallbacks, com.google.android.gms.identitycredentials.ClearRegistryRequest clearRegistryRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzc(obtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, clearRegistryRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void createCredential(com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks iIdentityCredentialCallbacks, com.google.android.gms.identitycredentials.CreateCredentialRequest createCredentialRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzc(obtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, createCredentialRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void getCredential(com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks iIdentityCredentialCallbacks, com.google.android.gms.identitycredentials.GetCredentialRequest getCredentialRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzc(obtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, getCredentialRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void importCredentials(com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks iIdentityCredentialCallbacks, com.google.android.gms.identitycredentials.ImportCredentialsRequest importCredentialsRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzc(obtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, importCredentialsRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void registerCreationOptions(com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks iIdentityCredentialCallbacks, com.google.android.gms.identitycredentials.RegisterCreationOptionsRequest registerCreationOptionsRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzc(obtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, registerCreationOptionsRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void registerCredentials(com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks iIdentityCredentialCallbacks, com.google.android.gms.identitycredentials.RegistrationRequest registrationRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzc(obtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, registrationRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void registerExport(com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks iIdentityCredentialCallbacks, com.google.android.gms.identitycredentials.RegisterExportRequest registerExportRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzc(obtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, registerExportRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void signalCredentialState(com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks iIdentityCredentialCallbacks, com.google.android.gms.identitycredentials.SignalCredentialStateRequest signalCredentialStateRequest, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzc(obtainAndWriteInterfaceToken, iIdentityCredentialCallbacks);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, signalCredentialStateRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }
        }

        public static com.google.android.gms.identitycredentials.internal.IIdentityCredentialService asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
            return queryLocalInterface instanceof com.google.android.gms.identitycredentials.internal.IIdentityCredentialService ? (com.google.android.gms.identitycredentials.internal.IIdentityCredentialService) queryLocalInterface : new com.google.android.gms.identitycredentials.internal.IIdentityCredentialService.Stub.Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.identity_credentials.zzb
        public boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            throw null;
        }
    }
}
