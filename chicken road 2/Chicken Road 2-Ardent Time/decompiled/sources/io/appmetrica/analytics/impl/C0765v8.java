package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.v8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0765v8 implements io.appmetrica.analytics.impl.InterfaceC0474k2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6950a = 5;

    /* renamed from: b, reason: collision with root package name */
    public final int f6951b = 100;

    /* renamed from: c, reason: collision with root package name */
    public final int f6952c = kotlin.KotlinVersion.MAX_COMPONENT_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final int f6953d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final int f6954e = 63;

    /* renamed from: f, reason: collision with root package name */
    public final int f6955f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final int f6956g = 2;

    /* renamed from: h, reason: collision with root package name */
    public final int f6957h = 1;

    /* renamed from: i, reason: collision with root package name */
    public final int f6958i = 64;

    /* renamed from: j, reason: collision with root package name */
    public final y1.f f6959j = new y1.f("^[a-zA-Z0-9'!#$%&*+-/=?^_`{|}~]+$");

    /* renamed from: k, reason: collision with root package name */
    public final y1.f f6960k = new y1.f("(?:^|\\.)(?:(ya\\.ru)|(?:yandex)\\.(\\w+|com?\\.\\w+))$");

    /* renamed from: l, reason: collision with root package name */
    public final java.util.List f6961l = i1.AbstractC0191j.H("ru", "by", "kz", "az", "kg", "lv", "md", "tj", "tm", "uz", "ee", "fr", "lt", "com", "co.il", "com.ge", "com.am", "com.tr", "com.ru");

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f6962m = "yandex.ru";

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f6963n = "gmail.com";

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f6964o = "googlemail.com";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    @Override // io.appmetrica.analytics.impl.InterfaceC0474k2
    public final java.lang.String a(java.lang.String str) {
        ?? Y;
        java.lang.String input = y1.g.c0(str).toString();
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("^\\++");
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        kotlin.jvm.internal.i.e(input, "input");
        java.lang.String replaceAll = compile.matcher(input).replaceAll("");
        kotlin.jvm.internal.i.d(replaceAll, "replaceAll(...)");
        java.lang.String lowerCase = replaceAll.toLowerCase(java.util.Locale.ROOT);
        int U2 = y1.g.U(lowerCase, '@', 0, 6);
        if (U2 == -1) {
            return null;
        }
        java.lang.String substring = lowerCase.substring(0, U2);
        java.lang.String substring2 = lowerCase.substring(U2 + 1);
        int length = substring.length();
        if (length >= this.f6957h && length <= this.f6958i) {
            java.util.List Z2 = y1.g.Z(substring, new char[]{'.'});
            if (!Z2.isEmpty()) {
                java.util.Iterator it = Z2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.String str2 = (java.lang.String) it.next();
                    int length2 = str2.length();
                    if (length2 < this.f6957h) {
                        break;
                    }
                    java.lang.Character N2 = y1.g.N(str2);
                    if (N2 != null && N2.charValue() == '\"') {
                        java.lang.Character valueOf = str2.length() == 0 ? null : java.lang.Character.valueOf(str2.charAt(str2.length() - 1));
                        if (valueOf != null && valueOf.charValue() == '\"' && length2 > 2) {
                            int i2 = 1;
                            while (true) {
                                int i3 = i2 + 2;
                                if (i3 >= str2.length()) {
                                    break;
                                }
                                char charAt = str2.charAt(i2);
                                if (charAt < ' ' || charAt == '\"' || charAt > '~') {
                                    break;
                                }
                                if (charAt == '\\') {
                                    if (i3 == str2.length()) {
                                        break;
                                    }
                                    i2++;
                                    if (str2.charAt(i2) < ' ') {
                                        break;
                                    }
                                }
                                i2++;
                            }
                        }
                    }
                    y1.f fVar = this.f6959j;
                    fVar.getClass();
                    if (!fVar.f8503a.matcher(str2).matches()) {
                        break;
                    }
                }
            }
            if (substring2.length() <= this.f6952c) {
                java.lang.String[] strArr = {"."};
                java.lang.String str3 = strArr[0];
                if (str3.length() == 0) {
                    y1.g.X(0);
                    x1.f fVar2 = new x1.f(new y1.c(substring2, 0, 0, new y1.p(i1.AbstractC0189h.J(strArr), false, 1)));
                    Y = new java.util.ArrayList(i1.AbstractC0192k.K(fVar2));
                    java.util.Iterator it2 = fVar2.iterator();
                    while (true) {
                        y1.b bVar = (y1.b) it2;
                        if (!bVar.hasNext()) {
                            break;
                        }
                        v1.C1002c range = (v1.C1002c) bVar.next();
                        kotlin.jvm.internal.i.e(range, "range");
                        Y.add(substring2.subSequence(range.f8387a, range.f8388b + 1).toString());
                    }
                } else {
                    Y = y1.g.Y(0, substring2, str3, false);
                }
                if (Y.size() >= this.f6953d) {
                    java.util.List M2 = i1.AbstractC0190i.M(Y);
                    if (!M2.isEmpty()) {
                        java.util.Iterator it3 = M2.iterator();
                        while (it3.hasNext()) {
                            if (!b((java.lang.String) it3.next())) {
                                break;
                            }
                        }
                    }
                    java.lang.String str4 = (java.lang.String) i1.AbstractC0190i.R(Y);
                    if (str4.length() >= this.f6956g && b(str4)) {
                        for (int i4 = 0; i4 < str4.length(); i4++) {
                            if (!java.lang.Character.isDigit(str4.charAt(i4))) {
                                java.lang.String I2 = y1.o.I(substring2, this.f6964o, this.f6963n);
                                y1.f fVar3 = this.f6960k;
                                fVar3.getClass();
                                java.util.regex.Matcher matcher = fVar3.f8503a.matcher(I2);
                                kotlin.jvm.internal.i.d(matcher, "matcher(...)");
                                o0.i iVar = !matcher.find(0) ? null : new o0.i(matcher, I2);
                                if (iVar != null) {
                                    if (((y1.e) iVar.f8149c) == null) {
                                        iVar.f8149c = new y1.e(iVar);
                                    }
                                    y1.e eVar = (y1.e) iVar.f8149c;
                                    kotlin.jvm.internal.i.b(eVar);
                                    java.lang.String str5 = (java.lang.String) eVar.get(1);
                                    java.lang.String str6 = (java.lang.String) eVar.get(2);
                                    if (str6.length() <= 0 ? str5.length() > 0 : this.f6961l.contains(str6)) {
                                        I2 = this.f6962m;
                                    }
                                }
                                if (kotlin.jvm.internal.i.a(I2, this.f6962m)) {
                                    substring = y1.o.I(substring, ".", "-");
                                } else if (kotlin.jvm.internal.i.a(I2, this.f6963n)) {
                                    substring = y1.o.I(substring, ".", "");
                                }
                                int length3 = substring.length();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= length3) {
                                        break;
                                    }
                                    if (substring.charAt(i5) == '+') {
                                        substring = substring.substring(0, i5);
                                        break;
                                    }
                                    i5++;
                                }
                                java.lang.String str7 = substring + '@' + I2;
                                if (str7.length() < this.f6950a || str7.length() > this.f6951b) {
                                    return null;
                                }
                                return str7;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final boolean b(java.lang.String str) {
        if (str.length() > this.f6954e || str.length() < this.f6955f) {
            return false;
        }
        if (str.length() == 0) {
            throw new java.util.NoSuchElementException("Char sequence is empty.");
        }
        if (java.lang.Character.isLetterOrDigit(str.charAt(0))) {
            if (str.length() == 0) {
                throw new java.util.NoSuchElementException("Char sequence is empty.");
            }
            if (java.lang.Character.isLetterOrDigit(str.charAt(y1.g.O(str)))) {
                for (int i2 = 0; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (!java.lang.Character.isLetterOrDigit(charAt) && charAt != '-') {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
