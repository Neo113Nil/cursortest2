package com.google.android.gms.internal.ads;

import F2.I0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbff extends zzaxo implements zzbfg {
    public zzbff() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbgr zzbgrVar;
        switch (i7) {
            case 2:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 3:
                p105o3.a aVarZ = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzj(aVarZ);
                parcel2.writeNoException();
                return true;
            case 4:
                p105o3.a aVarZzi = zzi();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, aVarZzi);
                return true;
            case 5:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            case 6:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 7:
                I0 i0Zzh = zzh();
                parcel2.writeNoException();
                zzaxp.zzf(parcel2, i0Zzh);
                return true;
            case 8:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                int i9 = zzaxp.zza;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbgrVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    zzbgrVar = iInterfaceQueryLocalInterface instanceof zzbgr ? (zzbgr) iInterfaceQueryLocalInterface : new zzbgr(strongBinder);
                }
                zzaxp.zzc(parcel);
                zzm(zzbgrVar);
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zZzk = zzk();
                parcel2.writeNoException();
                int i10 = zzaxp.zza;
                parcel2.writeInt(zZzk ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
