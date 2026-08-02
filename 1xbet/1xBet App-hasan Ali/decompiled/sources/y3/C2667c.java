package y3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: y3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2667c implements InterfaceC2669e, IInterface {

    /* renamed from: k, reason: collision with root package name */
    public final IBinder f21223k;

    public C2667c(IBinder iBinder) {
        this.f21223k = iBinder;
    }

    public final Parcel L() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return obtain;
    }

    public final void N(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f21223k.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f21223k;
    }
}
