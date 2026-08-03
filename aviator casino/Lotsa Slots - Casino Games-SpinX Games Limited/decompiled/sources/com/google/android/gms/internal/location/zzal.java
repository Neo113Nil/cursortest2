package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes4.dex */
public final class zzal extends com.google.android.gms.internal.location.zza implements com.google.android.gms.internal.location.zzam {
    zzal(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzd(com.google.android.gms.location.GeofencingRequest geofencingRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzak zzakVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, geofencingRequest);
        com.google.android.gms.internal.location.zzc.zzc(zza, pendingIntent);
        com.google.android.gms.internal.location.zzc.zzd(zza, zzakVar);
        zzx(57, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zze(android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzak zzakVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, pendingIntent);
        com.google.android.gms.internal.location.zzc.zzd(zza, zzakVar);
        zza.writeString(str);
        zzx(2, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzf(java.lang.String[] strArr, com.google.android.gms.internal.location.zzak zzakVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeStringArray(strArr);
        com.google.android.gms.internal.location.zzc.zzd(zza, zzakVar);
        zza.writeString(str);
        zzx(3, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzg(com.google.android.gms.location.zzbq zzbqVar, com.google.android.gms.internal.location.zzak zzakVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, zzbqVar);
        com.google.android.gms.internal.location.zzc.zzd(zza, zzakVar);
        zzx(74, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzh(long j, boolean z, android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeLong(j);
        com.google.android.gms.internal.location.zzc.zza(zza, true);
        com.google.android.gms.internal.location.zzc.zzc(zza, pendingIntent);
        zzx(5, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzi(com.google.android.gms.location.ActivityTransitionRequest activityTransitionRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, activityTransitionRequest);
        com.google.android.gms.internal.location.zzc.zzc(zza, pendingIntent);
        com.google.android.gms.internal.location.zzc.zzd(zza, iStatusCallback);
        zzx(72, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzj(android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, pendingIntent);
        com.google.android.gms.internal.location.zzc.zzd(zza, iStatusCallback);
        zzx(73, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzk(android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, pendingIntent);
        zzx(6, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzl(android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, pendingIntent);
        com.google.android.gms.internal.location.zzc.zzd(zza, iStatusCallback);
        zzx(69, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final android.location.Location zzm() throws android.os.RemoteException {
        android.os.Parcel zzw = zzw(7, zza());
        android.location.Location location = (android.location.Location) com.google.android.gms.internal.location.zzc.zzb(zzw, android.location.Location.CREATOR);
        zzw.recycle();
        return location;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final android.location.Location zzn(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzw = zzw(80, zza);
        android.location.Location location = (android.location.Location) com.google.android.gms.internal.location.zzc.zzb(zzw, android.location.Location.CREATOR);
        zzw.recycle();
        return location;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzo(com.google.android.gms.internal.location.zzbc zzbcVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, zzbcVar);
        zzx(59, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzp(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zza(zza, z);
        zzx(12, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzq(android.location.Location location) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, location);
        zzx(13, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzr(com.google.android.gms.internal.location.zzai zzaiVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzd(zza, zzaiVar);
        zzx(67, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final com.google.android.gms.location.LocationAvailability zzs(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzw = zzw(34, zza);
        com.google.android.gms.location.LocationAvailability locationAvailability = (com.google.android.gms.location.LocationAvailability) com.google.android.gms.internal.location.zzc.zzb(zzw, com.google.android.gms.location.LocationAvailability.CREATOR);
        zzw.recycle();
        return locationAvailability;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzt(com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest, com.google.android.gms.internal.location.zzao zzaoVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, locationSettingsRequest);
        com.google.android.gms.internal.location.zzc.zzd(zza, zzaoVar);
        zza.writeString(null);
        zzx(63, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzu(com.google.android.gms.internal.location.zzl zzlVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, zzlVar);
        zzx(75, zza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzv(android.app.PendingIntent pendingIntent, com.google.android.gms.location.SleepSegmentRequest sleepSegmentRequest, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.location.zzc.zzc(zza, pendingIntent);
        com.google.android.gms.internal.location.zzc.zzc(zza, sleepSegmentRequest);
        com.google.android.gms.internal.location.zzc.zzd(zza, iStatusCallback);
        zzx(79, zza);
    }
}
