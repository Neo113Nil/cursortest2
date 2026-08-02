package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzawk extends zzaxe {
    private final zzavs zzh;

    public zzawk(zzavr zzavrVar, String str, String str2, zzarr zzarrVar, int i7, int i8, zzavs zzavsVar) {
        super(zzavrVar, "mkxT9wGwpYvc37eJUy/mO8MzFK5vy/fyoqxDYyLTauyqugfjwzRoZnGwCYMOffWM", "yrKApWIiogD/j2z8LlUnSlw79Wsq7FxRW56QjqqoswM=", zzarrVar, i7, 85);
        this.zzh = zzavsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxe
    public final void zza() {
        long[] jArr = (long[]) this.zze.invoke(null, Long.valueOf(this.zzh.zzd()), Long.valueOf(this.zzh.zzh()), Long.valueOf(this.zzh.zzb()), Long.valueOf(this.zzh.zzf()));
        synchronized (this.zzd) {
            this.zzd.zzt(jArr[0]);
            this.zzd.zzs(jArr[1]);
        }
    }
}
