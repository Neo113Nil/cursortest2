package u3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: u3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2500b implements InterfaceC2502d, IInterface {

    /* renamed from: k, reason: collision with root package name */
    public final IBinder f20073k;

    public C2500b(IBinder iBinder) {
        this.f20073k = iBinder;
    }

    public final Parcel L(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f20073k.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e3) {
                obtain.recycle();
                throw e3;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f20073k;
    }
}
