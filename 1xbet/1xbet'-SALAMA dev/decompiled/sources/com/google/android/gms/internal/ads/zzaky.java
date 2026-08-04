package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
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
        int iWidth = rect.width();
        int i10 = i9 * iWidth;
        int iHeight = rect.height();
        while (true) {
            int i11 = 0;
            do {
                int i12 = 1;
                int iZzd = 0;
                while (true) {
                    if (iZzd >= i12 || i12 > 64) {
                        i7 = iZzd & 3;
                        if (iZzd >= 4) {
                            i8 = iZzd >> 2;
                            break;
                        } else {
                            i8 = iWidth;
                            break;
                        }
                    }
                    if (zzecVar.zza() < 4) {
                        i7 = -1;
                        i8 = 0;
                        break;
                    } else {
                        iZzd = (iZzd << 4) | zzecVar.zzd(4);
                        i12 <<= 2;
                    }
                }
                int iMin = Math.min(i8, iWidth - i11);
                if (iMin > 0) {
                    int i13 = i10 + iMin;
                    Arrays.fill(iArr, i10, i13, this.zza[i7]);
                    i11 += iMin;
                    i10 = i13;
                }
            } while (i11 < iWidth);
            i9 += 2;
            if (i9 >= iHeight) {
                return;
            }
            i10 = i9 * iWidth;
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
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
        zzcl zzclVar = new zzcl();
        zzclVar.zzc(bitmapCreateBitmap);
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
        String strTrim = str.trim();
        int i8 = zzen.zza;
        for (String str2 : strTrim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] strArrSplit = str2.substring(9).split(",", -1);
                this.zzd = new int[strArrSplit.length];
                for (int i9 = 0; i9 < strArrSplit.length; i9++) {
                    int[] iArr = this.zzd;
                    try {
                        i7 = Integer.parseInt(strArrSplit[i9].trim(), 16);
                    } catch (RuntimeException unused) {
                        i7 = 0;
                    }
                    iArr[i9] = i7;
                }
            } else if (str2.startsWith("size: ")) {
                String[] strArrSplit2 = str2.substring(6).trim().split("x", -1);
                if (strArrSplit2.length == 2) {
                    try {
                        this.zze = Integer.parseInt(strArrSplit2[0]);
                        this.zzf = Integer.parseInt(strArrSplit2[1]);
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
        int iZzq = zzedVar.zzq();
        while (zzedVar.zzd() < iZzq && zzedVar.zzb() > 0) {
            int iZzm = zzedVar.zzm();
            if (iZzm != 3) {
                if (iZzm != 4) {
                    if (iZzm != 5) {
                        if (iZzm != 6 || zzedVar.zzb() < 4) {
                            return;
                        }
                        this.zzh = zzedVar.zzq();
                        this.zzi = zzedVar.zzq();
                    } else {
                        if (zzedVar.zzb() < 6) {
                            return;
                        }
                        int iZzm2 = zzedVar.zzm();
                        int iZzm3 = zzedVar.zzm();
                        int i7 = iZzm3 >> 4;
                        int iZzm4 = ((iZzm3 & 15) << 8) | zzedVar.zzm();
                        int iZzm5 = zzedVar.zzm();
                        int iZzm6 = zzedVar.zzm();
                        this.zzg = new Rect((iZzm2 << 4) | i7, (iZzm5 << 4) | (iZzm6 >> 4), iZzm4 + 1, (((iZzm6 & 15) << 8) | zzedVar.zzm()) + 1);
                    }
                } else {
                    if (zzedVar.zzb() < 2 || !this.zzc) {
                        return;
                    }
                    int iZzm7 = zzedVar.zzm();
                    int iZzm8 = zzedVar.zzm();
                    int[] iArr2 = this.zza;
                    iArr2[3] = zzf(iArr2[3], iZzm7 >> 4);
                    iArr2[2] = zzf(iArr2[2], iZzm7 & 15);
                    iArr2[1] = zzf(iArr2[1], iZzm8 >> 4);
                    iArr2[0] = zzf(iArr2[0], iZzm8 & 15);
                }
            } else {
                if (zzedVar.zzb() < 2) {
                    return;
                }
                int iZzm9 = zzedVar.zzm();
                int iZzm10 = zzedVar.zzm();
                this.zza[3] = zze(iArr, iZzm9 >> 4);
                this.zza[2] = zze(iArr, iZzm9 & 15);
                this.zza[1] = zze(iArr, iZzm10 >> 4);
                this.zza[0] = zze(iArr, iZzm10 & 15);
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
