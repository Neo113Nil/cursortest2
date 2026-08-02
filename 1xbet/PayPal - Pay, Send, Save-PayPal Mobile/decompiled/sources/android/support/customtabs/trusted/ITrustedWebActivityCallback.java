package android.support.customtabs.trusted;

/* loaded from: classes5.dex */
public interface ITrustedWebActivityCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android$support$customtabs$trusted$ITrustedWebActivityCallback".replace(kotlin.text.Typography.dollar, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
    public static final int VERSION = 1;

    public static class Default implements android.support.customtabs.trusted.ITrustedWebActivityCallback {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityCallback
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityCallback
        public void onExtraCallback(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        }
    }

    int getInterfaceVersion() throws android.os.RemoteException;

    void onExtraCallback(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.support.customtabs.trusted.ITrustedWebActivityCallback {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static android.support.customtabs.trusted.ITrustedWebActivityCallback asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof android.support.customtabs.trusted.ITrustedWebActivityCallback)) {
                return (android.support.customtabs.trusted.ITrustedWebActivityCallback) queryLocalInterface;
            }
            return new android.support.customtabs.trusted.ITrustedWebActivityCallback.Stub.Proxy(iBinder);
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
                onExtraCallback(parcel.readString(), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        static class Proxy implements android.support.customtabs.trusted.ITrustedWebActivityCallback {
            private int getHighResolutionOutputSizeshNQ4ISI = -1;
            private android.os.IBinder getHighSpeedVideoFpsRanges;

            Proxy(android.os.IBinder iBinder) {
                this.getHighSpeedVideoFpsRanges = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.getHighSpeedVideoFpsRanges;
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityCallback
            public void onExtraCallback(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeTypedObject(bundle, 0);
                    if (!this.getHighSpeedVideoFpsRanges.transact(2, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method onExtraCallback is unimplemented.");
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityCallback
            public int getInterfaceVersion() throws android.os.RemoteException {
                if (this.getHighResolutionOutputSizeshNQ4ISI == -1) {
                    android.os.Parcel obtain = android.os.Parcel.obtain();
                    android.os.Parcel obtain2 = android.os.Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(DESCRIPTOR);
                        this.getHighSpeedVideoFpsRanges.transact(16777215, obtain, obtain2, 0);
                        obtain2.readException();
                        this.getHighResolutionOutputSizeshNQ4ISI = obtain2.readInt();
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }
        }
    }
}
