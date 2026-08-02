package c;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC5692a extends IInterface {

    /* renamed from: c, reason: collision with root package name */
    public static final String f56128c = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* renamed from: c.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0842a extends Binder implements InterfaceC5692a {

        /* renamed from: c.a$a$a, reason: collision with other inner class name */
        private static class C0843a implements InterfaceC5692a {

            /* renamed from: e, reason: collision with root package name */
            private IBinder f56129e;

            C0843a(IBinder iBinder) {
                this.f56129e = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f56129e;
            }

            @Override // c.InterfaceC5692a
            public final void p(String str, int i11, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC5692a.f56128c);
                    obtain.writeString(str);
                    obtain.writeInt(i11);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f56129e.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static InterfaceC5692a H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC5692a.f56128c);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC5692a)) ? new C0843a(iBinder) : (InterfaceC5692a) queryLocalInterface;
        }
    }

    void p(String str, int i11, String str2, Notification notification) throws RemoteException;
}
