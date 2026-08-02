package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class zzbfs extends zzaxo implements zzbft {
    public zzbfs() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static zzbft zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return queryLocalInterface instanceof zzbft ? (zzbft) queryLocalInterface : new zzbfr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            InterfaceC1506a Z6 = BinderC1507b.Z(parcel.readStrongBinder());
            zzaxp.zzc(parcel);
            zzc(Z6);
        } else if (i7 == 2) {
            zzd();
        } else {
            if (i7 != 3) {
                return false;
            }
            InterfaceC1506a Z7 = BinderC1507b.Z(parcel.readStrongBinder());
            zzaxp.zzc(parcel);
            zzb(Z7);
        }
        parcel2.writeNoException();
        return true;
    }
}
