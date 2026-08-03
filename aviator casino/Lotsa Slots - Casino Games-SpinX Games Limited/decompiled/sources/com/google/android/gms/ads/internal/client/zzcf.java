package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzcf extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.ads.internal.client.zzch {
    zzcf(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zze(java.util.List list, com.google.android.gms.ads.internal.client.zzcb zzcbVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeTypedList(list);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzcbVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzf(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzcZ = zzcZ(2, zza);
        boolean zza2 = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final com.google.android.gms.internal.ads.zzcci zzg(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzcZ = zzcZ(3, zza);
        com.google.android.gms.internal.ads.zzcci zzt = com.google.android.gms.internal.ads.zzcch.zzt(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzh(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzcZ = zzcZ(4, zza);
        boolean zza2 = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final com.google.android.gms.internal.ads.zzbgj zzi(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzcZ = zzcZ(5, zza);
        com.google.android.gms.internal.ads.zzbgj zzb = com.google.android.gms.internal.ads.zzbgi.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzj(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzcZ = zzcZ(6, zza);
        boolean zza2 = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final com.google.android.gms.ads.internal.client.zzbu zzk(java.lang.String str) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzbu zzbsVar;
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzcZ = zzcZ(7, zza);
        android.os.IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzbu ? (com.google.android.gms.ads.internal.client.zzbu) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzbs(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzl(com.google.android.gms.internal.ads.zzbvc zzbvcVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbvcVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzm(java.lang.String str, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzfpVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzceVar);
        android.os.Parcel zzcZ = zzcZ(9, zza);
        boolean zza2 = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzn(int i, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        android.os.Parcel zzcZ = zzcZ(10, zza);
        boolean zza2 = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final com.google.android.gms.ads.internal.client.zzbu zzo(java.lang.String str) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzbu zzbsVar;
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzcZ = zzcZ(11, zza);
        android.os.IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzbu ? (com.google.android.gms.ads.internal.client.zzbu) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzbs(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final com.google.android.gms.internal.ads.zzbgj zzp(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzcZ = zzcZ(12, zza);
        com.google.android.gms.internal.ads.zzbgj zzb = com.google.android.gms.internal.ads.zzbgi.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final com.google.android.gms.internal.ads.zzcci zzq(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzcZ = zzcZ(13, zza);
        com.google.android.gms.internal.ads.zzcci zzt = com.google.android.gms.internal.ads.zzcch.zzt(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final com.google.android.gms.ads.internal.client.zzfp zzr(int i, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        android.os.Parcel zzcZ = zzcZ(14, zza);
        com.google.android.gms.ads.internal.client.zzfp zzfpVar = (com.google.android.gms.ads.internal.client.zzfp) com.google.android.gms.internal.ads.zzbeg.zzb(zzcZ, com.google.android.gms.ads.internal.client.zzfp.CREATOR);
        zzcZ.recycle();
        return zzfpVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final android.os.Bundle zzs(int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        android.os.Parcel zzcZ = zzcZ(15, zza);
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.zzbeg.zzb(zzcZ, android.os.Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final int zzt(int i, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        android.os.Parcel zzcZ = zzcZ(16, zza);
        int readInt = zzcZ.readInt();
        zzcZ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzu(int i, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        android.os.Parcel zzcZ = zzcZ(17, zza);
        boolean zza2 = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzv(int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zzda(18, zza);
    }
}
