package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;
import java.util.Map;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class zzcfw extends zzaxo implements zzcfx {
    public zzcfw() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                Bundle bundle = (Bundle) zzaxp.zza(parcel, Bundle.CREATOR);
                zzaxp.zzc(parcel);
                zzp(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle2 = (Bundle) zzaxp.zza(parcel, Bundle.CREATOR);
                zzaxp.zzc(parcel);
                Bundle zzd = zzd(bundle2);
                parcel2.writeNoException();
                zzaxp.zze(parcel2, zzd);
                return true;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle3 = (Bundle) zzaxp.zza(parcel, Bundle.CREATOR);
                zzaxp.zzc(parcel);
                zzo(readString, readString2, bundle3);
                parcel2.writeNoException();
                return true;
            case 4:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                InterfaceC1506a Z6 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzt(readString3, readString4, Z6);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                boolean zzg = zzaxp.zzg(parcel);
                zzaxp.zzc(parcel);
                Map zzk = zzk(readString5, readString6, zzg);
                parcel2.writeNoException();
                parcel2.writeMap(zzk);
                return true;
            case 6:
                String readString7 = parcel.readString();
                zzaxp.zzc(parcel);
                int zzb = zzb(readString7);
                parcel2.writeNoException();
                parcel2.writeInt(zzb);
                return true;
            case 7:
                Bundle bundle4 = (Bundle) zzaxp.zza(parcel, Bundle.CREATOR);
                zzaxp.zzc(parcel);
                zzq(bundle4);
                parcel2.writeNoException();
                return true;
            case 8:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                Bundle bundle5 = (Bundle) zzaxp.zza(parcel, Bundle.CREATOR);
                zzaxp.zzc(parcel);
                zzm(readString8, readString9, bundle5);
                parcel2.writeNoException();
                return true;
            case 9:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                zzaxp.zzc(parcel);
                List zzj = zzj(readString10, readString11);
                parcel2.writeNoException();
                parcel2.writeList(zzj);
                return true;
            case 10:
                String zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 11:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 12:
                long zzc = zzc();
                parcel2.writeNoException();
                parcel2.writeLong(zzc);
                return true;
            case 13:
                String readString12 = parcel.readString();
                zzaxp.zzc(parcel);
                zzl(readString12);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString13 = parcel.readString();
                zzaxp.zzc(parcel);
                zzn(readString13);
                parcel2.writeNoException();
                return true;
            case 15:
                InterfaceC1506a Z7 = BinderC1507b.Z(parcel.readStrongBinder());
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                zzaxp.zzc(parcel);
                zzs(Z7, readString14, readString15);
                parcel2.writeNoException();
                return true;
            case 16:
                String zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 17:
                String zzg2 = zzg();
                parcel2.writeNoException();
                parcel2.writeString(zzg2);
                return true;
            case 18:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 19:
                Bundle bundle6 = (Bundle) zzaxp.zza(parcel, Bundle.CREATOR);
                zzaxp.zzc(parcel);
                zzr(bundle6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
