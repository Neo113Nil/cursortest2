package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzxe extends com.google.android.gms.internal.ads.zzbf {
    private final com.google.android.gms.internal.ads.zzak zzb;

    public zzxe(com.google.android.gms.internal.ads.zzak zzakVar) {
        this.zzb = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final com.google.android.gms.internal.ads.zzbe zzb(int i, com.google.android.gms.internal.ads.zzbe zzbeVar, long j) {
        zzbeVar.zza(com.google.android.gms.internal.ads.zzbe.zza, this.zzb, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        zzbeVar.zzk = true;
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final com.google.android.gms.internal.ads.zzbd zzd(int i, com.google.android.gms.internal.ads.zzbd zzbdVar, boolean z) {
        zzbdVar.zza(z ? 0 : null, z ? com.google.android.gms.internal.ads.zzxd.zzc : null, 0, -9223372036854775807L, 0L, com.google.android.gms.internal.ads.zzc.zza, true);
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zze(java.lang.Object obj) {
        return obj == com.google.android.gms.internal.ads.zzxd.zzc ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final java.lang.Object zzf(int i) {
        return com.google.android.gms.internal.ads.zzxd.zzc;
    }
}
