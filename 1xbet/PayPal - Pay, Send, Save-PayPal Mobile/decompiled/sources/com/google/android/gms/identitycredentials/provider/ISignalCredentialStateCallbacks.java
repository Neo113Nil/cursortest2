package com.google.android.gms.identitycredentials.provider;

/* loaded from: classes8.dex */
public interface ISignalCredentialStateCallbacks extends android.os.IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.identity_credentials.zzb implements com.google.android.gms.identitycredentials.provider.ISignalCredentialStateCallbacks {

        public static class Proxy extends com.google.android.gms.internal.identity_credentials.zza implements com.google.android.gms.identitycredentials.provider.ISignalCredentialStateCallbacks {
            Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.gms.identitycredentials.provider.ISignalCredentialStateCallbacks");
            }

            @Override // com.google.android.gms.identitycredentials.provider.ISignalCredentialStateCallbacks
            public void onFailure(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.provider.ISignalCredentialStateCallbacks
            public void onSuccess(com.google.android.gms.identitycredentials.SignalCredentialStateResponse signalCredentialStateResponse) throws android.os.RemoteException {
                android.os.Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                com.google.android.gms.internal.identity_credentials.zzc.zzb(obtainAndWriteInterfaceToken, signalCredentialStateResponse);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.identitycredentials.provider.ISignalCredentialStateCallbacks");
        }

        public static com.google.android.gms.identitycredentials.provider.ISignalCredentialStateCallbacks asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.provider.ISignalCredentialStateCallbacks");
            return queryLocalInterface instanceof com.google.android.gms.identitycredentials.provider.ISignalCredentialStateCallbacks ? (com.google.android.gms.identitycredentials.provider.ISignalCredentialStateCallbacks) queryLocalInterface : new com.google.android.gms.identitycredentials.provider.ISignalCredentialStateCallbacks.Stub.Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.identity_credentials.zzb
        public boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 1) {
                com.google.android.gms.identitycredentials.SignalCredentialStateResponse signalCredentialStateResponse = (com.google.android.gms.identitycredentials.SignalCredentialStateResponse) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, com.google.android.gms.identitycredentials.SignalCredentialStateResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onSuccess(signalCredentialStateResponse);
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

    void onSuccess(com.google.android.gms.identitycredentials.SignalCredentialStateResponse signalCredentialStateResponse) throws android.os.RemoteException;
}
