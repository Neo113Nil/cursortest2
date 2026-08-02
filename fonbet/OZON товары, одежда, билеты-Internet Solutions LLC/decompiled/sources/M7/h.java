package M7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes9.dex */
public final class h implements j, IInterface {

    /* renamed from: e, reason: collision with root package name */
    private final IBinder f17514e;

    h(IBinder iBinder) {
        this.f17514e = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f17514e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // M7.j
    public final void u(Bundle bundle, l lVar) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IIntegrityService");
        int i11 = e.f17512a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(lVar);
        try {
            this.f17514e.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
