package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzeuk implements zzeup {
    final /* synthetic */ zzeul zza;

    zzeuk(zzeul zzeulVar) {
        Objects.requireNonNull(zzeulVar);
        this.zza = zzeulVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcyl zzcylVar = (zzcyl) obj;
        zzeul zzeulVar = this.zza;
        synchronized (zzeulVar) {
            zzeulVar.zze(zzcylVar.zzn());
            zzcylVar.zzj();
        }
    }
}
