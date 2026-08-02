package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class zzbue extends zzaxn implements zzbug {
    public zzbue(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzbbVar);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel zza = zza();
        zzaxp.zzd(zza, parcelFileDescriptor);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbuo zzbuoVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, parcelFileDescriptor);
        zzaxp.zzd(zza, zzbuoVar);
        zzda(3, zza);
    }
}
