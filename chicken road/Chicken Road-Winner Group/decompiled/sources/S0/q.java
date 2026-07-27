package S0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class q implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f1357a;

    public q(IBinder iBinder) {
        this.f1357a = iBinder;
    }

    public final void a(t tVar, d dVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(tVar);
            obtain.writeInt(1);
            H.j.a(dVar, obtain, 0);
            this.f1357a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1357a;
    }
}
