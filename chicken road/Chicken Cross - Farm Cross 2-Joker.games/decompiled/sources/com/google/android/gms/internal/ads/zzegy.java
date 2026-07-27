package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzegy extends zzcbl {
    final /* synthetic */ zzeha zza;

    protected zzegy(zzeha zzehaVar) {
        Objects.requireNonNull(zzehaVar);
        this.zza = zzehaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzeha zzehaVar = this.zza;
        zzehaVar.zza.zzc(new zzehq(autoCloseInputStream, zzehaVar.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.zza.zza.zzd(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzcbv zzcbvVar) {
        this.zza.zza.zzc(new zzehq(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzcbvVar));
    }
}
