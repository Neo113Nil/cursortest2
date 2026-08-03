package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public abstract class dy {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1893 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f1894 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1895 = {'a', 'n', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'r', 'o', 'i', '-', '.', io.ktor.util.date.GMTDateParser.SECONDS, 'l', ' ', 't', kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA, '\n', kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f1896 = 4;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final java.lang.String f1897;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final java.lang.String f1898;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final java.util.List<com.ironsource.adqualitysdk.sdk.i.dw> f1899 = new java.util.ArrayList();

    public dy(java.lang.String str, java.lang.String str2) {
        this.f1897 = str;
        this.f1898 = str2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final java.lang.String m7662() {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7660(7 - android.text.TextUtils.lastIndexOf("", '0', 0, 0), "\u0001\u0002\u0003\u0000\u0005\u0006\u0006\n", (byte) ((android.os.Process.myTid() >> 22) + 12)).intern());
        sb.append(this.f1897.toLowerCase());
        sb.append(m7660(1 - android.graphics.Color.blue(0), "\u0081", (byte) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 85)).intern());
        sb.append(this.f1898);
        sb.append(m7660((android.view.ViewConfiguration.getTouchSlop() >> 8) + 4, "\u0004\u000b\u0001\u000b", (byte) (70 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8))).intern());
        java.lang.String obj = sb.toString();
        int i2 = f1893 + 57;
        f1894 = i2 % 128;
        if (i2 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    protected final void m7661(com.ironsource.adqualitysdk.sdk.i.dw dwVar) {
        int i = 2 % 2;
        int i2 = f1894 + 125;
        f1893 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f1899.add(dwVar);
            int i3 = 50 / 0;
        } else {
            this.f1899.add(dwVar);
        }
        int i4 = f1893 + 83;
        f1894 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    public java.lang.String toString() {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7660(android.graphics.Color.green(0) + 5, "\u0080\u0080\u0003\b\u0080", (byte) (96 - ((android.os.Process.getThreadPriority(0) + 20) >> 6))).intern());
        sb.append(this.f1899.toString().replace(m7660(2 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), "\u000e\b", (byte) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 66)).intern(), m7660(android.text.TextUtils.getCapsMode("", 0, 0) + 6, "\u000e\t\b\u0002\b\u000b", (byte) (32 - (android.view.ViewConfiguration.getTouchSlop() >> 8))).intern()).replace(m7660(-android.text.TextUtils.lastIndexOf("", '0', 0, 0), "\u0094", (byte) (56 - android.os.Process.getGidForName(""))).intern(), "").replace(m7660((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), "Å", (byte) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 104)).intern(), ""));
        java.lang.String obj = sb.toString();
        int i2 = f1894 + 123;
        f1893 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m7660(int i, java.lang.String str, byte b) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.j.f2684) {
            char[] cArr3 = f1895;
            char c = f1896;
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr4[i] = (char) (cArr2[i] - b);
            }
            if (i > 1) {
                com.ironsource.adqualitysdk.sdk.i.j.f2691 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.j.f2691 < i) {
                    com.ironsource.adqualitysdk.sdk.i.j.f2690 = cArr2[com.ironsource.adqualitysdk.sdk.i.j.f2691];
                    com.ironsource.adqualitysdk.sdk.i.j.f2687 = cArr2[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1];
                    if (com.ironsource.adqualitysdk.sdk.i.j.f2690 == com.ironsource.adqualitysdk.sdk.i.j.f2687) {
                        cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = (char) (com.ironsource.adqualitysdk.sdk.i.j.f2690 - b);
                        cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = (char) (com.ironsource.adqualitysdk.sdk.i.j.f2687 - b);
                    } else {
                        com.ironsource.adqualitysdk.sdk.i.j.f2689 = com.ironsource.adqualitysdk.sdk.i.j.f2690 / c;
                        com.ironsource.adqualitysdk.sdk.i.j.f2686 = com.ironsource.adqualitysdk.sdk.i.j.f2690 % c;
                        com.ironsource.adqualitysdk.sdk.i.j.f2688 = com.ironsource.adqualitysdk.sdk.i.j.f2687 / c;
                        com.ironsource.adqualitysdk.sdk.i.j.f2685 = com.ironsource.adqualitysdk.sdk.i.j.f2687 % c;
                        if (com.ironsource.adqualitysdk.sdk.i.j.f2686 == com.ironsource.adqualitysdk.sdk.i.j.f2685) {
                            com.ironsource.adqualitysdk.sdk.i.j.f2689 = ((com.ironsource.adqualitysdk.sdk.i.j.f2689 + c) - 1) % c;
                            com.ironsource.adqualitysdk.sdk.i.j.f2688 = ((com.ironsource.adqualitysdk.sdk.i.j.f2688 + c) - 1) % c;
                            int i2 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                            int i3 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i2];
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i3];
                        } else if (com.ironsource.adqualitysdk.sdk.i.j.f2689 == com.ironsource.adqualitysdk.sdk.i.j.f2688) {
                            com.ironsource.adqualitysdk.sdk.i.j.f2686 = ((com.ironsource.adqualitysdk.sdk.i.j.f2686 + c) - 1) % c;
                            com.ironsource.adqualitysdk.sdk.i.j.f2685 = ((com.ironsource.adqualitysdk.sdk.i.j.f2685 + c) - 1) % c;
                            int i4 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                            int i5 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i4];
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i5];
                        } else {
                            int i6 = (com.ironsource.adqualitysdk.sdk.i.j.f2689 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2685;
                            int i7 = (com.ironsource.adqualitysdk.sdk.i.j.f2688 * c) + com.ironsource.adqualitysdk.sdk.i.j.f2686;
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691] = cArr3[i6];
                            cArr4[com.ironsource.adqualitysdk.sdk.i.j.f2691 + 1] = cArr3[i7];
                        }
                    }
                    com.ironsource.adqualitysdk.sdk.i.j.f2691 += 2;
                }
            }
            str2 = new java.lang.String(cArr4);
        }
        return str2;
    }
}
