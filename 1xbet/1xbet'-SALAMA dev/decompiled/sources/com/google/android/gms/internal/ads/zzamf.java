package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzamf implements zzaly {
    private final zzanc zza;
    private long zzf;
    private String zzh;
    private zzaeb zzi;
    private zzame zzj;
    private boolean zzk;
    private boolean zzm;
    private final String zzb = "video/mp2t";
    private final boolean[] zzg = new boolean[3];
    private final zzamq zzc = new zzamq(7, 128);
    private final zzamq zzd = new zzamq(8, 128);
    private final zzamq zze = new zzamq(6, 128);
    private long zzl = -9223372036854775807L;
    private final zzed zzn = new zzed();

    public zzamf(zzanc zzancVar, boolean z4, boolean z7, String str) {
        this.zza = zzancVar;
    }

    private final void zzf(byte[] bArr, int i7, int i8) {
        if (!this.zzk) {
            this.zzc.zza(bArr, i7, i8);
            this.zzd.zza(bArr, i7, i8);
        }
        this.zze.zza(bArr, i7, i8);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zza(zzed zzedVar) {
        int i7;
        int i8;
        zzcv.zzb(this.zzi);
        int i9 = zzen.zza;
        int iZzd = zzedVar.zzd();
        int iZze = zzedVar.zze();
        byte[] bArrZzN = zzedVar.zzN();
        this.zzf += (long) zzedVar.zzb();
        this.zzi.zzr(zzedVar, zzedVar.zzb());
        while (true) {
            int iZza = zzfj.zza(bArrZzN, iZzd, iZze, this.zzg);
            if (iZza == iZze) {
                zzf(bArrZzN, iZzd, iZze);
                return;
            }
            int i10 = iZza + 3;
            int i11 = bArrZzN[i10] & 31;
            int i12 = iZza - iZzd;
            if (i12 > 0) {
                zzf(bArrZzN, iZzd, iZza);
            }
            int i13 = iZze - iZza;
            long j = this.zzf - ((long) i13);
            int i14 = i12 < 0 ? -i12 : 0;
            long j3 = this.zzl;
            if (this.zzk) {
                i7 = iZze;
                i8 = i10;
            } else {
                this.zzc.zzd(i14);
                this.zzd.zzd(i14);
                if (this.zzk) {
                    i7 = iZze;
                    i8 = i10;
                    zzamq zzamqVar = this.zzc;
                    if (zzamqVar.zze()) {
                        zzfi zzfiVarZzg = zzfj.zzg(zzamqVar.zza, 4, zzamqVar.zzb);
                        this.zza.zzf(zzfiVarZzg.zzm);
                        this.zzj.zzc(zzfiVarZzg);
                        this.zzc.zzb();
                    } else {
                        zzamq zzamqVar2 = this.zzd;
                        if (zzamqVar2.zze()) {
                            this.zzj.zzb(zzfj.zzf(zzamqVar2.zza, 4, zzamqVar2.zzb));
                            this.zzd.zzb();
                        }
                    }
                } else if (this.zzc.zze() && this.zzd.zze()) {
                    ArrayList arrayList = new ArrayList();
                    zzamq zzamqVar3 = this.zzc;
                    arrayList.add(Arrays.copyOf(zzamqVar3.zza, zzamqVar3.zzb));
                    zzamq zzamqVar4 = this.zzd;
                    arrayList.add(Arrays.copyOf(zzamqVar4.zza, zzamqVar4.zzb));
                    zzamq zzamqVar5 = this.zzc;
                    zzfi zzfiVarZzg2 = zzfj.zzg(zzamqVar5.zza, 4, zzamqVar5.zzb);
                    zzamq zzamqVar6 = this.zzd;
                    zzfh zzfhVarZzf = zzfj.zzf(zzamqVar6.zza, 4, zzamqVar6.zzb);
                    i8 = i10;
                    String strZzc = zzda.zzc(zzfiVarZzg2.zza, zzfiVarZzg2.zzb, zzfiVarZzg2.zzc);
                    zzaeb zzaebVar = this.zzi;
                    zzx zzxVar = new zzx();
                    i7 = iZze;
                    zzxVar.zzO(this.zzh);
                    zzxVar.zzE(this.zzb);
                    zzxVar.zzad("video/avc");
                    zzxVar.zzC(strZzc);
                    zzxVar.zzai(zzfiVarZzg2.zze);
                    zzxVar.zzM(zzfiVarZzg2.zzf);
                    zzi zziVar = new zzi();
                    zziVar.zzc(zzfiVarZzg2.zzj);
                    zziVar.zzb(zzfiVarZzg2.zzk);
                    zziVar.zzd(zzfiVarZzg2.zzl);
                    zziVar.zzf(zzfiVarZzg2.zzh + 8);
                    zziVar.zza(zzfiVarZzg2.zzi + 8);
                    zzxVar.zzD(zziVar.zzg());
                    zzxVar.zzZ(zzfiVarZzg2.zzg);
                    zzxVar.zzP(arrayList);
                    zzxVar.zzU(zzfiVarZzg2.zzm);
                    zzaebVar.zzm(zzxVar.zzaj());
                    this.zzk = true;
                    this.zza.zzf(zzfiVarZzg2.zzm);
                    this.zzj.zzc(zzfiVarZzg2);
                    this.zzj.zzb(zzfhVarZzf);
                    this.zzc.zzb();
                    this.zzd.zzb();
                } else {
                    i7 = iZze;
                    i8 = i10;
                }
            }
            if (this.zze.zzd(i14)) {
                zzamq zzamqVar7 = this.zze;
                this.zzn.zzJ(this.zze.zza, zzfj.zzc(zzamqVar7.zza, zzamqVar7.zzb));
                this.zzn.zzL(4);
                this.zza.zzc(j3, this.zzn);
            }
            if (this.zzj.zzf(j, i13, this.zzk)) {
                this.zzm = false;
            }
            long j7 = this.zzl;
            if (!this.zzk) {
                this.zzc.zzc(i11);
                this.zzd.zzc(i11);
            }
            this.zze.zzc(i11);
            this.zzj.zze(j, i11, j7, this.zzm);
            iZzd = i8;
            iZze = i7;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzb(zzacy zzacyVar, zzanm zzanmVar) {
        zzanmVar.zzc();
        this.zzh = zzanmVar.zzb();
        zzaeb zzaebVarZzw = zzacyVar.zzw(zzanmVar.zza(), 2);
        this.zzi = zzaebVarZzw;
        this.zzj = new zzame(zzaebVarZzw, false, false);
        this.zza.zzd(zzacyVar, zzanmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzc(boolean z4) {
        zzcv.zzb(this.zzi);
        int i7 = zzen.zza;
        if (z4) {
            this.zza.zze();
            this.zzj.zza(this.zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzd(long j, int i7) {
        this.zzl = j;
        int i8 = i7 & 2;
        this.zzm = (i8 != 0) | this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zze() {
        this.zzf = 0L;
        this.zzm = false;
        this.zzl = -9223372036854775807L;
        zzfj.zzi(this.zzg);
        this.zzc.zzb();
        this.zzd.zzb();
        this.zze.zzb();
        this.zza.zzb();
        zzame zzameVar = this.zzj;
        if (zzameVar != null) {
            zzameVar.zzd();
        }
    }
}
