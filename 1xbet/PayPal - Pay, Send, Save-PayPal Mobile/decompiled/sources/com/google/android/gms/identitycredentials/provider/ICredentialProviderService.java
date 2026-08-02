package com.google.android.gms.identitycredentials.provider;

/* loaded from: classes8.dex */
public interface ICredentialProviderService extends android.os.IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.identity_credentials.zzb implements com.google.android.gms.identitycredentials.provider.ICredentialProviderService {

        public static class Proxy extends com.google.android.gms.internal.identity_credentials.zza implements com.google.android.gms.identitycredentials.provider.ICredentialProviderService {
            Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.gms.identitycredentials.provider.ICredentialProviderService");
            }

            @Override // com.google.android.gms.identitycredentials.provider.ICredentialProviderService
            public void onCreateCredentialRequest(com.google.android.gms.identitycredentials.CreateCredentialRequest createCredentialRequest, com.google.android.gms.identitycredentials.CallingAppInfoParcelable callingAppInfoParcelable, com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks iCreateCredentialCallbacks) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, createCredentialRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, callingAppInfoParcelable);
                com.google.android.gms.internal.identity_credentials.zzc.zzc(obtainAndWriteInterfaceToken, iCreateCredentialCallbacks);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.provider.ICredentialProviderService
            public void onExportCredentials(com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupRequest exportCredentialsToDeviceSetupRequest, com.google.android.gms.identitycredentials.CallingAppInfoParcelable callingAppInfoParcelable, com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks iExportCredentialsCallbacks) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, exportCredentialsToDeviceSetupRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, callingAppInfoParcelable);
                com.google.android.gms.internal.identity_credentials.zzc.zzc(obtainAndWriteInterfaceToken, iExportCredentialsCallbacks);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.provider.ICredentialProviderService
            public void onGetCredentialTransferCapabilities(com.google.android.gms.identitycredentials.GetCredentialTransferCapabilitiesRequest getCredentialTransferCapabilitiesRequest, com.google.android.gms.identitycredentials.CallingAppInfoParcelable callingAppInfoParcelable, com.google.android.gms.identitycredentials.provider.ICredentialTransferCapabilitiesCallbacks iCredentialTransferCapabilitiesCallbacks) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, getCredentialTransferCapabilitiesRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, callingAppInfoParcelable);
                com.google.android.gms.internal.identity_credentials.zzc.zzc(obtainAndWriteInterfaceToken, iCredentialTransferCapabilitiesCallbacks);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.provider.ICredentialProviderService
            public void onImportCredentials(com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupRequest importCredentialsForDeviceSetupRequest, com.google.android.gms.identitycredentials.CallingAppInfoParcelable callingAppInfoParcelable, com.google.android.gms.identitycredentials.provider.IImportCredentialsCallbacks iImportCredentialsCallbacks) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, importCredentialsForDeviceSetupRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, callingAppInfoParcelable);
                com.google.android.gms.internal.identity_credentials.zzc.zzc(obtainAndWriteInterfaceToken, iImportCredentialsCallbacks);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.provider.ICredentialProviderService
            public void onSignalCredentialStateRequest(com.google.android.gms.identitycredentials.SignalCredentialStateRequest signalCredentialStateRequest, com.google.android.gms.identitycredentials.CallingAppInfoParcelable callingAppInfoParcelable, com.google.android.gms.identitycredentials.provider.ISignalCredentialStateCallbacks iSignalCredentialStateCallbacks) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, signalCredentialStateRequest);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, callingAppInfoParcelable);
                com.google.android.gms.internal.identity_credentials.zzc.zzc(obtainAndWriteInterfaceToken, iSignalCredentialStateCallbacks);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.identitycredentials.provider.ICredentialProviderService");
        }

        public static com.google.android.gms.identitycredentials.provider.ICredentialProviderService asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.provider.ICredentialProviderService");
            return queryLocalInterface instanceof com.google.android.gms.identitycredentials.provider.ICredentialProviderService ? (com.google.android.gms.identitycredentials.provider.ICredentialProviderService) queryLocalInterface : new com.google.android.gms.identitycredentials.provider.ICredentialProviderService.Stub.Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.identity_credentials.zzb
        public boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 1) {
                com.google.android.gms.identitycredentials.CreateCredentialRequest createCredentialRequest = (com.google.android.gms.identitycredentials.CreateCredentialRequest) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.CreateCredentialRequest.CREATOR);
                com.google.android.gms.identitycredentials.CallingAppInfoParcelable callingAppInfoParcelable = (com.google.android.gms.identitycredentials.CallingAppInfoParcelable) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.CallingAppInfoParcelable.CREATOR);
                com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks asInterface = com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onCreateCredentialRequest(createCredentialRequest, callingAppInfoParcelable, asInterface);
            } else if (i == 2) {
                com.google.android.gms.identitycredentials.SignalCredentialStateRequest signalCredentialStateRequest = (com.google.android.gms.identitycredentials.SignalCredentialStateRequest) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.SignalCredentialStateRequest.CREATOR);
                com.google.android.gms.identitycredentials.CallingAppInfoParcelable callingAppInfoParcelable2 = (com.google.android.gms.identitycredentials.CallingAppInfoParcelable) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.CallingAppInfoParcelable.CREATOR);
                com.google.android.gms.identitycredentials.provider.ISignalCredentialStateCallbacks asInterface2 = com.google.android.gms.identitycredentials.provider.ISignalCredentialStateCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onSignalCredentialStateRequest(signalCredentialStateRequest, callingAppInfoParcelable2, asInterface2);
            } else if (i == 3) {
                com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupRequest importCredentialsForDeviceSetupRequest = (com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupRequest) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupRequest.CREATOR);
                com.google.android.gms.identitycredentials.CallingAppInfoParcelable callingAppInfoParcelable3 = (com.google.android.gms.identitycredentials.CallingAppInfoParcelable) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.CallingAppInfoParcelable.CREATOR);
                com.google.android.gms.identitycredentials.provider.IImportCredentialsCallbacks asInterface3 = com.google.android.gms.identitycredentials.provider.IImportCredentialsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onImportCredentials(importCredentialsForDeviceSetupRequest, callingAppInfoParcelable3, asInterface3);
            } else if (i == 4) {
                com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupRequest exportCredentialsToDeviceSetupRequest = (com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupRequest) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupRequest.CREATOR);
                com.google.android.gms.identitycredentials.CallingAppInfoParcelable callingAppInfoParcelable4 = (com.google.android.gms.identitycredentials.CallingAppInfoParcelable) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.CallingAppInfoParcelable.CREATOR);
                com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks asInterface4 = com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onExportCredentials(exportCredentialsToDeviceSetupRequest, callingAppInfoParcelable4, asInterface4);
            } else {
                if (i != 5) {
                    return false;
                }
                com.google.android.gms.identitycredentials.GetCredentialTransferCapabilitiesRequest getCredentialTransferCapabilitiesRequest = (com.google.android.gms.identitycredentials.GetCredentialTransferCapabilitiesRequest) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.GetCredentialTransferCapabilitiesRequest.CREATOR);
                com.google.android.gms.identitycredentials.CallingAppInfoParcelable callingAppInfoParcelable5 = (com.google.android.gms.identitycredentials.CallingAppInfoParcelable) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.CallingAppInfoParcelable.CREATOR);
                com.google.android.gms.identitycredentials.provider.ICredentialTransferCapabilitiesCallbacks asInterface5 = com.google.android.gms.identitycredentials.provider.ICredentialTransferCapabilitiesCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onGetCredentialTransferCapabilities(getCredentialTransferCapabilitiesRequest, callingAppInfoParcelable5, asInterface5);
            }
            return true;
        }
    }

    void onCreateCredentialRequest(com.google.android.gms.identitycredentials.CreateCredentialRequest createCredentialRequest, com.google.android.gms.identitycredentials.CallingAppInfoParcelable callingAppInfoParcelable, com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks iCreateCredentialCallbacks) throws android.os.RemoteException;

    void onExportCredentials(com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupRequest exportCredentialsToDeviceSetupRequest, com.google.android.gms.identitycredentials.CallingAppInfoParcelable callingAppInfoParcelable, com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks iExportCredentialsCallbacks) throws android.os.RemoteException;

    void onGetCredentialTransferCapabilities(com.google.android.gms.identitycredentials.GetCredentialTransferCapabilitiesRequest getCredentialTransferCapabilitiesRequest, com.google.android.gms.identitycredentials.CallingAppInfoParcelable callingAppInfoParcelable, com.google.android.gms.identitycredentials.provider.ICredentialTransferCapabilitiesCallbacks iCredentialTransferCapabilitiesCallbacks) throws android.os.RemoteException;

    void onImportCredentials(com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupRequest importCredentialsForDeviceSetupRequest, com.google.android.gms.identitycredentials.CallingAppInfoParcelable callingAppInfoParcelable, com.google.android.gms.identitycredentials.provider.IImportCredentialsCallbacks iImportCredentialsCallbacks) throws android.os.RemoteException;

    void onSignalCredentialStateRequest(com.google.android.gms.identitycredentials.SignalCredentialStateRequest signalCredentialStateRequest, com.google.android.gms.identitycredentials.CallingAppInfoParcelable callingAppInfoParcelable, com.google.android.gms.identitycredentials.provider.ISignalCredentialStateCallbacks iSignalCredentialStateCallbacks) throws android.os.RemoteException;
}
