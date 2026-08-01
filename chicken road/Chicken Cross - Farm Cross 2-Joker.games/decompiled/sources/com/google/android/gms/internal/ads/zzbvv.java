package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbvv extends zzbeu implements zzbvx {
    zzbvv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzA(boolean z) throws RemoteException {
        Parcel zzcZ = zzcZ();
        int i = zzbew.zza;
        zzcZ.writeInt(z ? 1 : 0);
        zzdb(25, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final com.google.android.gms.ads.internal.client.zzea zzB() throws RemoteException {
        Parcel zzda = zzda(26, zzcZ());
        com.google.android.gms.ads.internal.client.zzea zza = com.google.android.gms.ads.internal.client.zzdz.zza(zzda.readStrongBinder());
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbwj zzC() throws RemoteException {
        zzbwj zzbwhVar;
        Parcel zzda = zzda(27, zzcZ());
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzbwhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbwhVar = queryLocalInterface instanceof zzbwj ? (zzbwj) queryLocalInterface : new zzbwh(readStrongBinder);
        }
        zzda.recycle();
        return zzbwhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzD(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwa zzbwaVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zzc(zzcZ, zzmVar);
        zzcZ.writeString(str);
        zzbew.zze(zzcZ, zzbwaVar);
        zzdb(28, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzE(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(30, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzF(IObjectWrapper iObjectWrapper, zzbsl zzbslVar, List list) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zze(zzcZ, zzbslVar);
        zzcZ.writeTypedList(list);
        zzdb(31, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzG(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwa zzbwaVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zzc(zzcZ, zzmVar);
        zzcZ.writeString(str);
        zzbew.zze(zzcZ, zzbwaVar);
        zzdb(32, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbyi zzH() throws RemoteException {
        Parcel zzda = zzda(33, zzcZ());
        zzbyi zzbyiVar = (zzbyi) zzbew.zzb(zzda, zzbyi.CREATOR);
        zzda.recycle();
        return zzbyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbyi zzI() throws RemoteException {
        Parcel zzda = zzda(34, zzcZ());
        zzbyi zzbyiVar = (zzbyi) zzbew.zzb(zzda, zzbyi.CREATOR);
        zzda.recycle();
        return zzbyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzJ(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbwa zzbwaVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zzc(zzcZ, zzrVar);
        zzbew.zzc(zzcZ, zzmVar);
        zzcZ.writeString(str);
        zzcZ.writeString(str2);
        zzbew.zze(zzcZ, zzbwaVar);
        zzdb(35, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbwd zzK() throws RemoteException {
        zzbwd zzbwbVar;
        Parcel zzda = zzda(36, zzcZ());
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzbwbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbwbVar = queryLocalInterface instanceof zzbwd ? (zzbwd) queryLocalInterface : new zzbwb(readStrongBinder);
        }
        zzda.recycle();
        return zzbwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzL(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(37, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzM(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwa zzbwaVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zzc(zzcZ, zzmVar);
        zzcZ.writeString(str);
        zzbew.zze(zzcZ, zzbwaVar);
        zzdb(38, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzN(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(39, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbwf zzO() throws RemoteException {
        zzbwf zzbwfVar;
        Parcel zzda = zzda(15, zzcZ());
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzbwfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbwfVar = queryLocalInterface instanceof zzbwf ? (zzbwf) queryLocalInterface : new zzbwf(readStrongBinder);
        }
        zzda.recycle();
        return zzbwfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbwg zzP() throws RemoteException {
        zzbwg zzbwgVar;
        Parcel zzda = zzda(16, zzcZ());
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzbwgVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbwgVar = queryLocalInterface instanceof zzbwg ? (zzbwg) queryLocalInterface : new zzbwg(readStrongBinder);
        }
        zzda.recycle();
        return zzbwgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwa zzbwaVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final IObjectWrapper zzf() throws RemoteException {
        Parcel zzda = zzda(2, zzcZ());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwa zzbwaVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzh() throws RemoteException {
        zzdb(4, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzi() throws RemoteException {
        zzdb(5, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbwa zzbwaVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zzc(zzcZ, zzrVar);
        zzbew.zzc(zzcZ, zzmVar);
        zzcZ.writeString(str);
        zzcZ.writeString(str2);
        zzbew.zze(zzcZ, zzbwaVar);
        zzdb(6, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzk(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbwa zzbwaVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zzc(zzcZ, zzmVar);
        zzcZ.writeString(str);
        zzcZ.writeString(str2);
        zzbew.zze(zzcZ, zzbwaVar);
        zzdb(7, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzl() throws RemoteException {
        zzdb(8, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzm() throws RemoteException {
        zzdb(9, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzn(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzccs zzccsVar, String str2) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zzc(zzcZ, zzmVar);
        zzcZ.writeString(null);
        zzbew.zze(zzcZ, zzccsVar);
        zzcZ.writeString(str2);
        zzdb(10, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzo(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzmVar);
        zzcZ.writeString(str);
        zzdb(11, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzp() throws RemoteException {
        zzdb(12, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final boolean zzq() throws RemoteException {
        Parcel zzda = zzda(13, zzcZ());
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzr(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbwa zzbwaVar, zzbmk zzbmkVar, List list) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zzc(zzcZ, zzmVar);
        zzcZ.writeString(str);
        zzcZ.writeString(str2);
        zzbew.zze(zzcZ, zzbwaVar);
        zzbew.zzc(zzcZ, zzbmkVar);
        zzcZ.writeStringList(list);
        zzdb(14, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final Bundle zzs() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final Bundle zzt() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final Bundle zzu() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzv(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(21, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final boolean zzx() throws RemoteException {
        Parcel zzda = zzda(22, zzcZ());
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final void zzy(IObjectWrapper iObjectWrapper, zzccs zzccsVar, List list) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zze(zzcZ, zzccsVar);
        zzcZ.writeStringList(list);
        zzdb(23, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final zzbnm zzz() throws RemoteException {
        throw null;
    }
}
