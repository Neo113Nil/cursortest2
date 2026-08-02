package com.google.android.gms.internal.p001authapiphone;

/* loaded from: classes8.dex */
public final class zzk extends com.google.android.gms.internal.p001authapiphone.zza implements android.os.IInterface {
    zzk(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    public final void zzc(com.google.android.gms.internal.p001authapiphone.zzm zzmVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.p001authapiphone.zzc.zzb(zza, zzmVar);
        zzb(1, zza);
    }

    public final void zzd(java.lang.String str, com.google.android.gms.internal.p001authapiphone.zzm zzmVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        com.google.android.gms.internal.p001authapiphone.zzc.zzb(zza, zzmVar);
        zzb(2, zza);
    }

    public final void zze(com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.p001authapiphone.zzc.zzb(zza, iStatusCallback);
        zzb(3, zza);
    }

    public final void zzf(com.google.android.gms.internal.p001authapiphone.zze zzeVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.p001authapiphone.zzc.zzb(zza, zzeVar);
        zzb(4, zza);
    }

    public final void zzg(java.lang.String str, com.google.android.gms.internal.p001authapiphone.zzj zzjVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        com.google.android.gms.internal.p001authapiphone.zzc.zzb(zza, zzjVar);
        zzb(5, zza);
    }

    public final void zzh(com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.p001authapiphone.zzc.zzb(zza, iStatusCallback);
        zzb(6, zza);
    }
}
