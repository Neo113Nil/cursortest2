package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzalq implements zzaly {
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

    public zzalq(String str, int i7, String str2) {
        zzec zzecVar = new zzec(new byte[128], 128);
        this.zza = zzecVar;
        this.zzb = new zzed(zzecVar.zza);
        this.zzh = 0;
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i7;
        this.zze = str2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d3  */
    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zza(zzed zzedVar) {
        zzx zzxVar;
        zzcv.zzb(this.zzg);
        while (zzedVar.zzb() > 0) {
            int i7 = this.zzh;
            if (i7 == 0) {
                while (zzedVar.zzb() > 0) {
                    if (this.zzj) {
                        int iZzm = zzedVar.zzm();
                        if (iZzm == 119) {
                            this.zzj = false;
                            this.zzh = 1;
                            zzed zzedVar2 = this.zzb;
                            zzedVar2.zzN()[0] = 11;
                            zzedVar2.zzN()[1] = 119;
                            this.zzi = 2;
                            break;
                        }
                        this.zzj = iZzm == 11;
                    } else {
                        this.zzj = zzedVar.zzm() == 11;
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
                int iMin2 = Math.min(zzedVar.zzb(), 128 - this.zzi);
                zzedVar.zzH(bArrZzN, this.zzi, iMin2);
                int i9 = this.zzi + iMin2;
                this.zzi = i9;
                if (i9 == 128) {
                    this.zza.zzl(0);
                    zzabs zzabsVarZze = zzabu.zze(this.zza);
                    zzz zzzVar = this.zzl;
                    if (zzzVar != null && zzabsVarZze.zzc == zzzVar.zzE && zzabsVarZze.zzb == zzzVar.zzF) {
                        String str = zzabsVarZze.zza;
                        String str2 = zzzVar.zzo;
                        int i10 = zzen.zza;
                        if (!Objects.equals(str, str2)) {
                            zzxVar = new zzx();
                            zzxVar.zzO(this.zzf);
                            zzxVar.zzE(this.zze);
                            zzxVar.zzad(zzabsVarZze.zza);
                            zzxVar.zzB(zzabsVarZze.zzc);
                            zzxVar.zzae(zzabsVarZze.zzb);
                            zzxVar.zzS(this.zzc);
                            zzxVar.zzab(this.zzd);
                            zzxVar.zzY(zzabsVarZze.zzf);
                            if ("audio/ac3".equals(zzabsVarZze.zza)) {
                                zzxVar.zzA(zzabsVarZze.zzf);
                            }
                            zzz zzzVarZzaj = zzxVar.zzaj();
                            this.zzl = zzzVarZzaj;
                            this.zzg.zzm(zzzVarZzaj);
                        }
                    } else {
                        zzxVar = new zzx();
                        zzxVar.zzO(this.zzf);
                        zzxVar.zzE(this.zze);
                        zzxVar.zzad(zzabsVarZze.zza);
                        zzxVar.zzB(zzabsVarZze.zzc);
                        zzxVar.zzae(zzabsVarZze.zzb);
                        zzxVar.zzS(this.zzc);
                        zzxVar.zzab(this.zzd);
                        zzxVar.zzY(zzabsVarZze.zzf);
                        if ("audio/ac3".equals(zzabsVarZze.zza)) {
                            zzxVar.zzA(zzabsVarZze.zzf);
                        }
                        zzz zzzVarZzaj2 = zzxVar.zzaj();
                        this.zzl = zzzVarZzaj2;
                        this.zzg.zzm(zzzVarZzaj2);
                    }
                    this.zzm = zzabsVarZze.zzd;
                    this.zzk = (((long) zzabsVarZze.zze) * 1000000) / ((long) this.zzl.zzF);
                    this.zzb.zzL(0);
                    this.zzg.zzr(this.zzb, 128);
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
