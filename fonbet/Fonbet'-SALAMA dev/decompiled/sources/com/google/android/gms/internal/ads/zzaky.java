package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzaky {
    private boolean zzb;
    private boolean zzc;
    private int[] zzd;
    private int zze;
    private int zzf;
    private Rect zzg;
    private final int[] zza = new int[4];
    private int zzh = -1;
    private int zzi = -1;

    private static int zze(int[] iArr, int i7) {
        if (i7 >= iArr.length) {
            i7 = 0;
        }
        return iArr[i7];
    }

    private static int zzf(int i7, int i8) {
        return (i7 & 16777215) | ((i8 * 17) << 24);
    }

    private final void zzg(zzec zzecVar, boolean z4, Rect rect, int[] iArr) {
        int i7;
        int i8;
        int i9 = !z4 ? 1 : 0;
        int width = rect.width();
        int i10 = i9 * width;
        int height = rect.height();
        while (true) {
            int i11 = 0;
            do {
                int i12 = 0;
                for (int i13 = 1; i12 < i13 && i13 <= 64; i13 <<= 2) {
                    if (zzecVar.zza() < 4) {
                        i7 = -1;
                        i8 = 0;
                        break;
                    }
                    i12 = (i12 << 4) | zzecVar.zzd(4);
                }
                i7 = i12 & 3;
                i8 = i12 < 4 ? width : i12 >> 2;
                int min = Math.min(i8, width - i11);
                if (min > 0) {
                    int i14 = i10 + min;
                    Arrays.fill(iArr, i10, i14, this.zza[i7]);
                    i11 += min;
                    i10 = i14;
                }
            } while (i11 < width);
            i9 += 2;
            if (i9 >= height) {
                return;
            }
            i10 = i9 * width;
            zzecVar.zzf();
        }
    }

    public final zzcn zza(zzed zzedVar) {
        Rect rect;
        if (this.zzd == null || !this.zzb || !this.zzc || (rect = this.zzg) == null || this.zzh == -1 || this.zzi == -1 || rect.width() < 2 || this.zzg.height() < 2) {
            return null;
        }
        Rect rect2 = this.zzg;
        int[] iArr = new int[rect2.height() * rect2.width()];
        zzec zzecVar = new zzec();
        zzedVar.zzL(this.zzh);
        zzecVar.zzj(zzedVar);
        zzg(zzecVar, true, rect2, iArr);
        zzedVar.zzL(this.zzi);
        zzecVar.zzj(zzedVar);
        zzg(zzecVar, false, rect2, iArr);
        Bitmap createBitmap = Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
        zzcl zzclVar = new zzcl();
        zzclVar.zzc(createBitmap);
        zzclVar.zzh(rect2.left / this.zze);
        zzclVar.zzi(0);
        zzclVar.zze(rect2.top / this.zzf, 0);
        zzclVar.zzf(0);
        zzclVar.zzk(rect2.width() / this.zze);
        zzclVar.zzd(rect2.height() / this.zzf);
        return zzclVar.zzp();
    }

    public final void zzb(String str) {
        int i7;
        String trim = str.trim();
        int i8 = zzen.zza;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split = str2.substring(9).split(",", -1);
                this.zzd = new int[split.length];
                for (int i9 = 0; i9 < split.length; i9++) {
                    int[] iArr = this.zzd;
                    try {
                        i7 = Integer.parseInt(split[i9].trim(), 16);
                    } catch (RuntimeException unused) {
                        i7 = 0;
                    }
                    iArr[i9] = i7;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split2 = str2.substring(6).trim().split("x", -1);
                if (split2.length == 2) {
                    try {
                        this.zze = Integer.parseInt(split2[0]);
                        this.zzf = Integer.parseInt(split2[1]);
                        this.zzb = true;
                    } catch (RuntimeException e7) {
                        zzdq.zzg("VobsubParser", "Parsing IDX failed", e7);
                    }
                }
            }
        }
    }

    public final void zzc(zzed zzedVar) {
        int[] iArr = this.zzd;
        if (iArr == null || !this.zzb) {
            return;
        }
        zzedVar.zzM(zzedVar.zzq() - 2);
        int zzq = zzedVar.zzq();
        while (zzedVar.zzd() < zzq && zzedVar.zzb() > 0) {
            int zzm = zzedVar.zzm();
            if (zzm != 3) {
                if (zzm != 4) {
                    if (zzm != 5) {
                        if (zzm != 6 || zzedVar.zzb() < 4) {
                            return;
                        }
                        this.zzh = zzedVar.zzq();
                        this.zzi = zzedVar.zzq();
                    } else {
                        if (zzedVar.zzb() < 6) {
                            return;
                        }
                        int zzm2 = zzedVar.zzm();
                        int zzm3 = zzedVar.zzm();
                        int i7 = zzm3 >> 4;
                        int zzm4 = ((zzm3 & 15) << 8) | zzedVar.zzm();
                        int zzm5 = zzedVar.zzm();
                        int zzm6 = zzedVar.zzm();
                        this.zzg = new Rect((zzm2 << 4) | i7, (zzm5 << 4) | (zzm6 >> 4), zzm4 + 1, (((zzm6 & 15) << 8) | zzedVar.zzm()) + 1);
                    }
                } else {
                    if (zzedVar.zzb() < 2 || !this.zzc) {
                        return;
                    }
                    int zzm7 = zzedVar.zzm();
                    int zzm8 = zzedVar.zzm();
                    int[] iArr2 = this.zza;
                    iArr2[3] = zzf(iArr2[3], zzm7 >> 4);
                    iArr2[2] = zzf(iArr2[2], zzm7 & 15);
                    iArr2[1] = zzf(iArr2[1], zzm8 >> 4);
                    iArr2[0] = zzf(iArr2[0], zzm8 & 15);
                }
            } else {
                if (zzedVar.zzb() < 2) {
                    return;
                }
                int zzm9 = zzedVar.zzm();
                int zzm10 = zzedVar.zzm();
                this.zza[3] = zze(iArr, zzm9 >> 4);
                this.zza[2] = zze(iArr, zzm9 & 15);
                this.zza[1] = zze(iArr, zzm10 >> 4);
                this.zza[0] = zze(iArr, zzm10 & 15);
                this.zzc = true;
            }
        }
    }

    public final void zzd() {
        this.zzc = false;
        this.zzg = null;
        this.zzh = -1;
        this.zzi = -1;
    }
}
