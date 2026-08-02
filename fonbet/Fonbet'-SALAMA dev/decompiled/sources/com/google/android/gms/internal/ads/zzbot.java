package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbbd;

/* loaded from: classes.dex */
public abstract class zzbot extends zzaxo implements zzbou {
    public zzbot() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbou zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof zzbou ? (zzbou) queryLocalInterface : new zzbos(iBinder);
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
                int readInt = parcel.readInt();
                zzaxp.zzc(parcel);
                zzg(readInt);
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
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    boolean z4 = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata") instanceof zzboy;
                }
                zzaxp.zzc(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzaxp.zzc(parcel);
                zzq(readString, readString2);
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
                zzbvq zzb = zzbvp.zzb(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzt(zzb);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                zzaxp.zzc(parcel);
                zzj(readInt2);
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
                String readString3 = parcel.readString();
                zzaxp.zzc(parcel);
                zzl(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                zzaxp.zzc(parcel);
                zzi(readInt3, readString4);
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
