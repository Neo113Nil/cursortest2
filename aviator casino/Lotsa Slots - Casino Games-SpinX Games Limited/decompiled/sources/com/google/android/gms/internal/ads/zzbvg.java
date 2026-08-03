package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbvg extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbvi {
    zzbvg(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zze() throws android.os.RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzf() throws android.os.RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzg(int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzh() throws android.os.RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzi() throws android.os.RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzj() throws android.os.RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzk() throws android.os.RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzl(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzda(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzm(com.google.android.gms.internal.ads.zzbmv zzbmvVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbmvVar);
        zza.writeString(str);
        zzda(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzn() throws android.os.RemoteException {
        zzda(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzo() throws android.os.RemoteException {
        zzda(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzp(com.google.android.gms.internal.ads.zzccb zzccbVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzq() throws android.os.RemoteException {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzr(com.google.android.gms.internal.ads.zzccf zzccfVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzccfVar);
        zzda(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzs(int i) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzt() throws android.os.RemoteException {
        zzda(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzu() throws android.os.RemoteException {
        zzda(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzv(java.lang.String str) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzw(int i, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        zzda(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzeVar);
        zzda(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzeVar);
        zzda(24, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzz() throws android.os.RemoteException {
        zzda(25, zza());
    }
}
