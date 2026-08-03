package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class er extends com.ironsource.adqualitysdk.sdk.i.ep {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2019 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2021 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.ef f2023;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2020 = {'E', 45021, 24364, 3938, 48846, 28235, 7807, 52671, 32025, 11595, 56483, 36068, 15424, 60298, 39932, 19238, 64208, 43756, 23099, 2463, 47583, 26936, 6520, 51408, 30744, 10339, 55270, 34565, 14161, 59047, 38562, 18004, 62872, 42495, 21836, 1160, 46319, 25656, 5011, 50118, 29494, 8999, 53905, 59438, 18332, 46967, 59248, 22215, 34331, 63098, 9646, 38166, 50446, 13483, 25827, 54301, 927, 29672, 41773, 4825, 17101, 45594, 57812, 20938, 33084, 61731, 8401, 36879, 49214, 16314, 28434, 57182, 3759, 32507, 44616, 7558, 19956, 48451, 60545, 23793, 35938, 64412, 11202, 39739, 52075, 15068, 27160, 55869, '\'', ' ', 44946, 24446};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2022 = -5508836212279955537L;

    public er(com.ironsource.adqualitysdk.sdk.i.ef efVar, com.ironsource.adqualitysdk.sdk.i.ef efVar2, com.ironsource.adqualitysdk.sdk.i.ef efVar3) {
        super(efVar, efVar2);
        this.f2023 = efVar3;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7719(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        int i2 = f2021 + 95;
        f2019 = i2 % 128;
        int i3 = i2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ea m7718 = m7741().m7718(eeVar, clVar);
        com.ironsource.adqualitysdk.sdk.i.ea m77182 = m7745().m7718(eeVar, clVar);
        try {
            java.lang.Object m7681 = m7740().m7718(eeVar, clVar).m7681();
            if (!(!(m7681 instanceof org.json.JSONObject))) {
                ((org.json.JSONObject) m7681).put((java.lang.String) m7718.m7681(), m77182.m7681());
            } else if (m7681 instanceof org.json.JSONArray) {
                ((org.json.JSONArray) m7681).put(m7718.m7677().intValue(), m77182.m7681());
            } else if (m7681 instanceof java.util.Map) {
                int i4 = f2021 + 59;
                f2019 = i4 % 128;
                if (i4 % 2 != 0) {
                    ((java.util.Map) m7681).put(m7718.m7681(), m77182.m7681());
                    java.lang.Object obj = null;
                    super.hashCode();
                    throw null;
                }
                ((java.util.Map) m7681).put(m7718.m7681(), m77182.m7681());
            } else if (m7681 instanceof java.util.List) {
                int i5 = f2019 + 93;
                f2021 = i5 % 128;
                int i6 = i5 % 2;
                ((java.util.List) m7681).set(m7718.m7677().intValue(), m77182.m7681());
            } else if (m7681.getClass().isArray()) {
                int i7 = f2019 + 19;
                f2021 = i7 % 128;
                int i8 = i7 % 2;
                ((java.lang.Object[]) m7681)[m7718.m7677().intValue()] = m77182.m7681();
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(m7744((char) android.graphics.Color.alpha(0), android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 44).intern());
                sb.append(this);
                sb.append(m7744((char) (android.text.AndroidCharacter.getMirror('0') + 59353), 43 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 46).intern());
                sb.append(m7681);
                new com.ironsource.adqualitysdk.sdk.i.dr(clVar, eeVar, sb.toString()).m7590(clVar.m7200());
            }
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(m7744((char) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 1), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.view.View.resolveSizeAndState(0, 0, 0) + 43).intern());
            sb2.append(this);
            sb2.append(m7744((char) android.view.View.resolveSize(0, 0), 87 - android.graphics.ImageFormat.getBitsPerPixel(0), android.text.TextUtils.getOffsetBefore("", 0) + 1).intern());
            new com.ironsource.adqualitysdk.sdk.i.dr(clVar, eeVar, sb2.toString(), e).m7590(clVar.m7200());
        }
        return m77182;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.ef m7745() {
        int i = 2 % 2;
        int i2 = f2019;
        int i3 = i2 + 45;
        f2021 = i3 % 128;
        int i4 = i3 % 2;
        com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f2023;
        int i5 = i2 + 91;
        f2021 = i5 % 128;
        if (i5 % 2 != 0) {
            return efVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ep
    public final java.lang.String toString() {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append(m7744((char) android.view.Gravity.getAbsoluteGravity(0, 0), 88 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0'), android.text.TextUtils.indexOf("", "", 0) + 3).intern());
        sb.append(m7745().toString());
        java.lang.String obj = sb.toString();
        int i2 = f2021 + 79;
        f2019 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ep
    public final boolean equals(java.lang.Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = f2021 + 93;
            f2019 = i2 % 128;
            return i2 % 2 == 0;
        }
        if (obj != null && getClass() == obj.getClass()) {
            if (!super.equals(obj)) {
                int i3 = f2019 + 79;
                f2021 = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f2023;
            com.ironsource.adqualitysdk.sdk.i.ef efVar2 = ((com.ironsource.adqualitysdk.sdk.i.er) obj).f2023;
            if (efVar != null) {
                return efVar.equals(efVar2);
            }
            if (efVar2 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ep
    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = f2019 + 65;
        f2021 = i3 % 128;
        int i4 = i3 % 2;
        int hashCode = super.hashCode() * 31;
        com.ironsource.adqualitysdk.sdk.i.ef efVar = this.f2023;
        if (efVar != null) {
            i = efVar.hashCode();
            int i5 = f2019 + 11;
            f2021 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m7744(char c, int i, int i2) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1207) {
            char[] cArr = new char[i2];
            com.ironsource.adqualitysdk.sdk.i.c.f1208 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.c.f1208 < i2) {
                cArr[com.ironsource.adqualitysdk.sdk.i.c.f1208] = (char) ((f2020[com.ironsource.adqualitysdk.sdk.i.c.f1208 + i] ^ (com.ironsource.adqualitysdk.sdk.i.c.f1208 * f2022)) ^ c);
                com.ironsource.adqualitysdk.sdk.i.c.f1208++;
            }
            str = new java.lang.String(cArr);
        }
        return str;
    }
}
