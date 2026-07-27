package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzbnl extends zzbev implements zzbnm {
    public zzbnl() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzbnm zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof zzbnm ? (zzbnm) queryLocalInterface : new zzbnk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String readString = parcel.readString();
                zzbew.zzh(parcel);
                String zze = zze(readString);
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzbew.zzh(parcel);
                zzbmv zzf = zzf(readString2);
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzf);
                return true;
            case 3:
                List<String> zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeStringList(zzg);
                return true;
            case 4:
                String zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 5:
                String readString3 = parcel.readString();
                zzbew.zzh(parcel);
                zzi(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzj();
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzea zzk = zzk();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzk);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper zzm = zzm();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzm);
                return true;
            case 10:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                boolean zzn = zzn(asInterface);
                parcel2.writeNoException();
                parcel2.writeInt(zzn ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                zzbew.zze(parcel2, null);
                return true;
            case 12:
                boolean zzo = zzo();
                parcel2.writeNoException();
                int i3 = zzbew.zza;
                parcel2.writeInt(zzo ? 1 : 0);
                return true;
            case 13:
                boolean zzp = zzp();
                parcel2.writeNoException();
                int i4 = zzbew.zza;
                parcel2.writeInt(zzp ? 1 : 0);
                return true;
            case 14:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzq(asInterface2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzr();
                parcel2.writeNoException();
                return true;
            case 16:
                zzbms zzs = zzs();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzs);
                return true;
            case 17:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                boolean zzt = zzt(asInterface3);
                parcel2.writeNoException();
                parcel2.writeInt(zzt ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
