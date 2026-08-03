package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbvo extends com.google.android.gms.internal.ads.zzbee implements android.os.IInterface {
    zzbvo(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final java.lang.String zze() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(2, zza());
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final java.util.List zzf() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(3, zza());
        java.util.ArrayList zzf = com.google.android.gms.internal.ads.zzbeg.zzf(zzcZ);
        zzcZ.recycle();
        return zzf;
    }

    public final java.lang.String zzg() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(4, zza());
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final com.google.android.gms.internal.ads.zzbme zzh() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(5, zza());
        com.google.android.gms.internal.ads.zzbme zzh = com.google.android.gms.internal.ads.zzbmd.zzh(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzh;
    }

    public final java.lang.String zzi() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(6, zza());
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final java.lang.String zzj() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(7, zza());
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final void zzk() throws android.os.RemoteException {
        zzda(8, zza());
    }

    public final void zzl(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        zzda(9, zza);
    }

    public final void zzm(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        zzda(10, zza);
    }

    public final boolean zzn() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(11, zza());
        boolean zza = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final boolean zzo() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(12, zza());
        boolean zza = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final android.os.Bundle zzp() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(13, zza());
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.zzbeg.zzb(zzcZ, android.os.Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    public final void zzq(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        zzda(14, zza);
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzr() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(15, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    public final com.google.android.gms.ads.internal.client.zzea zzs() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(16, zza());
        com.google.android.gms.ads.internal.client.zzea zzb = com.google.android.gms.ads.internal.client.zzdz.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    public final com.google.android.gms.internal.ads.zzblx zzt() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(19, zza());
        com.google.android.gms.internal.ads.zzblx zzj = com.google.android.gms.internal.ads.zzblw.zzj(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzj;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzu() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(20, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzv() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(21, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    public final void zzw(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper3) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper2);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper3);
        zzda(22, zza);
    }
}
