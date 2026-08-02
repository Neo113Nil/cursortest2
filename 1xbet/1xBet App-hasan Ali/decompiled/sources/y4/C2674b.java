package y4;

import L4.C0226i;
import a.AbstractC0444a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import l4.C2060b;
import o4.AbstractC2227e;
import o4.AbstractC2234l;

/* renamed from: y4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2674b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2674b f21300a = new C2674b();

    /* renamed from: b, reason: collision with root package name */
    public static final C2674b f21301b = new C2674b();

    /* renamed from: c, reason: collision with root package name */
    public static final C2674b f21302c = new C2674b();

    public static final h a(C2674b c2674b, String str) {
        h hVar = new h(str);
        h.f21321d.put(str, hVar);
        return hVar;
    }

    public static String b(int i, int i5, int i6, String str, String str2) {
        int i7 = (i6 & 1) != 0 ? 0 : i;
        int length = (i6 & 2) != 0 ? str.length() : i5;
        boolean z3 = (i6 & 8) == 0;
        boolean z5 = (i6 & 16) == 0;
        boolean z6 = (i6 & 32) == 0;
        boolean z7 = (i6 & 64) == 0;
        kotlin.jvm.internal.l.f("<this>", str);
        int i8 = i7;
        while (i8 < length) {
            int codePointAt = str.codePointAt(i8);
            int i9 = 32;
            int i10 = 128;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z7) || AbstractC2227e.A0(str2, (char) codePointAt) || ((codePointAt == 37 && (!z3 || (z5 && !d(i8, length, str)))) || (codePointAt == 43 && z6)))) {
                C0226i c0226i = new C0226i();
                c0226i.T(i7, i8, str);
                C0226i c0226i2 = null;
                while (i8 < length) {
                    int codePointAt2 = str.codePointAt(i8);
                    if (!z3 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z6) {
                            c0226i.U(z3 ? "+" : "%2B");
                        } else if (codePointAt2 < i9 || codePointAt2 == 127 || ((codePointAt2 >= i10 && !z7) || AbstractC2227e.A0(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z3 || (z5 && !d(i8, length, str)))))) {
                            if (c0226i2 == null) {
                                c0226i2 = new C0226i();
                            }
                            c0226i2.V(codePointAt2);
                            while (!c0226i2.l()) {
                                byte s2 = c0226i2.s();
                                c0226i.P(37);
                                char[] cArr = n.f21361k;
                                c0226i.P(cArr[((s2 & 255) >> 4) & 15]);
                                c0226i.P(cArr[s2 & 15]);
                            }
                        } else {
                            c0226i.V(codePointAt2);
                        }
                    }
                    i8 += Character.charCount(codePointAt2);
                    i9 = 32;
                    i10 = 128;
                }
                return c0226i.I();
            }
            i8 += Character.charCount(codePointAt);
        }
        String substring = str.substring(i7, length);
        kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", substring);
        return substring;
    }

    public static boolean d(int i, int i5, String str) {
        int i6 = i + 2;
        return i6 < i5 && str.charAt(i) == '%' && z4.b.q(str.charAt(i + 1)) != -1 && z4.b.q(str.charAt(i6)) != -1;
    }

    public static String e(int i, int i5, int i6, String str) {
        int i7;
        if ((i6 & 1) != 0) {
            i = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        boolean z3 = (i6 & 4) == 0;
        kotlin.jvm.internal.l.f("<this>", str);
        int i8 = i;
        while (i8 < i5) {
            char charAt = str.charAt(i8);
            if (charAt == '%' || (charAt == '+' && z3)) {
                C0226i c0226i = new C0226i();
                c0226i.T(i, i8, str);
                while (i8 < i5) {
                    int codePointAt = str.codePointAt(i8);
                    if (codePointAt != 37 || (i7 = i8 + 2) >= i5) {
                        if (codePointAt == 43 && z3) {
                            c0226i.P(32);
                            i8++;
                        }
                        c0226i.V(codePointAt);
                        i8 += Character.charCount(codePointAt);
                    } else {
                        int q5 = z4.b.q(str.charAt(i8 + 1));
                        int q6 = z4.b.q(str.charAt(i7));
                        if (q5 != -1 && q6 != -1) {
                            c0226i.P((q5 << 4) + q6);
                            i8 = Character.charCount(codePointAt) + i7;
                        }
                        c0226i.V(codePointAt);
                        i8 += Character.charCount(codePointAt);
                    }
                }
                return c0226i.I();
            }
            i8++;
        }
        String substring = str.substring(i, i5);
        kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", substring);
        return substring;
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int F02 = AbstractC2227e.F0(str, '&', i, 4);
            if (F02 == -1) {
                F02 = str.length();
            }
            int F03 = AbstractC2227e.F0(str, '=', i, 4);
            if (F03 == -1 || F03 > F02) {
                String substring = str.substring(i, F02);
                kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", substring);
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i, F03);
                kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", substring2);
                arrayList.add(substring2);
                String substring3 = str.substring(F03 + 1, F02);
                kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", substring3);
                arrayList.add(substring3);
            }
            i = F02 + 1;
        }
        return arrayList;
    }

    public static void g(ArrayList arrayList, StringBuilder sb) {
        kotlin.jvm.internal.l.f("<this>", arrayList);
        C2060b c02 = AbstractC0444a.c0(AbstractC0444a.f0(0, arrayList.size()), 2);
        int i = c02.f17851k;
        int i5 = c02.f17852l;
        int i6 = c02.f17853m;
        if ((i6 <= 0 || i > i5) && (i6 >= 0 || i5 > i)) {
            return;
        }
        while (true) {
            String str = (String) arrayList.get(i);
            String str2 = (String) arrayList.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i == i5) {
                return;
            } else {
                i += i6;
            }
        }
    }

    public synchronized h c(String str) {
        h hVar;
        String str2;
        try {
            kotlin.jvm.internal.l.f("javaName", str);
            LinkedHashMap linkedHashMap = h.f21321d;
            hVar = (h) linkedHashMap.get(str);
            if (hVar == null) {
                if (AbstractC2234l.x0(str, "TLS_", false)) {
                    String substring = str.substring(4);
                    kotlin.jvm.internal.l.e("this as java.lang.String).substring(startIndex)", substring);
                    str2 = "SSL_".concat(substring);
                } else if (AbstractC2234l.x0(str, "SSL_", false)) {
                    String substring2 = str.substring(4);
                    kotlin.jvm.internal.l.e("this as java.lang.String).substring(startIndex)", substring2);
                    str2 = "TLS_".concat(substring2);
                } else {
                    str2 = str;
                }
                hVar = (h) linkedHashMap.get(str2);
                if (hVar == null) {
                    hVar = new h(str);
                }
                linkedHashMap.put(str, hVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return hVar;
    }
}
