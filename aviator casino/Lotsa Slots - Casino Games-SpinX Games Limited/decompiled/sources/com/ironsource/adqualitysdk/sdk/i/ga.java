package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ga extends com.ironsource.adqualitysdk.sdk.i.fz {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2168 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2169 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2170 = 107;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static short[] f2171 = null;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2172 = 1380459327;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2173 = 871082476;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f2174 = {-100, -78, -4, -3, 1, com.google.common.base.Ascii.SI, -13, -100, -51, -4, -3, 1, com.google.common.base.Ascii.SI, -13};

    public ga(com.ironsource.adqualitysdk.sdk.i.ef efVar) {
        super(efVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fz, com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﾒ */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7773(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        int i2 = f2168 + 99;
        f2169 = i2 % 128;
        int i3 = i2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ea mo7773 = super.mo7773(eeVar, clVar);
        mo7773.m7678(true);
        int i4 = f2168 + 19;
        f2169 = i4 % 128;
        int i5 = i4 % 2;
        return mo7773;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fz
    public final java.lang.String toString() {
        int i = 2 % 2;
        int i2 = f2169 + 45;
        f2168 = i2 % 128;
        int i3 = i2 % 2;
        if (m7781() == null) {
            return m7783((short) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.KeyEvent.getMaxKeyCode() >> 16) - 871082362, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + androidx.media3.common.PlaybackException.ERROR_CODE_END_OF_PLAYLIST, android.view.Gravity.getAbsoluteGravity(0, 0) - 1380459320, (byte) android.text.TextUtils.getOffsetBefore("", 0)).intern();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7783((short) (android.text.TextUtils.lastIndexOf("", '0', 0) + 1), (-871082363) - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0'), android.graphics.Color.argb(0, 0, 0, 0) + androidx.media3.common.PlaybackException.ERROR_CODE_SETUP_REQUIRED, (-1380459327) - android.view.KeyEvent.getDeadChar(0, 0), (byte) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1)).intern());
        sb.append(super.toString());
        java.lang.String obj = sb.toString();
        int i4 = f2169 + 81;
        f2168 = i4 % 128;
        if (i4 % 2 != 0) {
            return obj;
        }
        java.lang.Object obj2 = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7783(short s, int i, int i2, int i3, byte b) {
        java.lang.String obj;
        synchronized (com.ironsource.adqualitysdk.sdk.i.n.f3098) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i4 = f2170;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2174;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2172 + i3] + i4);
                } else {
                    i5 = (short) (f2171[f2172 + i3] + i4);
                }
            }
            if (i5 > 0) {
                com.ironsource.adqualitysdk.sdk.i.n.f3100 = ((i3 + i5) - 2) + f2172 + i6;
                com.ironsource.adqualitysdk.sdk.i.n.f3101 = b;
                com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (i + f2173);
                sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                com.ironsource.adqualitysdk.sdk.i.n.f3099 = 1;
                while (com.ironsource.adqualitysdk.sdk.i.n.f3099 < i5) {
                    byte[] bArr2 = f2174;
                    if (bArr2 != null) {
                        int i7 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                        com.ironsource.adqualitysdk.sdk.i.n.f3100 = i7 - 1;
                        com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((byte) (bArr2[i7] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                    } else {
                        short[] sArr = f2171;
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
