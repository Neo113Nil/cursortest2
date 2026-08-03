package io.appmetrica.analytics.internal;

/* loaded from: classes.dex */
public interface IAppMetricaService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "io.appmetrica.analytics.internal.IAppMetricaService";

    public static class Default implements io.appmetrica.analytics.internal.IAppMetricaService {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // io.appmetrica.analytics.internal.IAppMetricaService
        public void pauseUserSession(android.os.Bundle bundle) {
        }

        @Override // io.appmetrica.analytics.internal.IAppMetricaService
        public void reportData(int i2, android.os.Bundle bundle) {
        }

        @Override // io.appmetrica.analytics.internal.IAppMetricaService
        public void resumeUserSession(android.os.Bundle bundle) {
        }
    }

    public static abstract class Stub extends android.os.Binder implements io.appmetrica.analytics.internal.IAppMetricaService {
        public Stub() {
            attachInterface(this, io.appmetrica.analytics.internal.IAppMetricaService.DESCRIPTOR);
        }

        public static io.appmetrica.analytics.internal.IAppMetricaService asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(io.appmetrica.analytics.internal.IAppMetricaService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof io.appmetrica.analytics.internal.IAppMetricaService)) ? new io.appmetrica.analytics.internal.b(iBinder) : (io.appmetrica.analytics.internal.IAppMetricaService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, android.os.Parcel parcel, android.os.Parcel parcel2, int i3) {
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(io.appmetrica.analytics.internal.IAppMetricaService.DESCRIPTOR);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(io.appmetrica.analytics.internal.IAppMetricaService.DESCRIPTOR);
                return true;
            }
            if (i2 == 1) {
                resumeUserSession((android.os.Bundle) (parcel.readInt() != 0 ? android.os.Bundle.CREATOR.createFromParcel(parcel) : null));
            } else if (i2 == 2) {
                pauseUserSession((android.os.Bundle) (parcel.readInt() != 0 ? android.os.Bundle.CREATOR.createFromParcel(parcel) : null));
            } else {
                if (i2 != 3) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                reportData(parcel.readInt(), (android.os.Bundle) (parcel.readInt() != 0 ? android.os.Bundle.CREATOR.createFromParcel(parcel) : null));
            }
            return true;
        }
    }

    public static class _Parcel {
    }

    void pauseUserSession(android.os.Bundle bundle);

    void reportData(int i2, android.os.Bundle bundle);

    void resumeUserSession(android.os.Bundle bundle);
}
