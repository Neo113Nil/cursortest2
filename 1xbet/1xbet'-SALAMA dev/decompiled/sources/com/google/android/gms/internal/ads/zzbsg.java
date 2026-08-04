package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbsg extends zzaxo implements zzbsh {
    public zzbsg() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbsh zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterfaceQueryLocalInterface instanceof zzbsh ? (zzbsh) iInterfaceQueryLocalInterface : new zzbsf(iBinder);
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
                p105o3.a aVarZ = p105o3.b.Z(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzaxp.zzc(parcel);
                zzi(aVarZ, string, string2);
                break;
            case 3:
                zzh();
                break;
            case 4:
                p105o3.a aVarZ2 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzg(aVarZ2);
                break;
            case 5:
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                p105o3.a aVarZ3 = p105o3.b.Z(parcel.readStrongBinder());
                zzaxp.zzc(parcel);
                zzf(strArrCreateStringArray, iArrCreateIntArray, aVarZ3);
                break;
            case 6:
                p105o3.a aVarZ4 = p105o3.b.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.offline.buffering.zza zzaVar = (com.google.android.gms.ads.internal.offline.buffering.zza) zzaxp.zza(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR);
                zzaxp.zzc(parcel);
                zzj(aVarZ4, zzaVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
