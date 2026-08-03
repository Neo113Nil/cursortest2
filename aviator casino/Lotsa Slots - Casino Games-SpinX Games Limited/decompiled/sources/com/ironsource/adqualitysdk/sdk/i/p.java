package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f3106 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int[] f3107;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static final android.os.Handler f3108;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static final java.util.concurrent.ScheduledExecutorService f3109;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f3110;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static final android.os.Handler f3111;

    /* renamed from: ﻛ, reason: contains not printable characters */
    static void m8545() {
        f3107 = new int[]{621951346, 554129842, -1770562891, 15781964, 317828427, 281533300, 936340100, 1880100504, -1716981975, -594389257, 998113686, -2078480336, -738254728, 1280070557, -496344797, -975173945, -1798293182, 632528032};
    }

    static {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
        m8545();
        f3111 = new android.os.Handler(android.os.Looper.getMainLooper());
        android.os.Handler m8543 = m8543();
        f3108 = m8543;
        if (m8543 == null) {
            scheduledExecutorService = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
            int i = f3110 + 41;
            f3106 = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } else {
            scheduledExecutorService = null;
        }
        f3109 = scheduledExecutorService;
        int i4 = f3110 + 63;
        f3106 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static android.os.Handler m8553() {
        int i = 2 % 2;
        int i2 = f3110 + 23;
        f3106 = i2 % 128;
        if (i2 % 2 != 0) {
            return f3111;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m8551(com.ironsource.adqualitysdk.sdk.i.je jeVar) {
        int i = 2 % 2;
        int i2 = f3106 + 63;
        f3110 = i2 % 128;
        int i3 = i2 % 2;
        if (!m8552()) {
            m8546(jeVar);
            return;
        }
        int i4 = f3106 + 121;
        f3110 = i4 % 128;
        int i5 = i4 % 2;
        jeVar.run();
        int i6 = f3110 + 67;
        f3106 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8546(com.ironsource.adqualitysdk.sdk.i.je jeVar) {
        int i = 2 % 2;
        int i2 = f3106 + 119;
        f3110 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                m8553().post(jeVar);
                return;
            }
            m8553().post(jeVar);
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        } catch (java.lang.Throwable unused) {
            com.ironsource.adqualitysdk.sdk.i.m.m8528(m8548(new int[]{-1768398299, 1051691502, 1376094147, -1643682096, 1993308040, 55048584}, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12).intern(), m8548(new int[]{-141257061, -2103618194, -182019254, 2032439213, -1645761662, -1671267098, 511058957, 1449920737, -963374330, 2138074815, -1011185014, 307574359, -160436756, 1142998141, 829619273, 8203275}, android.view.KeyEvent.getDeadChar(0, 0) + 29).intern(), false);
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m8544(com.ironsource.adqualitysdk.sdk.i.je jeVar, long j) {
        int i = 2 % 2;
        int i2 = f3106 + 83;
        f3110 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                m8553().postDelayed(jeVar, j);
            } else {
                m8553().postDelayed(jeVar, j);
                throw null;
            }
        } catch (java.lang.Throwable unused) {
            com.ironsource.adqualitysdk.sdk.i.m.m8528(m8548(new int[]{-1768398299, 1051691502, 1376094147, -1643682096, 1993308040, 55048584}, 12 - android.text.TextUtils.getCapsMode("", 0, 0)).intern(), m8548(new int[]{-141257061, -2103618194, -182019254, 2032439213, -1645761662, -1671267098, -1951368966, -1322678961, -28348876, -1310592639, -1231078610, 928073700, -963374330, 2138074815, -1011185014, 307574359, -160436756, 1142998141, 829619273, 8203275}, 37 - android.graphics.Color.red(0)).intern(), false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m8554(com.ironsource.adqualitysdk.sdk.i.je jeVar) {
        int i = 2 % 2;
        int i2 = f3110 + 95;
        f3106 = i2 % 128;
        if (i2 % 2 != 0) {
            if (m8552()) {
                int i3 = f3106 + 71;
                f3110 = i3 % 128;
                if (i3 % 2 == 0) {
                    m8549(jeVar);
                    return;
                } else {
                    m8549(jeVar);
                    int i4 = 19 / 0;
                    return;
                }
            }
            jeVar.run();
            return;
        }
        m8552();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m8549(com.ironsource.adqualitysdk.sdk.i.je jeVar) {
        int i = 2 % 2;
        int i2 = f3106 + 107;
        f3110 = i2 % 128;
        java.lang.Object obj = null;
        try {
            if (i2 % 2 == 0) {
                android.os.Handler m8547 = m8547();
                if (m8547 != null) {
                    m8547.post(jeVar);
                    return;
                }
                java.util.concurrent.ScheduledExecutorService scheduledExecutorService = f3109;
                if (scheduledExecutorService != null) {
                    int i3 = f3106 + 73;
                    f3110 = i3 % 128;
                    if (i3 % 2 == 0) {
                        scheduledExecutorService.execute(jeVar);
                        return;
                    } else {
                        scheduledExecutorService.execute(jeVar);
                        throw null;
                    }
                }
                com.ironsource.adqualitysdk.sdk.i.m.m8528(m8548(new int[]{-1768398299, 1051691502, 1376094147, -1643682096, 1993308040, 55048584}, android.view.MotionEvent.axisFromString("") + 13).intern(), m8548(new int[]{-1197097769, 1516248765, 724329398, -935862335, 2030468669, 1751617149, 2067107392, 1817268173, -527728537, 499605611, -1257836709, 1566789497, 1524907785, 1066728750, -983722423, -956596478, -441218123, -852801427, -1805784129, 995277949, 1166065063, 1865124124, 77840018, -336588001, 247310341, 2120525376}, android.view.View.MeasureSpec.getSize(0) + 52).intern(), false);
                return;
            }
            m8547();
            super.hashCode();
            throw null;
        } catch (java.lang.Throwable unused) {
            com.ironsource.adqualitysdk.sdk.i.m.m8528(m8548(new int[]{-1768398299, 1051691502, 1376094147, -1643682096, 1993308040, 55048584}, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12).intern(), m8548(new int[]{-141257061, -2103618194, -182019254, 2032439213, -1645761662, -1671267098, 511058957, 1449920737, -1174571853, -1486532682, 1074588006, 1001308909, -758532677, 1834953419, 2847859, -250659468, 150969600, -249783878}, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36).intern(), false);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m8550(com.ironsource.adqualitysdk.sdk.i.je jeVar, long j) {
        int i = 2 % 2;
        int i2 = f3110 + 57;
        f3106 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                android.os.Handler m8547 = m8547();
                if (m8547 == null) {
                    java.util.concurrent.ScheduledExecutorService scheduledExecutorService = f3109;
                    if (scheduledExecutorService != null) {
                        scheduledExecutorService.schedule(jeVar, j, java.util.concurrent.TimeUnit.MILLISECONDS);
                        return;
                    } else {
                        com.ironsource.adqualitysdk.sdk.i.m.m8528(m8548(new int[]{-1768398299, 1051691502, 1376094147, -1643682096, 1993308040, 55048584}, android.view.KeyEvent.normalizeMetaState(0) + 12).intern(), m8548(new int[]{-1197097769, 1516248765, 724329398, -935862335, 2030468669, 1751617149, 2067107392, 1817268173, -527728537, 499605611, -1257836709, 1566789497, 1524907785, 1066728750, -983722423, -956596478, -441218123, -852801427, -1805784129, 995277949, 1166065063, 1865124124, 77840018, -336588001, 247310341, 2120525376}, 52 - android.view.View.combineMeasuredStates(0, 0)).intern(), false);
                        return;
                    }
                }
                int i3 = f3106 + 51;
                f3110 = i3 % 128;
                if (i3 % 2 == 0) {
                    m8547.postDelayed(jeVar, j);
                    return;
                } else {
                    m8547.postDelayed(jeVar, j);
                    int i4 = 12 / 0;
                    return;
                }
            }
            m8547();
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        } catch (java.lang.Throwable unused) {
            com.ironsource.adqualitysdk.sdk.i.m.m8528(m8548(new int[]{-1768398299, 1051691502, 1376094147, -1643682096, 1993308040, 55048584}, android.view.View.combineMeasuredStates(0, 0) + 12).intern(), m8548(new int[]{-141257061, -2103618194, -182019254, 2032439213, -1645761662, -1671267098, -1951368966, -1322678961, -28348876, -1310592639, -1231078610, 928073700, -1174571853, -1486532682, 1074588006, 1001308909, -758532677, 1834953419, 2847859, -250659468, 150969600, -249783878}, 44 - android.view.KeyEvent.getDeadChar(0, 0)).intern(), false);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static android.os.Handler m8547() {
        int i = 2 % 2;
        int i2 = f3106 + 125;
        f3110 = i2 % 128;
        if (i2 % 2 == 0) {
            return f3108;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m8552() {
        int i = 2 % 2;
        java.lang.Object obj = null;
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            int i2 = f3110 + 57;
            f3106 = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            throw null;
        }
        int i3 = f3110;
        int i4 = i3 + 73;
        f3106 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 65;
        f3106 = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static android.os.Handler m8543() {
        android.os.HandlerThread handlerThread;
        int i = 2 % 2;
        int i2 = f3106 + 85;
        f3110 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < 3) {
            try {
                handlerThread = new android.os.HandlerThread(m8548(new int[]{426041053, 745093849, 1262991584, -465927634, 145822151, -20209200}, 10 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)).intern());
                try {
                    handlerThread.start();
                    return new android.os.Handler(handlerThread.getLooper());
                } catch (java.lang.Throwable unused) {
                    if (handlerThread != null) {
                        try {
                            handlerThread.quitSafely();
                        } catch (java.lang.Throwable unused2) {
                            com.ironsource.adqualitysdk.sdk.i.m.m8528(m8548(new int[]{-1768398299, 1051691502, 1376094147, -1643682096, 1993308040, 55048584}, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12).intern(), m8548(new int[]{-141257061, -2103618194, -182019254, 2032439213, 26327093, 379715407, 1253628177, -127331222, -1574072248, 1072353177, 377508188, 133172322, -1438332986, -1622780767, -621619074, 1758919274, -751518759, -1361665732}, 35 - (android.os.Process.myPid() >> 22)).intern(), true);
                        }
                    }
                    com.ironsource.adqualitysdk.sdk.i.m.m8528(m8548(new int[]{-1768398299, 1051691502, 1376094147, -1643682096, 1993308040, 55048584}, 12 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)).intern(), m8548(new int[]{-141257061, -2103618194, -182019254, 2032439213, 26327093, 379715407, 1253628177, -127331222, -1574072248, 1072353177, 377508188, 133172322, -1438332986, -1622780767, -621619074, 1758919274, 431700199, 1208226594, 1686160351, -1565922216, 65260135, -1091427008, 1260918137, -1639155475}, android.text.TextUtils.getTrimmedLength("") + 48).intern(), true);
                    i4++;
                    int i5 = f3110 + 115;
                    f3106 = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 3 % 4;
                    }
                }
            } catch (java.lang.Throwable unused3) {
                handlerThread = null;
            }
        }
        return null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m8548(int[] iArr, int i) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f96) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f3107.clone();
            com.ironsource.adqualitysdk.sdk.i.a.f93 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.a.f93 < iArr.length) {
                cArr[0] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.a.f93] >> 16);
                cArr[1] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.a.f93];
                cArr[2] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.a.f93 + 1] >> 16);
                cArr[3] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.a.f93 + 1];
                com.ironsource.adqualitysdk.sdk.i.a.f94 = (cArr[0] << 16) + cArr[1];
                com.ironsource.adqualitysdk.sdk.i.a.f95 = (cArr[2] << 16) + cArr[3];
                com.ironsource.adqualitysdk.sdk.i.a.m5770(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = com.ironsource.adqualitysdk.sdk.i.a.f94 ^ iArr2[i2];
                    com.ironsource.adqualitysdk.sdk.i.a.f94 = i3;
                    com.ironsource.adqualitysdk.sdk.i.a.f95 = com.ironsource.adqualitysdk.sdk.i.a.m5771(i3) ^ com.ironsource.adqualitysdk.sdk.i.a.f95;
                    int i4 = com.ironsource.adqualitysdk.sdk.i.a.f94;
                    com.ironsource.adqualitysdk.sdk.i.a.f94 = com.ironsource.adqualitysdk.sdk.i.a.f95;
                    com.ironsource.adqualitysdk.sdk.i.a.f95 = i4;
                }
                int i5 = com.ironsource.adqualitysdk.sdk.i.a.f94;
                com.ironsource.adqualitysdk.sdk.i.a.f94 = com.ironsource.adqualitysdk.sdk.i.a.f95;
                com.ironsource.adqualitysdk.sdk.i.a.f95 = i5;
                com.ironsource.adqualitysdk.sdk.i.a.f95 = i5 ^ iArr2[16];
                com.ironsource.adqualitysdk.sdk.i.a.f94 ^= iArr2[17];
                int i6 = com.ironsource.adqualitysdk.sdk.i.a.f94;
                int i7 = com.ironsource.adqualitysdk.sdk.i.a.f95;
                cArr[0] = (char) (com.ironsource.adqualitysdk.sdk.i.a.f94 >>> 16);
                cArr[1] = (char) com.ironsource.adqualitysdk.sdk.i.a.f94;
                cArr[2] = (char) (com.ironsource.adqualitysdk.sdk.i.a.f95 >>> 16);
                cArr[3] = (char) com.ironsource.adqualitysdk.sdk.i.a.f95;
                com.ironsource.adqualitysdk.sdk.i.a.m5770(iArr2);
                cArr2[com.ironsource.adqualitysdk.sdk.i.a.f93 << 1] = cArr[0];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f93 << 1) + 1] = cArr[1];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f93 << 1) + 2] = cArr[2];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f93 << 1) + 3] = cArr[3];
                com.ironsource.adqualitysdk.sdk.i.a.f93 += 2;
            }
            str = new java.lang.String(cArr2, 0, i);
        }
        return str;
    }
}
