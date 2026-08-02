package com.google.android.gms.internal.ads;

import F2.F0;
import F2.O;
import F2.P;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbbd;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class zzbvc extends zzaxo implements zzbvd {
    public zzbvc() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            zzbvh zzbvhVar = (zzbvh) zzaxp.zza(parcel, zzbvh.CREATOR);
            zzaxp.zzc(parcel);
            zzg(zzbvhVar);
            parcel2.writeNoException();
        } else if (i7 != 2) {
            zzbvg zzbvgVar = null;
            zzbvb zzbvbVar = null;
            P p5 = null;
            if (i7 == 3) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzbvgVar = queryLocalInterface instanceof zzbvg ? (zzbvg) queryLocalInterface : new zzbve(readStrongBinder);
                }
                zzaxp.zzc(parcel);
                zzo(zzbvgVar);
                parcel2.writeNoException();
            } else if (i7 != 34) {
                switch (i7) {
                    case 5:
                        boolean zzs = zzs();
                        parcel2.writeNoException();
                        int i9 = zzaxp.zza;
                        parcel2.writeInt(zzs ? 1 : 0);
                        break;
                    case 6:
                        zzh();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzj();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        zze();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        InterfaceC1506a Z6 = BinderC1507b.Z(parcel.readStrongBinder());
                        zzaxp.zzc(parcel);
                        zzi(Z6);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        InterfaceC1506a Z7 = BinderC1507b.Z(parcel.readStrongBinder());
                        zzaxp.zzc(parcel);
                        zzk(Z7);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        InterfaceC1506a Z8 = BinderC1507b.Z(parcel.readStrongBinder());
                        zzaxp.zzc(parcel);
                        zzf(Z8);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String zzd = zzd();
                        parcel2.writeNoException();
                        parcel2.writeString(zzd);
                        break;
                    case 13:
                        String readString = parcel.readString();
                        zzaxp.zzc(parcel);
                        zzp(readString);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                            p5 = queryLocalInterface2 instanceof P ? (P) queryLocalInterface2 : new O(readStrongBinder2);
                        }
                        zzaxp.zzc(parcel);
                        zzl(p5);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle zzb = zzb();
                        parcel2.writeNoException();
                        zzaxp.zze(parcel2, zzb);
                        break;
                    case 16:
                        IBinder readStrongBinder3 = parcel.readStrongBinder();
                        if (readStrongBinder3 != null) {
                            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            zzbvbVar = queryLocalInterface3 instanceof zzbvb ? (zzbvb) queryLocalInterface3 : new zzbvb(readStrongBinder3);
                        }
                        zzaxp.zzc(parcel);
                        zzu(zzbvbVar);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        zzaxp.zzc(parcel);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        InterfaceC1506a Z9 = BinderC1507b.Z(parcel.readStrongBinder());
                        zzaxp.zzc(parcel);
                        zzr(Z9);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        String readString2 = parcel.readString();
                        zzaxp.zzc(parcel);
                        zzm(readString2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zzt = zzt();
                        parcel2.writeNoException();
                        int i10 = zzaxp.zza;
                        parcel2.writeInt(zzt ? 1 : 0);
                        break;
                    case zzbbd.zzt.zzm /* 21 */:
                        F0 zzc = zzc();
                        parcel2.writeNoException();
                        zzaxp.zzf(parcel2, zzc);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean zzg = zzaxp.zzg(parcel);
                zzaxp.zzc(parcel);
                zzn(zzg);
                parcel2.writeNoException();
            }
        } else {
            zzq();
            parcel2.writeNoException();
        }
        return true;
    }
}
