package androidx.work.multiprocess;

/* loaded from: classes2.dex */
public interface IWorkManagerImpl extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx.work.multiprocess.IWorkManagerImpl";

    public static class Default implements androidx.work.multiprocess.IWorkManagerImpl {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void cancelAllWork(androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void cancelAllWorkByTag(java.lang.String tag, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void cancelUniqueWork(java.lang.String name, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void cancelWorkById(java.lang.String id, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void enqueueContinuation(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void enqueueWorkRequests(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void queryWorkInfo(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void setForegroundAsync(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void setProgress(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImpl
        public void updateUniquePeriodicWorkRequest(java.lang.String name, byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
        }
    }

    void cancelAllWork(androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException;

    void cancelAllWorkByTag(java.lang.String tag, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException;

    void cancelUniqueWork(java.lang.String name, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException;

    void cancelWorkById(java.lang.String id, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException;

    void enqueueContinuation(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException;

    void enqueueWorkRequests(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException;

    void queryWorkInfo(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException;

    void setForegroundAsync(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException;

    void setProgress(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException;

    void updateUniquePeriodicWorkRequest(java.lang.String name, byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements androidx.work.multiprocess.IWorkManagerImpl {
        static final int TRANSACTION_cancelAllWork = 7;
        static final int TRANSACTION_cancelAllWorkByTag = 5;
        static final int TRANSACTION_cancelUniqueWork = 6;
        static final int TRANSACTION_cancelWorkById = 4;
        static final int TRANSACTION_enqueueContinuation = 3;
        static final int TRANSACTION_enqueueWorkRequests = 1;
        static final int TRANSACTION_queryWorkInfo = 8;
        static final int TRANSACTION_setForegroundAsync = 10;
        static final int TRANSACTION_setProgress = 9;
        static final int TRANSACTION_updateUniquePeriodicWorkRequest = 2;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, androidx.work.multiprocess.IWorkManagerImpl.DESCRIPTOR);
        }

        public static androidx.work.multiprocess.IWorkManagerImpl asInterface(android.os.IBinder obj) {
            if (obj == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = obj.queryLocalInterface(androidx.work.multiprocess.IWorkManagerImpl.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof androidx.work.multiprocess.IWorkManagerImpl)) {
                return (androidx.work.multiprocess.IWorkManagerImpl) queryLocalInterface;
            }
            return new androidx.work.multiprocess.IWorkManagerImpl.Stub.Proxy(obj);
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
            if (code >= 1 && code <= 16777215) {
                data.enforceInterface(androidx.work.multiprocess.IWorkManagerImpl.DESCRIPTOR);
            }
            if (code == 1598968902) {
                reply.writeString(androidx.work.multiprocess.IWorkManagerImpl.DESCRIPTOR);
                return true;
            }
            switch (code) {
                case 1:
                    enqueueWorkRequests(data.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(data.readStrongBinder()));
                    return true;
                case 2:
                    updateUniquePeriodicWorkRequest(data.readString(), data.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(data.readStrongBinder()));
                    return true;
                case 3:
                    enqueueContinuation(data.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(data.readStrongBinder()));
                    return true;
                case 4:
                    cancelWorkById(data.readString(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(data.readStrongBinder()));
                    return true;
                case 5:
                    cancelAllWorkByTag(data.readString(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(data.readStrongBinder()));
                    return true;
                case 6:
                    cancelUniqueWork(data.readString(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(data.readStrongBinder()));
                    return true;
                case 7:
                    cancelAllWork(androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(data.readStrongBinder()));
                    return true;
                case 8:
                    queryWorkInfo(data.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(data.readStrongBinder()));
                    return true;
                case 9:
                    setProgress(data.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(data.readStrongBinder()));
                    return true;
                case 10:
                    setForegroundAsync(data.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(data.readStrongBinder()));
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }

        private static class Proxy implements androidx.work.multiprocess.IWorkManagerImpl {
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder remote) {
                this.mRemote = remote;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return androidx.work.multiprocess.IWorkManagerImpl.DESCRIPTOR;
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void enqueueWorkRequests(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.work.multiprocess.IWorkManagerImpl.DESCRIPTOR);
                    obtain.writeByteArray(request);
                    obtain.writeStrongInterface(callback);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void updateUniquePeriodicWorkRequest(java.lang.String name, byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.work.multiprocess.IWorkManagerImpl.DESCRIPTOR);
                    obtain.writeString(name);
                    obtain.writeByteArray(request);
                    obtain.writeStrongInterface(callback);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void enqueueContinuation(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.work.multiprocess.IWorkManagerImpl.DESCRIPTOR);
                    obtain.writeByteArray(request);
                    obtain.writeStrongInterface(callback);
                    this.mRemote.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void cancelWorkById(java.lang.String id, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.work.multiprocess.IWorkManagerImpl.DESCRIPTOR);
                    obtain.writeString(id);
                    obtain.writeStrongInterface(callback);
                    this.mRemote.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void cancelAllWorkByTag(java.lang.String tag, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.work.multiprocess.IWorkManagerImpl.DESCRIPTOR);
                    obtain.writeString(tag);
                    obtain.writeStrongInterface(callback);
                    this.mRemote.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void cancelUniqueWork(java.lang.String name, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.work.multiprocess.IWorkManagerImpl.DESCRIPTOR);
                    obtain.writeString(name);
                    obtain.writeStrongInterface(callback);
                    this.mRemote.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void cancelAllWork(androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.work.multiprocess.IWorkManagerImpl.DESCRIPTOR);
                    obtain.writeStrongInterface(callback);
                    this.mRemote.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void queryWorkInfo(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.work.multiprocess.IWorkManagerImpl.DESCRIPTOR);
                    obtain.writeByteArray(request);
                    obtain.writeStrongInterface(callback);
                    this.mRemote.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void setProgress(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.work.multiprocess.IWorkManagerImpl.DESCRIPTOR);
                    obtain.writeByteArray(request);
                    obtain.writeStrongInterface(callback);
                    this.mRemote.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImpl
            public void setForegroundAsync(byte[] request, androidx.work.multiprocess.IWorkManagerImplCallback callback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.work.multiprocess.IWorkManagerImpl.DESCRIPTOR);
                    obtain.writeByteArray(request);
                    obtain.writeStrongInterface(callback);
                    this.mRemote.transact(10, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
