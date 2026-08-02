package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgmx implements zzgna {
    private final zzgvd zza;
    private final zzgse zzb;

    private zzgmx(zzgse zzgseVar, zzgvd zzgvdVar) {
        this.zzb = zzgseVar;
        this.zza = zzgvdVar;
    }

    public static zzgmx zza(zzgse zzgseVar) {
        return new zzgmx(zzgseVar, zzgni.zza(zzgseVar.zzi()));
    }

    public static zzgmx zzb(zzgse zzgseVar) {
        return new zzgmx(zzgseVar, zzgni.zzb(zzgseVar.zzi()));
    }

    public final zzgse zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgna
    public final zzgvd zzd() {
        return this.zza;
    }
}
