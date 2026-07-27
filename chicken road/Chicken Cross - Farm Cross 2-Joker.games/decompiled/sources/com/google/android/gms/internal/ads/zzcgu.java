package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzcgu implements zzhcv {
    final /* synthetic */ zzcgs zza;
    final /* synthetic */ zzcgq zzb;

    zzcgu(zzcgv zzcgvVar, zzcgs zzcgsVar, zzcgq zzcgqVar) {
        this.zza = zzcgsVar;
        this.zzb = zzcgqVar;
        Objects.requireNonNull(zzcgvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zzb(Object obj) {
        this.zza.zza(obj);
    }
}
