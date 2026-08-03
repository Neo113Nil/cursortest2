package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ht extends com.ironsource.adqualitysdk.sdk.i.hi<android.view.View.OnTouchListener> implements android.view.View.OnTouchListener {

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2422 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2423;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.ht.e f2424;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2421 = {62636, 5436, 14293, 20895, 29266, 40181, 48813, 57208, 63746, 7081, 9341, 17949, 24769, 33147, 41791, 52728, 61334, 2113, 11006, 13490, 21846, 30482, 37306, 45686, 57158, 16064, 7187, 31359, 22965, 46934, 38220, 62650, 53931, 12375, 4029, 28154, 19203, 43671, 35038, 58920, 50294, 9132, 276, 8018, 32503, 23785, 47707, 39344, 63476, 54591, 13466, 4800};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2420 = 5055208583091249585L;

    public interface e {
        /* renamed from: ﻛ */
        boolean mo7408(com.ironsource.adqualitysdk.sdk.i.ht htVar, android.view.View view, android.view.MotionEvent motionEvent);
    }

    public ht(android.view.View.OnTouchListener onTouchListener, com.ironsource.adqualitysdk.sdk.i.ht.e eVar) {
        super(onTouchListener);
        this.f2424 = eVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = f2422 + 39;
        f2423 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2424.mo7408(this, view, motionEvent);
            int i4 = f2422 + 117;
            f2423 = i4 % 128;
            int i5 = i4 % 2;
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7852((char) ((-16714525) - android.graphics.Color.rgb(0, 0, 0)), android.text.TextUtils.getOffsetBefore("", 0), android.text.TextUtils.lastIndexOf("", '0') + 25).intern(), m7852((char) (57091 - android.widget.ExpandableListView.getPackedPositionType(0L)), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 24, 28 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)).intern(), th, false);
        }
        if (mo6360() != null) {
            return mo6360().onTouch(view, motionEvent);
        }
        return false;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m7852(char c, int i, int i2) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1207) {
            char[] cArr = new char[i2];
            com.ironsource.adqualitysdk.sdk.i.c.f1208 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.c.f1208 < i2) {
                cArr[com.ironsource.adqualitysdk.sdk.i.c.f1208] = (char) ((f2421[com.ironsource.adqualitysdk.sdk.i.c.f1208 + i] ^ (com.ironsource.adqualitysdk.sdk.i.c.f1208 * f2420)) ^ c);
                com.ironsource.adqualitysdk.sdk.i.c.f1208++;
            }
            str = new java.lang.String(cArr);
        }
        return str;
    }
}
