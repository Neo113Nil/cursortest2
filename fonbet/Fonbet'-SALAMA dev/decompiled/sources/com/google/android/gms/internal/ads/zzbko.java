package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public abstract class zzbko extends zzaxo implements zzbkp {
    public zzbko() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzaxp.zza(parcel, ParcelFileDescriptor.CREATOR);
        zzaxp.zzc(parcel);
        zzb(parcelFileDescriptor);
        return true;
    }
}
