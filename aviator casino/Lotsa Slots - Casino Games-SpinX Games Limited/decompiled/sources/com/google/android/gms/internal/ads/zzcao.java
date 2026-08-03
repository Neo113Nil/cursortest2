package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcao extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzcaq {
    zzcao(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zze(com.google.android.gms.internal.ads.zzcbd zzcbdVar, com.google.android.gms.internal.ads.zzcau zzcauVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzcbdVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzcauVar);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzf(com.google.android.gms.internal.ads.zzcbd zzcbdVar, com.google.android.gms.internal.ads.zzcau zzcauVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzcbdVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzcauVar);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzg(com.google.android.gms.internal.ads.zzcbd zzcbdVar, com.google.android.gms.internal.ads.zzcau zzcauVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzcbdVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzcauVar);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzh(java.lang.String str, com.google.android.gms.internal.ads.zzcau zzcauVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzcauVar);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzi(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zzda(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzj(com.google.android.gms.internal.ads.zzcam zzcamVar, com.google.android.gms.internal.ads.zzcav zzcavVar) throws android.os.RemoteException {
        throw null;
    }
}
