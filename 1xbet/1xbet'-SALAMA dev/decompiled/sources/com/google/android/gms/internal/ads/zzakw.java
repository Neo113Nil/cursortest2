package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzakw implements zzajn {
    private final zzakp zza;
    private final long[] zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;

    public zzakw(zzakp zzakpVar, Map map, Map map2, Map map3) {
        this.zza = zzakpVar;
        this.zzd = map2;
        this.zze = map3;
        this.zzc = Collections.unmodifiableMap(map);
        this.zzb = zzakpVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzajn
    public final int zza() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzajn
    public final long zzb(int i7) {
        return this.zzb[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzajn
    public final List zzc(long j) {
        return this.zza.zze(j, this.zzc, this.zzd, this.zze);
    }
}
