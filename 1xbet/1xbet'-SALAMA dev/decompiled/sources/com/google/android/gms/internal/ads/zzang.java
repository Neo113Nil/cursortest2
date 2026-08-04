package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzang implements zzamz {
    final /* synthetic */ zzani zza;
    private final zzec zzb = new zzec(new byte[4], 4);

    public zzang(zzani zzaniVar) {
        this.zza = zzaniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(zzed zzedVar) {
        if (zzedVar.zzm() == 0 && (zzedVar.zzm() & 128) != 0) {
            zzedVar.zzM(6);
            int iZzb = zzedVar.zzb() / 4;
            for (int i7 = 0; i7 < iZzb; i7++) {
                zzedVar.zzG(this.zzb, 4);
                zzec zzecVar = this.zzb;
                int iZzd = zzecVar.zzd(16);
                zzecVar.zzn(3);
                if (iZzd == 0) {
                    this.zzb.zzn(13);
                } else {
                    int iZzd2 = this.zzb.zzd(13);
                    if (this.zza.zzg.get(iZzd2) == null) {
                        zzani zzaniVar = this.zza;
                        zzaniVar.zzg.put(iZzd2, new zzana(new zzanh(zzaniVar, iZzd2)));
                        this.zza.zzm++;
                    }
                }
            }
            this.zza.zzg.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzek zzekVar, zzacy zzacyVar, zzanm zzanmVar) {
    }
}
