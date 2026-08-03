package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class aq extends com.ironsource.adqualitysdk.sdk.i.ar.AnonymousClass5 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f375 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f377 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final java.lang.String f379;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f376 = {'c', 33003, 358, 33250, 629, 33527, 876, 33779, 1106, 34007, io.ktor.util.date.GMTDateParser.SECONDS, 43442, 53284, 20643, 53544, 15909, 48813, 16160, 49060, 15411, 48305, 15658, 48565, 14868, 47796, 15115, 48024, 14341, 47259, 14609, 47508};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f378 = -5238656317957373820L;

    public aq(com.ironsource.adqualitysdk.sdk.i.aw awVar) {
        m6033((char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 10).intern();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m6033((char) android.view.Gravity.getAbsoluteGravity(0, 0), android.text.TextUtils.getOffsetAfter("", 0) + 10, -android.widget.ExpandableListView.getPackedPositionChild(0L)).intern());
        sb.append(java.util.UUID.randomUUID().toString().replace(m6033((char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43423), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 11, 1 - android.view.KeyEvent.getDeadChar(0, 0)).intern(), ""));
        this.f379 = sb.toString();
        m6074(awVar);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final java.lang.String m6035() {
        org.json.JSONObject m6072;
        java.lang.String m6033;
        int i = 2 % 2;
        int i2 = f377 + 11;
        f375 = i2 % 128;
        if (i2 % 2 != 0) {
            m6072 = m6072();
            m6033 = m6033((char) (53326 % (android.view.ViewConfiguration.getMinimumFlingVelocity() + 6)), 4 >>> (android.util.TypedValue.complexToFloat(1) > 1.0f ? 1 : (android.util.TypedValue.complexToFloat(1) == 1.0f ? 0 : -1)), 5 % android.view.View.MeasureSpec.makeMeasureSpec(1, 1));
        } else {
            m6072 = m6072();
            m6033 = m6033((char) (53326 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), 12 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 3);
        }
        return m6072.optString(m6033.intern(), this.f379);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final java.lang.String m6036(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f375 + 37;
        f377 = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            org.json.JSONObject optJSONObject = m6034().optJSONObject(str);
            if (optJSONObject == null) {
                return null;
            }
            int i3 = f377 + 35;
            f375 = i3 % 128;
            int i4 = i3 % 2;
            return optJSONObject.optString(m6033((char) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 15943), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 16).intern());
        }
        m6034().optJSONObject(str);
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final boolean m6037() {
        org.json.JSONObject m6072;
        char capsMode;
        int i;
        int myTid;
        int i2 = 2 % 2;
        int i3 = f375 + 77;
        f377 = i3 % 128;
        if (i3 % 2 == 0) {
            m6072 = m6072();
            capsMode = (char) android.text.TextUtils.getCapsMode("", 1, 1);
            i = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1;
            myTid = (android.os.Process.myTid() / 53) * 68;
        } else {
            m6072 = m6072();
            capsMode = (char) android.text.TextUtils.getCapsMode("", 0, 0);
            i = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1;
            myTid = 10 - (android.os.Process.myTid() >> 22);
        }
        boolean has = m6072.has(m6033(capsMode, i, myTid).intern());
        int i4 = f375 + 39;
        f377 = i4 % 128;
        int i5 = i4 % 2;
        return has;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private org.json.JSONObject m6034() {
        int i = 2 % 2;
        int i2 = f375 + 117;
        f377 = i2 % 128;
        int i3 = i2 % 2;
        org.json.JSONObject optJSONObject = m6072().optJSONObject(m6033((char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), android.text.AndroidCharacter.getMirror('0') - '0', android.graphics.Color.red(0) + 10).intern());
        if (optJSONObject != null) {
            return optJSONObject;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int i4 = f375 + 29;
        f377 = i4 % 128;
        int i5 = i4 % 2;
        return jSONObject;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m6033(char c, int i, int i2) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1207) {
            char[] cArr = new char[i2];
            com.ironsource.adqualitysdk.sdk.i.c.f1208 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.c.f1208 < i2) {
                cArr[com.ironsource.adqualitysdk.sdk.i.c.f1208] = (char) ((f376[com.ironsource.adqualitysdk.sdk.i.c.f1208 + i] ^ (com.ironsource.adqualitysdk.sdk.i.c.f1208 * f378)) ^ c);
                com.ironsource.adqualitysdk.sdk.i.c.f1208++;
            }
            str = new java.lang.String(cArr);
        }
        return str;
    }
}
