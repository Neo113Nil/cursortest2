package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import java.util.Arrays;
import java.util.Locale;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.lE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1242lE {

    /* renamed from: h, reason: collision with root package name */
    public static final C1242lE f14331h;

    /* renamed from: a, reason: collision with root package name */
    public final int f14332a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14333b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14334c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f14335d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14336e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public int f14337g;

    static {
        int i = -1;
        f14331h = new C1242lE(1, 2, 3, i, i, null);
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ C1242lE(int i, int i5, int i6, int i7, int i8, byte[] bArr) {
        this.f14332a = i;
        this.f14333b = i5;
        this.f14334c = i6;
        this.f14335d = bArr;
        this.f14336e = i7;
        this.f = i8;
    }

    public static int a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public static boolean e(C1242lE c1242lE) {
        if (c1242lE == null) {
            return true;
        }
        int i = c1242lE.f14332a;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i5 = c1242lE.f14333b;
        if (i5 != -1 && i5 != 2) {
            return false;
        }
        int i6 = c1242lE.f14334c;
        if ((i6 != -1 && i6 != 3) || c1242lE.f14335d != null) {
            return false;
        }
        int i7 = c1242lE.f;
        if (i7 != -1 && i7 != 8) {
            return false;
        }
        int i8 = c1242lE.f14336e;
        return i8 == -1 || i8 == 8;
    }

    public static String f(int i) {
        return i != -1 ? i != 1 ? i != 2 ? AbstractC2107A.q("Undefined color range ", i) : "Limited range" : "Full range" : "Unset color range";
    }

    public static String g(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? AbstractC2107A.q("Undefined color space ", i) : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String h(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? AbstractC2107A.q("Undefined color transfer ", i) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public final String c() {
        String str;
        String str2;
        int i;
        if (d()) {
            String g5 = g(this.f14332a);
            String f = f(this.f14333b);
            String h3 = h(this.f14334c);
            Locale locale = Locale.US;
            str = g5 + "/" + f + "/" + h3;
        } else {
            str = "NA/NA/NA";
        }
        int i5 = this.f14336e;
        if (i5 == -1 || (i = this.f) == -1) {
            str2 = "NA/NA";
        } else {
            str2 = i5 + "/" + i;
        }
        return AbstractC0467k.v(str, "/", str2);
    }

    public final boolean d() {
        return (this.f14332a == -1 || this.f14333b == -1 || this.f14334c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1242lE.class == obj.getClass()) {
            C1242lE c1242lE = (C1242lE) obj;
            if (this.f14332a == c1242lE.f14332a && this.f14333b == c1242lE.f14333b && this.f14334c == c1242lE.f14334c && Arrays.equals(this.f14335d, c1242lE.f14335d) && this.f14336e == c1242lE.f14336e && this.f == c1242lE.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f14337g;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((Arrays.hashCode(this.f14335d) + ((((((this.f14332a + 527) * 31) + this.f14333b) * 31) + this.f14334c) * 31)) * 31) + this.f14336e) * 31) + this.f;
        this.f14337g = hashCode;
        return hashCode;
    }

    public final String toString() {
        String str;
        String g5 = g(this.f14332a);
        String f = f(this.f14333b);
        String h3 = h(this.f14334c);
        String str2 = "NA";
        int i = this.f14336e;
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        int i5 = this.f;
        if (i5 != -1) {
            str2 = i5 + "bit Chroma";
        }
        return "ColorInfo(" + g5 + ", " + f + ", " + h3 + ", " + (this.f14335d != null) + ", " + str + ", " + str2 + ")";
    }
}
