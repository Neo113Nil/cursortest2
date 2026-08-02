package com.google.android.gms.internal.ads;

import F2.I0;
import android.os.Bundle;
import android.os.Parcel;
import java.util.List;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class zzbfz extends zzaxo implements zzbga {
    public zzbfz() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 2:
                InterfaceC1506a zzg = zzg();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzg);
                return true;
            case 3:
                String zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 4:
                List zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeList(zzm);
                return true;
            case 5:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 6:
                zzbfj zze = zze();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zze);
                return true;
            case 7:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 8:
                String zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 9:
                Bundle zzb = zzb();
                parcel2.writeNoException();
                zzaxp.zze(parcel2, zzb);
                return true;
            case 10:
                zzn();
                parcel2.writeNoException();
                return true;
            case 11:
                I0 zzc = zzc();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzc);
                return true;
            case 12:
                Bundle bundle = (Bundle) zzaxp.zza(parcel, Bundle.CREATOR);
                zzaxp.zzc(parcel);
                zzo(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) zzaxp.zza(parcel, Bundle.CREATOR);
                zzaxp.zzc(parcel);
                boolean zzq = zzq(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zzq ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) zzaxp.zza(parcel, Bundle.CREATOR);
                zzaxp.zzc(parcel);
                zzp(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbfc zzd = zzd();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzd);
                return true;
            case 16:
                InterfaceC1506a zzf = zzf();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzf);
                return true;
            case 17:
                String zzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(zzl);
                return true;
            default:
                return false;
        }
    }
}
