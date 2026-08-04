package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbon extends zzaxo implements zzboo {
    public zzbon() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzboo zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof zzboo ? (zzboo) iInterfaceQueryLocalInterface : new zzbom(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            String string = parcel.readString();
            zzaxp.zzc(parcel);
            zzbor zzborVarZzb = zzb(string);
            parcel2.writeNoException();
            zzaxp.zzf(parcel2, zzborVarZzb);
        } else if (i7 == 2) {
            String string2 = parcel.readString();
            zzaxp.zzc(parcel);
            boolean zZze = zze(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZze ? 1 : 0);
        } else if (i7 == 3) {
            String string3 = parcel.readString();
            zzaxp.zzc(parcel);
            zzbqn zzbqnVarZzc = zzc(string3);
            parcel2.writeNoException();
            zzaxp.zzf(parcel2, zzbqnVarZzc);
        } else {
            if (i7 != 4) {
                return false;
            }
            String string4 = parcel.readString();
            zzaxp.zzc(parcel);
            boolean zZzd = zzd(string4);
            parcel2.writeNoException();
            parcel2.writeInt(zZzd ? 1 : 0);
        }
        return true;
    }
}
