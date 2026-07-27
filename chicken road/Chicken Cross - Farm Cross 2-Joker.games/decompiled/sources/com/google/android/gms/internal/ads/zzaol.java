package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.google.android.gms.nearby.uwb.RangingPosition;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzaol implements zzanz {
    private static final byte[] zza = {0, 7, 8, Ascii.SI};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzaoe zzg;
    private final zzaod zzh;
    private final zzaok zzi;
    private Bitmap zzj;

    public zzaol(List list) {
        zzeu zzeuVar = new zzeu((byte[]) list.get(0));
        int zzt = zzeuVar.zzt();
        int zzt2 = zzeuVar.zzt();
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
        this.zzg = new zzaoe(719, 575, 0, 719, 0, 575);
        this.zzh = new zzaod(0, zzd(), zze(), zzf());
        this.zzi = new zzaok(zzt, zzt2);
    }

    private static zzaod zzb(zzet zzetVar, int i) {
        int zzj;
        int zzj2;
        int i2;
        int i3;
        int i4 = 8;
        int zzj3 = zzetVar.zzj(8);
        zzetVar.zzh(8);
        int[] zzd = zzd();
        int[] zze = zze();
        int[] zzf = zzf();
        int i5 = i - 2;
        while (i5 > 0) {
            int zzj4 = zzetVar.zzj(i4);
            int zzj5 = zzetVar.zzj(i4);
            int[] iArr = (zzj5 & 128) != 0 ? zzd : (zzj5 & 64) != 0 ? zze : zzf;
            if ((zzj5 & 1) != 0) {
                i2 = zzetVar.zzj(i4);
                i3 = zzetVar.zzj(i4);
                zzj = zzetVar.zzj(i4);
                zzj2 = zzetVar.zzj(i4);
                i5 -= 6;
            } else {
                int zzj6 = zzetVar.zzj(6) << 2;
                int zzj7 = zzetVar.zzj(4) << 4;
                i5 -= 4;
                zzj = zzetVar.zzj(4) << 4;
                zzj2 = zzetVar.zzj(2) << 6;
                i2 = zzj6;
                i3 = zzj7;
            }
            if (i2 == 0) {
                zzj2 = 255;
            }
            if (i2 == 0) {
                zzj = 0;
            }
            if (i2 == 0) {
                i3 = 0;
            }
            int i6 = zzj + RangingPosition.RSSI_UNKNOWN;
            double d = i2;
            String str = zzfm.zza;
            double d2 = i3 + RangingPosition.RSSI_UNKNOWN;
            double d3 = i6;
            iArr[zzj4] = zzg((byte) (255 - (zzj2 & 255)), Math.max(0, Math.min((int) (d + (1.402d * d2)), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255)));
            zzj3 = zzj3;
            i4 = 8;
        }
        return new zzaod(zzj3, zzd, zze, zzf);
    }

    private static zzaof zzc(zzet zzetVar) {
        byte[] bArr;
        int zzj = zzetVar.zzj(16);
        zzetVar.zzh(4);
        int zzj2 = zzetVar.zzj(2);
        boolean zzi = zzetVar.zzi();
        zzetVar.zzh(1);
        byte[] bArr2 = zzfm.zzb;
        if (zzj2 == 1) {
            zzetVar.zzh(zzetVar.zzj(8) * 16);
        } else if (zzj2 == 0) {
            int zzj3 = zzetVar.zzj(16);
            int zzj4 = zzetVar.zzj(16);
            if (zzj3 > 0) {
                bArr2 = new byte[zzj3];
                zzetVar.zzn(bArr2, 0, zzj3);
            }
            if (zzj4 > 0) {
                bArr = new byte[zzj4];
                zzetVar.zzn(bArr, 0, zzj4);
                return new zzaof(zzj, zzi, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new zzaof(zzj, zzi, bArr2, bArr);
    }

    private static int[] zzd() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int[] zze() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = zzg(255, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                iArr[i] = zzg(255, 1 != i4 ? 0 : 127, i3 != 0 ? 127 : 0, i2 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] zzf() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = zzg(63, 1 != (i & 1) ? 0 : 255, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = zzg(255, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = zzg(127, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = zzg(255, (1 != (i & 1) ? 0 : 43) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = zzg(255, (1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int zzg(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0228 A[LOOP:3: B:88:0x0172->B:101:0x0228, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ef A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzh(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i4;
        int i5;
        int zzj;
        char c;
        char c2;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        int zzj2;
        int zzj3;
        int i10;
        int i11;
        int i12;
        int zzj4;
        int i13;
        zzet zzetVar = new zzet(bArr, bArr.length);
        int i14 = i2;
        int i15 = i3;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (zzetVar.zzc() != 0) {
            int i16 = 8;
            int zzj5 = zzetVar.zzj(8);
            if (zzj5 != 240) {
                int i17 = 4;
                int i18 = 1;
                int i19 = 2;
                switch (zzj5) {
                    case 16:
                        int i20 = 1;
                        if (i != 3) {
                            if (i != 2) {
                                bArr2 = null;
                            } else if (bArr6 == null) {
                                bArr3 = zza;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr6;
                            }
                            i4 = i14;
                            i5 = 0;
                            while (true) {
                                zzj = zzetVar.zzj(2);
                                if (zzj != 0) {
                                }
                                i6 = i5;
                                c = 4;
                                c2 = '\b';
                                if (i7 != 0) {
                                }
                                i8 = i4;
                                i4 = i8 + i7;
                                if (i6 != 0) {
                                }
                                i5 = i6;
                                i20 = 1;
                            }
                        } else if (bArr4 == null) {
                            bArr3 = zzb;
                            bArr2 = bArr3;
                            i4 = i14;
                            i5 = 0;
                            while (true) {
                                zzj = zzetVar.zzj(2);
                                if (zzj != 0) {
                                    i7 = i20;
                                } else if (zzetVar.zzi()) {
                                    i7 = zzetVar.zzj(3) + 3;
                                    zzj = zzetVar.zzj(2);
                                } else {
                                    if (zzetVar.zzi()) {
                                        i7 = i20;
                                        i6 = i5;
                                        zzj = 0;
                                    } else {
                                        int zzj6 = zzetVar.zzj(2);
                                        if (zzj6 == 0) {
                                            c = 4;
                                            c2 = '\b';
                                            i6 = i20;
                                            zzj = 0;
                                            i7 = 0;
                                        } else if (zzj6 == i20) {
                                            c = 4;
                                            c2 = '\b';
                                            i6 = i5;
                                            i7 = 2;
                                            zzj = 0;
                                        } else if (zzj6 == 2) {
                                            c = 4;
                                            c2 = '\b';
                                            i7 = zzetVar.zzj(4) + 12;
                                            zzj = zzetVar.zzj(2);
                                            i6 = i5;
                                        } else if (zzj6 != 3) {
                                            i6 = i5;
                                            zzj = 0;
                                            i7 = 0;
                                        } else {
                                            c2 = '\b';
                                            i7 = zzetVar.zzj(8) + 29;
                                            zzj = zzetVar.zzj(2);
                                            i6 = i5;
                                            c = 4;
                                        }
                                        if (i7 != 0 || paint == null) {
                                            i8 = i4;
                                        } else {
                                            int i21 = i15 + 1;
                                            float f = i15;
                                            if (bArr2 != 0) {
                                                zzj = bArr2[zzj];
                                            }
                                            paint.setColor(iArr[zzj]);
                                            i8 = i4;
                                            canvas.drawRect(i4, f, i4 + i7, i21, paint);
                                        }
                                        i4 = i8 + i7;
                                        if (i6 != 0) {
                                            zzetVar.zzm();
                                            i14 = i4;
                                            break;
                                        } else {
                                            i5 = i6;
                                            i20 = 1;
                                        }
                                    }
                                    c = 4;
                                    c2 = '\b';
                                    if (i7 != 0) {
                                    }
                                    i8 = i4;
                                    i4 = i8 + i7;
                                    if (i6 != 0) {
                                    }
                                }
                                i6 = i5;
                                c = 4;
                                c2 = '\b';
                                if (i7 != 0) {
                                }
                                i8 = i4;
                                i4 = i8 + i7;
                                if (i6 != 0) {
                                }
                            }
                        } else {
                            bArr2 = bArr4;
                            i4 = i14;
                            i5 = 0;
                            while (true) {
                                zzj = zzetVar.zzj(2);
                                if (zzj != 0) {
                                }
                                i6 = i5;
                                c = 4;
                                c2 = '\b';
                                if (i7 != 0) {
                                }
                                i8 = i4;
                                i4 = i8 + i7;
                                if (i6 != 0) {
                                }
                                i5 = i6;
                                i20 = 1;
                            }
                        }
                    case 17:
                        byte[] bArr7 = i == 3 ? bArr5 == null ? zzc : bArr5 : null;
                        int i22 = i14;
                        boolean z2 = false;
                        while (true) {
                            int zzj7 = zzetVar.zzj(i17);
                            if (zzj7 != 0) {
                                i9 = 1;
                                z = z2;
                            } else if (zzetVar.zzi()) {
                                if (zzetVar.zzi()) {
                                    int zzj8 = zzetVar.zzj(i19);
                                    if (zzj8 == 0) {
                                        i9 = 1;
                                        z = z2;
                                    } else if (zzj8 == 1) {
                                        z = z2;
                                        i9 = i19;
                                    } else if (zzj8 == i19) {
                                        zzj2 = zzetVar.zzj(i17) + 9;
                                        zzj3 = zzetVar.zzj(i17);
                                    } else if (zzj8 != 3) {
                                        z = z2;
                                        zzj7 = 0;
                                        i9 = 0;
                                    } else {
                                        zzj2 = zzetVar.zzj(i16) + 25;
                                        zzj3 = zzetVar.zzj(i17);
                                    }
                                    zzj7 = 0;
                                } else {
                                    zzj2 = zzetVar.zzj(i19) + i17;
                                    zzj3 = zzetVar.zzj(i17);
                                }
                                z = z2;
                                i9 = zzj2;
                                zzj7 = zzj3;
                            } else {
                                int zzj9 = zzetVar.zzj(3);
                                if (zzj9 != 0) {
                                    z = z2;
                                    i9 = zzj9 + 2;
                                    zzj7 = 0;
                                } else {
                                    z = true;
                                    zzj7 = 0;
                                    i9 = 0;
                                }
                            }
                            if (i9 == 0 || paint == null) {
                                i10 = i19;
                                i11 = i22;
                            } else {
                                int i23 = i15 + 1;
                                float f2 = i15;
                                if (bArr7 != 0) {
                                    zzj7 = bArr7[zzj7];
                                }
                                paint.setColor(iArr[zzj7]);
                                i10 = 2;
                                i11 = i22;
                                canvas.drawRect(i22, f2, i22 + i9, i23, paint);
                            }
                            i22 = i11 + i9;
                            if (z) {
                                zzetVar.zzm();
                                i14 = i22;
                                break;
                            } else {
                                i19 = i10;
                                z2 = z;
                                i17 = 4;
                                i16 = 8;
                            }
                        }
                    case 18:
                        int i24 = i14;
                        int i25 = 0;
                        while (true) {
                            int zzj10 = zzetVar.zzj(8);
                            if (zzj10 != 0) {
                                i12 = i25;
                                zzj4 = i18;
                            } else if (zzetVar.zzi()) {
                                i12 = i25;
                                zzj4 = zzetVar.zzj(7);
                                zzj10 = zzetVar.zzj(8);
                            } else {
                                int zzj11 = zzetVar.zzj(7);
                                if (zzj11 != 0) {
                                    i12 = i25;
                                    zzj4 = zzj11;
                                    zzj10 = 0;
                                } else {
                                    i12 = i18;
                                    zzj10 = 0;
                                    zzj4 = 0;
                                }
                            }
                            if (zzj4 == 0 || paint == null) {
                                i13 = i18;
                            } else {
                                paint.setColor(iArr[zzj10]);
                                i13 = i18;
                                canvas.drawRect(i24, i15, i24 + zzj4, i15 + 1, paint);
                            }
                            i24 += zzj4;
                            if (i12 != 0) {
                                i14 = i24;
                                break;
                            } else {
                                i18 = i13;
                                i25 = i12;
                            }
                        }
                    default:
                        switch (zzj5) {
                            case 32:
                                bArr6 = zzi(4, 4, zzetVar);
                                break;
                            case 33:
                                bArr4 = zzi(4, 8, zzetVar);
                                break;
                            case 34:
                                bArr5 = zzi(16, 8, zzetVar);
                                break;
                        }
                }
            } else {
                i15 += 2;
                i14 = i2;
            }
        }
    }

    private static byte[] zzi(int i, int i2, zzet zzetVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) zzetVar.zzj(i2);
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzanz
    public final void zza(byte[] bArr, int i, int i2, zzany zzanyVar, zzdu zzduVar) {
        zzanr zzanrVar;
        char c;
        char c2;
        char c3;
        int i3;
        zzaok zzaokVar;
        zzaoe zzaoeVar;
        int i4;
        int i5;
        ArrayList arrayList;
        int i6;
        zzaoi zzaoiVar;
        int i7;
        int i8;
        zzaoi zzaoiVar2;
        int i9;
        int zzj;
        int zzj2;
        int i10;
        int i11;
        int i12;
        int i13;
        zzet zzetVar = new zzet(bArr, i + i2);
        zzetVar.zzf(i);
        while (zzetVar.zzc() >= 48 && zzetVar.zzj(8) == 15) {
            zzaok zzaokVar2 = this.zzi;
            int zzj3 = zzetVar.zzj(8);
            int zzj4 = zzetVar.zzj(16);
            int zzj5 = zzetVar.zzj(16);
            int zze = zzetVar.zze() + zzj5;
            if (zzj5 * 8 > zzetVar.zzc()) {
                zzeh.zzc("DvbParser", "Data field length exceeds limit");
                zzetVar.zzh(zzetVar.zzc());
            } else {
                switch (zzj3) {
                    case 16:
                        if (zzj4 == zzaokVar2.zza) {
                            zzaog zzaogVar = zzaokVar2.zzi;
                            int zzj6 = zzetVar.zzj(8);
                            int zzj7 = zzetVar.zzj(4);
                            int zzj8 = zzetVar.zzj(2);
                            zzetVar.zzh(2);
                            SparseArray sparseArray = new SparseArray();
                            for (int i14 = zzj5 - 2; i14 > 0; i14 -= 6) {
                                int zzj9 = zzetVar.zzj(8);
                                zzetVar.zzh(8);
                                sparseArray.put(zzj9, new zzaoh(zzetVar.zzj(16), zzetVar.zzj(16)));
                            }
                            zzaog zzaogVar2 = new zzaog(zzj6, zzj7, zzj8, sparseArray);
                            if (zzaogVar2.zzb != 0) {
                                zzaokVar2.zzi = zzaogVar2;
                                zzaokVar2.zzc.clear();
                                zzaokVar2.zzd.clear();
                                zzaokVar2.zze.clear();
                                break;
                            } else if (zzaogVar != null) {
                                if (zzaogVar.zza != zzaogVar2.zza) {
                                    zzaokVar2.zzi = zzaogVar2;
                                    break;
                                }
                            }
                        }
                        break;
                    case 17:
                        zzaog zzaogVar3 = zzaokVar2.zzi;
                        if (zzj4 == zzaokVar2.zza && zzaogVar3 != null) {
                            int zzj10 = zzetVar.zzj(8);
                            zzetVar.zzh(4);
                            boolean zzi = zzetVar.zzi();
                            zzetVar.zzh(3);
                            int zzj11 = zzetVar.zzj(16);
                            int zzj12 = zzetVar.zzj(16);
                            int zzj13 = zzetVar.zzj(3);
                            int zzj14 = zzetVar.zzj(3);
                            zzetVar.zzh(2);
                            int zzj15 = zzetVar.zzj(8);
                            int zzj16 = zzetVar.zzj(8);
                            int zzj17 = zzetVar.zzj(4);
                            int zzj18 = zzetVar.zzj(2);
                            zzetVar.zzh(2);
                            int i15 = zzj5 - 10;
                            SparseArray sparseArray2 = new SparseArray();
                            while (i15 > 0) {
                                int zzj19 = zzetVar.zzj(16);
                                int zzj20 = zzetVar.zzj(2);
                                int zzj21 = zzetVar.zzj(2);
                                int zzj22 = zzetVar.zzj(12);
                                zzetVar.zzh(4);
                                int zzj23 = zzetVar.zzj(12);
                                int i16 = i15 - 6;
                                if (zzj20 != 1) {
                                    if (zzj20 == 2) {
                                        zzj20 = 2;
                                    } else {
                                        i9 = zzj20;
                                        i15 = i16;
                                        zzj = 0;
                                        zzj2 = 0;
                                        sparseArray2.put(zzj19, new zzaoj(i9, zzj21, zzj22, zzj23, zzj, zzj2));
                                    }
                                }
                                i15 -= 8;
                                i9 = zzj20;
                                zzj = zzetVar.zzj(8);
                                zzj2 = zzetVar.zzj(8);
                                sparseArray2.put(zzj19, new zzaoj(i9, zzj21, zzj22, zzj23, zzj, zzj2));
                            }
                            zzaoi zzaoiVar3 = new zzaoi(zzj10, zzi, zzj11, zzj12, zzj13, zzj14, zzj15, zzj16, zzj17, zzj18, sparseArray2);
                            if (zzaogVar3.zzb == 0 && (zzaoiVar2 = (zzaoi) zzaokVar2.zzc.get(zzaoiVar3.zza)) != null) {
                                int i17 = 0;
                                while (true) {
                                    SparseArray sparseArray3 = zzaoiVar2.zzj;
                                    if (i17 < sparseArray3.size()) {
                                        zzaoiVar3.zzj.put(sparseArray3.keyAt(i17), (zzaoj) sparseArray3.valueAt(i17));
                                        i17++;
                                    }
                                }
                            }
                            zzaokVar2.zzc.put(zzaoiVar3.zza, zzaoiVar3);
                            break;
                        }
                        break;
                    case 18:
                        if (zzj4 == zzaokVar2.zza) {
                            zzaod zzb2 = zzb(zzetVar, zzj5);
                            zzaokVar2.zzd.put(zzb2.zza, zzb2);
                            break;
                        } else if (zzj4 == zzaokVar2.zzb) {
                            zzaod zzb3 = zzb(zzetVar, zzj5);
                            zzaokVar2.zzf.put(zzb3.zza, zzb3);
                            break;
                        }
                        break;
                    case 19:
                        if (zzj4 == zzaokVar2.zza) {
                            zzaof zzc2 = zzc(zzetVar);
                            zzaokVar2.zze.put(zzc2.zza, zzc2);
                            break;
                        } else if (zzj4 == zzaokVar2.zzb) {
                            zzaof zzc3 = zzc(zzetVar);
                            zzaokVar2.zzg.put(zzc3.zza, zzc3);
                            break;
                        }
                        break;
                    case 20:
                        if (zzj4 == zzaokVar2.zza) {
                            zzetVar.zzh(4);
                            boolean zzi2 = zzetVar.zzi();
                            zzetVar.zzh(3);
                            int zzj24 = zzetVar.zzj(16);
                            int zzj25 = zzetVar.zzj(16);
                            if (zzi2) {
                                int zzj26 = zzetVar.zzj(16);
                                i10 = zzetVar.zzj(16);
                                i13 = zzetVar.zzj(16);
                                i11 = zzetVar.zzj(16);
                                i12 = zzj26;
                            } else {
                                i10 = zzj24;
                                i11 = zzj25;
                                i12 = 0;
                                i13 = 0;
                            }
                            zzaokVar2.zzh = new zzaoe(zzj24, zzj25, i12, i10, i13, i11);
                            break;
                        }
                        break;
                }
                zzetVar.zzo(zze - zzetVar.zze());
            }
        }
        zzaok zzaokVar3 = this.zzi;
        zzaog zzaogVar4 = zzaokVar3.zzi;
        if (zzaogVar4 == null) {
            zzanrVar = new zzanr(zzgxm.zzi(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzaoe zzaoeVar2 = zzaokVar3.zzh;
            if (zzaoeVar2 == null) {
                zzaoeVar2 = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzaoeVar2.zza + 1 != bitmap.getWidth() || zzaoeVar2.zzb + 1 != this.zzj.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(zzaoeVar2.zza + 1, zzaoeVar2.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = createBitmap;
                this.zzf.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray4 = zzaogVar4.zzc;
            int i18 = 0;
            while (i18 < sparseArray4.size()) {
                Canvas canvas = this.zzf;
                canvas.save();
                zzaoh zzaohVar = (zzaoh) sparseArray4.valueAt(i18);
                zzaoi zzaoiVar4 = (zzaoi) zzaokVar3.zzc.get(sparseArray4.keyAt(i18));
                int i19 = zzaohVar.zza + zzaoeVar2.zzc;
                int i20 = zzaohVar.zzb + zzaoeVar2.zze;
                int i21 = zzaoiVar4.zzc;
                int i22 = i19 + i21;
                int min = Math.min(i22, zzaoeVar2.zzd);
                int i23 = zzaoiVar4.zzd;
                int i24 = i20 + i23;
                canvas.clipRect(i19, i20, min, Math.min(i24, zzaoeVar2.zzf));
                int i25 = zzaoiVar4.zzf;
                zzaod zzaodVar = (zzaod) zzaokVar3.zzd.get(i25);
                if (zzaodVar == null && (zzaodVar = (zzaod) zzaokVar3.zzf.get(i25)) == null) {
                    zzaodVar = this.zzh;
                }
                SparseArray sparseArray5 = zzaoiVar4.zzj;
                SparseArray sparseArray6 = sparseArray4;
                int i26 = i22;
                int i27 = 0;
                while (i27 < sparseArray5.size()) {
                    int keyAt = sparseArray5.keyAt(i27);
                    SparseArray sparseArray7 = sparseArray5;
                    zzaoj zzaojVar = (zzaoj) sparseArray5.valueAt(i27);
                    int i28 = i21;
                    zzaof zzaofVar = (zzaof) zzaokVar3.zze.get(keyAt);
                    if (zzaofVar == null) {
                        zzaofVar = (zzaof) zzaokVar3.zzg.get(keyAt);
                    }
                    if (zzaofVar != null) {
                        Paint paint = zzaofVar.zzb ? null : this.zzd;
                        int i29 = zzaoiVar4.zze;
                        zzaokVar = zzaokVar3;
                        int i30 = zzaojVar.zza + i19;
                        int i31 = zzaojVar.zzb + i20;
                        int i32 = i19;
                        int[] iArr = i29 == 3 ? zzaodVar.zzd : i29 == 2 ? zzaodVar.zzc : zzaodVar.zzb;
                        i5 = i18;
                        i7 = i26;
                        arrayList = arrayList2;
                        zzaoeVar = zzaoeVar2;
                        i8 = i28;
                        i6 = i32;
                        i4 = i23;
                        zzaoiVar = zzaoiVar4;
                        zzh(zzaofVar.zzc, iArr, i29, i30, i31, paint, canvas);
                        zzh(zzaofVar.zzd, iArr, i29, i30, i31 + 1, paint, canvas);
                    } else {
                        zzaokVar = zzaokVar3;
                        zzaoeVar = zzaoeVar2;
                        i4 = i23;
                        i5 = i18;
                        arrayList = arrayList2;
                        i6 = i19;
                        zzaoiVar = zzaoiVar4;
                        i7 = i26;
                        i8 = i28;
                    }
                    i27++;
                    i19 = i6;
                    zzaoiVar4 = zzaoiVar;
                    i26 = i7;
                    sparseArray5 = sparseArray7;
                    zzaokVar3 = zzaokVar;
                    i18 = i5;
                    arrayList2 = arrayList;
                    zzaoeVar2 = zzaoeVar;
                    i23 = i4;
                    i21 = i8;
                }
                zzaok zzaokVar4 = zzaokVar3;
                zzaoe zzaoeVar3 = zzaoeVar2;
                int i33 = i23;
                int i34 = i18;
                ArrayList arrayList3 = arrayList2;
                int i35 = i21;
                int i36 = i19;
                zzaoi zzaoiVar5 = zzaoiVar4;
                int i37 = i26;
                float f = i20;
                float f2 = i36;
                if (zzaoiVar5.zzb) {
                    int i38 = zzaoiVar5.zze;
                    if (i38 == 3) {
                        i3 = zzaodVar.zzd[zzaoiVar5.zzg];
                        c3 = 2;
                    } else {
                        c3 = 2;
                        i3 = i38 == 2 ? zzaodVar.zzc[zzaoiVar5.zzh] : zzaodVar.zzb[zzaoiVar5.zzi];
                    }
                    Paint paint2 = this.zze;
                    paint2.setColor(i3);
                    float f3 = i24;
                    float f4 = i37;
                    c = c3;
                    c2 = 3;
                    canvas.drawRect(f2, f, f4, f3, paint2);
                } else {
                    c = 2;
                    c2 = 3;
                }
                zzcx zzcxVar = new zzcx();
                zzcxVar.zzc(Bitmap.createBitmap(this.zzj, i36, i20, i35, i33));
                zzaoeVar2 = zzaoeVar3;
                float f5 = zzaoeVar2.zza;
                zzcxVar.zzi(f2 / f5);
                zzcxVar.zzj(0);
                float f6 = zzaoeVar2.zzb;
                zzcxVar.zzf(f / f6, 0);
                zzcxVar.zzg(0);
                zzcxVar.zzm(i35 / f5);
                zzcxVar.zzn(i33 / f6);
                arrayList3.add(zzcxVar.zzr());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                sparseArray4 = sparseArray6;
                arrayList2 = arrayList3;
                i18 = i34 + 1;
                zzaokVar3 = zzaokVar4;
            }
            zzanrVar = new zzanr(arrayList2, -9223372036854775807L, -9223372036854775807L);
        }
        zzduVar.zza(zzanrVar);
    }
}
