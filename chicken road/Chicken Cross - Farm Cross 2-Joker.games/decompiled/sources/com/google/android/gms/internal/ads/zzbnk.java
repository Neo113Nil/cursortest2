package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbnk extends zzbeu implements zzbnm {
    zzbnk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final String zze(String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        Parcel zzda = zzda(1, zzcZ);
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final zzbmv zzf(String str) throws RemoteException {
        zzbmv zzbmtVar;
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        Parcel zzda = zzda(2, zzcZ);
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzbmtVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbmtVar = queryLocalInterface instanceof zzbmv ? (zzbmv) queryLocalInterface : new zzbmt(readStrongBinder);
        }
        zzda.recycle();
        return zzbmtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final List zzg() throws RemoteException {
        Parcel zzda = zzda(3, zzcZ());
        ArrayList<String> createStringArrayList = zzda.createStringArrayList();
        zzda.recycle();
        return createStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final String zzh() throws RemoteException {
        Parcel zzda = zzda(4, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzi(String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        zzdb(5, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzj() throws RemoteException {
        zzdb(6, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final com.google.android.gms.ads.internal.client.zzea zzk() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzl() throws RemoteException {
        zzdb(8, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final IObjectWrapper zzm() throws RemoteException {
        Parcel zzda = zzda(9, zzcZ());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final boolean zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        Parcel zzda = zzda(10, zzcZ);
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final boolean zzo() throws RemoteException {
        Parcel zzda = zzda(12, zzcZ());
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final boolean zzp() throws RemoteException {
        Parcel zzda = zzda(13, zzcZ());
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(14, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzr() throws RemoteException {
        zzdb(15, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final zzbms zzs() throws RemoteException {
        zzbms zzbmqVar;
        Parcel zzda = zzda(16, zzcZ());
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzbmqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbmqVar = queryLocalInterface instanceof zzbms ? (zzbms) queryLocalInterface : new zzbmq(readStrongBinder);
        }
        zzda.recycle();
        return zzbmqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        Parcel zzda = zzda(17, zzcZ);
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }
}
