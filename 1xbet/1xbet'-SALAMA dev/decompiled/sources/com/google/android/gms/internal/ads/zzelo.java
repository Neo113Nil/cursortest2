package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzelo implements zzesh {
    private final zzgbn zza;
    private final zzfba zzb;
    private final zzbyu zzc;

    public zzelo(zzgbn zzgbnVar, zzfba zzfbaVar, zzbyu zzbyuVar) {
        this.zza = zzgbnVar;
        this.zzb = zzfbaVar;
        this.zzc = zzbyuVar;
    }

    public static /* synthetic */ zzelp zzc(zzelo zzeloVar) {
        return new zzelp(zzeloVar.zzb.zzj, zzeloVar.zzc.zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeln
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzelo.zzc(this.zza);
            }
        });
    }
}
