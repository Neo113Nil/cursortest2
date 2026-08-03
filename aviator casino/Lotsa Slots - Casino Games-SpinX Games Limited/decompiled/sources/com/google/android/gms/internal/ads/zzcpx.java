package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcpx implements com.google.android.gms.internal.ads.zzfjy {
    private final com.google.android.gms.internal.ads.zzcox zza;
    private android.content.Context zzb;
    private java.lang.String zzc;

    /* synthetic */ zzcpx(com.google.android.gms.internal.ads.zzcox zzcoxVar, byte[] bArr) {
        this.zza = zzcoxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjy
    public final com.google.android.gms.internal.ads.zzfjz zza() {
        com.google.android.gms.internal.ads.zzinc.zzc(this.zzb, android.content.Context.class);
        return new com.google.android.gms.internal.ads.zzcpy(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfjy
    public final /* synthetic */ com.google.android.gms.internal.ads.zzfjy zzb(java.lang.String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfjy
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfjy zzc(android.content.Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
