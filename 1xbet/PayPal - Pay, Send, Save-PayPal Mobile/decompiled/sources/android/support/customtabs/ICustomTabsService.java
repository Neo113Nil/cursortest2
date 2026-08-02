package android.support.customtabs;

/* loaded from: classes5.dex */
public interface ICustomTabsService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android$support$customtabs$ICustomTabsService".replace(kotlin.text.Typography.dollar, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
    public static final int VERSION = 1;

    public static class Default implements android.support.customtabs.ICustomTabsService {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public android.os.Bundle extraCommand(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean isEngagementSignalsApiAvailable(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean mayLaunchUrl(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle, java.util.List<android.os.Bundle> list) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newAuthTabSession(android.support.customtabs.IAuthTabCallback iAuthTabCallback, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSession(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSessionWithExtras(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public int postMessage(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
            return 0;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public void prefetch(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public void prefetchWithMultipleUrls(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, java.util.List<android.net.Uri> list, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean receiveFile(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, int i, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannel(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannelWithExtras(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean setEngagementSignalsCallback(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.IBinder iBinder, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean updateVisuals(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean validateRelationship(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, int i, android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean warmup(long j) throws android.os.RemoteException {
            return false;
        }
    }

    android.os.Bundle extraCommand(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    int getInterfaceVersion() throws android.os.RemoteException;

    boolean isEngagementSignalsApiAvailable(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException;

    boolean mayLaunchUrl(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle, java.util.List<android.os.Bundle> list) throws android.os.RemoteException;

    boolean newAuthTabSession(android.support.customtabs.IAuthTabCallback iAuthTabCallback, android.os.Bundle bundle) throws android.os.RemoteException;

    boolean newSession(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback) throws android.os.RemoteException;

    boolean newSessionWithExtras(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException;

    int postMessage(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    void prefetch(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException;

    void prefetchWithMultipleUrls(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, java.util.List<android.net.Uri> list, android.os.Bundle bundle) throws android.os.RemoteException;

    boolean receiveFile(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, int i, android.os.Bundle bundle) throws android.os.RemoteException;

    boolean requestPostMessageChannel(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri) throws android.os.RemoteException;

    boolean requestPostMessageChannelWithExtras(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException;

    boolean setEngagementSignalsCallback(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.IBinder iBinder, android.os.Bundle bundle) throws android.os.RemoteException;

    boolean updateVisuals(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException;

    boolean validateRelationship(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, int i, android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException;

    boolean warmup(long j) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.support.customtabs.ICustomTabsService {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static android.support.customtabs.ICustomTabsService asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof android.support.customtabs.ICustomTabsService)) {
                return (android.support.customtabs.ICustomTabsService) queryLocalInterface;
            }
            return new android.support.customtabs.ICustomTabsService.Stub.Proxy(iBinder);
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
                    boolean warmup = warmup(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(warmup ? 1 : 0);
                    return true;
                case 3:
                    boolean newSession = newSession(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(newSession ? 1 : 0);
                    return true;
                case 4:
                    boolean mayLaunchUrl = mayLaunchUrl(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (android.net.Uri) parcel.readTypedObject(android.net.Uri.CREATOR), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR), parcel.createTypedArrayList(android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(mayLaunchUrl ? 1 : 0);
                    return true;
                case 5:
                    android.os.Bundle extraCommand = extraCommand(parcel.readString(), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeTypedObject(extraCommand, 1);
                    return true;
                case 6:
                    boolean updateVisuals = updateVisuals(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(updateVisuals ? 1 : 0);
                    return true;
                case 7:
                    boolean requestPostMessageChannel = requestPostMessageChannel(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (android.net.Uri) parcel.readTypedObject(android.net.Uri.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(requestPostMessageChannel ? 1 : 0);
                    return true;
                case 8:
                    int postMessage = postMessage(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(postMessage);
                    return true;
                case 9:
                    boolean validateRelationship = validateRelationship(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (android.net.Uri) parcel.readTypedObject(android.net.Uri.CREATOR), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(validateRelationship ? 1 : 0);
                    return true;
                case 10:
                    boolean newSessionWithExtras = newSessionWithExtras(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(newSessionWithExtras ? 1 : 0);
                    return true;
                case 11:
                    boolean requestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (android.net.Uri) parcel.readTypedObject(android.net.Uri.CREATOR), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(requestPostMessageChannelWithExtras ? 1 : 0);
                    return true;
                case 12:
                    boolean receiveFile = receiveFile(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (android.net.Uri) parcel.readTypedObject(android.net.Uri.CREATOR), parcel.readInt(), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(receiveFile ? 1 : 0);
                    return true;
                case 13:
                    boolean isEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(isEngagementSignalsApiAvailable ? 1 : 0);
                    return true;
                case 14:
                    boolean engagementSignalsCallback = setEngagementSignalsCallback(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readStrongBinder(), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(engagementSignalsCallback ? 1 : 0);
                    return true;
                case 15:
                    prefetch(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (android.net.Uri) parcel.readTypedObject(android.net.Uri.CREATOR), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    prefetchWithMultipleUrls(android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.createTypedArrayList(android.net.Uri.CREATOR), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 17:
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
                case 18:
                    boolean newAuthTabSession = newAuthTabSession(android.support.customtabs.IAuthTabCallback.Stub.asInterface(parcel.readStrongBinder()), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(newAuthTabSession ? 1 : 0);
                    return true;
            }
        }

        static class Proxy implements android.support.customtabs.ICustomTabsService {
            private int getHighSpeedVideoFpsRanges = -1;
            private android.os.IBinder getHighSpeedVideoSizes;

            Proxy(android.os.IBinder iBinder) {
                this.getHighSpeedVideoSizes = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.getHighSpeedVideoSizes;
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean warmup(long j) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeLong(j);
                    if (!this.getHighSpeedVideoSizes.transact(2, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method warmup is unimplemented.");
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean newSession(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    if (!this.getHighSpeedVideoSizes.transact(3, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method newSession is unimplemented.");
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean newSessionWithExtras(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    obtain.writeTypedObject(bundle, 0);
                    if (!this.getHighSpeedVideoSizes.transact(10, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method newSessionWithExtras is unimplemented.");
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean mayLaunchUrl(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle, java.util.List<android.os.Bundle> list) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    obtain.writeTypedObject(uri, 0);
                    obtain.writeTypedObject(bundle, 0);
                    android.support.customtabs.ICustomTabsService._Parcel.getHighSpeedVideoSizes(obtain, list, 0);
                    if (!this.getHighSpeedVideoSizes.transact(4, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method mayLaunchUrl is unimplemented.");
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public void prefetch(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    obtain.writeTypedObject(uri, 0);
                    obtain.writeTypedObject(bundle, 0);
                    if (!this.getHighSpeedVideoSizes.transact(15, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method prefetch is unimplemented.");
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public void prefetchWithMultipleUrls(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, java.util.List<android.net.Uri> list, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    android.support.customtabs.ICustomTabsService._Parcel.getHighSpeedVideoSizes(obtain, list, 0);
                    obtain.writeTypedObject(bundle, 0);
                    if (!this.getHighSpeedVideoSizes.transact(16, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method prefetchWithMultipleUrls is unimplemented.");
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public android.os.Bundle extraCommand(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeTypedObject(bundle, 0);
                    if (!this.getHighSpeedVideoSizes.transact(5, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method extraCommand is unimplemented.");
                    }
                    obtain2.readException();
                    return (android.os.Bundle) obtain2.readTypedObject(android.os.Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean updateVisuals(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    obtain.writeTypedObject(bundle, 0);
                    if (!this.getHighSpeedVideoSizes.transact(6, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method updateVisuals is unimplemented.");
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean requestPostMessageChannel(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    obtain.writeTypedObject(uri, 0);
                    if (!this.getHighSpeedVideoSizes.transact(7, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method requestPostMessageChannel is unimplemented.");
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean requestPostMessageChannelWithExtras(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    obtain.writeTypedObject(uri, 0);
                    obtain.writeTypedObject(bundle, 0);
                    if (!this.getHighSpeedVideoSizes.transact(11, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method requestPostMessageChannelWithExtras is unimplemented.");
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public int postMessage(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    obtain.writeString(str);
                    obtain.writeTypedObject(bundle, 0);
                    if (!this.getHighSpeedVideoSizes.transact(8, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method postMessage is unimplemented.");
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean validateRelationship(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, int i, android.net.Uri uri, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    obtain.writeInt(i);
                    obtain.writeTypedObject(uri, 0);
                    obtain.writeTypedObject(bundle, 0);
                    if (!this.getHighSpeedVideoSizes.transact(9, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method validateRelationship is unimplemented.");
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean receiveFile(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.net.Uri uri, int i, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    obtain.writeTypedObject(uri, 0);
                    obtain.writeInt(i);
                    obtain.writeTypedObject(bundle, 0);
                    if (!this.getHighSpeedVideoSizes.transact(12, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method receiveFile is unimplemented.");
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean isEngagementSignalsApiAvailable(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    obtain.writeTypedObject(bundle, 0);
                    if (!this.getHighSpeedVideoSizes.transact(13, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method isEngagementSignalsApiAvailable is unimplemented.");
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean setEngagementSignalsCallback(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.IBinder iBinder, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeTypedObject(bundle, 0);
                    if (!this.getHighSpeedVideoSizes.transact(14, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method setEngagementSignalsCallback is unimplemented.");
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean newAuthTabSession(android.support.customtabs.IAuthTabCallback iAuthTabCallback, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(DESCRIPTOR);
                    obtain.writeStrongInterface(iAuthTabCallback);
                    obtain.writeTypedObject(bundle, 0);
                    if (!this.getHighSpeedVideoSizes.transact(18, obtain, obtain2, 0)) {
                        throw new android.os.RemoteException("Method newAuthTabSession is unimplemented.");
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
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

    public static class _Parcel {
        static <T extends android.os.Parcelable> void getHighSpeedVideoSizes(android.os.Parcel parcel, java.util.List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeTypedObject(list.get(i2), 0);
            }
        }
    }
}
