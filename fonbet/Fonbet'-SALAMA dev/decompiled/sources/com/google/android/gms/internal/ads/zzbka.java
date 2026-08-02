package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbka extends zzaxo implements zzbkb {
    public zzbka() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    public static zzbkb zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
        return queryLocalInterface instanceof zzbkb ? (zzbkb) queryLocalInterface : new zzbjz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            String readString = parcel.readString();
            zzaxp.zzc(parcel);
            zzf(readString);
        } else {
            if (i7 != 2) {
                return false;
            }
            zze();
        }
        parcel2.writeNoException();
        return true;
    }
}
