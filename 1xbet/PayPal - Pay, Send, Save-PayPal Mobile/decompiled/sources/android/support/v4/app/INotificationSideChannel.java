package android.support.v4.app;

/* loaded from: classes5.dex */
public interface INotificationSideChannel extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android$support$v4$app$INotificationSideChannel".replace(kotlin.text.Typography.dollar, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);

    public static class Default implements android.support.v4.app.INotificationSideChannel {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancel(java.lang.String str, int i, java.lang.String str2) throws android.os.RemoteException {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancelAll(java.lang.String str) throws android.os.RemoteException {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void notify(java.lang.String str, int i, java.lang.String str2, android.app.Notification notification) throws android.os.RemoteException {
        }
    }

    void cancel(java.lang.String str, int i, java.lang.String str2) throws android.os.RemoteException;

    void cancelAll(java.lang.String str) throws android.os.RemoteException;

    void notify(java.lang.String str, int i, java.lang.String str2, android.app.Notification notification) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.support.v4.app.INotificationSideChannel {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static android.support.v4.app.INotificationSideChannel asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof android.support.v4.app.INotificationSideChannel)) {
                return (android.support.v4.app.INotificationSideChannel) queryLocalInterface;
            }
            return new android.support.v4.app.INotificationSideChannel.Stub.Proxy(iBinder);
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
                notify(parcel.readString(), parcel.readInt(), parcel.readString(), (android.app.Notification) parcel.readTypedObject(android.app.Notification.CREATOR));
            } else if (i == 2) {
                cancel(parcel.readString(), parcel.readInt(), parcel.readString());
            } else if (i == 3) {
                cancelAll(parcel.readString());
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        static class Proxy implements android.support.v4.app.INotificationSideChannel {
            private android.os.IBinder getHighResolutionOutputSizeshNQ4ISI;

            Proxy(android.os.IBinder iBinder) {
                this.getHighResolutionOutputSizeshNQ4ISI = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void notify(java.lang.String str, int i, java.lang.String str2, android.app.Notification notification) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    obtain.writeTypedObject(notification, 0);
                    this.getHighResolutionOutputSizeshNQ4ISI.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void cancel(java.lang.String str, int i, java.lang.String str2) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.getHighResolutionOutputSizeshNQ4ISI.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void cancelAll(java.lang.String str) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeString(str);
                    this.getHighResolutionOutputSizeshNQ4ISI.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
