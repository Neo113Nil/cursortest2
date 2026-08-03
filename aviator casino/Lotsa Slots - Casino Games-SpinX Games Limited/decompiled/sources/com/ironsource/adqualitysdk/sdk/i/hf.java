package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class hf extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2328 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2329 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] f2330 = {-102, 10, 5, -6, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CR, 38, -75, 10, 5, -6, com.google.common.base.Ascii.SI, -19, 70, -63, -2, com.google.common.base.Ascii.FF, -113, 10, 5, -6, com.google.common.base.Ascii.SI, -19};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static short[] f2331 = null;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2332 = 1831181999;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2333 = 119;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2334 = -530823127;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final java.lang.String mo7795() {
        short myPid;
        int maximumFlingVelocity;
        int minimumFlingVelocity;
        int keyRepeatTimeout;
        int myTid;
        int i = 2 % 2;
        int i2 = f2329 + 73;
        f2328 = i2 % 128;
        if (i2 % 2 == 0) {
            myPid = (short) (android.os.Process.myPid() - 116);
            maximumFlingVelocity = (android.view.ViewConfiguration.getMaximumFlingVelocity() >>> 7) - 1831181900;
            minimumFlingVelocity = (android.view.ViewConfiguration.getMinimumFlingVelocity() / 32) * 35;
            keyRepeatTimeout = 530823127 << (android.view.ViewConfiguration.getKeyRepeatTimeout() << 125);
            myTid = android.os.Process.myTid() % 103;
        } else {
            myPid = (short) (android.os.Process.myPid() >> 22);
            maximumFlingVelocity = (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 1831181900;
            minimumFlingVelocity = (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) - 120;
            keyRepeatTimeout = 530823127 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
            myTid = android.os.Process.myTid() >> 22;
        }
        return m7828(myPid, maximumFlingVelocity, minimumFlingVelocity, keyRepeatTimeout, (byte) myTid).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final java.lang.Class mo7793() {
        int i = 2 % 2;
        int i2 = f2328 + 121;
        int i3 = i2 % 128;
        f2329 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 51;
        f2328 = i5 % 128;
        int i6 = i5 % 2;
        return com.tapjoy.Tapjoy.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ce ceVar = new com.ironsource.adqualitysdk.sdk.i.ce(mo7794());
        int i2 = f2329 + 55;
        f2328 = i2 % 128;
        int i3 = i2 % 2;
        return ceVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final java.lang.String mo7794() {
        int i = 2 % 2;
        int i2 = f2329 + 29;
        f2328 = i2 % 128;
        return (i2 % 2 == 0 ? m7828((short) (android.graphics.PointF.length(2.0f, 0.0f) > 2.0f ? 1 : (android.graphics.PointF.length(2.0f, 0.0f) == 2.0f ? 0 : -1)), (-1831181883) - android.text.TextUtils.indexOf("", ""), (android.view.ViewConfiguration.getScrollBarFadeDuration() + 94) * 103, (android.view.ViewConfiguration.getScrollBarFadeDuration() % 86) + 530823144, (byte) android.view.KeyEvent.normalizeMetaState(1)) : m7828((short) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.text.TextUtils.indexOf("", "") - 1831181883, (-120) - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 530823144 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) android.view.KeyEvent.normalizeMetaState(0))).intern();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m7828(short s, int i, int i2, int i3, byte b) {
        java.lang.String obj;
        synchronized (com.ironsource.adqualitysdk.sdk.i.n.f3098) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i4 = f2333;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2330;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2334 + i3] + i4);
                } else {
                    i5 = (short) (f2331[f2334 + i3] + i4);
                }
            }
            if (i5 > 0) {
                com.ironsource.adqualitysdk.sdk.i.n.f3100 = ((i3 + i5) - 2) + f2334 + i6;
                com.ironsource.adqualitysdk.sdk.i.n.f3101 = b;
                com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (i + f2332);
                sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                com.ironsource.adqualitysdk.sdk.i.n.f3099 = 1;
                while (com.ironsource.adqualitysdk.sdk.i.n.f3099 < i5) {
                    byte[] bArr2 = f2330;
                    if (bArr2 != null) {
                        int i7 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                        com.ironsource.adqualitysdk.sdk.i.n.f3100 = i7 - 1;
                        com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((byte) (bArr2[i7] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                    } else {
                        short[] sArr = f2331;
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
