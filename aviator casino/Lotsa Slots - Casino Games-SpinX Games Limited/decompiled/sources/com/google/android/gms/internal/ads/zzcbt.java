package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcbt extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzcbv {
    zzcbt(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zze() throws android.os.RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzf() throws android.os.RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzg() throws android.os.RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzh() throws android.os.RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzi(com.google.android.gms.internal.ads.zzcbp zzcbpVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzcbpVar);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzj() throws android.os.RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzk(int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzl() throws android.os.RemoteException {
        zzda(8, zza());
    }
}
