package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbne;
import com.google.android.gms.internal.ads.zzbrh;
import com.google.android.gms.internal.ads.zzbri;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbvt;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcck;
import com.google.android.gms.internal.ads.zzcda;
import com.google.android.gms.internal.ads.zzcfe;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzcn extends zzbev implements zzco {
    public zzcn() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzbew.zzb(parcel, zzr.CREATOR);
                String readString = parcel.readString();
                zzbvu zze = zzbvt.zze(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzbew.zzh(parcel);
                zzbu zza = zza(asInterface, zzrVar, readString, zze, readInt);
                parcel2.writeNoException();
                zzbew.zze(parcel2, zza);
                return true;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar2 = (zzr) zzbew.zzb(parcel, zzr.CREATOR);
                String readString2 = parcel.readString();
                zzbvu zze2 = zzbvt.zze(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzbew.zzh(parcel);
                zzbu zzb = zzb(asInterface2, zzrVar2, readString2, zze2, readInt2);
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzb);
                return true;
            case 3:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbvu zze3 = zzbvt.zze(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzbew.zzh(parcel);
                zzbq zzc = zzc(asInterface3, readString3, zze3, readInt3);
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzc);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                parcel2.writeNoException();
                zzbew.zze(parcel2, null);
                return true;
            case 5:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzbmz zzd = zzd(asInterface4, asInterface5);
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzd);
                return true;
            case 6:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvu zze4 = zzbvt.zze(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzbew.zzh(parcel);
                zzcck zze5 = zze(asInterface6, zze4, readInt4);
                parcel2.writeNoException();
                zzbew.zze(parcel2, zze5);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                parcel2.writeNoException();
                zzbew.zze(parcel2, null);
                return true;
            case 8:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzbzt zzf = zzf(asInterface7);
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzf);
                return true;
            case 9:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzbew.zzh(parcel);
                zzcy zzh = zzh(asInterface8, readInt5);
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzh);
                return true;
            case 10:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar3 = (zzr) zzbew.zzb(parcel, zzr.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzbew.zzh(parcel);
                zzbu zzi = zzi(asInterface9, zzrVar3, readString4, readInt6);
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzi);
                return true;
            case 11:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzbne zzj = zzj(asInterface10, asInterface11, asInterface12);
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzj);
                return true;
            case 12:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbvu zze6 = zzbvt.zze(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzbew.zzh(parcel);
                zzcda zzk = zzk(asInterface13, readString5, zze6, readInt7);
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzk);
                return true;
            case 13:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar4 = (zzr) zzbew.zzb(parcel, zzr.CREATOR);
                String readString6 = parcel.readString();
                zzbvu zze7 = zzbvt.zze(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzbew.zzh(parcel);
                zzbu zzl = zzl(asInterface14, zzrVar4, readString6, zze7, readInt8);
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzl);
                return true;
            case 14:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvu zze8 = zzbvt.zze(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzbew.zzh(parcel);
                zzcfe zzm = zzm(asInterface15, zze8, readInt9);
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzm);
                return true;
            case 15:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvu zze9 = zzbvt.zze(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzbew.zzh(parcel);
                zzbzm zzn = zzn(asInterface16, zze9, readInt10);
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzn);
                return true;
            case 16:
                IObjectWrapper asInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvu zze10 = zzbvt.zze(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbri zzb2 = zzbrh.zzb(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzbrl zzo = zzo(asInterface17, zze10, readInt11, zzb2);
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzo);
                return true;
            case 17:
                IObjectWrapper asInterface18 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvu zze11 = zzbvt.zze(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzbew.zzh(parcel);
                zzdt zzp = zzp(asInterface18, zze11, readInt12);
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzp);
                return true;
            case 18:
                IObjectWrapper asInterface19 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvu zze12 = zzbvt.zze(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                zzbew.zzh(parcel);
                zzch zzg = zzg(asInterface19, zze12, readInt13);
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzg);
                return true;
            default:
                return false;
        }
    }
}
