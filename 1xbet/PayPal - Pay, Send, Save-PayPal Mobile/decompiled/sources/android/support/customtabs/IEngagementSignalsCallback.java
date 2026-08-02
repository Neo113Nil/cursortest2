package android.support.customtabs;

/* loaded from: classes5.dex */
public interface IEngagementSignalsCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android$support$customtabs$IEngagementSignalsCallback".replace(kotlin.text.Typography.dollar, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
    public static final int VERSION = 1;

    public static class Default implements android.support.customtabs.IEngagementSignalsCallback {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onGreatestScrollPercentageIncreased(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onSessionEnded(boolean z, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onVerticalScrollEvent(boolean z, android.os.Bundle bundle) throws android.os.RemoteException {
        }
    }

    int getInterfaceVersion() throws android.os.RemoteException;

    void onGreatestScrollPercentageIncreased(int i, android.os.Bundle bundle) throws android.os.RemoteException;

    void onSessionEnded(boolean z, android.os.Bundle bundle) throws android.os.RemoteException;

    void onVerticalScrollEvent(boolean z, android.os.Bundle bundle) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.support.customtabs.IEngagementSignalsCallback {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static android.support.customtabs.IEngagementSignalsCallback asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof android.support.customtabs.IEngagementSignalsCallback)) {
                return (android.support.customtabs.IEngagementSignalsCallback) queryLocalInterface;
            }
            return new android.support.customtabs.IEngagementSignalsCallback.Stub.Proxy(iBinder);
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
                onVerticalScrollEvent(parcel.readInt() != 0, (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
            } else if (i == 3) {
                onGreatestScrollPercentageIncreased(parcel.readInt(), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
            } else if (i == 4) {
                onSessionEnded(parcel.readInt() != 0, (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        static class Proxy implements android.support.customtabs.IEngagementSignalsCallback {
            private android.os.IBinder Camera2StreamConfigurationMap;
            private int getHighSpeedVideoFpsRanges = -1;

            Proxy(android.os.IBinder iBinder) {
                this.Camera2StreamConfigurationMap = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.Camera2StreamConfigurationMap;
            }

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public void onVerticalScrollEvent(boolean z, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeTypedObject(bundle, 0);
                    if (this.Camera2StreamConfigurationMap.transact(2, obtain, null, 1)) {
                    } else {
                        throw new android.os.RemoteException("Method onVerticalScrollEvent is unimplemented.");
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public void onGreatestScrollPercentageIncreased(int i, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeTypedObject(bundle, 0);
                    if (this.Camera2StreamConfigurationMap.transact(3, obtain, null, 1)) {
                    } else {
                        throw new android.os.RemoteException("Method onGreatestScrollPercentageIncreased is unimplemented.");
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public void onSessionEnded(boolean z, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeTypedObject(bundle, 0);
                    if (this.Camera2StreamConfigurationMap.transact(4, obtain, null, 1)) {
                    } else {
                        throw new android.os.RemoteException("Method onSessionEnded is unimplemented.");
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public int getInterfaceVersion() throws android.os.RemoteException {
                if (this.getHighSpeedVideoFpsRanges == -1) {
                    android.os.Parcel obtain = android.os.Parcel.obtain();
                    android.os.Parcel obtain2 = android.os.Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(DESCRIPTOR);
                        this.Camera2StreamConfigurationMap.transact(16777215, obtain, obtain2, 0);
                        obtain2.readException();
                        this.getHighSpeedVideoFpsRanges = obtain2.readInt();
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }
                return this.getHighSpeedVideoFpsRanges;
            }
        }
    }
}
