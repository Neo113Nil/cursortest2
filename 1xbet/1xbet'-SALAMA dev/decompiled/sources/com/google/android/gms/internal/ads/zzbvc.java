package com.google.android.gms.internal.ads;

import F2.F0;
import F2.O;
import F2.P;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
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
            zzbvg zzbveVar = null;
            zzbvb zzbvbVar = null;
            P o7 = null;
            if (i7 == 3) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzbveVar = iInterfaceQueryLocalInterface instanceof zzbvg ? (zzbvg) iInterfaceQueryLocalInterface : new zzbve(strongBinder);
                }
                zzaxp.zzc(parcel);
                zzo(zzbveVar);
                parcel2.writeNoException();
            } else if (i7 != 34) {
                switch (i7) {
                    case 5:
                        boolean zZzs = zzs();
                        parcel2.writeNoException();
                        int i9 = zzaxp.zza;
                        parcel2.writeInt(zZzs ? 1 : 0);
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
                        p105o3.a aVarZ = p105o3.b.Z(parcel.readStrongBinder());
                        zzaxp.zzc(parcel);
                        zzi(aVarZ);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        p105o3.a aVarZ2 = p105o3.b.Z(parcel.readStrongBinder());
                        zzaxp.zzc(parcel);
                        zzk(aVarZ2);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        p105o3.a aVarZ3 = p105o3.b.Z(parcel.readStrongBinder());
                        zzaxp.zzc(parcel);
                        zzf(aVarZ3);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String strZzd = zzd();
                        parcel2.writeNoException();
                        parcel2.writeString(strZzd);
                        break;
                    case 13:
                        String string = parcel.readString();
                        zzaxp.zzc(parcel);
                        zzp(string);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        IBinder strongBinder2 = parcel.readStrongBinder();
                        if (strongBinder2 != null) {
                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                            o7 = iInterfaceQueryLocalInterface2 instanceof P ? (P) iInterfaceQueryLocalInterface2 : new O(strongBinder2);
                        }
                        zzaxp.zzc(parcel);
                        zzl(o7);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle bundleZzb = zzb();
                        parcel2.writeNoException();
                        zzaxp.zze(parcel2, bundleZzb);
                        break;
                    case 16:
                        IBinder strongBinder3 = parcel.readStrongBinder();
                        if (strongBinder3 != null) {
                            IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            zzbvbVar = iInterfaceQueryLocalInterface3 instanceof zzbvb ? (zzbvb) iInterfaceQueryLocalInterface3 : new zzbvb(strongBinder3);
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
                        p105o3.a aVarZ4 = p105o3.b.Z(parcel.readStrongBinder());
                        zzaxp.zzc(parcel);
                        zzr(aVarZ4);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        String string2 = parcel.readString();
                        zzaxp.zzc(parcel);
                        zzm(string2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zZzt = zzt();
                        parcel2.writeNoException();
                        int i10 = zzaxp.zza;
                        parcel2.writeInt(zZzt ? 1 : 0);
                        break;
                    case zzbbd.zzt.zzm /* 21 */:
                        F0 f0Zzc = zzc();
                        parcel2.writeNoException();
                        zzaxp.zzf(parcel2, f0Zzc);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean zZzg = zzaxp.zzg(parcel);
                zzaxp.zzc(parcel);
                zzn(zZzg);
                parcel2.writeNoException();
            }
        } else {
            zzq();
            parcel2.writeNoException();
        }
        return true;
    }
}
