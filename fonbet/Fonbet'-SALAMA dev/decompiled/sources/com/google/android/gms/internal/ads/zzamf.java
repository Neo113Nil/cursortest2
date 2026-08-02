package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01bd A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzed zzedVar) {
        int i7;
        int i8;
        zzcv.zzb(this.zzi);
        int i9 = zzen.zza;
        int zzd = zzedVar.zzd();
        int zze = zzedVar.zze();
        byte[] zzN = zzedVar.zzN();
        this.zzf += zzedVar.zzb();
        this.zzi.zzr(zzedVar, zzedVar.zzb());
        while (true) {
            int zza = zzfj.zza(zzN, zzd, zze, this.zzg);
            if (zza == zze) {
                zzf(zzN, zzd, zze);
                return;
            }
            int i10 = zza + 3;
            int i11 = zzN[i10] & 31;
            int i12 = zza - zzd;
            if (i12 > 0) {
                zzf(zzN, zzd, zza);
            }
            int i13 = zze - zza;
            long j = this.zzf - i13;
            int i14 = i12 < 0 ? -i12 : 0;
            long j3 = this.zzl;
            if (!this.zzk) {
                this.zzc.zzd(i14);
                this.zzd.zzd(i14);
                if (this.zzk) {
                    i7 = zze;
                    i8 = i10;
                    zzamq zzamqVar = this.zzc;
                    if (zzamqVar.zze()) {
                        zzfi zzg = zzfj.zzg(zzamqVar.zza, 4, zzamqVar.zzb);
                        this.zza.zzf(zzg.zzm);
                        this.zzj.zzc(zzg);
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
                    zzfi zzg2 = zzfj.zzg(zzamqVar5.zza, 4, zzamqVar5.zzb);
                    zzamq zzamqVar6 = this.zzd;
                    zzfh zzf = zzfj.zzf(zzamqVar6.zza, 4, zzamqVar6.zzb);
                    i8 = i10;
                    String zzc = zzda.zzc(zzg2.zza, zzg2.zzb, zzg2.zzc);
                    zzaeb zzaebVar = this.zzi;
                    zzx zzxVar = new zzx();
                    i7 = zze;
                    zzxVar.zzO(this.zzh);
                    zzxVar.zzE(this.zzb);
                    zzxVar.zzad("video/avc");
                    zzxVar.zzC(zzc);
                    zzxVar.zzai(zzg2.zze);
                    zzxVar.zzM(zzg2.zzf);
                    zzi zziVar = new zzi();
                    zziVar.zzc(zzg2.zzj);
                    zziVar.zzb(zzg2.zzk);
                    zziVar.zzd(zzg2.zzl);
                    zziVar.zzf(zzg2.zzh + 8);
                    zziVar.zza(zzg2.zzi + 8);
                    zzxVar.zzD(zziVar.zzg());
                    zzxVar.zzZ(zzg2.zzg);
                    zzxVar.zzP(arrayList);
                    zzxVar.zzU(zzg2.zzm);
                    zzaebVar.zzm(zzxVar.zzaj());
                    this.zzk = true;
                    this.zza.zzf(zzg2.zzm);
                    this.zzj.zzc(zzg2);
                    this.zzj.zzb(zzf);
                    this.zzc.zzb();
                    this.zzd.zzb();
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
                if (this.zzk) {
                    this.zzc.zzc(i11);
                    this.zzd.zzc(i11);
                }
                this.zze.zzc(i11);
                this.zzj.zze(j, i11, j7, this.zzm);
                zzd = i8;
                zze = i7;
            }
            i7 = zze;
            i8 = i10;
            if (this.zze.zzd(i14)) {
            }
            if (this.zzj.zzf(j, i13, this.zzk)) {
            }
            long j72 = this.zzl;
            if (this.zzk) {
            }
            this.zze.zzc(i11);
            this.zzj.zze(j, i11, j72, this.zzm);
            zzd = i8;
            zze = i7;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzb(zzacy zzacyVar, zzanm zzanmVar) {
        zzanmVar.zzc();
        this.zzh = zzanmVar.zzb();
        zzaeb zzw = zzacyVar.zzw(zzanmVar.zza(), 2);
        this.zzi = zzw;
        this.zzj = new zzame(zzw, false, false);
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
