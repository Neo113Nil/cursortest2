package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzahs implements zzahp {
    private final int zza;
    private final int zzb;
    private final zzed zzc;

    public zzahs(zzer zzerVar, zzz zzzVar) {
        zzed zzedVar = zzerVar.zza;
        this.zzc = zzedVar;
        zzedVar.zzL(12);
        int zzp = zzedVar.zzp();
        if ("audio/raw".equals(zzzVar.zzo)) {
            int zzk = zzen.zzk(zzzVar.zzG) * zzzVar.zzE;
            if (zzp == 0 || zzp % zzk != 0) {
                zzdq.zzf("BoxParsers", "Audio sample size mismatch. stsd sample size: " + zzk + ", stsz sample size: " + zzp);
                zzp = zzk;
            }
        }
        this.zza = zzp == 0 ? -1 : zzp;
        this.zzb = zzedVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final int zzc() {
        int i7 = this.zza;
        return i7 == -1 ? this.zzc.zzp() : i7;
    }
}
