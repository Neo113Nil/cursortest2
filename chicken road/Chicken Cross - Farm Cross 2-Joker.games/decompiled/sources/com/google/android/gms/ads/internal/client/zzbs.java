package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbkb;
import com.google.android.gms.internal.ads.zzcac;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzccn;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbs extends zzbeu implements zzbu {
    zzbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzA() throws RemoteException {
        Parcel zzda = zzda(23, zzcZ());
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB(zzccn zzccnVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzea zzE() throws RemoteException {
        zzea zzdyVar;
        Parcel zzda = zzda(26, zzcZ());
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzdyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzdyVar = queryLocalInterface instanceof zzea ? (zzea) queryLocalInterface : new zzdy(readStrongBinder);
        }
        zzda.recycle();
        return zzdyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(zzfw zzfwVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzfwVar);
        zzdb(29, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzee zzeeVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzx zzxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzbhc zzbhcVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzbhcVar);
        zzdb(40, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(boolean z) throws RemoteException {
        Parcel zzcZ = zzcZ();
        int i = zzbew.zza;
        zzcZ.writeInt(z ? 1 : 0);
        zzdb(34, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(zzdq zzdqVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzdqVar);
        zzdb(42, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzm zzmVar, zzbk zzbkVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzmVar);
        zzbew.zze(zzcZ, zzbkVar);
        zzdb(43, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(44, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(zzcs zzcsVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzcsVar);
        zzdb(45, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(long j) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeLong(j);
        zzdb(48, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final long zzT() throws RemoteException {
        Parcel zzda = zzda(47, zzcZ());
        long readLong = zzda.readLong();
        zzda.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX(zzcp zzcpVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zza() throws RemoteException {
        Parcel zzda = zzda(1, zzcZ());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzb() throws RemoteException {
        zzdb(2, zzcZ());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzc() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzd(zzm zzmVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzmVar);
        Parcel zzda = zzda(4, zzcZ);
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdU(zzcl zzclVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzclVar);
        zzdb(8, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zze() throws RemoteException {
        zzdb(5, zzcZ());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf() throws RemoteException {
        zzdb(6, zzcZ());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(zzbh zzbhVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzbhVar);
        zzdb(7, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(zzby zzbyVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzj() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzk() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl() throws RemoteException {
        zzdb(11, zzcZ());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzr zzm() throws RemoteException {
        Parcel zzda = zzda(12, zzcZ());
        zzr zzrVar = (zzr) zzbew.zzb(zzda, zzr.CREATOR);
        zzda.recycle();
        return zzrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzn(zzr zzrVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzrVar);
        zzdb(13, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(zzcac zzcacVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(zzcaf zzcafVar, String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzq() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdx zzs() throws RemoteException {
        zzdx zzdvVar;
        Parcel zzda = zzda(41, zzcZ());
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzdvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdvVar = queryLocalInterface instanceof zzdx ? (zzdx) queryLocalInterface : new zzdv(readStrongBinder);
        }
        zzda.recycle();
        return zzdvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzt() throws RemoteException {
        Parcel zzda = zzda(31, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcl zzu() throws RemoteException {
        zzcl zzcjVar;
        Parcel zzda = zzda(32, zzcZ());
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzcjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzcjVar = queryLocalInterface instanceof zzcl ? (zzcl) queryLocalInterface : new zzcj(readStrongBinder);
        }
        zzda.recycle();
        return zzcjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzv() throws RemoteException {
        zzbh zzbfVar;
        Parcel zzda = zzda(33, zzcZ());
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzbfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzbfVar = queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbf(readStrongBinder);
        }
        zzda.recycle();
        return zzbfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzw(zzbkb zzbkbVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx(zzbe zzbeVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzbeVar);
        zzdb(20, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(boolean z) throws RemoteException {
        Parcel zzcZ = zzcZ();
        int i = zzbew.zza;
        zzcZ.writeInt(z ? 1 : 0);
        zzdb(22, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzz() throws RemoteException {
        Parcel zzda = zzda(46, zzcZ());
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }
}
