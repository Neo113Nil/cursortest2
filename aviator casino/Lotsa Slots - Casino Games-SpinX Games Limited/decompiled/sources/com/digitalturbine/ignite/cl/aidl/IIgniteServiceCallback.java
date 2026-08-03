package com.digitalturbine.ignite.cl.aidl;

/* loaded from: classes2.dex */
public interface IIgniteServiceCallback extends android.os.IInterface {

    public static abstract class Stub extends android.os.Binder implements com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback {
        public Stub() {
            attachInterface(this, "com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback");
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback");
                return true;
            }
            if (i == 1) {
                onScheduled(parcel.readString());
                parcel2.writeNoException();
            } else if (i == 2) {
                onStart(parcel.readString());
                parcel2.writeNoException();
            } else if (i == 3) {
                onProgress(parcel.readString());
                parcel2.writeNoException();
            } else if (i == 4) {
                onSuccess(parcel.readString());
                parcel2.writeNoException();
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onError(parcel.readString());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onError(java.lang.String str) throws android.os.RemoteException;

    void onProgress(java.lang.String str) throws android.os.RemoteException;

    void onScheduled(java.lang.String str) throws android.os.RemoteException;

    void onStart(java.lang.String str) throws android.os.RemoteException;

    void onSuccess(java.lang.String str) throws android.os.RemoteException;
}
