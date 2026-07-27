package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfzp extends zzbeu implements IInterface {
    zzfzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfzn zze(zzfzl zzfzlVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzfzlVar);
        Parcel zzda = zzda(1, zzcZ);
        zzfzn zzfznVar = (zzfzn) zzbew.zzb(zzda, zzfzn.CREATOR);
        zzda.recycle();
        return zzfznVar;
    }

    public final void zzf(zzfzi zzfziVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzfziVar);
        zzdb(2, zzcZ);
    }

    public final zzfzw zzg(zzfzu zzfzuVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzfzuVar);
        Parcel zzda = zzda(3, zzcZ);
        zzfzw zzfzwVar = (zzfzw) zzbew.zzb(zzda, zzfzw.CREATOR);
        zzda.recycle();
        return zzfzwVar;
    }
}
