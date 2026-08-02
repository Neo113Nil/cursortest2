package androidx.room;

/* loaded from: classes3.dex */
public interface IMultiInstanceInvalidationService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx$room$IMultiInstanceInvalidationService".replace(kotlin.text.Typography.dollar, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);

    /* loaded from: classes7.dex */
    public static class Default implements androidx.room.IMultiInstanceInvalidationService {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void broadcastInvalidation(int i, java.lang.String[] strArr) throws android.os.RemoteException {
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public int registerCallback(androidx.room.IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, java.lang.String str) throws android.os.RemoteException {
            return 0;
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void unregisterCallback(androidx.room.IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i) throws android.os.RemoteException {
        }
    }

    void broadcastInvalidation(int i, java.lang.String[] strArr) throws android.os.RemoteException;

    int registerCallback(androidx.room.IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, java.lang.String str) throws android.os.RemoteException;

    void unregisterCallback(androidx.room.IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements androidx.room.IMultiInstanceInvalidationService {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static androidx.room.IMultiInstanceInvalidationService asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof androidx.room.IMultiInstanceInvalidationService)) {
                return (androidx.room.IMultiInstanceInvalidationService) queryLocalInterface;
            }
            return new androidx.room.IMultiInstanceInvalidationService.Stub.Proxy(iBinder);
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
                int registerCallback = registerCallback(androidx.room.IMultiInstanceInvalidationCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(registerCallback);
            } else if (i == 2) {
                unregisterCallback(androidx.room.IMultiInstanceInvalidationCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else if (i == 3) {
                broadcastInvalidation(parcel.readInt(), parcel.createStringArray());
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        static class Proxy implements androidx.room.IMultiInstanceInvalidationService {
            private android.os.IBinder getHighSpeedVideoFpsRangesFor;

            Proxy(android.os.IBinder iBinder) {
                this.getHighSpeedVideoFpsRangesFor = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.getHighSpeedVideoFpsRangesFor;
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            public int registerCallback(androidx.room.IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, java.lang.String str) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeStrongInterface(iMultiInstanceInvalidationCallback);
                    obtain.writeString(str);
                    this.getHighSpeedVideoFpsRangesFor.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            public void unregisterCallback(androidx.room.IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeStrongInterface(iMultiInstanceInvalidationCallback);
                    obtain.writeInt(i);
                    this.getHighSpeedVideoFpsRangesFor.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            public void broadcastInvalidation(int i, java.lang.String[] strArr) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    this.getHighSpeedVideoFpsRangesFor.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
