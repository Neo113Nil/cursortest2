package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class zztz implements zzwm {
    private final zzwm zza;
    private final zzfwh zzb;

    public zztz(zzwm zzwmVar, List list) {
        this.zza = zzwmVar;
        this.zzb = zzfwh.zzl(list);
    }

    public final zzfwh zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final long zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final long zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzm(long j) {
        this.zza.zzm(j);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final boolean zzo(zzkm zzkmVar) {
        return this.zza.zzo(zzkmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
