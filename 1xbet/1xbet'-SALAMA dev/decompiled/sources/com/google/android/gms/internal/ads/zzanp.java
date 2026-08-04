package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzanp {
    private final List zza;
    private final String zzb = "video/mp2t";
    private final zzaeb[] zzc;

    public zzanp(List list, String str) {
        this.zza = list;
        this.zzc = new zzaeb[list.size()];
    }

    public final void zza(long j, zzed zzedVar) {
        if (zzedVar.zzb() < 9) {
            return;
        }
        int iZzg = zzedVar.zzg();
        int iZzg2 = zzedVar.zzg();
        int iZzm = zzedVar.zzm();
        if (iZzg == 434 && iZzg2 == 1195456820 && iZzm == 3) {
            zzach.zzb(j, zzedVar, this.zzc);
        }
    }

    public final void zzb(zzacy zzacyVar, zzanm zzanmVar) {
        for (int i7 = 0; i7 < this.zzc.length; i7++) {
            zzanmVar.zzc();
            zzaeb zzaebVarZzw = zzacyVar.zzw(zzanmVar.zza(), 3);
            zzz zzzVar = (zzz) this.zza.get(i7);
            String str = zzzVar.zzo;
            boolean z4 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z4 = false;
            }
            zzcv.zze(z4, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            zzx zzxVar = new zzx();
            zzxVar.zzO(zzanmVar.zzb());
            zzxVar.zzE(this.zzb);
            zzxVar.zzad(str);
            zzxVar.zzaf(zzzVar.zze);
            zzxVar.zzS(zzzVar.zzd);
            zzxVar.zzz(zzzVar.zzJ);
            zzxVar.zzP(zzzVar.zzr);
            zzaebVarZzw.zzm(zzxVar.zzaj());
            this.zzc[i7] = zzaebVarZzw;
        }
    }
}
