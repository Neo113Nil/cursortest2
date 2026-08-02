package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzbqg extends zzaxo implements zzbqh {
    public zzbqg() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            zzbpd zzb = zzbpc.zzb(parcel.readStrongBinder());
            zzaxp.zzc(parcel);
            zzg(zzb);
        } else if (i7 == 2) {
            String readString = parcel.readString();
            zzaxp.zzc(parcel);
            zze(readString);
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
