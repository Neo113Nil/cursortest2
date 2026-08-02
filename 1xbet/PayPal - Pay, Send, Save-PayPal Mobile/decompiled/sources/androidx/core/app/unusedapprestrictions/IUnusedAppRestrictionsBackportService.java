package androidx.core.app.unusedapprestrictions;

/* loaded from: classes7.dex */
public interface IUnusedAppRestrictionsBackportService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace(kotlin.text.Typography.dollar, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);

    public static class Default implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
        public void isPermissionRevocationEnabledForApp(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) throws android.os.RemoteException {
        }
    }

    void isPermissionRevocationEnabledForApp(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService)) {
                return (androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService) queryLocalInterface;
            }
            return new androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub.Proxy(iBinder);
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
                isPermissionRevocationEnabledForApp(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub.asInterface(parcel.readStrongBinder()));
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        static class Proxy implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService {
            private android.os.IBinder Camera2StreamConfigurationMap;

            Proxy(android.os.IBinder iBinder) {
                this.Camera2StreamConfigurationMap = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.Camera2StreamConfigurationMap;
            }

            @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
            public void isPermissionRevocationEnabledForApp(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeStrongInterface(iUnusedAppRestrictionsBackportCallback);
                    this.Camera2StreamConfigurationMap.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
