package g1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: g1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0446a implements InterfaceC0448c, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f5715a;

    public C0446a(IBinder iBinder) {
        this.f5715a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5715a;
    }

    public final Bundle b(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        int i2 = R0.a.f2616a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain = Parcel.obtain();
        try {
            this.f5715a.transact(1, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Bundle) (obtain.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(obtain));
        } catch (RuntimeException e3) {
            throw e3;
        } finally {
            obtain.recycle();
        }
    }
}
