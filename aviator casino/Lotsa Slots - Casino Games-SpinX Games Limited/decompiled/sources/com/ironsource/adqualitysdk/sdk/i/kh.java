package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class kh {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f3017 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static byte[] f3018 = {-19, -7, com.google.common.base.Ascii.US, -69, -99, -40, -46, -43, -30, com.google.common.base.Ascii.SUB, -57, -107, -44, -47, -34, com.google.common.base.Ascii.US, -122, -48, 41, -112, -51, -31, -56, 35, -112, -45, -37, -53, -35, -41, -58, 37, -125, -30, -50, -43, -32, -62, -42, -38, -38, com.google.common.base.Ascii.RS, -111, -43, -40, com.google.common.base.Ascii.SYN, -127, 34, -114, -33, -51, -52, -37, 1, -19, 4, -19, -17, 9, 82, 49, 93, 58, 97, com.google.common.base.Ascii.FS, 74, 80, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 94, 108, 1, 82, 49, 93, 58, 65, -121, com.google.common.base.Ascii.SI, 118, -1, 74, 80, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 62, -116, 6, 67, 81, -20, 39, -98, -91, -107, -92, -88, -112, -101, -46, 121, -89, -95, -98, -100, -95, -95, -114, -67, -110, -108, -98, -99, -97, -69, -60, 91, -88, -89, -46, 98, -90, -112, -28, 98, -90, -112, -103, -92, -86, -100, -86, -117, -93, -84, -94, -46, 104, -95, -112, -100, -91, -101, -92, -98, -100, -88, -38, 96, -99, -85, -20, -20};

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static short[] f3019 = null;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f3020 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f3021 = -1613416188;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f3022 = 619369809;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f3023 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f3024 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f3025 = 29867;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f3026 = 21;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m8388(android.content.Context context, java.lang.String str) {
        int i = 2 % 2;
        int i2 = f3017 + 59;
        f3020 = i2 % 128;
        if (i2 % 2 == 0) {
            context.checkCallingOrSelfPermission(str);
            throw null;
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        int i3 = f3020 + 93;
        f3017 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8385(android.content.Context context, org.json.JSONObject jSONObject) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i = 2 % 2;
        int i2 = f3017 + 5;
        f3020 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m8389((char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0000\u0000\u0000\u0000", "鑗ᡄ\ue960졽", "ꗺ옷崉\ueba2꽢⛿ﰭ捳", android.graphics.Color.alpha(0)).intern();
        java.lang.String packageName = context.getPackageName();
        try {
            jSONObject.put(m8389((char) (63635 - android.view.KeyEvent.keyCodeFromString("")), "\u0000\u0000\u0000\u0000", "韩湫鎝ᇸ", "Ԉ寷", android.text.TextUtils.getOffsetBefore("", 0)).intern(), packageName);
            int i4 = f3017 + 37;
            f3020 = i4 % 128;
            int i5 = i4 % 2;
        } catch (org.json.JSONException e) {
            com.ironsource.adqualitysdk.sdk.i.m.m8532(intern, m8389((char) android.text.TextUtils.indexOf("", "", 0, 0), "\u0000\u0000\u0000\u0000", "☭\ue45d仮䤴", "檭ࢧ묤换\ueee4곙弡沸㚱⸱䜺㍅耘\ue1ef⳱㮑㠎頵蝦ꁇ≮維곸䶶톃⼛᱂ǡ갹ﬞ\uf68b쯢菘丩", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), e);
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        try {
            jSONObject.put(m8384((short) (10 - android.view.View.resolveSize(0, 0)), android.view.KeyEvent.getDeadChar(0, 0) + 1613416287, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) - 22, android.text.TextUtils.getOffsetBefore("", 0) - 619369809, (byte) android.view.View.resolveSize(0, 0)).intern(), packageManager.getInstallerPackageName(packageName));
            str = "\uda55둯膣✖㈬鬸崿㔮㌽\uf1d0";
            str2 = "蠚䟫⡡凱";
        } catch (org.json.JSONException e2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            str = "\uda55둯膣✖㈬鬸崿㔮㌽\uf1d0";
            str2 = "蠚䟫⡡凱";
            sb.append(m8384((short) (43 - android.text.TextUtils.indexOf("", "", 0)), android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 1613416256, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 22, (-619369807) - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (byte) android.graphics.Color.alpha(0)).intern());
            sb.append(e2.getLocalizedMessage());
            com.ironsource.adqualitysdk.sdk.i.m.m8517(intern, sb.toString());
        }
        try {
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            jSONObject.put(m8384((short) ((-23) - android.graphics.Color.green(0)), 1613416306 - android.text.TextUtils.getCapsMode("", 0, 0), (-22) - android.text.TextUtils.getTrimmedLength(""), (-619369755) - android.text.TextUtils.indexOf("", "", 0, 0), (byte) (android.view.ViewConfiguration.getEdgeSlop() >> 16)).intern(), java.lang.Integer.toString(packageInfo.versionCode));
            jSONObject.put(m8389((char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 35288), "\u0000\u0000\u0000\u0000", "틏ώ\ud85b讉", "阦\uda32", android.view.View.MeasureSpec.getMode(0)).intern(), packageInfo.versionName);
        } catch (android.content.pm.PackageManager.NameNotFoundException e3) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(m8389((char) android.view.View.resolveSize(0, 0), "\u0000\u0000\u0000\u0000", "ꆛ≉\uea7a\udeb7", "ﻡ㫈贷钂⥡۩㷸⭒⣔踄䯤볤앜莪ㅮ䢜羭镏ꗳ᧡瘰笛꜠ᖋ톉玹䎍臮䯸埏涣∔섉", android.graphics.Color.rgb(0, 0, 0) + 2065844641).intern());
            sb2.append(packageName);
            str3 = str2;
            str4 = str;
            sb2.append(m8389((char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), "\u0000\u0000\u0000\u0000", str3, str4, 1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
            sb2.append(e3.getLocalizedMessage());
            com.ironsource.adqualitysdk.sdk.i.m.m8517(intern, sb2.toString());
        } catch (org.json.JSONException e4) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(m8389((char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), "\u0000\u0000\u0000\u0000", "耂\udaf4菴鳍", "䭬茫죾出ꐶ쮥본Ł早텵햨獒\udaa2⟩ⴹ坞ӳ腰뾌᥌摀鹹뺆䓖⟔颜\uddbf닆ᝡწ\ude65\ue4e5౪婦ꝺŧ뙥ⓘ겥덜䑩\ue0c2\ue5f9甅㓜\uf66d", 1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern());
            sb3.append(e4.getLocalizedMessage());
            com.ironsource.adqualitysdk.sdk.i.m.m8517(intern, sb3.toString());
        }
        str3 = str2;
        str4 = str;
        try {
            jSONObject.put(m8384((short) (27 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), 1613416288 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) - 22, (-619369753) - android.graphics.Color.red(0), (byte) (android.text.AndroidCharacter.getMirror('0') - '0')).intern(), packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString());
        } catch (android.content.pm.PackageManager.NameNotFoundException e5) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(m8389((char) android.view.View.resolveSizeAndState(0, 0, 0), "\u0000\u0000\u0000\u0000", "ꆛ≉\uea7a\udeb7", "ﻡ㫈贷钂⥡۩㷸⭒⣔踄䯤볤앜莪ㅮ䢜羭镏ꗳ᧡瘰笛꜠ᖋ톉玹䎍臮䯸埏涣∔섉", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 2049067425).intern());
            sb4.append(packageName);
            sb4.append(m8389((char) android.view.View.resolveSize(0, 0), "\u0000\u0000\u0000\u0000", str3, str4, '0' - android.text.AndroidCharacter.getMirror('0')).intern());
            sb4.append(e5.getLocalizedMessage());
            com.ironsource.adqualitysdk.sdk.i.m.m8517(intern, sb4.toString());
        } catch (org.json.JSONException e6) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(m8389((char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 50927), "\u0000\u0000\u0000\u0000", "ੱ꽇\uef5b燆", "슽ꂴ\ue93e\ue128ᝡꃝ颷籆㲆烤㒃玐䇮쇳懭㧜ඎ瑶腅僎\uf719㖞簄ࢩ袭ףּ攏䍿覢湽\uf2ec綌釪硰䬳蛡筨呴剳淶퍕兩䖫", 1538213641 - android.view.MotionEvent.axisFromString("")).intern());
            sb5.append(e6.getLocalizedMessage());
            com.ironsource.adqualitysdk.sdk.i.m.m8517(intern, sb5.toString());
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static java.lang.String m8387(android.content.Context context) {
        int i = 2 % 2;
        int i2 = f3020 + 125;
        f3017 = i2 % 128;
        int i3 = i2 % 2;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        java.lang.String packageName = context.getPackageName();
        java.lang.Object obj = null;
        try {
            java.lang.String str = packageManager.getPackageInfo(packageName, 0).versionName;
            int i4 = f3020 + 111;
            f3017 = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            super.hashCode();
            throw null;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            java.lang.String intern = m8389((char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), "\u0000\u0000\u0000\u0000", "鑗ᡄ\ue960졽", "ꗺ옷崉\ueba2꽢⛿ﰭ捳", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m8389((char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "\u0000\u0000\u0000\u0000", "ꆛ≉\uea7a\udeb7", "ﻡ㫈贷钂⥡۩㷸⭒⣔踄䯤볤앜莪ㅮ䢜羭镏ꗳ᧡瘰笛꜠ᖋ톉玹䎍臮䯸埏涣∔섉", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2049067424).intern());
            sb.append(packageName);
            sb.append(m8389((char) (android.text.TextUtils.lastIndexOf("", '0') + 1), "\u0000\u0000\u0000\u0000", "蠚䟫⡡凱", "\uda55둯膣✖㈬鬸崿㔮㌽\uf1d0", android.view.Gravity.getAbsoluteGravity(0, 0)).intern());
            sb.append(e.getLocalizedMessage());
            com.ironsource.adqualitysdk.sdk.i.m.m8517(intern, sb.toString());
            return null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static java.lang.String m8386() {
        int i = 2 % 2;
        int i2 = f3017 + 39;
        f3020 = i2 % 128;
        int i3 = i2 % 2;
        try {
            try {
                java.lang.Class.forName(m8384((short) ((-68) - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 1613416288 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 23, ((android.os.Process.getThreadPriority(0) + 20) >> 6) - 619369751, (byte) android.view.Gravity.getAbsoluteGravity(0, 0)).intern());
                java.lang.String intern = m8384((short) (78 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), 1613416306 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-21) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (-619369721) - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) android.text.TextUtils.getCapsMode("", 0, 0)).intern();
                int i4 = f3017 + 5;
                f3020 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 0 / 0;
                }
                return intern;
            } catch (java.lang.ClassNotFoundException unused) {
                java.lang.Class.forName(m8384((short) (98 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 1613416287 - android.widget.ExpandableListView.getPackedPositionGroup(0L), android.view.KeyEvent.getDeadChar(0, 0) - 22, (-619369720) - android.widget.ExpandableListView.getPackedPositionType(0L), (byte) android.graphics.Color.red(0)).intern());
                return m8384((short) ((-93) - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), 1613416285 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (-22) - android.text.TextUtils.getCapsMode("", 0, 0), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) - 619369660, (byte) android.text.TextUtils.getTrimmedLength("")).intern();
            }
        } catch (java.lang.ClassNotFoundException unused2) {
            return m8384((short) (android.view.View.MeasureSpec.getSize(0) + 41), 1613416298 - (android.os.Process.myTid() >> 22), (-22) - android.view.KeyEvent.normalizeMetaState(0), android.view.MotionEvent.axisFromString("") - 619369658, (byte) android.view.Gravity.getAbsoluteGravity(0, 0)).intern();
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m8389(char c, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        java.lang.String str4;
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        synchronized (com.ironsource.adqualitysdk.sdk.i.f.f2052) {
            char[] cArr7 = (char[]) cArr4.clone();
            char[] cArr8 = (char[]) cArr6.clone();
            cArr7[0] = (char) (c ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr9 = new char[length];
            com.ironsource.adqualitysdk.sdk.i.f.f2051 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.f.f2051 < length) {
                int i2 = (com.ironsource.adqualitysdk.sdk.i.f.f2051 + 2) % 4;
                int i3 = (com.ironsource.adqualitysdk.sdk.i.f.f2051 + 3) % 4;
                com.ironsource.adqualitysdk.sdk.i.f.f2053 = (char) (((cArr7[com.ironsource.adqualitysdk.sdk.i.f.f2051 % 4] * 32718) + cArr8[i2]) % 65535);
                cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                cArr7[i3] = com.ironsource.adqualitysdk.sdk.i.f.f2053;
                cArr9[com.ironsource.adqualitysdk.sdk.i.f.f2051] = (char) ((((cArr7[i3] ^ cArr2[com.ironsource.adqualitysdk.sdk.i.f.f2051]) ^ f3023) ^ f3024) ^ f3025);
                com.ironsource.adqualitysdk.sdk.i.f.f2051++;
            }
            str4 = new java.lang.String(cArr9);
        }
        return str4;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m8384(short s, int i, int i2, int i3, byte b) {
        java.lang.String obj;
        synchronized (com.ironsource.adqualitysdk.sdk.i.n.f3098) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i4 = f3026;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f3018;
                if (bArr != null) {
                    i5 = (byte) (bArr[f3022 + i3] + i4);
                } else {
                    i5 = (short) (f3019[f3022 + i3] + i4);
                }
            }
            if (i5 > 0) {
                com.ironsource.adqualitysdk.sdk.i.n.f3100 = ((i3 + i5) - 2) + f3022 + i6;
                com.ironsource.adqualitysdk.sdk.i.n.f3101 = b;
                com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (i + f3021);
                sb.append(com.ironsource.adqualitysdk.sdk.i.n.f3102);
                com.ironsource.adqualitysdk.sdk.i.n.f3103 = com.ironsource.adqualitysdk.sdk.i.n.f3102;
                com.ironsource.adqualitysdk.sdk.i.n.f3099 = 1;
                while (com.ironsource.adqualitysdk.sdk.i.n.f3099 < i5) {
                    byte[] bArr2 = f3018;
                    if (bArr2 != null) {
                        int i7 = com.ironsource.adqualitysdk.sdk.i.n.f3100;
                        com.ironsource.adqualitysdk.sdk.i.n.f3100 = i7 - 1;
                        com.ironsource.adqualitysdk.sdk.i.n.f3102 = (char) (com.ironsource.adqualitysdk.sdk.i.n.f3103 + (((byte) (bArr2[i7] + s)) ^ com.ironsource.adqualitysdk.sdk.i.n.f3101));
                    } else {
                        short[] sArr = f3019;
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
