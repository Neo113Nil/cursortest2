package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzenf implements zzesh {
    private final zzgbn zza;
    private final zzdol zzb;
    private final String zzc;
    private final zzfba zzd;

    public zzenf(zzgbn zzgbnVar, zzdol zzdolVar, zzfba zzfbaVar, String str) {
        this.zza = zzgbnVar;
        this.zzb = zzdolVar;
        this.zzd = zzfbaVar;
        this.zzc = str;
    }

    public static /* synthetic */ zzeng zzc(zzenf zzenfVar) {
        zzdol zzdolVar = zzenfVar.zzb;
        return new zzeng(zzdolVar.zzb(zzenfVar.zzd.zzf, zzenfVar.zzc), zzdolVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzene
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzenf.zzc(zzenf.this);
            }
        });
    }
}
