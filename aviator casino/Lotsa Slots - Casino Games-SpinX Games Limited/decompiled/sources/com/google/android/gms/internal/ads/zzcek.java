package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcek extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzcem {
    zzcek(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcem
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzceq zzceqVar, com.google.android.gms.internal.ads.zzcej zzcejVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzceqVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzcejVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcem
    public final void zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcem
    public final void zzg(java.util.List list, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbzq zzbzqVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcem
    public final void zzh(java.util.List list, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbzq zzbzqVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcem
    public final void zzi(com.google.android.gms.internal.ads.zzbzt zzbztVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcem
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcem
    public final void zzk(java.util.List list, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbzq zzbzqVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcem
    public final void zzl(java.util.List list, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbzq zzbzqVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcem
    public final com.google.android.gms.dynamic.IObjectWrapper zzm(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, java.lang.String str, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper3) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper2);
        zza.writeString(str);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper3);
        android.os.Parcel zzcZ = zzcZ(11, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }
}
