package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbfs extends zzaxo implements zzbft {
    public zzbfs() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static zzbft zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return iInterfaceQueryLocalInterface instanceof zzbft ? (zzbft) iInterfaceQueryLocalInterface : new zzbfr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            p105o3.a aVarZ = p105o3.b.Z(parcel.readStrongBinder());
            zzaxp.zzc(parcel);
            zzc(aVarZ);
        } else if (i7 == 2) {
            zzd();
        } else {
            if (i7 != 3) {
                return false;
            }
            p105o3.a aVarZ2 = p105o3.b.Z(parcel.readStrongBinder());
            zzaxp.zzc(parcel);
            zzb(aVarZ2);
        }
        parcel2.writeNoException();
        return true;
    }
}
