package com.google.android.gms.internal.ads;

import F2.I0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class zzbgc extends zzaxo implements zzbgd {
    public zzbgc() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzbgd zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof zzbgd ? (zzbgd) queryLocalInterface : new zzbgb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                String readString = parcel.readString();
                zzaxp.zzc(parcel);
                String zzj = zzj(readString);
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzaxp.zzc(parcel);
                zzbfj zzg = zzg(readString2);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzg);
                return true;
            case 3:
                List<String> zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeStringList(zzk);
                return true;
            case 4:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 5:
                String readString3 = parcel.readString();
                zzaxp.zzc(parcel);
                zzn(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                I0 zze = zze();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zze);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC1506a zzh = zzh();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzh);
                return true;
            case 10:
                InterfaceC1506a Z6 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                boolean zzs = zzs(Z6);
                parcel2.writeNoException();
                parcel2.writeInt(zzs ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, null);
                return true;
            case 12:
                boolean zzq = zzq();
                parcel2.writeNoException();
                int i9 = zzaxp.zza;
                parcel2.writeInt(zzq ? 1 : 0);
                return true;
            case 13:
                boolean zzt = zzt();
                parcel2.writeNoException();
                int i10 = zzaxp.zza;
                parcel2.writeInt(zzt ? 1 : 0);
                return true;
            case 14:
                InterfaceC1506a Z7 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzp(Z7);
                parcel2.writeNoException();
                return true;
            case 15:
                zzm();
                parcel2.writeNoException();
                return true;
            case 16:
                zzbfg zzf = zzf();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzf);
                return true;
            case 17:
                InterfaceC1506a Z8 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                boolean zzr = zzr(Z8);
                parcel2.writeNoException();
                parcel2.writeInt(zzr ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
