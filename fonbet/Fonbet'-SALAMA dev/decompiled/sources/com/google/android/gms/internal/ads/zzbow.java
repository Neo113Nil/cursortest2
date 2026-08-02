package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class zzbow extends zzaxo implements zzbox {
    public zzbow() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static zzbox zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return queryLocalInterface instanceof zzbox ? (zzbox) queryLocalInterface : new zzbov(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            InterfaceC1506a zze = zze();
            parcel2.writeNoException();
            zzaxp.zzf(parcel2, zze);
        } else {
            if (i7 != 2) {
                return false;
            }
            boolean zzf = zzf();
            parcel2.writeNoException();
            int i9 = zzaxp.zza;
            parcel2.writeInt(zzf ? 1 : 0);
        }
        return true;
    }
}
