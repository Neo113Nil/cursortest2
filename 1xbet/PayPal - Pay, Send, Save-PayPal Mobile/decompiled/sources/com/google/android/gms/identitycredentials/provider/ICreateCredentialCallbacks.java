package com.google.android.gms.identitycredentials.provider;

/* loaded from: classes8.dex */
public interface ICreateCredentialCallbacks extends android.os.IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.identity_credentials.zzb implements com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks {

        public static class Proxy extends com.google.android.gms.internal.identity_credentials.zza implements com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks {
            Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks");
            }

            @Override // com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks
            public void onFailure(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks
            public void onSuccess(com.google.android.gms.identitycredentials.CreateCredentialResponse createCredentialResponse) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, createCredentialResponse);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks
            public void onSuccessV2(com.google.android.gms.identitycredentials.CreateCredentialResponse createCredentialResponse, android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, createCredentialResponse);
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, pendingIntent);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks");
        }

        public static com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks");
            return queryLocalInterface instanceof com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks ? (com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks) queryLocalInterface : new com.google.android.gms.identitycredentials.provider.ICreateCredentialCallbacks.Stub.Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.identity_credentials.zzb
        public boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 1) {
                com.google.android.gms.identitycredentials.CreateCredentialResponse createCredentialResponse = (com.google.android.gms.identitycredentials.CreateCredentialResponse) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.CreateCredentialResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onSuccess(createCredentialResponse);
            } else if (i == 2) {
                java.lang.String readString = parcel.readString();
                java.lang.String readString2 = parcel.readString();
                enforceNoDataAvail(parcel);
                onFailure(readString, readString2);
            } else {
                if (i != 3) {
                    return false;
                }
                com.google.android.gms.identitycredentials.CreateCredentialResponse createCredentialResponse2 = (com.google.android.gms.identitycredentials.CreateCredentialResponse) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.CreateCredentialResponse.CREATOR);
                android.app.PendingIntent pendingIntent = (android.app.PendingIntent) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, android.app.PendingIntent.CREATOR);
                enforceNoDataAvail(parcel);
                onSuccessV2(createCredentialResponse2, pendingIntent);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onFailure(java.lang.String str, java.lang.String str2) throws android.os.RemoteException;

    void onSuccess(com.google.android.gms.identitycredentials.CreateCredentialResponse createCredentialResponse) throws android.os.RemoteException;

    void onSuccessV2(com.google.android.gms.identitycredentials.CreateCredentialResponse createCredentialResponse, android.app.PendingIntent pendingIntent) throws android.os.RemoteException;
}
