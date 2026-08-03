package com.google.android.gms.internal.appset;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes4.dex */
public final class zzg extends com.google.android.gms.internal.appset.zza implements android.os.IInterface {
    zzg(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void zzc(com.google.android.gms.appset.zza zzaVar, com.google.android.gms.internal.appset.zzf zzfVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.appset.zzc.zzb(zza, zzaVar);
        com.google.android.gms.internal.appset.zzc.zzc(zza, zzfVar);
        zzb(1, zza);
    }
}
