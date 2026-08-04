package p081l2;

import F1.x;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f14919h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f14920i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f14921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f14922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Canvas f14923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f14924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f14925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f14926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f14927g;

    public i(int i7, int i8) {
        Paint paint = new Paint();
        this.f14921a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f14922b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f14923c = new Canvas();
        this.f14924d = new c(719, 575, 0, 719, 0, 575);
        this.f14925e = new b(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f14926f = new h(i7, i8);
    }

    public static byte[] a(int i7, int i8, x xVar) {
        byte[] bArr = new byte[i7];
        for (int i9 = 0; i9 < i7; i9++) {
            bArr[i9] = (byte) xVar.i(i8);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i7 = 1; i7 < 16; i7++) {
            if (i7 < 8) {
                iArr[i7] = d(255, (i7 & 1) != 0 ? 255 : 0, (i7 & 2) != 0 ? 255 : 0, (i7 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i7] = d(255, (i7 & 1) != 0 ? 127 : 0, (i7 & 2) != 0 ? 127 : 0, (i7 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i7 = 0; i7 < 256; i7++) {
            if (i7 < 8) {
                iArr[i7] = d(63, (i7 & 1) != 0 ? 255 : 0, (i7 & 2) != 0 ? 255 : 0, (i7 & 4) == 0 ? 0 : 255);
            } else {
                int i8 = i7 & 136;
                if (i8 == 0) {
                    iArr[i7] = d(255, ((i7 & 1) != 0 ? 85 : 0) + ((i7 & 16) != 0 ? 170 : 0), ((i7 & 2) != 0 ? 85 : 0) + ((i7 & 32) != 0 ? 170 : 0), ((i7 & 4) == 0 ? 0 : 85) + ((i7 & 64) == 0 ? 0 : 170));
                } else if (i8 == 8) {
                    iArr[i7] = d(127, ((i7 & 1) != 0 ? 85 : 0) + ((i7 & 16) != 0 ? 170 : 0), ((i7 & 2) != 0 ? 85 : 0) + ((i7 & 32) != 0 ? 170 : 0), ((i7 & 4) == 0 ? 0 : 85) + ((i7 & 64) == 0 ? 0 : 170));
                } else if (i8 == 128) {
                    iArr[i7] = d(255, ((i7 & 1) != 0 ? 43 : 0) + 127 + ((i7 & 16) != 0 ? 85 : 0), ((i7 & 2) != 0 ? 43 : 0) + 127 + ((i7 & 32) != 0 ? 85 : 0), ((i7 & 4) == 0 ? 0 : 43) + 127 + ((i7 & 64) == 0 ? 0 : 85));
                } else if (i8 == 136) {
                    iArr[i7] = d(255, ((i7 & 1) != 0 ? 43 : 0) + ((i7 & 16) != 0 ? 85 : 0), ((i7 & 2) != 0 ? 43 : 0) + ((i7 & 32) != 0 ? 85 : 0), ((i7 & 4) == 0 ? 0 : 43) + ((i7 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i7, int i8, int i9, int i10) {
        return (i7 << 24) | (i8 << 16) | (i9 << 8) | i10;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x01ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x01ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x01af  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:107:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0216  */
    /* JADX WARN: Code duplicated, block: B:118:0x0224 A[LOOP:3: B:89:0x0172->B:118:0x0224, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x021f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0178  */
    /* JADX WARN: Code duplicated, block: B:93:0x0181  */
    /* JADX WARN: Code duplicated, block: B:95:0x0187  */
    /* JADX WARN: Code duplicated, block: B:96:0x0196  */
    /* JADX WARN: Code duplicated, block: B:98:0x019c  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a3  */
    public static void e(byte[] bArr, int[] iArr, int i7, int i8, int i9, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i10;
        int i11;
        int i12;
        int i13;
        char c3;
        char c4;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        x xVar = new x(bArr, bArr.length);
        int i20 = i8;
        int i21 = i9;
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        byte[] bArrA3 = null;
        while (xVar.b() != 0) {
            int i22 = 8;
            int i23 = xVar.i(8);
            if (i23 != 240) {
                int i24 = 1;
                int i25 = 3;
                int i26 = 4;
                switch (i23) {
                    case 16:
                        int i27 = 1;
                        if (i7 == 3) {
                            bArr3 = bArrA == null ? f14920i : bArrA;
                        } else {
                            if (i7 == 2) {
                                bArr3 = bArrA3 == null ? f14919h : bArrA3;
                            } else {
                                bArr2 = null;
                            }
                            i10 = i20;
                            i11 = 0;
                            while (true) {
                                i12 = xVar.i(2);
                                if (i12 != 0) {
                                    i14 = i27;
                                } else if (xVar.h()) {
                                    i14 = xVar.i(3) + 3;
                                    i12 = xVar.i(2);
                                } else if (xVar.h()) {
                                    i14 = i27;
                                    i12 = 0;
                                } else {
                                    i13 = xVar.i(2);
                                    if (i13 != 0) {
                                        c3 = 4;
                                        c4 = '\b';
                                        i11 = i27;
                                        i12 = 0;
                                        i14 = 0;
                                    } else if (i13 != i27) {
                                        c3 = 4;
                                        c4 = '\b';
                                        i11 = i11;
                                        i14 = 2;
                                        i12 = 0;
                                    } else if (i13 != 2) {
                                        c3 = 4;
                                        c4 = '\b';
                                        i11 = i11;
                                        i14 = xVar.i(4) + 12;
                                        i12 = xVar.i(2);
                                    } else if (i13 != 3) {
                                        i12 = 0;
                                        i14 = 0;
                                    } else {
                                        c4 = '\b';
                                        i11 = i11;
                                        i14 = xVar.i(8) + 29;
                                        i12 = xVar.i(2);
                                        c3 = 4;
                                    }
                                    if (i14 == 0 && paint != null) {
                                        if (bArr2 != 0) {
                                            i12 = bArr2[i12];
                                        }
                                        paint.setColor(iArr[i12]);
                                        canvas.drawRect(i10, i21, i10 + i14, i21 + 1, paint);
                                    }
                                    i10 += i14;
                                    if (i11 != 0) {
                                        xVar.c();
                                    } else {
                                        i11 = i11;
                                        i27 = 1;
                                    }
                                }
                                c3 = 4;
                                c4 = '\b';
                                if (i14 == 0) {
                                }
                                i10 += i14;
                                if (i11 != 0) {
                                    xVar.c();
                                } else {
                                    i11 = i11;
                                    i27 = 1;
                                }
                            }
                        }
                        bArr2 = bArr3;
                        i10 = i20;
                        i11 = 0;
                        while (true) {
                            i12 = xVar.i(2);
                            if (i12 != 0) {
                                i14 = i27;
                            } else if (xVar.h()) {
                                i14 = xVar.i(3) + 3;
                                i12 = xVar.i(2);
                            } else if (xVar.h()) {
                                i14 = i27;
                                i12 = 0;
                            } else {
                                i13 = xVar.i(2);
                                if (i13 != 0) {
                                    c3 = 4;
                                    c4 = '\b';
                                    i11 = i27;
                                    i12 = 0;
                                    i14 = 0;
                                } else if (i13 != i27) {
                                    c3 = 4;
                                    c4 = '\b';
                                    i11 = i11;
                                    i14 = 2;
                                    i12 = 0;
                                } else if (i13 != 2) {
                                    c3 = 4;
                                    c4 = '\b';
                                    i11 = i11;
                                    i14 = xVar.i(4) + 12;
                                    i12 = xVar.i(2);
                                } else if (i13 != 3) {
                                    i12 = 0;
                                    i14 = 0;
                                } else {
                                    c4 = '\b';
                                    i11 = i11;
                                    i14 = xVar.i(8) + 29;
                                    i12 = xVar.i(2);
                                    c3 = 4;
                                }
                                if (i14 == 0) {
                                }
                                i10 += i14;
                                if (i11 != 0) {
                                    xVar.c();
                                } else {
                                    i11 = i11;
                                    i27 = 1;
                                }
                            }
                            c3 = 4;
                            c4 = '\b';
                            if (i14 == 0) {
                            }
                            i10 += i14;
                            if (i11 != 0) {
                                xVar.c();
                            } else {
                                i11 = i11;
                                i27 = 1;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i7 == 3 ? bArrA2 == null ? j : bArrA2 : null;
                        i10 = i20;
                        boolean z4 = false;
                        while (true) {
                            int i28 = xVar.i(i26);
                            if (i28 != 0) {
                                i15 = 1;
                                z4 = z4;
                            } else if (xVar.h()) {
                                if (xVar.h()) {
                                    int i29 = xVar.i(2);
                                    if (i29 == 0) {
                                        i15 = 1;
                                    } else if (i29 == 1) {
                                        i15 = 2;
                                    } else if (i29 == 2) {
                                        i16 = xVar.i(i26) + 9;
                                        i17 = xVar.i(i26);
                                    } else if (i29 != i25) {
                                        z4 = z4;
                                        i28 = 0;
                                        i15 = 0;
                                    } else {
                                        i16 = xVar.i(i22) + 25;
                                        i17 = xVar.i(i26);
                                    }
                                    i28 = 0;
                                } else {
                                    i16 = xVar.i(2) + i26;
                                    i17 = xVar.i(i26);
                                }
                                z4 = z4;
                                i15 = i16;
                                i28 = i17;
                            } else {
                                int i30 = xVar.i(i25);
                                if (i30 != 0) {
                                    i15 = i30 + 2;
                                    i28 = 0;
                                } else {
                                    z4 = true;
                                    i28 = 0;
                                    i15 = 0;
                                }
                            }
                            if (i15 != 0 && paint != null) {
                                if (bArr4 != 0) {
                                    i28 = bArr4[i28];
                                }
                                paint.setColor(iArr[i28]);
                                canvas.drawRect(i10, i21, i10 + i15, i21 + 1, paint);
                            }
                            i10 += i15;
                            if (z4) {
                                xVar.c();
                            } else {
                                i25 = i25;
                                z4 = z4;
                                i26 = 4;
                                i22 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i31 = i20;
                        int i32 = 0;
                        while (true) {
                            int i33 = xVar.i(8);
                            if (i33 != 0) {
                                i18 = i32;
                                i19 = i24;
                            } else if (xVar.h()) {
                                i18 = i32;
                                i19 = xVar.i(7);
                                i33 = xVar.i(8);
                            } else {
                                int i34 = xVar.i(7);
                                if (i34 != 0) {
                                    i18 = i32;
                                    i19 = i34;
                                    i33 = 0;
                                } else {
                                    i18 = i24;
                                    i33 = 0;
                                    i19 = 0;
                                }
                            }
                            if (i19 != 0 && paint != null) {
                                paint.setColor(iArr[i33]);
                                canvas.drawRect(i31, i21, i31 + i19, i21 + 1, paint);
                            }
                            i31 += i19;
                            if (i18 != 0) {
                                i20 = i31;
                                continue;
                            } else {
                                i24 = i24;
                                i32 = i18;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (i23) {
                            case 32:
                                bArrA3 = a(4, 4, xVar);
                                break;
                            case 33:
                                bArrA = a(4, 8, xVar);
                                break;
                            case 34:
                                bArrA2 = a(16, 8, xVar);
                                break;
                            default:
                                continue;
                        }
                        break;
                }
                i20 = i10;
            } else {
                i21 += 2;
                i20 = i8;
            }
        }
    }

    public static b f(x xVar, int i7) {
        int[] iArr;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 8;
        int i14 = xVar.i(8);
        xVar.r(8);
        int i15 = 2;
        int i16 = i7 - 2;
        int i17 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrB = b();
        int[] iArrC = c();
        while (i16 > 0) {
            int i18 = xVar.i(i13);
            int i19 = xVar.i(i13);
            if ((i19 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (i19 & 64) != 0 ? iArrB : iArrC;
            }
            if ((i19 & 1) != 0) {
                i11 = xVar.i(i13);
                i12 = xVar.i(i13);
                i8 = xVar.i(i13);
                i10 = xVar.i(i13);
                i9 = i16 - 6;
            } else {
                int i20 = xVar.i(6) << i15;
                int i21 = xVar.i(4) << 4;
                i8 = xVar.i(4) << 4;
                i9 = i16 - 4;
                i10 = xVar.i(i15) << 6;
                i11 = i20;
                i12 = i21;
            }
            if (i11 == 0) {
                i12 = i17;
                i8 = i12;
                i10 = 255;
            }
            double d7 = i11;
            double d8 = i12 - 128;
            double d9 = i8 - 128;
            iArr[i18] = d((byte) (255 - (i10 & 255)), t.j((int) ((1.402d * d8) + d7), 0, 255), t.j((int) ((d7 - (0.34414d * d9)) - (d8 * 0.71414d)), 0, 255), t.j((int) ((d9 * 1.772d) + d7), 0, 255));
            i16 = i9;
            i17 = 0;
            i14 = i14;
            iArrC = iArrC;
            i13 = 8;
            i15 = 2;
        }
        return new b(i14, iArr2, iArrB, iArrC);
    }

    public static d g(x xVar) {
        byte[] bArr;
        int i7 = xVar.i(16);
        xVar.r(4);
        int i8 = xVar.i(2);
        boolean zH = xVar.h();
        xVar.r(1);
        byte[] bArr2 = t.f17164f;
        if (i8 != 1) {
            if (i8 == 0) {
                int i9 = xVar.i(16);
                int i10 = xVar.i(16);
                if (i9 > 0) {
                    bArr2 = new byte[i9];
                    xVar.k(i9, bArr2);
                }
                if (i10 > 0) {
                    bArr = new byte[i10];
                    xVar.k(i10, bArr);
                }
            }
            return new d(i7, zH, bArr2, bArr);
        }
        xVar.r(xVar.i(8) * 16);
        bArr = bArr2;
        return new d(i7, zH, bArr2, bArr);
    }
}
