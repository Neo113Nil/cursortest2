package com.google.android.gms.identitycredentials.internal;

/* loaded from: classes8.dex */
public interface IIdentityCredentialCallbacks extends android.os.IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.identity_credentials.zzb implements com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks {
        public Stub() {
            super("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
        }

        @Override // com.google.android.gms.internal.identity_credentials.zzb
        public boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            switch (i) {
                case 1:
                    com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
                    com.google.android.gms.identitycredentials.PendingGetCredentialHandle pendingGetCredentialHandle = (com.google.android.gms.identitycredentials.PendingGetCredentialHandle) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.PendingGetCredentialHandle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetCredential(status, pendingGetCredentialHandle);
                    return true;
                case 2:
                    com.google.android.gms.common.api.Status status2 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
                    com.google.android.gms.identitycredentials.RegistrationResponse registrationResponse = (com.google.android.gms.identitycredentials.RegistrationResponse) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.RegistrationResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRegisterCredentials(status2, registrationResponse);
                    return true;
                case 3:
                    com.google.android.gms.common.api.Status status3 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
                    com.google.android.gms.identitycredentials.ClearRegistryResponse clearRegistryResponse = (com.google.android.gms.identitycredentials.ClearRegistryResponse) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.ClearRegistryResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onClearRegistry(status3, clearRegistryResponse);
                    return true;
                case 4:
                    com.google.android.gms.common.api.Status status4 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
                    com.google.android.gms.identitycredentials.PendingImportCredentialsHandle pendingImportCredentialsHandle = (com.google.android.gms.identitycredentials.PendingImportCredentialsHandle) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.PendingImportCredentialsHandle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onImportCredentials(status4, pendingImportCredentialsHandle);
                    return true;
                case 5:
                    com.google.android.gms.common.api.Status status5 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
                    com.google.android.gms.identitycredentials.RegisterExportResponse registerExportResponse = (com.google.android.gms.identitycredentials.RegisterExportResponse) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.RegisterExportResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRegisterExport(status5, registerExportResponse);
                    return true;
                case 6:
                    com.google.android.gms.common.api.Status status6 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
                    com.google.android.gms.identitycredentials.CreateCredentialResponse createCredentialResponse = (com.google.android.gms.identitycredentials.CreateCredentialResponse) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.CreateCredentialResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCreateCredential(status6, createCredentialResponse);
                    return true;
                case 7:
                    com.google.android.gms.common.api.Status status7 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
                    com.google.android.gms.identitycredentials.CreateCredentialHandle createCredentialHandle = (com.google.android.gms.identitycredentials.CreateCredentialHandle) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.CreateCredentialHandle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCreateCredentialV2(status7, createCredentialHandle);
                    return true;
                case 8:
                    com.google.android.gms.common.api.Status status8 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
                    com.google.android.gms.identitycredentials.RegisterCreationOptionsResponse registerCreationOptionsResponse = (com.google.android.gms.identitycredentials.RegisterCreationOptionsResponse) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.RegisterCreationOptionsResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRegisterCreationOptions(status8, registerCreationOptionsResponse);
                    return true;
                case 9:
                    com.google.android.gms.common.api.Status status9 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
                    com.google.android.gms.identitycredentials.ClearCredentialStateResponse clearCredentialStateResponse = (com.google.android.gms.identitycredentials.ClearCredentialStateResponse) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.ClearCredentialStateResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onClearCredentialState(status9, clearCredentialStateResponse);
                    return true;
                case 10:
                    com.google.android.gms.common.api.Status status10 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
                    com.google.android.gms.identitycredentials.SignalCredentialStateResponse signalCredentialStateResponse = (com.google.android.gms.identitycredentials.SignalCredentialStateResponse) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.SignalCredentialStateResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSignalCredentialState(status10, signalCredentialStateResponse);
                    return true;
                case 11:
                    com.google.android.gms.common.api.Status status11 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
                    com.google.android.gms.identitycredentials.ClearExportResponse clearExportResponse = (com.google.android.gms.identitycredentials.ClearExportResponse) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.ClearExportResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onClearExport(status11, clearExportResponse);
                    return true;
                case 12:
                    com.google.android.gms.common.api.Status status12 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
                    com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupResponse importCredentialsForDeviceSetupResponse = (com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupResponse) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onImportCredentialsForDeviceSetup(status12, importCredentialsForDeviceSetupResponse);
                    return true;
                case 13:
                    com.google.android.gms.common.api.Status status13 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
                    com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse exportCredentialsToDeviceSetupResponse = (com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onExportCredentialsToDeviceSetup(status13, exportCredentialsToDeviceSetupResponse);
                    return true;
                case 14:
                    com.google.android.gms.common.api.Status status14 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
                    com.google.android.gms.identitycredentials.CredentialTransferCapabilities credentialTransferCapabilities = (com.google.android.gms.identitycredentials.CredentialTransferCapabilities) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.CredentialTransferCapabilities.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetCredentialTransferCapabilities(status14, credentialTransferCapabilities);
                    return true;
                case 15:
                    com.google.android.gms.common.api.Status status15 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
                    com.google.android.gms.identitycredentials.ClearCreationOptionsResponse clearCreationOptionsResponse = (com.google.android.gms.identitycredentials.ClearCreationOptionsResponse) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.ClearCreationOptionsResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onClearCreationOptions(status15, clearCreationOptionsResponse);
                    return true;
                default:
                    return false;
            }
        }
    }

    void onClearCreationOptions(com.google.android.gms.common.api.Status status, com.google.android.gms.identitycredentials.ClearCreationOptionsResponse clearCreationOptionsResponse) throws android.os.RemoteException;

    void onClearCredentialState(com.google.android.gms.common.api.Status status, com.google.android.gms.identitycredentials.ClearCredentialStateResponse clearCredentialStateResponse) throws android.os.RemoteException;

    void onClearExport(com.google.android.gms.common.api.Status status, com.google.android.gms.identitycredentials.ClearExportResponse clearExportResponse) throws android.os.RemoteException;

    void onClearRegistry(com.google.android.gms.common.api.Status status, com.google.android.gms.identitycredentials.ClearRegistryResponse clearRegistryResponse) throws android.os.RemoteException;

    void onCreateCredential(com.google.android.gms.common.api.Status status, com.google.android.gms.identitycredentials.CreateCredentialResponse createCredentialResponse) throws android.os.RemoteException;

    void onCreateCredentialV2(com.google.android.gms.common.api.Status status, com.google.android.gms.identitycredentials.CreateCredentialHandle createCredentialHandle) throws android.os.RemoteException;

    void onExportCredentialsToDeviceSetup(com.google.android.gms.common.api.Status status, com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse exportCredentialsToDeviceSetupResponse) throws android.os.RemoteException;

    void onGetCredential(com.google.android.gms.common.api.Status status, com.google.android.gms.identitycredentials.PendingGetCredentialHandle pendingGetCredentialHandle) throws android.os.RemoteException;

    void onGetCredentialTransferCapabilities(com.google.android.gms.common.api.Status status, com.google.android.gms.identitycredentials.CredentialTransferCapabilities credentialTransferCapabilities) throws android.os.RemoteException;

    void onImportCredentials(com.google.android.gms.common.api.Status status, com.google.android.gms.identitycredentials.PendingImportCredentialsHandle pendingImportCredentialsHandle) throws android.os.RemoteException;

    void onImportCredentialsForDeviceSetup(com.google.android.gms.common.api.Status status, com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupResponse importCredentialsForDeviceSetupResponse) throws android.os.RemoteException;

    void onRegisterCreationOptions(com.google.android.gms.common.api.Status status, com.google.android.gms.identitycredentials.RegisterCreationOptionsResponse registerCreationOptionsResponse) throws android.os.RemoteException;

    void onRegisterCredentials(com.google.android.gms.common.api.Status status, com.google.android.gms.identitycredentials.RegistrationResponse registrationResponse) throws android.os.RemoteException;

    void onRegisterExport(com.google.android.gms.common.api.Status status, com.google.android.gms.identitycredentials.RegisterExportResponse registerExportResponse) throws android.os.RemoteException;

    void onSignalCredentialState(com.google.android.gms.common.api.Status status, com.google.android.gms.identitycredentials.SignalCredentialStateResponse signalCredentialStateResponse) throws android.os.RemoteException;
}
