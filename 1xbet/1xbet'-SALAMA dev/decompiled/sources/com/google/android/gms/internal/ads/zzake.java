package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzake implements zzajs {
    private static final byte[] zza = {0, 7, 8, 15};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzajx zzg;
    private final zzajw zzh;
    private final zzakd zzi;
    private Bitmap zzj;

    public zzake(List list) {
        zzed zzedVar = new zzed((byte[]) list.get(0));
        int iZzq = zzedVar.zzq();
        int iZzq2 = zzedVar.zzq();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzajx(719, 575, 0, 719, 0, 575);
        this.zzh = new zzajw(0, zzg(), zzh(), zzi());
        this.zzi = new zzakd(iZzq, iZzq2);
    }

    private static int zzb(int i7, int i8, int i9, int i10) {
        return (i7 << 24) | (i8 << 16) | (i9 << 8) | i10;
    }

    private static zzajw zzc(zzec zzecVar, int i7) {
        int[] iArr;
        int iZzd;
        int iZzd2;
        int iZzd3;
        int iZzd4;
        int i8 = 8;
        int iZzd5 = zzecVar.zzd(8);
        zzecVar.zzn(8);
        int[] iArrZzg = zzg();
        int[] iArrZzh = zzh();
        int[] iArrZzi = zzi();
        int i9 = i7 - 2;
        while (i9 > 0) {
            int iZzd6 = zzecVar.zzd(i8);
            int iZzd7 = zzecVar.zzd(i8);
            if ((iZzd7 & 128) != 0) {
                iArr = iArrZzg;
            } else {
                iArr = (iZzd7 & 64) != 0 ? iArrZzh : iArrZzi;
            }
            if ((iZzd7 & 1) != 0) {
                iZzd3 = zzecVar.zzd(i8);
                iZzd4 = zzecVar.zzd(i8);
                iZzd = zzecVar.zzd(i8);
                iZzd2 = zzecVar.zzd(i8);
                i9 -= 6;
            } else {
                int iZzd8 = zzecVar.zzd(6) << 2;
                int iZzd9 = zzecVar.zzd(4) << 4;
                i9 -= 4;
                iZzd = zzecVar.zzd(4) << 4;
                iZzd2 = zzecVar.zzd(2) << 6;
                iZzd3 = iZzd8;
                iZzd4 = iZzd9;
            }
            if (iZzd3 == 0) {
                iZzd2 = 255;
            }
            if (iZzd3 == 0) {
                iZzd = 0;
            }
            if (iZzd3 == 0) {
                iZzd4 = 0;
            }
            double d7 = iZzd3;
            int i10 = zzen.zza;
            double d8 = iZzd4 - 128;
            double d9 = iZzd - 128;
            iArr[iZzd6] = zzb((byte) (255 - (iZzd2 & 255)), Math.max(0, Math.min((int) ((1.402d * d8) + d7), 255)), Math.max(0, Math.min((int) ((d7 - (0.34414d * d9)) - (d8 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d9 * 1.772d) + d7), 255)));
            iZzd5 = iZzd5;
            i8 = 8;
        }
        return new zzajw(iZzd5, iArrZzg, iArrZzh, iArrZzi);
    }

    private static zzajy zzd(zzec zzecVar) {
        byte[] bArr;
        int iZzd = zzecVar.zzd(16);
        zzecVar.zzn(4);
        int iZzd2 = zzecVar.zzd(2);
        boolean zZzp = zzecVar.zzp();
        zzecVar.zzn(1);
        byte[] bArr2 = zzen.zzc;
        if (iZzd2 != 1) {
            if (iZzd2 == 0) {
                int iZzd3 = zzecVar.zzd(16);
                int iZzd4 = zzecVar.zzd(16);
                if (iZzd3 > 0) {
                    bArr2 = new byte[iZzd3];
                    zzecVar.zzi(bArr2, 0, iZzd3);
                }
                if (iZzd4 > 0) {
                    bArr = new byte[iZzd4];
                    zzecVar.zzi(bArr, 0, iZzd4);
                }
            }
            return new zzajy(iZzd, zZzp, bArr2, bArr);
        }
        zzecVar.zzn(zzecVar.zzd(8) * 16);
        bArr = bArr2;
        return new zzajy(iZzd, zZzp, bArr2, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0219  */
    /* JADX WARN: Code duplicated, block: B:119:0x0228 A[LOOP:3: B:88:0x0172->B:119:0x0228, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x0222 A[SYNTHETIC] */
    private static void zze(byte[] bArr, int[] iArr, int i7, int i8, int i9, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        char c3;
        char c4;
        int iZzd;
        int i10;
        int iZzd2;
        int iZzd3;
        int i11;
        int i12;
        int iZzd4;
        zzec zzecVar = new zzec(bArr, bArr.length);
        int i13 = i8;
        int i14 = i9;
        byte[] bArrZzf = null;
        byte[] bArrZzf2 = null;
        byte[] bArrZzf3 = null;
        while (zzecVar.zza() != 0) {
            int i15 = 8;
            int iZzd5 = zzecVar.zzd(8);
            if (iZzd5 != 240) {
                int i16 = 4;
                int i17 = 1;
                int i18 = 2;
                switch (iZzd5) {
                    case 16:
                        int i19 = 1;
                        if (i7 == 3) {
                            if (bArrZzf == null) {
                                bArr3 = zzb;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArrZzf;
                            }
                        } else if (i7 != 2) {
                            bArr2 = null;
                        } else if (bArrZzf3 == null) {
                            bArr3 = zza;
                            bArr2 = bArr3;
                        } else {
                            bArr2 = bArrZzf3;
                        }
                        int i20 = i13;
                        int i21 = 0;
                        while (true) {
                            int iZzd6 = zzecVar.zzd(2);
                            if (iZzd6 != 0) {
                                iZzd = i19;
                            } else {
                                if (zzecVar.zzp()) {
                                    iZzd = zzecVar.zzd(3) + 3;
                                    iZzd6 = zzecVar.zzd(2);
                                } else {
                                    if (zzecVar.zzp()) {
                                        iZzd = i19;
                                        iZzd6 = 0;
                                    } else {
                                        int iZzd7 = zzecVar.zzd(2);
                                        if (iZzd7 == 0) {
                                            c3 = 4;
                                            c4 = '\b';
                                            i21 = i19;
                                            iZzd6 = 0;
                                            iZzd = 0;
                                        } else if (iZzd7 == i19) {
                                            c3 = 4;
                                            c4 = '\b';
                                            i21 = i21;
                                            iZzd = 2;
                                            iZzd6 = 0;
                                        } else if (iZzd7 == 2) {
                                            c3 = 4;
                                            c4 = '\b';
                                            iZzd = zzecVar.zzd(4) + 12;
                                            iZzd6 = zzecVar.zzd(2);
                                            i21 = i21;
                                        } else if (iZzd7 != 3) {
                                            iZzd6 = 0;
                                            iZzd = 0;
                                        } else {
                                            c4 = '\b';
                                            iZzd = zzecVar.zzd(8) + 29;
                                            iZzd6 = zzecVar.zzd(2);
                                            i21 = i21;
                                            c3 = 4;
                                        }
                                    }
                                    c3 = 4;
                                    c4 = '\b';
                                }
                                if (iZzd == 0 && paint != null) {
                                    int i22 = i14 + 1;
                                    float f7 = i14;
                                    if (bArr2 != 0) {
                                        iZzd6 = bArr2[iZzd6];
                                    }
                                    paint.setColor(iArr[iZzd6]);
                                    canvas.drawRect(i20, f7, i20 + iZzd, i22, paint);
                                }
                                i20 += iZzd;
                                if (i21 != 0) {
                                    zzecVar.zzf();
                                    i13 = i20;
                                } else {
                                    i21 = i21;
                                    i19 = 1;
                                }
                            }
                            c3 = 4;
                            c4 = '\b';
                            if (iZzd == 0) {
                            }
                            i20 += iZzd;
                            if (i21 != 0) {
                                zzecVar.zzf();
                                i13 = i20;
                            } else {
                                i21 = i21;
                                i19 = 1;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i7 == 3 ? bArrZzf2 == null ? zzc : bArrZzf2 : null;
                        int i23 = i13;
                        boolean z4 = false;
                        while (true) {
                            int iZzd8 = zzecVar.zzd(i16);
                            if (iZzd8 != 0) {
                                i10 = 1;
                                z4 = z4;
                            } else if (zzecVar.zzp()) {
                                if (zzecVar.zzp()) {
                                    int iZzd9 = zzecVar.zzd(i18);
                                    if (iZzd9 == 0) {
                                        i10 = 1;
                                    } else if (iZzd9 == 1) {
                                        i10 = i18;
                                    } else if (iZzd9 == i18) {
                                        iZzd2 = zzecVar.zzd(i16) + 9;
                                        iZzd3 = zzecVar.zzd(i16);
                                    } else if (iZzd9 != 3) {
                                        z4 = z4;
                                        iZzd8 = 0;
                                        i10 = 0;
                                    } else {
                                        iZzd2 = zzecVar.zzd(i15) + 25;
                                        iZzd3 = zzecVar.zzd(i16);
                                    }
                                    iZzd8 = 0;
                                } else {
                                    iZzd2 = zzecVar.zzd(i18) + i16;
                                    iZzd3 = zzecVar.zzd(i16);
                                }
                                z4 = z4;
                                i10 = iZzd2;
                                iZzd8 = iZzd3;
                            } else {
                                int iZzd10 = zzecVar.zzd(3);
                                if (iZzd10 != 0) {
                                    i10 = iZzd10 + 2;
                                    iZzd8 = 0;
                                } else {
                                    z4 = true;
                                    iZzd8 = 0;
                                    i10 = 0;
                                }
                            }
                            if (i10 == 0 || paint == null) {
                                i11 = i18;
                            } else {
                                int i24 = i14 + 1;
                                float f8 = i14;
                                if (bArr4 != 0) {
                                    iZzd8 = bArr4[iZzd8];
                                }
                                paint.setColor(iArr[iZzd8]);
                                i11 = 2;
                                canvas.drawRect(i23, f8, i23 + i10, i24, paint);
                            }
                            i23 += i10;
                            if (z4) {
                                zzecVar.zzf();
                                i13 = i23;
                            } else {
                                i18 = i11;
                                z4 = z4;
                                i16 = 4;
                                i15 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i25 = i13;
                        int i26 = 0;
                        while (true) {
                            int iZzd11 = zzecVar.zzd(8);
                            if (iZzd11 != 0) {
                                i12 = i26;
                                iZzd4 = i17;
                            } else if (zzecVar.zzp()) {
                                i12 = i26;
                                iZzd4 = zzecVar.zzd(7);
                                iZzd11 = zzecVar.zzd(8);
                            } else {
                                int iZzd12 = zzecVar.zzd(7);
                                if (iZzd12 != 0) {
                                    i12 = i26;
                                    iZzd4 = iZzd12;
                                    iZzd11 = 0;
                                } else {
                                    i12 = i17;
                                    iZzd11 = 0;
                                    iZzd4 = 0;
                                }
                            }
                            if (iZzd4 != 0 && paint != null) {
                                paint.setColor(iArr[iZzd11]);
                                canvas.drawRect(i25, i14, i25 + iZzd4, i14 + 1, paint);
                            }
                            i25 += iZzd4;
                            if (i12 != 0) {
                                i13 = i25;
                            } else {
                                i17 = i17;
                                i26 = i12;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iZzd5) {
                            case 32:
                                bArrZzf3 = zzf(4, 4, zzecVar);
                                break;
                            case 33:
                                bArrZzf = zzf(4, 8, zzecVar);
                                break;
                            case 34:
                                bArrZzf2 = zzf(16, 8, zzecVar);
                                break;
                        }
                        break;
                }
            } else {
                i14 += 2;
                i13 = i8;
            }
        }
    }

    private static byte[] zzf(int i7, int i8, zzec zzecVar) {
        byte[] bArr = new byte[i7];
        for (int i9 = 0; i9 < i7; i9++) {
            bArr[i9] = (byte) zzecVar.zzd(i8);
        }
        return bArr;
    }

    private static int[] zzg() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] zzh() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i7 = 1; i7 < 16; i7++) {
            int i8 = i7 & 4;
            int i9 = i7 & 2;
            int i10 = i7 & 1;
            if (i7 < 8) {
                iArr[i7] = zzb(255, 1 != i10 ? 0 : 255, i9 != 0 ? 255 : 0, i8 != 0 ? 255 : 0);
            } else {
                iArr[i7] = zzb(255, 1 != i10 ? 0 : 127, i9 != 0 ? 127 : 0, i8 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] zzi() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i7 = 0; i7 < 256; i7++) {
            if (i7 < 8) {
                iArr[i7] = zzb(63, 1 != (i7 & 1) ? 0 : 255, (i7 & 2) != 0 ? 255 : 0, (i7 & 4) == 0 ? 0 : 255);
            } else {
                int i8 = i7 & 136;
                if (i8 == 0) {
                    iArr[i7] = zzb(255, (1 != (i7 & 1) ? 0 : 85) + ((i7 & 16) != 0 ? 170 : 0), ((i7 & 2) != 0 ? 85 : 0) + ((i7 & 32) != 0 ? 170 : 0), ((i7 & 4) == 0 ? 0 : 85) + ((i7 & 64) == 0 ? 0 : 170));
                } else if (i8 == 8) {
                    iArr[i7] = zzb(127, (1 != (i7 & 1) ? 0 : 85) + ((i7 & 16) != 0 ? 170 : 0), ((i7 & 2) != 0 ? 85 : 0) + ((i7 & 32) != 0 ? 170 : 0), ((i7 & 4) == 0 ? 0 : 85) + ((i7 & 64) == 0 ? 0 : 170));
                } else if (i8 == 128) {
                    iArr[i7] = zzb(255, (1 != (i7 & 1) ? 0 : 43) + 127 + ((i7 & 16) != 0 ? 85 : 0), ((i7 & 2) != 0 ? 43 : 0) + 127 + ((i7 & 32) != 0 ? 85 : 0), ((i7 & 4) == 0 ? 0 : 43) + 127 + ((i7 & 64) == 0 ? 0 : 85));
                } else if (i8 == 136) {
                    iArr[i7] = zzb(255, (1 != (i7 & 1) ? 0 : 43) + ((i7 & 16) != 0 ? 85 : 0), ((i7 & 2) != 0 ? 43 : 0) + ((i7 & 32) != 0 ? 85 : 0), ((i7 & 4) == 0 ? 0 : 43) + ((i7 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final void zza(byte[] bArr, int i7, int i8, zzajr zzajrVar, zzdd zzddVar) {
        zzajk zzajkVar;
        char c3;
        char c4;
        int i9;
        zzakb zzakbVar;
        int i10;
        int iZzd;
        int iZzd2;
        int iZzd3;
        int iZzd4;
        int i11;
        int iZzd5;
        zzec zzecVar = new zzec(bArr, i7 + i8);
        zzecVar.zzl(i7);
        while (zzecVar.zza() >= 48 && zzecVar.zzd(8) == 15) {
            zzakd zzakdVar = this.zzi;
            int iZzd6 = zzecVar.zzd(8);
            int iZzd7 = zzecVar.zzd(16);
            int iZzd8 = zzecVar.zzd(16);
            int iZzb = zzecVar.zzb() + iZzd8;
            if (iZzd8 * 8 > zzecVar.zza()) {
                zzdq.zzf("DvbParser", "Data field length exceeds limit");
                zzecVar.zzn(zzecVar.zza());
            } else {
                switch (iZzd6) {
                    case 16:
                        if (iZzd7 == zzakdVar.zza) {
                            zzajz zzajzVar = zzakdVar.zzi;
                            int iZzd9 = zzecVar.zzd(8);
                            int iZzd10 = zzecVar.zzd(4);
                            int iZzd11 = zzecVar.zzd(2);
                            zzecVar.zzn(2);
                            SparseArray sparseArray = new SparseArray();
                            for (int i12 = iZzd8 - 2; i12 > 0; i12 -= 6) {
                                int iZzd12 = zzecVar.zzd(8);
                                zzecVar.zzn(8);
                                sparseArray.put(iZzd12, new zzaka(zzecVar.zzd(16), zzecVar.zzd(16)));
                            }
                            zzajz zzajzVar2 = new zzajz(iZzd9, iZzd10, iZzd11, sparseArray);
                            if (zzajzVar2.zzb != 0) {
                                zzakdVar.zzi = zzajzVar2;
                                zzakdVar.zzc.clear();
                                zzakdVar.zzd.clear();
                                zzakdVar.zze.clear();
                            } else if (zzajzVar != null) {
                                if (zzajzVar.zza != zzajzVar2.zza) {
                                    zzakdVar.zzi = zzajzVar2;
                                }
                            }
                        }
                        break;
                    case 17:
                        zzajz zzajzVar3 = zzakdVar.zzi;
                        if (iZzd7 == zzakdVar.zza && zzajzVar3 != null) {
                            int iZzd13 = zzecVar.zzd(8);
                            zzecVar.zzn(4);
                            boolean zZzp = zzecVar.zzp();
                            zzecVar.zzn(3);
                            int iZzd14 = zzecVar.zzd(16);
                            int iZzd15 = zzecVar.zzd(16);
                            int iZzd16 = zzecVar.zzd(3);
                            int iZzd17 = zzecVar.zzd(3);
                            zzecVar.zzn(2);
                            int iZzd18 = zzecVar.zzd(8);
                            int iZzd19 = zzecVar.zzd(8);
                            int iZzd20 = zzecVar.zzd(4);
                            int iZzd21 = zzecVar.zzd(2);
                            zzecVar.zzn(2);
                            int i13 = iZzd8 - 10;
                            SparseArray sparseArray2 = new SparseArray();
                            while (i13 > 0) {
                                int iZzd22 = zzecVar.zzd(16);
                                int iZzd23 = zzecVar.zzd(2);
                                int iZzd24 = zzecVar.zzd(2);
                                int iZzd25 = zzecVar.zzd(12);
                                zzecVar.zzn(4);
                                int iZzd26 = zzecVar.zzd(12);
                                int i14 = i13 - 6;
                                if (iZzd23 == 1) {
                                    i13 -= 8;
                                    i10 = iZzd23;
                                    iZzd = zzecVar.zzd(8);
                                    iZzd2 = zzecVar.zzd(8);
                                } else if (iZzd23 == 2) {
                                    iZzd23 = 2;
                                    i13 -= 8;
                                    i10 = iZzd23;
                                    iZzd = zzecVar.zzd(8);
                                    iZzd2 = zzecVar.zzd(8);
                                } else {
                                    i10 = iZzd23;
                                    i13 = i14;
                                    iZzd = 0;
                                    iZzd2 = 0;
                                }
                                sparseArray2.put(iZzd22, new zzakc(i10, iZzd24, iZzd25, iZzd26, iZzd, iZzd2));
                            }
                            zzakb zzakbVar2 = new zzakb(iZzd13, zZzp, iZzd14, iZzd15, iZzd16, iZzd17, iZzd18, iZzd19, iZzd20, iZzd21, sparseArray2);
                            if (zzajzVar3.zzb == 0 && (zzakbVar = (zzakb) zzakdVar.zzc.get(zzakbVar2.zza)) != null) {
                                int i15 = 0;
                                while (true) {
                                    SparseArray sparseArray3 = zzakbVar.zzj;
                                    if (i15 < sparseArray3.size()) {
                                        zzakbVar2.zzj.put(sparseArray3.keyAt(i15), (zzakc) sparseArray3.valueAt(i15));
                                        i15++;
                                    }
                                }
                            }
                            zzakdVar.zzc.put(zzakbVar2.zza, zzakbVar2);
                        }
                        break;
                    case 18:
                        if (iZzd7 == zzakdVar.zza) {
                            zzajw zzajwVarZzc = zzc(zzecVar, iZzd8);
                            zzakdVar.zzd.put(zzajwVarZzc.zza, zzajwVarZzc);
                        } else if (iZzd7 == zzakdVar.zzb) {
                            zzajw zzajwVarZzc2 = zzc(zzecVar, iZzd8);
                            zzakdVar.zzf.put(zzajwVarZzc2.zza, zzajwVarZzc2);
                        }
                        break;
                    case 19:
                        if (iZzd7 == zzakdVar.zza) {
                            zzajy zzajyVarZzd = zzd(zzecVar);
                            zzakdVar.zze.put(zzajyVarZzd.zza, zzajyVarZzd);
                        } else if (iZzd7 == zzakdVar.zzb) {
                            zzajy zzajyVarZzd2 = zzd(zzecVar);
                            zzakdVar.zzg.put(zzajyVarZzd2.zza, zzajyVarZzd2);
                        }
                        break;
                    case 20:
                        if (iZzd7 == zzakdVar.zza) {
                            zzecVar.zzn(4);
                            boolean zZzp2 = zzecVar.zzp();
                            zzecVar.zzn(3);
                            int iZzd27 = zzecVar.zzd(16);
                            int iZzd28 = zzecVar.zzd(16);
                            if (zZzp2) {
                                int iZzd29 = zzecVar.zzd(16);
                                iZzd3 = zzecVar.zzd(16);
                                iZzd5 = zzecVar.zzd(16);
                                iZzd4 = zzecVar.zzd(16);
                                i11 = iZzd29;
                            } else {
                                iZzd3 = iZzd27;
                                iZzd4 = iZzd28;
                                i11 = 0;
                                iZzd5 = 0;
                            }
                            zzakdVar.zzh = new zzajx(iZzd27, iZzd28, i11, iZzd3, iZzd5, iZzd4);
                        }
                        break;
                }
                zzecVar.zzo(iZzb - zzecVar.zzb());
            }
        }
        zzakd zzakdVar2 = this.zzi;
        zzajz zzajzVar4 = zzakdVar2.zzi;
        if (zzajzVar4 == null) {
            zzajkVar = new zzajk(zzfwh.zzn(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzajx zzajxVar = zzakdVar2.zzh;
            if (zzajxVar == null) {
                zzajxVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzajxVar.zza + 1 != bitmap.getWidth() || zzajxVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(zzajxVar.zza + 1, zzajxVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = bitmapCreateBitmap;
                this.zzf.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = zzajzVar4.zzc;
            int i16 = 0;
            while (i16 < sparseArray4.size()) {
                this.zzf.save();
                zzaka zzakaVar = (zzaka) sparseArray4.valueAt(i16);
                zzakb zzakbVar3 = (zzakb) this.zzi.zzc.get(sparseArray4.keyAt(i16));
                int i17 = zzakaVar.zza + zzajxVar.zzc;
                int i18 = zzakaVar.zzb + zzajxVar.zze;
                this.zzf.clipRect(i17, i18, Math.min(zzakbVar3.zzc + i17, zzajxVar.zzd), Math.min(zzakbVar3.zzd + i18, zzajxVar.zzf));
                zzajw zzajwVar = (zzajw) this.zzi.zzd.get(zzakbVar3.zzf);
                if (zzajwVar == null) {
                    zzajwVar = (zzajw) this.zzi.zzf.get(zzakbVar3.zzf);
                    if (zzajwVar == null) {
                        zzajwVar = this.zzh;
                    }
                }
                SparseArray sparseArray5 = zzakbVar3.zzj;
                int i19 = 0;
                while (i19 < sparseArray5.size()) {
                    int iKeyAt = sparseArray5.keyAt(i19);
                    zzakc zzakcVar = (zzakc) sparseArray5.valueAt(i19);
                    zzajy zzajyVar = (zzajy) this.zzi.zze.get(iKeyAt);
                    if (zzajyVar == null) {
                        zzajyVar = (zzajy) this.zzi.zzg.get(iKeyAt);
                    }
                    if (zzajyVar != null) {
                        Paint paint = zzajyVar.zzb ? null : this.zzd;
                        int i20 = zzakbVar3.zze;
                        int i21 = zzakcVar.zza + i17;
                        int i22 = zzakcVar.zzb + i18;
                        Canvas canvas = this.zzf;
                        int[] iArr = i20 == 3 ? zzajwVar.zzd : i20 == 2 ? zzajwVar.zzc : zzajwVar.zzb;
                        Paint paint2 = paint;
                        zze(zzajyVar.zzc, iArr, i20, i21, i22, paint2, canvas);
                        zze(zzajyVar.zzd, iArr, i20, i21, i22 + 1, paint2, canvas);
                    }
                    i19++;
                    sparseArray4 = sparseArray4;
                    sparseArray5 = sparseArray5;
                    i16 = i16;
                }
                SparseArray sparseArray6 = sparseArray4;
                int i23 = i16;
                float f7 = i18;
                float f8 = i17;
                if (zzakbVar3.zzb) {
                    int i24 = zzakbVar3.zze;
                    c3 = 3;
                    if (i24 == 3) {
                        i9 = zzajwVar.zzd[zzakbVar3.zzg];
                        c4 = 2;
                    } else {
                        c4 = 2;
                        i9 = i24 == 2 ? zzajwVar.zzc[zzakbVar3.zzh] : zzajwVar.zzb[zzakbVar3.zzi];
                    }
                    this.zze.setColor(i9);
                    this.zzf.drawRect(f8, f7, zzakbVar3.zzc + i17, zzakbVar3.zzd + i18, this.zze);
                } else {
                    c3 = 3;
                    c4 = 2;
                }
                zzcl zzclVar = new zzcl();
                zzclVar.zzc(Bitmap.createBitmap(this.zzj, i17, i18, zzakbVar3.zzc, zzakbVar3.zzd));
                zzclVar.zzh(f8 / zzajxVar.zza);
                zzclVar.zzi(0);
                zzclVar.zze(f7 / zzajxVar.zzb, 0);
                zzclVar.zzf(0);
                zzclVar.zzk(zzakbVar3.zzc / zzajxVar.zza);
                zzclVar.zzd(zzakbVar3.zzd / zzajxVar.zzb);
                arrayList.add(zzclVar.zzp());
                this.zzf.drawColor(0, PorterDuff.Mode.CLEAR);
                this.zzf.restore();
                i16 = i23 + 1;
                sparseArray4 = sparseArray6;
            }
            zzajkVar = new zzajk(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzddVar.zza(zzajkVar);
    }
}
