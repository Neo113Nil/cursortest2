package com.google.android.gms.internal.base;

/* loaded from: classes4.dex */
public class zaa implements android.os.IInterface {
    private final android.os.IBinder zaa;
    private final java.lang.String zab;

    public final android.os.Parcel zaa() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeInterfaceToken(this.zab);
        return obtain;
    }

    public final android.os.Parcel zab(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            try {
                this.zaa.transact(2, parcel, obtain, 0);
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

    public final void zac(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            this.zaa.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void zad(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        try {
            this.zaa.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.zaa;
    }

    public zaa(android.os.IBinder iBinder, java.lang.String str) {
        this.zaa = iBinder;
        this.zab = str;
    }
}
