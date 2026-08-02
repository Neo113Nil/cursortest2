package Cb;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import lb.InterfaceC7913b;

/* loaded from: classes9.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {

        /* renamed from: Cb.b$a$a, reason: collision with other inner class name */
        private static class C0114a implements b {

            /* renamed from: e, reason: collision with root package name */
            private IBinder f4631e;

            C0114a(IBinder iBinder) {
                this.f4631e = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f4631e;
            }

            @Override // Cb.b
            public final void x(String str, String str2, InterfaceC7913b interfaceC7913b) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.vk.push.core.push.PushProvider");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongInterface(interfaceC7913b);
                    this.f4631e.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static b H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.vk.push.core.push.PushProvider");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0114a(iBinder) : (b) queryLocalInterface;
        }
    }

    void x(String str, String str2, InterfaceC7913b interfaceC7913b) throws RemoteException;
}
