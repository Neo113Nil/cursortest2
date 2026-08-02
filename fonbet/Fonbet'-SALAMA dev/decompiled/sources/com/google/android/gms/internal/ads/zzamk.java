package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzamk implements zzaly {
    private final zzed zza;
    private final zzadn zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private zzaeb zzf;
    private String zzg;
    private int zzh = 0;
    private int zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzamk(String str, int i7, String str2) {
        zzed zzedVar = new zzed(4);
        this.zza = zzedVar;
        zzedVar.zzN()[0] = -1;
        this.zzb = new zzadn();
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i7;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zza(zzed zzedVar) {
        zzcv.zzb(this.zzf);
        while (zzedVar.zzb() > 0) {
            int i7 = this.zzh;
            if (i7 == 0) {
                byte[] zzN = zzedVar.zzN();
                int zzd = zzedVar.zzd();
                int zze = zzedVar.zze();
                while (true) {
                    if (zzd >= zze) {
                        zzedVar.zzL(zze);
                        break;
                    }
                    int i8 = zzd + 1;
                    byte b7 = zzN[zzd];
                    boolean z4 = (b7 & 255) == 255;
                    boolean z7 = this.zzk && (b7 & 224) == 224;
                    this.zzk = z4;
                    if (z7) {
                        zzedVar.zzL(i8);
                        this.zzk = false;
                        this.zza.zzN()[1] = zzN[zzd];
                        this.zzi = 2;
                        this.zzh = 1;
                        break;
                    }
                    zzd = i8;
                }
            } else if (i7 != 1) {
                int min = Math.min(zzedVar.zzb(), this.zzm - this.zzi);
                this.zzf.zzr(zzedVar, min);
                int i9 = this.zzi + min;
                this.zzi = i9;
                if (i9 >= this.zzm) {
                    zzcv.zzf(this.zzn != -9223372036854775807L);
                    this.zzf.zzt(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzl;
                    this.zzi = 0;
                    this.zzh = 0;
                }
            } else {
                int min2 = Math.min(zzedVar.zzb(), 4 - this.zzi);
                zzedVar.zzH(this.zza.zzN(), this.zzi, min2);
                int i10 = this.zzi + min2;
                this.zzi = i10;
                if (i10 >= 4) {
                    this.zza.zzL(0);
                    if (this.zzb.zza(this.zza.zzg())) {
                        this.zzm = this.zzb.zzc;
                        if (!this.zzj) {
                            this.zzl = (r0.zzg * 1000000) / r0.zzd;
                            zzx zzxVar = new zzx();
                            zzxVar.zzO(this.zzg);
                            zzxVar.zzE(this.zze);
                            zzxVar.zzad(this.zzb.zzb);
                            zzxVar.zzT(4096);
                            zzxVar.zzB(this.zzb.zze);
                            zzxVar.zzae(this.zzb.zzd);
                            zzxVar.zzS(this.zzc);
                            zzxVar.zzab(this.zzd);
                            this.zzf.zzm(zzxVar.zzaj());
                            this.zzj = true;
                        }
                        this.zza.zzL(0);
                        this.zzf.zzr(this.zza, 4);
                        this.zzh = 2;
                    } else {
                        this.zzi = 0;
                        this.zzh = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzb(zzacy zzacyVar, zzanm zzanmVar) {
        zzanmVar.zzc();
        this.zzg = zzanmVar.zzb();
        this.zzf = zzacyVar.zzw(zzanmVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzc(boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzd(long j, int i7) {
        this.zzn = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zze() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
    }
}
