package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public enum hs {
    f2414(-1),
    f2415(0),
    f2416(1),
    f2417(2),
    f2418(3),
    f2410(4),
    f2411(5),
    f2412(6),
    f2413(7);


    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f2406 = 0;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f2407 = 1;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f2409;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private final int f2419;

    /* renamed from: ﻐ, reason: contains not printable characters */
    static void m7848() {
        f2406 = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE;
    }

    public static com.ironsource.adqualitysdk.sdk.i.hs valueOf(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f2409 + 81;
        f2407 = i2 % 128;
        int i3 = i2 % 2;
        com.ironsource.adqualitysdk.sdk.i.hs hsVar = (com.ironsource.adqualitysdk.sdk.i.hs) java.lang.Enum.valueOf(com.ironsource.adqualitysdk.sdk.i.hs.class, str);
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
        return hsVar;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static com.ironsource.adqualitysdk.sdk.i.hs[] valuesCustom() {
        int i = 2 % 2;
        int i2 = f2409 + 17;
        f2407 = i2 % 128;
        if (i2 % 2 == 0) {
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        com.ironsource.adqualitysdk.sdk.i.hs[] hsVarArr = (com.ironsource.adqualitysdk.sdk.i.hs[]) values().clone();
        int i3 = f2409 + 83;
        f2407 = i3 % 128;
        int i4 = i3 % 2;
        return hsVarArr;
    }

    static {
        m7848();
        int i = f2407 + 31;
        f2409 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    hs(int i) {
        this.f2419 = i;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static com.ironsource.adqualitysdk.sdk.i.hs m7850(int i) {
        int i2 = 2 % 2;
        java.lang.Object obj = null;
        switch (i) {
            case -1:
                return f2414;
            case 0:
                return f2415;
            case 1:
                return f2416;
            case 2:
                com.ironsource.adqualitysdk.sdk.i.hs hsVar = f2417;
                int i3 = f2409 + 115;
                f2407 = i3 % 128;
                int i4 = i3 % 2;
                return hsVar;
            case 3:
                return f2418;
            case 4:
                return f2410;
            case 5:
                com.ironsource.adqualitysdk.sdk.i.hs hsVar2 = f2411;
                int i5 = f2409 + 101;
                f2407 = i5 % 128;
                if (i5 % 2 != 0) {
                    return hsVar2;
                }
                super.hashCode();
                throw null;
            case 6:
                return f2412;
            case 7:
                com.ironsource.adqualitysdk.sdk.i.hs hsVar3 = f2413;
                int i6 = f2407 + 87;
                f2409 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 59 / 0;
                }
                return hsVar3;
            default:
                return null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final int m7851() {
        int i = 2 % 2;
        int i2 = f2409 + 99;
        int i3 = i2 % 128;
        f2407 = i3;
        int i4 = i2 % 2;
        int i5 = this.f2419;
        int i6 = i3 + 7;
        f2409 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m7849(int i, boolean z, int i2, java.lang.String str, int i3) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1654) {
            char[] cArr3 = new char[i];
            com.ironsource.adqualitysdk.sdk.i.d.f1651 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.d.f1651 < i) {
                com.ironsource.adqualitysdk.sdk.i.d.f1653 = cArr2[com.ironsource.adqualitysdk.sdk.i.d.f1651];
                cArr3[com.ironsource.adqualitysdk.sdk.i.d.f1651] = (char) (com.ironsource.adqualitysdk.sdk.i.d.f1653 + i2);
                int i4 = com.ironsource.adqualitysdk.sdk.i.d.f1651;
                cArr3[i4] = (char) (cArr3[i4] - f2406);
                com.ironsource.adqualitysdk.sdk.i.d.f1651++;
            }
            if (i3 > 0) {
                com.ironsource.adqualitysdk.sdk.i.d.f1652 = i3;
                char[] cArr4 = new char[i];
                java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i);
                java.lang.System.arraycopy(cArr4, 0, cArr3, i - com.ironsource.adqualitysdk.sdk.i.d.f1652, com.ironsource.adqualitysdk.sdk.i.d.f1652);
                java.lang.System.arraycopy(cArr4, com.ironsource.adqualitysdk.sdk.i.d.f1652, cArr3, 0, i - com.ironsource.adqualitysdk.sdk.i.d.f1652);
            }
            if (z) {
                char[] cArr5 = new char[i];
                com.ironsource.adqualitysdk.sdk.i.d.f1651 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.d.f1651 < i) {
                    cArr5[com.ironsource.adqualitysdk.sdk.i.d.f1651] = cArr3[(i - com.ironsource.adqualitysdk.sdk.i.d.f1651) - 1];
                    com.ironsource.adqualitysdk.sdk.i.d.f1651++;
                }
                cArr3 = cArr5;
            }
            str2 = new java.lang.String(cArr3);
        }
        return str2;
    }
}
