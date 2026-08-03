package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class he extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2321 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2322 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static short[] f2323 = null;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2324 = 1816458346;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2325 = 68;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] f2326 = {89, 71, 122, 93, 69, 86, 106, 60, 59, -113, 101, 85, 82, 43, -107, 89, 103, com.google.common.base.Ascii.ESC, -95, 93, 69, 86, 106, 92, com.google.common.base.Ascii.ESC, -105, 96, 82, -91, -115, -98, -86, -92, 0, 0};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2327 = -552104295;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final java.lang.String mo7795() {
        int i = 2 % 2;
        int i2 = f2322 + 117;
        f2321 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7827((short) (35 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0)), android.graphics.Color.rgb(0, 0, 0) - 1799681031, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 40, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 552104295, (byte) (android.widget.ExpandableListView.getPackedPositionType(0L) + 122)).intern();
        int i4 = f2321 + 101;
        f2322 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final java.lang.Class mo7793() {
        int i = 2 % 2;
        int i2 = f2322;
        int i3 = i2 + 109;
        f2321 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 55;
        f2321 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
        return com.smaato.sdk.core.SmaatoSdk.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.cb cbVar = new com.ironsource.adqualitysdk.sdk.i.cb(mo7794());
        int i2 = f2321 + 51;
        f2322 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 28 / 0;
        }
        return cbVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final java.lang.String mo7794() {
        int i = 2 % 2;
        int i2 = f2322 + 109;
        f2321 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7827((short) (96 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), (-1816458231) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 62, 552104323 - android.view.KeyEvent.getDeadChar(0, 0), (byte) ((-2) - android.graphics.Color.red(0))).intern();
        int i4 = f2321 + 43;
        f2322 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7827(short s, int i, int i2, int i3, byte b) {
        java.lang.String obj;
        synchronized (com.ironsource.adqualitysdk.sdk.i.n.f3098) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i4 = f2325;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2326;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2327 + i3] + i4);
                } else {
                    i5 = (short) (f2323[f2327 + i3] + i4);
                }
            }
            if (i5 > 0) {
                com.ironsource.adqualitysdk.sdk.i.n.f3100 = ((i3 + i5) - 2) + f2327 + i6;
                com.ironsource.adqualitysdk.sdk.i.n.f3101 = b;
                com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (i + f2324);
                sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                com.ironsource.adqualitysdk.sdk.i.n.f3099 = 1;
                while (com.ironsource.adqualitysdk.sdk.i.n.f3099 < i5) {
                    byte[] bArr2 = f2326;
                    if (bArr2 != null) {
                        int i7 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                        com.ironsource.adqualitysdk.sdk.i.n.f3100 = i7 - 1;
                        com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((byte) (bArr2[i7] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                    } else {
                        short[] sArr = f2323;
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
