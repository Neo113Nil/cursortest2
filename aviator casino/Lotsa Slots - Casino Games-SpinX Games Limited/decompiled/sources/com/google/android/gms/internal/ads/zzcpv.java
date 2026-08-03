package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcpv implements com.google.android.gms.internal.ads.zzehp {
    private final com.google.android.gms.internal.ads.zzcox zza;
    private final com.google.android.gms.internal.ads.zzcpu zzb;
    private com.google.android.gms.internal.ads.zzefw zzc;

    /* synthetic */ zzcpv(com.google.android.gms.internal.ads.zzcox zzcoxVar, com.google.android.gms.internal.ads.zzcpu zzcpuVar, byte[] bArr) {
        this.zza = zzcoxVar;
        this.zzb = zzcpuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehp
    public final com.google.android.gms.internal.ads.zzehq zza() {
        com.google.android.gms.internal.ads.zzinc.zzc(this.zzc, com.google.android.gms.internal.ads.zzefw.class);
        return new com.google.android.gms.internal.ads.zzcpw(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzehp
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzehp zzb(com.google.android.gms.internal.ads.zzefw zzefwVar) {
        this.zzc = zzefwVar;
        return this;
    }
}
