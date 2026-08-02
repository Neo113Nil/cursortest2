package Gm0;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import ol0.ServiceConnectionC8752d;

/* loaded from: classes4.dex */
public interface a extends IInterface {

    /* renamed from: Gm0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0211a extends Binder implements a {

        /* renamed from: Gm0.a$a$a, reason: collision with other inner class name */
        private static class C0212a implements a {

            /* renamed from: e, reason: collision with root package name */
            private IBinder f10287e;

            C0212a(IBinder iBinder) {
                this.f10287e = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f10287e;
            }

            @Override // Gm0.a
            public final void y(String str, String str2, Bundle bundle, ServiceConnectionC8752d.a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("ru.vk.store.provider.analytics.AnalyticsProvider");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    obtain.writeStrongInterface(aVar);
                    this.f10287e.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static a H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.provider.analytics.AnalyticsProvider");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0212a(iBinder) : (a) queryLocalInterface;
        }
    }

    void y(String str, String str2, Bundle bundle, ServiceConnectionC8752d.a aVar) throws RemoteException;
}
