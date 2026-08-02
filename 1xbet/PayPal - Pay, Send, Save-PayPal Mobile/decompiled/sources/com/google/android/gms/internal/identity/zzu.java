package com.google.android.gms.internal.identity;

/* loaded from: classes4.dex */
public final class zzu extends com.google.android.gms.internal.identity.zza implements com.google.android.gms.internal.identity.zzv {
    zzu(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzA(android.location.Location location) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.identity.zzc.zzb(zza, location);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzB(android.location.Location location, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.identity.zzc.zzb(zza, location);
        com.google.android.gms.internal.identity.zzc.zzc(zza, iStatusCallback);
        zzc(85, zza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzC(com.google.android.gms.internal.identity.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.identity.zzc.zzc(zza, zzrVar);
        zzc(67, zza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzD(com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest, com.google.android.gms.internal.identity.zzab zzabVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.identity.zzc.zzb(zza, locationSettingsRequest);
        com.google.android.gms.internal.identity.zzc.zzc(zza, zzabVar);
        zza.writeString(null);
        zzc(63, zza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzE(com.google.android.gms.internal.identity.zzo zzoVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.identity.zzc.zzc(zza, zzoVar);
        zzc(95, zza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzF(com.google.android.gms.internal.identity.zzj zzjVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.identity.zzc.zzb(zza, zzjVar);
        zzc(75, zza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzd(com.google.android.gms.location.GeofencingRequest geofencingRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.internal.identity.zzt zztVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.identity.zzc.zzb(zza, geofencingRequest);
        com.google.android.gms.internal.identity.zzc.zzb(zza, pendingIntent);
        com.google.android.gms.internal.identity.zzc.zzc(zza, zztVar);
        zzc(57, zza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zze(com.google.android.gms.location.GeofencingRequest geofencingRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.identity.zzc.zzb(zza, geofencingRequest);
        com.google.android.gms.internal.identity.zzc.zzb(zza, pendingIntent);
        com.google.android.gms.internal.identity.zzc.zzc(zza, iStatusCallback);
        zzc(97, zza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzf(com.google.android.gms.internal.identity.zzem zzemVar, com.google.android.gms.internal.identity.zzt zztVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.identity.zzc.zzb(zza, zzemVar);
        com.google.android.gms.internal.identity.zzc.zzc(zza, zztVar);
        zzc(74, zza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzg(com.google.android.gms.internal.identity.zzem zzemVar, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.identity.zzc.zzb(zza, zzemVar);
        com.google.android.gms.internal.identity.zzc.zzc(zza, iStatusCallback);
        zzc(98, zza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzh(long j, boolean z, android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeLong(j);
        int i = com.google.android.gms.internal.identity.zzc.zza;
        zza.writeInt(1);
        com.google.android.gms.internal.identity.zzc.zzb(zza, pendingIntent);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzi(com.google.android.gms.location.zzb zzbVar, android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.identity.zzc.zzb(zza, zzbVar);
        com.google.android.gms.internal.identity.zzc.zzb(zza, pendingIntent);
        com.google.android.gms.internal.identity.zzc.zzc(zza, iStatusCallback);
        zzc(70, zza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzj(com.google.android.gms.location.ActivityTransitionRequest activityTransitionRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.identity.zzc.zzb(zza, activityTransitionRequest);
        com.google.android.gms.internal.identity.zzc.zzb(zza, pendingIntent);
        com.google.android.gms.internal.identity.zzc.zzc(zza, iStatusCallback);
        zzc(72, zza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzk(android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.identity.zzc.zzb(zza, pendingIntent);
        com.google.android.gms.internal.identity.zzc.zzc(zza, iStatusCallback);
        zzc(73, zza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzl(android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.identity.zzc.zzb(zza, pendingIntent);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzm(android.app.PendingIntent pendingIntent, com.google.android.gms.location.SleepSegmentRequest sleepSegmentRequest, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.identity.zzc.zzb(zza, pendingIntent);
        com.google.android.gms.internal.identity.zzc.zzb(zza, sleepSegmentRequest);
        com.google.android.gms.internal.identity.zzc.zzc(zza, iStatusCallback);
        zzc(79, zza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzn(android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.identity.zzc.zzb(zza, pendingIntent);
        com.google.android.gms.internal.identity.zzc.zzc(zza, iStatusCallback);
        zzc(69, zza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzo(com.google.android.gms.location.zzad zzadVar, com.google.android.gms.internal.identity.zzee zzeeVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.identity.zzc.zzb(zza, zzadVar);
        com.google.android.gms.internal.identity.zzc.zzb(zza, zzeeVar);
        zzc(91, zza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final com.google.android.gms.location.LocationAvailability zzp(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzb = zzb(34, zza);
        com.google.android.gms.location.LocationAvailability locationAvailability = (com.google.android.gms.location.LocationAvailability) com.google.android.gms.internal.identity.zzc.zza(zzb, com.google.android.gms.location.LocationAvailability.CREATOR);
        zzb.recycle();
        return locationAvailability;
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzq(com.google.android.gms.location.LastLocationRequest lastLocationRequest, com.google.android.gms.internal.identity.zzee zzeeVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.identity.zzc.zzb(zza, lastLocationRequest);
        com.google.android.gms.internal.identity.zzc.zzb(zza, zzeeVar);
        zzc(90, zza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzr(com.google.android.gms.location.LastLocationRequest lastLocationRequest, com.google.android.gms.internal.identity.zzz zzzVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.identity.zzc.zzb(zza, lastLocationRequest);
        com.google.android.gms.internal.identity.zzc.zzc(zza, zzzVar);
        zzc(82, zza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final android.location.Location zzs() throws android.os.RemoteException {
        android.os.Parcel zzb = zzb(7, zza());
        android.location.Location location = (android.location.Location) com.google.android.gms.internal.identity.zzc.zza(zzb, android.location.Location.CREATOR);
        zzb.recycle();
        return location;
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final com.google.android.gms.common.internal.ICancelToken zzt(com.google.android.gms.location.CurrentLocationRequest currentLocationRequest, com.google.android.gms.internal.identity.zzee zzeeVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.identity.zzc.zzb(zza, currentLocationRequest);
        com.google.android.gms.internal.identity.zzc.zzb(zza, zzeeVar);
        android.os.Parcel zzb = zzb(92, zza);
        com.google.android.gms.common.internal.ICancelToken asInterface = com.google.android.gms.common.internal.ICancelToken.Stub.asInterface(zzb.readStrongBinder());
        zzb.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final com.google.android.gms.common.internal.ICancelToken zzu(com.google.android.gms.location.CurrentLocationRequest currentLocationRequest, com.google.android.gms.internal.identity.zzz zzzVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.identity.zzc.zzb(zza, currentLocationRequest);
        com.google.android.gms.internal.identity.zzc.zzc(zza, zzzVar);
        android.os.Parcel zzb = zzb(87, zza);
        com.google.android.gms.common.internal.ICancelToken asInterface = com.google.android.gms.common.internal.ICancelToken.Stub.asInterface(zzb.readStrongBinder());
        zzb.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzv(com.google.android.gms.internal.identity.zzei zzeiVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.identity.zzc.zzb(zza, zzeiVar);
        zzc(59, zza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzw(com.google.android.gms.internal.identity.zzee zzeeVar, com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.identity.zzc.zzb(zza, zzeeVar);
        com.google.android.gms.internal.identity.zzc.zzb(zza, locationRequest);
        com.google.android.gms.internal.identity.zzc.zzc(zza, iStatusCallback);
        zzc(88, zza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzx(com.google.android.gms.internal.identity.zzee zzeeVar, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.identity.zzc.zzb(zza, zzeeVar);
        com.google.android.gms.internal.identity.zzc.zzc(zza, iStatusCallback);
        zzc(89, zza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzy(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.identity.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzz(boolean z, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.identity.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        com.google.android.gms.internal.identity.zzc.zzc(zza, iStatusCallback);
        zzc(84, zza);
    }
}
