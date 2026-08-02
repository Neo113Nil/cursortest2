package com.google.android.gms.internal.ads;

import F2.L;
import F2.M;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class zzbgt extends zzaxo implements zzbgu {
    public zzbgt() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static zzbgu zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return queryLocalInterface instanceof zzbgu ? (zzbgu) queryLocalInterface : new zzbgs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        M zzad = L.zzad(parcel.readStrongBinder());
        InterfaceC1506a Z6 = BinderC1507b.Z(parcel.readStrongBinder());
        zzaxp.zzc(parcel);
        zze(zzad, Z6);
        parcel2.writeNoException();
        return true;
    }
}
