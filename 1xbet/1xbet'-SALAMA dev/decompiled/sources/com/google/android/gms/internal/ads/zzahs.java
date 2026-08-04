package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzahs implements zzahp {
    private final int zza;
    private final int zzb;
    private final zzed zzc;

    public zzahs(zzer zzerVar, zzz zzzVar) {
        zzed zzedVar = zzerVar.zza;
        this.zzc = zzedVar;
        zzedVar.zzL(12);
        int iZzp = zzedVar.zzp();
        if ("audio/raw".equals(zzzVar.zzo)) {
            int iZzk = zzen.zzk(zzzVar.zzG) * zzzVar.zzE;
            if (iZzp == 0 || iZzp % iZzk != 0) {
                zzdq.zzf("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iZzk + ", stsz sample size: " + iZzp);
                iZzp = iZzk;
            }
        }
        this.zza = iZzp == 0 ? -1 : iZzp;
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
