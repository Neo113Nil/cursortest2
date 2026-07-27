package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzafn implements zzahk {
    private final zzafq zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzafn(zzafq zzafqVar, long j, long j2, long j3, long j4, long j5, long j6) {
        this.zza = zzafqVar;
        this.zzb = j;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
        this.zzf = j6;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi zzc(long j) {
        zzahl zzahlVar = new zzahl(j, zzafp.zza(this.zza.zza(j), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzahi(zzahlVar, zzahlVar);
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
}
