package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class kf {

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f3002 = 1;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f3003;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static boolean f3004;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f3005;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f3006;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f3007;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f3008;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f3009;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f3010;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f3011;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static org.json.JSONObject f3012;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static org.json.JSONObject f3013;

    /* renamed from: ｋ, reason: contains not printable characters */
    static void m8371() {
        f3010 = (char) 46552;
        f3009 = (char) 7714;
        f3007 = (char) 30205;
        f3011 = (char) 17426;
        f3004 = true;
        f3005 = true;
        f3006 = 235;
        f3008 = new char[]{339, 303, 336, 353, 340, 334, 320, 351, 343, 350, 304, 349, 346, 267, 345, 338, 347, 332, 356, 312, 337, 344, 355, 354, 352, 293, 333, 335};
    }

    static {
        m8371();
        f3012 = null;
        int i = f3002 + 87;
        f3003 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static java.lang.String m8365() {
        int i = 2 % 2;
        int i2 = f3003 + 65;
        f3002 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String str = android.os.Build.VERSION.RELEASE;
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m8374(org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f3002 + 75;
        f3003 = i2 % 128;
        int i3 = i2 % 2;
        try {
            jSONObject.put(m8370("䦱㱞᱙㚙", '4' - android.text.AndroidCharacter.getMirror('0')).intern(), m8361());
            int i4 = f3003 + 43;
            f3002 = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        } catch (org.json.JSONException unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m8381(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = f3002 + 47;
        f3003 = i4 % 128;
        int i5 = i4 % 2;
        if (i < 0 || i2 < 0 || i > m8375()) {
            return false;
        }
        int i6 = f3002 + 105;
        f3003 = i6 % 128;
        int i7 = i6 % 2;
        if (i2 > m8378()) {
            return false;
        }
        int i8 = f3003 + 17;
        f3002 = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int m8375() {
        int i = 2 % 2;
        int i2 = f3003 + 121;
        f3002 = i2 % 128;
        int i3 = i2 % 2;
        int optInt = m8361().optInt(m8370("ࡅ붌", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern());
        int i4 = f3003 + 73;
        f3002 = i4 % 128;
        if (i4 % 2 != 0) {
            return optInt;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int m8378() {
        int i = 2 % 2;
        int i2 = f3003 + 45;
        f3002 = i2 % 128;
        int i3 = i2 % 2;
        int optInt = m8361().optInt(m8379(null, 128 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), null, "\u0081").intern());
        int i4 = f3002 + 31;
        f3003 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return optInt;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static org.json.JSONObject m8361() {
        int i = 2 % 2;
        int i2 = f3002 + 59;
        f3003 = i2 % 128;
        int i3 = i2 % 2;
        org.json.JSONObject m8414 = com.ironsource.adqualitysdk.sdk.i.kj.m8414(m8358());
        int i4 = f3003 + 17;
        f3002 = i4 % 128;
        if (i4 % 2 != 0) {
            return m8414;
        }
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static synchronized org.json.JSONObject m8358() {
        org.json.JSONObject jSONObject;
        synchronized (com.ironsource.adqualitysdk.sdk.i.kf.class) {
            int i = 2 % 2;
            int i2 = f3002 + 45;
            f3003 = i2 % 128;
            int i3 = i2 % 2;
            if (f3012 == null) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                f3012 = jSONObject2;
                try {
                    jSONObject2.put(m8370("ࡅ붌", 1 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), -1);
                    f3012.put(m8379(null, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, null, "\u0081").intern(), -1);
                    int i4 = f3003 + 77;
                    f3002 = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 2 % 2;
                    }
                } catch (org.json.JSONException unused) {
                }
            }
            jSONObject = f3012;
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r4 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        m8373(r4.getApplicationContext());
        r4 = com.ironsource.adqualitysdk.sdk.i.kf.f3003 + 103;
        com.ironsource.adqualitysdk.sdk.i.kf.f3002 = r4 % 128;
        r4 = r4 % 2;
        r1 = 2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001a, code lost:
    
        if (r4 != null) goto L14;
     */
    /* renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized void m8366(android.app.Activity activity) {
        synchronized (com.ironsource.adqualitysdk.sdk.i.kf.class) {
            int i = 2 % 2;
            int i2 = f3002 + 103;
            f3003 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 47 / 0;
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m8372(android.app.Application application) {
        int i = 2 % 2;
        int i2 = f3003 + 85;
        f3002 = i2 % 128;
        int i3 = i2 % 2;
        if (application != null) {
            m8373(application.getApplicationContext());
        }
        int i4 = f3003 + 25;
        f3002 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0055, code lost:
    
        if (r2 != null) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9 A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #1 {all -> 0x00c2, blocks: (B:11:0x001e, B:14:0x0057, B:31:0x008e, B:32:0x00b3, B:34:0x00b9, B:36:0x003b, B:40:0x00c6, B:41:0x00c9, B:20:0x0068, B:23:0x0080, B:28:0x0076), top: B:6:0x0011, outer: #0, inners: #2 }] */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static synchronized void m8373(android.content.Context context) {
        android.view.WindowManager windowManager;
        android.content.res.Resources resources;
        android.graphics.Rect bounds;
        synchronized (com.ironsource.adqualitysdk.sdk.i.kf.class) {
            int i = 2 % 2;
            int i2 = f3002;
            int i3 = i2 + 13;
            f3003 = i3 % 128;
            java.lang.Object obj = null;
            try {
                if (i3 % 2 != 0) {
                    super.hashCode();
                    throw null;
                }
                if (context != null) {
                    int i4 = i2 + 77;
                    f3003 = i4 % 128;
                    if (i4 % 2 != 0) {
                        windowManager = (android.view.WindowManager) context.getSystemService(m8370("辽瓔䎫⨙諑ꟾ", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 1L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 1L ? 0 : -1)) * 70).intern());
                        if (windowManager != null) {
                        }
                        resources = context.getResources();
                        if (resources != null) {
                            m8380(resources.getDisplayMetrics());
                            int i5 = 2 % 2;
                        }
                    } else {
                        windowManager = (android.view.WindowManager) context.getSystemService(m8370("辽瓔䎫⨙諑ꟾ", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6).intern());
                    }
                    if (android.os.Build.VERSION.SDK_INT >= 30) {
                        int i6 = f3003 + 5;
                        f3002 = i6 % 128;
                        try {
                            if (i6 % 2 == 0) {
                                bounds = windowManager.getCurrentWindowMetrics().getBounds();
                                int i7 = 89 / 0;
                                if (bounds != null) {
                                }
                            } else {
                                bounds = windowManager.getCurrentWindowMetrics().getBounds();
                            }
                            m8362(bounds.height(), bounds.width());
                            return;
                        } catch (java.lang.Throwable th) {
                            com.ironsource.adqualitysdk.sdk.i.m.m8532(m8379(null, android.view.KeyEvent.keyCodeFromString("") + 127, null, "\u008a\u0089\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082").intern(), m8370("똂\ue061ꏪ᳗Ṧ咣㵹氚㉜ȇꈸ⛖凤蜮ꕨႈ\uf75d粙㵹氚⏒揕⚙앁ꈸ⛖⊪澪┗ୱ빅\uf4fcꏪ᳗\uef9cꬉ辽瓔䎫⨙諑ꟾ귱ᛦꕨႈ监\ue153", android.view.View.combineMeasuredStates(0, 0) + 48).intern(), th);
                        }
                    }
                    resources = context.getResources();
                    if (resources != null) {
                    }
                }
            } catch (java.lang.Throwable th2) {
                com.ironsource.adqualitysdk.sdk.i.m.m8532(m8379(null, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 127, null, "\u008a\u0089\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082").intern(), m8379(null, android.view.View.getDefaultSize(0, 0) + 127, null, "\u0088\u0097\u0083\u0088\u008f\u008d\u0086\u008e\u0096\u008d\u008c\u0095\u008e\u008a\u0086\u0085\u008c\u0088\u0083\u0094\u0093\u0092\u0089\u0091\u008a\u0085\u0082\u008e\u0090\u008f\u0085\u0088\u0088\u0083\u0090\u008e\u008f\u0085\u008e\u008c\u008d\u008c\u008c\u008b").intern(), th2);
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m8380(android.util.DisplayMetrics displayMetrics) {
        int i = 2 % 2;
        int i2 = f3003;
        int i3 = i2 + 123;
        f3002 = i3 % 128;
        int i4 = i3 % 2;
        if (displayMetrics != null) {
            int i5 = i2 + 89;
            f3002 = i5 % 128;
            int i6 = i5 % 2;
            m8362(displayMetrics.heightPixels, displayMetrics.widthPixels);
        }
        int i7 = f3002 + 65;
        f3003 = i7 % 128;
        int i8 = i7 % 2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m8362(int i, int i2) {
        int i3 = 2 % 2;
        if (i > 0) {
            int i4 = f3003;
            int i5 = i4 + 11;
            f3002 = i5 % 128;
            int i6 = i5 % 2;
            if (i2 > 0) {
                int i7 = i4 + 97;
                f3002 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    org.json.JSONObject m8358 = m8358();
                    m8358.put(m8370("ࡅ붌", (-16777215) - android.graphics.Color.rgb(0, 0, 0)).intern(), i2);
                    m8358.put(m8379(null, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, null, "\u0081").intern(), i);
                } catch (java.lang.Throwable th) {
                    com.ironsource.adqualitysdk.sdk.i.m.m8532(m8379(null, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, null, "\u008a\u0089\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082").intern(), m8370("똂\ue061ꏪ᳗Ṧ咣풼ⴀ灒|㵹氚棋⚷씿轠ᛒ⻒밄䎠秨ꈿ莻䑳썔ꘕ", 26 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), th);
                }
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8367(android.content.Context context, org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        try {
            android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(m8370("⥀줸凤蜮邅柙\u0ebe㗏", android.text.TextUtils.getCapsMode("", 0, 0) + 8).intern());
            android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            jSONObject.put(m8379(null, 127 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), null, "\u0084\u0092\u0096\u0096").intern(), memoryInfo.availMem / android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            jSONObject.put(m8370("䙓侠力縣", 3 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), memoryInfo.threshold / android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            if (memoryInfo.lowMemory) {
                int i2 = f3003 + 123;
                f3002 = i2 % 128;
                int i3 = i2 % 2;
                jSONObject.put(m8379(null, 126 - android.graphics.ImageFormat.getBitsPerPixel(0), null, "\u0098\u0089\u0096\u0096").intern(), memoryInfo.lowMemory);
                int i4 = f3003 + 15;
                f3002 = i4 % 128;
                int i5 = i4 % 2;
            }
            jSONObject.put(m8379(null, android.widget.ExpandableListView.getPackedPositionType(0L) + 127, null, "\u0088\u0088\u0096\u0096").intern(), memoryInfo.totalMem / android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        } catch (java.lang.Throwable th) {
            java.lang.String intern = m8379(null, 127 - (android.os.Process.myTid() >> 22), null, "\u008a\u0089\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082").intern();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m8379(null, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 127, null, "\u008e\u009a\u0083\u0090\u0092\u008a\u0099\u008e\u0093\u008c\u008d\u0096\u0083\u0096\u008e\u0090\u008f\u0085\u0088\u0088\u0083\u0090\u008e\u008c\u008d\u008c\u008c\u008b").intern());
            sb.append(th.getLocalizedMessage());
            com.ironsource.adqualitysdk.sdk.i.m.m8524(intern, sb.toString());
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8369(org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f3003 + 7;
        f3002 = i2 % 128;
        int i3 = i2 % 2;
        try {
            long totalRxBytes = android.net.TrafficStats.getTotalRxBytes();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            if (totalRxBytes != -1) {
                int i4 = f3003 + 33;
                f3002 = i4 % 128;
                int i5 = i4 % 2;
                long totalRxBytes2 = android.net.TrafficStats.getTotalRxBytes();
                jSONObject.put(m8379(null, 128 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), null, "\u0091\u008a\u0098\u008f").intern(), java.lang.Math.round((totalRxBytes2 - totalRxBytes) * (1000.0f / (currentTimeMillis2 - currentTimeMillis))));
                jSONObject.put(m8379(null, (android.os.Process.myTid() >> 22) + 127, null, "\u0097\u008c\u0098\u008f").intern(), totalRxBytes2);
            }
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.m.m8532(m8379(null, 126 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0), null, "\u008a\u0089\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082").intern(), m8370("똂\ue061ꏪ᳗Ṧ咣㊦\ue817灒|㵹氚棋⚷\u0dceݮ࢙뤝馫멄颠邃ౡ⚭霛靿\uf688└\u0e60륿禍엘䨺萙썔ꘕ", 35 - android.view.KeyEvent.getDeadChar(0, 0)).intern(), th);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m8377(org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f3002 + 125;
        f3003 = i2 % 128;
        int i3 = i2 % 2;
        org.json.JSONObject m8359 = m8359();
        if (m8359 != null) {
            int i4 = f3002 + 45;
            f3003 = i4 % 128;
            int i5 = i4 % 2;
            com.ironsource.adqualitysdk.sdk.i.kj.m8422(jSONObject, m8359);
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m8363(android.content.Context context, org.json.JSONObject jSONObject, boolean z) {
        int i = 2 % 2;
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService(m8370("礶︈⏒뙩訵ﳰ凤蜮邅柙\u0ebe㗏", 13 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService(m8370("㭣匏\u192d䀄썔ꘕ", 4 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0')).intern());
            android.net.NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
            if (networkInfo != null) {
                int i2 = f3002 + 87;
                f3003 = i2 % 128;
                int i3 = i2 % 2;
                jSONObject.put(m8379(null, android.widget.ExpandableListView.getPackedPositionType(0L) + 127, null, "\u0088\u008a\u009b\u0096").intern(), networkInfo.getState());
                if (networkInfo.getState() == android.net.NetworkInfo.State.CONNECTED) {
                    int i4 = f3003 + 119;
                    f3002 = i4 % 128;
                    int i5 = i4 % 2;
                    jSONObject.put(m8370("㫈쨺⾂\u173a趪逌", 5 - android.view.View.resolveSizeAndState(0, 0, 0)).intern(), networkInfo.getType());
                    jSONObject.put(m8370("㫈쨺⾂\u173a", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4).intern(), networkInfo.getTypeName());
                    jSONObject.put(m8370("㫈쨺\uf3d3\uea1e趪逌", 5 - android.view.Gravity.getAbsoluteGravity(0, 0)).intern(), networkInfo.getSubtype());
                    jSONObject.put(m8370("㫈쨺\uf3d3\uea1e", 4 - android.view.KeyEvent.normalizeMetaState(0)).intern(), networkInfo.getSubtypeName());
                    jSONObject.put(m8379(null, 128 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), null, "\u008d\u008f\u009b\u0096").intern(), telephonyManager.getNetworkOperator());
                    jSONObject.put(m8370("㫈쨺\u192d䀄", 3 - android.view.MotionEvent.axisFromString("")).intern(), telephonyManager.getNetworkOperatorName());
                    jSONObject.put(m8370("㫈쨺⸾튳", 5 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), telephonyManager.getNetworkCountryIso());
                    if (z) {
                        int i6 = f3003 + 109;
                        f3002 = i6 % 128;
                        int i7 = i6 % 2;
                        jSONObject.put(m8379(null, android.graphics.Color.argb(0, 0, 0, 0) + 127, null, "\u008d\u008a\u009b\u0096").intern(), telephonyManager.getSimOperator());
                        jSONObject.put(m8370("㫈쨺쮀\ue095", 4 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), telephonyManager.getSimOperatorName());
                    }
                }
            }
            int i8 = f3003 + 125;
            f3002 = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.m.m8532(m8379(null, 128 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), null, "\u008a\u0089\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082").intern(), m8379(null, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 126, null, "\u0088\u008f\u0083\u0084\u0083\u008e\u008d\u0088\u008e\u008d\u0095\u008f\u0085\u008e\u0083\u0089\u0085\u009b\u008d\u0096\u008e\u0090\u008f\u0085\u009c\u009c\u0092\u008e\u008c\u008d\u008c\u008c\u008b").intern(), th);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m8376(android.content.Context context, org.json.JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f3003 + 85;
        f3002 = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (!com.ironsource.adqualitysdk.sdk.i.kh.m8388(context, m8370("馫멄겅焊\uffef⟴진\u16fe슸ࠪ㾠㎝ꔸ䲨䦱㱞\u192d䀄廟ꕟ崮꽿鹼\ue921纄厉Ǵ場銆瘇훰搋䜻悡蠏ᛶ", (android.os.Process.myTid() >> 22) + 36).intern())) {
                return;
            }
            int i4 = f3002 + 75;
            f3003 = i4 % 128;
            int i5 = i4 % 2;
            android.net.wifi.WifiInfo connectionInfo = ((android.net.wifi.WifiManager) context.getSystemService(m8370("辽瓔綂憄", 3 - android.widget.ExpandableListView.getPackedPositionChild(0L)).intern())).getConnectionInfo();
            jSONObject.put(m8370("䙺Ἐꅔ婁", 4 - android.view.View.resolveSize(0, 0)).intern(), connectionInfo.getSupplicantState());
            if (connectionInfo.getSupplicantState() == android.net.wifi.SupplicantState.COMPLETED) {
                int i6 = f3002 + 97;
                f3003 = i6 % 128;
                int i7 = i6 % 2;
                jSONObject.put(m8379(null, 175 - android.text.AndroidCharacter.getMirror('0'), null, "\u008a\u008c\u0095\u0098").intern(), connectionInfo.getRssi());
                jSONObject.put(m8370("䙺Ἐ\uf3d3\uea1e", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 4).intern(), connectionInfo.getLinkSpeed());
            }
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.m.m8532(m8379(null, 127 - android.text.TextUtils.getOffsetAfter("", 0), null, "\u008a\u0089\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082").intern(), m8370("똂\ue061ꏪ᳗Ṧ咣\ued40鋕ᥳ\udbe3ꕨႈ\uf75d粙띭㍳\uf3e9弿㵹氚毌⑩帐䗲慱᷈鴪唀밄䎠粳髷", android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 32).intern(), th);
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8368(android.content.Intent intent) {
        int i;
        int i2 = 2 % 2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.Object obj = null;
        if (intent != null) {
            try {
                int i3 = -1;
                jSONObject.put(m8370("躷\ue6c5埦\udb8b", android.text.TextUtils.getOffsetAfter("", 0) + 4).intern(), intent.hasExtra(m8379(null, 127 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), null, "\u009c\u0083\u0090\u0090\u0099\u0089\u0091").intern()) ? intent.getIntExtra(m8379(null, 127 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), null, "\u009c\u0083\u0090\u0090\u0099\u0089\u0091").intern(), -1) : -1);
                if (intent.hasExtra(m8379(null, 127 - android.text.TextUtils.indexOf("", "", 0, 0), null, "\u0089\u0083\u0084\u0083\u0089").intern())) {
                    int i4 = f3003 + 37;
                    f3002 = i4 % 128;
                    int i5 = i4 % 2;
                    i = intent.getIntExtra(m8379(null, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, null, "\u0089\u0083\u0084\u0083\u0089").intern(), -1);
                } else {
                    i = -1;
                }
                if (intent.hasExtra(m8370("씿轠䉈陙썔ꘕ", 5 - android.view.KeyEvent.keyCodeFromString("")).intern())) {
                    int i6 = f3002 + 109;
                    f3003 = i6 % 128;
                    int i7 = i6 % 2;
                    i3 = intent.getIntExtra(m8370("씿轠䉈陙썔ꘕ", 5 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)).intern(), -1);
                }
                jSONObject.put(m8379(null, 127 - android.view.View.resolveSize(0, 0), null, "\u0084\u0089\u0088\u009b").intern(), java.lang.Math.round((i * 100.0f) / i3));
            } catch (java.lang.Throwable th) {
                java.lang.String intern = m8379(null, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, null, "\u008a\u0089\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082").intern();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(m8370("똂\ue061ꏪ᳗Ṧ咣\ued40鋕ᥳ\udbe3ꕨႈ\ue051뺈鑄㉚쀅헓㠝䘑炞綻鴪唀፸뎄퓴薷\uf6e2즱䋓笩\ue527껒僞忤ငㆿ", android.text.TextUtils.indexOf("", "", 0, 0) + 37).intern());
                sb.append(th.getLocalizedMessage());
                com.ironsource.adqualitysdk.sdk.i.m.m8524(intern, sb.toString());
            }
        }
        m8364(jSONObject);
        int i8 = f3002 + 71;
        f3003 = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static org.json.JSONObject m8359() {
        int i = 2 % 2;
        int i2 = f3002 + 3;
        f3003 = i2 % 128;
        int i3 = i2 % 2;
        org.json.JSONObject m8360 = m8360();
        if (i3 == 0) {
            return com.ironsource.adqualitysdk.sdk.i.kj.m8414(m8360);
        }
        com.ironsource.adqualitysdk.sdk.i.kj.m8414(m8360);
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static synchronized org.json.JSONObject m8360() {
        org.json.JSONObject jSONObject;
        synchronized (com.ironsource.adqualitysdk.sdk.i.kf.class) {
            int i = 2 % 2;
            int i2 = f3002;
            int i3 = i2 + 99;
            f3003 = i3 % 128;
            int i4 = i3 % 2;
            jSONObject = f3013;
            int i5 = i2 + 47;
            f3003 = i5 % 128;
            int i6 = i5 % 2;
        }
        return jSONObject;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static synchronized void m8364(org.json.JSONObject jSONObject) {
        synchronized (com.ironsource.adqualitysdk.sdk.i.kf.class) {
            int i = 2 % 2;
            int i2 = f3003;
            int i3 = i2 + 63;
            f3002 = i3 % 128;
            if (i3 % 2 == 0) {
                f3013 = jSONObject;
                java.lang.Object obj = null;
                super.hashCode();
                throw null;
            }
            f3013 = jSONObject;
            int i4 = i2 + 47;
            f3002 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m8370(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.o.f3104) {
            char[] cArr3 = new char[cArr2.length];
            com.ironsource.adqualitysdk.sdk.i.o.f3105 = 0;
            char[] cArr4 = new char[2];
            while (com.ironsource.adqualitysdk.sdk.i.o.f3105 < cArr2.length) {
                cArr4[0] = cArr2[com.ironsource.adqualitysdk.sdk.i.o.f3105];
                cArr4[1] = cArr2[com.ironsource.adqualitysdk.sdk.i.o.f3105 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f3010)) ^ ((c2 >>> 5) + f3007)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f3009) ^ ((c3 + i2) ^ ((c3 << 4) + f3011))));
                    i2 -= 40503;
                }
                cArr3[com.ironsource.adqualitysdk.sdk.i.o.f3105] = cArr4[0];
                cArr3[com.ironsource.adqualitysdk.sdk.i.o.f3105 + 1] = cArr4[1];
                com.ironsource.adqualitysdk.sdk.i.o.f3105 += 2;
            }
            str2 = new java.lang.String(cArr3, 0, i);
        }
        return str2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m8379(java.lang.String str, int i, int[] iArr, java.lang.String str2) {
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes(com.google.android.exoplayer2.C.ISO88591_NAME);
        }
        byte[] bArr2 = bArr;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.k.f2966) {
            char[] cArr3 = f3008;
            int i2 = f3006;
            if (f3005) {
                int length = bArr2.length;
                com.ironsource.adqualitysdk.sdk.i.k.f2965 = length;
                char[] cArr4 = new char[length];
                com.ironsource.adqualitysdk.sdk.i.k.f2967 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.k.f2967 < com.ironsource.adqualitysdk.sdk.i.k.f2965) {
                    cArr4[com.ironsource.adqualitysdk.sdk.i.k.f2967] = (char) (cArr3[bArr2[(com.ironsource.adqualitysdk.sdk.i.k.f2965 - 1) - com.ironsource.adqualitysdk.sdk.i.k.f2967] + i] - i2);
                    com.ironsource.adqualitysdk.sdk.i.k.f2967++;
                }
                return new java.lang.String(cArr4);
            }
            if (f3004) {
                int length2 = cArr2.length;
                com.ironsource.adqualitysdk.sdk.i.k.f2965 = length2;
                char[] cArr5 = new char[length2];
                com.ironsource.adqualitysdk.sdk.i.k.f2967 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.k.f2967 < com.ironsource.adqualitysdk.sdk.i.k.f2965) {
                    cArr5[com.ironsource.adqualitysdk.sdk.i.k.f2967] = (char) (cArr3[cArr2[(com.ironsource.adqualitysdk.sdk.i.k.f2965 - 1) - com.ironsource.adqualitysdk.sdk.i.k.f2967] - i] - i2);
                    com.ironsource.adqualitysdk.sdk.i.k.f2967++;
                }
                return new java.lang.String(cArr5);
            }
            int length3 = iArr.length;
            com.ironsource.adqualitysdk.sdk.i.k.f2965 = length3;
            char[] cArr6 = new char[length3];
            com.ironsource.adqualitysdk.sdk.i.k.f2967 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.k.f2967 < com.ironsource.adqualitysdk.sdk.i.k.f2965) {
                cArr6[com.ironsource.adqualitysdk.sdk.i.k.f2967] = (char) (cArr3[iArr[(com.ironsource.adqualitysdk.sdk.i.k.f2965 - 1) - com.ironsource.adqualitysdk.sdk.i.k.f2967] - i] - i2);
                com.ironsource.adqualitysdk.sdk.i.k.f2967++;
            }
            return new java.lang.String(cArr6);
        }
    }
}
