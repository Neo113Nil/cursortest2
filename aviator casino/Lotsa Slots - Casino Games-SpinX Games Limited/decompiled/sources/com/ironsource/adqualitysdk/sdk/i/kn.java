package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class kn {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f3073 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f3074 = 61;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f3075 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static int m8467(java.lang.String str, java.lang.String str2) {
        int i = 2 % 2;
        java.lang.String[] split = str.replaceAll(m8469(7 - android.graphics.Color.blue(0), true, 128 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), "￪￭\u001b\u0018\u001a￫\ufff6", android.text.TextUtils.lastIndexOf("", '0', 0, 0) + 5).intern(), "").split(m8469((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2, true, 131 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "￩\u0017", 2 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)).intern());
        java.lang.String[] split2 = str2.replaceAll(m8469(7 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), true, 128 - android.text.TextUtils.getOffsetBefore("", 0), "￪￭\u001b\u0018\u001a￫\ufff6", 4 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), "").split(m8469(1 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0'), true, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 129, "￩\u0017", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1).intern());
        int i2 = 0;
        while (i2 < split.length && i2 < split2.length && split[i2].equals(split2[i2])) {
            int i3 = f3073 + 95;
            f3075 = i3 % 128;
            int i4 = i3 % 2;
            i2++;
        }
        if (i2 < split.length) {
            int i5 = f3073 + 107;
            int i6 = i5 % 128;
            f3075 = i6;
            if (i5 % 2 == 0) {
                int length = split2.length;
                throw null;
            }
            if (i2 < split2.length) {
                int i7 = i6 + 97;
                f3073 = i7 % 128;
                if (i7 % 2 == 0) {
                    return java.lang.Integer.signum(java.lang.Integer.valueOf(split[i2]).compareTo(java.lang.Integer.valueOf(split2[i2])));
                }
                int signum = java.lang.Integer.signum(java.lang.Integer.valueOf(split[i2]).compareTo(java.lang.Integer.valueOf(split2[i2])));
                int i8 = 72 / 0;
                return signum;
            }
        }
        int signum2 = java.lang.Integer.signum(split.length - split2.length);
        int i9 = f3073 + 55;
        f3075 = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 58 / 0;
        }
        return signum2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static java.util.List<java.lang.String> m8477(java.lang.String str, java.lang.String str2) {
        int i = 2 % 2;
        int i2 = f3073 + 49;
        f3075 = i2 % 128;
        int i3 = i2 % 2;
        java.util.List<java.lang.String> m8466 = m8466(str, str2, false);
        int i4 = f3075 + 103;
        f3073 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return m8466;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static java.util.List<java.lang.String> m8472(java.lang.String str, org.json.JSONArray jSONArray) {
        int i = 2 % 2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            int i3 = f3073 + 39;
            f3075 = i3 % 128;
            int i4 = i3 % 2;
            arrayList.addAll(m8466(str, jSONArray.optString(i2), false));
        }
        int i5 = f3075 + 85;
        f3073 = i5 % 128;
        if (i5 % 2 == 0) {
            return arrayList;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static java.lang.String m8471(java.lang.String str, org.json.JSONArray jSONArray, boolean z) {
        int i = 2 % 2;
        int i2 = f3073 + 69;
        f3075 = i2 % 128;
        for (int i3 = i2 % 2 == 0 ? 1 : 0; i3 < jSONArray.length(); i3++) {
            java.lang.String m8476 = m8476(str, jSONArray.optString(i3), z);
            if (m8476 != null) {
                int i4 = f3073 + 3;
                f3075 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 68 / 0;
                }
                return m8476;
            }
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static java.lang.String m8476(java.lang.String str, java.lang.String str2, boolean z) {
        int i = 2 % 2;
        if (z) {
            int i2 = f3073 + 65;
            f3075 = i2 % 128;
            int i3 = i2 % 2;
            str2 = m8465(str2);
        }
        java.util.List<java.lang.String> m8466 = m8466(str, str2, true);
        if (m8466.size() <= 0) {
            return null;
        }
        java.lang.String str3 = m8466.get(0);
        int i4 = f3075 + 65;
        f3073 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return str3;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.util.List<java.lang.String> m8466(java.lang.String str, java.lang.String str2, boolean z) {
        int i = 2 % 2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile(str2).matcher(str);
        while (matcher.find()) {
            if (matcher.groupCount() == 0) {
                arrayList.add(matcher.group());
                if (z) {
                    int i2 = f3075 + 63;
                    f3073 = i2 % 128;
                    if (i2 % 2 == 0) {
                        return arrayList;
                    }
                    java.lang.Object obj = null;
                    super.hashCode();
                    throw null;
                }
            } else {
                int i3 = f3073 + 15;
                f3075 = i3 % 128;
                int i4 = i3 % 2;
                for (int i5 = 1; i5 <= matcher.groupCount(); i5++) {
                    arrayList.add(matcher.group(i5));
                    if (z) {
                        return arrayList;
                    }
                }
                int i6 = f3075 + 111;
                f3073 = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return arrayList;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static java.lang.String m8470(java.lang.String str, java.lang.String str2) {
        int i = 2 % 2;
        int i2 = f3073 + 5;
        f3075 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String substring = str.substring(0, str.length() - str2.length());
        int i4 = f3075 + 67;
        f3073 = i4 % 128;
        if (i4 % 2 == 0) {
            return substring;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m8468(java.lang.String str) {
        int i = 2 % 2;
        if (!(!android.text.TextUtils.isEmpty(str))) {
            int i2 = f3075 + 83;
            f3073 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        boolean matches = str.matches(m8469(14 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), true, 130 - android.view.View.MeasureSpec.getSize(0), "\u0019\uffdf￥\u0018\ufff4￨￫\u0015￨￼5￨\u001c\u0016", 1 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
        int i4 = f3075 + 109;
        f3073 = i4 % 128;
        int i5 = i4 % 2;
        return matches;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static boolean m8474(java.lang.String str, int i) {
        int i2 = 2 % 2;
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        int i3 = f3073 + 103;
        f3075 = i3 % 128;
        int i4 = i3 % 2;
        if (str.length() <= 0 || str.length() > i) {
            return false;
        }
        int i5 = f3075 + 37;
        f3073 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append(m8469(7 - android.graphics.ImageFormat.getBitsPerPixel(0), false, android.text.TextUtils.getOffsetBefore("", 0) + 148, "\u0004\u0005\u001c\u0005￼\u0006ￓ\u0007", (-16777209) - android.graphics.Color.rgb(0, 0, 0)).intern());
        r1.append(r12);
        r12 = r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (r12.startsWith(m8469(1 - android.widget.ExpandableListView.getPackedPositionType(0), true, 154 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0'), "\u0000", 1 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern()) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0045, code lost:
    
        if (r12.startsWith(m8469(0, true, r1, "\u0000", 0).intern()) == false) goto L11;
     */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String m8465(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f3073 + 5;
        f3075 = i2 % 128;
        int i3 = i2 % 2;
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        int i4 = f3073 + 59;
        f3075 = i4 % 128;
        if (i4 % 2 == 0) {
            android.widget.ExpandableListView.getPackedPositionType(1L);
            int indexOf = 6042 >>> android.text.TextUtils.indexOf((java.lang.CharSequence) "", 'g');
            android.view.ViewConfiguration.getMaximumDrawingCacheSize();
        }
        if (str.endsWith(m8469(-android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0'), true, android.text.TextUtils.getCapsMode("", 0, 0) + 97, "\u0000", -android.view.MotionEvent.axisFromString("")).intern())) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(m8469(android.view.KeyEvent.keyCodeFromString("") + 7, false, (android.os.Process.myPid() >> 22) + 147, "\u001d\u0006�\u0007ￔ\u0005\u0006", 4 - android.widget.ExpandableListView.getPackedPositionChild(0L)).intern());
        return sb.toString();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static boolean m8473(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f3075 + 7;
        f3073 = i2 % 128;
        int i3 = i2 % 2;
        if (!com.ironsource.adqualitysdk.sdk.i.p.m8552()) {
            try {
                new java.util.zip.GZIPInputStream(new java.io.ByteArrayInputStream(android.util.Base64.decode(str, 0)));
                int i4 = f3073 + 105;
                f3075 = i4 % 128;
                int i5 = i4 % 2;
                return true;
            } catch (java.lang.Throwable unused) {
                return false;
            }
        }
        int i6 = f3075 + 5;
        f3073 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.p.m8552() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.p.m8552() != true) goto L11;
     */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String m8475(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f3073;
        int i3 = i2 + 101;
        f3075 = i3 % 128;
        int i4 = i3 % 2;
        if (str != null) {
            int i5 = i2 + 25;
            f3075 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 24 / 0;
            }
            if (m8473(str)) {
                try {
                    java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(android.util.Base64.decode(str, 0));
                    java.util.zip.GZIPInputStream gZIPInputStream = new java.util.zip.GZIPInputStream(byteArrayInputStream);
                    new java.io.ByteArrayOutputStream();
                    byte[] bArr = new byte[8192];
                    int i7 = 0;
                    while (true) {
                        int read = gZIPInputStream.read(bArr, i7, 8192 - i7);
                        if (read == -1) {
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            return new java.lang.String(bArr, m8469((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 5, false, android.view.View.getDefaultSize(0, 0) + 129, "\u0002￩\ufff4\u0011\u0010", 3 - android.view.View.getDefaultSize(0, 0)).intern());
                        }
                        i7 += read;
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
        }
        return null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m8469(int i, boolean z, int i2, java.lang.String str, int i3) {
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
                cArr3[i4] = (char) (cArr3[i4] - f3074);
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
