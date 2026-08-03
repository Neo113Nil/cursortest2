package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbvp extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbvr {
    zzbvp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final float zzA() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(24, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final float zzB() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(25, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final void zzC() throws android.os.RemoteException {
        zzda(26, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final java.lang.String zze() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(2, zza());
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final java.util.List zzf() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(3, zza());
        java.util.ArrayList zzf = com.google.android.gms.internal.ads.zzbeg.zzf(zzcZ);
        zzcZ.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final java.lang.String zzg() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(4, zza());
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final com.google.android.gms.internal.ads.zzbme zzh() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(5, zza());
        com.google.android.gms.internal.ads.zzbme zzh = com.google.android.gms.internal.ads.zzbmd.zzh(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final java.lang.String zzi() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(6, zza());
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final java.lang.String zzj() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(7, zza());
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final double zzk() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(8, zza());
        double readDouble = zzcZ.readDouble();
        zzcZ.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final java.lang.String zzl() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(9, zza());
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final java.lang.String zzm() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(10, zza());
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final com.google.android.gms.ads.internal.client.zzea zzn() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(11, zza());
        com.google.android.gms.ads.internal.client.zzea zzb = com.google.android.gms.ads.internal.client.zzdz.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final com.google.android.gms.internal.ads.zzblx zzo() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(12, zza());
        com.google.android.gms.internal.ads.zzblx zzj = com.google.android.gms.internal.ads.zzblw.zzj(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final com.google.android.gms.dynamic.IObjectWrapper zzp() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(13, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final com.google.android.gms.dynamic.IObjectWrapper zzq() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(14, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final com.google.android.gms.dynamic.IObjectWrapper zzr() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(15, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final android.os.Bundle zzs() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(16, zza());
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.zzbeg.zzb(zzcZ, android.os.Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final boolean zzt() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(17, zza());
        boolean zza = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final boolean zzu() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(18, zza());
        boolean zza = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final void zzv() throws android.os.RemoteException {
        zzda(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final void zzw(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        zzda(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final void zzx(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper3) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper2);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper3);
        zzda(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final void zzy(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        zzda(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final float zzz() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(23, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }
}
