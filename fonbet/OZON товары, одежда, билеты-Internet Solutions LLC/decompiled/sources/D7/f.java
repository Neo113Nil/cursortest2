package D7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes9.dex */
public final class f implements h, IInterface {

    /* renamed from: e, reason: collision with root package name */
    private final IBinder f6104e;

    f(IBinder iBinder) {
        this.f6104e = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6104e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // D7.h
    public final void l(String str, Bundle bundle, j jVar) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        obtain.writeString(str);
        int i11 = e.f6103a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(jVar);
        try {
            this.f6104e.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // D7.h
    public final void o(String str, Bundle bundle, j jVar) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        obtain.writeString(str);
        int i11 = e.f6103a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(jVar);
        try {
            this.f6104e.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
