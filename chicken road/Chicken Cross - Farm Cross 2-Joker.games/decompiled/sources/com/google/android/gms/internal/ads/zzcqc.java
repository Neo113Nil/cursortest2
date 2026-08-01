package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzcqc implements zzebt {
    private final zzcpp zza;
    private final zzcqf zzb;
    private Long zzc;
    private String zzd;

    /* synthetic */ zzcqc(zzcpp zzcppVar, zzcqf zzcqfVar, byte[] bArr) {
        this.zza = zzcppVar;
        this.zzb = zzcqfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebt
    public final zzebu zza() {
        zzioe.zzc(this.zzc, Long.class);
        zzioe.zzc(this.zzd, String.class);
        return new zzcqd(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzebt
    public final /* bridge */ /* synthetic */ zzebt zzc(long j) {
        this.zzc = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzebt
    public final /* bridge */ /* synthetic */ zzebt zzb(String str) {
        str.getClass();
        this.zzd = str;
        return this;
    }
}
