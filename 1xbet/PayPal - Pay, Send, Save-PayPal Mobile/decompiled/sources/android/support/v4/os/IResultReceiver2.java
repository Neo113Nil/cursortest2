package android.support.v4.os;

/* loaded from: classes5.dex */
public interface IResultReceiver2 extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android$support$v4$os$IResultReceiver2".replace(kotlin.text.Typography.dollar, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);

    public static class Default implements android.support.v4.os.IResultReceiver2 {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.os.IResultReceiver2
        public void send(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        }
    }

    void send(int i, android.os.Bundle bundle) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.support.v4.os.IResultReceiver2 {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static android.support.v4.os.IResultReceiver2 asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof android.support.v4.os.IResultReceiver2)) {
                return (android.support.v4.os.IResultReceiver2) queryLocalInterface;
            }
            return new android.support.v4.os.IResultReceiver2.Stub.Proxy(iBinder);
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
                send(parcel.readInt(), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        static class Proxy implements android.support.v4.os.IResultReceiver2 {
            private android.os.IBinder getHighSpeedVideoSizes;

            Proxy(android.os.IBinder iBinder) {
                this.getHighSpeedVideoSizes = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.getHighSpeedVideoSizes;
            }

            @Override // android.support.v4.os.IResultReceiver2
            public void send(int i, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeTypedObject(bundle, 0);
                    this.getHighSpeedVideoSizes.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
