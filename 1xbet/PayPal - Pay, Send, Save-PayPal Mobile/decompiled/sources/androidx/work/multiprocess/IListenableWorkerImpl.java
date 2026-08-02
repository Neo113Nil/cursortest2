package androidx.work.multiprocess;

/* loaded from: classes7.dex */
public interface IListenableWorkerImpl extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx$work$multiprocess$IListenableWorkerImpl".replace(kotlin.text.Typography.dollar, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);

    public static class Default implements androidx.work.multiprocess.IListenableWorkerImpl {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.IListenableWorkerImpl
        public void getForegroundInfoAsync(byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IListenableWorkerImpl
        public void interrupt(byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IListenableWorkerImpl
        public void startWork(byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
        }
    }

    void getForegroundInfoAsync(byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException;

    void interrupt(byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException;

    void startWork(byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements androidx.work.multiprocess.IListenableWorkerImpl {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static androidx.work.multiprocess.IListenableWorkerImpl asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof androidx.work.multiprocess.IListenableWorkerImpl)) {
                return (androidx.work.multiprocess.IListenableWorkerImpl) queryLocalInterface;
            }
            return new androidx.work.multiprocess.IListenableWorkerImpl.Stub.Proxy(iBinder);
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
                startWork(parcel.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i == 2) {
                interrupt(parcel.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i == 3) {
                getForegroundInfoAsync(parcel.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        static class Proxy implements androidx.work.multiprocess.IListenableWorkerImpl {
            private android.os.IBinder getHighResolutionOutputSizeshNQ4ISI;

            Proxy(android.os.IBinder iBinder) {
                this.getHighResolutionOutputSizeshNQ4ISI = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            @Override // androidx.work.multiprocess.IListenableWorkerImpl
            public void startWork(byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongInterface(iWorkManagerImplCallback);
                    this.getHighResolutionOutputSizeshNQ4ISI.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IListenableWorkerImpl
            public void interrupt(byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongInterface(iWorkManagerImplCallback);
                    this.getHighResolutionOutputSizeshNQ4ISI.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IListenableWorkerImpl
            public void getForegroundInfoAsync(byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongInterface(iWorkManagerImplCallback);
                    this.getHighResolutionOutputSizeshNQ4ISI.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
