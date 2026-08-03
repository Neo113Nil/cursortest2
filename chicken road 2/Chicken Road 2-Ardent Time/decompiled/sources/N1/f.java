package N1;

/* loaded from: classes.dex */
public abstract class f {
    static {
        V1.j jVar = V1.j.f1765d;
        m0.j.j("\"\\");
        m0.j.j("\t ,=");
    }

    public static final boolean a(I1.y yVar) {
        if (kotlin.jvm.internal.i.a(yVar.f857a.f835b, "HEAD")) {
            return false;
        }
        int i2 = yVar.f860d;
        return (((i2 >= 100 && i2 < 200) || i2 == 204 || i2 == 304) && J1.b.k(yVar) == -1 && !"chunked".equalsIgnoreCase(I1.y.a(yVar, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x01f1, code lost:
    
        if (r3.f8503a.matcher(r0).matches() == false) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(I1.C0027b c0027b, I1.o url, I1.m headers) {
        java.util.List list;
        int i2;
        I1.j jVar;
        int i3;
        java.lang.String str;
        int i4 = 1;
        kotlin.jvm.internal.i.e(c0027b, "<this>");
        kotlin.jvm.internal.i.e(url, "url");
        kotlin.jvm.internal.i.e(headers, "headers");
        if (c0027b == I1.C0027b.f681b) {
            return;
        }
        java.util.regex.Pattern pattern = I1.j.f733j;
        int size = headers.size();
        int i5 = 0;
        int i6 = 0;
        java.util.ArrayList arrayList = null;
        while (i6 < size) {
            int i7 = i6 + 1;
            if ("Set-Cookie".equalsIgnoreCase(headers.b(i6))) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList(2);
                }
                arrayList.add(headers.d(i6));
            }
            i6 = i7;
        }
        java.util.List list2 = i1.C0199r.f3325a;
        if (arrayList != null) {
            java.util.List unmodifiableList = java.util.Collections.unmodifiableList(arrayList);
            kotlin.jvm.internal.i.d(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            list = unmodifiableList;
        } else {
            list = list2;
        }
        int size2 = list.size();
        int i8 = 0;
        java.util.ArrayList arrayList2 = null;
        while (i8 < size2) {
            int i9 = i8 + 1;
            java.lang.String setCookie = (java.lang.String) list.get(i8);
            kotlin.jvm.internal.i.e(setCookie, "setCookie");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            byte[] bArr = J1.b.f932a;
            char c2 = ';';
            int f2 = J1.b.f(setCookie, ';', i5, setCookie.length());
            char c3 = '=';
            int f3 = J1.b.f(setCookie, '=', i5, f2);
            if (f3 == f2) {
                i3 = i5;
                jVar = null;
                i2 = i4;
            } else {
                java.lang.String y2 = J1.b.y(setCookie, i5, f3);
                if (y2.length() != 0 && J1.b.m(y2) == -1) {
                    java.lang.String y3 = J1.b.y(setCookie, f3 + i4, f2);
                    if (J1.b.m(y3) == -1) {
                        int i10 = f2 + i4;
                        int length = setCookie.length();
                        long j2 = 253402300799999L;
                        boolean z2 = i4;
                        long j3 = 253402300799999L;
                        java.lang.String str2 = null;
                        long j4 = -1;
                        boolean z3 = false;
                        boolean z4 = false;
                        boolean z5 = 0;
                        java.lang.String str3 = null;
                        while (true) {
                            if (i10 < length) {
                                int f4 = J1.b.f(setCookie, c2, i10, length);
                                int f5 = J1.b.f(setCookie, c3, i10, f4);
                                java.lang.String y4 = J1.b.y(setCookie, i10, f5);
                                java.lang.String y5 = f5 < f4 ? J1.b.y(setCookie, f5 + i4, f4) : "";
                                if (y4.equalsIgnoreCase("expires")) {
                                    try {
                                        j3 = Q1.d.v(y5.length(), y5);
                                        z5 = i4;
                                    } catch (java.lang.NumberFormatException | java.lang.IllegalArgumentException unused) {
                                    }
                                } else if (y4.equalsIgnoreCase("max-age")) {
                                    try {
                                        long parseLong = java.lang.Long.parseLong(y5);
                                        j4 = parseLong > 0 ? parseLong : Long.MIN_VALUE;
                                    } catch (java.lang.NumberFormatException e2) {
                                        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("-?\\d+");
                                        kotlin.jvm.internal.i.d(compile, "compile(...)");
                                        if (!compile.matcher(y5).matches()) {
                                            throw e2;
                                        }
                                        j4 = y1.o.K(y5, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    i4 = 1;
                                    z5 = 1;
                                } else if (!y4.equalsIgnoreCase("domain")) {
                                    if (y4.equalsIgnoreCase("path")) {
                                        str3 = y5;
                                    } else if (y4.equalsIgnoreCase("secure")) {
                                        i4 = 1;
                                        z3 = true;
                                    } else if (y4.equalsIgnoreCase("httponly")) {
                                        i4 = 1;
                                        z4 = true;
                                    }
                                    i4 = 1;
                                } else {
                                    if (y1.o.F(y5, ".")) {
                                        throw new java.lang.IllegalArgumentException("Failed requirement.");
                                    }
                                    java.lang.String E2 = u0.AbstractC0995a.E(y1.g.W(y5, "."));
                                    if (E2 == null) {
                                        throw new java.lang.IllegalArgumentException();
                                    }
                                    str2 = E2;
                                    i4 = 1;
                                    z2 = 0;
                                }
                                i10 = f4 + 1;
                                c2 = ';';
                                c3 = '=';
                                z5 = z5;
                                z2 = z2;
                            } else {
                                if (j4 == Long.MIN_VALUE) {
                                    j2 = Long.MIN_VALUE;
                                } else if (j4 != -1) {
                                    long j5 = currentTimeMillis + (j4 <= 9223372036854775L ? j4 * io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT : Long.MAX_VALUE);
                                    if (j5 >= currentTimeMillis && j5 <= 253402300799999L) {
                                        j2 = j5;
                                    }
                                } else {
                                    j2 = j3;
                                }
                                java.lang.String str4 = url.f764d;
                                if (str2 == null) {
                                    str2 = str4;
                                } else if (!kotlin.jvm.internal.i.a(str4, str2)) {
                                    if (y1.o.F(str4, str2)) {
                                        i2 = 1;
                                        if (str4.charAt((str4.length() - str2.length()) - 1) == '.') {
                                            y1.f fVar = J1.b.f936e;
                                            fVar.getClass();
                                        }
                                    } else {
                                        i2 = 1;
                                    }
                                    i3 = 0;
                                    jVar = null;
                                }
                                i2 = 1;
                                if (str4.length() == str2.length() || okhttp3.internal.publicsuffix.PublicSuffixDatabase.f8205g.a(str2) != null) {
                                    java.lang.String str5 = "/";
                                    java.lang.String str6 = str3;
                                    i3 = 0;
                                    if (str6 == null || !y1.o.K(str6, "/", false)) {
                                        java.lang.String b2 = url.b();
                                        int U2 = y1.g.U(b2, '/', 0, 6);
                                        if (U2 != 0) {
                                            str5 = b2.substring(0, U2);
                                            kotlin.jvm.internal.i.d(str5, "this as java.lang.String…ing(startIndex, endIndex)");
                                        }
                                        str = str5;
                                    } else {
                                        str = str6;
                                    }
                                    jVar = new I1.j(y2, y3, j2, str2, str, z3, z4, z5, z2);
                                }
                            }
                        }
                    }
                }
                i2 = i4;
                jVar = null;
                i3 = 0;
            }
            if (jVar != null) {
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                }
                arrayList2.add(jVar);
            }
            i4 = i2;
            i8 = i9;
            i5 = i3;
        }
        if (arrayList2 != null) {
            list2 = java.util.Collections.unmodifiableList(arrayList2);
            kotlin.jvm.internal.i.d(list2, "{\n        Collections.un…ableList(cookies)\n      }");
        }
        list2.isEmpty();
    }
}
