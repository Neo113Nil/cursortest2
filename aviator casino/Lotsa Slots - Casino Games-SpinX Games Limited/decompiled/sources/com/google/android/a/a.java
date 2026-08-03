package com.google.android.a;

/* compiled from: BaseProxy.java */
/* loaded from: classes3.dex */
public class a implements android.os.IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final android.os.IBinder f4378a;
    private final java.lang.String b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    protected a(android.os.IBinder iBinder) {
        this.f4378a = iBinder;
    }

    protected final android.os.Parcel a() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f4378a;
    }

    protected final android.os.Parcel b(android.os.Parcel parcel) throws android.os.RemoteException {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            try {
                this.f4378a.transact(1, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (java.lang.RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }
}
