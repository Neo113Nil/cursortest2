package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbva extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbvc {
    zzbva(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final com.google.android.gms.internal.ads.zzbvf zzb(java.lang.String str) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbvf zzbvdVar;
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzcZ = zzcZ(1, zza);
        android.os.IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvdVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbvdVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbvf ? (com.google.android.gms.internal.ads.zzbvf) queryLocalInterface : new com.google.android.gms.internal.ads.zzbvd(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbvdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final boolean zzc(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzcZ = zzcZ(2, zza);
        boolean zza2 = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final boolean zzd(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzcZ = zzcZ(4, zza);
        boolean zza2 = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final com.google.android.gms.internal.ads.zzbxb zze(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzcZ = zzcZ(3, zza);
        com.google.android.gms.internal.ads.zzbxb zzb = com.google.android.gms.internal.ads.zzbxa.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }
}
