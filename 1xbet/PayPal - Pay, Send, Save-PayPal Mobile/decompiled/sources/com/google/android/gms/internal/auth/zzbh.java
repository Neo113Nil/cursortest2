package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
public final class zzbh extends com.google.android.gms.internal.auth.zza implements android.os.IInterface {
    zzbh(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void zzd(com.google.android.gms.internal.auth.zzbg zzbgVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.auth.zzc.zzd(zza, zzbgVar);
        zzc(3, zza);
    }

    public final void zze(com.google.android.gms.internal.auth.zzbg zzbgVar, com.google.android.gms.auth.api.proxy.ProxyRequest proxyRequest) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.auth.zzc.zzd(zza, zzbgVar);
        com.google.android.gms.internal.auth.zzc.zzc(zza, proxyRequest);
        zzc(1, zza);
    }
}
