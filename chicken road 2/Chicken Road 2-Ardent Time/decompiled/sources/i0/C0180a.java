package i0;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180a implements i0.c, android.os.IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.IBinder f3306a;

    public C0180a(android.os.IBinder iBinder) {
        this.f3306a = iBinder;
    }

    public final android.os.Bundle a(android.os.Bundle bundle) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        int i2 = h0.AbstractC0168a.f3294a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain = android.os.Parcel.obtain();
        try {
            this.f3306a.transact(1, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (android.os.Bundle) (obtain.readInt() == 0 ? null : (android.os.Parcelable) android.os.Bundle.CREATOR.createFromParcel(obtain));
        } catch (java.lang.RuntimeException e2) {
            throw e2;
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f3306a;
    }
}
