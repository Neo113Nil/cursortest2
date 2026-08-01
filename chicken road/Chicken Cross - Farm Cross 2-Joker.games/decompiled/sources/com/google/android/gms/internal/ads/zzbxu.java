package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbxu extends zzbeu implements zzbxw {
    zzbxu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbxw
    public final void zze(String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        zzdb(1, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbxw
    public final void zzf(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxw
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzeVar);
        zzdb(3, zzcZ);
    }
}
