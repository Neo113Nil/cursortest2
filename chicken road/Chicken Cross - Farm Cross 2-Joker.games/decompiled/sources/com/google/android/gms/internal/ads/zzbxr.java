package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbxr extends zzbeu implements zzbxt {
    zzbxr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void zze(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzr zzrVar, zzbxw zzbxwVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzcZ.writeString(str);
        zzbew.zzc(zzcZ, bundle);
        zzbew.zzc(zzcZ, bundle2);
        zzbew.zzc(zzcZ, zzrVar);
        zzbew.zze(zzcZ, zzbxwVar);
        zzdb(1, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final zzbyi zzf() throws RemoteException {
        Parcel zzda = zzda(2, zzcZ());
        zzbyi zzbyiVar = (zzbyi) zzbew.zzb(zzda, zzbyi.CREATOR);
        zzda.recycle();
        return zzbyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final zzbyi zzg() throws RemoteException {
        Parcel zzda = zzda(3, zzcZ());
        zzbyi zzbyiVar = (zzbyi) zzbew.zzb(zzda, zzbyi.CREATOR);
        zzda.recycle();
        return zzbyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final com.google.android.gms.ads.internal.client.zzea zzh() throws RemoteException {
        Parcel zzda = zzda(5, zzcZ());
        com.google.android.gms.ads.internal.client.zzea zza = com.google.android.gms.ads.internal.client.zzdz.zza(zzda.readStrongBinder());
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxh zzbxhVar, zzbwa zzbwaVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        zzcZ.writeString(str2);
        zzbew.zzc(zzcZ, zzmVar);
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zze(zzcZ, zzbxhVar);
        zzbew.zze(zzcZ, zzbwaVar);
        zzbew.zzc(zzcZ, zzrVar);
        zzdb(13, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxk zzbxkVar, zzbwa zzbwaVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        zzcZ.writeString(str2);
        zzbew.zzc(zzcZ, zzmVar);
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zze(zzcZ, zzbxkVar);
        zzbew.zze(zzcZ, zzbwaVar);
        zzdb(14, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final boolean zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        Parcel zzda = zzda(15, zzcZ);
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxq zzbxqVar, zzbwa zzbwaVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        zzcZ.writeString(str2);
        zzbew.zzc(zzcZ, zzmVar);
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zze(zzcZ, zzbxqVar);
        zzbew.zze(zzcZ, zzbwaVar);
        zzdb(16, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final boolean zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        Parcel zzda = zzda(17, zzcZ);
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxn zzbxnVar, zzbwa zzbwaVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        zzcZ.writeString(str2);
        zzbew.zzc(zzcZ, zzmVar);
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zze(zzcZ, zzbxnVar);
        zzbew.zze(zzcZ, zzbwaVar);
        zzdb(18, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void zzo(String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        zzdb(19, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxq zzbxqVar, zzbwa zzbwaVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        zzcZ.writeString(str2);
        zzbew.zzc(zzcZ, zzmVar);
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zze(zzcZ, zzbxqVar);
        zzbew.zze(zzcZ, zzbwaVar);
        zzdb(20, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void zzq(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxh zzbxhVar, zzbwa zzbwaVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        zzcZ.writeString(str2);
        zzbew.zzc(zzcZ, zzmVar);
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zze(zzcZ, zzbxhVar);
        zzbew.zze(zzcZ, zzbwaVar);
        zzbew.zzc(zzcZ, zzrVar);
        zzdb(21, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void zzr(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxn zzbxnVar, zzbwa zzbwaVar, zzbmk zzbmkVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        zzcZ.writeString(str2);
        zzbew.zzc(zzcZ, zzmVar);
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zze(zzcZ, zzbxnVar);
        zzbew.zze(zzcZ, zzbwaVar);
        zzbew.zzc(zzcZ, zzbmkVar);
        zzdb(22, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void zzs(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxe zzbxeVar, zzbwa zzbwaVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        zzcZ.writeString(str2);
        zzbew.zzc(zzcZ, zzmVar);
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zze(zzcZ, zzbxeVar);
        zzbew.zze(zzcZ, zzbwaVar);
        zzdb(23, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        Parcel zzda = zzda(24, zzcZ);
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }
}
