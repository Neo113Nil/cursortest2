package com.google.android.gms.internal.ads;

import android.os.Parcel;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public abstract class zzbcp extends zzaxo implements zzbcq {
    public zzbcp() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            String zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(zzb);
        } else if (i7 == 2) {
            String zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(zzc);
        } else if (i7 == 3) {
            InterfaceC1506a Z6 = BinderC1507b.Z(parcel.readStrongBinder());
            zzaxp.zzc(parcel);
            zzd(Z6);
            parcel2.writeNoException();
        } else if (i7 == 4) {
            zze();
            parcel2.writeNoException();
        } else {
            if (i7 != 5) {
                return false;
            }
            zzf();
            parcel2.writeNoException();
        }
        return true;
    }
}
