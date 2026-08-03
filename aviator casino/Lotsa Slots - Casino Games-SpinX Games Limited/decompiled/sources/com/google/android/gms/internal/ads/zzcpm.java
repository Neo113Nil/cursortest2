package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcpm implements com.google.android.gms.internal.ads.zzebc {
    private final com.google.android.gms.internal.ads.zzcox zza;
    private android.content.Context zzb;
    private com.google.android.gms.internal.ads.zzbqq zzc;

    /* synthetic */ zzcpm(com.google.android.gms.internal.ads.zzcox zzcoxVar, byte[] bArr) {
        this.zza = zzcoxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    public final com.google.android.gms.internal.ads.zzebd zza() {
        com.google.android.gms.internal.ads.zzinc.zzc(this.zzb, android.content.Context.class);
        com.google.android.gms.internal.ads.zzinc.zzc(this.zzc, com.google.android.gms.internal.ads.zzbqq.class);
        return new com.google.android.gms.internal.ads.zzcpn(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzebc zzb(com.google.android.gms.internal.ads.zzbqq zzbqqVar) {
        zzbqqVar.getClass();
        this.zzc = zzbqqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzebc zzc(android.content.Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
