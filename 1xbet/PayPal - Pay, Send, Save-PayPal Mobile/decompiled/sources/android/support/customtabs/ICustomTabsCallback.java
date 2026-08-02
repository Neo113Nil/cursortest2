package android.support.customtabs;

/* loaded from: classes5.dex */
public interface ICustomTabsCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android$support$customtabs$ICustomTabsCallback".replace(kotlin.text.Typography.dollar, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
    public static final int VERSION = 1;

    public static class Default implements android.support.customtabs.ICustomTabsCallback {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void extraCallback(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public android.os.Bundle extraCallbackWithResult(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityLayout(int i, int i2, int i3, int i4, int i5, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityResized(int i, int i2, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMessageChannelReady(android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMinimized(android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onNavigationEvent(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onPostMessage(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onRelationshipValidationResult(int i, android.net.Uri uri, boolean z, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onUnminimized(android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onWarmupCompleted(android.os.Bundle bundle) throws android.os.RemoteException {
        }
    }

    void extraCallback(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    android.os.Bundle extraCallbackWithResult(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    int getInterfaceVersion() throws android.os.RemoteException;

    void onActivityLayout(int i, int i2, int i3, int i4, int i5, android.os.Bundle bundle) throws android.os.RemoteException;

    void onActivityResized(int i, int i2, android.os.Bundle bundle) throws android.os.RemoteException;

    void onMessageChannelReady(android.os.Bundle bundle) throws android.os.RemoteException;

    void onMinimized(android.os.Bundle bundle) throws android.os.RemoteException;

    void onNavigationEvent(int i, android.os.Bundle bundle) throws android.os.RemoteException;

    void onPostMessage(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    void onRelationshipValidationResult(int i, android.net.Uri uri, boolean z, android.os.Bundle bundle) throws android.os.RemoteException;

    void onUnminimized(android.os.Bundle bundle) throws android.os.RemoteException;

    void onWarmupCompleted(android.os.Bundle bundle) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.support.customtabs.ICustomTabsCallback {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static android.support.customtabs.ICustomTabsCallback asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof android.support.customtabs.ICustomTabsCallback)) {
                return (android.support.customtabs.ICustomTabsCallback) queryLocalInterface;
            }
            return new android.support.customtabs.ICustomTabsCallback.Stub.Proxy(iBinder);
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
            switch (i) {
                case 2:
                    onNavigationEvent(parcel.readInt(), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    return true;
                case 3:
                    extraCallback(parcel.readString(), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    return true;
                case 4:
                    onMessageChannelReady((android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    onPostMessage(parcel.readString(), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    onRelationshipValidationResult(parcel.readInt(), (android.net.Uri) parcel.readTypedObject(android.net.Uri.CREATOR), parcel.readInt() != 0, (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    return true;
                case 7:
                    android.os.Bundle extraCallbackWithResult = extraCallbackWithResult(parcel.readString(), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeTypedObject(extraCallbackWithResult, 1);
                    return true;
                case 8:
                    onActivityResized(parcel.readInt(), parcel.readInt(), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    return true;
                case 9:
                    onWarmupCompleted((android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    return true;
                case 10:
                    onActivityLayout(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    return true;
                case 11:
                    onMinimized((android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    return true;
                case 12:
                    onUnminimized((android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        static class Proxy implements android.support.customtabs.ICustomTabsCallback {
            private int Camera2StreamConfigurationMap = -1;
            private android.os.IBinder getHighSpeedVideoSizes;

            Proxy(android.os.IBinder iBinder) {
                this.getHighSpeedVideoSizes = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.getHighSpeedVideoSizes;
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onNavigationEvent(int i, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeTypedObject(bundle, 0);
                    if (this.getHighSpeedVideoSizes.transact(2, obtain, null, 1)) {
                    } else {
                        throw new android.os.RemoteException("Method onNavigationEvent is unimplemented.");
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void extraCallback(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeTypedObject(bundle, 0);
                    if (this.getHighSpeedVideoSizes.transact(3, obtain, null, 1)) {
                    } else {
                        throw new android.os.RemoteException("Method extraCallback is unimplemented.");
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onMessageChannelReady(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeTypedObject(bundle, 0);
                    if (!this.getHighSpeedVideoSizes.transact(4, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method onMessageChannelReady is unimplemented.");
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onPostMessage(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeTypedObject(bundle, 0);
                    if (!this.getHighSpeedVideoSizes.transact(5, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method onPostMessage is unimplemented.");
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onRelationshipValidationResult(int i, android.net.Uri uri, boolean z, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeTypedObject(uri, 0);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeTypedObject(bundle, 0);
                    if (this.getHighSpeedVideoSizes.transact(6, obtain, null, 1)) {
                    } else {
                        throw new android.os.RemoteException("Method onRelationshipValidationResult is unimplemented.");
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public android.os.Bundle extraCallbackWithResult(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeTypedObject(bundle, 0);
                    if (!this.getHighSpeedVideoSizes.transact(7, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method extraCallbackWithResult is unimplemented.");
                    }
                    obtain2.readException();
                    return (android.os.Bundle) obtain2.readTypedObject(android.os.Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onActivityResized(int i, int i2, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeTypedObject(bundle, 0);
                    if (this.getHighSpeedVideoSizes.transact(8, obtain, null, 1)) {
                    } else {
                        throw new android.os.RemoteException("Method onActivityResized is unimplemented.");
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onWarmupCompleted(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeTypedObject(bundle, 0);
                    if (this.getHighSpeedVideoSizes.transact(9, obtain, null, 1)) {
                    } else {
                        throw new android.os.RemoteException("Method onWarmupCompleted is unimplemented.");
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onActivityLayout(int i, int i2, int i3, int i4, int i5, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    obtain.writeTypedObject(bundle, 0);
                    if (this.getHighSpeedVideoSizes.transact(10, obtain, null, 1)) {
                    } else {
                        throw new android.os.RemoteException("Method onActivityLayout is unimplemented.");
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onMinimized(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeTypedObject(bundle, 0);
                    if (this.getHighSpeedVideoSizes.transact(11, obtain, null, 1)) {
                    } else {
                        throw new android.os.RemoteException("Method onMinimized is unimplemented.");
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onUnminimized(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeTypedObject(bundle, 0);
                    if (this.getHighSpeedVideoSizes.transact(12, obtain, null, 1)) {
                    } else {
                        throw new android.os.RemoteException("Method onUnminimized is unimplemented.");
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public int getInterfaceVersion() throws android.os.RemoteException {
                if (this.Camera2StreamConfigurationMap == -1) {
                    android.os.Parcel obtain = android.os.Parcel.obtain();
                    android.os.Parcel obtain2 = android.os.Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(DESCRIPTOR);
                        this.getHighSpeedVideoSizes.transact(16777215, obtain, obtain2, 0);
                        obtain2.readException();
                        this.Camera2StreamConfigurationMap = obtain2.readInt();
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }
                return this.Camera2StreamConfigurationMap;
            }
        }
    }
}
