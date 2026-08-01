package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbok extends zzbeu implements zzbom {
    zzbok(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final boolean zzA() throws RemoteException {
        Parcel zzda = zzda(24, zzcZ());
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzB(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzdgVar);
        zzdb(25, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzC(com.google.android.gms.ads.internal.client.zzdc zzdcVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzdcVar);
        zzdb(26, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzD() throws RemoteException {
        zzdb(27, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzE() throws RemoteException {
        zzdb(28, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final zzbms zzF() throws RemoteException {
        zzbms zzbmqVar;
        Parcel zzda = zzda(29, zzcZ());
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

    @Override // com.google.android.gms.internal.ads.zzbom
    public final boolean zzG() throws RemoteException {
        Parcel zzda = zzda(30, zzcZ());
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final com.google.android.gms.ads.internal.client.zzdx zzH() throws RemoteException {
        Parcel zzda = zzda(31, zzcZ());
        com.google.android.gms.ads.internal.client.zzdx zza = com.google.android.gms.ads.internal.client.zzdw.zza(zzda.readStrongBinder());
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzI(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzdqVar);
        zzdb(32, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzJ(Bundle bundle) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, bundle);
        zzdb(33, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final long zzK() throws RemoteException {
        Parcel zzda = zzda(34, zzcZ());
        long readLong = zzda.readLong();
        zzda.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzL(long j) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeLong(j);
        zzdb(35, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zze() throws RemoteException {
        Parcel zzda = zzda(2, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final List zzf() throws RemoteException {
        Parcel zzda = zzda(3, zzcZ());
        ArrayList zzf = zzbew.zzf(zzda);
        zzda.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zzg() throws RemoteException {
        Parcel zzda = zzda(4, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final zzbmv zzh() throws RemoteException {
        zzbmv zzbmtVar;
        Parcel zzda = zzda(5, zzcZ());
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

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zzi() throws RemoteException {
        Parcel zzda = zzda(6, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zzj() throws RemoteException {
        Parcel zzda = zzda(7, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final double zzk() throws RemoteException {
        Parcel zzda = zzda(8, zzcZ());
        double readDouble = zzda.readDouble();
        zzda.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zzl() throws RemoteException {
        Parcel zzda = zzda(9, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zzm() throws RemoteException {
        Parcel zzda = zzda(10, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final com.google.android.gms.ads.internal.client.zzea zzn() throws RemoteException {
        Parcel zzda = zzda(11, zzcZ());
        com.google.android.gms.ads.internal.client.zzea zza = com.google.android.gms.ads.internal.client.zzdz.zza(zzda.readStrongBinder());
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final String zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzp() throws RemoteException {
        zzdb(13, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final zzbmo zzq() throws RemoteException {
        zzbmo zzbmmVar;
        Parcel zzda = zzda(14, zzcZ());
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzbmmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbmmVar = queryLocalInterface instanceof zzbmo ? (zzbmo) queryLocalInterface : new zzbmm(readStrongBinder);
        }
        zzda.recycle();
        return zzbmmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzr(Bundle bundle) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, bundle);
        zzdb(15, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final boolean zzs(Bundle bundle) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, bundle);
        Parcel zzda = zzda(16, zzcZ);
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzt(Bundle bundle) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, bundle);
        zzdb(17, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final IObjectWrapper zzu() throws RemoteException {
        Parcel zzda = zzda(18, zzcZ());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final IObjectWrapper zzv() throws RemoteException {
        Parcel zzda = zzda(19, zzcZ());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final Bundle zzw() throws RemoteException {
        Parcel zzda = zzda(20, zzcZ());
        Bundle bundle = (Bundle) zzbew.zzb(zzda, Bundle.CREATOR);
        zzda.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzx(zzboj zzbojVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzbojVar);
        zzdb(21, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zzy() throws RemoteException {
        zzdb(22, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final List zzz() throws RemoteException {
        Parcel zzda = zzda(23, zzcZ());
        ArrayList zzf = zzbew.zzf(zzda);
        zzda.recycle();
        return zzf;
    }
}
