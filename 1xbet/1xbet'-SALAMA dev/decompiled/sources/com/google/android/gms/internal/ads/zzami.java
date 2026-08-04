package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzami implements zzaly {
    private zzaeb zzc;
    private boolean zzd;
    private int zzf;
    private int zzg;
    private final String zza = "video/mp2t";
    private final zzed zzb = new zzed(10);
    private long zze = -9223372036854775807L;

    public zzami(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zza(zzed zzedVar) {
        zzcv.zzb(this.zzc);
        if (this.zzd) {
            int iZzb = zzedVar.zzb();
            int i7 = this.zzg;
            if (i7 < 10) {
                int iMin = Math.min(iZzb, 10 - i7);
                System.arraycopy(zzedVar.zzN(), zzedVar.zzd(), this.zzb.zzN(), this.zzg, iMin);
                if (this.zzg + iMin == 10) {
                    this.zzb.zzL(0);
                    if (this.zzb.zzm() != 73 || this.zzb.zzm() != 68 || this.zzb.zzm() != 51) {
                        zzdq.zzf("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzd = false;
                        return;
                    } else {
                        this.zzb.zzM(3);
                        this.zzf = this.zzb.zzl() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iZzb, this.zzf - this.zzg);
            this.zzc.zzr(zzedVar, iMin2);
            this.zzg += iMin2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzb(zzacy zzacyVar, zzanm zzanmVar) {
        zzanmVar.zzc();
        zzaeb zzaebVarZzw = zzacyVar.zzw(zzanmVar.zza(), 5);
        this.zzc = zzaebVarZzw;
        zzx zzxVar = new zzx();
        zzxVar.zzO(zzanmVar.zzb());
        zzxVar.zzE(this.zza);
        zzxVar.zzad("application/id3");
        zzaebVarZzw.zzm(zzxVar.zzaj());
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzc(boolean z4) {
        int i7;
        zzcv.zzb(this.zzc);
        if (this.zzd && (i7 = this.zzf) != 0 && this.zzg == i7) {
            zzcv.zzf(this.zze != -9223372036854775807L);
            this.zzc.zzt(this.zze, 1, this.zzf, 0, null);
            this.zzd = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzd(long j, int i7) {
        if ((i7 & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zze = j;
        this.zzf = 0;
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zze() {
        this.zzd = false;
        this.zze = -9223372036854775807L;
    }
}
