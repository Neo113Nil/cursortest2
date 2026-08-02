package com.google.android.gms.cloudmessaging;

/* loaded from: classes3.dex */
interface IMessengerCompat extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.google.android.gms.iid.IMessengerCompat";
    public static final int TRANSACTION_SEND = 1;

    void send(android.os.Message message) throws android.os.RemoteException;

    /* loaded from: classes8.dex */
    public static class Impl extends android.os.Binder implements com.google.android.gms.cloudmessaging.IMessengerCompat {
        @Override // com.google.android.gms.cloudmessaging.IMessengerCompat
        public void send(android.os.Message message) throws android.os.RemoteException {
            throw null;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            throw null;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            throw null;
        }
    }

    /* loaded from: classes8.dex */
    public static class Proxy implements com.google.android.gms.cloudmessaging.IMessengerCompat {
        private final android.os.IBinder zza;

        @Override // com.google.android.gms.cloudmessaging.IMessengerCompat
        public void send(android.os.Message message) throws android.os.RemoteException {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            obtain.writeInterfaceToken(com.google.android.gms.cloudmessaging.IMessengerCompat.DESCRIPTOR);
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.zza.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this.zza;
        }

        Proxy(android.os.IBinder iBinder) {
            this.zza = iBinder;
        }
    }
}
