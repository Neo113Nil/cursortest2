package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcpk implements com.google.android.gms.internal.ads.zzeav {
    private final com.google.android.gms.internal.ads.zzcox zza;
    private final com.google.android.gms.internal.ads.zzcpn zzb;
    private java.lang.Long zzc;
    private java.lang.String zzd;

    /* synthetic */ zzcpk(com.google.android.gms.internal.ads.zzcox zzcoxVar, com.google.android.gms.internal.ads.zzcpn zzcpnVar, byte[] bArr) {
        this.zza = zzcoxVar;
        this.zzb = zzcpnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeav
    public final com.google.android.gms.internal.ads.zzeaw zza() {
        com.google.android.gms.internal.ads.zzinc.zzc(this.zzc, java.lang.Long.class);
        com.google.android.gms.internal.ads.zzinc.zzc(this.zzd, java.lang.String.class);
        return new com.google.android.gms.internal.ads.zzcpl(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzeav
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzeav zzc(long j) {
        this.zzc = java.lang.Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeav
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzeav zzb(java.lang.String str) {
        str.getClass();
        this.zzd = str;
        return this;
    }
}
