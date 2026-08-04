package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbot extends zzaxo implements zzbou {
    public zzbot() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbou zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof zzbou ? (zzbou) iInterfaceQueryLocalInterface : new zzbos(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int i9 = parcel.readInt();
                zzaxp.zzc(parcel);
                zzg(i9);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    boolean z4 = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata") instanceof zzboy;
                }
                zzaxp.zzc(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzaxp.zzc(parcel);
                zzq(string, string2);
                break;
            case 10:
                zzbgc.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzaxp.zzc(parcel);
                break;
            case 11:
                zzw();
                break;
            case 12:
                parcel.readString();
                zzaxp.zzc(parcel);
                break;
            case 13:
                zzz();
                break;
            case 14:
                zzbvm zzbvmVar = (zzbvm) zzaxp.zza(parcel, zzbvm.CREATOR);
                zzaxp.zzc(parcel);
                zzs(zzbvmVar);
                break;
            case 15:
                zzx();
                break;
            case 16:
                zzbvq zzbvqVarZzb = zzbvp.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzt(zzbvqVarZzb);
                break;
            case 17:
                int i10 = parcel.readInt();
                zzaxp.zzc(parcel);
                zzj(i10);
                break;
            case 18:
                zzv();
                break;
            case 19:
                zzaxp.zzc(parcel);
                break;
            case 20:
                zzy();
                break;
            case zzbbd.zzt.zzm /* 21 */:
                String string3 = parcel.readString();
                zzaxp.zzc(parcel);
                zzl(string3);
                break;
            case 22:
                int i11 = parcel.readInt();
                String string4 = parcel.readString();
                zzaxp.zzc(parcel);
                zzi(i11, string4);
                break;
            case 23:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzaxp.zzc(parcel);
                zzh(zzeVar);
                break;
            case 24:
                com.google.android.gms.ads.internal.client.zze zzeVar2 = (com.google.android.gms.ads.internal.client.zze) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzaxp.zzc(parcel);
                zzk(zzeVar2);
                break;
            case 25:
                zzu();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
