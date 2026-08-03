package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcds {
    private final com.google.android.gms.common.util.Clock zza;
    private final com.google.android.gms.internal.ads.zzcdq zzb;

    zzcds(com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzcdq zzcdqVar) {
        this.zza = clock;
        this.zzb = zzcdqVar;
    }

    public static com.google.android.gms.internal.ads.zzcds zza(android.content.Context context) {
        return com.google.android.gms.internal.ads.zzcea.zzb(context).zza();
    }

    public final void zzb() {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzfr zzfrVar) {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzd(int i, long j) {
        this.zzb.zza(i, j);
    }
}
