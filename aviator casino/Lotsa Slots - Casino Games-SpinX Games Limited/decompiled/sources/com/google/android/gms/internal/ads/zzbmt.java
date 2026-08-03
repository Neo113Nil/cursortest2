package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbmt extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbmv {
    zzbmt(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final java.lang.String zze(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzcZ = zzcZ(1, zza);
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final com.google.android.gms.internal.ads.zzbme zzf(java.lang.String str) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbme zzbmcVar;
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzcZ = zzcZ(2, zza);
        android.os.IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbmcVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbmcVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbme ? (com.google.android.gms.internal.ads.zzbme) queryLocalInterface : new com.google.android.gms.internal.ads.zzbmc(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbmcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final java.util.List zzg() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(3, zza());
        java.util.ArrayList<java.lang.String> createStringArrayList = zzcZ.createStringArrayList();
        zzcZ.recycle();
        return createStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final java.lang.String zzh() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(4, zza());
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzi(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzj() throws android.os.RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final com.google.android.gms.ads.internal.client.zzea zzk() throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzl() throws android.os.RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final com.google.android.gms.dynamic.IObjectWrapper zzm() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(9, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final boolean zzn(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        android.os.Parcel zzcZ = zzcZ(10, zza);
        boolean zza2 = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final boolean zzo() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(12, zza());
        boolean zza = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final boolean zzp() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(13, zza());
        boolean zza = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzq(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        zzda(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzr() throws android.os.RemoteException {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final com.google.android.gms.internal.ads.zzbmb zzs() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbmb zzblzVar;
        android.os.Parcel zzcZ = zzcZ(16, zza());
        android.os.IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzblzVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzblzVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbmb ? (com.google.android.gms.internal.ads.zzbmb) queryLocalInterface : new com.google.android.gms.internal.ads.zzblz(readStrongBinder);
        }
        zzcZ.recycle();
        return zzblzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final boolean zzt(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        android.os.Parcel zzcZ = zzcZ(17, zza);
        boolean zza2 = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }
}
