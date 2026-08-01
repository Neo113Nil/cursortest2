package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbxf extends zzbeu implements zzbxh {
    zzbxf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(1, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void zzf(String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString("Adapter returned null.");
        zzdb(2, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzeVar);
        zzdb(3, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void zzh(zzbwd zzbwdVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzbwdVar);
        zzdb(4, zzcZ);
    }
}
