package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbqa extends zzaxo implements zzbqb {
    public zzbqa() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            p105o3.a aVarZ = p105o3.b.Z(parcel.readStrongBinder());
            zzaxp.zzc(parcel);
            zzg(aVarZ);
        } else if (i7 == 2) {
            String string = parcel.readString();
            zzaxp.zzc(parcel);
            zze(string);
        } else if (i7 == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzaxp.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzaxp.zzc(parcel);
            zzf(zzeVar);
        } else {
            if (i7 != 4) {
                return false;
            }
            zzbox zzboxVarZzb = zzbow.zzb(parcel.readStrongBinder());
            zzaxp.zzc(parcel);
            zzh(zzboxVarZzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
