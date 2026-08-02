package com.google.android.gms.internal.ads;

import F2.C0259v0;
import F2.F0;
import F2.InterfaceC0261w0;
import F2.InterfaceC0265y0;
import F2.g1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class zzbvs extends zzaxo implements zzbvt {
    public zzbvs() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbvt zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof zzbvt ? (zzbvt) queryLocalInterface : new zzbvr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbwa zzbwaVar = null;
        zzbwa zzbwaVar2 = null;
        InterfaceC0261w0 interfaceC0261w0 = null;
        zzbwb zzbwbVar = null;
        zzbvw zzbvwVar = null;
        switch (i7) {
            case 1:
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbwaVar = queryLocalInterface instanceof zzbwa ? (zzbwa) queryLocalInterface : new zzbvy(readStrongBinder);
                }
                zzaxp.zzc(parcel);
                zzf(zzmVar, zzbwaVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzbvwVar = queryLocalInterface2 instanceof zzbvw ? (zzbvw) queryLocalInterface2 : new zzbvu(readStrongBinder2);
                }
                zzaxp.zzc(parcel);
                zzk(zzbvwVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzo = zzo();
                parcel2.writeNoException();
                int i9 = zzaxp.zza;
                parcel2.writeInt(zzo ? 1 : 0);
                return true;
            case 4:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 5:
                InterfaceC1506a Z6 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzm(Z6);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzbwbVar = queryLocalInterface3 instanceof zzbwb ? (zzbwb) queryLocalInterface3 : new zzbwb(readStrongBinder3);
                }
                zzaxp.zzc(parcel);
                zzp(zzbwbVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbwh zzbwhVar = (zzbwh) zzaxp.zza(parcel, zzbwh.CREATOR);
                zzaxp.zzc(parcel);
                zzl(zzbwhVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                    interfaceC0261w0 = queryLocalInterface4 instanceof InterfaceC0261w0 ? (InterfaceC0261w0) queryLocalInterface4 : new C0259v0(readStrongBinder4, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                }
                zzaxp.zzc(parcel);
                zzi(interfaceC0261w0);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzb = zzb();
                parcel2.writeNoException();
                zzaxp.zze(parcel2, zzb);
                return true;
            case 10:
                InterfaceC1506a Z7 = BinderC1507b.Z(parcel.readStrongBinder());
                boolean zzg = zzaxp.zzg(parcel);
                zzaxp.zzc(parcel);
                zzn(Z7, zzg);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbvq zzd = zzd();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzd);
                return true;
            case 12:
                F0 zzc = zzc();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzc);
                return true;
            case 13:
                InterfaceC0265y0 Z8 = g1.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzj(Z8);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbwaVar2 = queryLocalInterface5 instanceof zzbwa ? (zzbwa) queryLocalInterface5 : new zzbvy(readStrongBinder5);
                }
                zzaxp.zzc(parcel);
                zzg(zzmVar2, zzbwaVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zzg2 = zzaxp.zzg(parcel);
                zzaxp.zzc(parcel);
                zzh(zzg2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
