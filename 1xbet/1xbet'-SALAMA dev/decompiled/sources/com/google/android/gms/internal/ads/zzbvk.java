package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbvk extends zzaxo implements zzbvl {
    public zzbvk() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzbvl zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof zzbvl ? (zzbvl) iInterfaceQueryLocalInterface : new zzbvj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                p105o3.a aVarZ = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzl(aVarZ);
                break;
            case 2:
                p105o3.a aVarZ2 = p105o3.b.Z(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                zzaxp.zzc(parcel);
                zzk(aVarZ2, i9);
                break;
            case 3:
                p105o3.a aVarZ3 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzi(aVarZ3);
                break;
            case 4:
                p105o3.a aVarZ4 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzj(aVarZ4);
                break;
            case 5:
                p105o3.a aVarZ5 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzp(aVarZ5);
                break;
            case 6:
                p105o3.a aVarZ6 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzf(aVarZ6);
                break;
            case 7:
                p105o3.a aVarZ7 = p105o3.b.Z(parcel.readStrongBinder());
                zzbvm zzbvmVar = (zzbvm) zzaxp.zza(parcel, zzbvm.CREATOR);
                zzaxp.zzc(parcel);
                zzm(aVarZ7, zzbvmVar);
                break;
            case 8:
                p105o3.a aVarZ8 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zze(aVarZ8);
                break;
            case 9:
                p105o3.a aVarZ9 = p105o3.b.Z(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                zzaxp.zzc(parcel);
                zzg(aVarZ9, i10);
                break;
            case 10:
                p105o3.a aVarZ10 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzh(aVarZ10);
                break;
            case 11:
                p105o3.a aVarZ11 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzo(aVarZ11);
                break;
            case 12:
                zzaxp.zzc(parcel);
                break;
            case 13:
                p105o3.a aVarZ12 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzn(aVarZ12);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
