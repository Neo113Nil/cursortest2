package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbvy extends zzbeu implements zzbwa {
    zzbvy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zze() throws RemoteException {
        zzdb(1, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzf() throws RemoteException {
        zzdb(2, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzg(int i) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeInt(i);
        zzdb(3, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzh() throws RemoteException {
        zzdb(4, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzi() throws RemoteException {
        zzdb(5, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzj() throws RemoteException {
        zzdb(6, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzk() throws RemoteException {
        zzdb(8, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzl(String str, String str2) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        zzcZ.writeString(str2);
        zzdb(9, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzm(zzbnm zzbnmVar, String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzbnmVar);
        zzcZ.writeString(str);
        zzdb(10, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzn() throws RemoteException {
        zzdb(11, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzo() throws RemoteException {
        zzdb(13, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzp(zzcct zzcctVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzq() throws RemoteException {
        zzdb(15, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzr(zzccx zzccxVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzccxVar);
        zzdb(16, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzs(int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzt() throws RemoteException {
        zzdb(18, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzu() throws RemoteException {
        zzdb(20, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzv(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzw(int i, String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeInt(i);
        zzcZ.writeString(str);
        zzdb(22, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzeVar);
        zzdb(23, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzeVar);
        zzdb(24, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzz() throws RemoteException {
        zzdb(25, zzcZ());
    }
}
