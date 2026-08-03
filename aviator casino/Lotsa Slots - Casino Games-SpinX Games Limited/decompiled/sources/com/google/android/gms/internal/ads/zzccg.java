package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzccg extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzcci {
    zzccg(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzb(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.internal.ads.zzccp zzccpVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzmVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzccpVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.internal.ads.zzccp zzccpVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzmVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzccpVar);
        zzda(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zze(com.google.android.gms.internal.ads.zzccl zzcclVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzcclVar);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzf(com.google.android.gms.ads.internal.client.zzdn zzdnVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzdnVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final android.os.Bundle zzg() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(9, zza());
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.zzbeg.zzb(zzcZ, android.os.Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzh(com.google.android.gms.internal.ads.zzccw zzccwVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzccwVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final boolean zzi() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final java.lang.String zzj() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, boolean z) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final com.google.android.gms.internal.ads.zzccf zzl() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzccf zzccdVar;
        android.os.Parcel zzcZ = zzcZ(11, zza());
        android.os.IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzccdVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzccdVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzccf ? (com.google.android.gms.internal.ads.zzccf) queryLocalInterface : new com.google.android.gms.internal.ads.zzccd(readStrongBinder);
        }
        zzcZ.recycle();
        return zzccdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final com.google.android.gms.ads.internal.client.zzdx zzm() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(12, zza());
        com.google.android.gms.ads.internal.client.zzdx zzb = com.google.android.gms.ads.internal.client.zzdw.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final java.lang.String zzn() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(16, zza());
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzo(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzdqVar);
        zzda(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzp(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.ads.zzbeg.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final long zzq() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(17, zza());
        long readLong = zzcZ.readLong();
        zzcZ.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzr(long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeLong(j);
        zzda(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzs(com.google.android.gms.internal.ads.zzccq zzccqVar) throws android.os.RemoteException {
        throw null;
    }
}
