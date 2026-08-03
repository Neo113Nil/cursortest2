package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbvd extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbvf {
    zzbvd(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzA(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.ads.zzbeg.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final com.google.android.gms.ads.internal.client.zzea zzB() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(26, zza());
        com.google.android.gms.ads.internal.client.zzea zzb = com.google.android.gms.ads.internal.client.zzdz.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final com.google.android.gms.internal.ads.zzbvr zzC() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbvr zzbvpVar;
        android.os.Parcel zzcZ = zzcZ(27, zza());
        android.os.IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvpVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbvpVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbvr ? (com.google.android.gms.internal.ads.zzbvr) queryLocalInterface : new com.google.android.gms.internal.ads.zzbvp(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbvpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzD(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzmVar);
        zza.writeString(str);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbviVar);
        zzda(28, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzE(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        zzda(30, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzF(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbrt zzbrtVar, java.util.List list) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbrtVar);
        zza.writeTypedList(list);
        zzda(31, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzG(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzmVar);
        zza.writeString(str);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbviVar);
        zzda(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final com.google.android.gms.internal.ads.zzbxq zzH() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(33, zza());
        com.google.android.gms.internal.ads.zzbxq zzbxqVar = (com.google.android.gms.internal.ads.zzbxq) com.google.android.gms.internal.ads.zzbeg.zzb(zzcZ, com.google.android.gms.internal.ads.zzbxq.CREATOR);
        zzcZ.recycle();
        return zzbxqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final com.google.android.gms.internal.ads.zzbxq zzI() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(34, zza());
        com.google.android.gms.internal.ads.zzbxq zzbxqVar = (com.google.android.gms.internal.ads.zzbxq) com.google.android.gms.internal.ads.zzbeg.zzb(zzcZ, com.google.android.gms.internal.ads.zzbxq.CREATOR);
        zzcZ.recycle();
        return zzbxqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzJ(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzrVar);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbviVar);
        zzda(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final com.google.android.gms.internal.ads.zzbvl zzK() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbvl zzbvjVar;
        android.os.Parcel zzcZ = zzcZ(36, zza());
        android.os.IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvjVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbvjVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbvl ? (com.google.android.gms.internal.ads.zzbvl) queryLocalInterface : new com.google.android.gms.internal.ads.zzbvj(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbvjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzL(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        zzda(37, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzM(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzmVar);
        zza.writeString(str);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbviVar);
        zzda(38, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzN(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        zzda(39, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final com.google.android.gms.internal.ads.zzbvn zzO() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbvn zzbvnVar;
        android.os.Parcel zzcZ = zzcZ(15, zza());
        android.os.IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvnVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbvnVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbvn ? (com.google.android.gms.internal.ads.zzbvn) queryLocalInterface : new com.google.android.gms.internal.ads.zzbvn(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbvnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final com.google.android.gms.internal.ads.zzbvo zzP() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbvo zzbvoVar;
        android.os.Parcel zzcZ = zzcZ(16, zza());
        android.os.IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvoVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbvoVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbvo ? (com.google.android.gms.internal.ads.zzbvo) queryLocalInterface : new com.google.android.gms.internal.ads.zzbvo(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbvoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final com.google.android.gms.dynamic.IObjectWrapper zzf() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(2, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzg(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzh() throws android.os.RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzi() throws android.os.RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzrVar);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbviVar);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbviVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzl() throws android.os.RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzm() throws android.os.RemoteException {
        zzda(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzn(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzcca zzccaVar, java.lang.String str2) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzmVar);
        zza.writeString(null);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzccaVar);
        zza.writeString(str2);
        zzda(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzo(com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzmVar);
        zza.writeString(str);
        zzda(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzp() throws android.os.RemoteException {
        zzda(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final boolean zzq() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(13, zza());
        boolean zza = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzr(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzbvi zzbviVar, com.google.android.gms.internal.ads.zzblt zzbltVar, java.util.List list) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbviVar);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzbltVar);
        zza.writeStringList(list);
        zzda(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final android.os.Bundle zzs() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final android.os.Bundle zzt() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final android.os.Bundle zzu() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzv(com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzw(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        zzda(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final boolean zzx() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(22, zza());
        boolean zza = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzy(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzcca zzccaVar, java.util.List list) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzccaVar);
        zza.writeStringList(list);
        zzda(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final com.google.android.gms.internal.ads.zzbmv zzz() throws android.os.RemoteException {
        throw null;
    }
}
