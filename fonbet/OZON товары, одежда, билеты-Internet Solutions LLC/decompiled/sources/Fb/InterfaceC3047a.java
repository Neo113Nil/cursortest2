package Fb;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* renamed from: Fb.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC3047a extends IInterface {

    /* renamed from: Fb.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0194a extends Binder implements InterfaceC3047a {

        /* renamed from: Fb.a$a$a, reason: collision with other inner class name */
        private static class C0195a implements InterfaceC3047a {

            /* renamed from: e, reason: collision with root package name */
            private IBinder f9221e;

            C0195a(IBinder iBinder) {
                this.f9221e = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f9221e;
            }

            @Override // Fb.InterfaceC3047a
            public final ArrayList h(int i11, String str, String str2, String str3, String str4, String str5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.vk.silentauth.ISilentAuthInfoProvider");
                    obtain.writeInt(i11);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    obtain.writeString(str5);
                    obtain.writeString(null);
                    this.f9221e.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(b.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static InterfaceC3047a H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.vk.silentauth.ISilentAuthInfoProvider");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC3047a)) ? new C0195a(iBinder) : (InterfaceC3047a) queryLocalInterface;
        }
    }

    ArrayList h(int i11, String str, String str2, String str3, String str4, String str5) throws RemoteException;
}
