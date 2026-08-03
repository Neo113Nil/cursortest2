package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcpb implements com.google.android.gms.internal.ads.zzffg {
    private final com.google.android.gms.internal.ads.zzcox zza;
    private android.content.Context zzb;
    private java.lang.String zzc;

    /* synthetic */ zzcpb(com.google.android.gms.internal.ads.zzcox zzcoxVar, byte[] bArr) {
        this.zza = zzcoxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffg
    public final com.google.android.gms.internal.ads.zzffh zza() {
        com.google.android.gms.internal.ads.zzinc.zzc(this.zzb, android.content.Context.class);
        com.google.android.gms.internal.ads.zzinc.zzc(this.zzc, java.lang.String.class);
        return new com.google.android.gms.internal.ads.zzcpc(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzffg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzffg zzb(java.lang.String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzffg zzc(android.content.Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
