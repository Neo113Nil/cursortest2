package Gm0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import ol0.ServiceConnectionC8752d;

/* loaded from: classes4.dex */
public abstract class b extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 >= 1 && i11 <= 16777215) {
            parcel.enforceInterface("ru.vk.store.provider.analytics.AnalyticsProviderCallback");
        }
        if (i11 == 1598968902) {
            parcel2.writeString("ru.vk.store.provider.analytics.AnalyticsProviderCallback");
            return true;
        }
        if (i11 == 1) {
            ((ServiceConnectionC8752d.a) this).I();
            parcel2.writeNoException();
            return true;
        }
        if (i11 != 2) {
            return super.onTransact(i11, parcel, parcel2, i12);
        }
        parcel.readInt();
        ((ServiceConnectionC8752d.a) this).H(parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
