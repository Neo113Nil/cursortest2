package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcpg implements com.google.android.gms.internal.ads.zzfgu {
    private final com.google.android.gms.internal.ads.zzcox zza;
    private android.content.Context zzb;
    private java.lang.String zzc;
    private com.google.android.gms.ads.internal.client.zzr zzd;

    /* synthetic */ zzcpg(com.google.android.gms.internal.ads.zzcox zzcoxVar, byte[] bArr) {
        this.zza = zzcoxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final com.google.android.gms.internal.ads.zzfgv zza() {
        com.google.android.gms.internal.ads.zzinc.zzc(this.zzb, android.content.Context.class);
        com.google.android.gms.internal.ads.zzinc.zzc(this.zzc, java.lang.String.class);
        com.google.android.gms.internal.ads.zzinc.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzr.class);
        return new com.google.android.gms.internal.ads.zzcph(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfgu zzb(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzrVar.getClass();
        this.zzd = zzrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfgu zzc(java.lang.String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfgu zzd(android.content.Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
