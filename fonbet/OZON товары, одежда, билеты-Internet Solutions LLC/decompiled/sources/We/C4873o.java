package We;

import Kk.C3532b;
import ef.C6353c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;

/* renamed from: We.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4873o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f33787a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f33788b;

    /* renamed from: c, reason: collision with root package name */
    private final long f33789c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f33790d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f33791e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f33792f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f33793g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f33794h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f33795i;

    /* renamed from: n, reason: collision with root package name */
    public static final b f33786n = new b();

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f33782j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f33783k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f33784l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f33785m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: We.o$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f33796a;

        /* renamed from: b, reason: collision with root package name */
        private String f33797b;

        /* renamed from: c, reason: collision with root package name */
        private long f33798c = 253402300799999L;

        /* renamed from: d, reason: collision with root package name */
        private String f33799d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f33800e;

        @NotNull
        public final C4873o a() {
            String str = this.f33796a;
            if (str == null) {
                throw new NullPointerException("builder.name == null");
            }
            String str2 = this.f33797b;
            if (str2 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long j11 = this.f33798c;
            String str3 = this.f33799d;
            if (str3 != null) {
                return new C4873o(str, str2, j11, str3, "/", false, false, this.f33800e, false);
            }
            throw new NullPointerException("builder.domain == null");
        }

        @NotNull
        public final void b(@NotNull String domain) {
            Intrinsics.checkNotNullParameter(domain, "domain");
            String b11 = Ye.a.b(domain);
            if (b11 == null) {
                throw new IllegalArgumentException("unexpected domain: ".concat(domain));
            }
            this.f33799d = b11;
        }

        @NotNull
        public final void c(long j11) {
            if (j11 <= 0) {
                j11 = Long.MIN_VALUE;
            }
            if (j11 > 253402300799999L) {
                j11 = 253402300799999L;
            }
            this.f33798c = j11;
            this.f33800e = true;
        }

        @NotNull
        public final void d(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (!Intrinsics.d(kotlin.text.h.z0(name).toString(), name)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.f33796a = name;
        }

        @NotNull
        public final void e(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (!Intrinsics.d(kotlin.text.h.z0(value).toString(), value)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.f33797b = value;
        }
    }

    /* renamed from: We.o$b */
    public static final class b {
        private static int a(String str, int i11, int i12, boolean z11) {
            while (i11 < i12) {
                char charAt = str.charAt(i11);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z11)) {
                    return i11;
                }
                i11++;
            }
            return i12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static List b(@NotNull A url, @NotNull z headers) {
            long j11;
            int i11;
            String str;
            C4873o c4873o;
            PublicSuffixDatabase publicSuffixDatabase;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            List<String> l11 = headers.l("Set-Cookie");
            int size = l11.size();
            int i12 = 0;
            int i13 = 0;
            ArrayList arrayList = null;
            while (i13 < size) {
                String setCookie = l11.get(i13);
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(setCookie, "setCookie");
                long currentTimeMillis = System.currentTimeMillis();
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(setCookie, "setCookie");
                char c11 = ';';
                int i14 = Ye.b.i(setCookie, ';', i12, i12, 6);
                char c12 = '=';
                int i15 = Ye.b.i(setCookie, '=', i12, i14, 2);
                if (i15 != i14) {
                    String D11 = Ye.b.D(i12, i15, setCookie);
                    if (D11.length() != 0 && Ye.b.o(D11) == -1) {
                        String D12 = Ye.b.D(i15 + 1, i14, setCookie);
                        if (Ye.b.o(D12) == -1) {
                            int i16 = i14 + 1;
                            int length = setCookie.length();
                            boolean z11 = 1;
                            int i17 = i12;
                            int i18 = i17;
                            int i19 = i18;
                            boolean z12 = true;
                            long j12 = -1;
                            long j13 = 253402300799999L;
                            String str2 = null;
                            String str3 = null;
                            while (true) {
                                if (i16 < length) {
                                    int h11 = Ye.b.h(setCookie, c11, i16, length);
                                    int h12 = Ye.b.h(setCookie, c12, i16, h11);
                                    String D13 = Ye.b.D(i16, h12, setCookie);
                                    String D14 = h12 < h11 ? Ye.b.D(h12 + 1, h11, setCookie) : "";
                                    if (kotlin.text.h.D(D13, "expires", z11)) {
                                        try {
                                            j13 = c(D14.length(), D14);
                                            i18 = z11;
                                        } catch (NumberFormatException | IllegalArgumentException unused) {
                                        }
                                    } else if (kotlin.text.h.D(D13, "max-age", z11)) {
                                        try {
                                            j12 = Long.parseLong(D14);
                                            if (j12 <= 0) {
                                                j12 = Long.MIN_VALUE;
                                            }
                                        } catch (NumberFormatException e11) {
                                            if (!new Regex("-?\\d+").f(D14)) {
                                                throw e11;
                                            }
                                            j12 = kotlin.text.h.e0(D14, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                        }
                                        i18 = 1;
                                    } else if (kotlin.text.h.D(D13, "domain", true)) {
                                        if (kotlin.text.h.A(D14, ".", false)) {
                                            throw new IllegalArgumentException("Failed requirement.");
                                        }
                                        String b11 = Ye.a.b(kotlin.text.h.S(D14, "."));
                                        if (b11 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        str2 = b11;
                                        z12 = false;
                                    } else if (kotlin.text.h.D(D13, "path", true)) {
                                        str3 = D14;
                                    } else if (kotlin.text.h.D(D13, "secure", true)) {
                                        i19 = 1;
                                    } else if (kotlin.text.h.D(D13, "httponly", true)) {
                                        i17 = 1;
                                    }
                                    i16 = h11 + 1;
                                    c11 = ';';
                                    z11 = 1;
                                    c12 = '=';
                                } else {
                                    if (j12 == Long.MIN_VALUE) {
                                        j11 = Long.MIN_VALUE;
                                    } else if (j12 != -1) {
                                        long j14 = currentTimeMillis + (j12 <= 9223372036854775L ? j12 * 1000 : Long.MAX_VALUE);
                                        j11 = (j14 < currentTimeMillis || j14 > 253402300799999L) ? 253402300799999L : j14;
                                    } else {
                                        j11 = j13;
                                    }
                                    String h13 = url.h();
                                    if (str2 == null) {
                                        str2 = h13;
                                    } else if (!Intrinsics.d(h13, str2) && (!kotlin.text.h.A(h13, str2, false) || h13.charAt((h13.length() - str2.length()) - 1) != '.' || Ye.b.b(h13))) {
                                        i11 = 0;
                                    }
                                    if (h13.length() != str2.length()) {
                                        publicSuffixDatabase = PublicSuffixDatabase.f78418g;
                                        if (publicSuffixDatabase.b(str2) == null) {
                                            c4873o = null;
                                            i11 = 0;
                                        }
                                    }
                                    String str4 = "/";
                                    String str5 = str3;
                                    i11 = 0;
                                    if (str5 == null || !kotlin.text.h.e0(str5, "/", false)) {
                                        String c13 = url.c();
                                        int N11 = kotlin.text.h.N('/', 0, 6, c13);
                                        if (N11 != 0) {
                                            str4 = c13.substring(0, N11);
                                            Intrinsics.checkNotNullExpressionValue(str4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                        }
                                        str = str4;
                                    } else {
                                        str = str5;
                                    }
                                    c4873o = new C4873o(D11, D12, j11, str2, str, i19, i17, i18, z12);
                                }
                            }
                        }
                    }
                }
                i11 = i12;
                c4873o = null;
                if (c4873o != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c4873o);
                }
                i13++;
                i12 = i11;
            }
            if (arrayList == null) {
                return kotlin.collections.K.f71697a;
            }
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(unmodifiableList, "Collections.unmodifiableList(cookies)");
            return unmodifiableList;
        }

        private static long c(int i11, String str) {
            int a11 = a(str, 0, i11, false);
            Matcher matcher = C4873o.f33785m.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            while (a11 < i11) {
                int a12 = a(str, a11 + 1, i11, true);
                matcher.region(a11, a12);
                if (i13 == -1 && matcher.usePattern(C4873o.f33785m).matches()) {
                    String group = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group, "matcher.group(1)");
                    i13 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(group2, "matcher.group(2)");
                    i16 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(group3, "matcher.group(3)");
                    i17 = Integer.parseInt(group3);
                } else if (i14 == -1 && matcher.usePattern(C4873o.f33784l).matches()) {
                    String group4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group4, "matcher.group(1)");
                    i14 = Integer.parseInt(group4);
                } else if (i15 == -1 && matcher.usePattern(C4873o.f33783k).matches()) {
                    String group5 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
                    if (group5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase = group5.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    String pattern = C4873o.f33783k.pattern();
                    Intrinsics.checkNotNullExpressionValue(pattern, "MONTH_PATTERN.pattern()");
                    i15 = kotlin.text.h.J(pattern, lowerCase, 0, false, 6) / 4;
                } else if (i12 == -1 && matcher.usePattern(C4873o.f33782j).matches()) {
                    String group6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group6, "matcher.group(1)");
                    i12 = Integer.parseInt(group6);
                }
                a11 = a(str, a12 + 1, i11, false);
            }
            if (70 <= i12 && 99 >= i12) {
                i12 += 1900;
            }
            if (i12 >= 0 && 69 >= i12) {
                i12 += 2000;
            }
            if (!(i12 >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i15 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i14 || 31 < i14) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i13 < 0 || 23 < i13) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i16 < 0 || 59 < i16) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i17 < 0 || 59 < i17) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Ye.b.f34904e);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, i15 - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i16);
            gregorianCalendar.set(13, i17);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public C4873o(String str, String str2, long j11, String str3, String str4, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f33787a = str;
        this.f33788b = str2;
        this.f33789c = j11;
        this.f33790d = str3;
        this.f33791e = str4;
        this.f33792f = z11;
        this.f33793g = z12;
        this.f33794h = z13;
        this.f33795i = z14;
    }

    public final long e() {
        return this.f33789c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4873o)) {
            return false;
        }
        C4873o c4873o = (C4873o) obj;
        return Intrinsics.d(c4873o.f33787a, this.f33787a) && Intrinsics.d(c4873o.f33788b, this.f33788b) && c4873o.f33789c == this.f33789c && Intrinsics.d(c4873o.f33790d, this.f33790d) && Intrinsics.d(c4873o.f33791e, this.f33791e) && c4873o.f33792f == this.f33792f && c4873o.f33793g == this.f33793g && c4873o.f33794h == this.f33794h && c4873o.f33795i == this.f33795i;
    }

    @NotNull
    public final String f() {
        return this.f33787a;
    }

    public final boolean g() {
        return this.f33794h;
    }

    @NotNull
    public final String h(boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f33787a);
        sb2.append('=');
        sb2.append(this.f33788b);
        if (this.f33794h) {
            long j11 = this.f33789c;
            if (j11 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(C6353c.b(new Date(j11)));
            }
        }
        if (!this.f33795i) {
            sb2.append("; domain=");
            if (z11) {
                sb2.append(".");
            }
            sb2.append(this.f33790d);
        }
        sb2.append("; path=");
        sb2.append(this.f33791e);
        if (this.f33792f) {
            sb2.append("; secure");
        }
        if (this.f33793g) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString()");
        return sb3;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        return Boolean.hashCode(this.f33795i) + C3532b.a(C3532b.a(C3532b.a(G.g.a(G.g.a(Pk0.c.a(G.g.a(G.g.a(527, 31, this.f33787a), 31, this.f33788b), 31, this.f33789c), 31, this.f33790d), 31, this.f33791e), 31, this.f33792f), 31, this.f33793g), 31, this.f33794h);
    }

    @NotNull
    public final String i() {
        return this.f33788b;
    }

    @NotNull
    public final String toString() {
        return h(false);
    }
}
