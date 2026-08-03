package com.digitalturbine.ignite.cl.aidl;

/* loaded from: classes2.dex */
public interface IIgniteServiceAPI extends android.os.IInterface {

    public static abstract class Stub extends android.os.Binder implements com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI {

        public static class Proxy implements com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI {
            private android.os.IBinder mRemote;

            public Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI
            public void authenticate(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback iIgniteServiceCallback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI._Parcel.writeTypedObject(obtain, bundle, 0);
                    obtain.writeStrongInterface(iIgniteServiceCallback);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI
            public void cancel(java.lang.String str, android.os.Bundle bundle, com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback iIgniteServiceCallback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI");
                    obtain.writeString(str);
                    com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI._Parcel.writeTypedObject(obtain, bundle, 0);
                    obtain.writeStrongInterface(iIgniteServiceCallback);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI
            public void getProperty(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback iIgniteServiceCallback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI");
                    obtain.writeString(str);
                    com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI._Parcel.writeTypedObject(obtain, bundle, 0);
                    com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI._Parcel.writeTypedObject(obtain, bundle2, 0);
                    obtain.writeStrongInterface(iIgniteServiceCallback);
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI
            public void install(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback iIgniteServiceCallback) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI");
                    obtain.writeString(str);
                    com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI._Parcel.writeTypedObject(obtain, bundle, 0);
                    com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI._Parcel.writeTypedObject(obtain, bundle2, 0);
                    obtain.writeStrongInterface(iIgniteServiceCallback);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI
            public java.lang.String version() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI");
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI)) ? new com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI.Stub.Proxy(iBinder) : (com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI) queryLocalInterface;
        }
    }

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends android.os.Parcelable> void writeTypedObject(android.os.Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void authenticate(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback iIgniteServiceCallback) throws android.os.RemoteException;

    void cancel(java.lang.String str, android.os.Bundle bundle, com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback iIgniteServiceCallback) throws android.os.RemoteException;

    void getProperty(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback iIgniteServiceCallback) throws android.os.RemoteException;

    void install(java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback iIgniteServiceCallback) throws android.os.RemoteException;

    java.lang.String version() throws android.os.RemoteException;
}
