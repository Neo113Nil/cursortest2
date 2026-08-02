package M4;

import L4.C0226i;
import L4.D;
import L4.y;
import kotlin.jvm.internal.l;
import o4.AbstractC2223a;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3619a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC2223a.f18653a);
        l.e("getBytes(...)", bytes);
        f3619a = bytes;
    }

    public static final String a(C0226i c0226i, long j5) {
        l.f("<this>", c0226i);
        if (j5 > 0) {
            long j6 = j5 - 1;
            if (c0226i.m(j6) == 13) {
                String H5 = c0226i.H(j6, AbstractC2223a.f18653a);
                c0226i.J(2L);
                return H5;
            }
        }
        String H6 = c0226i.H(j5, AbstractC2223a.f18653a);
        c0226i.J(1L);
        return H6;
    }

    public static final int b(C0226i c0226i, y yVar, boolean z3) {
        int i;
        byte[] bArr;
        int i5;
        int i6;
        D d5;
        byte[] bArr2;
        int i7;
        l.f("<this>", c0226i);
        l.f("options", yVar);
        D d6 = c0226i.f3090k;
        if (d6 == null) {
            return z3 ? -2 : -1;
        }
        int i8 = d6.f3054b;
        int i9 = d6.f3055c;
        byte[] bArr3 = d6.f3053a;
        D d7 = d6;
        int i10 = -1;
        int i11 = 0;
        loop0: while (true) {
            int i12 = i11 + 1;
            int[] iArr = yVar.f3125l;
            int i13 = iArr[i11];
            int i14 = i11 + 2;
            int i15 = iArr[i12];
            if (i15 != -1) {
                i10 = i15;
            }
            if (d7 == null) {
                break;
            }
            if (i13 >= 0) {
                int i16 = i8 + 1;
                int i17 = bArr3[i8] & 255;
                int i18 = i14 + i13;
                while (i14 != i18) {
                    if (i17 == iArr[i14]) {
                        i = iArr[i14 + i13];
                        if (i16 == i9) {
                            d7 = d7.f;
                            l.c(d7);
                            i6 = d7.f3054b;
                            i5 = d7.f3055c;
                            bArr = d7.f3053a;
                            if (d7 == d6) {
                                d7 = null;
                            }
                        } else {
                            bArr = bArr3;
                            i5 = i9;
                            i6 = i16;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        byte[] bArr4 = bArr;
                        i11 = -i;
                        i8 = i6;
                        i9 = i5;
                        bArr3 = bArr4;
                    } else {
                        i14++;
                    }
                }
                break loop0;
            }
            int i19 = (i13 * (-1)) + i14;
            while (true) {
                int i20 = i8 + 1;
                int i21 = i14 + 1;
                if ((bArr3[i8] & 255) != iArr[i14]) {
                    break loop0;
                }
                boolean z5 = i21 == i19;
                if (i20 == i9) {
                    l.c(d7);
                    D d8 = d7.f;
                    l.c(d8);
                    i7 = d8.f3054b;
                    int i22 = d8.f3055c;
                    bArr2 = d8.f3053a;
                    if (d8 != d6) {
                        d5 = d8;
                        i9 = i22;
                    } else {
                        if (!z5) {
                            break loop0;
                        }
                        i9 = i22;
                        d5 = null;
                    }
                } else {
                    d5 = d7;
                    bArr2 = bArr3;
                    i7 = i20;
                }
                if (z5) {
                    i = iArr[i21];
                    int i23 = i7;
                    i5 = i9;
                    i6 = i23;
                    byte[] bArr5 = bArr2;
                    d7 = d5;
                    bArr = bArr5;
                    break;
                }
                i8 = i7;
                bArr3 = bArr2;
                d7 = d5;
                i14 = i21;
            }
        }
        if (z3) {
            return -2;
        }
        return i10;
    }
}
