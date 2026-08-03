package p0;

/* renamed from: p0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0965q implements android.os.IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.IBinder f8284a;

    public C0965q(android.os.IBinder iBinder) {
        this.f8284a = iBinder;
    }

    public final void a(p0.BinderC0968t binderC0968t, p0.C0952d c0952d) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(binderC0968t);
            obtain.writeInt(1);
            C.l.a(c0952d, obtain, 0);
            this.f8284a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f8284a;
    }
}
