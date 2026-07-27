package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzbnp;
import com.google.android.gms.internal.ads.zzbnq;
import com.google.android.gms.internal.ads.zzbns;
import com.google.android.gms.internal.ads.zzbnt;
import com.google.android.gms.internal.ads.zzbnv;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzboc;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbog;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbtb;
import com.google.android.gms.internal.ads.zzbtc;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzbp extends zzbev implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbh zzbhVar = null;
        zzcp zzcpVar = null;
        switch (i) {
            case 1:
                zzbn zze = zze();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbhVar = queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbf(readStrongBinder);
                }
                zzbew.zzh(parcel);
                zzf(zzbhVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbnq zza = zzbnp.zza(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzg(zza);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbnt zza2 = zzbns.zza(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzh(zza2);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                zzbnz zza3 = zzbny.zza(parcel.readStrongBinder());
                zzbnw zza4 = zzbnv.zza(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzi(readString, zza3, zza4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbmk zzbmkVar = (zzbmk) zzbew.zzb(parcel, zzbmk.CREATOR);
                zzbew.zzh(parcel);
                zzj(zzbmkVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcpVar = queryLocalInterface2 instanceof zzcp ? (zzcp) queryLocalInterface2 : new zzcp(readStrongBinder2);
                }
                zzbew.zzh(parcel);
                zzq(zzcpVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbod zza5 = zzboc.zza(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzbew.zzb(parcel, zzr.CREATOR);
                zzbew.zzh(parcel);
                zzk(zza5, zzrVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzbew.zzb(parcel, PublisherAdViewOptions.CREATOR);
                zzbew.zzh(parcel);
                zzl(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbog zza6 = zzbof.zza(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzm(zza6);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbst zzbstVar = (zzbst) zzbew.zzb(parcel, zzbst.CREATOR);
                zzbew.zzh(parcel);
                zzn(zzbstVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbtc zza7 = zzbtb.zza(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzo(zza7);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzbew.zzb(parcel, AdManagerAdViewOptions.CREATOR);
                zzbew.zzh(parcel);
                zzp(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
