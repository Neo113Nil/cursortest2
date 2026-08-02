package com.google.android.gms.internal.ads;

import java.util.Collections;

/* loaded from: classes.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:32:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ce  */
    @Override // com.google.android.gms.internal.ads.zzaly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzed zzedVar) {
        int i7;
        byte[] bArr;
        int i8;
        int i9;
        zzcv.zzb(this.zzc);
        int i10 = zzen.zza;
        while (zzedVar.zzb() > 0) {
            int zzd = zzedVar.zzd();
            int zze = zzedVar.zze();
            byte[] zzN = zzedVar.zzN();
            this.zzl += zzedVar.zzb();
            this.zzc.zzr(zzedVar, zzedVar.zzb());
            while (zzd < zze) {
                int zza = zzfj.zza(zzN, zzd, zze, this.zzf);
                if (zza == zze) {
                    zzf(zzN, zzd, zze);
                    return;
                }
                int i11 = zza + 3;
                int i12 = zzN[i11] & 126;
                int i13 = zza - zzd;
                if (i13 > 0) {
                    zzf(zzN, zzd, zza);
                }
                int i14 = zze - zza;
                long j = this.zzl - i14;
                int i15 = i13 < 0 ? -i13 : 0;
                long j3 = this.zzm;
                this.zzd.zzb(j, i14, this.zze);
                if (!this.zze) {
                    this.zzg.zzd(i15);
                    this.zzh.zzd(i15);
                    this.zzi.zzd(i15);
                    zzamq zzamqVar = this.zzg;
                    if (zzamqVar.zze()) {
                        zzamq zzamqVar2 = this.zzh;
                        if (zzamqVar2.zze()) {
                            zzamq zzamqVar3 = this.zzi;
                            if (zzamqVar3.zze()) {
                                String str = this.zzb;
                                i8 = i11;
                                int i16 = zzamqVar.zzb;
                                i7 = zze;
                                byte[] bArr2 = new byte[zzamqVar2.zzb + i16 + zzamqVar3.zzb];
                                bArr = zzN;
                                System.arraycopy(zzamqVar.zza, 0, bArr2, 0, i16);
                                i9 = i14;
                                System.arraycopy(zzamqVar2.zza, 0, bArr2, zzamqVar.zzb, zzamqVar2.zzb);
                                System.arraycopy(zzamqVar3.zza, 0, bArr2, zzamqVar.zzb + zzamqVar2.zzb, zzamqVar3.zzb);
                                String str2 = null;
                                zzfd zzd2 = zzfj.zzd(zzamqVar2.zza, 3, zzamqVar2.zzb, null);
                                zzey zzeyVar = zzd2.zzb;
                                if (zzeyVar != null) {
                                    int i17 = zzeyVar.zzf;
                                    int[] iArr = zzeyVar.zze;
                                    str2 = zzda.zzd(zzeyVar.zza, zzeyVar.zzb, zzeyVar.zzc, zzeyVar.zzd, iArr, i17);
                                }
                                zzx zzxVar = new zzx();
                                zzxVar.zzO(str);
                                zzxVar.zzE("video/mp2t");
                                zzxVar.zzad("video/hevc");
                                zzxVar.zzC(str2);
                                zzxVar.zzai(zzd2.zze);
                                zzxVar.zzM(zzd2.zzf);
                                zzi zziVar = new zzi();
                                zziVar.zzc(zzd2.zzi);
                                zziVar.zzb(zzd2.zzj);
                                zziVar.zzd(zzd2.zzk);
                                zziVar.zzf(zzd2.zzc + 8);
                                zziVar.zza(zzd2.zzd + 8);
                                zzxVar.zzD(zziVar.zzg());
                                zzxVar.zzZ(zzd2.zzg);
                                zzxVar.zzU(zzd2.zzh);
                                zzxVar.zzV(zzd2.zza + 1);
                                zzxVar.zzP(Collections.singletonList(bArr2));
                                zzz zzaj = zzxVar.zzaj();
                                this.zzc.zzm(zzaj);
                                zzfth.zzl(zzaj.zzq != -1);
                                this.zza.zzf(zzaj.zzq);
                                this.zze = true;
                                if (this.zzj.zzd(i15)) {
                                    zzamq zzamqVar4 = this.zzj;
                                    this.zzn.zzJ(this.zzj.zza, zzfj.zzc(zzamqVar4.zza, zzamqVar4.zzb));
                                    this.zzn.zzM(5);
                                    this.zza.zzc(j3, this.zzn);
                                }
                                if (this.zzk.zzd(i15)) {
                                    zzamq zzamqVar5 = this.zzk;
                                    this.zzn.zzJ(this.zzk.zza, zzfj.zzc(zzamqVar5.zza, zzamqVar5.zzb));
                                    this.zzn.zzM(5);
                                    this.zza.zzc(j3, this.zzn);
                                }
                                int i18 = i12 >> 1;
                                this.zzd.zze(j, i9, i18, this.zzm, this.zze);
                                if (!this.zze) {
                                    this.zzg.zzc(i18);
                                    this.zzh.zzc(i18);
                                    this.zzi.zzc(i18);
                                }
                                this.zzj.zzc(i18);
                                this.zzk.zzc(i18);
                                zzd = i8;
                                zze = i7;
                                zzN = bArr;
                            }
                        }
                    }
                }
                i7 = zze;
                bArr = zzN;
                i8 = i11;
                i9 = i14;
                if (this.zzj.zzd(i15)) {
                }
                if (this.zzk.zzd(i15)) {
                }
                int i182 = i12 >> 1;
                this.zzd.zze(j, i9, i182, this.zzm, this.zze);
                if (!this.zze) {
                }
                this.zzj.zzc(i182);
                this.zzk.zzc(i182);
                zzd = i8;
                zze = i7;
                zzN = bArr;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzb(zzacy zzacyVar, zzanm zzanmVar) {
        zzanmVar.zzc();
        this.zzb = zzanmVar.zzb();
        zzaeb zzw = zzacyVar.zzw(zzanmVar.zza(), 2);
        this.zzc = zzw;
        this.zzd = new zzamg(zzw);
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
