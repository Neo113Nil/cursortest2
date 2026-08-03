package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcdu {
    private android.content.Context zza;
    private com.google.android.gms.common.util.Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private com.google.android.gms.internal.ads.zzcdz zzd;

    private zzcdu() {
        throw null;
    }

    /* synthetic */ zzcdu(byte[] bArr) {
    }

    public final com.google.android.gms.internal.ads.zzcdu zzc(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcdu zzd(com.google.android.gms.internal.ads.zzcdz zzcdzVar) {
        this.zzd = zzcdzVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcea zze() {
        com.google.android.gms.internal.ads.zzinc.zzc(this.zza, android.content.Context.class);
        com.google.android.gms.internal.ads.zzinc.zzc(this.zzb, com.google.android.gms.common.util.Clock.class);
        com.google.android.gms.internal.ads.zzinc.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        com.google.android.gms.internal.ads.zzinc.zzc(this.zzd, com.google.android.gms.internal.ads.zzcdz.class);
        return new com.google.android.gms.internal.ads.zzcdv(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final com.google.android.gms.internal.ads.zzcdu zza(android.content.Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcdu zzb(com.google.android.gms.common.util.Clock clock) {
        clock.getClass();
        this.zzb = clock;
        return this;
    }
}
