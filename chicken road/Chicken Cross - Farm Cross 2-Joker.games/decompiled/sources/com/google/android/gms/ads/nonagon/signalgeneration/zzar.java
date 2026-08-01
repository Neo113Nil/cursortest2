package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdml;
import com.google.android.gms.internal.ads.zzhcv;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzar implements zzhcv {
    final /* synthetic */ zzdml zza;

    zzar(zzdml zzdmlVar) {
        this.zza = zzdmlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        this.zza.zzb(th.getMessage());
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* synthetic */ void zzb(Object obj) {
        this.zza.zza((zzbc) obj);
    }
}
