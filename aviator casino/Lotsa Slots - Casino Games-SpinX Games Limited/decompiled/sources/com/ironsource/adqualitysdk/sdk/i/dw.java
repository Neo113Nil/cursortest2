package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class dw {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1860 = 1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1861 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static char f1862 = 2130;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f1863 = 58563;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char f1864 = 3065;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f1865 = 64547;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final java.lang.String f1866;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final java.lang.String f1867;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final int f1868;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final java.lang.String f1869;

    public dw(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this(str, str2, str3, 0);
    }

    public dw(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        this.f1867 = str;
        this.f1869 = str2;
        this.f1866 = str3;
        this.f1868 = i;
    }

    public final java.lang.String toString() {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f1867);
        sb.append(m7610("襙矵", -android.text.TextUtils.lastIndexOf("", '0', 0)).intern());
        sb.append(this.f1869);
        sb.append(m7610("쩾줉", -android.widget.ExpandableListView.getPackedPositionChild(0L)).intern());
        sb.append(this.f1866);
        sb.append(m7610("뙲᭫", android.widget.ExpandableListView.getPackedPositionType(0L) + 1).intern());
        sb.append(this.f1868);
        sb.append(m7610("ựꜮ", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1).intern());
        java.lang.String obj = sb.toString();
        int i2 = f1860 + 5;
        f1861 = i2 % 128;
        if (i2 % 2 == 0) {
            return obj;
        }
        java.lang.Object obj2 = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m7610(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.o.f3104) {
            char[] cArr3 = new char[cArr2.length];
            com.ironsource.adqualitysdk.sdk.i.o.f3105 = 0;
            char[] cArr4 = new char[2];
            while (com.ironsource.adqualitysdk.sdk.i.o.f3105 < cArr2.length) {
                cArr4[0] = cArr2[com.ironsource.adqualitysdk.sdk.i.o.f3105];
                cArr4[1] = cArr2[com.ironsource.adqualitysdk.sdk.i.o.f3105 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f1863)) ^ ((c2 >>> 5) + f1864)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f1862) ^ ((c3 + i2) ^ ((c3 << 4) + f1865))));
                    i2 -= 40503;
                }
                cArr3[com.ironsource.adqualitysdk.sdk.i.o.f3105] = cArr4[0];
                cArr3[com.ironsource.adqualitysdk.sdk.i.o.f3105 + 1] = cArr4[1];
                com.ironsource.adqualitysdk.sdk.i.o.f3105 += 2;
            }
            str2 = new java.lang.String(cArr3, 0, i);
        }
        return str2;
    }
}
