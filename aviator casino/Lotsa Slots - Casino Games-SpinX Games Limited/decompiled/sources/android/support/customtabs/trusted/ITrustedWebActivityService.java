package android.support.customtabs.trusted;

/* loaded from: classes.dex */
public interface ITrustedWebActivityService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android$support$customtabs$trusted$ITrustedWebActivityService".replace(kotlin.text.Typography.dollar, '.');

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

    android.os.Bundle getSmallIconBitmap() throws android.os.RemoteException;

    int getSmallIconId() throws android.os.RemoteException;

    android.os.Bundle notifyNotificationWithChannel(android.os.Bundle bundle) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.support.customtabs.trusted.ITrustedWebActivityService {
        static final int TRANSACTION_areNotificationsEnabled = 6;
        static final int TRANSACTION_cancelNotification = 3;
        static final int TRANSACTION_extraCommand = 9;
        static final int TRANSACTION_getActiveNotifications = 5;
        static final int TRANSACTION_getSmallIconBitmap = 7;
        static final int TRANSACTION_getSmallIconId = 4;
        static final int TRANSACTION_notifyNotificationWithChannel = 2;

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
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    android.os.Bundle notifyNotificationWithChannel = notifyNotificationWithChannel((android.os.Bundle) android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.writeTypedObject(parcel2, notifyNotificationWithChannel, 1);
                    return true;
                case 3:
                    cancelNotification((android.os.Bundle) android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
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
                    android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.writeTypedObject(parcel2, activeNotifications, 1);
                    return true;
                case 6:
                    android.os.Bundle areNotificationsEnabled = areNotificationsEnabled((android.os.Bundle) android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.writeTypedObject(parcel2, areNotificationsEnabled, 1);
                    return true;
                case 7:
                    android.os.Bundle smallIconBitmap = getSmallIconBitmap();
                    parcel2.writeNoException();
                    android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.writeTypedObject(parcel2, smallIconBitmap, 1);
                    return true;
                case 8:
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
                case 9:
                    android.os.Bundle extraCommand = extraCommand(parcel.readString(), (android.os.Bundle) android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.writeTypedObject(parcel2, extraCommand, 1);
                    return true;
            }
        }

        private static class Proxy implements android.support.customtabs.trusted.ITrustedWebActivityService {
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public android.os.Bundle areNotificationsEnabled(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return (android.os.Bundle) android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.readTypedObject(obtain2, android.os.Bundle.CREATOR);
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
                    android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return (android.os.Bundle) android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.readTypedObject(obtain2, android.os.Bundle.CREATOR);
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
                    android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(3, obtain, obtain2, 0);
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
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return (android.os.Bundle) android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.readTypedObject(obtain2, android.os.Bundle.CREATOR);
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
                    this.mRemote.transact(4, obtain, obtain2, 0);
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
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return (android.os.Bundle) android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.readTypedObject(obtain2, android.os.Bundle.CREATOR);
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
                    android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.writeTypedObject(obtain, bundle, 0);
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return (android.os.Bundle) android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.readTypedObject(obtain2, android.os.Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(android.os.Parcel parcel, android.os.Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends android.os.Parcelable> void writeTypedObject(android.os.Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
