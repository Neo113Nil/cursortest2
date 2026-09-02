package Q;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class r implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f468a;

    public r(IBinder iBinder) {
        this.f468a = iBinder;
    }

    public final void a(u uVar, C0007e c0007e) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(uVar);
            obtain.writeInt(1);
            K.c.a(c0007e, obtain, 0);
            this.f468a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f468a;
    }
}
