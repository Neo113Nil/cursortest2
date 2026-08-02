package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class nh {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final java.nio.charset.Charset f3678a;
    public static final java.util.TimeZone b;
    public static final com.facetec.sdk.nf c;
    public static final java.lang.String[] d;
    public static final byte[] e;
    private static final com.facetec.sdk.pq f;
    private static final com.facetec.sdk.pq g;
    private static final com.facetec.sdk.pq h;
    public static final java.util.Comparator<java.lang.String> i;
    private static final com.facetec.sdk.pq j;
    private static final java.nio.charset.Charset k;
    private static final com.facetec.sdk.pq l;
    private static final java.nio.charset.Charset m;
    private static final java.nio.charset.Charset n;

    /* renamed from: o, reason: collision with root package name */
    private static final java.nio.charset.Charset f3679o;
    private static final java.util.regex.Pattern p;
    private static final java.lang.reflect.Method q;
    private static int t;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(int i2, short s, short s2) {
        int i3;
        int i4;
        byte[] bArr = $$a;
        int i5 = 1 - (s * 2);
        int i6 = (s2 * 2) + 113;
        int i7 = i2 + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i6;
            int i9 = 0;
            int i10 = i7;
            int i11 = i7 + i8;
            i3 = i9;
            int i12 = i10;
            i6 = i11;
            i7 = i12;
            bArr2[i3] = (byte) i6;
            i4 = i3 + 1;
            if (i4 == i5) {
                return new java.lang.String(bArr2, 0);
            }
            int i13 = i7 + 1;
            int i14 = i6;
            i10 = i13;
            i7 = bArr[i13];
            i9 = i4;
            i8 = i14;
            int i112 = i7 + i8;
            i3 = i9;
            int i122 = i10;
            i6 = i112;
            i7 = i122;
            bArr2[i3] = (byte) i6;
            i4 = i3 + 1;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            i4 = i3 + 1;
            if (i4 == i5) {
            }
        }
    }

    public static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 > 'F') {
            return -1;
        }
        return c2 - '7';
    }

    static void init$0() {
        $$a = new byte[]{69, com.google.common.base.Ascii.VT, -116, 92};
        $$b = 115;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        init$0();
        a();
        byte[] bArr = new byte[0];
        e = bArr;
        d = new java.lang.String[0];
        final com.facetec.sdk.pk c2 = new com.facetec.sdk.pk().c(bArr);
        final long j2 = 0;
        if (c2 != null) {
            java.lang.reflect.Method method = null;
            final java.lang.Object[] objArr = 0 == true ? 1 : 0;
            c = new com.facetec.sdk.nf(objArr, j2, c2) { // from class: com.facetec.sdk.nf.4

                /* renamed from: a */
                private /* synthetic */ com.facetec.sdk.mr f3676a = null;
                private /* synthetic */ long b;
                private /* synthetic */ com.facetec.sdk.pr e;

                public AnonymousClass4(final com.facetec.sdk.mr objArr2, final long j22, final com.facetec.sdk.pr c22) {
                    this.b = j22;
                    this.e = c22;
                }

                @Override // com.facetec.sdk.nf
                @javax.annotation.Nullable
                public final com.facetec.sdk.mr e() {
                    return this.f3676a;
                }

                @Override // com.facetec.sdk.nf
                public final long d() {
                    return this.b;
                }

                @Override // com.facetec.sdk.nf
                public final com.facetec.sdk.pr b() {
                    return this.e;
                }
            };
            com.facetec.sdk.my.b(null, bArr);
            g = com.facetec.sdk.pq.c("efbbbf");
            f = com.facetec.sdk.pq.c("feff");
            h = com.facetec.sdk.pq.c("fffe");
            j = com.facetec.sdk.pq.c("0000ffff");
            l = com.facetec.sdk.pq.c("ffff0000");
            f3678a = java.nio.charset.Charset.forName("UTF-8");
            java.nio.charset.Charset.forName("ISO-8859-1");
            n = java.nio.charset.Charset.forName(codec.CharEncoding.UTF_16BE);
            k = java.nio.charset.Charset.forName(codec.CharEncoding.UTF_16LE);
            f3679o = java.nio.charset.Charset.forName("UTF-32BE");
            m = java.nio.charset.Charset.forName("UTF-32LE");
            b = java.util.TimeZone.getTimeZone("GMT");
            i = new java.util.Comparator<java.lang.String>() { // from class: com.facetec.sdk.nh.3
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(java.lang.String str, java.lang.String str2) {
                    return str.compareTo(str2);
                }
            };
            try {
                method = java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class);
            } catch (java.lang.Exception unused) {
            }
            q = method;
            p = java.util.regex.Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
            return;
        }
        throw new java.lang.NullPointerException("source == null");
    }

    private static void r(boolean z, int i2, java.lang.String str, int i3, int i4, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.facetec.sdk.hp hpVar = new com.facetec.sdk.hp();
        char[] cArr = new char[i2];
        hpVar.d = 0;
        while (hpVar.d < i2) {
            hpVar.b = charArray[hpVar.d];
            cArr[hpVar.d] = (char) (i3 + hpVar.b);
            int i5 = hpVar.d;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5]), java.lang.Integer.valueOf(t)};
                java.lang.Object d2 = com.facetec.sdk.al.d(-1738479149);
                if (d2 == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    d2 = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 19485), 730 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.view.KeyEvent.keyCodeFromString("") + 24, 1066373931, false, $$c(b2, b3, b3), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                cArr[i5] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr3 = {hpVar, hpVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(1965925374);
                if (d3 == null) {
                    d3 = com.facetec.sdk.al.c((char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 24337), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1621, android.text.TextUtils.getCapsMode("", 0, 0) + 24, -758982394, false, "v", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d3).invoke(null, objArr3);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i4 > 0) {
            hpVar.f3630a = i4;
            char[] cArr2 = new char[i2];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i2);
            java.lang.System.arraycopy(cArr2, 0, cArr, i2 - hpVar.f3630a, hpVar.f3630a);
            java.lang.System.arraycopy(cArr2, hpVar.f3630a, cArr, 0, i2 - hpVar.f3630a);
        }
        if (z) {
            char[] cArr3 = new char[i2];
            hpVar.d = 0;
            while (hpVar.d < i2) {
                cArr3[hpVar.d] = cArr[(i2 - hpVar.d) - 1];
                java.lang.Object[] objArr4 = {hpVar, hpVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(1965925374);
                if (d4 == null) {
                    d4 = com.facetec.sdk.al.c((char) (android.view.KeyEvent.keyCodeFromString("") + 24338), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1621, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 23, -758982394, false, "v", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    public static void b(java.lang.Throwable th, java.lang.Throwable th2) {
        java.lang.reflect.Method method = q;
        if (method != null) {
            try {
                method.invoke(th, th2);
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            }
        }
    }

    public static void d(long j2, long j3, long j4) {
        if (j4 < 0 || 0 > j2 || j2 < j4) {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
    }

    public static boolean d(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void c(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.RuntimeException e2) {
                throw e2;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static void c(java.net.Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (java.lang.AssertionError e2) {
                if (!b(e2)) {
                    throw e2;
                }
            } catch (java.lang.RuntimeException e3) {
                if (!"bio == null".equals(e3.getMessage())) {
                    throw e3;
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static boolean b(com.facetec.sdk.pz pzVar, java.util.concurrent.TimeUnit timeUnit) {
        try {
            return b(pzVar, 100, timeUnit);
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    public static boolean b(com.facetec.sdk.pz pzVar, int i2, java.util.concurrent.TimeUnit timeUnit) throws java.io.IOException {
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            r(true, 16 - android.view.KeyEvent.keyCodeFromString(""), "ￌ\uffff\u0014\uffff\b\u000b\u0003\u0012\u0011\u0017\ufff1ￌ\u0005\f\uffff\n", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 127, 5 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            r(true, 8 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\ufffe\u0006\u0002￭\b\u0007\ufffa\u0007", 132 - android.text.TextUtils.indexOf("", "", 0, 0), 8 - android.view.View.MeasureSpec.getMode(0), objArr2);
            long longValue = ((java.lang.Long) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).longValue();
            long b_ = pzVar.d().a_() ? pzVar.d().b_() - longValue : Long.MAX_VALUE;
            pzVar.d().c(java.lang.Math.min(b_, timeUnit.toNanos(i2)) + longValue);
            try {
                com.facetec.sdk.pk pkVar = new com.facetec.sdk.pk();
                while (pzVar.b(pkVar, 8192L) != -1) {
                    try {
                        pkVar.q();
                    } catch (java.io.InterruptedIOException unused) {
                        if (b_ == Long.MAX_VALUE) {
                            pzVar.d().d_();
                        } else {
                            pzVar.d().c(longValue + b_);
                        }
                        return false;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (b_ == Long.MAX_VALUE) {
                            pzVar.d().d_();
                        } else {
                            pzVar.d().c(longValue + b_);
                        }
                        throw th;
                    }
                }
                if (b_ == Long.MAX_VALUE) {
                    pzVar.d().d_();
                } else {
                    pzVar.d().c(longValue + b_);
                }
                return true;
            } catch (java.io.InterruptedIOException unused2) {
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause = th3.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th3;
        }
    }

    public static <T> java.util.List<T> e(java.util.List<T> list) {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
    }

    public static <K, V> java.util.Map<K, V> c(java.util.Map<K, V> map) {
        if (map.isEmpty()) {
            return java.util.Collections.emptyMap();
        }
        return java.util.Collections.unmodifiableMap(new java.util.LinkedHashMap(map));
    }

    public static <T> java.util.List<T> c(T... tArr) {
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList((java.lang.Object[]) tArr.clone()));
    }

    public static java.util.concurrent.ThreadFactory c(final java.lang.String str, final boolean z) {
        return new java.util.concurrent.ThreadFactory() { // from class: com.facetec.sdk.nh.2
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                java.lang.Thread thread = new java.lang.Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static java.lang.String[] c(java.util.Comparator<? super java.lang.String> comparator, java.lang.String[] strArr, java.lang.String[] strArr2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i2++;
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    public static boolean d(java.util.Comparator<java.lang.String> comparator, java.lang.String[] strArr, java.lang.String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (java.lang.String str : strArr) {
                for (java.lang.String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static java.lang.String e(com.facetec.sdk.mv mvVar, boolean z) {
        java.lang.String g2;
        if (mvVar.g().contains(io.ktor.sse.ServerSentEventKt.COLON)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            sb.append(mvVar.g());
            sb.append("]");
            g2 = sb.toString();
        } else {
            g2 = mvVar.g();
        }
        if (!z && mvVar.h() == com.facetec.sdk.mv.e(mvVar.c())) {
            return g2;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(g2);
        sb2.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb2.append(mvVar.h());
        return sb2.toString();
    }

    public static boolean b(java.lang.AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static int a(java.util.Comparator<java.lang.String> comparator, java.lang.String[] strArr, java.lang.String str) {
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], str) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static java.lang.String[] c(java.lang.String[] strArr, java.lang.String str) {
        int length = strArr.length;
        java.lang.String[] strArr2 = new java.lang.String[length + 1];
        try {
            java.lang.Object[] objArr = {strArr, 0, strArr2, 0, java.lang.Integer.valueOf(strArr.length)};
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            r(true, (android.os.Process.myPid() >> 22) + 16, "ￌ\uffff\u0014\uffff\b\u000b\u0003\u0012\u0011\u0017\ufff1ￌ\u0005\f\uffff\n", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 127, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4, objArr2);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            r(true, 10 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0005\u0005\ufff4\f\u0003\u0002\ufff6\f\ufff4", 138 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 3 - android.view.View.resolveSizeAndState(0, 0, 0), objArr3);
            cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr);
            strArr2[length] = str;
            return strArr2;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int d(java.lang.String str, int i2, int i3) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int c(java.lang.String str, int i2, int i3) {
        while (true) {
            int i4 = i3 - 1;
            if (i4 < i2) {
                return i2;
            }
            char charAt = str.charAt(i4);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i3;
            }
            i3 = i4;
        }
    }

    public static java.lang.String b(java.lang.String str, int i2, int i3) {
        int d2 = d(str, i2, i3);
        return str.substring(d2, c(str, d2, i3));
    }

    public static int b(java.lang.String str, int i2, int i3, java.lang.String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int c(java.lang.String str, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static java.lang.String e(java.lang.String str) {
        java.net.InetAddress a2;
        int i2 = -1;
        if (str.contains(io.ktor.sse.ServerSentEventKt.COLON)) {
            if (str.startsWith("[") && str.endsWith("]")) {
                a2 = a(str, 1, str.length() - 1);
            } else {
                a2 = a(str, 0, str.length());
            }
            if (a2 == null) {
                return null;
            }
            byte[] address = a2.getAddress();
            if (address.length != 16) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid IPv6 address: '");
                sb.append(str);
                sb.append("'");
                throw new java.lang.AssertionError(sb.toString());
            }
            int i3 = 0;
            int i4 = 0;
            while (i3 < address.length) {
                int i5 = i3;
                while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                    i5 += 2;
                }
                int i6 = i5 - i3;
                if (i6 > i4 && i6 >= 4) {
                    i2 = i3;
                    i4 = i6;
                }
                i3 = i5 + 2;
            }
            com.facetec.sdk.pk pkVar = new com.facetec.sdk.pk();
            while (r3 < address.length) {
                if (r3 == i2) {
                    pkVar.g(58);
                    r3 += i4;
                    if (r3 == 16) {
                        pkVar.g(58);
                    }
                } else {
                    if (r3 > 0) {
                        pkVar.g(58);
                    }
                    pkVar.h(((address[r3] & 255) << 8) | (address[r3 + 1] & 255));
                    r3 += 2;
                }
            }
            return pkVar.k();
        }
        try {
            java.lang.String lowerCase = java.net.IDN.toASCII(str).toLowerCase(java.util.Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            while (r3 < lowerCase.length()) {
                char charAt = lowerCase.charAt(r3);
                r3 = (charAt > 31 && charAt < 127 && " #%/:?@[\\]".indexOf(charAt) == -1) ? r3 + 1 : 0;
                return null;
            }
            return lowerCase;
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    public static int c(java.lang.String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                return i2;
            }
        }
        return -1;
    }

    public static boolean b(java.lang.String str) {
        return p.matcher(str).matches();
    }

    public static java.lang.String c(java.lang.String str, java.lang.Object... objArr) {
        return java.lang.String.format(java.util.Locale.US, str, objArr);
    }

    public static java.nio.charset.Charset d(com.facetec.sdk.pr prVar, java.nio.charset.Charset charset) throws java.io.IOException {
        if (prVar.e(g)) {
            prVar.g(r0.j());
            return f3678a;
        }
        if (prVar.e(f)) {
            prVar.g(r0.j());
            return n;
        }
        if (prVar.e(h)) {
            prVar.g(r0.j());
            return k;
        }
        if (prVar.e(j)) {
            prVar.g(r0.j());
            return f3679o;
        }
        if (!prVar.e(l)) {
            return charset;
        }
        prVar.g(r0.j());
        return m;
    }

    public static int c(java.lang.String str, long j2, java.util.concurrent.TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new java.lang.NullPointerException("unit == null");
        }
        long millis = timeUnit.toMillis(60L);
        if (millis > androidx.collection.SieveCacheKt.NodeLinkMask) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" too large.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (millis != 0) {
            return (int) millis;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(" too small.");
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    public static java.lang.AssertionError d(java.lang.String str, java.lang.Exception exc) {
        java.lang.AssertionError assertionError = new java.lang.AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (java.lang.IllegalStateException unused) {
        }
        return assertionError;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c1, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x008f, code lost:
    
        if (r14 != r8) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0097  */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.net.InetAddress a(java.lang.String str, int i2, int i3) {
        int i4;
        int i5 = 16;
        byte[] bArr = new byte[16];
        int i6 = 0;
        int i7 = i2;
        int i8 = 0;
        int i9 = -1;
        int i10 = -1;
        while (true) {
            if (i7 < i3) {
                if (i8 != i5) {
                    int i11 = i7 + 2;
                    if (i11 <= i3 && str.regionMatches(i7, "::", i6, 2)) {
                        if (i9 == -1) {
                            i9 = i8 + 2;
                            i8 = i9;
                            if (i11 != i3) {
                                i10 = i11;
                                i7 = i10;
                                int i12 = 0;
                                while (i7 < i3) {
                                }
                                i4 = i7 - i10;
                                if (i4 == 0) {
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        return null;
                    }
                    if (i8 != 0) {
                        if (!str.regionMatches(i7, io.ktor.sse.ServerSentEventKt.COLON, i6, 1)) {
                            if (str.regionMatches(i7, ".", i6, 1)) {
                                int i13 = i8 - 2;
                                int i14 = i13;
                                loop2: while (true) {
                                    if (i10 < i3) {
                                        if (i14 == i5) {
                                            break;
                                        }
                                        if (i14 != i13) {
                                            if (str.charAt(i10) != '.') {
                                                break;
                                            }
                                            i10++;
                                        }
                                        int i15 = i10;
                                        int i16 = 0;
                                        while (i15 < i3) {
                                            char charAt = str.charAt(i15);
                                            if (charAt < '0' || charAt > '9') {
                                                break;
                                            }
                                            if ((i16 == 0 && i10 != i15) || (i16 = ((i16 * 10) + charAt) - 48) > 255) {
                                                break loop2;
                                            }
                                            i15++;
                                        }
                                        if (i15 - i10 == 0) {
                                            break;
                                        }
                                        bArr[i14] = (byte) i16;
                                        i14++;
                                        i10 = i15;
                                        i5 = 16;
                                    } else {
                                        i8 += 2;
                                    }
                                }
                            }
                            return null;
                        }
                        i7++;
                    }
                    i10 = i7;
                    i7 = i10;
                    int i122 = 0;
                    while (i7 < i3) {
                        int a2 = a(str.charAt(i7));
                        if (a2 == -1) {
                            break;
                        }
                        i122 = (i122 << 4) + a2;
                        i7++;
                    }
                    i4 = i7 - i10;
                    if (i4 == 0 || i4 > 4) {
                        break;
                    }
                    bArr[i8] = (byte) (i122 >>> 8);
                    bArr[i8 + 1] = (byte) i122;
                    i8 += 2;
                    i5 = 16;
                    i6 = 0;
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        if (i8 != 16) {
            if (i9 == -1) {
                return null;
            }
            int i17 = i8 - i9;
            try {
                java.lang.Object[] objArr = {bArr, java.lang.Integer.valueOf(i9), bArr, java.lang.Integer.valueOf(16 - i17), java.lang.Integer.valueOf(i17)};
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                r(true, 15 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "ￌ\uffff\u0014\uffff\b\u000b\u0003\u0012\u0011\u0017\ufff1ￌ\u0005\f\uffff\n", 126 - android.os.Process.getGidForName(""), 5 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr2);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                r(true, 10 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0005\u0005\ufff4\f\u0003\u0002\ufff6\f\ufff4", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 138, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 3, objArr3);
                cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr);
                java.util.Arrays.fill(bArr, i9, (16 - i8) + i9, (byte) 0);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        try {
            return java.net.InetAddress.getByAddress(bArr);
        } catch (java.net.UnknownHostException unused) {
            throw new java.lang.AssertionError();
        }
    }

    public static javax.net.ssl.X509TrustManager e() {
        try {
            javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((java.security.KeyStore) null);
            javax.net.ssl.TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                javax.net.ssl.TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof javax.net.ssl.X509TrustManager) {
                    return (javax.net.ssl.X509TrustManager) trustManager;
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected default trust managers:");
            sb.append(java.util.Arrays.toString(trustManagers));
            throw new java.lang.IllegalStateException(sb.toString());
        } catch (java.security.GeneralSecurityException e2) {
            throw d("No System TLS", (java.lang.Exception) e2);
        }
    }

    public static com.facetec.sdk.mm a(java.util.List<com.facetec.sdk.of> list) {
        com.facetec.sdk.mm.b bVar = new com.facetec.sdk.mm.b();
        for (com.facetec.sdk.of ofVar : list) {
            com.facetec.sdk.nd.d.c(bVar, ofVar.j.e(), ofVar.i.e());
        }
        return bVar.b();
    }

    static void a() {
        t = 780577508;
    }
}
