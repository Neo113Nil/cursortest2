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
import com.google.android.gms.internal.ads.zzbbd;
import java.util.List;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class zzbhc extends zzaxo implements zzbhd {
    public zzbhc() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbha zzbhaVar = null;
        InterfaceC0244n0 interfaceC0244n0 = null;
        switch (i7) {
            case 2:
                String zzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 3:
                List zzu = zzu();
                parcel2.writeNoException();
                parcel2.writeList(zzu);
                return true;
            case 4:
                String zzo = zzo();
                parcel2.writeNoException();
                parcel2.writeString(zzo);
                return true;
            case 5:
                zzbfj zzk = zzk();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzk);
                return true;
            case 6:
                String zzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(zzp);
                return true;
            case 7:
                String zzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(zzn);
                return true;
            case 8:
                double zze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(zze);
                return true;
            case 9:
                String zzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzt);
                return true;
            case 10:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 11:
                I0 zzh = zzh();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzh);
                return true;
            case 12:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 13:
                zzx();
                parcel2.writeNoException();
                return true;
            case 14:
                zzbfc zzi = zzi();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzi);
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
                boolean zzJ = zzJ(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zzJ ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) zzaxp.zza(parcel, Bundle.CREATOR);
                zzaxp.zzc(parcel);
                zzC(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                InterfaceC1506a zzm = zzm();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzm);
                return true;
            case 19:
                InterfaceC1506a zzl = zzl();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzl);
                return true;
            case 20:
                Bundle zzf = zzf();
                parcel2.writeNoException();
                zzaxp.zze(parcel2, zzf);
                return true;
            case zzbbd.zzt.zzm /* 21 */:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    zzbhaVar = queryLocalInterface instanceof zzbha ? (zzbha) queryLocalInterface : new zzbgy(readStrongBinder);
                }
                zzaxp.zzc(parcel);
                zzG(zzbhaVar);
                parcel2.writeNoException();
                return true;
            case 22:
                zzw();
                parcel2.writeNoException();
                return true;
            case 23:
                List zzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(zzv);
                return true;
            case 24:
                boolean zzI = zzI();
                parcel2.writeNoException();
                int i9 = zzaxp.zza;
                parcel2.writeInt(zzI ? 1 : 0);
                return true;
            case 25:
                InterfaceC0250q0 Z6 = V0.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzy(Z6);
                parcel2.writeNoException();
                return true;
            case 26:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                    interfaceC0244n0 = queryLocalInterface2 instanceof InterfaceC0244n0 ? (InterfaceC0244n0) queryLocalInterface2 : new C0242m0(readStrongBinder2, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                }
                zzaxp.zzc(parcel);
                zzE(interfaceC0244n0);
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
                zzbfg zzj = zzj();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzj);
                return true;
            case 30:
                boolean zzH = zzH();
                parcel2.writeNoException();
                int i10 = zzaxp.zza;
                parcel2.writeInt(zzH ? 1 : 0);
                return true;
            case 31:
                F0 zzg = zzg();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzg);
                return true;
            case 32:
                InterfaceC0265y0 Z7 = g1.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzF(Z7);
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
