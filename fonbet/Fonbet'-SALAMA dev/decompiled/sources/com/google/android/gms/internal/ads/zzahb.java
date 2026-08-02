package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzahb extends zzacj implements zzahg {
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;

    public zzahb(long j, long j3, int i7, int i8, boolean z4) {
        super(j, j3, i7, i8, false);
        this.zza = j3;
        this.zzb = i7;
        this.zzc = i8;
        this.zzd = j == -1 ? -1L : j;
    }

    @Override // com.google.android.gms.internal.ads.zzahg
    public final int zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahg
    public final long zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahg
    public final long zze(long j) {
        return zzb(j);
    }

    public final zzahb zzf(long j) {
        return new zzahb(j, this.zza, this.zzb, this.zzc, false);
    }
}
