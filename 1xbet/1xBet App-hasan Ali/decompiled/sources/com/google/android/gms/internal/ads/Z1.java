package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class Z1 implements P1, InterfaceC1852yw {

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f12435r = {0, 7, 8, 15};

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f12436s = {0, 119, -120, -1};

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f12437t = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: k, reason: collision with root package name */
    public Object f12438k;

    /* renamed from: l, reason: collision with root package name */
    public Object f12439l;

    /* renamed from: m, reason: collision with root package name */
    public Object f12440m;

    /* renamed from: n, reason: collision with root package name */
    public Object f12441n;

    /* renamed from: o, reason: collision with root package name */
    public Object f12442o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f12443p;

    /* renamed from: q, reason: collision with root package name */
    public Object f12444q;

    public /* synthetic */ Z1(Context context, Q4 q42, U2.a aVar, G.v vVar, BinderC0857cn binderC0857cn, Xq xq, String str) {
        this.f12438k = context;
        this.f12439l = q42;
        this.f12440m = aVar;
        this.f12441n = vVar;
        this.f12442o = binderC0857cn;
        this.f12443p = xq;
        this.f12444q = str;
    }

    public static int b(int i, int i5, int i6, int i7) {
        return (i << 24) | (i5 << 16) | (i6 << 8) | i7;
    }

    public static S1 c(C0826c0 c0826c0, int i) {
        int f;
        int f5;
        int i5;
        int i6;
        int i7 = 8;
        int f6 = c0826c0.f(8);
        c0826c0.u(8);
        int i8 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] h3 = h();
        int[] i9 = i();
        int i10 = i - 2;
        while (i10 > 0) {
            int f7 = c0826c0.f(i7);
            int f8 = c0826c0.f(i7);
            int[] iArr2 = (f8 & 128) != 0 ? iArr : (f8 & 64) != 0 ? h3 : i9;
            if ((f8 & 1) != 0) {
                i5 = c0826c0.f(i7);
                i6 = c0826c0.f(i7);
                f = c0826c0.f(i7);
                f5 = c0826c0.f(i7);
                i10 -= 6;
            } else {
                int f9 = c0826c0.f(6) << 2;
                int f10 = c0826c0.f(4) << 4;
                i10 -= 4;
                f = c0826c0.f(4) << 4;
                f5 = c0826c0.f(2) << 6;
                i5 = f9;
                i6 = f10;
            }
            if (i5 == 0) {
                f5 = 255;
            }
            if (i5 == 0) {
                f = i8;
            }
            if (i5 == 0) {
                i6 = i8;
            }
            double d5 = i5;
            double d6 = i6 - 128;
            double d7 = f - 128;
            iArr2[f7] = b((byte) (255 - (f5 & 255)), Math.max(0, Math.min((int) ((1.402d * d6) + d5), 255)), Math.max(0, Math.min((int) ((d5 - (0.34414d * d7)) - (d6 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d7 * 1.772d) + d5), 255)));
            i8 = 0;
            f6 = f6;
            i9 = i9;
            i7 = 8;
        }
        return new S1(f6, iArr, h3, i9);
    }

    public static U1 d(C0826c0 c0826c0) {
        byte[] bArr;
        int f = c0826c0.f(16);
        c0826c0.u(4);
        int f5 = c0826c0.f(2);
        boolean w5 = c0826c0.w();
        c0826c0.u(1);
        byte[] bArr2 = AbstractC1260lo.f;
        if (f5 == 1) {
            c0826c0.u(c0826c0.f(8) * 16);
        } else if (f5 == 0) {
            int f6 = c0826c0.f(16);
            int f7 = c0826c0.f(16);
            if (f6 > 0) {
                bArr2 = new byte[f6];
                AbstractC1668us.a0(c0826c0.f12945d == 0);
                System.arraycopy(c0826c0.f12943b, c0826c0.f12944c, bArr2, 0, f6);
                c0826c0.f12944c += f6;
                c0826c0.x();
            }
            if (f7 > 0) {
                bArr = new byte[f7];
                AbstractC1668us.a0(c0826c0.f12945d == 0);
                System.arraycopy(c0826c0.f12943b, c0826c0.f12944c, bArr, 0, f7);
                c0826c0.f12944c += f7;
                c0826c0.x();
                return new U1(f, w5, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new U1(f, w5, bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ff A[LOOP:3: B:82:0x0164->B:94:0x01ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(byte[] bArr, int[] iArr, int i, int i5, int i6, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        boolean z3;
        int f;
        char c5;
        boolean z5;
        int i7;
        int i8;
        int f5;
        int i9;
        boolean z6;
        int i10;
        int f6;
        int f7;
        int i11;
        int i12;
        boolean z7;
        int f8;
        Paint paint2 = paint;
        C0826c0 c0826c0 = new C0826c0(bArr.length, bArr);
        int i13 = i5;
        int i14 = i6;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (c0826c0.a() != 0) {
            int f9 = c0826c0.f(8);
            if (f9 != 240) {
                int i15 = 3;
                int i16 = 4;
                switch (f9) {
                    case 16:
                        if (i != 3) {
                            if (i != 2) {
                                bArr2 = null;
                            } else if (bArr6 == null) {
                                bArr3 = f12435r;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr6;
                            }
                            z3 = false;
                            while (true) {
                                f = c0826c0.f(2);
                                if (f != 0) {
                                }
                                c5 = 4;
                                if (i8 != 0) {
                                }
                                i9 = i13;
                                i13 = i9 + i8;
                                if (!z5) {
                                }
                                paint2 = paint;
                                z3 = z5;
                            }
                        } else if (bArr4 == null) {
                            bArr3 = f12436s;
                            bArr2 = bArr3;
                            z3 = false;
                            while (true) {
                                f = c0826c0.f(2);
                                if (f != 0) {
                                    z5 = z3;
                                    i7 = f;
                                    i8 = 1;
                                } else {
                                    if (c0826c0.w()) {
                                        f5 = c0826c0.f(3) + 3;
                                        i7 = c0826c0.f(2);
                                    } else if (c0826c0.w()) {
                                        z5 = z3;
                                        i8 = 1;
                                        i7 = 0;
                                    } else {
                                        int f10 = c0826c0.f(2);
                                        if (f10 == 0) {
                                            c5 = 4;
                                            z5 = true;
                                            i7 = 0;
                                            i8 = 0;
                                        } else if (f10 == 1) {
                                            c5 = 4;
                                            z5 = z3;
                                            i8 = 2;
                                            i7 = 0;
                                        } else if (f10 == 2) {
                                            c5 = 4;
                                            z5 = z3;
                                            i8 = c0826c0.f(4) + 12;
                                            i7 = c0826c0.f(2);
                                        } else if (f10 != 3) {
                                            z5 = z3;
                                            i7 = 0;
                                            i8 = 0;
                                        } else {
                                            f5 = c0826c0.f(8) + 29;
                                            i7 = c0826c0.f(2);
                                        }
                                        if (i8 != 0 || paint2 == null) {
                                            i9 = i13;
                                        } else {
                                            int i17 = i14 + 1;
                                            float f11 = i14;
                                            if (bArr2 != 0) {
                                                i7 = bArr2[i7];
                                            }
                                            paint2.setColor(iArr[i7]);
                                            i9 = i13;
                                            canvas.drawRect(i13, f11, i13 + i8, i17, paint2);
                                        }
                                        i13 = i9 + i8;
                                        if (!z5) {
                                            c0826c0.j();
                                            break;
                                        } else {
                                            paint2 = paint;
                                            z3 = z5;
                                        }
                                    }
                                    z5 = z3;
                                    i8 = f5;
                                }
                                c5 = 4;
                                if (i8 != 0) {
                                }
                                i9 = i13;
                                i13 = i9 + i8;
                                if (!z5) {
                                }
                            }
                        } else {
                            bArr2 = bArr4;
                            z3 = false;
                            while (true) {
                                f = c0826c0.f(2);
                                if (f != 0) {
                                }
                                c5 = 4;
                                if (i8 != 0) {
                                }
                                i9 = i13;
                                i13 = i9 + i8;
                                if (!z5) {
                                }
                                paint2 = paint;
                                z3 = z5;
                            }
                        }
                    case 17:
                        byte[] bArr7 = i == 3 ? bArr5 == null ? f12437t : bArr5 : null;
                        boolean z8 = false;
                        while (true) {
                            int f12 = c0826c0.f(i16);
                            if (f12 != 0) {
                                z6 = z8;
                                i10 = 1;
                            } else if (c0826c0.w()) {
                                if (c0826c0.w()) {
                                    int f13 = c0826c0.f(2);
                                    if (f13 == 0) {
                                        z6 = z8;
                                        i10 = 1;
                                    } else if (f13 == 1) {
                                        z6 = z8;
                                        i10 = 2;
                                    } else if (f13 == 2) {
                                        f6 = c0826c0.f(i16) + 9;
                                        f7 = c0826c0.f(i16);
                                    } else if (f13 != i15) {
                                        z6 = z8;
                                        f12 = 0;
                                        i10 = 0;
                                    } else {
                                        f6 = c0826c0.f(8) + 25;
                                        f7 = c0826c0.f(i16);
                                    }
                                    f12 = 0;
                                } else {
                                    f6 = c0826c0.f(2) + i16;
                                    f7 = c0826c0.f(i16);
                                }
                                i10 = f6;
                                f12 = f7;
                                z6 = z8;
                            } else {
                                int f14 = c0826c0.f(i15);
                                if (f14 != 0) {
                                    z6 = z8;
                                    i10 = f14 + 2;
                                    f12 = 0;
                                } else {
                                    z6 = true;
                                    f12 = 0;
                                    i10 = 0;
                                }
                            }
                            if (i10 == 0 || paint2 == null) {
                                i11 = i13;
                                i12 = i15;
                            } else {
                                int i18 = i14 + 1;
                                int i19 = i15;
                                float f15 = i14;
                                if (bArr7 != 0) {
                                    f12 = bArr7[f12];
                                }
                                paint2.setColor(iArr[f12]);
                                i12 = i19;
                                i11 = i13;
                                canvas.drawRect(i13, f15, i13 + i10, i18, paint2);
                            }
                            i13 = i11 + i10;
                            if (z6) {
                                c0826c0.j();
                                continue;
                            } else {
                                i15 = i12;
                                z8 = z6;
                                i16 = 4;
                            }
                        }
                    case 18:
                        int i20 = i13;
                        boolean z9 = false;
                        while (true) {
                            int f16 = c0826c0.f(8);
                            if (f16 != 0) {
                                z7 = z9;
                                f8 = 1;
                            } else if (c0826c0.w()) {
                                z7 = z9;
                                f8 = c0826c0.f(7);
                                f16 = c0826c0.f(8);
                            } else {
                                int f17 = c0826c0.f(7);
                                if (f17 != 0) {
                                    z7 = z9;
                                    f8 = f17;
                                    f16 = 0;
                                } else {
                                    z7 = true;
                                    f16 = 0;
                                    f8 = 0;
                                }
                            }
                            if (f8 != 0 && paint2 != null) {
                                paint2.setColor(iArr[f16]);
                                canvas.drawRect(i20, i14, i20 + f8, i14 + 1, paint2);
                            }
                            i20 += f8;
                            if (z7) {
                                i13 = i20;
                                continue;
                            } else {
                                z9 = z7;
                            }
                        }
                    default:
                        switch (f9) {
                            case 32:
                                bArr6 = g(4, 4, c0826c0);
                                break;
                            case 33:
                                bArr4 = g(4, 8, c0826c0);
                                break;
                            case 34:
                                bArr5 = g(16, 8, c0826c0);
                                break;
                            default:
                                continue;
                        }
                }
            } else {
                i14 += 2;
                i13 = i5;
            }
            paint2 = paint;
        }
    }

    public static byte[] g(int i, int i5, C0826c0 c0826c0) {
        byte[] bArr = new byte[i];
        for (int i6 = 0; i6 < i; i6++) {
            bArr[i6] = (byte) c0826c0.f(i5);
        }
        return bArr;
    }

    public static int[] h() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i5 = i & 4;
            int i6 = i & 2;
            int i7 = i & 1;
            if (i < 8) {
                iArr[i] = b(255, 1 != i7 ? 0 : 255, i6 != 0 ? 255 : 0, i5 != 0 ? 255 : 0);
            } else {
                iArr[i] = b(255, 1 != i7 ? 0 : 127, i6 != 0 ? 127 : 0, i5 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] i() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = b(63, 1 != (i & 1) ? 0 : 255, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i5 = i & 136;
                if (i5 == 0) {
                    iArr[i] = b(255, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i5 == 8) {
                    iArr[i] = b(127, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i5 == 128) {
                    iArr[i] = b(255, (1 != (i & 1) ? 0 : 43) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i5 == 136) {
                    iArr[i] = b(255, (1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1852yw, com.google.android.gms.internal.ads.InterfaceC1805xu
    /* renamed from: a */
    public E3.a mo12a() {
        V9 v9 = P2.o.f4767B.f4772d;
        C1586t c1586t = new C1586t(0, 0, 0);
        C1773x6 c1773x6 = new C1773x6();
        Context context = (Context) this.f12438k;
        U2.a aVar = (U2.a) this.f12440m;
        InterfaceC0677Re f = V9.f((G.v) this.f12441n, aVar, context, c1586t, (Q4) this.f12439l, c1773x6, null, (BinderC0857cn) this.f12442o, null, null, (Xq) this.f12443p, null, "", false, false);
        C1548s6 c1548s6 = new C1548s6(f);
        f.I().f13619q = new C0712We(c1548s6, 0);
        f.loadUrl((String) this.f12444q);
        return c1548s6;
    }

    @Override // com.google.android.gms.internal.ads.P1
    public void f(byte[] bArr, int i, int i5, Q1 q12) {
        Y1 y12;
        L1 l12;
        int i6;
        char c5;
        char c6;
        char c7;
        int i7;
        int i8;
        Y1 y13;
        Canvas canvas;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        W1 w12;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z3 = true;
        C0826c0 c0826c0 = new C0826c0(i + i5, bArr);
        c0826c0.s(i);
        while (true) {
            int a5 = c0826c0.a();
            y12 = (Y1) this.f12443p;
            if (a5 >= 48 && c0826c0.f(8) == 15) {
                int f = c0826c0.f(8);
                int f5 = c0826c0.f(16);
                int f6 = c0826c0.f(16);
                int c8 = c0826c0.c() + f6;
                if (f6 * 8 > c0826c0.a()) {
                    JB.l("DvbParser", "Data field length exceeds limit");
                    c0826c0.u(c0826c0.a());
                } else {
                    switch (f) {
                        case 16:
                            if (f5 == y12.f12269a) {
                                C0783b1 c0783b1 = y12.i;
                                c0826c0.f(8);
                                int f7 = c0826c0.f(4);
                                int f8 = c0826c0.f(2);
                                c0826c0.u(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i18 = f6 - 2; i18 > 0; i18 -= 6) {
                                    int f9 = c0826c0.f(8);
                                    c0826c0.u(8);
                                    sparseArray.put(f9, new V1(c0826c0.f(16), c0826c0.f(16)));
                                }
                                C0783b1 c0783b12 = new C0783b1();
                                c0783b12.f12751k = f7;
                                c0783b12.f12752l = f8;
                                c0783b12.f12753m = sparseArray;
                                if (f8 != 0) {
                                    y12.i = c0783b12;
                                    y12.f12271c.clear();
                                    y12.f12272d.clear();
                                    y12.f12273e.clear();
                                    break;
                                } else if (c0783b1 != null && c0783b1.f12751k != f7) {
                                    y12.i = c0783b12;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            C0783b1 c0783b13 = y12.i;
                            if (f5 == y12.f12269a && c0783b13 != null) {
                                int f10 = c0826c0.f(8);
                                c0826c0.u(4);
                                boolean w5 = c0826c0.w();
                                c0826c0.u(3);
                                int f11 = c0826c0.f(16);
                                int f12 = c0826c0.f(16);
                                c0826c0.f(3);
                                int f13 = c0826c0.f(3);
                                c0826c0.u(2);
                                int f14 = c0826c0.f(8);
                                int f15 = c0826c0.f(8);
                                int f16 = c0826c0.f(4);
                                int f17 = c0826c0.f(2);
                                c0826c0.u(2);
                                int i19 = f6 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i19 > 0) {
                                    int f18 = c0826c0.f(16);
                                    int f19 = c0826c0.f(2);
                                    c0826c0.f(2);
                                    int f20 = c0826c0.f(12);
                                    c0826c0.u(4);
                                    int f21 = c0826c0.f(12);
                                    int i20 = i19 - 6;
                                    if (f19 == 1 || f19 == 2) {
                                        c0826c0.f(8);
                                        c0826c0.f(8);
                                        i19 -= 8;
                                    } else {
                                        i19 = i20;
                                    }
                                    sparseArray2.put(f18, new X1(f20, f21));
                                }
                                W1 w13 = new W1(f10, w5, f11, f12, f13, f14, f15, f16, f17, sparseArray2);
                                SparseArray sparseArray3 = y12.f12271c;
                                if (c0783b13.f12752l == 0 && (w12 = (W1) sparseArray3.get(f10)) != null) {
                                    int i21 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = w12.f11985j;
                                        if (i21 < sparseArray4.size()) {
                                            w13.f11985j.put(sparseArray4.keyAt(i21), (X1) sparseArray4.valueAt(i21));
                                            i21++;
                                        }
                                    }
                                }
                                sparseArray3.put(w13.f11978a, w13);
                                break;
                            }
                            break;
                        case 18:
                            if (f5 == y12.f12269a) {
                                S1 c9 = c(c0826c0, f6);
                                y12.f12272d.put(c9.f11483a, c9);
                                break;
                            } else if (f5 == y12.f12270b) {
                                S1 c10 = c(c0826c0, f6);
                                y12.f.put(c10.f11483a, c10);
                                break;
                            }
                            break;
                        case 19:
                            if (f5 == y12.f12269a) {
                                U1 d5 = d(c0826c0);
                                y12.f12273e.put(d5.f11708a, d5);
                                break;
                            } else if (f5 == y12.f12270b) {
                                U1 d6 = d(c0826c0);
                                y12.f12274g.put(d6.f11708a, d6);
                                break;
                            }
                            break;
                        case 20:
                            if (f5 == y12.f12269a) {
                                c0826c0.u(4);
                                boolean w6 = c0826c0.w();
                                c0826c0.u(3);
                                int f22 = c0826c0.f(16);
                                int f23 = c0826c0.f(16);
                                if (w6) {
                                    int f24 = c0826c0.f(16);
                                    int f25 = c0826c0.f(16);
                                    int f26 = c0826c0.f(16);
                                    i14 = f25;
                                    i15 = c0826c0.f(16);
                                    i17 = f26;
                                    i16 = f24;
                                } else {
                                    i14 = f22;
                                    i15 = f23;
                                    i16 = 0;
                                    i17 = 0;
                                }
                                y12.f12275h = new T1(f22, f23, i16, i14, i17, i15);
                                break;
                            }
                            break;
                    }
                    c0826c0.v(c8 - c0826c0.c());
                }
            }
        }
        C0783b1 c0783b14 = y12.i;
        if (c0783b14 == null) {
            C0954ev c0954ev = AbstractC1044gv.f13676l;
            l12 = new L1(C1761wv.f16184o, -9223372036854775807L, -9223372036854775807L);
        } else {
            T1 t12 = y12.f12275h;
            if (t12 == null) {
                t12 = (T1) this.f12441n;
            }
            Bitmap bitmap = (Bitmap) this.f12444q;
            Canvas canvas2 = (Canvas) this.f12440m;
            if (bitmap == null || t12.f11610a + 1 != bitmap.getWidth() || t12.f11611b + 1 != ((Bitmap) this.f12444q).getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(t12.f11610a + 1, t12.f11611b + 1, Bitmap.Config.ARGB_8888);
                this.f12444q = createBitmap;
                canvas2.setBitmap(createBitmap);
            }
            ArrayList arrayList = new ArrayList();
            int i22 = 0;
            while (true) {
                SparseArray sparseArray5 = (SparseArray) c0783b14.f12753m;
                if (i22 < sparseArray5.size()) {
                    canvas2.save();
                    V1 v12 = (V1) sparseArray5.valueAt(i22);
                    W1 w14 = (W1) y12.f12271c.get(sparseArray5.keyAt(i22));
                    int i23 = v12.f11852a + t12.f11612c;
                    int i24 = v12.f11853b + t12.f11614e;
                    int min = Math.min(w14.f11980c + i23, t12.f11613d);
                    int i25 = w14.f11981d;
                    int i26 = i24 + i25;
                    boolean z5 = z3;
                    canvas2.clipRect(i23, i24, min, Math.min(i26, t12.f));
                    SparseArray sparseArray6 = y12.f12272d;
                    int i27 = w14.f;
                    S1 s12 = (S1) sparseArray6.get(i27);
                    if (s12 == null && (s12 = (S1) y12.f.get(i27)) == null) {
                        s12 = (S1) this.f12442o;
                    }
                    int i28 = 0;
                    while (true) {
                        SparseArray sparseArray7 = w14.f11985j;
                        if (i28 < sparseArray7.size()) {
                            int keyAt = sparseArray7.keyAt(i28);
                            X1 x12 = (X1) sparseArray7.valueAt(i28);
                            C0783b1 c0783b15 = c0783b14;
                            U1 u12 = (U1) y12.f12273e.get(keyAt);
                            if (u12 == null) {
                                u12 = (U1) y12.f12274g.get(keyAt);
                            }
                            if (u12 != null) {
                                Paint paint = u12.f11709b ? null : (Paint) this.f12438k;
                                i8 = i22;
                                int i29 = x12.f12135a + i23;
                                int i30 = x12.f12136b + i24;
                                int i31 = i23;
                                int i32 = w14.f11982e;
                                canvas = canvas2;
                                int i33 = i24;
                                int[] iArr = i32 == 3 ? s12.f11486d : i32 == 2 ? s12.f11485c : s12.f11484b;
                                i10 = i31;
                                i11 = i28;
                                y13 = y12;
                                i13 = i26;
                                Paint paint2 = paint;
                                i9 = i33;
                                i12 = i25;
                                e(u12.f11710c, iArr, i32, i29, i30, paint2, canvas);
                                e(u12.f11711d, iArr, i32, i29, i30 + 1, paint2, canvas);
                            } else {
                                i8 = i22;
                                y13 = y12;
                                canvas = canvas2;
                                i9 = i24;
                                i10 = i23;
                                i11 = i28;
                                i12 = i25;
                                i13 = i26;
                            }
                            i28 = i11 + 1;
                            i23 = i10;
                            i24 = i9;
                            i26 = i13;
                            i25 = i12;
                            canvas2 = canvas;
                            c0783b14 = c0783b15;
                            i22 = i8;
                            y12 = y13;
                        } else {
                            C0783b1 c0783b16 = c0783b14;
                            int i34 = i22;
                            Y1 y14 = y12;
                            Canvas canvas3 = canvas2;
                            int i35 = i24;
                            int i36 = i23;
                            int i37 = i25;
                            int i38 = i26;
                            float f27 = i35;
                            float f28 = i36;
                            boolean z6 = w14.f11979b;
                            int i39 = w14.f11980c;
                            if (z6) {
                                int i40 = w14.f11982e;
                                if (i40 == 3) {
                                    i7 = s12.f11486d[w14.f11983g];
                                    c7 = 2;
                                } else {
                                    c7 = 2;
                                    i7 = i40 == 2 ? s12.f11485c[w14.f11984h] : s12.f11484b[w14.i];
                                }
                                Paint paint3 = (Paint) this.f12439l;
                                paint3.setColor(i7);
                                float f29 = i36 + i39;
                                float f30 = i38;
                                c5 = 3;
                                c6 = c7;
                                i6 = i39;
                                canvas2 = canvas3;
                                canvas2.drawRect(f28, f27, f29, f30, paint3);
                            } else {
                                i6 = i39;
                                canvas2 = canvas3;
                                c5 = 3;
                                c6 = 2;
                            }
                            Bitmap createBitmap2 = Bitmap.createBitmap((Bitmap) this.f12444q, i36, i35, i6, i37);
                            float f31 = t12.f11610a;
                            float f32 = t12.f11611b;
                            arrayList.add(new C1881zg(null, null, null, createBitmap2, f27 / f32, 0, 0, f28 / f31, 0, Integer.MIN_VALUE, -3.4028235E38f, i6 / f31, i37 / f32, Integer.MIN_VALUE, 0.0f));
                            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas2.restore();
                            i22 = i34 + 1;
                            z3 = z5;
                            c0783b14 = c0783b16;
                            y12 = y14;
                        }
                    }
                } else {
                    l12 = new L1(arrayList, -9223372036854775807L, -9223372036854775807L);
                }
            }
        }
        q12.mo11k(l12);
    }

    public Z1() {
        this.f12443p = new r.Q(0);
        this.f12444q = new r.Q(0);
    }

    public Z1(C1748wi c1748wi, WebView webView, String str, String str2, EnumC1848ys enumC1848ys) {
        this.f12440m = new ArrayList();
        this.f12441n = new HashMap();
        this.f12438k = c1748wi;
        this.f12439l = webView;
        this.f12444q = enumC1848ys;
        this.f12443p = str;
        this.f12442o = str2;
    }

    public Z1(List list) {
        C1617tm c1617tm = new C1617tm((byte[]) list.get(0));
        int z3 = c1617tm.z();
        int z5 = c1617tm.z();
        Paint paint = new Paint();
        this.f12438k = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f12439l = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f12440m = new Canvas();
        this.f12441n = new T1(719, 575, 0, 719, 0, 575);
        this.f12442o = new S1(0, new int[]{0, -1, -16777216, -8421505}, h(), i());
        this.f12443p = new Y1(z3, z5);
    }
}
