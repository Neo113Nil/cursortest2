package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
public class zzb extends android.os.Binder implements android.os.IInterface {
    public zzb(java.lang.String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this;
    }

    protected boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        return false;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return dispatchTransaction(i, parcel, parcel2, i2);
    }
}
