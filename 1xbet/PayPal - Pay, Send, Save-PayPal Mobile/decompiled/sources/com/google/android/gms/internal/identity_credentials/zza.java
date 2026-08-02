package com.google.android.gms.internal.identity_credentials;

/* loaded from: classes8.dex */
public class zza implements android.os.IInterface {
    private final java.lang.String mDescriptor;
    private final android.os.IBinder mRemote;

    public android.os.Parcel obtainAndWriteInterfaceToken() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeInterfaceToken(this.mDescriptor);
        return obtain;
    }

    public void transactAndReadExceptionReturnVoid(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            this.mRemote.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void transactOneway(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        try {
            this.mRemote.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.mRemote;
    }

    public zza(android.os.IBinder iBinder, java.lang.String str) {
        this.mRemote = iBinder;
        this.mDescriptor = str;
    }
}
