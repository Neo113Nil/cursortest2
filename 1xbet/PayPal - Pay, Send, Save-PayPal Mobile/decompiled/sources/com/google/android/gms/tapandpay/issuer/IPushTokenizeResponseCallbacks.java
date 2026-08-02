package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public interface IPushTokenizeResponseCallbacks extends android.os.IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.tapandpay.zzb implements com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks {

        public static class Proxy extends com.google.android.gms.internal.tapandpay.zza implements com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks {
            Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks");
            }

            @Override // com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks
            public void onError(int i) throws android.os.RemoteException {
                android.os.Parcel zza = zza();
                zza.writeInt(i);
                zzc(4, zza);
            }

            @Override // com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks
            public void onPaymentCredentialsResponse(com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsResponse generatePaymentCredentialsResponse) throws android.os.RemoteException {
                android.os.Parcel zza = zza();
                com.google.android.gms.internal.tapandpay.zzc.zzc(zza, generatePaymentCredentialsResponse);
                zzc(3, zza);
            }

            @Override // com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks
            public void onWalletAvailableResponse(boolean z) throws android.os.RemoteException {
                android.os.Parcel zza = zza();
                int i = com.google.android.gms.internal.tapandpay.zzc.zza;
                zza.writeInt(z ? 1 : 0);
                zzc(2, zza);
            }
        }

        public Stub() {
            super("com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks");
        }

        public static com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks");
            return queryLocalInterface instanceof com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks ? (com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks) queryLocalInterface : new com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks.Stub.Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.tapandpay.zzb
        public boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 2) {
                boolean zza = com.google.android.gms.internal.tapandpay.zzc.zza(parcel);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                onWalletAvailableResponse(zza);
                return true;
            }
            if (i == 3) {
                com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsResponse generatePaymentCredentialsResponse = (com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsResponse) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsResponse.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                onPaymentCredentialsResponse(generatePaymentCredentialsResponse);
                return true;
            }
            if (i != 4) {
                return false;
            }
            int readInt = parcel.readInt();
            com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
            onError(readInt);
            return true;
        }
    }

    void onError(int i) throws android.os.RemoteException;

    void onPaymentCredentialsResponse(com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsResponse generatePaymentCredentialsResponse) throws android.os.RemoteException;

    void onWalletAvailableResponse(boolean z) throws android.os.RemoteException;
}
