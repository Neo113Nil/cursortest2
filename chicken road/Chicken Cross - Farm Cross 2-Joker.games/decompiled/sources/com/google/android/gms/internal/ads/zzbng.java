package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzbng extends zzbev implements zzbnh {
    public zzbng() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                IObjectWrapper zza = zza();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zza);
                return true;
            case 3:
                String zzb = zzb();
                parcel2.writeNoException();
                parcel2.writeString(zzb);
                return true;
            case 4:
                List zzc = zzc();
                parcel2.writeNoException();
                parcel2.writeList(zzc);
                return true;
            case 5:
                String zzd = zzd();
                parcel2.writeNoException();
                parcel2.writeString(zzd);
                return true;
            case 6:
                zzbmv zze = zze();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zze);
                return true;
            case 7:
                String zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 8:
                double zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeDouble(zzg);
                return true;
            case 9:
                String zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 10:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 11:
                Bundle zzj = zzj();
                parcel2.writeNoException();
                zzbew.zzd(parcel2, zzj);
                return true;
            case 12:
                zzk();
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzea zzl = zzl();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzl);
                return true;
            case 14:
                Bundle bundle = (Bundle) zzbew.zzb(parcel, Bundle.CREATOR);
                zzbew.zzh(parcel);
                zzm(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) zzbew.zzb(parcel, Bundle.CREATOR);
                zzbew.zzh(parcel);
                boolean zzn = zzn(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zzn ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) zzbew.zzb(parcel, Bundle.CREATOR);
                zzbew.zzh(parcel);
                zzo(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                zzbmo zzp = zzp();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzp);
                return true;
            case 18:
                IObjectWrapper zzq = zzq();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzq);
                return true;
            case 19:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            default:
                return false;
        }
    }
}
