package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbwg extends zzbeu implements IInterface {
    zzbwg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final String zze() throws RemoteException {
        Parcel zzda = zzda(2, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    public final List zzf() throws RemoteException {
        Parcel zzda = zzda(3, zzcZ());
        ArrayList zzf = zzbew.zzf(zzda);
        zzda.recycle();
        return zzf;
    }

    public final String zzg() throws RemoteException {
        Parcel zzda = zzda(4, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    public final zzbmv zzh() throws RemoteException {
        Parcel zzda = zzda(5, zzcZ());
        zzbmv zzg = zzbmu.zzg(zzda.readStrongBinder());
        zzda.recycle();
        return zzg;
    }

    public final String zzi() throws RemoteException {
        Parcel zzda = zzda(6, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    public final String zzj() throws RemoteException {
        Parcel zzda = zzda(7, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    public final void zzk() throws RemoteException {
        zzdb(8, zzcZ());
    }

    public final void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(9, zzcZ);
    }

    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(10, zzcZ);
    }

    public final boolean zzn() throws RemoteException {
        Parcel zzda = zzda(11, zzcZ());
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    public final boolean zzo() throws RemoteException {
        Parcel zzda = zzda(12, zzcZ());
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    public final Bundle zzp() throws RemoteException {
        Parcel zzda = zzda(13, zzcZ());
        Bundle bundle = (Bundle) zzbew.zzb(zzda, Bundle.CREATOR);
        zzda.recycle();
        return bundle;
    }

    public final void zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(14, zzcZ);
    }

    public final IObjectWrapper zzr() throws RemoteException {
        Parcel zzda = zzda(15, zzcZ());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    public final com.google.android.gms.ads.internal.client.zzea zzs() throws RemoteException {
        Parcel zzda = zzda(16, zzcZ());
        com.google.android.gms.ads.internal.client.zzea zza = com.google.android.gms.ads.internal.client.zzdz.zza(zzda.readStrongBinder());
        zzda.recycle();
        return zza;
    }

    public final zzbmo zzt() throws RemoteException {
        Parcel zzda = zzda(19, zzcZ());
        zzbmo zzi = zzbmn.zzi(zzda.readStrongBinder());
        zzda.recycle();
        return zzi;
    }

    public final IObjectWrapper zzu() throws RemoteException {
        Parcel zzda = zzda(20, zzcZ());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzv() throws RemoteException {
        Parcel zzda = zzda(21, zzcZ());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    public final void zzw(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zze(zzcZ, iObjectWrapper2);
        zzbew.zze(zzcZ, iObjectWrapper3);
        zzdb(22, zzcZ);
    }
}
