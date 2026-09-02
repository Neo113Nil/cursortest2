package I1;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f752a;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f755d;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f757f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f758g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f759h;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f753b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f754c = "";

    /* renamed from: e, reason: collision with root package name */
    public int f756e = -1;

    public n() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f757f = arrayList;
        arrayList.add("");
    }

    public final I1.o a() {
        java.util.ArrayList arrayList;
        java.lang.String str = this.f752a;
        if (str == null) {
            throw new java.lang.IllegalStateException("scheme == null");
        }
        java.lang.String e2 = I1.C0027b.e(this.f753b, 0, 0, false, 7);
        java.lang.String e3 = I1.C0027b.e(this.f754c, 0, 0, false, 7);
        java.lang.String str2 = this.f755d;
        if (str2 == null) {
            throw new java.lang.IllegalStateException("host == null");
        }
        int b2 = b();
        java.util.ArrayList arrayList2 = this.f757f;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(i1.AbstractC0192k.K(arrayList2));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(I1.C0027b.e((java.lang.String) it.next(), 0, 0, false, 7));
        }
        java.util.ArrayList<java.lang.String> arrayList4 = this.f758g;
        if (arrayList4 == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(i1.AbstractC0192k.K(arrayList4));
            for (java.lang.String str3 : arrayList4) {
                arrayList.add(str3 == null ? null : I1.C0027b.e(str3, 0, 0, true, 3));
            }
        }
        java.lang.String str4 = this.f759h;
        return new I1.o(str, e2, e3, str2, b2, arrayList3, arrayList, str4 != null ? I1.C0027b.e(str4, 0, 0, false, 7) : null, toString());
    }

    public final int b() {
        int i2 = this.f756e;
        if (i2 != -1) {
            return i2;
        }
        java.lang.String str = this.f752a;
        kotlin.jvm.internal.i.b(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x027c, code lost:
    
        if (r1 < 65536) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x007c, code lost:
    
        if (r5 == ':') goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00dc A[EDGE_INSN: B:179:0x00dc->B:16:0x00dc BREAK  A[LOOP:0: B:10:0x00c7->B:177:0x00d7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014d  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(I1.o oVar, java.lang.String str) {
        int i2;
        int i3;
        int i4;
        char c2;
        char c3;
        int i5;
        int g2;
        char charAt;
        java.util.ArrayList arrayList;
        int i6;
        int i7;
        int i8;
        char c4;
        int i9;
        boolean z2;
        int i10;
        java.util.ArrayList arrayList2;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i11;
        int i12;
        int g3;
        java.util.ArrayList arrayList3;
        int i13;
        byte[] bArr = J1.b.f932a;
        int n2 = J1.b.n(str, 0, str.length());
        int o2 = J1.b.o(str, n2, str.length());
        char c5 = 65535;
        if (o2 - n2 >= 2) {
            char charAt2 = str.charAt(n2);
            char c6 = 'a';
            if ((kotlin.jvm.internal.i.f(charAt2, 97) >= 0 && kotlin.jvm.internal.i.f(charAt2, 122) <= 0) || (kotlin.jvm.internal.i.f(charAt2, 65) >= 0 && kotlin.jvm.internal.i.f(charAt2, 90) <= 0)) {
                i2 = n2 + 1;
                while (true) {
                    if (i2 >= o2) {
                        break;
                    }
                    int i14 = i2 + 1;
                    char charAt3 = str.charAt(i2);
                    if ((c6 <= charAt3 && charAt3 < '{') || (('A' <= charAt3 && charAt3 < '[') || (('0' <= charAt3 && charAt3 < ':') || charAt3 == '+' || charAt3 == '-' || charAt3 == '.'))) {
                        i2 = i14;
                        c6 = 'a';
                    }
                }
                java.lang.String str5 = "http";
                java.lang.String str6 = "https";
                java.lang.String str7 = "this as java.lang.String…ing(startIndex, endIndex)";
                if (i2 == -1) {
                    if (y1.o.J(n2, str, "https:", true)) {
                        this.f752a = "https";
                        n2 += 6;
                    } else {
                        if (!y1.o.J(n2, str, "http:", true)) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                            java.lang.String substring = str.substring(0, i2);
                            kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb.append(substring);
                            sb.append('\'');
                            throw new java.lang.IllegalArgumentException(sb.toString());
                        }
                        this.f752a = "http";
                        n2 += 5;
                    }
                } else {
                    if (oVar == null) {
                        throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.i.h(str.length() > 6 ? kotlin.jvm.internal.i.h("...", y1.g.b0(6, str)) : str, "Expected URL scheme 'http' or 'https' but no scheme was found for "));
                    }
                    this.f752a = oVar.f761a;
                }
                i3 = n2;
                i4 = 0;
                while (true) {
                    c2 = '/';
                    c3 = '\\';
                    if (i3 < o2) {
                        break;
                    }
                    i13 = i3 + 1;
                    char charAt4 = str.charAt(i3);
                    if (charAt4 != '\\' && charAt4 != '/') {
                        break;
                    }
                    i4++;
                    i3 = i13;
                }
                java.util.ArrayList arrayList4 = this.f757f;
                char c7 = '#';
                if (i4 < 2 && oVar != null) {
                    if (kotlin.jvm.internal.i.a(oVar.f761a, this.f752a)) {
                        this.f753b = oVar.e();
                        this.f754c = oVar.a();
                        this.f755d = oVar.f764d;
                        this.f756e = oVar.f765e;
                        arrayList4.clear();
                        arrayList4.addAll(oVar.c());
                        if (n2 == o2 || str.charAt(n2) == '#') {
                            java.lang.String d2 = oVar.d();
                            this.f758g = d2 == null ? null : I1.C0027b.f(I1.C0027b.b(d2, 0, 0, " \"'<>#", true, false, true, false, 211));
                        }
                        arrayList = arrayList4;
                        i9 = o2;
                        z2 = false;
                        i12 = i9;
                        g3 = J1.b.g(str, n2, i12, "?#");
                        if (n2 != g3) {
                            char charAt5 = str.charAt(n2);
                            if (charAt5 == '/' || charAt5 == '\\') {
                                arrayList3 = arrayList;
                                arrayList3.clear();
                                arrayList3.add("");
                                n2++;
                            } else {
                                arrayList3 = arrayList;
                                arrayList3.set(arrayList.size() - 1, "");
                            }
                            int i15 = n2;
                            while (i15 < g3) {
                                int g4 = J1.b.g(str, i15, g3, "/\\");
                                boolean z3 = g4 < g3 ? true : z2;
                                java.lang.String b2 = I1.C0027b.b(str, i15, g4, " \"<>^`{}|/\\?#", true, false, false, false, 240);
                                if (!b2.equals(".") && !b2.equalsIgnoreCase("%2e")) {
                                    if (b2.equals("..") || b2.equalsIgnoreCase("%2e.") || b2.equalsIgnoreCase(".%2e") || b2.equalsIgnoreCase("%2e%2e")) {
                                        if (((java.lang.String) arrayList3.remove(arrayList3.size() - 1)).length() != 0 || arrayList3.isEmpty()) {
                                            arrayList3.add("");
                                        } else {
                                            arrayList3.set(arrayList3.size() - 1, "");
                                        }
                                        i15 = !z3 ? g4 + 1 : g4;
                                    } else {
                                        if (((java.lang.CharSequence) arrayList3.get(arrayList3.size() - 1)).length() == 0) {
                                            arrayList3.set(arrayList3.size() - 1, b2);
                                        } else {
                                            arrayList3.add(b2);
                                        }
                                        if (z3) {
                                            arrayList3.add("");
                                        }
                                    }
                                }
                                if (!z3) {
                                }
                            }
                        }
                        if (g3 < i12 && str.charAt(g3) == '?') {
                            int f2 = J1.b.f(str, '#', g3, i12);
                            this.f758g = I1.C0027b.f(I1.C0027b.b(str, g3 + 1, f2, " \"'<>#", true, false, true, false, 208));
                            g3 = f2;
                        }
                        if (g3 < i12 || str.charAt(g3) != '#') {
                            return;
                        }
                        this.f759h = I1.C0027b.b(str, g3 + 1, i12, "", true, false, false, true, 176);
                        return;
                    }
                }
                i5 = n2 + i4;
                boolean z4 = false;
                boolean z5 = false;
                while (true) {
                    g2 = J1.b.g(str, i5, o2, "@/\\?#");
                    charAt = g2 == o2 ? str.charAt(g2) : c5;
                    if (charAt == c5 || charAt == c7 || charAt == c2 || charAt == c3 || charAt == '?') {
                        break;
                    }
                    if (charAt == '@') {
                        if (z4) {
                            arrayList2 = arrayList4;
                            str2 = str7;
                            str3 = str6;
                            str4 = str5;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append(this.f754c);
                            sb2.append("%40");
                            i11 = g2;
                            sb2.append(I1.C0027b.b(str, i5, g2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240));
                            this.f754c = sb2.toString();
                        } else {
                            int f3 = J1.b.f(str, ':', i5, g2);
                            arrayList2 = arrayList4;
                            str2 = str7;
                            str3 = str6;
                            str4 = str5;
                            java.lang.String b3 = I1.C0027b.b(str, i5, f3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                            if (z5) {
                                b3 = this.f753b + "%40" + b3;
                            }
                            this.f753b = b3;
                            if (f3 != g2) {
                                this.f754c = I1.C0027b.b(str, f3 + 1, g2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                                z4 = true;
                            }
                            i11 = g2;
                            z5 = true;
                        }
                        i5 = i11 + 1;
                        str7 = str2;
                        arrayList4 = arrayList2;
                        str6 = str3;
                        str5 = str4;
                        c2 = '/';
                        c7 = '#';
                        c3 = '\\';
                        c5 = 65535;
                    }
                }
                arrayList = arrayList4;
                java.lang.String str8 = str7;
                java.lang.String str9 = str6;
                java.lang.String str10 = str5;
                i6 = i5;
                while (true) {
                    if (i6 >= g2) {
                        i7 = g2;
                        break;
                    }
                    char charAt6 = str.charAt(i6);
                    if (charAt6 == '[') {
                        do {
                            i6++;
                            if (i6 >= g2) {
                                break;
                            }
                        } while (str.charAt(i6) != ']');
                    } else if (charAt6 == ':') {
                        i7 = i6;
                        break;
                    }
                    i6++;
                }
                i8 = i7 + 1;
                if (i8 >= g2) {
                    this.f755d = u0.AbstractC0995a.E(I1.C0027b.e(str, i5, i7, false, 4));
                    i9 = o2;
                    try {
                        i10 = java.lang.Integer.parseInt(I1.C0027b.b(str, i8, g2, "", false, false, false, false, 248));
                        if (1 <= i10) {
                        }
                    } catch (java.lang.NumberFormatException unused) {
                    }
                    i10 = -1;
                    this.f756e = i10;
                    if (i10 == -1) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Invalid URL port: \"");
                        java.lang.String substring2 = str.substring(i8, g2);
                        kotlin.jvm.internal.i.d(substring2, str8);
                        sb3.append(substring2);
                        sb3.append('\"');
                        throw new java.lang.IllegalArgumentException(sb3.toString().toString());
                    }
                    c4 = '\"';
                    z2 = false;
                } else {
                    c4 = '\"';
                    i9 = o2;
                    z2 = false;
                    this.f755d = u0.AbstractC0995a.E(I1.C0027b.e(str, i5, i7, false, 4));
                    java.lang.String str11 = this.f752a;
                    kotlin.jvm.internal.i.b(str11);
                    this.f756e = str11.equals(str10) ? 80 : str11.equals(str9) ? 443 : -1;
                }
                if (this.f755d != null) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Invalid URL host: \"");
                    java.lang.String substring3 = str.substring(i5, i7);
                    kotlin.jvm.internal.i.d(substring3, str8);
                    sb4.append(substring3);
                    sb4.append(c4);
                    throw new java.lang.IllegalArgumentException(sb4.toString().toString());
                }
                n2 = g2;
                i12 = i9;
                g3 = J1.b.g(str, n2, i12, "?#");
                if (n2 != g3) {
                }
                if (g3 < i12) {
                    int f22 = J1.b.f(str, '#', g3, i12);
                    this.f758g = I1.C0027b.f(I1.C0027b.b(str, g3 + 1, f22, " \"'<>#", true, false, true, false, 208));
                    g3 = f22;
                }
                if (g3 < i12) {
                    return;
                } else {
                    return;
                }
            }
        }
        i2 = -1;
        java.lang.String str52 = "http";
        java.lang.String str62 = "https";
        java.lang.String str72 = "this as java.lang.String…ing(startIndex, endIndex)";
        if (i2 == -1) {
        }
        i3 = n2;
        i4 = 0;
        while (true) {
            c2 = '/';
            c3 = '\\';
            if (i3 < o2) {
            }
            i4++;
            i3 = i13;
        }
        java.util.ArrayList arrayList42 = this.f757f;
        char c72 = '#';
        if (i4 < 2) {
            if (kotlin.jvm.internal.i.a(oVar.f761a, this.f752a)) {
            }
        }
        i5 = n2 + i4;
        boolean z42 = false;
        boolean z52 = false;
        while (true) {
            g2 = J1.b.g(str, i5, o2, "@/\\?#");
            if (g2 == o2) {
            }
            if (charAt == c5) {
                break;
            } else {
                break;
            }
        }
        arrayList = arrayList42;
        java.lang.String str82 = str72;
        java.lang.String str92 = str62;
        java.lang.String str102 = str52;
        i6 = i5;
        while (true) {
            if (i6 >= g2) {
            }
            i6++;
        }
        i8 = i7 + 1;
        if (i8 >= g2) {
        }
        if (this.f755d != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0089, code lost:
    
        if (r1 != r3) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String str = this.f752a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.f753b.length() > 0 || this.f754c.length() > 0) {
            sb.append(this.f753b);
            if (this.f754c.length() > 0) {
                sb.append(':');
                sb.append(this.f754c);
            }
            sb.append('@');
        }
        java.lang.String str2 = this.f755d;
        if (str2 != null) {
            if (y1.g.L(str2, ':')) {
                sb.append('[');
                sb.append(this.f755d);
                sb.append(']');
            } else {
                sb.append(this.f755d);
            }
        }
        int i2 = -1;
        if (this.f756e != -1 || this.f752a != null) {
            int b2 = b();
            java.lang.String str3 = this.f752a;
            if (str3 != null) {
                if (str3.equals("http")) {
                    i2 = 80;
                } else if (str3.equals("https")) {
                    i2 = 443;
                }
            }
            sb.append(':');
            sb.append(b2);
        }
        java.util.ArrayList arrayList = this.f757f;
        kotlin.jvm.internal.i.e(arrayList, "<this>");
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            sb.append('/');
            sb.append((java.lang.String) arrayList.get(i3));
        }
        if (this.f758g != null) {
            sb.append('?');
            java.util.ArrayList arrayList2 = this.f758g;
            kotlin.jvm.internal.i.b(arrayList2);
            v1.C1000a C2 = u0.AbstractC0995a.C(u0.AbstractC0995a.F(0, arrayList2.size()), 2);
            int i4 = C2.f8387a;
            int i5 = C2.f8388b;
            int i6 = C2.f8389c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    int i7 = i4 + i6;
                    java.lang.String str4 = (java.lang.String) arrayList2.get(i4);
                    java.lang.String str5 = (java.lang.String) arrayList2.get(i4 + 1);
                    if (i4 > 0) {
                        sb.append('&');
                    }
                    sb.append(str4);
                    if (str5 != null) {
                        sb.append('=');
                        sb.append(str5);
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 = i7;
                }
            }
        }
        if (this.f759h != null) {
            sb.append('#');
            sb.append(this.f759h);
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
