package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class bf extends com.ironsource.adqualitysdk.sdk.i.be {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f806 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f807 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f808 = 308991216;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f809 = 71;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static short[] f810 = null;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f811 = -1478503379;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f812 = {78, 72, -69, -80, 66, -72, 0};

    public bf(java.lang.String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final java.lang.String mo6354() {
        int i = 2 % 2;
        int i2 = f807 + 43;
        f806 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m6384((short) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (-308991147) - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.text.TextUtils.getCapsMode("", 0, 0) - 64, 1478503379 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (byte) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 80)).intern();
        int i4 = f807 + 49;
        f806 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    final java.lang.Class mo6353(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f806;
        int i3 = i2 + 99;
        f807 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 101;
        f807 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.be.c> mo6355() {
        int i = 2 % 2;
        java.util.HashMap hashMap = new java.util.HashMap();
        int i2 = f807 + 9;
        f806 = i2 % 128;
        int i3 = i2 % 2;
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻏ */
    public final boolean mo6367() {
        int i = 2 % 2;
        int i2 = f806 + 59;
        f807 = i2 % 128;
        return i2 % 2 != 0;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﺙ */
    public final boolean mo6375() {
        int i = 2 % 2;
        int i2 = f807;
        int i3 = i2 + 39;
        f806 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 55;
        f806 = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m6384(short s, int i, int i2, int i3, byte b) {
        java.lang.String obj;
        synchronized (com.ironsource.adqualitysdk.sdk.i.n.f3098) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i4 = f809;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f812;
                if (bArr != null) {
                    i5 = (byte) (bArr[f811 + i3] + i4);
                } else {
                    i5 = (short) (f810[f811 + i3] + i4);
                }
            }
            if (i5 > 0) {
                com.ironsource.adqualitysdk.sdk.i.n.f3100 = ((i3 + i5) - 2) + f811 + i6;
                com.ironsource.adqualitysdk.sdk.i.n.f3101 = b;
                com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (i + f808);
                sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                com.ironsource.adqualitysdk.sdk.i.n.f3099 = 1;
                while (com.ironsource.adqualitysdk.sdk.i.n.f3099 < i5) {
                    byte[] bArr2 = f812;
                    if (bArr2 != null) {
                        int i7 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                        com.ironsource.adqualitysdk.sdk.i.n.f3100 = i7 - 1;
                        com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((byte) (bArr2[i7] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                    } else {
                        short[] sArr = f810;
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
