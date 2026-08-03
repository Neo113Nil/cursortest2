package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbnt extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbnv {
    zzbnt(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final boolean zzA() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(24, zza());
        boolean zza = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzB(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzdgVar);
        zzda(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzC(com.google.android.gms.ads.internal.client.zzdc zzdcVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzdcVar);
        zzda(26, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzD() throws android.os.RemoteException {
        zzda(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzE() throws android.os.RemoteException {
        zzda(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final com.google.android.gms.internal.ads.zzbmb zzF() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbmb zzblzVar;
        android.os.Parcel zzcZ = zzcZ(29, zza());
        android.os.IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzblzVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzblzVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbmb ? (com.google.android.gms.internal.ads.zzbmb) queryLocalInterface : new com.google.android.gms.internal.ads.zzblz(readStrongBinder);
        }
        zzcZ.recycle();
        return zzblzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final boolean zzG() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(30, zza());
        boolean zza = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final com.google.android.gms.ads.internal.client.zzdx zzH() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(31, zza());
        com.google.android.gms.ads.internal.client.zzdx zzb = com.google.android.gms.ads.internal.client.zzdw.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzI(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzdqVar);
        zzda(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzJ(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, bundle);
        zzda(33, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final long zzK() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(34, zza());
        long readLong = zzcZ.readLong();
        zzcZ.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzL(long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeLong(j);
        zzda(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final java.lang.String zze() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(2, zza());
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final java.util.List zzf() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(3, zza());
        java.util.ArrayList zzf = com.google.android.gms.internal.ads.zzbeg.zzf(zzcZ);
        zzcZ.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final java.lang.String zzg() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(4, zza());
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final com.google.android.gms.internal.ads.zzbme zzh() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbme zzbmcVar;
        android.os.Parcel zzcZ = zzcZ(5, zza());
        android.os.IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbmcVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbmcVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbme ? (com.google.android.gms.internal.ads.zzbme) queryLocalInterface : new com.google.android.gms.internal.ads.zzbmc(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbmcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final java.lang.String zzi() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(6, zza());
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final java.lang.String zzj() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(7, zza());
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final double zzk() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(8, zza());
        double readDouble = zzcZ.readDouble();
        zzcZ.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final java.lang.String zzl() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(9, zza());
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final java.lang.String zzm() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(10, zza());
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final com.google.android.gms.ads.internal.client.zzea zzn() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(11, zza());
        com.google.android.gms.ads.internal.client.zzea zzb = com.google.android.gms.ads.internal.client.zzdz.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final java.lang.String zzo() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzp() throws android.os.RemoteException {
        zzda(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final com.google.android.gms.internal.ads.zzblx zzq() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzblx zzblvVar;
        android.os.Parcel zzcZ = zzcZ(14, zza());
        android.os.IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzblvVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzblvVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzblx ? (com.google.android.gms.internal.ads.zzblx) queryLocalInterface : new com.google.android.gms.internal.ads.zzblv(readStrongBinder);
        }
        zzcZ.recycle();
        return zzblvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzr(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, bundle);
        zzda(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final boolean zzs(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, bundle);
        android.os.Parcel zzcZ = zzcZ(16, zza);
        boolean zza2 = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzt(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, bundle);
        zzda(17, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final com.google.android.gms.dynamic.IObjectWrapper zzu() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(18, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final com.google.android.gms.dynamic.IObjectWrapper zzv() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(19, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final android.os.Bundle zzw() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(20, zza());
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.zzbeg.zzb(zzcZ, android.os.Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzx(com.google.android.gms.internal.ads.zzbns zzbnsVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbnsVar);
        zzda(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzy() throws android.os.RemoteException {
        zzda(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final java.util.List zzz() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(23, zza());
        java.util.ArrayList zzf = com.google.android.gms.internal.ads.zzbeg.zzf(zzcZ);
        zzcZ.recycle();
        return zzf;
    }
}
