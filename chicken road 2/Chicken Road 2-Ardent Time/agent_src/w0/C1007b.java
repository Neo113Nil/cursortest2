package w0;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1007b implements w0.d, android.os.IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.IBinder f8400a;

    public C1007b(android.os.IBinder iBinder) {
        this.f8400a = iBinder;
    }

    public final android.os.Parcel a(android.os.Parcel parcel, int i2) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            try {
                this.f8400a.transact(i2, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (java.lang.RuntimeException e2) {
                obtain.recycle();
                throw e2;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f8400a;
    }
}
