package sspog.internal;

/* loaded from: classes18.dex */
public interface IIsolatedVerifyingProcess extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "sspog.internal.IIsolatedVerifyingProcess";

    public static class Default implements sspog.internal.IIsolatedVerifyingProcess {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // sspog.internal.IIsolatedVerifyingProcess
        public boolean isMagiskDetected() throws android.os.RemoteException {
            return false;
        }
    }

    boolean isMagiskDetected() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements sspog.internal.IIsolatedVerifyingProcess {
        static final int TRANSACTION_isMagiskDetected = 1;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, sspog.internal.IIsolatedVerifyingProcess.DESCRIPTOR);
        }

        public static sspog.internal.IIsolatedVerifyingProcess asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(sspog.internal.IIsolatedVerifyingProcess.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof sspog.internal.IIsolatedVerifyingProcess)) {
                return (sspog.internal.IIsolatedVerifyingProcess) queryLocalInterface;
            }
            return new sspog.internal.IIsolatedVerifyingProcess.Stub.Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i > 0 && i <= 16777215) {
                parcel.enforceInterface(sspog.internal.IIsolatedVerifyingProcess.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(sspog.internal.IIsolatedVerifyingProcess.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                boolean isMagiskDetected = isMagiskDetected();
                parcel2.writeNoException();
                parcel2.writeInt(isMagiskDetected ? 1 : 0);
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        static class Proxy implements sspog.internal.IIsolatedVerifyingProcess {
            private android.os.IBinder getHighSpeedVideoFpsRanges;

            Proxy(android.os.IBinder iBinder) {
                this.getHighSpeedVideoFpsRanges = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.getHighSpeedVideoFpsRanges;
            }

            @Override // sspog.internal.IIsolatedVerifyingProcess
            public boolean isMagiskDetected() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(sspog.internal.IIsolatedVerifyingProcess.DESCRIPTOR);
                    this.getHighSpeedVideoFpsRanges.transact(1, obtain, obtain2, 0);
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
