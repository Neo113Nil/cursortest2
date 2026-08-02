package com.google.android.gms.internal.identity_credentials;

/* loaded from: classes8.dex */
public class zzb extends android.os.Binder implements android.os.IInterface {
    private static com.google.android.gms.internal.identity_credentials.zzd globalInterceptor;

    public zzb(java.lang.String str) {
        attachInterface(this, str);
    }

    private boolean routeToSuperOrEnforceInterface(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i > 16777215) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    protected boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        return false;
    }

    public void enforceNoDataAvail(android.os.Parcel parcel) {
        com.google.android.gms.internal.identity_credentials.zzd zzdVar = globalInterceptor;
        if (zzdVar != null) {
            zzdVar.zza();
            return;
        }
        int i = com.google.android.gms.internal.identity_credentials.zzc.zza;
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(dataAvail).length() + 45);
        sb.append("Parcel data not fully consumed, unread size: ");
        sb.append(dataAvail);
        throw new android.os.BadParcelableException(sb.toString());
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        com.google.android.gms.internal.identity_credentials.zzd zzdVar = globalInterceptor;
        return zzdVar == null ? dispatchTransaction(i, parcel, parcel2, i2) : zzdVar.zzb();
    }
}
