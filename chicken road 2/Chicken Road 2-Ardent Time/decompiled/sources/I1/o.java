package I1;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f760j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f761a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f762b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f763c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f764d;

    /* renamed from: e, reason: collision with root package name */
    public final int f765e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f766f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f767g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f768h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f769i;

    public o(java.lang.String scheme, java.lang.String str, java.lang.String str2, java.lang.String host, int i2, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.i.e(scheme, "scheme");
        kotlin.jvm.internal.i.e(host, "host");
        this.f761a = scheme;
        this.f762b = str;
        this.f763c = str2;
        this.f764d = host;
        this.f765e = i2;
        this.f766f = arrayList2;
        this.f767g = str3;
        this.f768h = str4;
        this.f769i = scheme.equals("https");
    }

    public final java.lang.String a() {
        if (this.f763c.length() == 0) {
            return "";
        }
        int length = this.f761a.length() + 3;
        java.lang.String str = this.f768h;
        java.lang.String substring = str.substring(y1.g.Q(str, ':', length, false, 4) + 1, y1.g.Q(str, '@', 0, false, 6));
        kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final java.lang.String b() {
        int length = this.f761a.length() + 3;
        java.lang.String str = this.f768h;
        int Q2 = y1.g.Q(str, '/', length, false, 4);
        java.lang.String substring = str.substring(Q2, J1.b.g(str, Q2, str.length(), "?#"));
        kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final java.util.ArrayList c() {
        int length = this.f761a.length() + 3;
        java.lang.String str = this.f768h;
        int Q2 = y1.g.Q(str, '/', length, false, 4);
        int g2 = J1.b.g(str, Q2, str.length(), "?#");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (Q2 < g2) {
            int i2 = Q2 + 1;
            int f2 = J1.b.f(str, '/', i2, g2);
            java.lang.String substring = str.substring(i2, f2);
            kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            Q2 = f2;
        }
        return arrayList;
    }

    public final java.lang.String d() {
        if (this.f766f == null) {
            return null;
        }
        java.lang.String str = this.f768h;
        int Q2 = y1.g.Q(str, '?', 0, false, 6) + 1;
        java.lang.String substring = str.substring(Q2, J1.b.f(str, '#', Q2, str.length()));
        kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final java.lang.String e() {
        if (this.f762b.length() == 0) {
            return "";
        }
        int length = this.f761a.length() + 3;
        java.lang.String str = this.f768h;
        java.lang.String substring = str.substring(length, J1.b.g(str, length, str.length(), ":@"));
        kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof I1.o) && kotlin.jvm.internal.i.a(((I1.o) obj).f768h, this.f768h);
    }

    public final java.net.URI f() {
        java.lang.String substring;
        java.lang.String replaceAll;
        I1.n nVar = new I1.n();
        java.lang.String scheme = this.f761a;
        nVar.f752a = scheme;
        nVar.f753b = e();
        nVar.f754c = a();
        nVar.f755d = this.f764d;
        kotlin.jvm.internal.i.e(scheme, "scheme");
        int i2 = scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1;
        int i3 = this.f765e;
        nVar.f756e = i3 != i2 ? i3 : -1;
        java.util.ArrayList arrayList = nVar.f757f;
        arrayList.clear();
        arrayList.addAll(c());
        java.lang.String d2 = d();
        nVar.f758g = d2 == null ? null : I1.C0027b.f(I1.C0027b.b(d2, 0, 0, " \"'<>#", true, false, true, false, 211));
        int i4 = 0;
        if (this.f767g == null) {
            substring = null;
        } else {
            java.lang.String str = this.f768h;
            substring = str.substring(y1.g.Q(str, '#', 0, false, 6) + 1);
            kotlin.jvm.internal.i.d(substring, "this as java.lang.String).substring(startIndex)");
        }
        nVar.f759h = substring;
        java.lang.String str2 = nVar.f755d;
        if (str2 == null) {
            replaceAll = null;
        } else {
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[\"<>^`{|}]");
            kotlin.jvm.internal.i.d(compile, "compile(...)");
            replaceAll = compile.matcher(str2).replaceAll("");
            kotlin.jvm.internal.i.d(replaceAll, "replaceAll(...)");
        }
        nVar.f755d = replaceAll;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.set(i5, I1.C0027b.b((java.lang.String) arrayList.get(i5), 0, 0, "[]", true, true, false, false, 227));
        }
        java.util.ArrayList arrayList2 = nVar.f758g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            while (i4 < size2) {
                int i6 = i4 + 1;
                java.lang.String str3 = (java.lang.String) arrayList2.get(i4);
                arrayList2.set(i4, str3 == null ? null : I1.C0027b.b(str3, 0, 0, "\\^`{|}", true, true, true, false, 195));
                i4 = i6;
            }
        }
        java.lang.String str4 = nVar.f759h;
        nVar.f759h = str4 != null ? I1.C0027b.b(str4, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        java.lang.String nVar2 = nVar.toString();
        try {
            return new java.net.URI(nVar2);
        } catch (java.net.URISyntaxException e2) {
            try {
                java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                kotlin.jvm.internal.i.d(compile2, "compile(...)");
                java.lang.String replaceAll2 = compile2.matcher(nVar2).replaceAll("");
                kotlin.jvm.internal.i.d(replaceAll2, "replaceAll(...)");
                java.net.URI create = java.net.URI.create(replaceAll2);
                kotlin.jvm.internal.i.d(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (java.lang.Exception unused) {
                throw new java.lang.RuntimeException(e2);
            }
        }
    }

    public final int hashCode() {
        return this.f768h.hashCode();
    }

    public final java.lang.String toString() {
        return this.f768h;
    }
}
