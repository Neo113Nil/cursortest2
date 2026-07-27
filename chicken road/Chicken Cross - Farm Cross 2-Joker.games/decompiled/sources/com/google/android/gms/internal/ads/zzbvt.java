package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzbvt extends zzbev implements zzbvu {
    public zzbvt() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbvu zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof zzbvu ? (zzbvu) queryLocalInterface : new zzbvs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String readString = parcel.readString();
            zzbew.zzh(parcel);
            zzbvx zza = zza(readString);
            parcel2.writeNoException();
            zzbew.zze(parcel2, zza);
        } else if (i == 2) {
            String readString2 = parcel.readString();
            zzbew.zzh(parcel);
            boolean zzb = zzb(readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zzb ? 1 : 0);
        } else if (i == 3) {
            String readString3 = parcel.readString();
            zzbew.zzh(parcel);
            zzbxt zzd = zzd(readString3);
            parcel2.writeNoException();
            zzbew.zze(parcel2, zzd);
        } else {
            if (i != 4) {
                return false;
            }
            String readString4 = parcel.readString();
            zzbew.zzh(parcel);
            boolean zzc = zzc(readString4);
            parcel2.writeNoException();
            parcel2.writeInt(zzc ? 1 : 0);
        }
        return true;
    }
}
