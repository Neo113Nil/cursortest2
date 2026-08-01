package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbmq extends zzbeu implements zzbms {
    zzbmq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final float zze() throws RemoteException {
        Parcel zzda = zzda(2, zzcZ());
        float readFloat = zzda.readFloat();
        zzda.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(3, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final IObjectWrapper zzg() throws RemoteException {
        Parcel zzda = zzda(4, zzcZ());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final float zzh() throws RemoteException {
        Parcel zzda = zzda(5, zzcZ());
        float readFloat = zzda.readFloat();
        zzda.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final float zzi() throws RemoteException {
        Parcel zzda = zzda(6, zzcZ());
        float readFloat = zzda.readFloat();
        zzda.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final com.google.android.gms.ads.internal.client.zzea zzj() throws RemoteException {
        Parcel zzda = zzda(7, zzcZ());
        com.google.android.gms.ads.internal.client.zzea zza = com.google.android.gms.ads.internal.client.zzdz.zza(zzda.readStrongBinder());
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final boolean zzk() throws RemoteException {
        Parcel zzda = zzda(8, zzcZ());
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final boolean zzl() throws RemoteException {
        Parcel zzda = zzda(10, zzcZ());
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final void zzm(zzboa zzboaVar) throws RemoteException {
        throw null;
    }
}
