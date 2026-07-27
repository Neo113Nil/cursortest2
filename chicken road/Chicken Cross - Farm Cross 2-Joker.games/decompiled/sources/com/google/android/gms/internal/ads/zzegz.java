package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzegz extends zzcbl {
    private final zzcgo zza;
    private final zzcbv zzb;

    zzegz(zzcgo zzcgoVar, zzcbv zzcbvVar) {
        this.zza = zzcgoVar;
        this.zzb = zzcbvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(new zzehq(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.zza.zzd(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzcbv zzcbvVar) {
        this.zza.zzc(new zzehq(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzcbvVar));
    }
}
