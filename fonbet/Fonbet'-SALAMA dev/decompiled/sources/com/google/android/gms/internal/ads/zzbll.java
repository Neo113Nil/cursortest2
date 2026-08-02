package com.google.android.gms.internal.ads;

import F2.I0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class zzbll extends zzaxo implements zzblm {
    public zzbll() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzblp zzblnVar;
        if (i7 == 3) {
            I0 zzb = zzb();
            parcel2.writeNoException();
            zzaxp.zzf(parcel2, zzb);
            return true;
        }
        if (i7 == 4) {
            zzd();
            parcel2.writeNoException();
            return true;
        }
        if (i7 == 5) {
            InterfaceC1506a Z6 = BinderC1507b.Z(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzblnVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzblnVar = queryLocalInterface instanceof zzblp ? (zzblp) queryLocalInterface : new zzbln(readStrongBinder);
            }
            zzaxp.zzc(parcel);
            zzf(Z6, zzblnVar);
            parcel2.writeNoException();
            return true;
        }
        if (i7 == 6) {
            InterfaceC1506a Z7 = BinderC1507b.Z(parcel.readStrongBinder());
            zzaxp.zzc(parcel);
            zze(Z7);
            parcel2.writeNoException();
            return true;
        }
        if (i7 != 7) {
            return false;
        }
        zzbfg zzc = zzc();
        parcel2.writeNoException();
        zzaxp.zzf(parcel2, zzc);
        return true;
    }
}
