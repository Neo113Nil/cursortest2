package androidx.room;

/* loaded from: classes3.dex */
public interface IMultiInstanceInvalidationCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx$room$IMultiInstanceInvalidationCallback".replace(kotlin.text.Typography.dollar, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);

    /* loaded from: classes7.dex */
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
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static androidx.room.IMultiInstanceInvalidationCallback asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof androidx.room.IMultiInstanceInvalidationCallback)) {
                return (androidx.room.IMultiInstanceInvalidationCallback) queryLocalInterface;
            }
            return new androidx.room.IMultiInstanceInvalidationCallback.Stub.Proxy(iBinder);
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
                onInvalidation(parcel.createStringArray());
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        static class Proxy implements androidx.room.IMultiInstanceInvalidationCallback {
            private android.os.IBinder Camera2StreamConfigurationMap;

            Proxy(android.os.IBinder iBinder) {
                this.Camera2StreamConfigurationMap = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.Camera2StreamConfigurationMap;
            }

            @Override // androidx.room.IMultiInstanceInvalidationCallback
            public void onInvalidation(java.lang.String[] strArr) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeStringArray(strArr);
                    this.Camera2StreamConfigurationMap.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
