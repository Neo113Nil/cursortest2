package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbqj extends zzaxo implements zzbqk {
    public zzbqj() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 2) {
            zzg();
        } else if (i7 == 3) {
            String readString = parcel.readString();
            zzaxp.zzc(parcel);
            zze(readString);
        } else {
            if (i7 != 4) {
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
