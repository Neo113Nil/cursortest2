package com.google.android.gms.internal.ads;

import F2.I0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbgc extends zzaxo implements zzbgd {
    public zzbgc() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzbgd zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof zzbgd ? (zzbgd) iInterfaceQueryLocalInterface : new zzbgb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                String string = parcel.readString();
                zzaxp.zzc(parcel);
                String strZzj = zzj(string);
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 2:
                String string2 = parcel.readString();
                zzaxp.zzc(parcel);
                zzbfj zzbfjVarZzg = zzg(string2);
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzbfjVarZzg);
                return true;
            case 3:
                List<String> listZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeStringList(listZzk);
                return true;
            case 4:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 5:
                String string3 = parcel.readString();
                zzaxp.zzc(parcel);
                zzn(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                I0 i0Zze = zze();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, i0Zze);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                p105o3.a aVarZzh = zzh();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, aVarZzh);
                return true;
            case 10:
                p105o3.a aVarZ = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                boolean zZzs = zzs(aVarZ);
                parcel2.writeNoException();
                parcel2.writeInt(zZzs ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, null);
                return true;
            case 12:
                boolean zZzq = zzq();
                parcel2.writeNoException();
                int i9 = zzaxp.zza;
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 13:
                boolean zZzt = zzt();
                parcel2.writeNoException();
                int i10 = zzaxp.zza;
                parcel2.writeInt(zZzt ? 1 : 0);
                return true;
            case 14:
                p105o3.a aVarZ2 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzp(aVarZ2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzm();
                parcel2.writeNoException();
                return true;
            case 16:
                zzbfg zzbfgVarZzf = zzf();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzbfgVarZzf);
                return true;
            case 17:
                p105o3.a aVarZ3 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                boolean zZzr = zzr(aVarZ3);
                parcel2.writeNoException();
                parcel2.writeInt(zZzr ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
