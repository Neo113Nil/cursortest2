package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbla extends zzaxo implements zzblb {
    public zzbla() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static zzblb zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof zzblb ? (zzblb) iInterfaceQueryLocalInterface : new zzbkz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 2) {
            zzf();
        } else {
            if (i7 != 3) {
                return false;
            }
            String string = parcel.readString();
            zzaxp.zzc(parcel);
            zze(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
