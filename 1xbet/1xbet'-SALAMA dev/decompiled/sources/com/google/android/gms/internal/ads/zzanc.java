package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzanc {
    private final List zza;
    private final zzaeb[] zzc;
    private final String zzb = "video/mp2t";
    private final zzfn zzd = new zzfn(new zzfm() { // from class: com.google.android.gms.internal.ads.zzanb
        @Override // com.google.android.gms.internal.ads.zzfm
        public final void zza(long j, zzed zzedVar) {
            zzach.zza(j, zzedVar, this.zza.zzc);
        }
    });

    public zzanc(List list, String str) {
        this.zza = list;
        this.zzc = new zzaeb[list.size()];
    }

    public final void zzb() {
        this.zzd.zzd();
    }

    public final void zzc(long j, zzed zzedVar) {
        this.zzd.zzb(j, zzedVar);
    }

    public final void zzd(zzacy zzacyVar, zzanm zzanmVar) {
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
            String strZzb = zzzVar.zza;
            if (strZzb == null) {
                strZzb = zzanmVar.zzb();
            }
            zzx zzxVar = new zzx();
            zzxVar.zzO(strZzb);
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

    public final void zze() {
        this.zzd.zzd();
    }

    public final void zzf(int i7) {
        this.zzd.zze(i7);
    }
}
