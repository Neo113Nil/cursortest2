package com.google.android.gms.internal.safetynet;

/* loaded from: classes8.dex */
public final class zzh extends com.google.android.gms.internal.safetynet.zza implements android.os.IInterface {
    zzh(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.safetynet.internal.ISafetyNetService");
    }

    public final void zzc(com.google.android.gms.internal.safetynet.zzg zzgVar, byte[] bArr, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.safetynet.zzc.zzb(zza, zzgVar);
        zza.writeByteArray(bArr);
        zza.writeString(str);
        zzb(7, zza);
    }

    public final void zzd(com.google.android.gms.internal.safetynet.zzg zzgVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.safetynet.zzc.zzb(zza, zzgVar);
        zzb(4, zza);
    }

    public final void zze(com.google.android.gms.internal.safetynet.zzg zzgVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.safetynet.zzc.zzb(zza, zzgVar);
        zzb(12, zza);
    }

    public final void zzf(com.google.android.gms.internal.safetynet.zzg zzgVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.safetynet.zzc.zzb(zza, zzgVar);
        zzb(14, zza);
    }

    public final void zzg(com.google.android.gms.internal.safetynet.zzg zzgVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.safetynet.zzc.zzb(zza, zzgVar);
        zzb(5, zza);
    }

    public final void zzh(com.google.android.gms.internal.safetynet.zzg zzgVar, java.lang.String str, int[] iArr, int i, java.lang.String str2) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.safetynet.zzc.zzb(zza, zzgVar);
        zza.writeString(str);
        zza.writeIntArray(iArr);
        zza.writeInt(i);
        zza.writeString(str2);
        zzb(3, zza);
    }

    public final void zzi() throws android.os.RemoteException {
        zzb(13, zza());
    }

    public final void zzj(com.google.android.gms.internal.safetynet.zzg zzgVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.safetynet.zzc.zzb(zza, zzgVar);
        zza.writeString(str);
        zzb(6, zza);
    }
}
