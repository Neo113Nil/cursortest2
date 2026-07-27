package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdan implements zzdjk, zzdfd {
    private final Clock zza;
    private final zzdap zzb;
    private final zzflw zzc;
    private final String zzd;

    zzdan(Clock clock, zzdap zzdapVar, zzflw zzflwVar, String str) {
        this.zza = clock;
        this.zzb = zzdapVar;
        this.zzc = zzflwVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdjk
    public final void zza() {
        this.zzb.zzd(this.zzd, this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzg() {
        Clock clock = this.zza;
        this.zzb.zze(this.zzc.zzg, this.zzd, clock.elapsedRealtime());
    }
}
