package com.google.android.gms.internal.ads;

import F2.I0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.List;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class zzbpc extends zzaxo implements zzbpd {
    public zzbpc() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static zzbpd zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return queryLocalInterface instanceof zzbpd ? (zzbpd) queryLocalInterface : new zzbpb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 2:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 3:
                List zzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(zzv);
                return true;
            case 4:
                String zzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 5:
                zzbfj zzl = zzl();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzl);
                return true;
            case 6:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 7:
                String zzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(zzp);
                return true;
            case 8:
                double zze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(zze);
                return true;
            case 9:
                String zzu = zzu();
                parcel2.writeNoException();
                parcel2.writeString(zzu);
                return true;
            case 10:
                String zzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzt);
                return true;
            case 11:
                I0 zzj = zzj();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzj);
                return true;
            case 12:
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, null);
                return true;
            case 13:
                InterfaceC1506a zzm = zzm();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzm);
                return true;
            case 14:
                InterfaceC1506a zzn = zzn();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzn);
                return true;
            case 15:
                InterfaceC1506a zzo = zzo();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzo);
                return true;
            case 16:
                Bundle zzi = zzi();
                parcel2.writeNoException();
                zzaxp.zze(parcel2, zzi);
                return true;
            case 17:
                boolean zzB = zzB();
                parcel2.writeNoException();
                int i9 = zzaxp.zza;
                parcel2.writeInt(zzB ? 1 : 0);
                return true;
            case 18:
                boolean zzA = zzA();
                parcel2.writeNoException();
                int i10 = zzaxp.zza;
                parcel2.writeInt(zzA ? 1 : 0);
                return true;
            case 19:
                zzx();
                parcel2.writeNoException();
                return true;
            case 20:
                InterfaceC1506a Z6 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzw(Z6);
                parcel2.writeNoException();
                return true;
            case zzbbd.zzt.zzm /* 21 */:
                InterfaceC1506a Z7 = BinderC1507b.Z(parcel.readStrongBinder());
                InterfaceC1506a Z8 = BinderC1507b.Z(parcel.readStrongBinder());
                InterfaceC1506a Z9 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzy(Z7, Z8, Z9);
                parcel2.writeNoException();
                return true;
            case 22:
                InterfaceC1506a Z10 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzz(Z10);
                parcel2.writeNoException();
                return true;
            case 23:
                float zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            case 24:
                float zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(zzh);
                return true;
            case 25:
                float zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zzg);
                return true;
            default:
                return false;
        }
    }
}
