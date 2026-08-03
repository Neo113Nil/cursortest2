package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzcm extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.ads.internal.client.zzco {
    zzcm(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.ads.internal.client.zzbu zzb(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, java.lang.String str, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzbu zzbsVar;
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzrVar);
        zza.writeString(str);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbvcVar);
        zza.writeInt(com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
        android.os.Parcel zzcZ = zzcZ(1, zza);
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

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.ads.internal.client.zzbu zzc(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, java.lang.String str, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzbu zzbsVar;
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzrVar);
        zza.writeString(str);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbvcVar);
        zza.writeInt(com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
        android.os.Parcel zzcZ = zzcZ(2, zza);
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

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.ads.internal.client.zzbq zzd(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzbq zzboVar;
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        zza.writeString(str);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbvcVar);
        zza.writeInt(com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
        android.os.Parcel zzcZ = zzcZ(3, zza);
        android.os.IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzboVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzboVar = queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzbq ? (com.google.android.gms.ads.internal.client.zzbq) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzbo(readStrongBinder);
        }
        zzcZ.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.internal.ads.zzbmi zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper2);
        android.os.Parcel zzcZ = zzcZ(5, zza);
        com.google.android.gms.internal.ads.zzbmi zzdG = com.google.android.gms.internal.ads.zzbmh.zzdG(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzdG;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.internal.ads.zzcbs zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.internal.ads.zzbzb zzg(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        android.os.Parcel zzcZ = zzcZ(8, zza);
        com.google.android.gms.internal.ads.zzbzb zzI = com.google.android.gms.internal.ads.zzbza.zzI(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzI;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.ads.internal.client.zzch zzh(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzch zzcfVar;
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbvcVar);
        zza.writeInt(com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
        android.os.Parcel zzcZ = zzcZ(18, zza);
        android.os.IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzcfVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            zzcfVar = queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzch ? (com.google.android.gms.ads.internal.client.zzch) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzcf(readStrongBinder);
        }
        zzcZ.recycle();
        return zzcfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.ads.internal.client.zzcy zzi(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzcy zzcwVar;
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        zza.writeInt(com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
        android.os.Parcel zzcZ = zzcZ(9, zza);
        android.os.IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzcwVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcwVar = queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzcy ? (com.google.android.gms.ads.internal.client.zzcy) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzcw(readStrongBinder);
        }
        zzcZ.recycle();
        return zzcwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.ads.internal.client.zzbu zzj(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, java.lang.String str, int i) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.internal.ads.zzbmn zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper3) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.internal.ads.zzcci zzl(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        zza.writeString(str);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbvcVar);
        zza.writeInt(com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
        android.os.Parcel zzcZ = zzcZ(12, zza);
        com.google.android.gms.internal.ads.zzcci zzt = com.google.android.gms.internal.ads.zzcch.zzt(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.ads.internal.client.zzbu zzm(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, java.lang.String str, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzbu zzbsVar;
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzrVar);
        zza.writeString(str);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbvcVar);
        zza.writeInt(com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
        android.os.Parcel zzcZ = zzcZ(13, zza);
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

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.internal.ads.zzcem zzn(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbvcVar);
        zza.writeInt(com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
        android.os.Parcel zzcZ = zzcZ(14, zza);
        com.google.android.gms.internal.ads.zzcem zzb = com.google.android.gms.internal.ads.zzcel.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.internal.ads.zzbyu zzo(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbvcVar);
        zza.writeInt(com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
        android.os.Parcel zzcZ = zzcZ(15, zza);
        com.google.android.gms.internal.ads.zzbyu zzb = com.google.android.gms.internal.ads.zzbyt.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.internal.ads.zzbqt zzp(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i, com.google.android.gms.internal.ads.zzbqq zzbqqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbvcVar);
        zza.writeInt(com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbqqVar);
        android.os.Parcel zzcZ = zzcZ(16, zza);
        com.google.android.gms.internal.ads.zzbqt zzb = com.google.android.gms.internal.ads.zzbqs.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.ads.internal.client.zzdt zzq(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzdt zzdrVar;
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbvcVar);
        zza.writeInt(com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
        android.os.Parcel zzcZ = zzcZ(17, zza);
        android.os.IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzdrVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdrVar = queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzdt ? (com.google.android.gms.ads.internal.client.zzdt) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzdr(readStrongBinder);
        }
        zzcZ.recycle();
        return zzdrVar;
    }
}
