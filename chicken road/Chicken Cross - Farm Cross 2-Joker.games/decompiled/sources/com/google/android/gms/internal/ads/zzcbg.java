package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcbg extends zzbeu implements zzcbi {
    zzcbg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zze(zzcbv zzcbvVar, zzcbm zzcbmVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzcbvVar);
        zzbew.zze(zzcZ, zzcbmVar);
        zzdb(4, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzf(zzcbv zzcbvVar, zzcbm zzcbmVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzcbvVar);
        zzbew.zze(zzcZ, zzcbmVar);
        zzdb(5, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzg(zzcbv zzcbvVar, zzcbm zzcbmVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzcbvVar);
        zzbew.zze(zzcZ, zzcbmVar);
        zzdb(6, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzh(String str, zzcbm zzcbmVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        zzbew.zze(zzcZ, zzcbmVar);
        zzdb(7, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzi(String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        zzdb(9, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzj(zzcbe zzcbeVar, zzcbn zzcbnVar) throws RemoteException {
        throw null;
    }
}
