package J1;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f932a;

    /* renamed from: b, reason: collision with root package name */
    public static final I1.m f933b = a.AbstractC0059a.u(new java.lang.String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final I1.z f934c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.TimeZone f935d;

    /* renamed from: e, reason: collision with root package name */
    public static final y1.f f936e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f937f;

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0185, code lost:
    
        continue;
     */
    static {
        int i2;
        byte[] bArr = new byte[0];
        f932a = bArr;
        V1.g gVar = new V1.g();
        gVar.s(bArr, 0, 0);
        long j2 = 0;
        f934c = new I1.z(j2, gVar, 0);
        c(j2, j2, j2);
        V1.j jVar = V1.j.f1765d;
        V1.j[] jVarArr = {m0.j.g("efbbbf"), m0.j.g("feff"), m0.j.g("fffe"), m0.j.g("0000ffff"), m0.j.g("ffff0000")};
        java.util.ArrayList arrayList = new java.util.ArrayList(new i1.C0187f(jVarArr, false));
        if (arrayList.size() > 1) {
            java.util.Collections.sort(arrayList);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(5);
        for (int i3 = 0; i3 < 5; i3++) {
            V1.j jVar2 = jVarArr[i3];
            arrayList2.add(-1);
        }
        java.lang.Integer[] numArr = (java.lang.Integer[]) arrayList2.toArray(new java.lang.Integer[0]);
        java.lang.Object[] elements = java.util.Arrays.copyOf(numArr, numArr.length);
        kotlin.jvm.internal.i.e(elements, "elements");
        java.util.ArrayList arrayList3 = elements.length == 0 ? new java.util.ArrayList() : new java.util.ArrayList(new i1.C0187f(elements, true));
        int i4 = 0;
        int i5 = 0;
        while (i4 < 5) {
            V1.j jVar3 = jVarArr[i4];
            int i6 = i5 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size < 0) {
                throw new java.lang.IllegalArgumentException(B1.a.g(size, "fromIndex (0) is greater than toIndex (", ")."));
            }
            if (size > size2) {
                throw new java.lang.IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
            }
            int i7 = size - 1;
            int i8 = 0;
            while (true) {
                if (i8 > i7) {
                    i2 = -(i8 + 1);
                    break;
                }
                i2 = (i8 + i7) >>> 1;
                java.lang.Comparable comparable = (java.lang.Comparable) arrayList.get(i2);
                int compareTo = comparable == jVar3 ? 0 : comparable == null ? -1 : jVar3 == null ? 1 : comparable.compareTo(jVar3);
                if (compareTo < 0) {
                    i8 = i2 + 1;
                } else if (compareTo > 0) {
                    i7 = i2 - 1;
                }
            }
            arrayList3.set(i2, java.lang.Integer.valueOf(i5));
            i4++;
            i5 = i6;
        }
        if (((V1.j) arrayList.get(0)).a() <= 0) {
            throw new java.lang.IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i9 = 0;
        while (i9 < arrayList.size()) {
            V1.j prefix = (V1.j) arrayList.get(i9);
            int i10 = i9 + 1;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                V1.j jVar4 = (V1.j) arrayList.get(i11);
                jVar4.getClass();
                kotlin.jvm.internal.i.e(prefix, "prefix");
                if (jVar4.f(prefix, prefix.a())) {
                    if (jVar4.a() == prefix.a()) {
                        throw new java.lang.IllegalArgumentException(("duplicate option: " + jVar4).toString());
                    }
                    if (((java.lang.Number) arrayList3.get(i11)).intValue() > ((java.lang.Number) arrayList3.get(i9)).intValue()) {
                        arrayList.remove(i11);
                        arrayList3.remove(i11);
                    } else {
                        i11++;
                    }
                }
            }
            i9 = i10;
        }
        V1.g gVar2 = new V1.g();
        Q1.l.c(0L, gVar2, 0, arrayList, 0, arrayList.size(), arrayList3);
        int[] iArr = new int[(int) (gVar2.f1764b / 4)];
        int i12 = 0;
        while (!gVar2.a()) {
            iArr[i12] = gVar2.l();
            i12++;
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(jVarArr, 5);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(this, size)");
        new V1.o((V1.j[]) copyOf);
        java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone("GMT");
        kotlin.jvm.internal.i.b(timeZone);
        f935d = timeZone;
        f936e = new y1.f("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        java.lang.String W2 = y1.g.W(I1.s.class.getName(), "okhttp3.");
        if (y1.o.F(W2, "Client")) {
            W2 = W2.substring(0, W2.length() - 6);
            kotlin.jvm.internal.i.d(W2, "substring(...)");
        }
        f937f = W2;
    }

    public static final boolean a(I1.o oVar, I1.o other) {
        kotlin.jvm.internal.i.e(oVar, "<this>");
        kotlin.jvm.internal.i.e(other, "other");
        return kotlin.jvm.internal.i.a(oVar.f764d, other.f764d) && oVar.f765e == other.f765e && kotlin.jvm.internal.i.a(oVar.f761a, other.f761a);
    }

    public static final int b(long j2, java.util.concurrent.TimeUnit timeUnit) {
        if (j2 < 0) {
            throw new java.lang.IllegalStateException(kotlin.jvm.internal.i.h(" < 0", "timeout").toString());
        }
        long millis = timeUnit.toMillis(j2);
        if (millis > 2147483647L) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.i.h(" too large.", "timeout").toString());
        }
        if (millis != 0 || j2 <= 0) {
            return (int) millis;
        }
        throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.i.h(" too small.", "timeout").toString());
    }

    public static final void c(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
    }

    public static final void d(java.io.Closeable closeable) {
        kotlin.jvm.internal.i.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (java.lang.RuntimeException e2) {
            throw e2;
        } catch (java.lang.Exception unused) {
        }
    }

    public static final void e(java.net.Socket socket) {
        kotlin.jvm.internal.i.e(socket, "<this>");
        try {
            socket.close();
        } catch (java.lang.AssertionError e2) {
            throw e2;
        } catch (java.lang.RuntimeException e3) {
            if (!kotlin.jvm.internal.i.a(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static final int f(java.lang.String str, char c2, int i2, int i3) {
        while (i2 < i3) {
            int i4 = i2 + 1;
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2 = i4;
        }
        return i3;
    }

    public static final int g(java.lang.String str, int i2, int i3, java.lang.String str2) {
        while (i2 < i3) {
            int i4 = i2 + 1;
            if (y1.g.L(str2, str.charAt(i2))) {
                return i2;
            }
            i2 = i4;
        }
        return i3;
    }

    public static final boolean h(V1.w wVar, java.util.concurrent.TimeUnit timeUnit) {
        kotlin.jvm.internal.i.e(timeUnit, "timeUnit");
        try {
            return t(wVar, 100, timeUnit);
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    public static final java.lang.String i(java.lang.String format, java.lang.Object... objArr) {
        kotlin.jvm.internal.i.e(format, "format");
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        return java.lang.String.format(locale, format, java.util.Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final boolean j(java.lang.String[] strArr, java.lang.String[] strArr2, java.util.Comparator comparator) {
        kotlin.jvm.internal.i.e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                java.lang.String str = strArr[i2];
                i2++;
                int i3 = 0;
                while (true) {
                    if (i3 < strArr2.length) {
                        int i4 = i3 + 1;
                        try {
                            if (comparator.compare(str, strArr2[i3]) == 0) {
                                return true;
                            }
                            i3 = i4;
                        } catch (java.lang.ArrayIndexOutOfBoundsException e2) {
                            throw new java.util.NoSuchElementException(e2.getMessage());
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long k(I1.y yVar) {
        java.lang.String a2 = yVar.f862f.a("Content-Length");
        if (a2 == null) {
            return -1L;
        }
        try {
            return java.lang.Long.parseLong(a2);
        } catch (java.lang.NumberFormatException unused) {
            return -1L;
        }
    }

    public static final java.util.List l(java.lang.Object... elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        java.lang.Object[] objArr = (java.lang.Object[]) elements.clone();
        java.util.List unmodifiableList = java.util.Collections.unmodifiableList(i1.AbstractC0191j.H(java.util.Arrays.copyOf(objArr, objArr.length)));
        kotlin.jvm.internal.i.d(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int m(java.lang.String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if (kotlin.jvm.internal.i.f(charAt, 31) <= 0 || kotlin.jvm.internal.i.f(charAt, 127) >= 0) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public static final int n(java.lang.String str, int i2, int i3) {
        while (i2 < i3) {
            int i4 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i2;
            }
            i2 = i4;
        }
        return i3;
    }

    public static final int o(java.lang.String str, int i2, int i3) {
        int i4 = i3 - 1;
        if (i2 <= i4) {
            while (true) {
                int i5 = i4 - 1;
                char charAt = str.charAt(i4);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i4 + 1;
                }
                if (i4 == i2) {
                    break;
                }
                i4 = i5;
            }
        }
        return i2;
    }

    public static final java.lang.String[] p(java.lang.String[] strArr, java.lang.String[] other, java.util.Comparator comparator) {
        kotlin.jvm.internal.i.e(other, "other");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            java.lang.String str = strArr[i2];
            i2++;
            int length2 = other.length;
            int i3 = 0;
            while (true) {
                if (i3 < length2) {
                    java.lang.String str2 = other[i3];
                    i3++;
                    if (comparator.compare(str, str2) == 0) {
                        arrayList.add(str);
                        break;
                    }
                }
            }
        }
        java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
        if (array != null) {
            return (java.lang.String[]) array;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean q(java.lang.String name) {
        kotlin.jvm.internal.i.e(name, "name");
        return name.equalsIgnoreCase("Authorization") || name.equalsIgnoreCase("Cookie") || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase("Set-Cookie");
    }

    public static final int r(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final int s(V1.q qVar) {
        kotlin.jvm.internal.i.e(qVar, "<this>");
        return (qVar.g() & 255) | ((qVar.g() & 255) << 16) | ((qVar.g() & 255) << 8);
    }

    public static final boolean t(V1.w wVar, int i2, java.util.concurrent.TimeUnit timeUnit) {
        kotlin.jvm.internal.i.e(timeUnit, "timeUnit");
        long nanoTime = java.lang.System.nanoTime();
        long c2 = wVar.d().e() ? wVar.d().c() - nanoTime : Long.MAX_VALUE;
        wVar.d().d(java.lang.Math.min(c2, timeUnit.toNanos(i2)) + nanoTime);
        try {
            V1.g gVar = new V1.g();
            while (wVar.c(gVar, 8192L) != -1) {
                gVar.o(gVar.f1764b);
            }
            if (c2 == Long.MAX_VALUE) {
                wVar.d().a();
            } else {
                wVar.d().d(nanoTime + c2);
            }
            return true;
        } catch (java.io.InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                wVar.d().a();
            } else {
                wVar.d().d(nanoTime + c2);
            }
            return false;
        } catch (java.lang.Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                wVar.d().a();
            } else {
                wVar.d().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static final I1.m u(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(20);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            P1.C0055c c0055c = (P1.C0055c) it.next();
            java.lang.String h2 = c0055c.f1458a.h();
            java.lang.String h3 = c0055c.f1459b.h();
            arrayList.add(h2);
            arrayList.add(y1.g.c0(h3).toString());
        }
        java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
        if (array != null) {
            return new I1.m((java.lang.String[]) array);
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final java.lang.String v(I1.o oVar, boolean z2) {
        kotlin.jvm.internal.i.e(oVar, "<this>");
        java.lang.String str = oVar.f764d;
        if (y1.g.M(str, io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            str = "[" + str + ']';
        }
        int i2 = oVar.f765e;
        if (!z2) {
            java.lang.String scheme = oVar.f761a;
            kotlin.jvm.internal.i.e(scheme, "scheme");
            if (i2 == (scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i2;
    }

    public static final java.util.List w(java.util.List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        java.util.List unmodifiableList = java.util.Collections.unmodifiableList(i1.AbstractC0190i.Z(list));
        kotlin.jvm.internal.i.d(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int x(int i2, java.lang.String str) {
        java.lang.Long valueOf;
        if (str == null) {
            valueOf = null;
        } else {
            try {
                valueOf = java.lang.Long.valueOf(java.lang.Long.parseLong(str));
            } catch (java.lang.NumberFormatException unused) {
                return i2;
            }
        }
        if (valueOf == null) {
            return i2;
        }
        long longValue = valueOf.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final java.lang.String y(java.lang.String str, int i2, int i3) {
        int n2 = n(str, i2, i3);
        java.lang.String substring = str.substring(n2, o(str, n2, i3));
        kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final void z(java.io.IOException iOException, java.util.List list) {
        kotlin.jvm.internal.i.e(iOException, "<this>");
        if (list.size() > 1) {
            java.lang.System.out.println(list);
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            Q1.d.b(iOException, (java.lang.Exception) it.next());
        }
    }
}
