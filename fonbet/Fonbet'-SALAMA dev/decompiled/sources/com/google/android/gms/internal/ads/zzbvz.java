package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbvz extends zzaxo implements zzbwa {
    public zzbvz() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            zzg();
        } else if (i7 == 2) {
            int readInt = parcel.readInt();
            zzaxp.zzc(parcel);
            zze(readInt);
        } else {
            if (i7 != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzaxp.zzc(parcel);
            zzf(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
