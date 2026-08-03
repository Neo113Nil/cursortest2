package com.facebook.ppml.receiver;

/* loaded from: classes2.dex */
public interface IReceiverService extends android.os.IInterface {

    public static class Default implements com.facebook.ppml.receiver.IReceiverService {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.facebook.ppml.receiver.IReceiverService
        public int sendEvents(android.os.Bundle eventsBundle) throws android.os.RemoteException {
            return 0;
        }
    }

    int sendEvents(android.os.Bundle eventsBundle) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.facebook.ppml.receiver.IReceiverService {
        private static final java.lang.String DESCRIPTOR = "com.facebook.ppml.receiver.IReceiverService";
        static final int TRANSACTION_sendEvents = 1;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static com.facebook.ppml.receiver.IReceiverService asInterface(android.os.IBinder obj) {
            if (obj == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = obj.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof com.facebook.ppml.receiver.IReceiverService)) {
                return (com.facebook.ppml.receiver.IReceiverService) queryLocalInterface;
            }
            return new com.facebook.ppml.receiver.IReceiverService.Stub.Proxy(obj);
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
            if (code != 1) {
                if (code == 1598968902) {
                    reply.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(code, data, reply, flags);
            }
            data.enforceInterface(DESCRIPTOR);
            int sendEvents = sendEvents(data.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(data) : null);
            reply.writeNoException();
            reply.writeInt(sendEvents);
            return true;
        }

        private static class Proxy implements com.facebook.ppml.receiver.IReceiverService {
            public static com.facebook.ppml.receiver.IReceiverService sDefaultImpl;
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder remote) {
                this.mRemote = remote;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return com.facebook.ppml.receiver.IReceiverService.Stub.DESCRIPTOR;
            }

            @Override // com.facebook.ppml.receiver.IReceiverService
            public int sendEvents(android.os.Bundle eventsBundle) throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.facebook.ppml.receiver.IReceiverService.Stub.DESCRIPTOR);
                    if (eventsBundle != null) {
                        obtain.writeInt(1);
                        eventsBundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && com.facebook.ppml.receiver.IReceiverService.Stub.getDefaultImpl() != null) {
                        return com.facebook.ppml.receiver.IReceiverService.Stub.getDefaultImpl().sendEvents(eventsBundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(com.facebook.ppml.receiver.IReceiverService impl) {
            if (com.facebook.ppml.receiver.IReceiverService.Stub.Proxy.sDefaultImpl != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl == null) {
                return false;
            }
            com.facebook.ppml.receiver.IReceiverService.Stub.Proxy.sDefaultImpl = impl;
            return true;
        }

        public static com.facebook.ppml.receiver.IReceiverService getDefaultImpl() {
            return com.facebook.ppml.receiver.IReceiverService.Stub.Proxy.sDefaultImpl;
        }
    }
}
