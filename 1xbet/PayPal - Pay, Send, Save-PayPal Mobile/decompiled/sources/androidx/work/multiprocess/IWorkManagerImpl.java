package androidx.work.multiprocess;

/* loaded from: classes7.dex */
public interface IWorkManagerImpl extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx$work$multiprocess$IWorkManagerImpl".replace(kotlin.text.Typography.dollar, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);

    public static class Default implements androidx.work.multiprocess.IWorkManagerImpl {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void cancelAllWork(androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void cancelAllWorkByTag(java.lang.String str, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void cancelUniqueWork(java.lang.String str, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void cancelWorkById(java.lang.String str, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void enqueueContinuation(byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void enqueueWorkRequests(byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void queryWorkInfo(byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void setForegroundAsync(byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void setProgress(byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void updateUniquePeriodicWorkRequest(java.lang.String str, byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
        }
    }

    void cancelAllWork(androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException;

    void cancelAllWorkByTag(java.lang.String str, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException;

    void cancelUniqueWork(java.lang.String str, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException;

    void cancelWorkById(java.lang.String str, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException;

    void enqueueContinuation(byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException;

    void enqueueWorkRequests(byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException;

    void queryWorkInfo(byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException;

    void setForegroundAsync(byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException;

    void setProgress(byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException;

    void updateUniquePeriodicWorkRequest(java.lang.String str, byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements androidx.work.multiprocess.IWorkManagerImpl {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static androidx.work.multiprocess.IWorkManagerImpl asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof androidx.work.multiprocess.IWorkManagerImpl)) {
                return (androidx.work.multiprocess.IWorkManagerImpl) queryLocalInterface;
            }
            return new androidx.work.multiprocess.IWorkManagerImpl.Stub.Proxy(iBinder);
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
            switch (i) {
                case 1:
                    enqueueWorkRequests(parcel.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 2:
                    updateUniquePeriodicWorkRequest(parcel.readString(), parcel.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 3:
                    enqueueContinuation(parcel.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 4:
                    cancelWorkById(parcel.readString(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 5:
                    cancelAllWorkByTag(parcel.readString(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 6:
                    cancelUniqueWork(parcel.readString(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 7:
                    cancelAllWork(androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 8:
                    queryWorkInfo(parcel.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 9:
                    setProgress(parcel.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 10:
                    setForegroundAsync(parcel.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        static class Proxy implements androidx.work.multiprocess.IWorkManagerImpl {
            private android.os.IBinder getHighSpeedVideoSizes;

            Proxy(android.os.IBinder iBinder) {
                this.getHighSpeedVideoSizes = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.getHighSpeedVideoSizes;
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void enqueueWorkRequests(byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongInterface(iWorkManagerImplCallback);
                    this.getHighSpeedVideoSizes.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void updateUniquePeriodicWorkRequest(java.lang.String str, byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongInterface(iWorkManagerImplCallback);
                    this.getHighSpeedVideoSizes.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void enqueueContinuation(byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongInterface(iWorkManagerImplCallback);
                    this.getHighSpeedVideoSizes.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void cancelWorkById(java.lang.String str, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(iWorkManagerImplCallback);
                    this.getHighSpeedVideoSizes.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void cancelAllWorkByTag(java.lang.String str, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(iWorkManagerImplCallback);
                    this.getHighSpeedVideoSizes.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void cancelUniqueWork(java.lang.String str, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(iWorkManagerImplCallback);
                    this.getHighSpeedVideoSizes.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void cancelAllWork(androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeStrongInterface(iWorkManagerImplCallback);
                    this.getHighSpeedVideoSizes.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void queryWorkInfo(byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongInterface(iWorkManagerImplCallback);
                    this.getHighSpeedVideoSizes.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void setProgress(byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongInterface(iWorkManagerImplCallback);
                    this.getHighSpeedVideoSizes.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void setForegroundAsync(byte[] bArr, androidx.work.multiprocess.IWorkManagerImplCallback iWorkManagerImplCallback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongInterface(iWorkManagerImplCallback);
                    this.getHighSpeedVideoSizes.transact(10, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
