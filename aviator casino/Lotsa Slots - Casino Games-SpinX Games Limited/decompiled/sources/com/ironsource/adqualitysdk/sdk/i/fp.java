package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class fp extends com.ironsource.adqualitysdk.sdk.i.ef {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static short[] f2113 = null;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2114 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2115;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2116;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] f2117;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static final com.ironsource.adqualitysdk.sdk.i.fp f2118;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2119;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2120;

    /* renamed from: ﻛ, reason: contains not printable characters */
    static void m7767() {
        f2119 = 757713460;
        f2116 = 20;
        f2120 = -903153225;
        f2117 = new byte[]{-16, -116, 87, -121};
    }

    static {
        m7767();
        f2118 = new com.ironsource.adqualitysdk.sdk.i.fp();
        int i = f2115 + 41;
        f2114 = i % 128;
        int i2 = i % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static synchronized com.ironsource.adqualitysdk.sdk.i.fp m7768() {
        com.ironsource.adqualitysdk.sdk.i.fp fpVar;
        synchronized (com.ironsource.adqualitysdk.sdk.i.fp.class) {
            int i = 2 % 2;
            int i2 = f2115 + 5;
            f2114 = i2 % 128;
            if (i2 % 2 == 0) {
                fpVar = f2118;
                int i3 = 26 / 0;
            } else {
                fpVar = f2118;
            }
        }
        return fpVar;
    }

    private fp() {
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7719(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ea eaVar = new com.ironsource.adqualitysdk.sdk.i.ea(null);
        int i2 = f2114 + 85;
        f2115 = i2 % 128;
        int i3 = i2 % 2;
        return eaVar;
    }

    public final java.lang.String toString() {
        int i = 2 % 2;
        int i2 = f2115 + 43;
        f2114 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7769((short) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING), 903153335 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.view.ViewConfiguration.getEdgeSlop() >> 16) - 21, (-757713461) - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0), (byte) (30 - (android.view.KeyEvent.getMaxKeyCode() >> 16))).intern();
        int i4 = f2115 + 39;
        f2114 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
        return intern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7769(short s, int i, int i2, int i3, byte b) {
        java.lang.String obj;
        synchronized (com.ironsource.adqualitysdk.sdk.i.n.f3098) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i4 = f2116;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2117;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2119 + i3] + i4);
                } else {
                    i5 = (short) (f2113[f2119 + i3] + i4);
                }
            }
            if (i5 > 0) {
                com.ironsource.adqualitysdk.sdk.i.n.f3100 = ((i3 + i5) - 2) + f2119 + i6;
                com.ironsource.adqualitysdk.sdk.i.n.f3101 = b;
                com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (i + f2120);
                sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                com.ironsource.adqualitysdk.sdk.i.n.f3099 = 1;
                while (com.ironsource.adqualitysdk.sdk.i.n.f3099 < i5) {
                    byte[] bArr2 = f2117;
                    if (bArr2 != null) {
                        int i7 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                        com.ironsource.adqualitysdk.sdk.i.n.f3100 = i7 - 1;
                        com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((byte) (bArr2[i7] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                    } else {
                        short[] sArr = f2113;
                        int i8 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                        com.ironsource.adqualitysdk.sdk.i.n.f3100 = i8 - 1;
                        com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((short) (sArr[i8] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                    }
                    sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                    com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                    com.ironsource.adqualitysdk.sdk.i.n.f3099++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
