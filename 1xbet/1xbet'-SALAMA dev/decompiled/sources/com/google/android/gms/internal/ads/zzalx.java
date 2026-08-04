package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzalx implements zzaly {
    private final List zza;
    private final zzaeb[] zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private final String zzb = "video/mp2t";
    private long zzg = -9223372036854775807L;

    public zzalx(List list, String str) {
        this.zza = list;
        this.zzc = new zzaeb[list.size()];
    }

    private final boolean zzf(zzed zzedVar, int i7) {
        if (zzedVar.zzb() == 0) {
            return false;
        }
        if (zzedVar.zzm() != i7) {
            this.zzd = false;
        }
        this.zze--;
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zza(zzed zzedVar) {
        if (this.zzd) {
            if (this.zze != 2 || zzf(zzedVar, 32)) {
                if (this.zze != 1 || zzf(zzedVar, 0)) {
                    int iZzd = zzedVar.zzd();
                    int iZzb = zzedVar.zzb();
                    for (zzaeb zzaebVar : this.zzc) {
                        zzedVar.zzL(iZzd);
                        zzaebVar.zzr(zzedVar, iZzb);
                    }
                    this.zzf += iZzb;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzb(zzacy zzacyVar, zzanm zzanmVar) {
        for (int i7 = 0; i7 < this.zzc.length; i7++) {
            zzanj zzanjVar = (zzanj) this.zza.get(i7);
            zzanmVar.zzc();
            zzaeb zzaebVarZzw = zzacyVar.zzw(zzanmVar.zza(), 3);
            zzx zzxVar = new zzx();
            zzxVar.zzO(zzanmVar.zzb());
            zzxVar.zzE(this.zzb);
            zzxVar.zzad("application/dvbsubs");
            zzxVar.zzP(Collections.singletonList(zzanjVar.zzb));
            zzxVar.zzS(zzanjVar.zza);
            zzaebVarZzw.zzm(zzxVar.zzaj());
            this.zzc[i7] = zzaebVarZzw;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzc(boolean z4) {
        if (this.zzd) {
            zzcv.zzf(this.zzg != -9223372036854775807L);
            for (zzaeb zzaebVar : this.zzc) {
                zzaebVar.zzt(this.zzg, 1, this.zzf, 0, null);
            }
            this.zzd = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzd(long j, int i7) {
        if ((i7 & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zzg = j;
        this.zzf = 0;
        this.zze = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zze() {
        this.zzd = false;
        this.zzg = -9223372036854775807L;
    }
}
