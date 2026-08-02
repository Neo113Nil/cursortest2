package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public interface IPushTokenizeRequestCallbacks extends android.os.IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.tapandpay.zzb implements com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks {

        public static class Proxy extends com.google.android.gms.internal.tapandpay.zza implements com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks {
            Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks");
            }

            @Override // com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks
            public void generatePaymentCredentials(com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsRequest generatePaymentCredentialsRequest, com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks) throws android.os.RemoteException {
                android.os.Parcel zza = zza();
                com.google.android.gms.internal.tapandpay.zzc.zzc(zza, generatePaymentCredentialsRequest);
                com.google.android.gms.internal.tapandpay.zzc.zzd(zza, iPushTokenizeResponseCallbacks);
                zzc(3, zza);
            }

            @Override // com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks
            public void isWalletAvailable(java.lang.String str, com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks) throws android.os.RemoteException {
                android.os.Parcel zza = zza();
                zza.writeString(str);
                com.google.android.gms.internal.tapandpay.zzc.zzd(zza, iPushTokenizeResponseCallbacks);
                zzc(2, zza);
            }
        }

        public Stub() {
            super("com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks");
        }

        public static com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks");
            return queryLocalInterface instanceof com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks ? (com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks) queryLocalInterface : new com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks.Stub.Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.tapandpay.zzb
        public boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 2) {
                java.lang.String readString = parcel.readString();
                com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks asInterface = com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                isWalletAvailable(readString, asInterface);
                return true;
            }
            if (i != 3) {
                return false;
            }
            com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsRequest generatePaymentCredentialsRequest = (com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsRequest) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsRequest.CREATOR);
            com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks asInterface2 = com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks.Stub.asInterface(parcel.readStrongBinder());
            com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
            generatePaymentCredentials(generatePaymentCredentialsRequest, asInterface2);
            return true;
        }
    }

    void generatePaymentCredentials(com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsRequest generatePaymentCredentialsRequest, com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks) throws android.os.RemoteException;

    void isWalletAvailable(java.lang.String str, com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks) throws android.os.RemoteException;
}
