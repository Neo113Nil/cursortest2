package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class zzbsg extends zzaxo implements zzbsh {
    public zzbsg() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbsh zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof zzbsh ? (zzbsh) queryLocalInterface : new zzbsf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                Intent intent = (Intent) zzaxp.zza(parcel, Intent.CREATOR);
                zzaxp.zzc(parcel);
                zze(intent);
                break;
            case 2:
                InterfaceC1506a Z6 = BinderC1507b.Z(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzaxp.zzc(parcel);
                zzi(Z6, readString, readString2);
                break;
            case 3:
                zzh();
                break;
            case 4:
                InterfaceC1506a Z7 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzg(Z7);
                break;
            case 5:
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                InterfaceC1506a Z8 = BinderC1507b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzf(createStringArray, createIntArray, Z8);
                break;
            case 6:
                InterfaceC1506a Z9 = BinderC1507b.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.offline.buffering.zza zzaVar = (com.google.android.gms.ads.internal.offline.buffering.zza) zzaxp.zza(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR);
                zzaxp.zzc(parcel);
                zzj(Z9, zzaVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
