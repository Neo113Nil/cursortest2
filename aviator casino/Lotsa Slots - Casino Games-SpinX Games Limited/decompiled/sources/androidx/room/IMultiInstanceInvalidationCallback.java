package androidx.room;

/* loaded from: classes2.dex */
public interface IMultiInstanceInvalidationCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx.room.IMultiInstanceInvalidationCallback";

    public static class Default implements androidx.room.IMultiInstanceInvalidationCallback {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.IMultiInstanceInvalidationCallback
        public void onInvalidation(java.lang.String[] strArr) throws android.os.RemoteException {
        }
    }

    void onInvalidation(java.lang.String[] strArr) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements androidx.room.IMultiInstanceInvalidationCallback {
        static final int TRANSACTION_onInvalidation = 1;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, androidx.room.IMultiInstanceInvalidationCallback.DESCRIPTOR);
        }

        public static androidx.room.IMultiInstanceInvalidationCallback asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(androidx.room.IMultiInstanceInvalidationCallback.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof androidx.room.IMultiInstanceInvalidationCallback)) {
                return (androidx.room.IMultiInstanceInvalidationCallback) queryLocalInterface;
            }
            return new androidx.room.IMultiInstanceInvalidationCallback.Stub.Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(androidx.room.IMultiInstanceInvalidationCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(androidx.room.IMultiInstanceInvalidationCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onInvalidation(parcel.createStringArray());
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        private static class Proxy implements androidx.room.IMultiInstanceInvalidationCallback {
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return androidx.room.IMultiInstanceInvalidationCallback.DESCRIPTOR;
            }

            @Override // androidx.room.IMultiInstanceInvalidationCallback
            public void onInvalidation(java.lang.String[] strArr) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(androidx.room.IMultiInstanceInvalidationCallback.DESCRIPTOR);
                    obtain.writeStringArray(strArr);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
