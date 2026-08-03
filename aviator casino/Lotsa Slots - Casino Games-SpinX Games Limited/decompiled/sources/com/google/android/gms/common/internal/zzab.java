package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public final class zzab extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.zzad {
    zzab(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.zzad
    public final boolean zze(com.google.android.gms.common.zzt zztVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zzc(zza, zztVar);
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        android.os.Parcel zzB = zzB(5, zza);
        boolean zza2 = com.google.android.gms.internal.common.zzc.zza(zzB);
        zzB.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.common.internal.zzad
    public final com.google.android.gms.common.zzr zzf(com.google.android.gms.common.zzp zzpVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zzc(zza, zzpVar);
        android.os.Parcel zzB = zzB(6, zza);
        com.google.android.gms.common.zzr zzrVar = (com.google.android.gms.common.zzr) com.google.android.gms.internal.common.zzc.zzb(zzB, com.google.android.gms.common.zzr.CREATOR);
        zzB.recycle();
        return zzrVar;
    }

    @Override // com.google.android.gms.common.internal.zzad
    public final boolean zzg() throws android.os.RemoteException {
        android.os.Parcel zzB = zzB(7, zza());
        boolean zza = com.google.android.gms.internal.common.zzc.zza(zzB);
        zzB.recycle();
        return zza;
    }

    @Override // com.google.android.gms.common.internal.zzad
    public final com.google.android.gms.common.zzr zzh(com.google.android.gms.common.zzp zzpVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zzc(zza, zzpVar);
        android.os.Parcel zzB = zzB(8, zza);
        com.google.android.gms.common.zzr zzrVar = (com.google.android.gms.common.zzr) com.google.android.gms.internal.common.zzc.zzb(zzB, com.google.android.gms.common.zzr.CREATOR);
        zzB.recycle();
        return zzrVar;
    }

    @Override // com.google.android.gms.common.internal.zzad
    public final boolean zzi() throws android.os.RemoteException {
        android.os.Parcel zzB = zzB(9, zza());
        boolean zza = com.google.android.gms.internal.common.zzc.zza(zzB);
        zzB.recycle();
        return zza;
    }
}
