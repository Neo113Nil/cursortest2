package com.google.android.gms.internal.ads;

import F2.I0;
import android.os.Bundle;
import android.os.Parcel;
import java.util.List;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class zzbfx extends zzaxo implements zzbfy {
    public zzbfx() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 2:
                InterfaceC1506a zzh = zzh();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzh);
                return true;
            case 3:
                String zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 4:
                List zzo = zzo();
                parcel2.writeNoException();
                parcel2.writeList(zzo);
                return true;
            case 5:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 6:
                zzbfj zzf = zzf();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzf);
                return true;
            case 7:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 8:
                double zzb = zzb();
                parcel2.writeNoException();
                parcel2.writeDouble(zzb);
                return true;
            case 9:
                String zzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(zzn);
                return true;
            case 10:
                String zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(zzm);
                return true;
            case 11:
                Bundle zzc = zzc();
                parcel2.writeNoException();
                zzaxp.zze(parcel2, zzc);
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                I0 zzd = zzd();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzd);
                return true;
            case 14:
                Bundle bundle = (Bundle) zzaxp.zza(parcel, Bundle.CREATOR);
                zzaxp.zzc(parcel);
                zzq(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) zzaxp.zza(parcel, Bundle.CREATOR);
                zzaxp.zzc(parcel);
                boolean zzs = zzs(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zzs ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) zzaxp.zza(parcel, Bundle.CREATOR);
                zzaxp.zzc(parcel);
                zzr(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                zzbfc zze = zze();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zze);
                return true;
            case 18:
                InterfaceC1506a zzg = zzg();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzg);
                return true;
            case 19:
                String zzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(zzl);
                return true;
            default:
                return false;
        }
    }
}
