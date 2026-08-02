package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.math.RoundingMode;

/* loaded from: classes.dex */
final class zzanq implements zzanr {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzacy zzc;
    private final zzaeb zzd;
    private final zzanu zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzed zzh;
    private final int zzi;
    private final zzz zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzanq(zzacy zzacyVar, zzaeb zzaebVar, zzanu zzanuVar) {
        this.zzc = zzacyVar;
        this.zzd = zzaebVar;
        this.zze = zzanuVar;
        int max = Math.max(1, zzanuVar.zzc / 10);
        this.zzi = max;
        zzed zzedVar = new zzed(zzanuVar.zzf);
        zzedVar.zzk();
        int zzk = zzedVar.zzk();
        this.zzf = zzk;
        int i7 = zzanuVar.zzb;
        int i8 = zzanuVar.zzd;
        int q7 = AbstractC0486a1.q(i8 - (i7 * 4), 8, zzanuVar.zze * i7, 1);
        if (zzk != q7) {
            throw zzaz.zza("Expected frames per block: " + q7 + "; got: " + zzk, null);
        }
        int i9 = zzen.zza;
        int i10 = ((max + zzk) - 1) / zzk;
        this.zzg = new byte[i8 * i10];
        this.zzh = new zzed((zzk + zzk) * i7 * i10);
        int i11 = ((zzanuVar.zzc * zzanuVar.zzd) * 8) / zzk;
        zzx zzxVar = new zzx();
        zzxVar.zzad("audio/raw");
        zzxVar.zzA(i11);
        zzxVar.zzY(i11);
        zzxVar.zzT((max + max) * i7);
        zzxVar.zzB(zzanuVar.zzb);
        zzxVar.zzae(zzanuVar.zzc);
        zzxVar.zzX(2);
        this.zzj = zzxVar.zzaj();
    }

    private final int zzd(int i7) {
        int i8 = this.zze.zzb;
        return i7 / (i8 + i8);
    }

    private final int zze(int i7) {
        return (i7 + i7) * this.zze.zzb;
    }

    private final void zzf(int i7) {
        long zzu = this.zzl + zzen.zzu(this.zzn, 1000000L, this.zze.zzc, RoundingMode.DOWN);
        int zze = zze(i7);
        this.zzd.zzt(zzu, 1, zze, this.zzm - zze, null);
        this.zzn += i7;
        this.zzm -= zze;
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public final void zza(int i7, long j) {
        zzanx zzanxVar = new zzanx(this.zze, this.zzf, i7, j);
        this.zzc.zzP(zzanxVar);
        this.zzd.zzm(this.zzj);
        this.zzd.zzl(zzanxVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public final void zzb(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003c -> B:3:0x0021). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzanr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(zzacw zzacwVar, long j) {
        boolean z4;
        int i7;
        int zzd;
        int zzd2 = this.zzi - zzd(this.zzm);
        int i8 = zzen.zza;
        int i9 = (((zzd2 + r3) - 1) / this.zzf) * this.zze.zzd;
        int i10 = 1;
        if (j != 0) {
            z4 = false;
            while (!z4) {
                if (this.zzk >= i9) {
                    break;
                }
                int zza2 = zzacwVar.zza(this.zzg, this.zzk, (int) Math.min(i9 - r8, j));
                if (zza2 != -1) {
                    this.zzk += zza2;
                }
            }
            i7 = this.zzk / this.zze.zzd;
            if (i7 > 0) {
                byte[] bArr = this.zzg;
                zzed zzedVar = this.zzh;
                for (int i11 = 0; i11 < i7; i11 += i10) {
                    int i12 = 0;
                    while (true) {
                        zzanu zzanuVar = this.zze;
                        int i13 = zzanuVar.zzb;
                        if (i12 < i13) {
                            byte[] zzN = zzedVar.zzN();
                            int i14 = zzanuVar.zzd;
                            int i15 = i11 * i14;
                            int i16 = (i14 / i13) - 4;
                            int i17 = (i12 * 4) + i15;
                            int i18 = bArr[i17 + 1] & 255;
                            int i19 = bArr[i17] & 255;
                            int min = Math.min(bArr[i17 + 2] & 255, 88);
                            int i20 = zzb[min];
                            int i21 = (this.zzf * i11 * i13) + i12;
                            int i22 = (short) ((i18 << 8) | i19);
                            int i23 = i21 + i21;
                            zzN[i23] = (byte) (i22 & 255);
                            zzN[i23 + 1] = (byte) (i22 >> 8);
                            int i24 = 0;
                            while (i24 < i16 + i16) {
                                byte b7 = bArr[((i24 / 8) * i13 * 4) + (i13 * 4) + i17 + ((i24 / 2) % 4)];
                                byte[] bArr2 = bArr;
                                int i25 = i24 % 2 == 0 ? b7 & 15 : (b7 & 255) >> 4;
                                int i26 = i25 & 7;
                                int i27 = (((i26 + i26) + 1) * i20) >> 3;
                                if ((i25 & 8) != 0) {
                                    i27 = -i27;
                                }
                                i22 = Math.max(-32768, Math.min(i22 + i27, 32767));
                                i23 += i13 + i13;
                                zzN[i23] = (byte) (i22 & 255);
                                zzN[i23 + 1] = (byte) (i22 >> 8);
                                int max = Math.max(0, Math.min(min + zza[i25], 88));
                                i20 = zzb[max];
                                i24++;
                                min = max;
                                bArr = bArr2;
                            }
                            i12++;
                            i10 = 1;
                        }
                    }
                }
                int zze = zze(this.zzf * i7);
                zzedVar.zzL(0);
                zzedVar.zzK(zze);
                this.zzk -= i7 * this.zze.zzd;
                zzed zzedVar2 = this.zzh;
                zzaeb zzaebVar = this.zzd;
                int zze2 = zzedVar2.zze();
                zzaebVar.zzr(zzedVar2, zze2);
                int i28 = this.zzm + zze2;
                this.zzm = i28;
                int zzd3 = zzd(i28);
                int i29 = this.zzi;
                if (zzd3 >= i29) {
                    zzf(i29);
                }
            }
            if (z4 && (zzd = zzd(this.zzm)) > 0) {
                zzf(zzd);
            }
            return z4;
        }
        z4 = true;
        while (!z4) {
        }
        i7 = this.zzk / this.zze.zzd;
        if (i7 > 0) {
        }
        if (z4) {
            zzf(zzd);
        }
        return z4;
    }
}
