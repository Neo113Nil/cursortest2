package androidx.work.multiprocess;

/* loaded from: classes7.dex */
public interface IWorkManagerImplCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx$work$multiprocess$IWorkManagerImplCallback".replace(kotlin.text.Typography.dollar, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);

    public static class Default implements androidx.work.multiprocess.IWorkManagerImplCallback {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.IWorkManagerImplCallback
        public void onFailure(java.lang.String str) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImplCallback
        public void onSuccess(byte[] bArr) throws android.os.RemoteException {
        }
    }

    void onFailure(java.lang.String str) throws android.os.RemoteException;

    void onSuccess(byte[] bArr) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements androidx.work.multiprocess.IWorkManagerImplCallback {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static androidx.work.multiprocess.IWorkManagerImplCallback asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof androidx.work.multiprocess.IWorkManagerImplCallback)) {
                return (androidx.work.multiprocess.IWorkManagerImplCallback) queryLocalInterface;
            }
            return new androidx.work.multiprocess.IWorkManagerImplCallback.Stub.Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            java.lang.String str = DESCRIPTOR;
            if (i > 0 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                onSuccess(parcel.createByteArray());
            } else if (i == 2) {
                onFailure(parcel.readString());
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        static class Proxy implements androidx.work.multiprocess.IWorkManagerImplCallback {
            private android.os.IBinder Camera2StreamConfigurationMap;

            Proxy(android.os.IBinder iBinder) {
                this.Camera2StreamConfigurationMap = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.Camera2StreamConfigurationMap;
            }

            @Override // androidx.work.multiprocess.IWorkManagerImplCallback
            public void onSuccess(byte[] bArr) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    this.Camera2StreamConfigurationMap.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImplCallback
            public void onFailure(java.lang.String str) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeString(str);
                    this.Camera2StreamConfigurationMap.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
