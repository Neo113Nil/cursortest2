package com.google.android.gms.identitycredentials.provider;

/* loaded from: classes8.dex */
public interface IExportCredentialsCallbacks extends android.os.IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.identity_credentials.zzb implements com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks {

        public static class Proxy extends com.google.android.gms.internal.identity_credentials.zza implements com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks {
            Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks");
            }

            @Override // com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks
            public void onFailure(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks
            public void onSuccess(com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse exportCredentialsToDeviceSetupResponse) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, exportCredentialsToDeviceSetupResponse);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks");
        }

        public static com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks");
            return queryLocalInterface instanceof com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks ? (com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks) queryLocalInterface : new com.google.android.gms.identitycredentials.provider.IExportCredentialsCallbacks.Stub.Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.identity_credentials.zzb
        public boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 1) {
                com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse exportCredentialsToDeviceSetupResponse = (com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onSuccess(exportCredentialsToDeviceSetupResponse);
            } else {
                if (i != 2) {
                    return false;
                }
                java.lang.String readString = parcel.readString();
                java.lang.String readString2 = parcel.readString();
                enforceNoDataAvail(parcel);
                onFailure(readString, readString2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onFailure(java.lang.String str, java.lang.String str2) throws android.os.RemoteException;

    void onSuccess(com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse exportCredentialsToDeviceSetupResponse) throws android.os.RemoteException;
}
