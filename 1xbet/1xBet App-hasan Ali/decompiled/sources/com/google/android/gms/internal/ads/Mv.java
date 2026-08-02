package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class Mv {

    /* renamed from: a, reason: collision with root package name */
    public final String f10743a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f10744b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10745c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10746d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10747e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f10748g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f10749h;
    public final boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Mv(String str, char[] cArr) {
        this(str, cArr, r2, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c5 = cArr[i];
            if (!(c5 < 128)) {
                throw new IllegalArgumentException(AbstractC0952et.F("Non-ASCII character: %s", Character.valueOf(c5)));
            }
            if (!(bArr[c5] == -1)) {
                throw new IllegalArgumentException(AbstractC0952et.F("Duplicate character: %s", Character.valueOf(c5)));
            }
            bArr[c5] = (byte) i;
        }
    }

    public final int a(char c5) {
        if (c5 > 127) {
            throw new Pv("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c5))));
        }
        byte b3 = this.f10748g[c5];
        if (b3 != -1) {
            return b3;
        }
        if (c5 <= ' ' || c5 == 127) {
            throw new Pv("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c5))));
        }
        throw new Pv("Unrecognized character: " + c5);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Mv)) {
            return false;
        }
        Mv mv = (Mv) obj;
        return this.i == mv.i && Arrays.equals(this.f10744b, mv.f10744b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10744b) + (true != this.i ? 1237 : 1231);
    }

    public final String toString() {
        return this.f10743a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067 A[LOOP:0: B:13:0x0063->B:15:0x0067, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Mv(String str, char[] cArr, byte[] bArr, boolean z3) {
        int numberOfLeadingZeros;
        this.f10743a = str;
        cArr.getClass();
        this.f10744b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (Wv.f12124a[roundingMode.ordinal()]) {
                    case 1:
                        AbstractC0952et.J(((length + (-1)) & length) == 0);
                    case 2:
                    case 3:
                        numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                        this.f10746d = numberOfLeadingZeros;
                        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                        int i = 1 << (3 - numberOfTrailingZeros);
                        this.f10747e = i;
                        this.f = numberOfLeadingZeros >> numberOfTrailingZeros;
                        this.f10745c = length - 1;
                        this.f10748g = bArr;
                        boolean[] zArr = new boolean[i];
                        for (int i5 = 0; i5 < this.f; i5++) {
                            int i6 = this.f10746d;
                            RoundingMode roundingMode2 = RoundingMode.CEILING;
                            zArr[AbstractC0952et.y(i5 * 8, i6)] = true;
                        }
                        this.f10749h = zArr;
                        this.i = z3;
                        return;
                    case 4:
                    case 5:
                        numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                        this.f10746d = numberOfLeadingZeros;
                        int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                        int i7 = 1 << (3 - numberOfTrailingZeros2);
                        this.f10747e = i7;
                        this.f = numberOfLeadingZeros >> numberOfTrailingZeros2;
                        this.f10745c = length - 1;
                        this.f10748g = bArr;
                        boolean[] zArr2 = new boolean[i7];
                        while (i5 < this.f) {
                        }
                        this.f10749h = zArr2;
                        this.i = z3;
                        return;
                    case 6:
                    case 7:
                    case 8:
                        int numberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        numberOfLeadingZeros = (31 - numberOfLeadingZeros2) + ((((-1257966797) >>> numberOfLeadingZeros2) - length) >>> 31);
                        this.f10746d = numberOfLeadingZeros;
                        int numberOfTrailingZeros22 = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                        int i72 = 1 << (3 - numberOfTrailingZeros22);
                        this.f10747e = i72;
                        this.f = numberOfLeadingZeros >> numberOfTrailingZeros22;
                        this.f10745c = length - 1;
                        this.f10748g = bArr;
                        boolean[] zArr22 = new boolean[i72];
                        while (i5 < this.f) {
                        }
                        this.f10749h = zArr22;
                        this.i = z3;
                        return;
                    default:
                        throw new AssertionError();
                }
            } else {
                throw new IllegalArgumentException("x (0) must be > 0");
            }
        } catch (ArithmeticException e3) {
            throw new IllegalArgumentException(AbstractC2107A.q("Illegal alphabet length ", cArr.length), e3);
        }
    }
}
