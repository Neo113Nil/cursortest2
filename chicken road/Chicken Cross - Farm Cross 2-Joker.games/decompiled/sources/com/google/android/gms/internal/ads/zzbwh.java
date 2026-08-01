package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbwh extends zzbeu implements zzbwj {
    zzbwh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final float zzA() throws RemoteException {
        Parcel zzda = zzda(24, zzcZ());
        float readFloat = zzda.readFloat();
        zzda.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final float zzB() throws RemoteException {
        Parcel zzda = zzda(25, zzcZ());
        float readFloat = zzda.readFloat();
        zzda.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzC() throws RemoteException {
        zzdb(26, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zze() throws RemoteException {
        Parcel zzda = zzda(2, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final List zzf() throws RemoteException {
        Parcel zzda = zzda(3, zzcZ());
        ArrayList zzf = zzbew.zzf(zzda);
        zzda.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zzg() throws RemoteException {
        Parcel zzda = zzda(4, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final zzbmv zzh() throws RemoteException {
        Parcel zzda = zzda(5, zzcZ());
        zzbmv zzg = zzbmu.zzg(zzda.readStrongBinder());
        zzda.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zzi() throws RemoteException {
        Parcel zzda = zzda(6, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zzj() throws RemoteException {
        Parcel zzda = zzda(7, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final double zzk() throws RemoteException {
        Parcel zzda = zzda(8, zzcZ());
        double readDouble = zzda.readDouble();
        zzda.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zzl() throws RemoteException {
        Parcel zzda = zzda(9, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zzm() throws RemoteException {
        Parcel zzda = zzda(10, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final com.google.android.gms.ads.internal.client.zzea zzn() throws RemoteException {
        Parcel zzda = zzda(11, zzcZ());
        com.google.android.gms.ads.internal.client.zzea zza = com.google.android.gms.ads.internal.client.zzdz.zza(zzda.readStrongBinder());
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final zzbmo zzo() throws RemoteException {
        Parcel zzda = zzda(12, zzcZ());
        zzbmo zzi = zzbmn.zzi(zzda.readStrongBinder());
        zzda.recycle();
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final IObjectWrapper zzp() throws RemoteException {
        Parcel zzda = zzda(13, zzcZ());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final IObjectWrapper zzq() throws RemoteException {
        Parcel zzda = zzda(14, zzcZ());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final IObjectWrapper zzr() throws RemoteException {
        Parcel zzda = zzda(15, zzcZ());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final Bundle zzs() throws RemoteException {
        Parcel zzda = zzda(16, zzcZ());
        Bundle bundle = (Bundle) zzbew.zzb(zzda, Bundle.CREATOR);
        zzda.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final boolean zzt() throws RemoteException {
        Parcel zzda = zzda(17, zzcZ());
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final boolean zzu() throws RemoteException {
        Parcel zzda = zzda(18, zzcZ());
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzv() throws RemoteException {
        zzdb(19, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(20, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzx(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zze(zzcZ, iObjectWrapper2);
        zzbew.zze(zzcZ, iObjectWrapper3);
        zzdb(21, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzy(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(22, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final float zzz() throws RemoteException {
        Parcel zzda = zzda(23, zzcZ());
        float readFloat = zzda.readFloat();
        zzda.recycle();
        return readFloat;
    }
}
