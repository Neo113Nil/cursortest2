package sspog.internal;

/* loaded from: classes18.dex */
public interface IIsolatedNativeVerifyingProcess extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "sspog.internal.IIsolatedNativeVerifyingProcess";

    public static class Default implements sspog.internal.IIsolatedNativeVerifyingProcess {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // sspog.internal.IIsolatedNativeVerifyingProcess
        public boolean isMagiskNativelyDetected() throws android.os.RemoteException {
            return false;
        }
    }

    boolean isMagiskNativelyDetected() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements sspog.internal.IIsolatedNativeVerifyingProcess {
        static final int TRANSACTION_isMagiskNativelyDetected = 1;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, sspog.internal.IIsolatedNativeVerifyingProcess.DESCRIPTOR);
        }

        public static sspog.internal.IIsolatedNativeVerifyingProcess asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(sspog.internal.IIsolatedNativeVerifyingProcess.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof sspog.internal.IIsolatedNativeVerifyingProcess)) {
                return (sspog.internal.IIsolatedNativeVerifyingProcess) queryLocalInterface;
            }
            return new sspog.internal.IIsolatedNativeVerifyingProcess.Stub.Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i > 0 && i <= 16777215) {
                parcel.enforceInterface(sspog.internal.IIsolatedNativeVerifyingProcess.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(sspog.internal.IIsolatedNativeVerifyingProcess.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                boolean isMagiskNativelyDetected = isMagiskNativelyDetected();
                parcel2.writeNoException();
                parcel2.writeInt(isMagiskNativelyDetected ? 1 : 0);
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        static class Proxy implements sspog.internal.IIsolatedNativeVerifyingProcess {
            private android.os.IBinder getHighSpeedVideoFpsRangesFor;

            Proxy(android.os.IBinder iBinder) {
                this.getHighSpeedVideoFpsRangesFor = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.getHighSpeedVideoFpsRangesFor;
            }

            @Override // sspog.internal.IIsolatedNativeVerifyingProcess
            public boolean isMagiskNativelyDetected() throws android.os.RemoteException {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(sspog.internal.IIsolatedNativeVerifyingProcess.DESCRIPTOR);
                    this.getHighSpeedVideoFpsRangesFor.transact(1, obtain, obtain2, 0);
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
