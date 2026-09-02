package Q;

import a0.AbstractC0011b;
import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class F implements InterfaceC0008f, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f398a;

    public F(IBinder iBinder) {
        this.f398a = iBinder;
    }

    public final Account a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        obtain = Parcel.obtain();
        try {
            this.f398a.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Account) AbstractC0011b.a(obtain, Account.CREATOR);
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f398a;
    }
}
