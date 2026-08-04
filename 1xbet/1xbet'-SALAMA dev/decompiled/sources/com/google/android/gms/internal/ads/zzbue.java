package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class zzbue extends zzaxn implements zzbug {
    public zzbue(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzbbVar);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, parcelFileDescriptor);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbuo zzbuoVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, parcelFileDescriptor);
        zzaxp.zzd(parcelZza, zzbuoVar);
        zzda(3, parcelZza);
    }
}
