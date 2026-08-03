package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzzg extends com.google.android.gms.internal.ads.zzbf {
    private static final java.lang.Object zzb = new java.lang.Object();
    private final long zzc;
    private final long zzd;
    private final boolean zze;
    private final com.google.android.gms.internal.ads.zzak zzf;
    private final com.google.android.gms.internal.ads.zzaf zzg;

    static {
        com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
        zzzVar.zza("SinglePeriodTimeline");
        zzzVar.zzb(android.net.Uri.EMPTY);
        zzzVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final com.google.android.gms.internal.ads.zzbe zzb(int i, com.google.android.gms.internal.ads.zzbe zzbeVar, long j) {
        com.google.android.gms.internal.ads.zzgtj.zzm(i, 1, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        boolean z = this.zze;
        zzbeVar.zza(com.google.android.gms.internal.ads.zzbe.zza, this.zzf, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, z, false, this.zzg, 0L, this.zzd, 0, 0, 0L);
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final com.google.android.gms.internal.ads.zzbd zzd(int i, com.google.android.gms.internal.ads.zzbd zzbdVar, boolean z) {
        com.google.android.gms.internal.ads.zzgtj.zzm(i, 1, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        zzbdVar.zza(null, z ? zzb : null, 0, this.zzc, 0L, com.google.android.gms.internal.ads.zzc.zza, false);
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zze(java.lang.Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final java.lang.Object zzf(int i) {
        com.google.android.gms.internal.ads.zzgtj.zzm(i, 1, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return zzb;
    }

    public zzzg(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, java.lang.Object obj, com.google.android.gms.internal.ads.zzak zzakVar, com.google.android.gms.internal.ads.zzaf zzafVar) {
        this.zzc = j4;
        this.zzd = j5;
        this.zze = z;
        zzakVar.getClass();
        this.zzf = zzakVar;
        this.zzg = zzafVar;
    }
}
