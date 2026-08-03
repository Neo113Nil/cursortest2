package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class fj extends com.ironsource.adqualitysdk.sdk.i.em {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2092 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2093 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2094 = 1053546823;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2095 = -1572212177;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2096 = 44;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] f2097 = {0};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static short[] f2098;

    public fj(com.ironsource.adqualitysdk.sdk.i.ef efVar, com.ironsource.adqualitysdk.sdk.i.ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7719(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        int i2 = f2093 + 65;
        f2092 = i2 % 128;
        if (i2 % 2 == 0) {
            com.ironsource.adqualitysdk.sdk.i.ea m7718 = m7732().m7718(eeVar, clVar);
            com.ironsource.adqualitysdk.sdk.i.ea m77182 = m7733().m7718(eeVar, clVar);
            if (!(!(m7718.m7681() instanceof java.lang.String)) || (m77182.m7681() instanceof java.lang.String)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(m7718.m7681());
                sb.append(m77182.m7681());
                com.ironsource.adqualitysdk.sdk.i.ea eaVar = new com.ironsource.adqualitysdk.sdk.i.ea(sb.toString());
                int i3 = f2092 + 51;
                f2093 = i3 % 128;
                int i4 = i3 % 2;
                return eaVar;
            }
            java.lang.Number m7677 = m7718.m7677();
            java.lang.Number m76772 = m77182.m7677();
            if ((m7677 instanceof java.lang.Double) || (m76772 instanceof java.lang.Double)) {
                return new com.ironsource.adqualitysdk.sdk.i.ea(java.lang.Double.valueOf(m7677.doubleValue() + m76772.doubleValue()));
            }
            if ((m7677 instanceof java.lang.Long) || (m76772 instanceof java.lang.Long)) {
                return new com.ironsource.adqualitysdk.sdk.i.ea(java.lang.Long.valueOf(m7677.longValue() + m76772.longValue()));
            }
            return new com.ironsource.adqualitysdk.sdk.i.ea(java.lang.Integer.valueOf(m7677.intValue() + m76772.intValue()));
        }
        com.ironsource.adqualitysdk.sdk.i.ea m77183 = m7732().m7718(eeVar, clVar);
        m7733().m7718(eeVar, clVar);
        boolean z = m77183.m7681() instanceof java.lang.String;
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* renamed from: ﻛ */
    public final java.lang.String mo7731() {
        int i = 2 % 2;
        int i2 = f2092 + 57;
        f2093 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7764((short) (android.graphics.Color.rgb(0, 0, 0) + 16777216), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1572212220, (-44) - android.graphics.ImageFormat.getBitsPerPixel(0), android.text.TextUtils.getCapsMode("", 0, 0) - 1053546823, (byte) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1)).intern();
        int i4 = f2092 + 113;
        f2093 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7764(short s, int i, int i2, int i3, byte b) {
        java.lang.String obj;
        synchronized (com.ironsource.adqualitysdk.sdk.i.n.f3098) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i4 = f2096;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2097;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2094 + i3] + i4);
                } else {
                    i5 = (short) (f2098[f2094 + i3] + i4);
                }
            }
            if (i5 > 0) {
                com.ironsource.adqualitysdk.sdk.i.n.f3100 = ((i3 + i5) - 2) + f2094 + i6;
                com.ironsource.adqualitysdk.sdk.i.n.f3101 = b;
                com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (i + f2095);
                sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                com.ironsource.adqualitysdk.sdk.i.n.f3099 = 1;
                while (com.ironsource.adqualitysdk.sdk.i.n.f3099 < i5) {
                    byte[] bArr2 = f2097;
                    if (bArr2 != null) {
                        int i7 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                        com.ironsource.adqualitysdk.sdk.i.n.f3100 = i7 - 1;
                        com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((byte) (bArr2[i7] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                    } else {
                        short[] sArr = f2098;
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
