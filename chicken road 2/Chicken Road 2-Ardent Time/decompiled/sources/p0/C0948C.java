package p0;

/* renamed from: p0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0948C implements p0.InterfaceC0953e, android.os.IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.IBinder f8220a;

    public C0948C(android.os.IBinder iBinder) {
        this.f8220a = iBinder;
    }

    public final android.accounts.Account a() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        obtain = android.os.Parcel.obtain();
        try {
            this.f8220a.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (android.accounts.Account) z0.AbstractC1047a.a(obtain, android.accounts.Account.CREATOR);
        } catch (java.lang.RuntimeException e2) {
            throw e2;
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f8220a;
    }
}
