package l2;

import F1.x;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import v2.t;

/* renamed from: l2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1387i {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f14913h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f14914i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f14915a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f14916b;

    /* renamed from: c, reason: collision with root package name */
    public final Canvas f14917c;

    /* renamed from: d, reason: collision with root package name */
    public final C1381c f14918d;

    /* renamed from: e, reason: collision with root package name */
    public final C1380b f14919e;

    /* renamed from: f, reason: collision with root package name */
    public final C1386h f14920f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f14921g;

    public C1387i(int i7, int i8) {
        Paint paint = new Paint();
        this.f14915a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f14916b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f14917c = new Canvas();
        this.f14918d = new C1381c(719, 575, 0, 719, 0, 575);
        this.f14919e = new C1380b(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f14920f = new C1386h(i7, i8);
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x0224 A[LOOP:3: B:89:0x0172->B:100:0x0224, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x021f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f1 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(byte[] bArr, int[] iArr, int i7, int i8, int i9, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i10;
        int i11;
        int i12;
        char c3;
        char c4;
        int i13;
        int i14;
        int i15;
        byte[] bArr4;
        int i16;
        boolean z4;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        x xVar = new x(bArr, bArr.length);
        int i24 = i8;
        int i25 = i9;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (xVar.b() != 0) {
            int i26 = 8;
            int i27 = xVar.i(8);
            if (i27 != 240) {
                int i28 = 1;
                int i29 = 3;
                int i30 = 4;
                switch (i27) {
                    case 16:
                        int i31 = 1;
                        if (i7 == 3) {
                            bArr3 = bArr5 == null ? f14914i : bArr5;
                        } else if (i7 == 2) {
                            bArr3 = bArr7 == null ? f14913h : bArr7;
                        } else {
                            bArr2 = null;
                            i10 = i24;
                            i11 = 0;
                            while (true) {
                                i12 = xVar.i(2);
                                if (i12 == 0) {
                                    i14 = i31;
                                    i13 = i11;
                                } else if (xVar.h()) {
                                    i13 = i11;
                                    i14 = xVar.i(3) + 3;
                                    i12 = xVar.i(2);
                                } else if (xVar.h()) {
                                    i14 = i31;
                                    i13 = i11;
                                    i12 = 0;
                                } else {
                                    int i32 = xVar.i(2);
                                    if (i32 == 0) {
                                        c3 = 4;
                                        c4 = '\b';
                                        i13 = i31;
                                        i12 = 0;
                                        i14 = 0;
                                    } else if (i32 == i31) {
                                        c3 = 4;
                                        c4 = '\b';
                                        i13 = i11;
                                        i14 = 2;
                                        i12 = 0;
                                    } else if (i32 == 2) {
                                        c3 = 4;
                                        c4 = '\b';
                                        i13 = i11;
                                        i14 = xVar.i(4) + 12;
                                        i12 = xVar.i(2);
                                    } else if (i32 != 3) {
                                        i13 = i11;
                                        i12 = 0;
                                        i14 = 0;
                                    } else {
                                        c4 = '\b';
                                        i13 = i11;
                                        i14 = xVar.i(8) + 29;
                                        i12 = xVar.i(2);
                                        c3 = 4;
                                    }
                                    if (i14 != 0 || paint == null) {
                                        i15 = i10;
                                    } else {
                                        if (bArr2 != 0) {
                                            i12 = bArr2[i12];
                                        }
                                        paint.setColor(iArr[i12]);
                                        i15 = i10;
                                        canvas.drawRect(i10, i25, i10 + i14, i25 + 1, paint);
                                    }
                                    i10 = i15 + i14;
                                    if (i13 != 0) {
                                        xVar.c();
                                        break;
                                    } else {
                                        i11 = i13;
                                        i31 = 1;
                                    }
                                }
                                c3 = 4;
                                c4 = '\b';
                                if (i14 != 0) {
                                }
                                i15 = i10;
                                i10 = i15 + i14;
                                if (i13 != 0) {
                                }
                            }
                        }
                        bArr2 = bArr3;
                        i10 = i24;
                        i11 = 0;
                        while (true) {
                            i12 = xVar.i(2);
                            if (i12 == 0) {
                            }
                            c3 = 4;
                            c4 = '\b';
                            if (i14 != 0) {
                            }
                            i15 = i10;
                            i10 = i15 + i14;
                            if (i13 != 0) {
                            }
                            i11 = i13;
                            i31 = 1;
                        }
                    case 17:
                        if (i7 == 3) {
                            bArr4 = bArr6 == null ? j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        i10 = i24;
                        boolean z7 = false;
                        while (true) {
                            int i33 = xVar.i(i30);
                            if (i33 != 0) {
                                i16 = 1;
                                z4 = z7;
                            } else if (xVar.h()) {
                                if (xVar.h()) {
                                    int i34 = xVar.i(2);
                                    if (i34 == 0) {
                                        i16 = 1;
                                        z4 = z7;
                                    } else if (i34 == 1) {
                                        z4 = z7;
                                        i16 = 2;
                                    } else if (i34 == 2) {
                                        i17 = xVar.i(i30) + 9;
                                        i18 = xVar.i(i30);
                                    } else if (i34 != i29) {
                                        z4 = z7;
                                        i33 = 0;
                                        i16 = 0;
                                    } else {
                                        i17 = xVar.i(i26) + 25;
                                        i18 = xVar.i(i30);
                                    }
                                    i33 = 0;
                                } else {
                                    i17 = xVar.i(2) + i30;
                                    i18 = xVar.i(i30);
                                }
                                z4 = z7;
                                i16 = i17;
                                i33 = i18;
                            } else {
                                int i35 = xVar.i(i29);
                                if (i35 != 0) {
                                    z4 = z7;
                                    i16 = i35 + 2;
                                    i33 = 0;
                                } else {
                                    z4 = true;
                                    i33 = 0;
                                    i16 = 0;
                                }
                            }
                            if (i16 == 0 || paint == null) {
                                i19 = i29;
                                i20 = i10;
                            } else {
                                if (bArr4 != 0) {
                                    i33 = bArr4[i33];
                                }
                                paint.setColor(iArr[i33]);
                                i19 = i29;
                                i20 = i10;
                                canvas.drawRect(i10, i25, i10 + i16, i25 + 1, paint);
                            }
                            i10 = i20 + i16;
                            if (z4) {
                                xVar.c();
                                break;
                            } else {
                                i29 = i19;
                                z7 = z4;
                                i30 = 4;
                                i26 = 8;
                            }
                        }
                    case 18:
                        int i36 = i24;
                        int i37 = 0;
                        while (true) {
                            int i38 = xVar.i(8);
                            if (i38 != 0) {
                                i21 = i37;
                                i22 = i28;
                            } else if (xVar.h()) {
                                i21 = i37;
                                i22 = xVar.i(7);
                                i38 = xVar.i(8);
                            } else {
                                int i39 = xVar.i(7);
                                if (i39 != 0) {
                                    i21 = i37;
                                    i22 = i39;
                                    i38 = 0;
                                } else {
                                    i21 = i28;
                                    i38 = 0;
                                    i22 = 0;
                                }
                            }
                            if (i22 == 0 || paint == null) {
                                i23 = i28;
                            } else {
                                paint.setColor(iArr[i38]);
                                i23 = i28;
                                canvas.drawRect(i36, i25, i36 + i22, i25 + 1, paint);
                            }
                            i36 += i22;
                            if (i21 != 0) {
                                i24 = i36;
                                continue;
                            } else {
                                i28 = i23;
                                i37 = i21;
                            }
                        }
                    default:
                        switch (i27) {
                            case 32:
                                bArr7 = a(4, 4, xVar);
                                break;
                            case 33:
                                bArr5 = a(4, 8, xVar);
                                break;
                            case 34:
                                bArr6 = a(16, 8, xVar);
                                break;
                            default:
                                continue;
                        }
                }
                i24 = i10;
            } else {
                i25 += 2;
                i24 = i8;
            }
        }
    }

    public static C1380b f(x xVar, int i7) {
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
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] b7 = b();
        int[] c3 = c();
        while (i16 > 0) {
            int i18 = xVar.i(i13);
            int i19 = xVar.i(i13);
            int[] iArr2 = (i19 & 128) != 0 ? iArr : (i19 & 64) != 0 ? b7 : c3;
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
            iArr2[i18] = d((byte) (255 - (i10 & 255)), t.j((int) ((1.402d * d8) + d7), 0, 255), t.j((int) ((d7 - (0.34414d * d9)) - (d8 * 0.71414d)), 0, 255), t.j((int) ((d9 * 1.772d) + d7), 0, 255));
            i16 = i9;
            i17 = 0;
            i14 = i14;
            c3 = c3;
            i13 = 8;
            i15 = 2;
        }
        return new C1380b(i14, iArr, b7, c3);
    }

    public static C1382d g(x xVar) {
        byte[] bArr;
        int i7 = xVar.i(16);
        xVar.r(4);
        int i8 = xVar.i(2);
        boolean h6 = xVar.h();
        xVar.r(1);
        byte[] bArr2 = t.f17158f;
        if (i8 == 1) {
            xVar.r(xVar.i(8) * 16);
        } else if (i8 == 0) {
            int i9 = xVar.i(16);
            int i10 = xVar.i(16);
            if (i9 > 0) {
                bArr2 = new byte[i9];
                xVar.k(i9, bArr2);
            }
            if (i10 > 0) {
                bArr = new byte[i10];
                xVar.k(i10, bArr);
                return new C1382d(i7, h6, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C1382d(i7, h6, bArr2, bArr);
    }
}
