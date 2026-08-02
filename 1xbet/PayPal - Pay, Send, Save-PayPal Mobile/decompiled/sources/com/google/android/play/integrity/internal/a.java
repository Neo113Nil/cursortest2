package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
public class a implements android.os.IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final android.os.IBinder f3837a;
    private final java.lang.String b;

    protected final android.os.Parcel a() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    protected final void b(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        try {
            this.f3837a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f3837a;
    }

    protected a(android.os.IBinder iBinder, java.lang.String str) {
        this.f3837a = iBinder;
        this.b = str;
    }
}
