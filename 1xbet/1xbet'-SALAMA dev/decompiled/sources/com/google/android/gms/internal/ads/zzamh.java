package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class zzamh implements zzaly {
    private final zzanc zza;
    private String zzb;
    private zzaeb zzc;
    private zzamg zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzamq zzg = new zzamq(32, 128);
    private final zzamq zzh = new zzamq(33, 128);
    private final zzamq zzi = new zzamq(34, 128);
    private final zzamq zzj = new zzamq(39, 128);
    private final zzamq zzk = new zzamq(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzed zzn = new zzed();

    public zzamh(zzanc zzancVar, String str) {
        this.zza = zzancVar;
    }

    private final void zzf(byte[] bArr, int i7, int i8) {
        this.zzd.zzc(bArr, i7, i8);
        if (!this.zze) {
            this.zzg.zza(bArr, i7, i8);
            this.zzh.zza(bArr, i7, i8);
            this.zzi.zza(bArr, i7, i8);
        }
        this.zzj.zza(bArr, i7, i8);
        this.zzk.zza(bArr, i7, i8);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0160  */
    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zza(zzed zzedVar) {
        zzcv.zzb(this.zzc);
        int i7 = zzen.zza;
        while (zzedVar.zzb() > 0) {
            int iZzd = zzedVar.zzd();
            int iZze = zzedVar.zze();
            byte[] bArrZzN = zzedVar.zzN();
            this.zzl += (long) zzedVar.zzb();
            this.zzc.zzr(zzedVar, zzedVar.zzb());
            while (iZzd < iZze) {
                int iZza = zzfj.zza(bArrZzN, iZzd, iZze, this.zzf);
                if (iZza == iZze) {
                    zzf(bArrZzN, iZzd, iZze);
                    return;
                }
                int i8 = iZza + 3;
                int i9 = bArrZzN[i8] & 126;
                int i10 = iZza - iZzd;
                if (i10 > 0) {
                    zzf(bArrZzN, iZzd, iZza);
                }
                int i11 = iZze - iZza;
                long j = this.zzl - ((long) i11);
                int i12 = i10 < 0 ? -i10 : 0;
                long j3 = this.zzm;
                this.zzd.zzb(j, i11, this.zze);
                if (!this.zze) {
                    this.zzg.zzd(i12);
                    this.zzh.zzd(i12);
                    this.zzi.zzd(i12);
                    zzamq zzamqVar = this.zzg;
                    if (zzamqVar.zze()) {
                        zzamq zzamqVar2 = this.zzh;
                        if (zzamqVar2.zze()) {
                            zzamq zzamqVar3 = this.zzi;
                            if (zzamqVar3.zze()) {
                                String str = this.zzb;
                                int i13 = zzamqVar.zzb;
                                byte[] bArr = new byte[zzamqVar2.zzb + i13 + zzamqVar3.zzb];
                                System.arraycopy(zzamqVar.zza, 0, bArr, 0, i13);
                                System.arraycopy(zzamqVar2.zza, 0, bArr, zzamqVar.zzb, zzamqVar2.zzb);
                                System.arraycopy(zzamqVar3.zza, 0, bArr, zzamqVar.zzb + zzamqVar2.zzb, zzamqVar3.zzb);
                                String strZzd = null;
                                zzfd zzfdVarZzd = zzfj.zzd(zzamqVar2.zza, 3, zzamqVar2.zzb, null);
                                zzey zzeyVar = zzfdVarZzd.zzb;
                                if (zzeyVar != null) {
                                    int i14 = zzeyVar.zzf;
                                    int[] iArr = zzeyVar.zze;
                                    strZzd = zzda.zzd(zzeyVar.zza, zzeyVar.zzb, zzeyVar.zzc, zzeyVar.zzd, iArr, i14);
                                }
                                zzx zzxVar = new zzx();
                                zzxVar.zzO(str);
                                zzxVar.zzE("video/mp2t");
                                zzxVar.zzad("video/hevc");
                                zzxVar.zzC(strZzd);
                                zzxVar.zzai(zzfdVarZzd.zze);
                                zzxVar.zzM(zzfdVarZzd.zzf);
                                zzi zziVar = new zzi();
                                zziVar.zzc(zzfdVarZzd.zzi);
                                zziVar.zzb(zzfdVarZzd.zzj);
                                zziVar.zzd(zzfdVarZzd.zzk);
                                zziVar.zzf(zzfdVarZzd.zzc + 8);
                                zziVar.zza(zzfdVarZzd.zzd + 8);
                                zzxVar.zzD(zziVar.zzg());
                                zzxVar.zzZ(zzfdVarZzd.zzg);
                                zzxVar.zzU(zzfdVarZzd.zzh);
                                zzxVar.zzV(zzfdVarZzd.zza + 1);
                                zzxVar.zzP(Collections.singletonList(bArr));
                                zzz zzzVarZzaj = zzxVar.zzaj();
                                this.zzc.zzm(zzzVarZzaj);
                                zzfth.zzl(zzzVarZzaj.zzq != -1);
                                this.zza.zzf(zzzVarZzaj.zzq);
                                this.zze = true;
                            }
                        }
                    }
                }
                if (this.zzj.zzd(i12)) {
                    zzamq zzamqVar4 = this.zzj;
                    this.zzn.zzJ(this.zzj.zza, zzfj.zzc(zzamqVar4.zza, zzamqVar4.zzb));
                    this.zzn.zzM(5);
                    this.zza.zzc(j3, this.zzn);
                }
                if (this.zzk.zzd(i12)) {
                    zzamq zzamqVar5 = this.zzk;
                    this.zzn.zzJ(this.zzk.zza, zzfj.zzc(zzamqVar5.zza, zzamqVar5.zzb));
                    this.zzn.zzM(5);
                    this.zza.zzc(j3, this.zzn);
                }
                int i15 = i9 >> 1;
                this.zzd.zze(j, i11, i15, this.zzm, this.zze);
                if (!this.zze) {
                    this.zzg.zzc(i15);
                    this.zzh.zzc(i15);
                    this.zzi.zzc(i15);
                }
                this.zzj.zzc(i15);
                this.zzk.zzc(i15);
                iZzd = i8;
                iZze = iZze;
                bArrZzN = bArrZzN;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzb(zzacy zzacyVar, zzanm zzanmVar) {
        zzanmVar.zzc();
        this.zzb = zzanmVar.zzb();
        zzaeb zzaebVarZzw = zzacyVar.zzw(zzanmVar.zza(), 2);
        this.zzc = zzaebVarZzw;
        this.zzd = new zzamg(zzaebVarZzw);
        this.zza.zzd(zzacyVar, zzanmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzc(boolean z4) {
        zzcv.zzb(this.zzc);
        int i7 = zzen.zza;
        if (z4) {
            this.zza.zze();
            this.zzd.zza(this.zzl);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzd(long j, int i7) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zze() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzfj.zzi(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        this.zza.zzb();
        zzamg zzamgVar = this.zzd;
        if (zzamgVar != null) {
            zzamgVar.zzd();
        }
    }
}
