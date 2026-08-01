package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzbni extends zzbev implements zzbnj {
    public zzbni() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
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
                String zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            case 9:
                Bundle zzh = zzh();
                parcel2.writeNoException();
                zzbew.zzd(parcel2, zzh);
                return true;
            case 10:
                zzi();
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzea zzj = zzj();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzj);
                return true;
            case 12:
                Bundle bundle = (Bundle) zzbew.zzb(parcel, Bundle.CREATOR);
                zzbew.zzh(parcel);
                zzk(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) zzbew.zzb(parcel, Bundle.CREATOR);
                zzbew.zzh(parcel);
                boolean zzl = zzl(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zzl ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) zzbew.zzb(parcel, Bundle.CREATOR);
                zzbew.zzh(parcel);
                zzm(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbmo zzn = zzn();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzn);
                return true;
            case 16:
                IObjectWrapper zzo = zzo();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzo);
                return true;
            case 17:
                String zzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(zzp);
                return true;
            default:
                return false;
        }
    }
}
