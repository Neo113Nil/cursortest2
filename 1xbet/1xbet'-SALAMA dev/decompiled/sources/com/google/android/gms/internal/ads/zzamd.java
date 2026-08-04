package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class zzamd implements zzaly {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzanp zzb;
    private zzamc zzg;
    private long zzh;
    private String zzi;
    private zzaeb zzj;
    private boolean zzk;
    private final boolean[] zzd = new boolean[4];
    private final zzamb zze = new zzamb(128);
    private long zzl = -9223372036854775807L;
    private final zzamq zzf = new zzamq(178, 128);
    private final zzed zzc = new zzed();

    public zzamd(zzanp zzanpVar, String str) {
        this.zzb = zzanpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zza(zzed zzedVar) {
        int i7;
        int i8 = 3;
        zzcv.zzb(this.zzg);
        zzcv.zzb(this.zzj);
        int iZzd = zzedVar.zzd();
        int iZze = zzedVar.zze();
        byte[] bArrZzN = zzedVar.zzN();
        this.zzh += (long) zzedVar.zzb();
        this.zzj.zzr(zzedVar, zzedVar.zzb());
        while (true) {
            int iZza = zzfj.zza(bArrZzN, iZzd, iZze, this.zzd);
            if (iZza == iZze) {
                break;
            }
            int i9 = iZza + 3;
            int i10 = zzedVar.zzN()[i9] & 255;
            int i11 = iZza - iZzd;
            if (!this.zzk) {
                if (i11 > 0) {
                    this.zze.zza(bArrZzN, iZzd, iZza);
                }
                if (this.zze.zzc(i10, i11 < 0 ? -i11 : 0)) {
                    zzaeb zzaebVar = this.zzj;
                    zzamb zzambVar = this.zze;
                    int i12 = zzambVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(zzambVar.zzc, zzambVar.zza);
                    zzec zzecVar = new zzec(bArrCopyOf, bArrCopyOf.length);
                    zzecVar.zzo(i12);
                    zzecVar.zzo(4);
                    zzecVar.zzm();
                    zzecVar.zzn(8);
                    if (zzecVar.zzp()) {
                        zzecVar.zzn(4);
                        zzecVar.zzn(i8);
                    }
                    int iZzd2 = zzecVar.zzd(4);
                    float f7 = 1.0f;
                    if (iZzd2 == 15) {
                        int iZzd3 = zzecVar.zzd(8);
                        int iZzd4 = zzecVar.zzd(8);
                        if (iZzd4 == 0) {
                            zzdq.zzf("H263Reader", "Invalid aspect ratio");
                        } else {
                            f7 = iZzd3 / iZzd4;
                        }
                    } else if (iZzd2 < 7) {
                        f7 = zza[iZzd2];
                    } else {
                        zzdq.zzf("H263Reader", "Invalid aspect ratio");
                    }
                    float f8 = f7;
                    if (zzecVar.zzp()) {
                        zzecVar.zzn(2);
                        zzecVar.zzn(1);
                        if (zzecVar.zzp()) {
                            zzecVar.zzn(15);
                            zzecVar.zzm();
                            zzecVar.zzn(15);
                            zzecVar.zzm();
                            zzecVar.zzn(15);
                            zzecVar.zzm();
                            zzecVar.zzn(3);
                            zzecVar.zzn(11);
                            zzecVar.zzm();
                            zzecVar.zzn(15);
                            zzecVar.zzm();
                        }
                    }
                    if (zzecVar.zzd(2) != 0) {
                        zzdq.zzf("H263Reader", "Unhandled video object layer shape");
                    }
                    zzecVar.zzm();
                    int iZzd5 = zzecVar.zzd(16);
                    zzecVar.zzm();
                    if (zzecVar.zzp()) {
                        if (iZzd5 == 0) {
                            zzdq.zzf("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i13 = iZzd5 - 1;
                            int i14 = 0;
                            while (i13 > 0) {
                                i13 >>= 1;
                                i14++;
                            }
                            zzecVar.zzn(i14);
                        }
                    }
                    zzecVar.zzm();
                    int iZzd6 = zzecVar.zzd(13);
                    zzecVar.zzm();
                    int iZzd7 = zzecVar.zzd(13);
                    zzecVar.zzm();
                    zzecVar.zzm();
                    zzx zzxVar = new zzx();
                    zzxVar.zzO(str);
                    zzxVar.zzE("video/mp2t");
                    zzxVar.zzad("video/mp4v-es");
                    zzxVar.zzai(iZzd6);
                    zzxVar.zzM(iZzd7);
                    zzxVar.zzZ(f8);
                    zzxVar.zzP(Collections.singletonList(bArrCopyOf));
                    zzaebVar.zzm(zzxVar.zzaj());
                    this.zzk = true;
                }
            }
            this.zzg.zza(bArrZzN, iZzd, iZza);
            zzamq zzamqVar = this.zzf;
            if (i11 > 0) {
                zzamqVar.zza(bArrZzN, iZzd, iZza);
                i7 = 0;
            } else {
                i7 = -i11;
            }
            if (this.zzf.zzd(i7)) {
                zzamq zzamqVar2 = this.zzf;
                int iZzc = zzfj.zzc(zzamqVar2.zza, zzamqVar2.zzb);
                zzed zzedVar2 = this.zzc;
                int i15 = zzen.zza;
                zzedVar2.zzJ(this.zzf.zza, iZzc);
                this.zzb.zza(this.zzl, this.zzc);
            }
            if (i10 == 178) {
                if (zzedVar.zzN()[iZza + 2] == 1) {
                    this.zzf.zzc(178);
                }
                i10 = 178;
            }
            int i16 = iZze - iZza;
            this.zzg.zzb(this.zzh - ((long) i16), i16, this.zzk);
            this.zzg.zzc(i10, this.zzl);
            iZzd = i9;
            i8 = 3;
        }
        if (!this.zzk) {
            this.zze.zza(bArrZzN, iZzd, iZze);
        }
        this.zzg.zza(bArrZzN, iZzd, iZze);
        this.zzf.zza(bArrZzN, iZzd, iZze);
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzb(zzacy zzacyVar, zzanm zzanmVar) {
        zzanmVar.zzc();
        this.zzi = zzanmVar.zzb();
        zzaeb zzaebVarZzw = zzacyVar.zzw(zzanmVar.zza(), 2);
        this.zzj = zzaebVarZzw;
        this.zzg = new zzamc(zzaebVarZzw);
        this.zzb.zzb(zzacyVar, zzanmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzc(boolean z4) {
        zzcv.zzb(this.zzg);
        if (z4) {
            this.zzg.zzb(this.zzh, 0, this.zzk);
            this.zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzd(long j, int i7) {
        this.zzl = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zze() {
        zzfj.zzi(this.zzd);
        this.zze.zzb();
        zzamc zzamcVar = this.zzg;
        if (zzamcVar != null) {
            zzamcVar.zzd();
        }
        this.zzf.zzb();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }
}
