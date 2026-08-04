package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public class zzadt implements zzadu {
    private final long zza;
    private final zzads zzb;

    public zzadt(long j, long j3) {
        this.zza = j;
        zzadv zzadvVar = j3 == 0 ? zzadv.zza : new zzadv(0L, j3);
        this.zzb = new zzads(zzadvVar, zzadvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return false;
    }
}
