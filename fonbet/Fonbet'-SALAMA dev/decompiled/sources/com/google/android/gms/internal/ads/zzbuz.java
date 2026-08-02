package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbuz extends zzaxo implements zzbva {
    public zzbuz() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            String zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(zzc);
        } else {
            if (i7 != 2) {
                return false;
            }
            int zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeInt(zzb);
        }
        return true;
    }
}
