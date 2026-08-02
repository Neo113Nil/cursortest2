package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbvv extends zzaxo implements zzbvw {
    public zzbvv() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbvq zzbvoVar;
        switch (i7) {
            case 1:
                zzj();
                break;
            case 2:
                zzg();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbvoVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    zzbvoVar = queryLocalInterface instanceof zzbvq ? (zzbvq) queryLocalInterface : new zzbvo(readStrongBinder);
                }
                zzaxp.zzc(parcel);
                zzk(zzbvoVar);
                break;
            case 4:
                int readInt = parcel.readInt();
                zzaxp.zzc(parcel);
                zzh(readInt);
                break;
            case 5:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzaxp.zzc(parcel);
                zzi(zzeVar);
                break;
            case 6:
                zzf();
                break;
            case 7:
                zze();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
