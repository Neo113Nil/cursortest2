package android.support.customtabs;

/* loaded from: classes5.dex */
public interface IAuthTabCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android$support$customtabs$IAuthTabCallback".replace(kotlin.text.Typography.dollar, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
    public static final int VERSION = 1;

    public static class Default implements android.support.customtabs.IAuthTabCallback {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public void onExtraCallback(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public android.os.Bundle onExtraCallbackWithResult(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public void onNavigationEvent(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public void onWarmupCompleted(android.os.Bundle bundle) throws android.os.RemoteException {
        }
    }

    int getInterfaceVersion() throws android.os.RemoteException;

    void onExtraCallback(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    android.os.Bundle onExtraCallbackWithResult(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    void onNavigationEvent(int i, android.os.Bundle bundle) throws android.os.RemoteException;

    void onWarmupCompleted(android.os.Bundle bundle) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.support.customtabs.IAuthTabCallback {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static android.support.customtabs.IAuthTabCallback asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof android.support.customtabs.IAuthTabCallback)) {
                return (android.support.customtabs.IAuthTabCallback) queryLocalInterface;
            }
            return new android.support.customtabs.IAuthTabCallback.Stub.Proxy(iBinder);
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
                onNavigationEvent(parcel.readInt(), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
            } else if (i == 3) {
                onExtraCallback(parcel.readString(), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
            } else if (i == 4) {
                android.os.Bundle onExtraCallbackWithResult = onExtraCallbackWithResult(parcel.readString(), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedObject(onExtraCallbackWithResult, 1);
            } else if (i == 5) {
                onWarmupCompleted((android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        static class Proxy implements android.support.customtabs.IAuthTabCallback {
            private android.os.IBinder getHighResolutionOutputSizeshNQ4ISI;
            private int getHighSpeedVideoSizes = -1;

            Proxy(android.os.IBinder iBinder) {
                this.getHighResolutionOutputSizeshNQ4ISI = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            @Override // android.support.customtabs.IAuthTabCallback
            public void onNavigationEvent(int i, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeTypedObject(bundle, 0);
                    if (this.getHighResolutionOutputSizeshNQ4ISI.transact(2, obtain, null, 1)) {
                    } else {
                        throw new android.os.RemoteException("Method onNavigationEvent is unimplemented.");
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.IAuthTabCallback
            public void onExtraCallback(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeTypedObject(bundle, 0);
                    if (this.getHighResolutionOutputSizeshNQ4ISI.transact(3, obtain, null, 1)) {
                    } else {
                        throw new android.os.RemoteException("Method onExtraCallback is unimplemented.");
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.IAuthTabCallback
            public android.os.Bundle onExtraCallbackWithResult(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeTypedObject(bundle, 0);
                    if (!this.getHighResolutionOutputSizeshNQ4ISI.transact(4, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method onExtraCallbackWithResult is unimplemented.");
                    }
                    obtain2.readException();
                    return (android.os.Bundle) obtain2.readTypedObject(android.os.Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.IAuthTabCallback
            public void onWarmupCompleted(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeTypedObject(bundle, 0);
                    if (this.getHighResolutionOutputSizeshNQ4ISI.transact(5, obtain, null, 1)) {
                    } else {
                        throw new android.os.RemoteException("Method onWarmupCompleted is unimplemented.");
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.IAuthTabCallback
            public int getInterfaceVersion() throws android.os.RemoteException {
                if (this.getHighSpeedVideoSizes == -1) {
                    android.os.Parcel obtain = android.os.Parcel.obtain();
                    android.os.Parcel obtain2 = android.os.Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(DESCRIPTOR);
                        this.getHighResolutionOutputSizeshNQ4ISI.transact(16777215, obtain, obtain2, 0);
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
