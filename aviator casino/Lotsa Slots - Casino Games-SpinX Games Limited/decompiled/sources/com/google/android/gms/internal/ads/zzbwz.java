package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbwz extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbxb {
    zzbwz(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.internal.ads.zzbxe zzbxeVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        zza.writeString(str);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, bundle);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, bundle2);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzrVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbxeVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final com.google.android.gms.internal.ads.zzbxq zzf() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(2, zza());
        com.google.android.gms.internal.ads.zzbxq zzbxqVar = (com.google.android.gms.internal.ads.zzbxq) com.google.android.gms.internal.ads.zzbeg.zzb(zzcZ, com.google.android.gms.internal.ads.zzbxq.CREATOR);
        zzcZ.recycle();
        return zzbxqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final com.google.android.gms.internal.ads.zzbxq zzg() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(3, zza());
        com.google.android.gms.internal.ads.zzbxq zzbxqVar = (com.google.android.gms.internal.ads.zzbxq) com.google.android.gms.internal.ads.zzbeg.zzb(zzcZ, com.google.android.gms.internal.ads.zzbxq.CREATOR);
        zzcZ.recycle();
        return zzbxqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final com.google.android.gms.ads.internal.client.zzea zzh() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(5, zza());
        com.google.android.gms.ads.internal.client.zzea zzb = com.google.android.gms.ads.internal.client.zzdz.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzi(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbwp zzbwpVar, com.google.android.gms.internal.ads.zzbvi zzbviVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzmVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbwpVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbviVar);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzrVar);
        zzda(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzj(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbws zzbwsVar, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzmVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbwsVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbviVar);
        zzda(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final boolean zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        android.os.Parcel zzcZ = zzcZ(15, zza);
        boolean zza2 = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzl(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbwy zzbwyVar, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzmVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbwyVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbviVar);
        zzda(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final boolean zzm(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        android.os.Parcel zzcZ = zzcZ(17, zza);
        boolean zza2 = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzn(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbwv zzbwvVar, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzmVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbwvVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbviVar);
        zzda(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzo(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zzda(19, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzp(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbwy zzbwyVar, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzmVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbwyVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbviVar);
        zzda(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzq(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbwp zzbwpVar, com.google.android.gms.internal.ads.zzbvi zzbviVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzmVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbwpVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbviVar);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzrVar);
        zzda(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzr(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbwv zzbwvVar, com.google.android.gms.internal.ads.zzbvi zzbviVar, com.google.android.gms.internal.ads.zzblt zzbltVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzmVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbwvVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbviVar);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzbltVar);
        zzda(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzs(java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbwm zzbwmVar, com.google.android.gms.internal.ads.zzbvi zzbviVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzmVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbwmVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbviVar);
        zzda(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final boolean zzt(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        android.os.Parcel zzcZ = zzcZ(24, zza);
        boolean zza2 = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }
}
