package android.support.customtabs.trusted;

/* loaded from: classes5.dex */
public interface ITrustedWebActivityService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android$support$customtabs$trusted$ITrustedWebActivityService".replace(kotlin.text.Typography.dollar, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
    public static final int VERSION = 1;

    public static class Default implements android.support.customtabs.trusted.ITrustedWebActivityService {
        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public android.os.Bundle areNotificationsEnabled(android.os.Bundle bundle) throws android.os.RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public void cancelNotification(android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public android.os.Bundle extraCommand(java.lang.String str, android.os.Bundle bundle, android.os.IBinder iBinder) throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public android.os.Bundle getActiveNotifications() throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public android.os.Bundle getSmallIconBitmap() throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public int getSmallIconId() throws android.os.RemoteException {
            return 0;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public android.os.Bundle notifyNotificationWithChannel(android.os.Bundle bundle) throws android.os.RemoteException {
            return null;
        }
    }

    android.os.Bundle areNotificationsEnabled(android.os.Bundle bundle) throws android.os.RemoteException;

    void cancelNotification(android.os.Bundle bundle) throws android.os.RemoteException;

    android.os.Bundle extraCommand(java.lang.String str, android.os.Bundle bundle, android.os.IBinder iBinder) throws android.os.RemoteException;

    android.os.Bundle getActiveNotifications() throws android.os.RemoteException;

    int getInterfaceVersion() throws android.os.RemoteException;

    android.os.Bundle getSmallIconBitmap() throws android.os.RemoteException;

    int getSmallIconId() throws android.os.RemoteException;

    android.os.Bundle notifyNotificationWithChannel(android.os.Bundle bundle) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.support.customtabs.trusted.ITrustedWebActivityService {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static android.support.customtabs.trusted.ITrustedWebActivityService asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof android.support.customtabs.trusted.ITrustedWebActivityService)) {
                return (android.support.customtabs.trusted.ITrustedWebActivityService) queryLocalInterface;
            }
            return new android.support.customtabs.trusted.ITrustedWebActivityService.Stub.Proxy(iBinder);
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
                    android.os.Bundle notifyNotificationWithChannel = notifyNotificationWithChannel((android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeTypedObject(notifyNotificationWithChannel, 1);
                    return true;
                case 3:
                    cancelNotification((android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    int smallIconId = getSmallIconId();
                    parcel2.writeNoException();
                    parcel2.writeInt(smallIconId);
                    return true;
                case 5:
                    android.os.Bundle activeNotifications = getActiveNotifications();
                    parcel2.writeNoException();
                    parcel2.writeTypedObject(activeNotifications, 1);
                    return true;
                case 6:
                    android.os.Bundle areNotificationsEnabled = areNotificationsEnabled((android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeTypedObject(areNotificationsEnabled, 1);
                    return true;
                case 7:
                    android.os.Bundle smallIconBitmap = getSmallIconBitmap();
                    parcel2.writeNoException();
                    parcel2.writeTypedObject(smallIconBitmap, 1);
                    return true;
                case 8:
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
                case 9:
                    android.os.Bundle extraCommand = extraCommand(parcel.readString(), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    parcel2.writeTypedObject(extraCommand, 1);
                    return true;
            }
        }

        static class Proxy implements android.support.customtabs.trusted.ITrustedWebActivityService {
            private int getHighSpeedVideoFpsRanges = -1;
            private android.os.IBinder getHighSpeedVideoSizes;

            Proxy(android.os.IBinder iBinder) {
                this.getHighSpeedVideoSizes = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.getHighSpeedVideoSizes;
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public android.os.Bundle areNotificationsEnabled(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeTypedObject(bundle, 0);
                    if (!this.getHighSpeedVideoSizes.transact(6, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method areNotificationsEnabled is unimplemented.");
                    }
                    obtain2.readException();
                    return (android.os.Bundle) obtain2.readTypedObject(android.os.Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public android.os.Bundle notifyNotificationWithChannel(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeTypedObject(bundle, 0);
                    if (!this.getHighSpeedVideoSizes.transact(2, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method notifyNotificationWithChannel is unimplemented.");
                    }
                    obtain2.readException();
                    return (android.os.Bundle) obtain2.readTypedObject(android.os.Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public void cancelNotification(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeTypedObject(bundle, 0);
                    if (!this.getHighSpeedVideoSizes.transact(3, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method cancelNotification is unimplemented.");
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public android.os.Bundle getActiveNotifications() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    if (!this.getHighSpeedVideoSizes.transact(5, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method getActiveNotifications is unimplemented.");
                    }
                    obtain2.readException();
                    return (android.os.Bundle) obtain2.readTypedObject(android.os.Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public int getSmallIconId() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    if (!this.getHighSpeedVideoSizes.transact(4, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method getSmallIconId is unimplemented.");
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public android.os.Bundle getSmallIconBitmap() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    if (!this.getHighSpeedVideoSizes.transact(7, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method getSmallIconBitmap is unimplemented.");
                    }
                    obtain2.readException();
                    return (android.os.Bundle) obtain2.readTypedObject(android.os.Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public android.os.Bundle extraCommand(java.lang.String str, android.os.Bundle bundle, android.os.IBinder iBinder) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeTypedObject(bundle, 0);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.getHighSpeedVideoSizes.transact(9, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method extraCommand is unimplemented.");
                    }
                    obtain2.readException();
                    return (android.os.Bundle) obtain2.readTypedObject(android.os.Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public int getInterfaceVersion() throws android.os.RemoteException {
                if (this.getHighSpeedVideoFpsRanges == -1) {
                    android.os.Parcel obtain = android.os.Parcel.obtain();
                    android.os.Parcel obtain2 = android.os.Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(DESCRIPTOR);
                        this.getHighSpeedVideoSizes.transact(16777215, obtain, obtain2, 0);
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
