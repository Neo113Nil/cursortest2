package io.appmetrica.analytics.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface IAppMetricaService extends IInterface {
    public static final String DESCRIPTOR = "io.appmetrica.analytics.internal.IAppMetricaService";

    public static class Default implements IAppMetricaService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // io.appmetrica.analytics.internal.IAppMetricaService
        public void pauseUserSession(Bundle bundle) {
        }

        @Override // io.appmetrica.analytics.internal.IAppMetricaService
        public void reportData(int i2, Bundle bundle) {
        }

        @Override // io.appmetrica.analytics.internal.IAppMetricaService
        public void resumeUserSession(Bundle bundle) {
        }
    }

    public static abstract class Stub extends Binder implements IAppMetricaService {
        public Stub() {
            attachInterface(this, IAppMetricaService.DESCRIPTOR);
        }

        public static IAppMetricaService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IAppMetricaService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IAppMetricaService)) ? new c(iBinder) : (IAppMetricaService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(IAppMetricaService.DESCRIPTOR);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(IAppMetricaService.DESCRIPTOR);
                return true;
            }
            if (i2 == 1) {
                resumeUserSession((Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            } else if (i2 == 2) {
                pauseUserSession((Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            } else {
                if (i2 != 3) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                reportData(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            }
            return true;
        }
    }

    public static class _Parcel {
    }

    void pauseUserSession(Bundle bundle);

    void reportData(int i2, Bundle bundle);

    void resumeUserSession(Bundle bundle);
}
