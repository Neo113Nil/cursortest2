package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbhb;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbka;
import com.google.android.gms.internal.ads.zzbkb;
import com.google.android.gms.internal.ads.zzcab;
import com.google.android.gms.internal.ads.zzcac;
import com.google.android.gms.internal.ads.zzcae;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzccm;
import com.google.android.gms.internal.ads.zzccn;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzbt extends zzbev implements zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbu zzY(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbh zzbhVar = null;
        zzcs zzcsVar = null;
        zzbk zzbkVar = null;
        zzdq zzdqVar = null;
        zzby zzbyVar = null;
        zzcp zzcpVar = null;
        zzbe zzbeVar = null;
        zzcl zzclVar = null;
        switch (i) {
            case 1:
                IObjectWrapper zza = zza();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zza);
                return true;
            case 2:
                zzb();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzc = zzc();
                parcel2.writeNoException();
                int i3 = zzbew.zza;
                parcel2.writeInt(zzc ? 1 : 0);
                return true;
            case 4:
                zzm zzmVar = (zzm) zzbew.zzb(parcel, zzm.CREATOR);
                zzbew.zzh(parcel);
                boolean zzd = zzd(zzmVar);
                parcel2.writeNoException();
                parcel2.writeInt(zzd ? 1 : 0);
                return true;
            case 5:
                zze();
                parcel2.writeNoException();
                return true;
            case 6:
                zzf();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbhVar = queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbf(readStrongBinder);
                }
                zzbew.zzh(parcel);
                zzg(zzbhVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzclVar = queryLocalInterface2 instanceof zzcl ? (zzcl) queryLocalInterface2 : new zzcj(readStrongBinder2);
                }
                zzbew.zzh(parcel);
                zzdU(zzclVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzk();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzl();
                parcel2.writeNoException();
                return true;
            case 12:
                zzr zzm = zzm();
                parcel2.writeNoException();
                zzbew.zzd(parcel2, zzm);
                return true;
            case 13:
                zzr zzrVar = (zzr) zzbew.zzb(parcel, zzr.CREATOR);
                zzbew.zzh(parcel);
                zzn(zzrVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzcac zza2 = zzcab.zza(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzo(zza2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzcaf zza3 = zzcae.zza(parcel.readStrongBinder());
                String readString = parcel.readString();
                zzbew.zzh(parcel);
                zzp(zza3, readString);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String zzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 19:
                zzbkb zza4 = zzbka.zza(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzw(zza4);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbeVar = queryLocalInterface3 instanceof zzbe ? (zzbe) queryLocalInterface3 : new zzbc(readStrongBinder3);
                }
                zzbew.zzh(parcel);
                zzx(zzbeVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcpVar = queryLocalInterface4 instanceof zzcp ? (zzcp) queryLocalInterface4 : new zzcp(readStrongBinder4);
                }
                zzbew.zzh(parcel);
                zzX(zzcpVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zza5 = zzbew.zza(parcel);
                zzbew.zzh(parcel);
                zzy(zza5);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zzA = zzA();
                parcel2.writeNoException();
                int i4 = zzbew.zza;
                parcel2.writeInt(zzA ? 1 : 0);
                return true;
            case 24:
                zzccn zza6 = zzccm.zza(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzB(zza6);
                parcel2.writeNoException();
                return true;
            case 25:
                String readString2 = parcel.readString();
                zzbew.zzh(parcel);
                zzC(readString2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzea zzE = zzE();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzE);
                return true;
            case 29:
                zzfw zzfwVar = (zzfw) zzbew.zzb(parcel, zzfw.CREATOR);
                zzbew.zzh(parcel);
                zzF(zzfwVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzee zzeeVar = (zzee) zzbew.zzb(parcel, zzee.CREATOR);
                zzbew.zzh(parcel);
                zzG(zzeeVar);
                parcel2.writeNoException();
                return true;
            case 31:
                String zzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzt);
                return true;
            case 32:
                zzcl zzu = zzu();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzu);
                return true;
            case 33:
                zzbh zzv = zzv();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzv);
                return true;
            case 34:
                boolean zza7 = zzbew.zza(parcel);
                zzbew.zzh(parcel);
                zzJ(zza7);
                parcel2.writeNoException();
                return true;
            case 35:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzbyVar = queryLocalInterface5 instanceof zzby ? (zzby) queryLocalInterface5 : new zzbw(readStrongBinder5);
                }
                zzbew.zzh(parcel);
                zzi(zzbyVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle zzj = zzj();
                parcel2.writeNoException();
                zzbew.zzd(parcel2, zzj);
                return true;
            case 38:
                String readString3 = parcel.readString();
                zzbew.zzh(parcel);
                zzD(readString3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzx zzxVar = (zzx) zzbew.zzb(parcel, zzx.CREATOR);
                zzbew.zzh(parcel);
                zzH(zzxVar);
                parcel2.writeNoException();
                return true;
            case 40:
                zzbhc zzd2 = zzbhb.zzd(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzI(zzd2);
                parcel2.writeNoException();
                return true;
            case 41:
                zzdx zzs = zzs();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzs);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdqVar = queryLocalInterface6 instanceof zzdq ? (zzdq) queryLocalInterface6 : new zzdo(readStrongBinder6);
                }
                zzbew.zzh(parcel);
                zzO(zzdqVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzm zzmVar2 = (zzm) zzbew.zzb(parcel, zzm.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbkVar = queryLocalInterface7 instanceof zzbk ? (zzbk) queryLocalInterface7 : new zzbi(readStrongBinder7);
                }
                zzbew.zzh(parcel);
                zzP(zzmVar2, zzbkVar);
                parcel2.writeNoException();
                return true;
            case 44:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzQ(asInterface);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzcsVar = queryLocalInterface8 instanceof zzcs ? (zzcs) queryLocalInterface8 : new zzcq(readStrongBinder8);
                }
                zzbew.zzh(parcel);
                zzR(zzcsVar);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zzz = zzz();
                parcel2.writeNoException();
                int i5 = zzbew.zza;
                parcel2.writeInt(zzz ? 1 : 0);
                return true;
            case 47:
                long zzT = zzT();
                parcel2.writeNoException();
                parcel2.writeLong(zzT);
                return true;
            case 48:
                long readLong = parcel.readLong();
                zzbew.zzh(parcel);
                zzS(readLong);
                parcel2.writeNoException();
                return true;
        }
    }
}
