package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class zzbvk extends zzaxo implements zzbvl {
    public zzbvk() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzbvl zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof zzbvl ? (zzbvl) queryLocalInterface : new zzbvj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                InterfaceC1506a Z6 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzl(Z6);
                break;
            case 2:
                InterfaceC1506a Z7 = BinderC1507b.Z(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzaxp.zzc(parcel);
                zzk(Z7, readInt);
                break;
            case 3:
                InterfaceC1506a Z8 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzi(Z8);
                break;
            case 4:
                InterfaceC1506a Z9 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzj(Z9);
                break;
            case 5:
                InterfaceC1506a Z10 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzp(Z10);
                break;
            case 6:
                InterfaceC1506a Z11 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzf(Z11);
                break;
            case 7:
                InterfaceC1506a Z12 = BinderC1507b.Z(parcel.readStrongBinder());
                zzbvm zzbvmVar = (zzbvm) zzaxp.zza(parcel, zzbvm.CREATOR);
                zzaxp.zzc(parcel);
                zzm(Z12, zzbvmVar);
                break;
            case 8:
                InterfaceC1506a Z13 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zze(Z13);
                break;
            case 9:
                InterfaceC1506a Z14 = BinderC1507b.Z(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzaxp.zzc(parcel);
                zzg(Z14, readInt2);
                break;
            case 10:
                InterfaceC1506a Z15 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzh(Z15);
                break;
            case 11:
                InterfaceC1506a Z16 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzo(Z16);
                break;
            case 12:
                zzaxp.zzc(parcel);
                break;
            case 13:
                InterfaceC1506a Z17 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzn(Z17);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
