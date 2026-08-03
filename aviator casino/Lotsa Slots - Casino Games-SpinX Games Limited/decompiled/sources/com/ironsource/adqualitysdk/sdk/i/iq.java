package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class iq {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2568 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2569 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2570 = 171;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m8092(java.lang.String str, java.lang.String str2) {
        int i = 2 % 2;
        int i2 = f2568 + 43;
        f2569 = i2 % 128;
        int i3 = i2 % 2;
        com.ironsource.adqualitysdk.sdk.i.m.m8517(str, str2);
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m8093(java.lang.String str, java.lang.String str2) {
        int i = 2 % 2;
        int i2 = f2569 + 59;
        f2568 = i2 % 128;
        int i3 = i2 % 2;
        com.ironsource.adqualitysdk.sdk.i.m.m8524(str, str2);
        int i4 = f2568 + 89;
        f2569 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static java.lang.String m8090(android.content.Context context) {
        int i = 2 % 2;
        int i2 = f2568 + 65;
        f2569 = i2 % 128;
        if (i2 % 2 == 0) {
            java.lang.String string = android.provider.Settings.Secure.getString(context.getApplicationContext().getContentResolver(), m8089(android.text.AndroidCharacter.getMirror('\f') * 21, true, 4066 >> (android.os.Process.myTid() % 79), "�\u000b\b\u0002�\ufff8\u0002�\ufffa\u0007", 77 >>> (android.os.Process.myTid() / 65)).intern());
            if (string != null) {
                return string;
            }
        } else {
            java.lang.String string2 = android.provider.Settings.Secure.getString(context.getApplicationContext().getContentResolver(), m8089(':' - android.text.AndroidCharacter.getMirror('0'), false, 274 - (android.os.Process.myTid() >> 22), "�\u000b\b\u0002�\ufff8\u0002�\ufffa\u0007", 8 - (android.os.Process.myTid() >> 22)).intern());
            if (string2 != null) {
                return string2;
            }
        }
        int i3 = f2568 + 29;
        f2569 = i3 % 128;
        int i4 = i3 % 2;
        m8093(m8089((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 33, true, android.view.KeyEvent.keyCodeFromString("") + 265, "\u0014\u0017\u0005\u0015\u0004\ufff1ￂ￣\ufff8\uffe7\uffe7￭\ufff5￫\u0015\u0007\u0005\u0010\u0007\u0014\u0007\b\u0007\u0014\ufff2\u0006\u0007\u0014\u0003\n\ufff5\u0006\u0007", 14 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), m8089(46 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), true, 257 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u0013\u001d\uffffￊ\uffd8￮\ufff3\t￮\ufff3\ufff9￼￮\ufff8￫ￊ\u0012\r\u001e\u000f\u0010ￊ\u001e\uffd1\u0018\u000e\u0016\u001f\u0019￭\uffd8\u000e\u0013ￊ\u000e\u000f\u001e\u000b\u001c\u000f\u0018\u000f\u0011ￊ\u0011\u0018", 30 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)).intern());
        java.lang.String m8091 = m8091(context);
        int i5 = f2569 + 29;
        f2568 = i5 % 128;
        int i6 = i5 % 2;
        return m8091;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m8091(android.content.Context context) {
        int i = 2 % 2;
        int i2 = f2568 + 21;
        f2569 = i2 % 128;
        int i3 = i2 % 2;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(m8089((android.view.ViewConfiguration.getTapTimeout() >> 16) + 11, false, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 268, "\u0015ￍ\u0003\u0001\u0012\u0013\u000e\u0011\u0004ￍ\n", 4 - android.view.View.MeasureSpec.getMode(0)).intern(), 0);
        java.lang.String string = sharedPreferences.getString(m8089((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 17, false, android.graphics.Color.blue(0) + 273, "\u0003\ufffe\r\t\t\u0007\u0006\ufffb\uffc8\u0001\uffff\b\uffff\f\ufffb\u000e\uffff\ufffe", 1 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0)).intern(), null);
        if (android.text.TextUtils.isEmpty(string)) {
            string = java.util.UUID.randomUUID().toString();
            sharedPreferences.edit().putString(m8089(18 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), false, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 273, "\u0003\ufffe\r\t\t\u0007\u0006\ufffb\uffc8\u0001\uffff\b\uffff\f\ufffb\u000e\uffff\ufffe", 3 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), string).commit();
        }
        int i4 = f2569 + 109;
        f2568 = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m8089(int i, boolean z, int i2, java.lang.String str, int i3) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1654) {
            char[] cArr3 = new char[i];
            com.ironsource.adqualitysdk.sdk.i.d.f1651 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.d.f1651 < i) {
                com.ironsource.adqualitysdk.sdk.i.d.f1653 = cArr2[com.ironsource.adqualitysdk.sdk.i.d.f1651];
                cArr3[com.ironsource.adqualitysdk.sdk.i.d.f1651] = (char) (com.ironsource.adqualitysdk.sdk.i.d.f1653 + i2);
                int i4 = com.ironsource.adqualitysdk.sdk.i.d.f1651;
                cArr3[i4] = (char) (cArr3[i4] - f2570);
                com.ironsource.adqualitysdk.sdk.i.d.f1651++;
            }
            if (i3 > 0) {
                com.ironsource.adqualitysdk.sdk.i.d.f1652 = i3;
                char[] cArr4 = new char[i];
                java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i);
                java.lang.System.arraycopy(cArr4, 0, cArr3, i - com.ironsource.adqualitysdk.sdk.i.d.f1652, com.ironsource.adqualitysdk.sdk.i.d.f1652);
                java.lang.System.arraycopy(cArr4, com.ironsource.adqualitysdk.sdk.i.d.f1652, cArr3, 0, i - com.ironsource.adqualitysdk.sdk.i.d.f1652);
            }
            if (z) {
                char[] cArr5 = new char[i];
                com.ironsource.adqualitysdk.sdk.i.d.f1651 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.d.f1651 < i) {
                    cArr5[com.ironsource.adqualitysdk.sdk.i.d.f1651] = cArr3[(i - com.ironsource.adqualitysdk.sdk.i.d.f1651) - 1];
                    com.ironsource.adqualitysdk.sdk.i.d.f1651++;
                }
                cArr3 = cArr5;
            }
            str2 = new java.lang.String(cArr3);
        }
        return str2;
    }
}
