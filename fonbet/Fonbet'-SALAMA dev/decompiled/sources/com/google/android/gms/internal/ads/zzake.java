package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
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
        int zzq = zzedVar.zzq();
        int zzq2 = zzedVar.zzq();
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
        this.zzi = new zzakd(zzq, zzq2);
    }

    private static int zzb(int i7, int i8, int i9, int i10) {
        return (i7 << 24) | (i8 << 16) | (i9 << 8) | i10;
    }

    private static zzajw zzc(zzec zzecVar, int i7) {
        int zzd;
        int zzd2;
        int i8;
        int i9;
        int i10 = 8;
        int zzd3 = zzecVar.zzd(8);
        zzecVar.zzn(8);
        int[] zzg = zzg();
        int[] zzh = zzh();
        int[] zzi = zzi();
        int i11 = i7 - 2;
        while (i11 > 0) {
            int zzd4 = zzecVar.zzd(i10);
            int zzd5 = zzecVar.zzd(i10);
            int[] iArr = (zzd5 & 128) != 0 ? zzg : (zzd5 & 64) != 0 ? zzh : zzi;
            if ((zzd5 & 1) != 0) {
                i8 = zzecVar.zzd(i10);
                i9 = zzecVar.zzd(i10);
                zzd = zzecVar.zzd(i10);
                zzd2 = zzecVar.zzd(i10);
                i11 -= 6;
            } else {
                int zzd6 = zzecVar.zzd(6) << 2;
                int zzd7 = zzecVar.zzd(4) << 4;
                i11 -= 4;
                zzd = zzecVar.zzd(4) << 4;
                zzd2 = zzecVar.zzd(2) << 6;
                i8 = zzd6;
                i9 = zzd7;
            }
            if (i8 == 0) {
                zzd2 = 255;
            }
            if (i8 == 0) {
                zzd = 0;
            }
            if (i8 == 0) {
                i9 = 0;
            }
            double d7 = i8;
            int i12 = zzen.zza;
            double d8 = i9 - 128;
            double d9 = zzd - 128;
            iArr[zzd4] = zzb((byte) (255 - (zzd2 & 255)), Math.max(0, Math.min((int) ((1.402d * d8) + d7), 255)), Math.max(0, Math.min((int) ((d7 - (0.34414d * d9)) - (d8 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d9 * 1.772d) + d7), 255)));
            zzd3 = zzd3;
            i10 = 8;
        }
        return new zzajw(zzd3, zzg, zzh, zzi);
    }

    private static zzajy zzd(zzec zzecVar) {
        byte[] bArr;
        int zzd = zzecVar.zzd(16);
        zzecVar.zzn(4);
        int zzd2 = zzecVar.zzd(2);
        boolean zzp = zzecVar.zzp();
        zzecVar.zzn(1);
        byte[] bArr2 = zzen.zzc;
        if (zzd2 == 1) {
            zzecVar.zzn(zzecVar.zzd(8) * 16);
        } else if (zzd2 == 0) {
            int zzd3 = zzecVar.zzd(16);
            int zzd4 = zzecVar.zzd(16);
            if (zzd3 > 0) {
                bArr2 = new byte[zzd3];
                zzecVar.zzi(bArr2, 0, zzd3);
            }
            if (zzd4 > 0) {
                bArr = new byte[zzd4];
                zzecVar.zzi(bArr, 0, zzd4);
                return new zzajy(zzd, zzp, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new zzajy(zzd, zzp, bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0228 A[LOOP:3: B:88:0x0172->B:101:0x0228, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ef A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zze(byte[] bArr, int[] iArr, int i7, int i8, int i9, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i10;
        int i11;
        int zzd;
        char c3;
        char c4;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z4;
        int zzd2;
        int zzd3;
        int i16;
        int i17;
        int i18;
        int zzd4;
        int i19;
        zzec zzecVar = new zzec(bArr, bArr.length);
        int i20 = i8;
        int i21 = i9;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (zzecVar.zza() != 0) {
            int i22 = 8;
            int zzd5 = zzecVar.zzd(8);
            if (zzd5 != 240) {
                int i23 = 4;
                int i24 = 1;
                int i25 = 2;
                switch (zzd5) {
                    case 16:
                        int i26 = 1;
                        if (i7 != 3) {
                            if (i7 != 2) {
                                bArr2 = null;
                            } else if (bArr6 == null) {
                                bArr3 = zza;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr6;
                            }
                            i10 = i20;
                            i11 = 0;
                            while (true) {
                                zzd = zzecVar.zzd(2);
                                if (zzd != 0) {
                                }
                                i12 = i11;
                                c3 = 4;
                                c4 = '\b';
                                if (i13 != 0) {
                                }
                                i14 = i10;
                                i10 = i14 + i13;
                                if (i12 != 0) {
                                }
                                i11 = i12;
                                i26 = 1;
                            }
                        } else if (bArr4 == null) {
                            bArr3 = zzb;
                            bArr2 = bArr3;
                            i10 = i20;
                            i11 = 0;
                            while (true) {
                                zzd = zzecVar.zzd(2);
                                if (zzd != 0) {
                                    i13 = i26;
                                } else if (zzecVar.zzp()) {
                                    i13 = zzecVar.zzd(3) + 3;
                                    zzd = zzecVar.zzd(2);
                                } else {
                                    if (zzecVar.zzp()) {
                                        i13 = i26;
                                        i12 = i11;
                                        zzd = 0;
                                    } else {
                                        int zzd6 = zzecVar.zzd(2);
                                        if (zzd6 == 0) {
                                            c3 = 4;
                                            c4 = '\b';
                                            i12 = i26;
                                            zzd = 0;
                                            i13 = 0;
                                        } else if (zzd6 == i26) {
                                            c3 = 4;
                                            c4 = '\b';
                                            i12 = i11;
                                            i13 = 2;
                                            zzd = 0;
                                        } else if (zzd6 == 2) {
                                            c3 = 4;
                                            c4 = '\b';
                                            i13 = zzecVar.zzd(4) + 12;
                                            zzd = zzecVar.zzd(2);
                                            i12 = i11;
                                        } else if (zzd6 != 3) {
                                            i12 = i11;
                                            zzd = 0;
                                            i13 = 0;
                                        } else {
                                            c4 = '\b';
                                            i13 = zzecVar.zzd(8) + 29;
                                            zzd = zzecVar.zzd(2);
                                            i12 = i11;
                                            c3 = 4;
                                        }
                                        if (i13 != 0 || paint == null) {
                                            i14 = i10;
                                        } else {
                                            int i27 = i21 + 1;
                                            float f7 = i21;
                                            if (bArr2 != 0) {
                                                zzd = bArr2[zzd];
                                            }
                                            paint.setColor(iArr[zzd]);
                                            i14 = i10;
                                            canvas.drawRect(i10, f7, i10 + i13, i27, paint);
                                        }
                                        i10 = i14 + i13;
                                        if (i12 != 0) {
                                            zzecVar.zzf();
                                            i20 = i10;
                                            break;
                                        } else {
                                            i11 = i12;
                                            i26 = 1;
                                        }
                                    }
                                    c3 = 4;
                                    c4 = '\b';
                                    if (i13 != 0) {
                                    }
                                    i14 = i10;
                                    i10 = i14 + i13;
                                    if (i12 != 0) {
                                    }
                                }
                                i12 = i11;
                                c3 = 4;
                                c4 = '\b';
                                if (i13 != 0) {
                                }
                                i14 = i10;
                                i10 = i14 + i13;
                                if (i12 != 0) {
                                }
                            }
                        } else {
                            bArr2 = bArr4;
                            i10 = i20;
                            i11 = 0;
                            while (true) {
                                zzd = zzecVar.zzd(2);
                                if (zzd != 0) {
                                }
                                i12 = i11;
                                c3 = 4;
                                c4 = '\b';
                                if (i13 != 0) {
                                }
                                i14 = i10;
                                i10 = i14 + i13;
                                if (i12 != 0) {
                                }
                                i11 = i12;
                                i26 = 1;
                            }
                        }
                    case 17:
                        byte[] bArr7 = i7 == 3 ? bArr5 == null ? zzc : bArr5 : null;
                        int i28 = i20;
                        boolean z7 = false;
                        while (true) {
                            int zzd7 = zzecVar.zzd(i23);
                            if (zzd7 != 0) {
                                i15 = 1;
                                z4 = z7;
                            } else if (zzecVar.zzp()) {
                                if (zzecVar.zzp()) {
                                    int zzd8 = zzecVar.zzd(i25);
                                    if (zzd8 == 0) {
                                        i15 = 1;
                                        z4 = z7;
                                    } else if (zzd8 == 1) {
                                        z4 = z7;
                                        i15 = i25;
                                    } else if (zzd8 == i25) {
                                        zzd2 = zzecVar.zzd(i23) + 9;
                                        zzd3 = zzecVar.zzd(i23);
                                    } else if (zzd8 != 3) {
                                        z4 = z7;
                                        zzd7 = 0;
                                        i15 = 0;
                                    } else {
                                        zzd2 = zzecVar.zzd(i22) + 25;
                                        zzd3 = zzecVar.zzd(i23);
                                    }
                                    zzd7 = 0;
                                } else {
                                    zzd2 = zzecVar.zzd(i25) + i23;
                                    zzd3 = zzecVar.zzd(i23);
                                }
                                z4 = z7;
                                i15 = zzd2;
                                zzd7 = zzd3;
                            } else {
                                int zzd9 = zzecVar.zzd(3);
                                if (zzd9 != 0) {
                                    z4 = z7;
                                    i15 = zzd9 + 2;
                                    zzd7 = 0;
                                } else {
                                    z4 = true;
                                    zzd7 = 0;
                                    i15 = 0;
                                }
                            }
                            if (i15 == 0 || paint == null) {
                                i16 = i25;
                                i17 = i28;
                            } else {
                                int i29 = i21 + 1;
                                float f8 = i21;
                                if (bArr7 != 0) {
                                    zzd7 = bArr7[zzd7];
                                }
                                paint.setColor(iArr[zzd7]);
                                i16 = 2;
                                i17 = i28;
                                canvas.drawRect(i28, f8, i28 + i15, i29, paint);
                            }
                            i28 = i17 + i15;
                            if (z4) {
                                zzecVar.zzf();
                                i20 = i28;
                                break;
                            } else {
                                i25 = i16;
                                z7 = z4;
                                i23 = 4;
                                i22 = 8;
                            }
                        }
                    case 18:
                        int i30 = i20;
                        int i31 = 0;
                        while (true) {
                            int zzd10 = zzecVar.zzd(8);
                            if (zzd10 != 0) {
                                i18 = i31;
                                zzd4 = i24;
                            } else if (zzecVar.zzp()) {
                                i18 = i31;
                                zzd4 = zzecVar.zzd(7);
                                zzd10 = zzecVar.zzd(8);
                            } else {
                                int zzd11 = zzecVar.zzd(7);
                                if (zzd11 != 0) {
                                    i18 = i31;
                                    zzd4 = zzd11;
                                    zzd10 = 0;
                                } else {
                                    i18 = i24;
                                    zzd10 = 0;
                                    zzd4 = 0;
                                }
                            }
                            if (zzd4 == 0 || paint == null) {
                                i19 = i24;
                            } else {
                                paint.setColor(iArr[zzd10]);
                                i19 = i24;
                                canvas.drawRect(i30, i21, i30 + zzd4, i21 + 1, paint);
                            }
                            i30 += zzd4;
                            if (i18 != 0) {
                                i20 = i30;
                                break;
                            } else {
                                i24 = i19;
                                i31 = i18;
                            }
                        }
                    default:
                        switch (zzd5) {
                            case 32:
                                bArr6 = zzf(4, 4, zzecVar);
                                break;
                            case 33:
                                bArr4 = zzf(4, 8, zzecVar);
                                break;
                            case 34:
                                bArr5 = zzf(16, 8, zzecVar);
                                break;
                        }
                }
            } else {
                i21 += 2;
                i20 = i8;
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
        SparseArray sparseArray;
        int i10;
        SparseArray sparseArray2;
        zzakb zzakbVar;
        int i11;
        int zzd;
        int zzd2;
        int i12;
        int i13;
        int i14;
        int i15;
        zzec zzecVar = new zzec(bArr, i7 + i8);
        zzecVar.zzl(i7);
        while (zzecVar.zza() >= 48 && zzecVar.zzd(8) == 15) {
            zzakd zzakdVar = this.zzi;
            int zzd3 = zzecVar.zzd(8);
            int zzd4 = zzecVar.zzd(16);
            int zzd5 = zzecVar.zzd(16);
            int zzb2 = zzecVar.zzb() + zzd5;
            if (zzd5 * 8 > zzecVar.zza()) {
                zzdq.zzf("DvbParser", "Data field length exceeds limit");
                zzecVar.zzn(zzecVar.zza());
            } else {
                switch (zzd3) {
                    case 16:
                        if (zzd4 == zzakdVar.zza) {
                            zzajz zzajzVar = zzakdVar.zzi;
                            int zzd6 = zzecVar.zzd(8);
                            int zzd7 = zzecVar.zzd(4);
                            int zzd8 = zzecVar.zzd(2);
                            zzecVar.zzn(2);
                            SparseArray sparseArray3 = new SparseArray();
                            for (int i16 = zzd5 - 2; i16 > 0; i16 -= 6) {
                                int zzd9 = zzecVar.zzd(8);
                                zzecVar.zzn(8);
                                sparseArray3.put(zzd9, new zzaka(zzecVar.zzd(16), zzecVar.zzd(16)));
                            }
                            zzajz zzajzVar2 = new zzajz(zzd6, zzd7, zzd8, sparseArray3);
                            if (zzajzVar2.zzb != 0) {
                                zzakdVar.zzi = zzajzVar2;
                                zzakdVar.zzc.clear();
                                zzakdVar.zzd.clear();
                                zzakdVar.zze.clear();
                                break;
                            } else if (zzajzVar != null) {
                                if (zzajzVar.zza != zzajzVar2.zza) {
                                    zzakdVar.zzi = zzajzVar2;
                                    break;
                                }
                            }
                        }
                        break;
                    case 17:
                        zzajz zzajzVar3 = zzakdVar.zzi;
                        if (zzd4 == zzakdVar.zza && zzajzVar3 != null) {
                            int zzd10 = zzecVar.zzd(8);
                            zzecVar.zzn(4);
                            boolean zzp = zzecVar.zzp();
                            zzecVar.zzn(3);
                            int zzd11 = zzecVar.zzd(16);
                            int zzd12 = zzecVar.zzd(16);
                            int zzd13 = zzecVar.zzd(3);
                            int zzd14 = zzecVar.zzd(3);
                            zzecVar.zzn(2);
                            int zzd15 = zzecVar.zzd(8);
                            int zzd16 = zzecVar.zzd(8);
                            int zzd17 = zzecVar.zzd(4);
                            int zzd18 = zzecVar.zzd(2);
                            zzecVar.zzn(2);
                            int i17 = zzd5 - 10;
                            SparseArray sparseArray4 = new SparseArray();
                            while (i17 > 0) {
                                int zzd19 = zzecVar.zzd(16);
                                int zzd20 = zzecVar.zzd(2);
                                int zzd21 = zzecVar.zzd(2);
                                int zzd22 = zzecVar.zzd(12);
                                zzecVar.zzn(4);
                                int zzd23 = zzecVar.zzd(12);
                                int i18 = i17 - 6;
                                if (zzd20 != 1) {
                                    if (zzd20 == 2) {
                                        zzd20 = 2;
                                    } else {
                                        i11 = zzd20;
                                        i17 = i18;
                                        zzd = 0;
                                        zzd2 = 0;
                                        sparseArray4.put(zzd19, new zzakc(i11, zzd21, zzd22, zzd23, zzd, zzd2));
                                    }
                                }
                                i17 -= 8;
                                i11 = zzd20;
                                zzd = zzecVar.zzd(8);
                                zzd2 = zzecVar.zzd(8);
                                sparseArray4.put(zzd19, new zzakc(i11, zzd21, zzd22, zzd23, zzd, zzd2));
                            }
                            zzakb zzakbVar2 = new zzakb(zzd10, zzp, zzd11, zzd12, zzd13, zzd14, zzd15, zzd16, zzd17, zzd18, sparseArray4);
                            if (zzajzVar3.zzb == 0 && (zzakbVar = (zzakb) zzakdVar.zzc.get(zzakbVar2.zza)) != null) {
                                int i19 = 0;
                                while (true) {
                                    SparseArray sparseArray5 = zzakbVar.zzj;
                                    if (i19 < sparseArray5.size()) {
                                        zzakbVar2.zzj.put(sparseArray5.keyAt(i19), (zzakc) sparseArray5.valueAt(i19));
                                        i19++;
                                    }
                                }
                            }
                            zzakdVar.zzc.put(zzakbVar2.zza, zzakbVar2);
                            break;
                        }
                        break;
                    case 18:
                        if (zzd4 == zzakdVar.zza) {
                            zzajw zzc2 = zzc(zzecVar, zzd5);
                            zzakdVar.zzd.put(zzc2.zza, zzc2);
                            break;
                        } else if (zzd4 == zzakdVar.zzb) {
                            zzajw zzc3 = zzc(zzecVar, zzd5);
                            zzakdVar.zzf.put(zzc3.zza, zzc3);
                            break;
                        }
                        break;
                    case 19:
                        if (zzd4 == zzakdVar.zza) {
                            zzajy zzd24 = zzd(zzecVar);
                            zzakdVar.zze.put(zzd24.zza, zzd24);
                            break;
                        } else if (zzd4 == zzakdVar.zzb) {
                            zzajy zzd25 = zzd(zzecVar);
                            zzakdVar.zzg.put(zzd25.zza, zzd25);
                            break;
                        }
                        break;
                    case 20:
                        if (zzd4 == zzakdVar.zza) {
                            zzecVar.zzn(4);
                            boolean zzp2 = zzecVar.zzp();
                            zzecVar.zzn(3);
                            int zzd26 = zzecVar.zzd(16);
                            int zzd27 = zzecVar.zzd(16);
                            if (zzp2) {
                                int zzd28 = zzecVar.zzd(16);
                                i12 = zzecVar.zzd(16);
                                i15 = zzecVar.zzd(16);
                                i13 = zzecVar.zzd(16);
                                i14 = zzd28;
                            } else {
                                i12 = zzd26;
                                i13 = zzd27;
                                i14 = 0;
                                i15 = 0;
                            }
                            zzakdVar.zzh = new zzajx(zzd26, zzd27, i14, i12, i15, i13);
                            break;
                        }
                        break;
                }
                zzecVar.zzo(zzb2 - zzecVar.zzb());
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
                Bitmap createBitmap = Bitmap.createBitmap(zzajxVar.zza + 1, zzajxVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = createBitmap;
                this.zzf.setBitmap(createBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray6 = zzajzVar4.zzc;
            int i20 = 0;
            while (i20 < sparseArray6.size()) {
                this.zzf.save();
                zzaka zzakaVar = (zzaka) sparseArray6.valueAt(i20);
                zzakb zzakbVar3 = (zzakb) this.zzi.zzc.get(sparseArray6.keyAt(i20));
                int i21 = zzakaVar.zza + zzajxVar.zzc;
                int i22 = zzakaVar.zzb + zzajxVar.zze;
                this.zzf.clipRect(i21, i22, Math.min(zzakbVar3.zzc + i21, zzajxVar.zzd), Math.min(zzakbVar3.zzd + i22, zzajxVar.zzf));
                zzajw zzajwVar = (zzajw) this.zzi.zzd.get(zzakbVar3.zzf);
                if (zzajwVar == null) {
                    zzajwVar = (zzajw) this.zzi.zzf.get(zzakbVar3.zzf);
                    if (zzajwVar == null) {
                        zzajwVar = this.zzh;
                    }
                }
                SparseArray sparseArray7 = zzakbVar3.zzj;
                int i23 = 0;
                while (i23 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i23);
                    zzakc zzakcVar = (zzakc) sparseArray7.valueAt(i23);
                    zzajy zzajyVar = (zzajy) this.zzi.zze.get(keyAt);
                    if (zzajyVar == null) {
                        zzajyVar = (zzajy) this.zzi.zzg.get(keyAt);
                    }
                    if (zzajyVar != null) {
                        Paint paint = zzajyVar.zzb ? null : this.zzd;
                        int i24 = zzakbVar3.zze;
                        int i25 = zzakcVar.zza + i21;
                        int i26 = zzakcVar.zzb + i22;
                        sparseArray = sparseArray6;
                        Canvas canvas = this.zzf;
                        sparseArray2 = sparseArray7;
                        i10 = i20;
                        int[] iArr = i24 == 3 ? zzajwVar.zzd : i24 == 2 ? zzajwVar.zzc : zzajwVar.zzb;
                        Paint paint2 = paint;
                        zze(zzajyVar.zzc, iArr, i24, i25, i26, paint2, canvas);
                        zze(zzajyVar.zzd, iArr, i24, i25, i26 + 1, paint2, canvas);
                    } else {
                        sparseArray = sparseArray6;
                        i10 = i20;
                        sparseArray2 = sparseArray7;
                    }
                    i23++;
                    sparseArray6 = sparseArray;
                    sparseArray7 = sparseArray2;
                    i20 = i10;
                }
                SparseArray sparseArray8 = sparseArray6;
                int i27 = i20;
                float f7 = i22;
                float f8 = i21;
                if (zzakbVar3.zzb) {
                    int i28 = zzakbVar3.zze;
                    c3 = 3;
                    if (i28 == 3) {
                        i9 = zzajwVar.zzd[zzakbVar3.zzg];
                        c4 = 2;
                    } else {
                        c4 = 2;
                        i9 = i28 == 2 ? zzajwVar.zzc[zzakbVar3.zzh] : zzajwVar.zzb[zzakbVar3.zzi];
                    }
                    this.zze.setColor(i9);
                    this.zzf.drawRect(f8, f7, zzakbVar3.zzc + i21, zzakbVar3.zzd + i22, this.zze);
                } else {
                    c3 = 3;
                    c4 = 2;
                }
                zzcl zzclVar = new zzcl();
                zzclVar.zzc(Bitmap.createBitmap(this.zzj, i21, i22, zzakbVar3.zzc, zzakbVar3.zzd));
                zzclVar.zzh(f8 / zzajxVar.zza);
                zzclVar.zzi(0);
                zzclVar.zze(f7 / zzajxVar.zzb, 0);
                zzclVar.zzf(0);
                zzclVar.zzk(zzakbVar3.zzc / zzajxVar.zza);
                zzclVar.zzd(zzakbVar3.zzd / zzajxVar.zzb);
                arrayList.add(zzclVar.zzp());
                this.zzf.drawColor(0, PorterDuff.Mode.CLEAR);
                this.zzf.restore();
                i20 = i27 + 1;
                sparseArray6 = sparseArray8;
            }
            zzajkVar = new zzajk(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzddVar.zza(zzajkVar);
    }
}
