package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzeki implements zzesh {
    private final p090m3.a zza;
    private final zzfba zzb;

    public zzeki(p090m3.a aVar, zzfba zzfbaVar) {
        this.zza = aVar;
        this.zzb = zzfbaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        p090m3.a aVar = this.zza;
        zzfba zzfbaVar = this.zzb;
        ((p090m3.b) aVar).getClass();
        return zzgbc.zzh(new zzekj(zzfbaVar, System.currentTimeMillis()));
    }
}
