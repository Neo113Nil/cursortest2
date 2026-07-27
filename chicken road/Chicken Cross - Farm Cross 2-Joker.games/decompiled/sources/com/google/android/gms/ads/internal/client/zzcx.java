package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbsn;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzbvt;
import com.google.android.gms.internal.ads.zzbvu;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzcx extends zzbev implements zzcy {
    public zzcx() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzdk zzdiVar;
        switch (i) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                float readFloat = parcel.readFloat();
                zzbew.zzh(parcel);
                zzf(readFloat);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                zzbew.zzh(parcel);
                zzg(readString);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zza = zzbew.zza(parcel);
                zzbew.zzh(parcel);
                zzh(zza);
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                zzbew.zzh(parcel);
                zzi(asInterface, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString3 = parcel.readString();
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzj(readString3, asInterface2);
                parcel2.writeNoException();
                return true;
            case 7:
                float zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(zzk);
                return true;
            case 8:
                boolean zzl = zzl();
                parcel2.writeNoException();
                int i3 = zzbew.zza;
                parcel2.writeInt(zzl ? 1 : 0);
                return true;
            case 9:
                String zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(zzm);
                return true;
            case 10:
                String readString4 = parcel.readString();
                zzbew.zzh(parcel);
                zzn(readString4);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbvu zze = zzbvt.zze(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzo(zze);
                parcel2.writeNoException();
                return true;
            case 12:
                zzbso zzb = zzbsn.zzb(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzp(zzb);
                parcel2.writeNoException();
                return true;
            case 13:
                List zzq = zzq();
                parcel2.writeNoException();
                parcel2.writeTypedList(zzq);
                return true;
            case 14:
                zzfr zzfrVar = (zzfr) zzbew.zzb(parcel, zzfr.CREATOR);
                zzbew.zzh(parcel);
                zzr(zzfrVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzs();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzdiVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzdiVar = queryLocalInterface instanceof zzdk ? (zzdk) queryLocalInterface : new zzdi(readStrongBinder);
                }
                zzbew.zzh(parcel);
                zzt(zzdiVar);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zza2 = zzbew.zza(parcel);
                zzbew.zzh(parcel);
                zzu(zza2);
                parcel2.writeNoException();
                return true;
            case 18:
                String readString5 = parcel.readString();
                zzbew.zzh(parcel);
                zzv(readString5);
                parcel2.writeNoException();
                return true;
            case 19:
                zzw();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
