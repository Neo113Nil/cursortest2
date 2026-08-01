package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzcbh extends zzbev implements zzcbi {
    public zzcbh() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzcbm zzcbmVar = null;
        zzcbn zzcbnVar = null;
        zzcbm zzcbmVar2 = null;
        zzcbm zzcbmVar3 = null;
        zzcbm zzcbmVar4 = null;
        switch (i) {
            case 1:
                zzbew.zzh(parcel);
                parcel2.writeNoException();
                zzbew.zzd(parcel2, null);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface instanceof zzcbj) {
                    }
                }
                zzbew.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                zzcbv zzcbvVar = (zzcbv) zzbew.zzb(parcel, zzcbv.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcbmVar = queryLocalInterface2 instanceof zzcbm ? (zzcbm) queryLocalInterface2 : new zzcbk(readStrongBinder2);
                }
                zzbew.zzh(parcel);
                zze(zzcbvVar, zzcbmVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzcbv zzcbvVar2 = (zzcbv) zzbew.zzb(parcel, zzcbv.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcbmVar4 = queryLocalInterface3 instanceof zzcbm ? (zzcbm) queryLocalInterface3 : new zzcbk(readStrongBinder3);
                }
                zzbew.zzh(parcel);
                zzf(zzcbvVar2, zzcbmVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzcbv zzcbvVar3 = (zzcbv) zzbew.zzb(parcel, zzcbv.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcbmVar3 = queryLocalInterface4 instanceof zzcbm ? (zzcbm) queryLocalInterface4 : new zzcbk(readStrongBinder4);
                }
                zzbew.zzh(parcel);
                zzg(zzcbvVar3, zzcbmVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcbmVar2 = queryLocalInterface5 instanceof zzcbm ? (zzcbm) queryLocalInterface5 : new zzcbk(readStrongBinder5);
                }
                zzbew.zzh(parcel);
                zzh(readString, zzcbmVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                zzcbe zzcbeVar = (zzcbe) zzbew.zzb(parcel, zzcbe.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    zzcbnVar = queryLocalInterface6 instanceof zzcbn ? (zzcbn) queryLocalInterface6 : new zzcbn(readStrongBinder6);
                }
                zzbew.zzh(parcel);
                zzj(zzcbeVar, zzcbnVar);
                parcel2.writeNoException();
                return true;
            case 9:
                String readString2 = parcel.readString();
                zzbew.zzh(parcel);
                zzi(readString2);
                parcel2.writeNoException();
                return true;
        }
    }
}
