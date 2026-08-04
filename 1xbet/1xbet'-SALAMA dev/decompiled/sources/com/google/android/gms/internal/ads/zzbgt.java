package com.google.android.gms.internal.ads;

import F2.L;
import F2.M;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbgt extends zzaxo implements zzbgu {
    public zzbgt() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static zzbgu zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return iInterfaceQueryLocalInterface instanceof zzbgu ? (zzbgu) iInterfaceQueryLocalInterface : new zzbgs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        M mZzad = L.zzad(parcel.readStrongBinder());
        p105o3.a aVarZ = p105o3.b.Z(parcel.readStrongBinder());
        zzaxp.zzc(parcel);
        zze(mZzad, aVarZ);
        parcel2.writeNoException();
        return true;
    }
}
