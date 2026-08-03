package androidx.work.multiprocess;

/* loaded from: classes2.dex */
public interface IWorkManagerImplCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx.work.multiprocess.IWorkManagerImplCallback";

    public static class Default implements androidx.work.multiprocess.IWorkManagerImplCallback {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.IWorkManagerImplCallback
        public void onFailure(java.lang.String error) throws android.os.RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImplCallback
        public void onSuccess(byte[] response) throws android.os.RemoteException {
        }
    }

    void onFailure(java.lang.String error) throws android.os.RemoteException;

    void onSuccess(byte[] response) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements androidx.work.multiprocess.IWorkManagerImplCallback {
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onSuccess = 1;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, androidx.work.multiprocess.IWorkManagerImplCallback.DESCRIPTOR);
        }

        public static androidx.work.multiprocess.IWorkManagerImplCallback asInterface(android.os.IBinder obj) {
            if (obj == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = obj.queryLocalInterface(androidx.work.multiprocess.IWorkManagerImplCallback.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof androidx.work.multiprocess.IWorkManagerImplCallback)) {
                return (androidx.work.multiprocess.IWorkManagerImplCallback) queryLocalInterface;
            }
            return new androidx.work.multiprocess.IWorkManagerImplCallback.Stub.Proxy(obj);
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
            if (code >= 1 && code <= 16777215) {
                data.enforceInterface(androidx.work.multiprocess.IWorkManagerImplCallback.DESCRIPTOR);
            }
            if (code == 1598968902) {
                reply.writeString(androidx.work.multiprocess.IWorkManagerImplCallback.DESCRIPTOR);
                return true;
            }
            if (code == 1) {
                onSuccess(data.createByteArray());
            } else if (code == 2) {
                onFailure(data.readString());
            } else {
                return super.onTransact(code, data, reply, flags);
            }
            return true;
        }

        private static class Proxy implements androidx.work.multiprocess.IWorkManagerImplCallback {
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder remote) {
                this.mRemote = remote;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return androidx.work.multiprocess.IWorkManagerImplCallback.DESCRIPTOR;
            }

            @Override // androidx.work.multiprocess.IWorkManagerImplCallback
            public void onSuccess(byte[] response) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.work.multiprocess.IWorkManagerImplCallback.DESCRIPTOR);
                    obtain.writeByteArray(response);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImplCallback
            public void onFailure(java.lang.String error) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.work.multiprocess.IWorkManagerImplCallback.DESCRIPTOR);
                    obtain.writeString(error);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
