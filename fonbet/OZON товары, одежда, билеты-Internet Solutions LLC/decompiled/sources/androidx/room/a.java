package androidx.room;

import J4.m;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes8.dex */
final class a implements m {

    /* renamed from: e, reason: collision with root package name */
    private IBinder f45036e;

    a(IBinder iBinder) {
        this.f45036e = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f45036e;
    }

    @Override // J4.m
    public final void c(String[] strArr) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(m.f13890a);
            obtain.writeStringArray(strArr);
            this.f45036e.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
