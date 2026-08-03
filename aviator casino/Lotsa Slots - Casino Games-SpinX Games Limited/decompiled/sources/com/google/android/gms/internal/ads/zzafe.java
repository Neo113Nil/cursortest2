package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzafe implements com.google.android.gms.internal.ads.zzahb {
    private final com.google.android.gms.internal.ads.zzafh zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzafe(com.google.android.gms.internal.ads.zzafh zzafhVar, long j, long j2, long j3, long j4, long j5, long j6) {
        this.zza = zzafhVar;
        this.zzb = j;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
        this.zzf = j6;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final com.google.android.gms.internal.ads.zzagz zzc(long j) {
        com.google.android.gms.internal.ads.zzahc zzahcVar = new com.google.android.gms.internal.ads.zzahc(j, com.google.android.gms.internal.ads.zzafg.zza(this.zza.zza(j), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new com.google.android.gms.internal.ads.zzagz(zzahcVar, zzahcVar);
    }

    public final long zzd(long j) {
        return this.zza.zza(j);
    }

    final /* synthetic */ long zze() {
        return this.zzc;
    }

    final /* synthetic */ long zzf() {
        return this.zzd;
    }

    final /* synthetic */ long zzg() {
        return this.zze;
    }

    final /* synthetic */ long zzh() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public /* synthetic */ boolean zzj() {
        return com.google.android.gms.internal.ads.zzahb.CC.$default$zzj(this);
    }
}
