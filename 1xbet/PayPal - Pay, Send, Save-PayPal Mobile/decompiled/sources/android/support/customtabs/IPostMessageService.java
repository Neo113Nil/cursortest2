package android.support.customtabs;

/* loaded from: classes5.dex */
public interface IPostMessageService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android$support$customtabs$IPostMessageService".replace(kotlin.text.Typography.dollar, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
    public static final int VERSION = 1;

    public static class Default implements android.support.customtabs.IPostMessageService {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.IPostMessageService
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // android.support.customtabs.IPostMessageService
        public void onMessageChannelReady(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.IPostMessageService
        public void onPostMessage(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        }
    }

    int getInterfaceVersion() throws android.os.RemoteException;

    void onMessageChannelReady(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException;

    void onPostMessage(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.support.customtabs.IPostMessageService {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static android.support.customtabs.IPostMessageService asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof android.support.customtabs.IPostMessageService)) {
                return (android.support.customtabs.IPostMessageService) queryLocalInterface;
            }
            return new android.support.customtabs.IPostMessageService.Stub.Proxy(iBinder);
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
            if (i == 16777215) {
                parcel2.writeNoException();
                parcel2.writeInt(getInterfaceVersion());
                return true;
            }
            if (i == 2) {
                onMessageChannelReady(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                parcel2.writeNoException();
            } else if (i == 3) {
                onPostMessage(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                parcel2.writeNoException();
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        static class Proxy implements android.support.customtabs.IPostMessageService {
            private android.os.IBinder getHighSpeedVideoFpsRangesFor;
            private int getHighSpeedVideoSizes = -1;

            Proxy(android.os.IBinder iBinder) {
                this.getHighSpeedVideoFpsRangesFor = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.getHighSpeedVideoFpsRangesFor;
            }

            @Override // android.support.customtabs.IPostMessageService
            public void onMessageChannelReady(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    obtain.writeTypedObject(bundle, 0);
                    if (!this.getHighSpeedVideoFpsRangesFor.transact(2, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method onMessageChannelReady is unimplemented.");
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.IPostMessageService
            public void onPostMessage(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    obtain.writeString(str);
                    obtain.writeTypedObject(bundle, 0);
                    if (!this.getHighSpeedVideoFpsRangesFor.transact(3, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method onPostMessage is unimplemented.");
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.IPostMessageService
            public int getInterfaceVersion() throws android.os.RemoteException {
                if (this.getHighSpeedVideoSizes == -1) {
                    android.os.Parcel obtain = android.os.Parcel.obtain();
                    android.os.Parcel obtain2 = android.os.Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(DESCRIPTOR);
                        this.getHighSpeedVideoFpsRangesFor.transact(16777215, obtain, obtain2, 0);
                        obtain2.readException();
                        this.getHighSpeedVideoSizes = obtain2.readInt();
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }
                return this.getHighSpeedVideoSizes;
            }
        }
    }
}
