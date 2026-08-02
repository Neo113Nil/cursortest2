package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class ml {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* renamed from: a, reason: collision with root package name */
    private static final java.util.regex.Pattern f3651a;
    private static final java.util.regex.Pattern b;
    private static final java.util.regex.Pattern c;
    private static final java.util.regex.Pattern f;
    private static int l;
    private static char[] n;
    private static boolean p;
    private static boolean s;
    public final java.lang.String d;
    public final java.lang.String e;
    private final java.lang.String g;
    private final boolean h;
    private final java.lang.String i;
    private final long j;
    private final boolean k;
    private final boolean m;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f3652o;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(byte b2, byte b3, short s2) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = b3 + 65;
        int i4 = (b2 * 2) + 4;
        int i5 = (s2 * 3) + 1;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i4;
            int i7 = i5;
            int i8 = 0;
            int i9 = i4 + i7;
            int i10 = i6 + 1;
            i = i8;
            i3 = i9;
            i4 = i10;
            bArr2[i] = (byte) i3;
            i2 = i + 1;
            if (i2 == i5) {
                return new java.lang.String(bArr2, 0);
            }
            int i11 = i3;
            i6 = i4;
            i4 = bArr[i4];
            i8 = i2;
            i7 = i11;
            int i92 = i4 + i7;
            int i102 = i6 + 1;
            i = i8;
            i3 = i92;
            i4 = i102;
            bArr2[i] = (byte) i3;
            i2 = i + 1;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            i2 = i + 1;
            if (i2 == i5) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{106, 35, -52, -34};
        $$b = 76;
    }

    static {
        init$0();
        c();
        b = java.util.regex.Pattern.compile("(\\d{2,4})[^\\d]*");
        c = java.util.regex.Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
        f3651a = java.util.regex.Pattern.compile("(\\d{1,2})[^\\d]*");
        f = java.util.regex.Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    }

    private ml(java.lang.String str, java.lang.String str2, long j, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.e = str;
        this.d = str2;
        this.j = j;
        this.g = str3;
        this.i = str4;
        this.h = z;
        this.k = z2;
        this.m = z3;
        this.f3652o = z4;
    }

    private static void q(int[] iArr, java.lang.String str, int i, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.facetec.sdk.hn hnVar = new com.facetec.sdk.hn();
        char[] cArr = n;
        int i2 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[i2] = java.lang.Integer.valueOf(cArr[i3]);
                    java.lang.Object d = com.facetec.sdk.al.d(484843984);
                    if (d == null) {
                        char trimmedLength = (char) android.text.TextUtils.getTrimmedLength("");
                        long packedPositionForChild = android.widget.ExpandableListView.getPackedPositionForChild(i2, i2);
                        float complexToFraction = android.util.TypedValue.complexToFraction(i2, 0.0f, 0.0f);
                        byte b2 = (byte) i2;
                        java.lang.String $$c = $$c(b2, b2, b2);
                        java.lang.Class[] clsArr = new java.lang.Class[1];
                        clsArr[i2] = java.lang.Integer.TYPE;
                        d = com.facetec.sdk.al.c(trimmedLength, (packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1)) + 1812, (complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)) + 23, -1157014744, false, $$c, clsArr);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) d).invoke(null, objArr2)).charValue();
                    i3++;
                    i2 = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(l)};
        java.lang.Object d2 = com.facetec.sdk.al.d(-1796435875);
        if (d2 == null) {
            byte b3 = (byte) 0;
            byte b4 = (byte) (b3 + 1);
            d2 = com.facetec.sdk.al.c((char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), android.graphics.Color.red(0) + 662, 22 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 855894693, false, $$c(b3, b4, (byte) (b4 - 1)), new java.lang.Class[]{java.lang.Integer.TYPE});
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d2).invoke(null, objArr3)).intValue();
        int i4 = 870267758;
        if (p) {
            hnVar.c = bArr2.length;
            char[] cArr3 = new char[hnVar.c];
            hnVar.f3629a = 0;
            while (hnVar.f3629a < hnVar.c) {
                cArr3[hnVar.f3629a] = (char) (cArr[bArr2[(hnVar.c - 1) - hnVar.f3629a] + i] - intValue);
                java.lang.Object[] objArr4 = {hnVar, hnVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(i4);
                if (d3 == null) {
                    byte b5 = (byte) 0;
                    d3 = com.facetec.sdk.al.c((char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1235, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 24, -1808776810, false, $$c(b5, (byte) (b5 | 57), b5), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d3).invoke(null, objArr4);
                i4 = 870267758;
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (s) {
            hnVar.c = charArray.length;
            char[] cArr4 = new char[hnVar.c];
            hnVar.f3629a = 0;
            while (hnVar.f3629a < hnVar.c) {
                cArr4[hnVar.f3629a] = (char) (cArr[charArray[(hnVar.c - 1) - hnVar.f3629a] - i] - intValue);
                java.lang.Object[] objArr5 = {hnVar, hnVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(870267758);
                if (d4 == null) {
                    byte b6 = (byte) 0;
                    d4 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 1237 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 24 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), -1808776810, false, $$c(b6, (byte) (b6 | 57), b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr5);
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        int i5 = 0;
        hnVar.c = iArr.length;
        char[] cArr5 = new char[hnVar.c];
        while (true) {
            hnVar.f3629a = i5;
            if (hnVar.f3629a < hnVar.c) {
                cArr5[hnVar.f3629a] = (char) (cArr[iArr[(hnVar.c - 1) - hnVar.f3629a] - i] - intValue);
                i5 = hnVar.f3629a + 1;
            } else {
                objArr[0] = new java.lang.String(cArr5);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x0262, code lost:
    
        if (r0 > okhttp3.internal.http.DateFormattingKt.MAX_DATE) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0303 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0278  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.facetec.sdk.ml b(long j, com.facetec.sdk.mv mvVar, java.lang.String str) {
        long j2;
        java.lang.String g;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int lastIndexOf;
        java.lang.String str5;
        int i;
        int length;
        int length2;
        java.lang.String obj;
        java.lang.String str6;
        char c2;
        int i2;
        int i3;
        java.lang.String str7 = str;
        int length3 = str.length();
        ?? r3 = 0;
        char c3 = ';';
        int c4 = com.facetec.sdk.nh.c(str7, 0, length3, ';');
        char c5 = '=';
        int c6 = com.facetec.sdk.nh.c(str7, 0, c4, '=');
        java.lang.String str8 = null;
        if (c6 == c4) {
            return null;
        }
        java.lang.String b2 = com.facetec.sdk.nh.b(str7, 0, c6);
        if (!b2.isEmpty()) {
            int i4 = -1;
            if (com.facetec.sdk.nh.c(b2) == -1) {
                boolean z = true;
                java.lang.String b3 = com.facetec.sdk.nh.b(str7, c6 + 1, c4);
                if (com.facetec.sdk.nh.c(b3) != -1) {
                    return null;
                }
                int i5 = c4 + 1;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                java.lang.String str9 = null;
                boolean z5 = true;
                long j3 = -1;
                long j4 = okhttp3.internal.http.DateFormattingKt.MAX_DATE;
                while (i5 < length3) {
                    int c7 = com.facetec.sdk.nh.c(str7, i5, length3, c3);
                    int c8 = com.facetec.sdk.nh.c(str7, i5, c7, c5);
                    java.lang.String b4 = com.facetec.sdk.nh.b(str7, i5, c8);
                    if (c8 < c7) {
                        str6 = com.facetec.sdk.nh.b(str7, c8 + 1, c7);
                    } else {
                        str6 = "";
                    }
                    if (b4.equalsIgnoreCase("expires")) {
                        try {
                            int length4 = str6.length();
                            int a2 = a(str6, r3, length4, r3);
                            java.util.regex.Matcher matcher = f.matcher(str6);
                            int i6 = i4;
                            int i7 = i6;
                            int i8 = i7;
                            int i9 = i8;
                            int i10 = i9;
                            int i11 = i10;
                            while (a2 < length4) {
                                try {
                                    int a3 = a(str6, a2 + 1, length4, z);
                                    matcher.region(a2, a3);
                                    int i12 = i9;
                                    if (i12 != -1) {
                                        i3 = -1;
                                    } else if (matcher.usePattern(f).matches()) {
                                        i12 = java.lang.Integer.parseInt(matcher.group(1));
                                        int parseInt = java.lang.Integer.parseInt(matcher.group(2));
                                        i11 = java.lang.Integer.parseInt(matcher.group(3));
                                        i10 = parseInt;
                                        i9 = i12;
                                        a2 = a(str6, a3 + 1, length4, false);
                                        z = true;
                                    } else {
                                        i3 = -1;
                                    }
                                    if (i6 == i3) {
                                        if (matcher.usePattern(f3651a).matches()) {
                                            i6 = java.lang.Integer.parseInt(matcher.group(1));
                                            i9 = i12;
                                            a2 = a(str6, a3 + 1, length4, false);
                                            z = true;
                                        } else {
                                            i3 = -1;
                                        }
                                    }
                                    if (i7 == i3) {
                                        java.util.regex.Pattern pattern = c;
                                        if (matcher.usePattern(pattern).matches()) {
                                            i7 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(java.util.Locale.US)) / 4;
                                            i9 = i12;
                                            a2 = a(str6, a3 + 1, length4, false);
                                            z = true;
                                        } else {
                                            i3 = -1;
                                        }
                                    }
                                    if (i8 == i3 && matcher.usePattern(b).matches()) {
                                        i8 = java.lang.Integer.parseInt(matcher.group(1));
                                    }
                                    i9 = i12;
                                    a2 = a(str6, a3 + 1, length4, false);
                                    z = true;
                                } catch (java.lang.IllegalArgumentException unused) {
                                    i2 = -1;
                                    c2 = ';';
                                }
                            }
                            int i13 = i9;
                            if (i8 >= 70 && i8 <= 99) {
                                i8 += 1900;
                            }
                            if (i8 >= 0 && i8 <= 69) {
                                i8 += 2000;
                            }
                            if (i8 < 1601) {
                                throw new java.lang.IllegalArgumentException();
                            }
                            i2 = -1;
                            if (i7 == -1) {
                                throw new java.lang.IllegalArgumentException();
                            }
                            if (i6 <= 0 || i6 > 31) {
                                throw new java.lang.IllegalArgumentException();
                            }
                            if (i13 < 0 || i13 > 23) {
                                throw new java.lang.IllegalArgumentException();
                            }
                            int i14 = i10;
                            c2 = ';';
                            if (i14 < 0 || i14 > 59) {
                                throw new java.lang.IllegalArgumentException();
                            }
                            int i15 = i11;
                            if (i15 < 0 || i15 > 59) {
                                throw new java.lang.IllegalArgumentException();
                            }
                            try {
                                java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(com.facetec.sdk.nh.b);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i8);
                                gregorianCalendar.set(2, i7 - 1);
                                gregorianCalendar.set(5, i6);
                                gregorianCalendar.set(11, i13);
                                gregorianCalendar.set(12, i14);
                                gregorianCalendar.set(13, i15);
                                gregorianCalendar.set(14, 0);
                                j4 = gregorianCalendar.getTimeInMillis();
                            } catch (java.lang.NumberFormatException | java.lang.IllegalArgumentException unused2) {
                            }
                        } catch (java.lang.IllegalArgumentException unused3) {
                            c2 = c3;
                            i2 = i4;
                        }
                    } else {
                        c2 = c3;
                        i2 = i4;
                        if (b4.equalsIgnoreCase(io.ktor.client.utils.CacheControl.MAX_AGE)) {
                            j3 = e(str6);
                        } else {
                            if (!b4.equalsIgnoreCase("domain")) {
                                if (b4.equalsIgnoreCase("path")) {
                                    str9 = str6;
                                } else if (b4.equalsIgnoreCase("secure")) {
                                    z2 = true;
                                } else if (b4.equalsIgnoreCase("httponly")) {
                                    z3 = true;
                                }
                            } else {
                                if (str6.endsWith(".")) {
                                    throw new java.lang.IllegalArgumentException();
                                }
                                if (str6.startsWith(".")) {
                                    str6 = str6.substring(1);
                                }
                                java.lang.String e = com.facetec.sdk.nh.e(str6);
                                if (e == null) {
                                    throw new java.lang.IllegalArgumentException();
                                }
                                str8 = e;
                                z5 = false;
                            }
                            i5 = c7 + 1;
                            i4 = i2;
                            c3 = c2;
                            r3 = 0;
                            c5 = '=';
                            z = true;
                            str7 = str;
                        }
                    }
                    z4 = true;
                    i5 = c7 + 1;
                    i4 = i2;
                    c3 = c2;
                    r3 = 0;
                    c5 = '=';
                    z = true;
                    str7 = str;
                }
                long j5 = Long.MIN_VALUE;
                if (j3 != Long.MIN_VALUE) {
                    if (j3 != -1) {
                        j5 = j + (j3 <= 9223372036854775L ? j3 * 1000 : Long.MAX_VALUE);
                        long j6 = j5 >= j ? okhttp3.internal.http.DateFormattingKt.MAX_DATE : okhttp3.internal.http.DateFormattingKt.MAX_DATE;
                        j2 = j6;
                    } else {
                        j2 = j4;
                    }
                    g = mvVar.g();
                    if (str8 != null) {
                        str2 = g;
                    } else {
                        if (!g.equals(str8) && (!g.endsWith(str8) || g.charAt((g.length() - str8.length()) - 1) != '.' || com.facetec.sdk.nh.b(g))) {
                            return null;
                        }
                        str2 = str8;
                    }
                    if (g.length() != str2.length()) {
                        com.facetec.sdk.pe d = com.facetec.sdk.pe.d();
                        if (str2 == null) {
                            throw new java.lang.NullPointerException("domain == null");
                        }
                        java.lang.String[] split = java.net.IDN.toUnicode(str2).split("\\.");
                        java.lang.String[] b5 = d.b(split);
                        if (split.length == b5.length) {
                            i = 0;
                            if (b5[0].charAt(0) != '!') {
                                obj = null;
                                if (obj == null) {
                                    return null;
                                }
                            }
                        } else {
                            i = 0;
                        }
                        if (b5[i].charAt(i) == '!') {
                            length = split.length;
                            length2 = b5.length;
                        } else {
                            length = split.length;
                            length2 = b5.length + 1;
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.lang.String[] split2 = str2.split("\\.");
                        for (int i16 = length - length2; i16 < split2.length; i16++) {
                            sb.append(split2[i16]);
                            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                        }
                        sb.deleteCharAt(sb.length() - 1);
                        obj = sb.toString();
                        if (obj == null) {
                        }
                    }
                    str3 = androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR;
                    str4 = str9;
                    if (str4 == null && str4.startsWith(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR)) {
                        str5 = str4;
                    } else {
                        java.lang.String f2 = mvVar.f();
                        lastIndexOf = f2.lastIndexOf(47);
                        if (lastIndexOf != 0) {
                            str3 = f2.substring(0, lastIndexOf);
                        }
                        str5 = str3;
                    }
                    return new com.facetec.sdk.ml(b2, b3, j2, str2, str5, z2, z3, z5, z4);
                }
                j2 = j5;
                g = mvVar.g();
                if (str8 != null) {
                }
                if (g.length() != str2.length()) {
                }
                str3 = androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR;
                str4 = str9;
                if (str4 == null) {
                }
                java.lang.String f22 = mvVar.f();
                lastIndexOf = f22.lastIndexOf(47);
                if (lastIndexOf != 0) {
                }
                str5 = str3;
                return new com.facetec.sdk.ml(b2, b3, j2, str2, str5, z2, z3, z5, z4);
            }
        }
        return null;
    }

    private static int a(java.lang.String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private static long e(java.lang.String str) {
        try {
            long parseLong = java.lang.Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (java.lang.NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e;
        }
    }

    public final boolean equals(@javax.annotation.Nullable java.lang.Object obj) {
        if (!(obj instanceof com.facetec.sdk.ml)) {
            return false;
        }
        com.facetec.sdk.ml mlVar = (com.facetec.sdk.ml) obj;
        return mlVar.e.equals(this.e) && mlVar.d.equals(this.d) && mlVar.g.equals(this.g) && mlVar.i.equals(this.i) && mlVar.j == this.j && mlVar.h == this.h && mlVar.k == this.k && mlVar.f3652o == this.f3652o && mlVar.m == this.m;
    }

    public final int hashCode() {
        int hashCode = this.e.hashCode();
        int hashCode2 = this.d.hashCode();
        int hashCode3 = this.g.hashCode();
        int hashCode4 = this.i.hashCode();
        long j = this.j;
        return ((((((((((((((((hashCode + 527) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (!this.h ? 1 : 0)) * 31) + (!this.k ? 1 : 0)) * 31) + (!this.f3652o ? 1 : 0)) * 31) + (!this.m ? 1 : 0);
    }

    public static java.util.List<com.facetec.sdk.ml> b(com.facetec.sdk.mv mvVar, com.facetec.sdk.mm mmVar) {
        java.util.List emptyList;
        int e = mmVar.e();
        java.util.ArrayList arrayList = null;
        for (int i = 0; i < e; i++) {
            if ("Set-Cookie".equalsIgnoreCase(mmVar.a(i))) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList(2);
                }
                arrayList.add(mmVar.e(i));
            }
        }
        if (arrayList != null) {
            emptyList = java.util.Collections.unmodifiableList(arrayList);
        } else {
            emptyList = java.util.Collections.emptyList();
        }
        int size = emptyList.size();
        java.util.ArrayList arrayList2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.String str = (java.lang.String) emptyList.get(i2);
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                q(null, null, 127 - android.text.TextUtils.indexOf("", ""), "\u008d\u008c\u008b\u008a\u0089\u0088\u0084\u0087\u0086\u0082\u0085\u0084\u0082\u0083\u0082\u0081", objArr);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                q(null, null, 127 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u008a\u0092\u0085\u0085\u0092\u0093\u008c\u008d\u0092\u0091\u008b\u0086\u008c\u0090\u0090\u008f\u008e", objArr2);
                com.facetec.sdk.ml b2 = b(((java.lang.Long) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).longValue(), mvVar, str);
                if (b2 != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new java.util.ArrayList();
                    }
                    arrayList2.add(b2);
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (arrayList2 != null) {
            return java.util.Collections.unmodifiableList(arrayList2);
        }
        return java.util.Collections.emptyList();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.e);
        sb.append('=');
        sb.append(this.d);
        if (this.f3652o) {
            if (this.j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(com.facetec.sdk.ny.a(new java.util.Date(this.j)));
            }
        }
        if (!this.m) {
            sb.append("; domain=");
            sb.append(this.g);
        }
        sb.append("; path=");
        sb.append(this.i);
        if (this.h) {
            sb.append("; secure");
        }
        if (this.k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    static void c() {
        n = new char[]{5988, 5999, 6008, 6048, 5986, 5984, 5993, 6045, 6007, 6013, 6010, 5995, 5987, 5997, 6011, 6012, 6042, 5991, 6019};
        l = -1919674418;
        s = true;
        p = true;
    }
}
