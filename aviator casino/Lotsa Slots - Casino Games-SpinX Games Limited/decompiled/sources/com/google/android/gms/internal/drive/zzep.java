package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
public final class zzep extends com.google.android.gms.internal.drive.zza implements com.google.android.gms.internal.drive.zzeo {
    zzep(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drive.internal.IDriveService");
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzek zzekVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.drive.zzc.zza(zza, zzekVar);
        com.google.android.gms.internal.drive.zzc.zza(zza, zzeqVar);
        zzb(1, zza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzgq zzgqVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.drive.zzc.zza(zza, zzgqVar);
        com.google.android.gms.internal.drive.zzc.zza(zza, zzeqVar);
        zzb(2, zza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzhf zzhfVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.drive.zzc.zza(zza, zzhfVar);
        com.google.android.gms.internal.drive.zzc.zza(zza, zzeqVar);
        zzb(3, zza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzr zzrVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.drive.zzc.zza(zza, zzrVar);
        com.google.android.gms.internal.drive.zzc.zza(zza, zzeqVar);
        zzb(4, zza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzw zzwVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.drive.zzc.zza(zza, zzwVar);
        com.google.android.gms.internal.drive.zzc.zza(zza, zzeqVar);
        zzb(5, zza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzy zzyVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.drive.zzc.zza(zza, zzyVar);
        com.google.android.gms.internal.drive.zzc.zza(zza, zzeqVar);
        zzb(6, zza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final com.google.android.gms.internal.drive.zzec zza(com.google.android.gms.internal.drive.zzgj zzgjVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.drive.zzc.zza(zza, zzgjVar);
        com.google.android.gms.internal.drive.zzc.zza(zza, zzeqVar);
        android.os.Parcel zza2 = zza(7, zza);
        com.google.android.gms.internal.drive.zzec zzecVar = (com.google.android.gms.internal.drive.zzec) com.google.android.gms.internal.drive.zzc.zza(zza2, com.google.android.gms.internal.drive.zzec.CREATOR);
        zza2.recycle();
        return zzecVar;
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzo zzoVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.drive.zzc.zza(zza, zzoVar);
        com.google.android.gms.internal.drive.zzc.zza(zza, zzeqVar);
        zzb(8, zza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.drive.zzc.zza(zza, zzeqVar);
        zzb(9, zza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final android.content.IntentSender zza(com.google.android.gms.internal.drive.zzgm zzgmVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.drive.zzc.zza(zza, zzgmVar);
        android.os.Parcel zza2 = zza(10, zza);
        android.content.IntentSender intentSender = (android.content.IntentSender) com.google.android.gms.internal.drive.zzc.zza(zza2, android.content.IntentSender.CREATOR);
        zza2.recycle();
        return intentSender;
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final android.content.IntentSender zza(com.google.android.gms.internal.drive.zzu zzuVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.drive.zzc.zza(zza, zzuVar);
        android.os.Parcel zza2 = zza(11, zza);
        android.content.IntentSender intentSender = (android.content.IntentSender) com.google.android.gms.internal.drive.zzc.zza(zza2, android.content.IntentSender.CREATOR);
        zza2.recycle();
        return intentSender;
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzex zzexVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.drive.zzc.zza(zza, zzexVar);
        com.google.android.gms.internal.drive.zzc.zza(zza, zzeqVar);
        zzb(13, zza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzj zzjVar, com.google.android.gms.internal.drive.zzes zzesVar, java.lang.String str, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.drive.zzc.zza(zza, zzjVar);
        com.google.android.gms.internal.drive.zzc.zza(zza, zzesVar);
        zza.writeString(null);
        com.google.android.gms.internal.drive.zzc.zza(zza, zzeqVar);
        zzb(14, zza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzgs zzgsVar, com.google.android.gms.internal.drive.zzes zzesVar, java.lang.String str, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.drive.zzc.zza(zza, zzgsVar);
        com.google.android.gms.internal.drive.zzc.zza(zza, zzesVar);
        zza.writeString(null);
        com.google.android.gms.internal.drive.zzc.zza(zza, zzeqVar);
        zzb(15, zza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzad zzadVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.drive.zzc.zza(zza, zzadVar);
        zzb(16, zza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzhb zzhbVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.drive.zzc.zza(zza, zzhbVar);
        com.google.android.gms.internal.drive.zzc.zza(zza, zzeqVar);
        zzb(17, zza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzm zzmVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.drive.zzc.zza(zza, zzmVar);
        com.google.android.gms.internal.drive.zzc.zza(zza, zzeqVar);
        zzb(18, zza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzab zzabVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.drive.zzc.zza(zza, zzabVar);
        com.google.android.gms.internal.drive.zzc.zza(zza, zzeqVar);
        zzb(24, zza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzgw zzgwVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.drive.zzc.zza(zza, zzgwVar);
        com.google.android.gms.internal.drive.zzc.zza(zza, zzeqVar);
        zzb(28, zza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zzb(com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.drive.zzc.zza(zza, zzeqVar);
        zzb(35, zza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzgu zzguVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.drive.zzc.zza(zza, zzguVar);
        com.google.android.gms.internal.drive.zzc.zza(zza, zzeqVar);
        zzb(36, zza);
    }

    @Override // com.google.android.gms.internal.drive.zzeo
    public final void zza(com.google.android.gms.internal.drive.zzhd zzhdVar, com.google.android.gms.internal.drive.zzeq zzeqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.drive.zzc.zza(zza, zzhdVar);
        com.google.android.gms.internal.drive.zzc.zza(zza, zzeqVar);
        zzb(38, zza);
    }
}
