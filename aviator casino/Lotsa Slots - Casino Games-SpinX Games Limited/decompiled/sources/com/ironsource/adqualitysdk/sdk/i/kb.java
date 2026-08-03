package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class kb {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2976 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2977 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2978 = -1285892779;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2979 = -592502075;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static short[] f2980 = null;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] f2981 = {87, -20, -22, -16, -119, 72, 79, -2, kotlin.io.encoding.Base64.padSymbol, -11, 77, -31, 67, -23, 71, 80, com.google.common.base.Ascii.CR, 56, 71, -31, 47, -12, 57, -17, com.google.common.base.Ascii.DC4, 59, 69, -13, 69, -30, com.google.common.base.Ascii.SUB, -29, com.google.common.base.Ascii.GS, 17, com.google.common.base.Ascii.SO, -101, 92, 83, com.google.common.base.Ascii.CR, 118, 77, 10, -90, com.google.common.base.Ascii.ETB, 118, 77, 19, -75, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.CR, 119, 62, -93, -76, com.google.common.base.Ascii.ETB, -49, -27, -94, -99, -1, -93, -89, -89, 91, 62, -93, -93, -101, -91, 104, 75, com.google.common.base.Ascii.VT, -89, -89, -94, -91, 99, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, -91, com.google.common.base.Ascii.SI, -94, -65, 0, 0, 0, 0, 0};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2982 = 62;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static org.json.JSONObject m8330(java.lang.String str, com.ironsource.adqualitysdk.sdk.i.av avVar, boolean z, com.ironsource.adqualitysdk.sdk.i.as asVar) {
        int i = 2 % 2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (z) {
            try {
                jSONObject.put(m8331((short) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 40), 1285892881 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) - 60, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 592502075, (byte) (61 - (android.view.ViewConfiguration.getScrollBarSize() >> 8))).intern(), true);
            } catch (org.json.JSONException e) {
                com.ironsource.adqualitysdk.sdk.i.m.m8532(m8331((short) ((-25) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), 1285892844 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (-36) - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 56691 - android.text.AndroidCharacter.getMirror('0'), (byte) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 39)).intern(), m8331((short) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 38), 1285892848 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.graphics.Color.argb(0, 0, 0, 0) - 11, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 592502108, (byte) ((-57) - android.widget.ExpandableListView.getPackedPositionChild(0L))).intern(), e);
            }
        }
        if (asVar.m6109()) {
            int i2 = f2976 + 39;
            f2977 = i2 % 128;
            int i3 = i2 % 2;
            jSONObject.put(m8331((short) (android.text.TextUtils.indexOf("", "") + 61), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1285892876, (-57) - android.view.View.MeasureSpec.getMode(0), 592502075 - android.text.TextUtils.lastIndexOf("", '0', 0, 0), (byte) (android.graphics.Color.blue(0) - 46)).intern(), true);
        }
        jSONObject.put(m8331((short) ((-36) - android.view.KeyEvent.keyCodeFromString("")), 1285892891 - android.text.TextUtils.getTrimmedLength(""), android.text.TextUtils.indexOf("", "") - 58, 592502080 - android.widget.ExpandableListView.getPackedPositionType(0L), (byte) (android.widget.ExpandableListView.getPackedPositionChild(0L) - 32)).intern(), str);
        int i4 = f2977 + 117;
        f2976 = i4 % 128;
        int i5 = i4 % 2;
        com.ironsource.adqualitysdk.sdk.i.kj.m8422(jSONObject, avVar.m6202());
        com.ironsource.adqualitysdk.sdk.i.kj.m8422(jSONObject, avVar.m6204());
        int i6 = f2977 + 3;
        f2976 = i6 % 128;
        if (i6 % 2 == 0) {
            return jSONObject;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m8331(short s, int i, int i2, int i3, byte b) {
        java.lang.String obj;
        synchronized (com.ironsource.adqualitysdk.sdk.i.n.f3098) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i4 = f2982;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2981;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2979 + i3] + i4);
                } else {
                    i5 = (short) (f2980[f2979 + i3] + i4);
                }
            }
            if (i5 > 0) {
                com.ironsource.adqualitysdk.sdk.i.n.f3100 = ((i3 + i5) - 2) + f2979 + i6;
                com.ironsource.adqualitysdk.sdk.i.n.f3101 = b;
                com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (i + f2978);
                sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                com.ironsource.adqualitysdk.sdk.i.n.f3099 = 1;
                while (com.ironsource.adqualitysdk.sdk.i.n.f3099 < i5) {
                    byte[] bArr2 = f2981;
                    if (bArr2 != null) {
                        int i7 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                        com.ironsource.adqualitysdk.sdk.i.n.f3100 = i7 - 1;
                        com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((byte) (bArr2[i7] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                    } else {
                        short[] sArr = f2980;
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
