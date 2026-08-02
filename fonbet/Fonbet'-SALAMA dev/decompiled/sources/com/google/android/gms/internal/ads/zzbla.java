package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbla extends zzaxo implements zzblb {
    public zzbla() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static zzblb zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return queryLocalInterface instanceof zzblb ? (zzblb) queryLocalInterface : new zzbkz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 2) {
            zzf();
        } else {
            if (i7 != 3) {
                return false;
            }
            String readString = parcel.readString();
            zzaxp.zzc(parcel);
            zze(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
