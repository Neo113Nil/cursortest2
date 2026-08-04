package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzals implements zzaly {
    private final zzec zza;
    private final zzed zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private String zzf;
    private zzaeb zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private zzz zzl;
    private int zzm;
    private long zzn;

    public zzals(String str, int i7, String str2) {
        zzec zzecVar = new zzec(new byte[16], 16);
        this.zza = zzecVar;
        this.zzb = new zzed(zzecVar.zza);
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i7;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zza(zzed zzedVar) {
        zzcv.zzb(this.zzg);
        while (zzedVar.zzb() > 0) {
            int i7 = this.zzh;
            if (i7 == 0) {
                while (true) {
                    if (zzedVar.zzb() > 0) {
                        if (this.zzj) {
                            int iZzm = zzedVar.zzm();
                            this.zzj = iZzm == 172;
                            if (iZzm != 64) {
                                if (iZzm == 65) {
                                    iZzm = 65;
                                }
                            }
                            this.zzh = 1;
                            zzed zzedVar2 = this.zzb;
                            zzedVar2.zzN()[0] = -84;
                            zzedVar2.zzN()[1] = iZzm == 65 ? (byte) 65 : (byte) 64;
                            this.zzi = 2;
                        } else {
                            this.zzj = zzedVar.zzm() == 172;
                        }
                    }
                }
            } else if (i7 != 1) {
                int iMin = Math.min(zzedVar.zzb(), this.zzm - this.zzi);
                this.zzg.zzr(zzedVar, iMin);
                int i8 = this.zzi + iMin;
                this.zzi = i8;
                if (i8 == this.zzm) {
                    zzcv.zzf(this.zzn != -9223372036854775807L);
                    this.zzg.zzt(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzk;
                    this.zzh = 0;
                }
            } else {
                byte[] bArrZzN = this.zzb.zzN();
                int iMin2 = Math.min(zzedVar.zzb(), 16 - this.zzi);
                zzedVar.zzH(bArrZzN, this.zzi, iMin2);
                int i9 = this.zzi + iMin2;
                this.zzi = i9;
                if (i9 == 16) {
                    this.zza.zzl(0);
                    zzabw zzabwVarZzb = zzaby.zzb(this.zza);
                    zzz zzzVar = this.zzl;
                    if (zzzVar == null || zzzVar.zzE != 2 || zzabwVarZzb.zza != zzzVar.zzF || !"audio/ac4".equals(zzzVar.zzo)) {
                        zzx zzxVar = new zzx();
                        zzxVar.zzO(this.zzf);
                        zzxVar.zzE(this.zze);
                        zzxVar.zzad("audio/ac4");
                        zzxVar.zzB(2);
                        zzxVar.zzae(zzabwVarZzb.zza);
                        zzxVar.zzS(this.zzc);
                        zzxVar.zzab(this.zzd);
                        zzz zzzVarZzaj = zzxVar.zzaj();
                        this.zzl = zzzVarZzaj;
                        this.zzg.zzm(zzzVarZzaj);
                    }
                    this.zzm = zzabwVarZzb.zzb;
                    this.zzk = (((long) zzabwVarZzb.zzc) * 1000000) / ((long) this.zzl.zzF);
                    this.zzb.zzL(0);
                    this.zzg.zzr(this.zzb, 16);
                    this.zzh = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzb(zzacy zzacyVar, zzanm zzanmVar) {
        zzanmVar.zzc();
        this.zzf = zzanmVar.zzb();
        this.zzg = zzacyVar.zzw(zzanmVar.zza(), 1);
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
        this.zzj = false;
        this.zzn = -9223372036854775807L;
    }
}
