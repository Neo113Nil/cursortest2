package m3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class u implements IInterface {

    /* renamed from: k, reason: collision with root package name */
    public final IBinder f18106k;

    public u(IBinder iBinder) {
        this.f18106k = iBinder;
    }

    public final void L(x xVar, C2097g c2097g) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(xVar);
            obtain.writeInt(1);
            C2.a.a(c2097g, obtain, 0);
            this.f18106k.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f18106k;
    }
}
