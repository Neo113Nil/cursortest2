package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzanx implements com.google.android.gms.internal.ads.zzanl {
    private static final byte[] zza = {0, 7, 8, com.google.common.base.Ascii.SI};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final android.graphics.Paint zzd;
    private final android.graphics.Paint zze;
    private final android.graphics.Canvas zzf;
    private final com.google.android.gms.internal.ads.zzanq zzg;
    private final com.google.android.gms.internal.ads.zzanp zzh;
    private final com.google.android.gms.internal.ads.zzanw zzi;
    private android.graphics.Bitmap zzj;

    public zzanx(java.util.List list) {
        com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet((byte[]) list.get(0));
        int zzt = zzetVar.zzt();
        int zzt2 = zzetVar.zzt();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.zzd = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.zze = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new android.graphics.Canvas();
        this.zzg = new com.google.android.gms.internal.ads.zzanq(719, 575, 0, 719, 0, 575);
        this.zzh = new com.google.android.gms.internal.ads.zzanp(0, zzd(), zze(), zzf());
        this.zzi = new com.google.android.gms.internal.ads.zzanw(zzt, zzt2);
    }

    private static com.google.android.gms.internal.ads.zzanp zzb(com.google.android.gms.internal.ads.zzes zzesVar, int i) {
        int zzj;
        int zzj2;
        int i2;
        int i3;
        int i4 = 8;
        int zzj3 = zzesVar.zzj(8);
        zzesVar.zzh(8);
        int[] zzd = zzd();
        int[] zze = zze();
        int[] zzf = zzf();
        int i5 = i - 2;
        while (i5 > 0) {
            int zzj4 = zzesVar.zzj(i4);
            int zzj5 = zzesVar.zzj(i4);
            int[] iArr = (zzj5 & 128) != 0 ? zzd : (zzj5 & 64) != 0 ? zze : zzf;
            if ((zzj5 & 1) != 0) {
                i2 = zzesVar.zzj(i4);
                i3 = zzesVar.zzj(i4);
                zzj = zzesVar.zzj(i4);
                zzj2 = zzesVar.zzj(i4);
                i5 -= 6;
            } else {
                int zzj6 = zzesVar.zzj(6) << 2;
                int zzj7 = zzesVar.zzj(4) << 4;
                i5 -= 4;
                zzj = zzesVar.zzj(4) << 4;
                zzj2 = zzesVar.zzj(2) << 6;
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
            double d = i2;
            java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
            double d2 = i3 - 128;
            double d3 = zzj - 128;
            iArr[zzj4] = zzg((byte) (255 - (zzj2 & 255)), java.lang.Math.max(0, java.lang.Math.min((int) (d + (1.402d * d2)), 255)), java.lang.Math.max(0, java.lang.Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), java.lang.Math.max(0, java.lang.Math.min((int) (d + (d3 * 1.772d)), 255)));
            zzj3 = zzj3;
            i4 = 8;
        }
        return new com.google.android.gms.internal.ads.zzanp(zzj3, zzd, zze, zzf);
    }

    private static com.google.android.gms.internal.ads.zzanr zzc(com.google.android.gms.internal.ads.zzes zzesVar) {
        byte[] bArr;
        int zzj = zzesVar.zzj(16);
        zzesVar.zzh(4);
        int zzj2 = zzesVar.zzj(2);
        boolean zzi = zzesVar.zzi();
        zzesVar.zzh(1);
        byte[] bArr2 = com.google.android.gms.internal.ads.zzfl.zzb;
        if (zzj2 == 1) {
            zzesVar.zzh(zzesVar.zzj(8) * 16);
        } else if (zzj2 == 0) {
            int zzj3 = zzesVar.zzj(16);
            int zzj4 = zzesVar.zzj(16);
            if (zzj3 > 0) {
                bArr2 = new byte[zzj3];
                zzesVar.zzn(bArr2, 0, zzj3);
            }
            if (zzj4 > 0) {
                bArr = new byte[zzj4];
                zzesVar.zzn(bArr, 0, zzj4);
                return new com.google.android.gms.internal.ads.zzanr(zzj, zzi, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new com.google.android.gms.internal.ads.zzanr(zzj, zzi, bArr2, bArr);
    }

    private static int[] zzd() {
        return new int[]{0, -1, androidx.core.view.ViewCompat.MEASURED_STATE_MASK, -8421505};
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x0224 A[LOOP:3: B:88:0x016c->B:100:0x0224, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x021e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0119 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0148 A[LOOP:2: B:41:0x00ac->B:53:0x0148, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01eb A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzh(byte[] bArr, int[] iArr, int i, int i2, int i3, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i4;
        boolean z;
        int zzj;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        int i7;
        int zzj2;
        int zzj3;
        int i8;
        boolean z4;
        int zzj4;
        com.google.android.gms.internal.ads.zzes zzesVar = new com.google.android.gms.internal.ads.zzes(bArr, bArr.length);
        int i9 = i2;
        int i10 = i3;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (zzesVar.zzc() != 0) {
            int i11 = 8;
            int zzj5 = zzesVar.zzj(8);
            if (zzj5 != 240) {
                int i12 = 4;
                int i13 = 2;
                switch (zzj5) {
                    case 16:
                        int i14 = 1;
                        if (i != 3) {
                            if (i != 2) {
                                bArr2 = null;
                            } else if (bArr6 == null) {
                                bArr3 = zza;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr6;
                            }
                            i4 = i9;
                            z = false;
                            while (true) {
                                zzj = zzesVar.zzj(2);
                                if (zzj != 0) {
                                }
                                i5 = 1;
                                if (i5 != 0) {
                                }
                                i6 = i4;
                                i4 = i6 + i5;
                                if (!z2) {
                                }
                                z = z2;
                                i14 = 1;
                            }
                        } else if (bArr4 == null) {
                            bArr3 = zzb;
                            bArr2 = bArr3;
                            i4 = i9;
                            z = false;
                            while (true) {
                                zzj = zzesVar.zzj(2);
                                if (zzj != 0) {
                                    z2 = z;
                                } else {
                                    if (zzesVar.zzi()) {
                                        i5 = zzesVar.zzj(3) + 3;
                                        zzj = zzesVar.zzj(2);
                                        z2 = z;
                                    } else if (zzesVar.zzi()) {
                                        z2 = z;
                                        zzj = 0;
                                    } else {
                                        int zzj6 = zzesVar.zzj(2);
                                        if (zzj6 == 0) {
                                            zzj = 0;
                                            i5 = 0;
                                            z2 = true;
                                        } else if (zzj6 == i14) {
                                            z2 = z;
                                            zzj = 0;
                                            i5 = 2;
                                        } else if (zzj6 == 2) {
                                            i5 = zzesVar.zzj(4) + 12;
                                            zzj = zzesVar.zzj(2);
                                            z2 = z;
                                        } else if (zzj6 != 3) {
                                            z2 = z;
                                            zzj = 0;
                                            i5 = 0;
                                        } else {
                                            i5 = zzesVar.zzj(8) + 29;
                                            zzj = zzesVar.zzj(2);
                                            z2 = z;
                                        }
                                    }
                                    if (i5 != 0 || paint == null) {
                                        i6 = i4;
                                    } else {
                                        int i15 = i10 + 1;
                                        float f = i10;
                                        if (bArr2 != 0) {
                                            zzj = bArr2[zzj];
                                        }
                                        paint.setColor(iArr[zzj]);
                                        i6 = i4;
                                        canvas.drawRect(i4, f, i4 + i5, i15, paint);
                                    }
                                    i4 = i6 + i5;
                                    if (!z2) {
                                        zzesVar.zzm();
                                        i9 = i4;
                                        break;
                                    } else {
                                        z = z2;
                                        i14 = 1;
                                    }
                                }
                                i5 = 1;
                                if (i5 != 0) {
                                }
                                i6 = i4;
                                i4 = i6 + i5;
                                if (!z2) {
                                }
                            }
                        } else {
                            bArr2 = bArr4;
                            i4 = i9;
                            z = false;
                            while (true) {
                                zzj = zzesVar.zzj(2);
                                if (zzj != 0) {
                                }
                                i5 = 1;
                                if (i5 != 0) {
                                }
                                i6 = i4;
                                i4 = i6 + i5;
                                if (!z2) {
                                }
                                z = z2;
                                i14 = 1;
                            }
                        }
                    case 17:
                        byte[] bArr7 = i == 3 ? bArr5 == null ? zzc : bArr5 : null;
                        int i16 = i9;
                        boolean z5 = false;
                        while (true) {
                            int zzj7 = zzesVar.zzj(i12);
                            if (zzj7 != 0) {
                                z3 = z5;
                            } else if (zzesVar.zzi()) {
                                if (zzesVar.zzi()) {
                                    int zzj8 = zzesVar.zzj(i13);
                                    if (zzj8 == 0) {
                                        z3 = z5;
                                        zzj7 = 0;
                                    } else if (zzj8 == 1) {
                                        z3 = z5;
                                        zzj7 = 0;
                                        i7 = 2;
                                        if (i7 != 0) {
                                        }
                                        i8 = i16;
                                        i16 = i8 + i7;
                                        if (!z3) {
                                        }
                                    } else if (zzj8 == i13) {
                                        zzj2 = zzesVar.zzj(i12) + 9;
                                        zzj3 = zzesVar.zzj(i12);
                                    } else if (zzj8 != 3) {
                                        z3 = z5;
                                        zzj7 = 0;
                                        i7 = 0;
                                        if (i7 != 0) {
                                        }
                                        i8 = i16;
                                        i16 = i8 + i7;
                                        if (!z3) {
                                        }
                                    } else {
                                        zzj2 = zzesVar.zzj(i11) + 25;
                                        zzj3 = zzesVar.zzj(i12);
                                    }
                                } else {
                                    zzj2 = zzesVar.zzj(i13) + i12;
                                    zzj3 = zzesVar.zzj(i12);
                                }
                                z3 = z5;
                                i7 = zzj2;
                                zzj7 = zzj3;
                                if (i7 != 0) {
                                }
                                i8 = i16;
                                i16 = i8 + i7;
                                if (!z3) {
                                }
                            } else {
                                int zzj9 = zzesVar.zzj(3);
                                if (zzj9 != 0) {
                                    z3 = z5;
                                    i7 = zzj9 + 2;
                                    zzj7 = 0;
                                    if (i7 != 0 || paint == null) {
                                        i8 = i16;
                                    } else {
                                        int i17 = i10 + 1;
                                        float f2 = i10;
                                        if (bArr7 != 0) {
                                            zzj7 = bArr7[zzj7];
                                        }
                                        paint.setColor(iArr[zzj7]);
                                        i8 = i16;
                                        canvas.drawRect(i16, f2, i16 + i7, i17, paint);
                                    }
                                    i16 = i8 + i7;
                                    if (!z3) {
                                        zzesVar.zzm();
                                        i9 = i16;
                                        break;
                                    } else {
                                        z5 = z3;
                                        i13 = 2;
                                        i12 = 4;
                                        i11 = 8;
                                    }
                                } else {
                                    zzj7 = 0;
                                    z3 = true;
                                    i7 = 0;
                                    if (i7 != 0) {
                                    }
                                    i8 = i16;
                                    i16 = i8 + i7;
                                    if (!z3) {
                                    }
                                }
                            }
                            i7 = 1;
                            if (i7 != 0) {
                            }
                            i8 = i16;
                            i16 = i8 + i7;
                            if (!z3) {
                            }
                        }
                    case 18:
                        int i18 = i9;
                        boolean z6 = false;
                        while (true) {
                            int zzj10 = zzesVar.zzj(8);
                            if (zzj10 != 0) {
                                z4 = z6;
                                zzj4 = 1;
                            } else if (zzesVar.zzi()) {
                                z4 = z6;
                                zzj4 = zzesVar.zzj(7);
                                zzj10 = zzesVar.zzj(8);
                            } else {
                                int zzj11 = zzesVar.zzj(7);
                                if (zzj11 != 0) {
                                    z4 = z6;
                                    zzj4 = zzj11;
                                    zzj10 = 0;
                                } else {
                                    zzj10 = 0;
                                    z4 = true;
                                    zzj4 = 0;
                                }
                            }
                            if (zzj4 != 0 && paint != null) {
                                paint.setColor(iArr[zzj10]);
                                canvas.drawRect(i18, i10, i18 + zzj4, i10 + 1, paint);
                            }
                            i18 += zzj4;
                            if (z4) {
                                i9 = i18;
                                break;
                            } else {
                                z6 = z4;
                            }
                        }
                    default:
                        switch (zzj5) {
                            case 32:
                                bArr6 = zzi(4, 4, zzesVar);
                                break;
                            case 33:
                                bArr4 = zzi(4, 8, zzesVar);
                                break;
                            case 34:
                                bArr5 = zzi(16, 8, zzesVar);
                                break;
                        }
                }
            } else {
                i10 += 2;
                i9 = i2;
            }
        }
    }

    private static byte[] zzi(int i, int i2, com.google.android.gms.internal.ads.zzes zzesVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) zzesVar.zzj(i2);
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzanl
    public final void zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzank zzankVar, com.google.android.gms.internal.ads.zzdt zzdtVar) {
        com.google.android.gms.internal.ads.zzand zzandVar;
        com.google.android.gms.internal.ads.zzanw zzanwVar;
        com.google.android.gms.internal.ads.zzanq zzanqVar;
        int i3;
        int i4;
        java.util.ArrayList arrayList;
        int i5;
        com.google.android.gms.internal.ads.zzanu zzanuVar;
        int i6;
        int i7;
        com.google.android.gms.internal.ads.zzanu zzanuVar2;
        int i8;
        int zzj;
        int zzj2;
        int i9;
        int i10;
        int i11;
        int i12;
        com.google.android.gms.internal.ads.zzes zzesVar = new com.google.android.gms.internal.ads.zzes(bArr, i + i2);
        zzesVar.zzf(i);
        while (zzesVar.zzc() >= 48 && zzesVar.zzj(8) == 15) {
            com.google.android.gms.internal.ads.zzanw zzanwVar2 = this.zzi;
            int zzj3 = zzesVar.zzj(8);
            int zzj4 = zzesVar.zzj(16);
            int zzj5 = zzesVar.zzj(16);
            int zze = zzesVar.zze() + zzj5;
            if (zzj5 * 8 > zzesVar.zzc()) {
                com.google.android.gms.internal.ads.zzeg.zzc("DvbParser", "Data field length exceeds limit");
                zzesVar.zzh(zzesVar.zzc());
            } else {
                switch (zzj3) {
                    case 16:
                        if (zzj4 == zzanwVar2.zza) {
                            com.google.android.gms.internal.ads.zzans zzansVar = zzanwVar2.zzi;
                            int zzj6 = zzesVar.zzj(8);
                            int zzj7 = zzesVar.zzj(4);
                            int zzj8 = zzesVar.zzj(2);
                            zzesVar.zzh(2);
                            android.util.SparseArray sparseArray = new android.util.SparseArray();
                            for (int i13 = zzj5 - 2; i13 > 0; i13 -= 6) {
                                int zzj9 = zzesVar.zzj(8);
                                zzesVar.zzh(8);
                                sparseArray.put(zzj9, new com.google.android.gms.internal.ads.zzant(zzesVar.zzj(16), zzesVar.zzj(16)));
                            }
                            com.google.android.gms.internal.ads.zzans zzansVar2 = new com.google.android.gms.internal.ads.zzans(zzj6, zzj7, zzj8, sparseArray);
                            if (zzansVar2.zzb != 0) {
                                zzanwVar2.zzi = zzansVar2;
                                zzanwVar2.zzc.clear();
                                zzanwVar2.zzd.clear();
                                zzanwVar2.zze.clear();
                                break;
                            } else if (zzansVar != null) {
                                if (zzansVar.zza != zzansVar2.zza) {
                                    zzanwVar2.zzi = zzansVar2;
                                    break;
                                }
                            }
                        }
                        break;
                    case 17:
                        com.google.android.gms.internal.ads.zzans zzansVar3 = zzanwVar2.zzi;
                        if (zzj4 == zzanwVar2.zza && zzansVar3 != null) {
                            int zzj10 = zzesVar.zzj(8);
                            zzesVar.zzh(4);
                            boolean zzi = zzesVar.zzi();
                            zzesVar.zzh(3);
                            int zzj11 = zzesVar.zzj(16);
                            int zzj12 = zzesVar.zzj(16);
                            int zzj13 = zzesVar.zzj(3);
                            int zzj14 = zzesVar.zzj(3);
                            zzesVar.zzh(2);
                            int zzj15 = zzesVar.zzj(8);
                            int zzj16 = zzesVar.zzj(8);
                            int zzj17 = zzesVar.zzj(4);
                            int zzj18 = zzesVar.zzj(2);
                            zzesVar.zzh(2);
                            int i14 = zzj5 - 10;
                            android.util.SparseArray sparseArray2 = new android.util.SparseArray();
                            while (i14 > 0) {
                                int zzj19 = zzesVar.zzj(16);
                                int zzj20 = zzesVar.zzj(2);
                                int zzj21 = zzesVar.zzj(2);
                                int zzj22 = zzesVar.zzj(12);
                                zzesVar.zzh(4);
                                int zzj23 = zzesVar.zzj(12);
                                int i15 = i14 - 6;
                                if (zzj20 != 1) {
                                    if (zzj20 == 2) {
                                        zzj20 = 2;
                                    } else {
                                        i8 = zzj20;
                                        i14 = i15;
                                        zzj = 0;
                                        zzj2 = 0;
                                        sparseArray2.put(zzj19, new com.google.android.gms.internal.ads.zzanv(i8, zzj21, zzj22, zzj23, zzj, zzj2));
                                    }
                                }
                                i14 -= 8;
                                i8 = zzj20;
                                zzj = zzesVar.zzj(8);
                                zzj2 = zzesVar.zzj(8);
                                sparseArray2.put(zzj19, new com.google.android.gms.internal.ads.zzanv(i8, zzj21, zzj22, zzj23, zzj, zzj2));
                            }
                            com.google.android.gms.internal.ads.zzanu zzanuVar3 = new com.google.android.gms.internal.ads.zzanu(zzj10, zzi, zzj11, zzj12, zzj13, zzj14, zzj15, zzj16, zzj17, zzj18, sparseArray2);
                            if (zzansVar3.zzb == 0 && (zzanuVar2 = (com.google.android.gms.internal.ads.zzanu) zzanwVar2.zzc.get(zzanuVar3.zza)) != null) {
                                int i16 = 0;
                                while (true) {
                                    android.util.SparseArray sparseArray3 = zzanuVar2.zzj;
                                    if (i16 < sparseArray3.size()) {
                                        zzanuVar3.zzj.put(sparseArray3.keyAt(i16), (com.google.android.gms.internal.ads.zzanv) sparseArray3.valueAt(i16));
                                        i16++;
                                    }
                                }
                            }
                            zzanwVar2.zzc.put(zzanuVar3.zza, zzanuVar3);
                            break;
                        }
                        break;
                    case 18:
                        if (zzj4 == zzanwVar2.zza) {
                            com.google.android.gms.internal.ads.zzanp zzb2 = zzb(zzesVar, zzj5);
                            zzanwVar2.zzd.put(zzb2.zza, zzb2);
                            break;
                        } else if (zzj4 == zzanwVar2.zzb) {
                            com.google.android.gms.internal.ads.zzanp zzb3 = zzb(zzesVar, zzj5);
                            zzanwVar2.zzf.put(zzb3.zza, zzb3);
                            break;
                        }
                        break;
                    case 19:
                        if (zzj4 == zzanwVar2.zza) {
                            com.google.android.gms.internal.ads.zzanr zzc2 = zzc(zzesVar);
                            zzanwVar2.zze.put(zzc2.zza, zzc2);
                            break;
                        } else if (zzj4 == zzanwVar2.zzb) {
                            com.google.android.gms.internal.ads.zzanr zzc3 = zzc(zzesVar);
                            zzanwVar2.zzg.put(zzc3.zza, zzc3);
                            break;
                        }
                        break;
                    case 20:
                        if (zzj4 == zzanwVar2.zza) {
                            zzesVar.zzh(4);
                            boolean zzi2 = zzesVar.zzi();
                            zzesVar.zzh(3);
                            int zzj24 = zzesVar.zzj(16);
                            int zzj25 = zzesVar.zzj(16);
                            if (zzi2) {
                                int zzj26 = zzesVar.zzj(16);
                                i9 = zzesVar.zzj(16);
                                i12 = zzesVar.zzj(16);
                                i10 = zzesVar.zzj(16);
                                i11 = zzj26;
                            } else {
                                i9 = zzj24;
                                i10 = zzj25;
                                i11 = 0;
                                i12 = 0;
                            }
                            zzanwVar2.zzh = new com.google.android.gms.internal.ads.zzanq(zzj24, zzj25, i11, i9, i12, i10);
                            break;
                        }
                        break;
                }
                zzesVar.zzo(zze - zzesVar.zze());
            }
        }
        com.google.android.gms.internal.ads.zzanw zzanwVar3 = this.zzi;
        com.google.android.gms.internal.ads.zzans zzansVar4 = zzanwVar3.zzi;
        if (zzansVar4 == null) {
            zzandVar = new com.google.android.gms.internal.ads.zzand(com.google.android.gms.internal.ads.zzgwm.zzi(), -9223372036854775807L, -9223372036854775807L);
        } else {
            com.google.android.gms.internal.ads.zzanq zzanqVar2 = zzanwVar3.zzh;
            if (zzanqVar2 == null) {
                zzanqVar2 = this.zzg;
            }
            android.graphics.Bitmap bitmap = this.zzj;
            if (bitmap == null || zzanqVar2.zza + 1 != bitmap.getWidth() || zzanqVar2.zzb + 1 != this.zzj.getHeight()) {
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(zzanqVar2.zza + 1, zzanqVar2.zzb + 1, android.graphics.Bitmap.Config.ARGB_8888);
                this.zzj = createBitmap;
                this.zzf.setBitmap(createBitmap);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            android.util.SparseArray sparseArray4 = zzansVar4.zzc;
            int i17 = 0;
            while (i17 < sparseArray4.size()) {
                android.graphics.Canvas canvas = this.zzf;
                canvas.save();
                com.google.android.gms.internal.ads.zzant zzantVar = (com.google.android.gms.internal.ads.zzant) sparseArray4.valueAt(i17);
                com.google.android.gms.internal.ads.zzanu zzanuVar4 = (com.google.android.gms.internal.ads.zzanu) zzanwVar3.zzc.get(sparseArray4.keyAt(i17));
                int i18 = zzantVar.zza + zzanqVar2.zzc;
                int i19 = zzantVar.zzb + zzanqVar2.zze;
                int i20 = zzanuVar4.zzc;
                int i21 = i18 + i20;
                int min = java.lang.Math.min(i21, zzanqVar2.zzd);
                int i22 = zzanuVar4.zzd;
                int i23 = i19 + i22;
                canvas.clipRect(i18, i19, min, java.lang.Math.min(i23, zzanqVar2.zzf));
                int i24 = zzanuVar4.zzf;
                com.google.android.gms.internal.ads.zzanp zzanpVar = (com.google.android.gms.internal.ads.zzanp) zzanwVar3.zzd.get(i24);
                if (zzanpVar == null && (zzanpVar = (com.google.android.gms.internal.ads.zzanp) zzanwVar3.zzf.get(i24)) == null) {
                    zzanpVar = this.zzh;
                }
                android.util.SparseArray sparseArray5 = zzanuVar4.zzj;
                android.util.SparseArray sparseArray6 = sparseArray4;
                int i25 = i21;
                int i26 = 0;
                while (i26 < sparseArray5.size()) {
                    int keyAt = sparseArray5.keyAt(i26);
                    android.util.SparseArray sparseArray7 = sparseArray5;
                    com.google.android.gms.internal.ads.zzanv zzanvVar = (com.google.android.gms.internal.ads.zzanv) sparseArray5.valueAt(i26);
                    int i27 = i20;
                    com.google.android.gms.internal.ads.zzanr zzanrVar = (com.google.android.gms.internal.ads.zzanr) zzanwVar3.zze.get(keyAt);
                    if (zzanrVar == null) {
                        zzanrVar = (com.google.android.gms.internal.ads.zzanr) zzanwVar3.zzg.get(keyAt);
                    }
                    if (zzanrVar != null) {
                        android.graphics.Paint paint = zzanrVar.zzb ? null : this.zzd;
                        int i28 = zzanuVar4.zze;
                        zzanwVar = zzanwVar3;
                        int i29 = zzanvVar.zza + i18;
                        int i30 = zzanvVar.zzb + i19;
                        int i31 = i18;
                        int[] iArr = i28 == 3 ? zzanpVar.zzd : i28 == 2 ? zzanpVar.zzc : zzanpVar.zzb;
                        i4 = i17;
                        i6 = i25;
                        arrayList = arrayList2;
                        zzanqVar = zzanqVar2;
                        i7 = i27;
                        i5 = i31;
                        i3 = i22;
                        zzanuVar = zzanuVar4;
                        zzh(zzanrVar.zzc, iArr, i28, i29, i30, paint, canvas);
                        zzh(zzanrVar.zzd, iArr, i28, i29, i30 + 1, paint, canvas);
                    } else {
                        zzanwVar = zzanwVar3;
                        zzanqVar = zzanqVar2;
                        i3 = i22;
                        i4 = i17;
                        arrayList = arrayList2;
                        i5 = i18;
                        zzanuVar = zzanuVar4;
                        i6 = i25;
                        i7 = i27;
                    }
                    i26++;
                    i18 = i5;
                    zzanuVar4 = zzanuVar;
                    i25 = i6;
                    sparseArray5 = sparseArray7;
                    zzanwVar3 = zzanwVar;
                    i17 = i4;
                    arrayList2 = arrayList;
                    zzanqVar2 = zzanqVar;
                    i22 = i3;
                    i20 = i7;
                }
                com.google.android.gms.internal.ads.zzanw zzanwVar4 = zzanwVar3;
                com.google.android.gms.internal.ads.zzanq zzanqVar3 = zzanqVar2;
                int i32 = i22;
                int i33 = i17;
                java.util.ArrayList arrayList3 = arrayList2;
                int i34 = i20;
                int i35 = i18;
                com.google.android.gms.internal.ads.zzanu zzanuVar5 = zzanuVar4;
                int i36 = i25;
                float f = i19;
                float f2 = i35;
                if (zzanuVar5.zzb) {
                    int i37 = zzanuVar5.zze;
                    int i38 = i37 == 3 ? zzanpVar.zzd[zzanuVar5.zzg] : i37 == 2 ? zzanpVar.zzc[zzanuVar5.zzh] : zzanpVar.zzb[zzanuVar5.zzi];
                    android.graphics.Paint paint2 = this.zze;
                    paint2.setColor(i38);
                    canvas.drawRect(f2, f, i36, i23, paint2);
                }
                com.google.android.gms.internal.ads.zzcw zzcwVar = new com.google.android.gms.internal.ads.zzcw();
                zzcwVar.zzc(android.graphics.Bitmap.createBitmap(this.zzj, i35, i19, i34, i32));
                zzanqVar2 = zzanqVar3;
                float f3 = zzanqVar2.zza;
                zzcwVar.zzi(f2 / f3);
                zzcwVar.zzj(0);
                float f4 = zzanqVar2.zzb;
                zzcwVar.zzf(f / f4, 0);
                zzcwVar.zzg(0);
                zzcwVar.zzm(i34 / f3);
                zzcwVar.zzn(i32 / f4);
                arrayList3.add(zzcwVar.zzr());
                canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                canvas.restore();
                i17 = i33 + 1;
                arrayList2 = arrayList3;
                sparseArray4 = sparseArray6;
                zzanwVar3 = zzanwVar4;
            }
            zzandVar = new com.google.android.gms.internal.ads.zzand(arrayList2, -9223372036854775807L, -9223372036854775807L);
        }
        zzdtVar.zza(zzandVar);
    }
}
