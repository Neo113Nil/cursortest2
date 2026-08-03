package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class gn extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2223 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2224 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2225 = 5;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2226 = -884433757;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2227 = -1545621584;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static short[] f2228;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f2229 = {com.google.common.base.Ascii.DC2, 83, -84, -97, 125, 83, 104, -70, 115, 67, -50, -114, 115, 124, 116, -118, -97, 125, 115, 72, -79, -114, 124, 1, -52, 51, 32, -62, -52};

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final java.lang.String mo7795() {
        int i = 2 % 2;
        int i2 = f2224 + 3;
        f2223 = i2 % 128;
        java.lang.String intern = (i2 % 2 != 0 ? m7805((short) android.widget.ExpandableListView.getPackedPositionType(1L), 884433856 << android.view.View.MeasureSpec.getMode(0), 2 >>> android.view.View.MeasureSpec.getSize(0), 20512 >> android.text.AndroidCharacter.getMirror((char) 16), (byte) (android.graphics.Color.green(1) * 87)) : m7805((short) android.widget.ExpandableListView.getPackedPositionType(0L), 884433856 - android.view.View.MeasureSpec.getMode(0), (-6) - android.view.View.MeasureSpec.getSize(0), android.text.AndroidCharacter.getMirror('0') + 20512, (byte) (112 - android.graphics.Color.green(0)))).intern();
        int i3 = f2224 + 69;
        f2223 = i3 % 128;
        if (i3 % 2 == 0) {
            return intern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final java.lang.Class mo7793() {
        int i = 2 % 2;
        int i2 = f2223 + 55;
        f2224 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 6 / 0;
        }
        return com.five_corp.ad.FiveAd.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.br brVar = new com.ironsource.adqualitysdk.sdk.i.br(mo7794());
        int i2 = f2223 + 1;
        f2224 = i2 % 128;
        int i3 = i2 % 2;
        return brVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final java.lang.String mo7794() {
        int i = 2 % 2;
        int i2 = f2223 + 11;
        f2224 = i2 % 128;
        java.lang.String intern = (i2 % 2 == 0 ? m7805((short) android.view.View.getDefaultSize(1, 1), 884433859 % (android.view.ViewConfiguration.getFadingEdgeLength() << 12), 79 - (android.util.TypedValue.complexToFloat(1) > 2.0f ? 1 : (android.util.TypedValue.complexToFloat(1) == 2.0f ? 0 : -1)), 1545621608 >>> android.text.TextUtils.lastIndexOf("", (char) 5), (byte) (10 - android.view.MotionEvent.axisFromString(""))) : m7805((short) android.view.View.getDefaultSize(0, 0), 884433859 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (-6) - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.text.TextUtils.lastIndexOf("", '0') + 1545621608, (byte) ((-50) - android.view.MotionEvent.axisFromString("")))).intern();
        int i3 = f2224 + 79;
        f2223 = i3 % 128;
        if (i3 % 2 == 0) {
            return intern;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m7805(short s, int i, int i2, int i3, byte b) {
        java.lang.String obj;
        synchronized (com.ironsource.adqualitysdk.sdk.i.n.f3098) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i4 = f2225;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2229;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2227 + i3] + i4);
                } else {
                    i5 = (short) (f2228[f2227 + i3] + i4);
                }
            }
            if (i5 > 0) {
                com.ironsource.adqualitysdk.sdk.i.n.f3100 = ((i3 + i5) - 2) + f2227 + i6;
                com.ironsource.adqualitysdk.sdk.i.n.f3101 = b;
                com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (i + f2226);
                sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                com.ironsource.adqualitysdk.sdk.i.n.f3099 = 1;
                while (com.ironsource.adqualitysdk.sdk.i.n.f3099 < i5) {
                    byte[] bArr2 = f2229;
                    if (bArr2 != null) {
                        int i7 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                        com.ironsource.adqualitysdk.sdk.i.n.f3100 = i7 - 1;
                        com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((byte) (bArr2[i7] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                    } else {
                        short[] sArr = f2228;
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
