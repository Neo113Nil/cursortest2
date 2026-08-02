package d;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0936a implements InterfaceC0937b {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f12322a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f12322a;
    }

    @Override // d.InterfaceC0937b
    public final void r0(int i7, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0937b.f12323p);
            obtain.writeInt(i7);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f12322a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
