package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzana implements zzann {
    private final zzamz zza;
    private final zzed zzb = new zzed(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzana(zzamz zzamzVar) {
        this.zza = zzamzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final void zza(zzed zzedVar, int i7) {
        int i8 = i7 & 1;
        int zzd = i8 != 0 ? zzedVar.zzd() + zzedVar.zzm() : -1;
        if (this.zzf) {
            if (i8 == 0) {
                return;
            }
            this.zzf = false;
            zzedVar.zzL(zzd);
            this.zzd = 0;
        }
        while (zzedVar.zzb() > 0) {
            int i9 = this.zzd;
            if (i9 < 3) {
                if (i9 == 0) {
                    int zzm = zzedVar.zzm();
                    zzedVar.zzL(zzedVar.zzd() - 1);
                    if (zzm == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int min = Math.min(zzedVar.zzb(), 3 - this.zzd);
                zzedVar.zzH(this.zzb.zzN(), this.zzd, min);
                int i10 = this.zzd + min;
                this.zzd = i10;
                if (i10 == 3) {
                    this.zzb.zzL(0);
                    this.zzb.zzK(3);
                    this.zzb.zzM(1);
                    zzed zzedVar2 = this.zzb;
                    int zzm2 = zzedVar2.zzm();
                    boolean z4 = (zzm2 & 128) != 0;
                    int zzm3 = zzedVar2.zzm();
                    this.zze = z4;
                    this.zzc = (zzm3 | ((zzm2 & 15) << 8)) + 3;
                    int zzc = this.zzb.zzc();
                    int i11 = this.zzc;
                    if (zzc < i11) {
                        int zzc2 = this.zzb.zzc();
                        this.zzb.zzF(Math.min(4098, Math.max(i11, zzc2 + zzc2)));
                    }
                }
            } else {
                int min2 = Math.min(zzedVar.zzb(), this.zzc - i9);
                zzedVar.zzH(this.zzb.zzN(), this.zzd, min2);
                int i12 = this.zzd + min2;
                this.zzd = i12;
                int i13 = this.zzc;
                if (i12 != i13) {
                    continue;
                } else {
                    if (!this.zze) {
                        this.zzb.zzK(i13);
                    } else {
                        if (zzen.zzf(this.zzb.zzN(), 0, i13, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        this.zzb.zzK(this.zzc - 4);
                    }
                    this.zzb.zzL(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final void zzb(zzek zzekVar, zzacy zzacyVar, zzanm zzanmVar) {
        this.zza.zzb(zzekVar, zzacyVar, zzanmVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final void zzc() {
        this.zzf = true;
    }
}
