package K7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes9.dex */
public final class c implements e, IInterface {

    /* renamed from: e, reason: collision with root package name */
    private final IBinder f15298e;

    c(IBinder iBinder) {
        this.f15298e = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15298e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // K7.e
    public final void w(String str, Bundle bundle, g gVar) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        obtain.writeString(str);
        int i11 = b.f15297a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(gVar);
        try {
            this.f15298e.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
