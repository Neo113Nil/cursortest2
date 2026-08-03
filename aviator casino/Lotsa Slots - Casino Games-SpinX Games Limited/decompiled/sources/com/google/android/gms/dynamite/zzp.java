package com.google.android.gms.dynamite;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public final class zzp extends com.google.android.gms.internal.common.zza implements android.os.IInterface {
    zzp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        android.os.Parcel zzB = zzB(2, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }

    public final int zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        android.os.Parcel zzB = zzB(3, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzg(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        android.os.Parcel zzB = zzB(4, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }

    public final int zzh(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        android.os.Parcel zzB = zzB(5, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int zzi() throws android.os.RemoteException {
        android.os.Parcel zzB = zzB(6, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzj(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, boolean z, long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        zza.writeLong(j);
        android.os.Parcel zzB = zzB(7, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, int i, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper2);
        android.os.Parcel zzB = zzB(8, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }
}
