package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcpt implements com.google.android.gms.internal.ads.zzehi {
    private final com.google.android.gms.internal.ads.zzcox zza;
    private android.content.Context zzb;

    /* synthetic */ zzcpt(com.google.android.gms.internal.ads.zzcox zzcoxVar, byte[] bArr) {
        this.zza = zzcoxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehi
    public final com.google.android.gms.internal.ads.zzehj zza() {
        com.google.android.gms.internal.ads.zzinc.zzc(this.zzb, android.content.Context.class);
        return new com.google.android.gms.internal.ads.zzcpu(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzehi
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzehi zzb(android.content.Context context) {
        this.zzb = context;
        return this;
    }
}
