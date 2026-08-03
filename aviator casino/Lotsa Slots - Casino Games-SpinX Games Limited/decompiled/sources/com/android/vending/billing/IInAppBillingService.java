package com.android.vending.billing;

/* loaded from: classes2.dex */
public interface IInAppBillingService extends android.os.IInterface {

    public static class Default implements com.android.vending.billing.IInAppBillingService {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.android.vending.billing.IInAppBillingService
        public int consumePurchase(int i, java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
            return 0;
        }

        @Override // com.android.vending.billing.IInAppBillingService
        public android.os.Bundle getBuyIntent(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws android.os.RemoteException {
            return null;
        }

        @Override // com.android.vending.billing.IInAppBillingService
        public android.os.Bundle getBuyIntentToReplaceSkus(int i, java.lang.String str, java.util.List<java.lang.String> list, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws android.os.RemoteException {
            return null;
        }

        @Override // com.android.vending.billing.IInAppBillingService
        public android.os.Bundle getPurchases(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) throws android.os.RemoteException {
            return null;
        }

        @Override // com.android.vending.billing.IInAppBillingService
        public android.os.Bundle getSkuDetails(int i, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws android.os.RemoteException {
            return null;
        }

        @Override // com.android.vending.billing.IInAppBillingService
        public int isBillingSupported(int i, java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
            return 0;
        }

        @Override // com.android.vending.billing.IInAppBillingService
        public int stub(int i, java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
            return 0;
        }
    }

    int consumePurchase(int i, java.lang.String str, java.lang.String str2) throws android.os.RemoteException;

    android.os.Bundle getBuyIntent(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws android.os.RemoteException;

    android.os.Bundle getBuyIntentToReplaceSkus(int i, java.lang.String str, java.util.List<java.lang.String> list, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws android.os.RemoteException;

    android.os.Bundle getPurchases(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) throws android.os.RemoteException;

    android.os.Bundle getSkuDetails(int i, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws android.os.RemoteException;

    int isBillingSupported(int i, java.lang.String str, java.lang.String str2) throws android.os.RemoteException;

    int stub(int i, java.lang.String str, java.lang.String str2) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.vending.billing.IInAppBillingService {
        private static final java.lang.String DESCRIPTOR = "com.android.vending.billing.IInAppBillingService";
        static final int TRANSACTION_consumePurchase = 5;
        static final int TRANSACTION_getBuyIntent = 3;
        static final int TRANSACTION_getBuyIntentToReplaceSkus = 7;
        static final int TRANSACTION_getPurchases = 4;
        static final int TRANSACTION_getSkuDetails = 2;
        static final int TRANSACTION_isBillingSupported = 1;
        static final int TRANSACTION_stub = 6;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static com.android.vending.billing.IInAppBillingService asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof com.android.vending.billing.IInAppBillingService)) {
                return (com.android.vending.billing.IInAppBillingService) queryLocalInterface;
            }
            return new com.android.vending.billing.IInAppBillingService.Stub.Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    int isBillingSupported = isBillingSupported(parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(isBillingSupported);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    android.os.Bundle skuDetails = getSkuDetails(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (skuDetails != null) {
                        parcel2.writeInt(1);
                        skuDetails.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    android.os.Bundle buyIntent = getBuyIntent(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    if (buyIntent != null) {
                        parcel2.writeInt(1);
                        buyIntent.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    android.os.Bundle purchases = getPurchases(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    if (purchases != null) {
                        parcel2.writeInt(1);
                        purchases.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    int consumePurchase = consumePurchase(parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(consumePurchase);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    int stub = stub(parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(stub);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    android.os.Bundle buyIntentToReplaceSkus = getBuyIntentToReplaceSkus(parcel.readInt(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    if (buyIntentToReplaceSkus != null) {
                        parcel2.writeInt(1);
                        buyIntentToReplaceSkus.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        private static class Proxy implements com.android.vending.billing.IInAppBillingService {
            public static com.android.vending.billing.IInAppBillingService sDefaultImpl;
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return com.android.vending.billing.IInAppBillingService.Stub.DESCRIPTOR;
            }

            @Override // com.android.vending.billing.IInAppBillingService
            public int isBillingSupported(int i, java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.android.vending.billing.IInAppBillingService.Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && com.android.vending.billing.IInAppBillingService.Stub.getDefaultImpl() != null) {
                        return com.android.vending.billing.IInAppBillingService.Stub.getDefaultImpl().isBillingSupported(i, str, str2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.android.vending.billing.IInAppBillingService
            public android.os.Bundle getSkuDetails(int i, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.android.vending.billing.IInAppBillingService.Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && com.android.vending.billing.IInAppBillingService.Stub.getDefaultImpl() != null) {
                        return com.android.vending.billing.IInAppBillingService.Stub.getDefaultImpl().getSkuDetails(i, str, str2, bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.android.vending.billing.IInAppBillingService
            public android.os.Bundle getBuyIntent(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.android.vending.billing.IInAppBillingService.Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && com.android.vending.billing.IInAppBillingService.Stub.getDefaultImpl() != null) {
                        return com.android.vending.billing.IInAppBillingService.Stub.getDefaultImpl().getBuyIntent(i, str, str2, str3, str4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.android.vending.billing.IInAppBillingService
            public android.os.Bundle getPurchases(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.android.vending.billing.IInAppBillingService.Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && com.android.vending.billing.IInAppBillingService.Stub.getDefaultImpl() != null) {
                        return com.android.vending.billing.IInAppBillingService.Stub.getDefaultImpl().getPurchases(i, str, str2, str3);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.android.vending.billing.IInAppBillingService
            public int consumePurchase(int i, java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.android.vending.billing.IInAppBillingService.Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && com.android.vending.billing.IInAppBillingService.Stub.getDefaultImpl() != null) {
                        return com.android.vending.billing.IInAppBillingService.Stub.getDefaultImpl().consumePurchase(i, str, str2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.android.vending.billing.IInAppBillingService
            public int stub(int i, java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.android.vending.billing.IInAppBillingService.Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && com.android.vending.billing.IInAppBillingService.Stub.getDefaultImpl() != null) {
                        return com.android.vending.billing.IInAppBillingService.Stub.getDefaultImpl().stub(i, str, str2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.android.vending.billing.IInAppBillingService
            public android.os.Bundle getBuyIntentToReplaceSkus(int i, java.lang.String str, java.util.List<java.lang.String> list, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.android.vending.billing.IInAppBillingService.Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeStringList(list);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    try {
                        if (!this.mRemote.transact(7, obtain, obtain2, 0) && com.android.vending.billing.IInAppBillingService.Stub.getDefaultImpl() != null) {
                            android.os.Bundle buyIntentToReplaceSkus = com.android.vending.billing.IInAppBillingService.Stub.getDefaultImpl().getBuyIntentToReplaceSkus(i, str, list, str2, str3, str4);
                            obtain2.recycle();
                            obtain.recycle();
                            return buyIntentToReplaceSkus;
                        }
                        obtain2.readException();
                        android.os.Bundle bundle = obtain2.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(obtain2) : null;
                        obtain2.recycle();
                        obtain.recycle();
                        return bundle;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }
        }

        public static boolean setDefaultImpl(com.android.vending.billing.IInAppBillingService iInAppBillingService) {
            if (com.android.vending.billing.IInAppBillingService.Stub.Proxy.sDefaultImpl != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (iInAppBillingService == null) {
                return false;
            }
            com.android.vending.billing.IInAppBillingService.Stub.Proxy.sDefaultImpl = iInAppBillingService;
            return true;
        }

        public static com.android.vending.billing.IInAppBillingService getDefaultImpl() {
            return com.android.vending.billing.IInAppBillingService.Stub.Proxy.sDefaultImpl;
        }
    }
}
