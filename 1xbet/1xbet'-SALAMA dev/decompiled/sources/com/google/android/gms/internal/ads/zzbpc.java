package com.google.android.gms.internal.ads;

import F2.I0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbpc extends zzaxo implements zzbpd {
    public zzbpc() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static zzbpd zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return iInterfaceQueryLocalInterface instanceof zzbpd ? (zzbpd) iInterfaceQueryLocalInterface : new zzbpb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 2:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 3:
                List listZzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(listZzv);
                return true;
            case 4:
                String strZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 5:
                zzbfj zzbfjVarZzl = zzl();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzbfjVarZzl);
                return true;
            case 6:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 7:
                String strZzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(strZzp);
                return true;
            case 8:
                double dZze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(dZze);
                return true;
            case 9:
                String strZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeString(strZzu);
                return true;
            case 10:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 11:
                I0 i0Zzj = zzj();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, i0Zzj);
                return true;
            case 12:
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, null);
                return true;
            case 13:
                p105o3.a aVarZzm = zzm();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, aVarZzm);
                return true;
            case 14:
                p105o3.a aVarZzn = zzn();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, aVarZzn);
                return true;
            case 15:
                p105o3.a aVarZzo = zzo();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, aVarZzo);
                return true;
            case 16:
                Bundle bundleZzi = zzi();
                parcel2.writeNoException();
                zzaxp.zze(parcel2, bundleZzi);
                return true;
            case 17:
                boolean zZzB = zzB();
                parcel2.writeNoException();
                int i9 = zzaxp.zza;
                parcel2.writeInt(zZzB ? 1 : 0);
                return true;
            case 18:
                boolean zZzA = zzA();
                parcel2.writeNoException();
                int i10 = zzaxp.zza;
                parcel2.writeInt(zZzA ? 1 : 0);
                return true;
            case 19:
                zzx();
                parcel2.writeNoException();
                return true;
            case 20:
                p105o3.a aVarZ = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzw(aVarZ);
                parcel2.writeNoException();
                return true;
            case zzbbd.zzt.zzm /* 21 */:
                p105o3.a aVarZ2 = p105o3.b.Z(parcel.readStrongBinder());
                p105o3.a aVarZ3 = p105o3.b.Z(parcel.readStrongBinder());
                p105o3.a aVarZ4 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzy(aVarZ2, aVarZ3, aVarZ4);
                parcel2.writeNoException();
                return true;
            case 22:
                p105o3.a aVarZ5 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzz(aVarZ5);
                parcel2.writeNoException();
                return true;
            case 23:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 24:
                float fZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzh);
                return true;
            case 25:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            default:
                return false;
        }
    }
}
