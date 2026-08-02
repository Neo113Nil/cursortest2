package com.google.android.gms.internal.ads;

import m3.f;

/* loaded from: classes.dex */
public final class zzemu implements zzesh {
    private final zzexd zza;

    public zzemu(zzexd zzexdVar) {
        this.zza = zzexdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        zzexd zzexdVar = this.zza;
        if (zzexdVar == null) {
            return zzgbc.zzh(new zzemt(null));
        }
        String zza = zzexdVar.zza();
        int i7 = f.f15259a;
        return (zza == null || zza.trim().isEmpty()) ? zzgbc.zzh(new zzemt(null)) : zzgbc.zzh(new zzemt(zza));
    }
}
