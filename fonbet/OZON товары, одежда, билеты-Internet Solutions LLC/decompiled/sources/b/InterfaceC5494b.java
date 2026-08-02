package b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import b.InterfaceC5493a;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC5494b extends IInterface {

    /* renamed from: b.b$a */
    public static abstract class a extends Binder implements InterfaceC5494b {

        /* renamed from: b.b$a$a, reason: collision with other inner class name */
        private static class C0826a implements InterfaceC5494b {

            /* renamed from: e, reason: collision with root package name */
            private IBinder f45585e;

            C0826a(IBinder iBinder) {
                this.f45585e = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f45585e;
            }

            @Override // b.InterfaceC5494b
            public final boolean j(InterfaceC5493a interfaceC5493a) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder((InterfaceC5493a.AbstractBinderC0825a) interfaceC5493a);
                    this.f45585e.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.InterfaceC5494b
            public final boolean q() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(0L);
                    this.f45585e.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static InterfaceC5494b H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC5494b)) ? new C0826a(iBinder) : (InterfaceC5494b) queryLocalInterface;
        }
    }

    boolean j(InterfaceC5493a interfaceC5493a) throws RemoteException;

    boolean q() throws RemoteException;
}
