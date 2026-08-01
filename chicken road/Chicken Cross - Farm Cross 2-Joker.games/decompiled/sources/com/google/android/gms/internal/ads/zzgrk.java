package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgrk extends zzbeu implements zzgrm {
    zzgrk(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzgrm
    public final void zze(String str, Bundle bundle, zzgro zzgroVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        zzbew.zzc(zzcZ, bundle);
        zzbew.zze(zzcZ, zzgroVar);
        zzdc(1, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzgrm
    public final void zzf(Bundle bundle, zzgro zzgroVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, bundle);
        zzbew.zze(zzcZ, zzgroVar);
        zzdc(2, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzgrm
    public final void zzg(Bundle bundle, zzgro zzgroVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, bundle);
        zzbew.zze(zzcZ, zzgroVar);
        zzdc(3, zzcZ);
    }
}
