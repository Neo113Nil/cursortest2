package com.google.android.gms.internal.ads;

import F2.I0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class zzbff extends zzaxo implements zzbfg {
    public zzbff() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbgr zzbgrVar;
        switch (i7) {
            case 2:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 3:
                InterfaceC1506a Z6 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzj(Z6);
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC1506a zzi = zzi();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzi);
                return true;
            case 5:
                float zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zzg);
                return true;
            case 6:
                float zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            case 7:
                I0 zzh = zzh();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, zzh);
                return true;
            case 8:
                boolean zzl = zzl();
                parcel2.writeNoException();
                int i9 = zzaxp.zza;
                parcel2.writeInt(zzl ? 1 : 0);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbgrVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    zzbgrVar = queryLocalInterface instanceof zzbgr ? (zzbgr) queryLocalInterface : new zzbgr(readStrongBinder);
                }
                zzaxp.zzc(parcel);
                zzm(zzbgrVar);
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zzk = zzk();
                parcel2.writeNoException();
                int i10 = zzaxp.zza;
                parcel2.writeInt(zzk ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
