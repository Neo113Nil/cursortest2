package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzczv implements com.google.android.gms.internal.ads.zzdim, com.google.android.gms.internal.ads.zzdef {
    private final com.google.android.gms.common.util.Clock zza;
    private final com.google.android.gms.internal.ads.zzczx zzb;
    private final com.google.android.gms.internal.ads.zzfky zzc;
    private final java.lang.String zzd;

    zzczv(com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzczx zzczxVar, com.google.android.gms.internal.ads.zzfky zzfkyVar, java.lang.String str) {
        this.zza = clock;
        this.zzb = zzczxVar;
        this.zzc = zzfkyVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdim
    public final void zza() {
        this.zzb.zzd(this.zzd, this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzg() {
        com.google.android.gms.common.util.Clock clock = this.zza;
        this.zzb.zze(this.zzc.zzg, this.zzd, clock.elapsedRealtime());
    }
}
