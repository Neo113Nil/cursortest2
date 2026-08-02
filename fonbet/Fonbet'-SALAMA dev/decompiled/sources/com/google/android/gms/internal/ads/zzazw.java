package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzazw extends zzaxo implements zzazx {
    public zzazw() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            zzf();
        } else if (i7 == 2) {
            zzc();
        } else if (i7 == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzaxp.zzc(parcel);
            zzd(zzeVar);
        } else if (i7 == 4) {
            zze();
        } else {
            if (i7 != 5) {
                return false;
            }
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}
