package androidx.core.app.unusedapprestrictions;

/* loaded from: classes7.dex */
public interface IUnusedAppRestrictionsBackportCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace(kotlin.text.Typography.dollar, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);

    public static class Default implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
        public void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z2) throws android.os.RemoteException {
        }
    }

    void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z2) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback)) {
                return (androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback) queryLocalInterface;
            }
            return new androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub.Proxy(iBinder);
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
                onIsPermissionRevocationEnabledForAppResult(parcel.readInt() != 0, parcel.readInt() != 0);
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        static class Proxy implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback {
            private android.os.IBinder getHighSpeedVideoFpsRanges;

            Proxy(android.os.IBinder iBinder) {
                this.getHighSpeedVideoFpsRanges = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.getHighSpeedVideoFpsRanges;
            }

            @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
            public void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z2) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.getHighSpeedVideoFpsRanges.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
