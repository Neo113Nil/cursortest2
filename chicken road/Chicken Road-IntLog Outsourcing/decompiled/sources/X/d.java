package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class d implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f3458a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3458a;
    }

    public final void b(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            obtain.writeStringArray(strArr);
            this.f3458a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
