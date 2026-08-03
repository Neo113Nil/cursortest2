package I1;

/* renamed from: I1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0027b {

    /* renamed from: a, reason: collision with root package name */
    public static final I1.C0027b f680a = new I1.C0027b();

    /* renamed from: b, reason: collision with root package name */
    public static final I1.C0027b f681b = new I1.C0027b();

    /* renamed from: c, reason: collision with root package name */
    public static final I1.C0027b f682c = new I1.C0027b();

    public static final I1.g a(I1.C0027b c0027b, java.lang.String str) {
        I1.g gVar = new I1.g(str);
        I1.g.f706d.put(str, gVar);
        return gVar;
    }

    public static java.lang.String b(java.lang.String str, int i2, int i3, java.lang.String str2, boolean z2, boolean z3, boolean z4, boolean z5, int i4) {
        int i5 = (i4 & 1) != 0 ? 0 : i2;
        int length = (i4 & 2) != 0 ? str.length() : i3;
        boolean z6 = (i4 & 8) != 0 ? false : z2;
        boolean z7 = (i4 & 16) != 0 ? false : z3;
        boolean z8 = (i4 & 32) != 0 ? false : z4;
        boolean z9 = (i4 & 64) == 0 ? z5 : false;
        kotlin.jvm.internal.i.e(str, "<this>");
        int i6 = i5;
        while (i6 < length) {
            int codePointAt = str.codePointAt(i6);
            int i7 = 32;
            int i8 = 128;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z9) || y1.g.L(str2, (char) codePointAt) || ((codePointAt == 37 && (!z6 || (z7 && !d(str, i6, length)))) || (codePointAt == 43 && z8)))) {
                V1.g gVar = new V1.g();
                gVar.y(str, i5, i6);
                V1.g gVar2 = null;
                while (i6 < length) {
                    int codePointAt2 = str.codePointAt(i6);
                    if (!z6 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z8) {
                            gVar.x(z6 ? "+" : "%2B");
                        } else if (codePointAt2 < i7 || codePointAt2 == 127 || ((codePointAt2 >= i8 && !z9) || y1.g.L(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z6 || (z7 && !d(str, i6, length)))))) {
                            if (gVar2 == null) {
                                gVar2 = new V1.g();
                            }
                            gVar2.z(codePointAt2);
                            while (!gVar2.a()) {
                                byte g2 = gVar2.g();
                                gVar.u(37);
                                char[] cArr = I1.o.f760j;
                                gVar.u(cArr[((g2 & 255) >> 4) & 15]);
                                gVar.u(cArr[g2 & 15]);
                            }
                        } else {
                            gVar.z(codePointAt2);
                        }
                    }
                    i6 += java.lang.Character.charCount(codePointAt2);
                    i7 = 32;
                    i8 = 128;
                }
                return gVar.n(gVar.f1764b, y1.a.f8486a);
            }
            i6 += java.lang.Character.charCount(codePointAt);
        }
        java.lang.String substring = str.substring(i5, length);
        kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static boolean d(java.lang.String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && J1.b.r(str.charAt(i2 + 1)) != -1 && J1.b.r(str.charAt(i4)) != -1;
    }

    public static java.lang.String e(java.lang.String str, int i2, int i3, boolean z2, int i4) {
        int i5;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        kotlin.jvm.internal.i.e(str, "<this>");
        int i6 = i2;
        while (i6 < i3) {
            int i7 = i6 + 1;
            char charAt = str.charAt(i6);
            if (charAt == '%' || (charAt == '+' && z2)) {
                V1.g gVar = new V1.g();
                gVar.y(str, i2, i6);
                while (i6 < i3) {
                    int codePointAt = str.codePointAt(i6);
                    if (codePointAt != 37 || (i5 = i6 + 2) >= i3) {
                        if (codePointAt == 43 && z2) {
                            gVar.u(32);
                            i6++;
                        }
                        gVar.z(codePointAt);
                        i6 += java.lang.Character.charCount(codePointAt);
                    } else {
                        int r2 = J1.b.r(str.charAt(i6 + 1));
                        int r3 = J1.b.r(str.charAt(i5));
                        if (r2 != -1 && r3 != -1) {
                            gVar.u((r2 << 4) + r3);
                            i6 = java.lang.Character.charCount(codePointAt) + i5;
                        }
                        gVar.z(codePointAt);
                        i6 += java.lang.Character.charCount(codePointAt);
                    }
                }
                return gVar.n(gVar.f1764b, y1.a.f8486a);
            }
            i6 = i7;
        }
        java.lang.String substring = str.substring(i2, i3);
        kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static java.util.ArrayList f(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int Q2 = y1.g.Q(str, '&', i2, false, 4);
            if (Q2 == -1) {
                Q2 = str.length();
            }
            int Q3 = y1.g.Q(str, '=', i2, false, 4);
            if (Q3 == -1 || Q3 > Q2) {
                java.lang.String substring = str.substring(i2, Q2);
                kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                java.lang.String substring2 = str.substring(i2, Q3);
                kotlin.jvm.internal.i.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring2);
                java.lang.String substring3 = str.substring(Q3 + 1, Q2);
                kotlin.jvm.internal.i.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring3);
            }
            i2 = Q2 + 1;
        }
        return arrayList;
    }

    public synchronized I1.g c(java.lang.String javaName) {
        I1.g gVar;
        java.lang.String str;
        try {
            kotlin.jvm.internal.i.e(javaName, "javaName");
            java.util.LinkedHashMap linkedHashMap = I1.g.f706d;
            gVar = (I1.g) linkedHashMap.get(javaName);
            if (gVar == null) {
                if (y1.o.K(javaName, "TLS_", false)) {
                    java.lang.String substring = javaName.substring(4);
                    kotlin.jvm.internal.i.d(substring, "this as java.lang.String).substring(startIndex)");
                    str = kotlin.jvm.internal.i.h(substring, "SSL_");
                } else if (y1.o.K(javaName, "SSL_", false)) {
                    java.lang.String substring2 = javaName.substring(4);
                    kotlin.jvm.internal.i.d(substring2, "this as java.lang.String).substring(startIndex)");
                    str = kotlin.jvm.internal.i.h(substring2, "TLS_");
                } else {
                    str = javaName;
                }
                gVar = (I1.g) linkedHashMap.get(str);
                if (gVar == null) {
                    gVar = new I1.g(javaName);
                }
                linkedHashMap.put(javaName, gVar);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return gVar;
    }
}
