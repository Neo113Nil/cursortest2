package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcfc extends zzbeu implements zzcfe {
    zzcfc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zze(IObjectWrapper iObjectWrapper, zzcfi zzcfiVar, zzcfb zzcfbVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zzc(zzcZ, zzcfiVar);
        zzbew.zze(zzcZ, zzcfbVar);
        zzdb(1, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzcai zzcaiVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzcai zzcaiVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzi(zzcal zzcalVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(8, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzcai zzcaiVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzcai zzcaiVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final IObjectWrapper zzm(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zze(zzcZ, iObjectWrapper2);
        zzcZ.writeString(str);
        zzbew.zze(zzcZ, iObjectWrapper3);
        Parcel zzda = zzda(11, zzcZ);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }
}
