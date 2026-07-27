package S0;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class C implements e, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f1297a;

    public C(IBinder iBinder) {
        this.f1297a = iBinder;
    }

    public final Account a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        obtain = Parcel.obtain();
        try {
            this.f1297a.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Account) c1.b.a(obtain, Account.CREATOR);
        } catch (RuntimeException e3) {
            throw e3;
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1297a;
    }
}
