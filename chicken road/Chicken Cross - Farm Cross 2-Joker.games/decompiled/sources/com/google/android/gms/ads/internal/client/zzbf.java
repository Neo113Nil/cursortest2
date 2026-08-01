package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbf extends zzbeu implements zzbh {
    zzbf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zza() throws RemoteException {
        zzdb(1, zzcZ());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzb(int i) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeInt(i);
        zzdb(2, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc(zze zzeVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzeVar);
        zzdb(8, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() throws RemoteException {
        zzdb(3, zzcZ());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze() throws RemoteException {
        zzdb(4, zzcZ());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf() throws RemoteException {
        zzdb(5, zzcZ());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() throws RemoteException {
        zzdb(6, zzcZ());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() throws RemoteException {
        zzdb(9, zzcZ());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() throws RemoteException {
        zzdb(7, zzcZ());
    }
}
