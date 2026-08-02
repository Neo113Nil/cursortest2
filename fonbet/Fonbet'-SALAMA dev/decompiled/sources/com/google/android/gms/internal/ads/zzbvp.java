package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbvp extends zzaxo implements zzbvq {
    public zzbvp() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public static zzbvq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        return queryLocalInterface instanceof zzbvq ? (zzbvq) queryLocalInterface : new zzbvo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            String zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(zzf);
        } else {
            if (i7 != 2) {
                return false;
            }
            int zze = zze();
            parcel2.writeNoException();
            parcel2.writeInt(zze);
        }
        return true;
    }
}
