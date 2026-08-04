package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbuf extends zzaxo implements zzbug {
    public zzbuf() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzaxp.zza(parcel, ParcelFileDescriptor.CREATOR);
            zzaxp.zzc(parcel);
            zzf(parcelFileDescriptor);
        } else if (i7 == 2) {
            com.google.android.gms.ads.internal.util.zzbb zzbbVar = (com.google.android.gms.ads.internal.util.zzbb) zzaxp.zza(parcel, com.google.android.gms.ads.internal.util.zzbb.CREATOR);
            zzaxp.zzc(parcel);
            zze(zzbbVar);
        } else {
            if (i7 != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) zzaxp.zza(parcel, ParcelFileDescriptor.CREATOR);
            zzbuo zzbuoVar = (zzbuo) zzaxp.zza(parcel, zzbuo.CREATOR);
            zzaxp.zzc(parcel);
            zzg(parcelFileDescriptor2, zzbuoVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
