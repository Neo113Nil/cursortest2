package com.unity3d.services.core.device;

/* loaded from: classes6.dex */
public class AdvertisingId {
    private static final java.lang.String ADVERTISING_ID_SERVICE_NAME = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
    private static com.unity3d.services.core.device.AdvertisingId instance;
    private java.lang.String advertisingIdentifier = null;
    private boolean limitedAdvertisingTracking = false;

    private static com.unity3d.services.core.device.AdvertisingId getInstance() {
        if (instance == null) {
            instance = new com.unity3d.services.core.device.AdvertisingId();
        }
        return instance;
    }

    public static void init(android.content.Context context) {
        getInstance().fetchAdvertisingId(context);
    }

    public static java.lang.String getAdvertisingTrackingId() {
        return getInstance().advertisingIdentifier;
    }

    public static boolean getLimitedAdTracking() {
        return getInstance().limitedAdvertisingTracking;
    }

    private void fetchAdvertisingId(android.content.Context context) {
        boolean z;
        com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingServiceConnection googleAdvertisingServiceConnection = new com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingServiceConnection();
        android.content.Intent intent = new android.content.Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            z = context.bindService(intent, googleAdvertisingServiceConnection, 1);
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Couldn't bind to identifier service intent", e);
            z = false;
        }
        try {
            if (z) {
                try {
                    com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo create = com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo.GoogleAdvertisingInfoBinder.create(googleAdvertisingServiceConnection.getBinder());
                    this.advertisingIdentifier = create.getId();
                    this.limitedAdvertisingTracking = create.getEnabled(true);
                } catch (java.lang.Exception e2) {
                    com.unity3d.services.core.log.DeviceLog.exception("Couldn't get advertising info", e2);
                    if (!z) {
                        return;
                    }
                }
            }
            if (!z) {
                return;
            }
            context.unbindService(googleAdvertisingServiceConnection);
        } catch (java.lang.Throwable th) {
            if (z) {
                context.unbindService(googleAdvertisingServiceConnection);
            }
            throw th;
        }
    }

    private interface GoogleAdvertisingInfo extends android.os.IInterface {
        boolean getEnabled(boolean z) throws android.os.RemoteException;

        java.lang.String getId() throws android.os.RemoteException;

        public static abstract class GoogleAdvertisingInfoBinder extends android.os.Binder implements com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo {
            public static com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo create(android.os.IBinder iBinder) {
                if (iBinder == null) {
                    return null;
                }
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(com.unity3d.services.core.device.AdvertisingId.ADVERTISING_ID_SERVICE_NAME);
                if (queryLocalInterface != null && (queryLocalInterface instanceof com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo)) {
                    return (com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo) queryLocalInterface;
                }
                return new com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo.GoogleAdvertisingInfoBinder.GoogleAdvertisingInfoImplementation(iBinder);
            }

            @Override // android.os.Binder
            public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
                if (i == 1) {
                    parcel.enforceInterface(com.unity3d.services.core.device.AdvertisingId.ADVERTISING_ID_SERVICE_NAME);
                    java.lang.String id = getId();
                    parcel2.writeNoException();
                    parcel2.writeString(id);
                    return true;
                }
                if (i == 2) {
                    parcel.enforceInterface(com.unity3d.services.core.device.AdvertisingId.ADVERTISING_ID_SERVICE_NAME);
                    boolean enabled = getEnabled(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(enabled ? 1 : 0);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }

            private static class GoogleAdvertisingInfoImplementation implements com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo {
                private final android.os.IBinder _binder;

                GoogleAdvertisingInfoImplementation(android.os.IBinder iBinder) {
                    this._binder = iBinder;
                }

                @Override // android.os.IInterface
                public android.os.IBinder asBinder() {
                    return this._binder;
                }

                @Override // com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo
                public java.lang.String getId() throws android.os.RemoteException {
                    android.os.Parcel obtain = android.os.Parcel.obtain();
                    android.os.Parcel obtain2 = android.os.Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(com.unity3d.services.core.device.AdvertisingId.ADVERTISING_ID_SERVICE_NAME);
                        this._binder.transact(1, obtain, obtain2, 0);
                        obtain2.readException();
                        return obtain2.readString();
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }

                @Override // com.unity3d.services.core.device.AdvertisingId.GoogleAdvertisingInfo
                public boolean getEnabled(boolean z) throws android.os.RemoteException {
                    android.os.Parcel obtain = android.os.Parcel.obtain();
                    android.os.Parcel obtain2 = android.os.Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(com.unity3d.services.core.device.AdvertisingId.ADVERTISING_ID_SERVICE_NAME);
                        obtain.writeInt(z ? 1 : 0);
                        this._binder.transact(2, obtain, obtain2, 0);
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }
            }
        }
    }

    private class GoogleAdvertisingServiceConnection implements android.content.ServiceConnection {
        private final java.util.concurrent.BlockingQueue<android.os.IBinder> _binderQueue;
        boolean _consumed;

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName componentName) {
        }

        private GoogleAdvertisingServiceConnection() {
            this._consumed = false;
            this._binderQueue = new java.util.concurrent.LinkedBlockingQueue();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            try {
                this._binderQueue.put(iBinder);
            } catch (java.lang.InterruptedException unused) {
                com.unity3d.services.core.log.DeviceLog.debug("Couldn't put service to binder que");
                java.lang.Thread.currentThread().interrupt();
            }
        }

        public android.os.IBinder getBinder() throws java.lang.InterruptedException {
            if (this._consumed) {
                throw new java.lang.IllegalStateException();
            }
            this._consumed = true;
            return this._binderQueue.take();
        }
    }
}
