package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbvn extends com.google.android.gms.internal.ads.zzbee implements android.os.IInterface {
    zzbvn(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
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

    public final double zzj() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(7, zza());
        double readDouble = zzcZ.readDouble();
        zzcZ.recycle();
        return readDouble;
    }

    public final java.lang.String zzk() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(8, zza());
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final java.lang.String zzl() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(9, zza());
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final void zzm() throws android.os.RemoteException {
        zzda(10, zza());
    }

    public final void zzn(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        zzda(11, zza);
    }

    public final void zzo(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        zzda(12, zza);
    }

    public final boolean zzp() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(13, zza());
        boolean zza = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final boolean zzq() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(14, zza());
        boolean zza = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    public final android.os.Bundle zzr() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(15, zza());
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.zzbeg.zzb(zzcZ, android.os.Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    public final void zzs(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        zzda(16, zza);
    }

    public final com.google.android.gms.ads.internal.client.zzea zzt() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(17, zza());
        com.google.android.gms.ads.internal.client.zzea zzb = com.google.android.gms.ads.internal.client.zzdz.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzu() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(18, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    public final com.google.android.gms.internal.ads.zzblx zzv() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(19, zza());
        com.google.android.gms.internal.ads.zzblx zzj = com.google.android.gms.internal.ads.zzblw.zzj(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzj;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzw() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(20, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzx() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(21, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    public final void zzy(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper3) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper2);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper3);
        zzda(22, zza);
    }
}
