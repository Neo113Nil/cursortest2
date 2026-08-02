package com.google.android.gms.internal.p000authapi;

/* loaded from: classes8.dex */
public class zba implements android.os.IInterface {
    private final android.os.IBinder zba;
    private final java.lang.String zbb;

    public final android.os.Parcel zba() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeInterfaceToken(this.zbb);
        return obtain;
    }

    public final void zbb(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            this.zba.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.zba;
    }

    public zba(android.os.IBinder iBinder, java.lang.String str) {
        this.zba = iBinder;
        this.zbb = str;
    }
}
