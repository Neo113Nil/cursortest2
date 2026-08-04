package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbcp extends zzaxo implements zzbcq {
    public zzbcp() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            String strZzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(strZzb);
        } else if (i7 == 2) {
            String strZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(strZzc);
        } else if (i7 == 3) {
            p105o3.a aVarZ = p105o3.b.Z(parcel.readStrongBinder());
            zzaxp.zzc(parcel);
            zzd(aVarZ);
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
