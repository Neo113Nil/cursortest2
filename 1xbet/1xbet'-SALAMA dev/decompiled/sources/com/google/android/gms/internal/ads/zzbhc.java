package com.google.android.gms.internal.ads;

import F2.C0242m0;
import F2.F0;
import F2.I0;
import F2.InterfaceC0244n0;
import F2.InterfaceC0250q0;
import F2.InterfaceC0265y0;
import F2.V0;
import F2.g1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbhc extends zzaxo implements zzbhd {
    public zzbhc() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbha zzbgyVar = null;
        InterfaceC0244n0 c0242m0 = null;
        switch (i7) {
            case 2:
                String strZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 3:
                List listZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeList(listZzu);
                return true;
            case 4:
                String strZzo = zzo();
                parcel2.writeNoException();
                parcel2.writeString(strZzo);
                return true;
            case 5:
                zzbfj zzbfjVarZzk = zzk();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzbfjVarZzk);
                return true;
            case 6:
                String strZzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(strZzp);
                return true;
            case 7:
                String strZzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzn);
                return true;
            case 8:
                double dZze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(dZze);
                return true;
            case 9:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 10:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 11:
                I0 i0Zzh = zzh();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, i0Zzh);
                return true;
            case 12:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 13:
                zzx();
                parcel2.writeNoException();
                return true;
            case 14:
                zzbfc zzbfcVarZzi = zzi();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzbfcVarZzi);
                return true;
            case 15:
                Bundle bundle = (Bundle) zzaxp.zza(parcel, Bundle.CREATOR);
                zzaxp.zzc(parcel);
                zzz(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) zzaxp.zza(parcel, Bundle.CREATOR);
                zzaxp.zzc(parcel);
                boolean zZzJ = zzJ(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzJ ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) zzaxp.zza(parcel, Bundle.CREATOR);
                zzaxp.zzc(parcel);
                zzC(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                p105o3.a aVarZzm = zzm();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, aVarZzm);
                return true;
            case 19:
                p105o3.a aVarZzl = zzl();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, aVarZzl);
                return true;
            case 20:
                Bundle bundleZzf = zzf();
                parcel2.writeNoException();
                zzaxp.zze(parcel2, bundleZzf);
                return true;
            case zzbbd.zzt.zzm /* 21 */:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    zzbgyVar = iInterfaceQueryLocalInterface instanceof zzbha ? (zzbha) iInterfaceQueryLocalInterface : new zzbgy(strongBinder);
                }
                zzaxp.zzc(parcel);
                zzG(zzbgyVar);
                parcel2.writeNoException();
                return true;
            case 22:
                zzw();
                parcel2.writeNoException();
                return true;
            case 23:
                List listZzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(listZzv);
                return true;
            case 24:
                boolean zZzI = zzI();
                parcel2.writeNoException();
                int i9 = zzaxp.zza;
                parcel2.writeInt(zZzI ? 1 : 0);
                return true;
            case 25:
                InterfaceC0250q0 interfaceC0250q0Z = V0.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzy(interfaceC0250q0Z);
                parcel2.writeNoException();
                return true;
            case 26:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                    c0242m0 = iInterfaceQueryLocalInterface2 instanceof InterfaceC0244n0 ? (InterfaceC0244n0) iInterfaceQueryLocalInterface2 : new C0242m0(strongBinder2, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                }
                zzaxp.zzc(parcel);
                zzE(c0242m0);
                parcel2.writeNoException();
                return true;
            case 27:
                zzD();
                parcel2.writeNoException();
                return true;
            case 28:
                zzA();
                parcel2.writeNoException();
                return true;
            case 29:
                zzbfg zzbfgVarZzj = zzj();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzbfgVarZzj);
                return true;
            case 30:
                boolean zZzH = zzH();
                parcel2.writeNoException();
                int i10 = zzaxp.zza;
                parcel2.writeInt(zZzH ? 1 : 0);
                return true;
            case 31:
                F0 f0Zzg = zzg();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, f0Zzg);
                return true;
            case 32:
                InterfaceC0265y0 interfaceC0265y0Z = g1.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzF(interfaceC0265y0Z);
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) zzaxp.zza(parcel, Bundle.CREATOR);
                zzaxp.zzc(parcel);
                zzB(bundle4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
