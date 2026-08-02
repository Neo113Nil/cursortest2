package com.google.android.gms.common.internal;

/* loaded from: classes8.dex */
public final class zzv extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.zzx {
    zzv(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.zzx
    public final com.google.android.gms.dynamic.IObjectWrapper zzd() throws android.os.RemoteException {
        android.os.Parcel zzB = zzB(1, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.common.internal.zzx
    public final int zze() throws android.os.RemoteException {
        android.os.Parcel zzB = zzB(2, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }
}
