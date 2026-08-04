package com.google.android.gms.internal.ads;

import F2.I0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbll extends zzaxo implements zzblm {
    public zzbll() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzblp zzblnVar;
        if (i7 == 3) {
            I0 i0Zzb = zzb();
            parcel2.writeNoException();
            zzaxp.zzf(parcel2, i0Zzb);
            return true;
        }
        if (i7 == 4) {
            zzd();
            parcel2.writeNoException();
            return true;
        }
        if (i7 == 5) {
            p105o3.a aVarZ = p105o3.b.Z(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzblnVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzblnVar = iInterfaceQueryLocalInterface instanceof zzblp ? (zzblp) iInterfaceQueryLocalInterface : new zzbln(strongBinder);
            }
            zzaxp.zzc(parcel);
            zzf(aVarZ, zzblnVar);
            parcel2.writeNoException();
            return true;
        }
        if (i7 == 6) {
            p105o3.a aVarZ2 = p105o3.b.Z(parcel.readStrongBinder());
            zzaxp.zzc(parcel);
            zze(aVarZ2);
            parcel2.writeNoException();
            return true;
        }
        if (i7 != 7) {
            return false;
        }
        zzbfg zzbfgVarZzc = zzc();
        parcel2.writeNoException();
        zzaxp.zzf(parcel2, zzbfgVarZzc);
        return true;
    }
}
