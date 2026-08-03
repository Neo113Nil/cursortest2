package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class dh {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1722 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f1723 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f1724 = 4;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1725 = {io.ktor.util.date.GMTDateParser.MINUTES, 'a', 'i', 'n', 'T', io.ktor.util.date.GMTDateParser.HOURS, 'r', 'e', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'f', 't', io.ktor.util.date.GMTDateParser.MONTH, 'o', 'p', 'q', io.ktor.util.date.GMTDateParser.SECONDS};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1726;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private java.lang.String f1727;

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean f1728;

    public dh(org.json.JSONObject jSONObject) {
        this.f1726 = jSONObject.optBoolean(m7484((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 10, "\u0001\u0002\u0003\u0000\u0005\u0006\u0007\u0004\u0000\t", (byte) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 18)).intern());
        this.f1728 = jSONObject.optBoolean(m7484(10 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0005\r\u000b\u0006\u0007\n\u0002\u0003\u009d", (byte) (android.text.TextUtils.indexOf("", "", 0, 0) + 47)).intern());
        this.f1727 = com.ironsource.adqualitysdk.sdk.i.eb.m7682(jSONObject.optString(m7484(7 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0003\u0004\t\u0006\u0000\f", (byte) (39 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern()));
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m7486() {
        int i = 2 % 2;
        int i2 = f1723;
        int i3 = i2 + 67;
        f1722 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.f1726;
        int i5 = i2 + 71;
        f1722 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m7485() {
        int i = 2 % 2;
        int i2 = f1723;
        int i3 = i2 + 75;
        f1722 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.f1728;
        int i5 = i2 + 119;
        f1722 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final java.lang.String m7487() {
        int i = 2 % 2;
        int i2 = f1723 + 93;
        f1722 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String str = this.f1727;
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m7484(int i, java.lang.String str, byte b) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.j.f2684) {
            char[] cArr3 = f1725;
            char c = f1724;
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
