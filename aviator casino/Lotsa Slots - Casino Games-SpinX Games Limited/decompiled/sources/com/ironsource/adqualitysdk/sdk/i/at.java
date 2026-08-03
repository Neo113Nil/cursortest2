package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class at extends com.ironsource.adqualitysdk.sdk.i.ar.AnonymousClass5 {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f441 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f442 = 48859;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f443 = 28214;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f444 = 22270;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f445 = 39689;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f446;

    public at(com.ironsource.adqualitysdk.sdk.i.aw awVar) {
        m6074(awVar);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final java.util.List<java.lang.String> m6127() {
        int i = 2 % 2;
        int i2 = f446 + 3;
        f441 = i2 % 128;
        int i3 = i2 % 2;
        java.util.List<java.lang.String> m6234 = m6073().m6234();
        int i4 = f446 + 7;
        f441 = i4 % 128;
        int i5 = i4 % 2;
        return m6234;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final int m6129() {
        int i = 2 % 2;
        int i2 = f446 + 65;
        f441 = i2 % 128;
        int i3 = i2 % 2;
        int m6230 = m6073().m6230();
        int i4 = f441 + 77;
        f446 = i4 % 128;
        if (i4 % 2 == 0) {
            return m6230;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final java.util.List<java.lang.String> m6130() {
        int i = 2 % 2;
        int i2 = f441 + 117;
        f446 = i2 % 128;
        int i3 = i2 % 2;
        java.util.List<java.lang.String> m6233 = m6073().m6233();
        int i4 = f446 + 109;
        f441 = i4 % 128;
        if (i4 % 2 != 0) {
            return m6233;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int m6131() {
        int i = 2 % 2;
        int i2 = f446 + 93;
        f441 = i2 % 128;
        int i3 = i2 % 2;
        int m6231 = m6073().m6231();
        int i4 = f446 + 57;
        f441 = i4 % 128;
        if (i4 % 2 != 0) {
            return m6231;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m6128() {
        int i = 2 % 2;
        int i2 = f441 + 29;
        f446 = i2 % 128;
        int i3 = i2 % 2;
        boolean optBoolean = m6072().optBoolean(m6125("\uf1b6⛀狩楎", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4).intern(), true);
        int i4 = f441 + 53;
        f446 = i4 % 128;
        int i5 = i4 % 2;
        return optBoolean;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final boolean m6126() {
        int i = 2 % 2;
        int i2 = f446 + 115;
        f441 = i2 % 128;
        return i2 % 2 == 0 ? m6072().optBoolean(m6125("\uf1b6⛀솎\uf4e7", 4 >>> android.view.View.combineMeasuredStates(1, 0)).intern(), false) : m6072().optBoolean(m6125("\uf1b6⛀솎\uf4e7", android.view.View.combineMeasuredStates(0, 0) + 4).intern(), true);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m6125(java.lang.String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f444)) ^ ((c2 >>> 5) + f442)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f443) ^ ((c3 + i2) ^ ((c3 << 4) + f445))));
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
