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

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbvs extends zzaxo implements zzbvt {
    public zzbvs() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbvt zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof zzbvt ? (zzbvt) iInterfaceQueryLocalInterface : new zzbvr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbwa zzbvyVar = null;
        zzbwa zzbvyVar2 = null;
        InterfaceC0261w0 c0259v0 = null;
        zzbwb zzbwbVar = null;
        zzbvw zzbvuVar = null;
        switch (i7) {
            case 1:
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbvyVar = iInterfaceQueryLocalInterface instanceof zzbwa ? (zzbwa) iInterfaceQueryLocalInterface : new zzbvy(strongBinder);
                }
                zzaxp.zzc(parcel);
                zzf(zzmVar, zzbvyVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzbvuVar = iInterfaceQueryLocalInterface2 instanceof zzbvw ? (zzbvw) iInterfaceQueryLocalInterface2 : new zzbvu(strongBinder2);
                }
                zzaxp.zzc(parcel);
                zzk(zzbvuVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                int i9 = zzaxp.zza;
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 4:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 5:
                p105o3.a aVarZ = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzm(aVarZ);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzbwbVar = iInterfaceQueryLocalInterface3 instanceof zzbwb ? (zzbwb) iInterfaceQueryLocalInterface3 : new zzbwb(strongBinder3);
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
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                    c0259v0 = iInterfaceQueryLocalInterface4 instanceof InterfaceC0261w0 ? (InterfaceC0261w0) iInterfaceQueryLocalInterface4 : new C0259v0(strongBinder4, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                }
                zzaxp.zzc(parcel);
                zzi(c0259v0);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                zzaxp.zze(parcel2, bundleZzb);
                return true;
            case 10:
                p105o3.a aVarZ2 = p105o3.b.Z(parcel.readStrongBinder());
                boolean zZzg = zzaxp.zzg(parcel);
                zzaxp.zzc(parcel);
                zzn(aVarZ2, zZzg);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbvq zzbvqVarZzd = zzd();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzbvqVarZzd);
                return true;
            case 12:
                F0 f0Zzc = zzc();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, f0Zzc);
                return true;
            case 13:
                InterfaceC0265y0 interfaceC0265y0Z = g1.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzj(interfaceC0265y0Z);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbvyVar2 = iInterfaceQueryLocalInterface5 instanceof zzbwa ? (zzbwa) iInterfaceQueryLocalInterface5 : new zzbvy(strongBinder5);
                }
                zzaxp.zzc(parcel);
                zzg(zzmVar2, zzbvyVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zZzg2 = zzaxp.zzg(parcel);
                zzaxp.zzc(parcel);
                zzh(zZzg2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
