package We;

import C.o0;
import Hj.C3143a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import g.C6594f;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;

/* loaded from: classes6.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f33516a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f33517b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f33518c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f33519d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f33520e;

    /* renamed from: f, reason: collision with root package name */
    private final int f33521f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ArrayList f33522g;

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList f33523h;

    /* renamed from: i, reason: collision with root package name */
    private final String f33524i;

    /* renamed from: j, reason: collision with root package name */
    private final String f33525j;

    /* renamed from: l, reason: collision with root package name */
    public static final b f33515l = new b();

    /* renamed from: k, reason: collision with root package name */
    private static final char[] f33514k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f33526a;

        /* renamed from: d, reason: collision with root package name */
        private String f33529d;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final ArrayList f33531f;

        /* renamed from: g, reason: collision with root package name */
        private ArrayList f33532g;

        /* renamed from: h, reason: collision with root package name */
        private String f33533h;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private String f33527b = "";

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private String f33528c = "";

        /* renamed from: e, reason: collision with root package name */
        private int f33530e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f33531f = arrayList;
            arrayList.add("");
        }

        private final void n(int i11, int i12, String str, boolean z11, boolean z12) {
            String a11 = b.a(A.f33515l, str, i11, i12, " \"<>^`{}|/\\?#", z12, 240);
            if (Intrinsics.d(a11, ".") || kotlin.text.h.D(a11, "%2e", true)) {
                return;
            }
            boolean d11 = Intrinsics.d(a11, "..");
            ArrayList arrayList = this.f33531f;
            if (d11 || kotlin.text.h.D(a11, "%2e.", true) || kotlin.text.h.D(a11, ".%2e", true) || kotlin.text.h.D(a11, "%2e%2e", true)) {
                if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                    arrayList.add("");
                    return;
                } else {
                    arrayList.set(arrayList.size() - 1, "");
                    return;
                }
            }
            if (((CharSequence) o0.b(1, arrayList)).length() == 0) {
                arrayList.set(arrayList.size() - 1, a11);
            } else {
                arrayList.add(a11);
            }
            if (z11) {
                arrayList.add("");
            }
        }

        private final void r(int i11, int i12, String str) {
            if (i11 == i12) {
                return;
            }
            char charAt = str.charAt(i11);
            ArrayList arrayList = this.f33531f;
            if (charAt == '/' || charAt == '\\') {
                arrayList.clear();
                arrayList.add("");
                i11++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            int i13 = i11;
            while (i13 < i12) {
                int g10 = Ye.b.g(i13, i12, str, "/\\");
                boolean z11 = g10 < i12;
                String str2 = str;
                n(i13, g10, str2, z11, true);
                if (z11) {
                    g10++;
                }
                i13 = g10;
                str = str2;
            }
        }

        @NotNull
        public final void A() {
            Intrinsics.checkNotNullParameter("", "username");
            this.f33527b = b.a(A.f33515l, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, 251);
        }

        @NotNull
        public final void a(@NotNull String encodedName, String str) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (this.f33532g == null) {
                this.f33532g = new ArrayList();
            }
            ArrayList arrayList = this.f33532g;
            Intrinsics.f(arrayList);
            b bVar = A.f33515l;
            arrayList.add(b.a(bVar, encodedName, 0, 0, " \"'<>#&=", true, 211));
            ArrayList arrayList2 = this.f33532g;
            Intrinsics.f(arrayList2);
            arrayList2.add(str != null ? b.a(bVar, str, 0, 0, " \"'<>#&=", true, 211) : null);
        }

        @NotNull
        public final void b(@NotNull String pathSegment) {
            Intrinsics.checkNotNullParameter(pathSegment, "pathSegment");
            n(0, pathSegment.length(), pathSegment, false, false);
        }

        @NotNull
        public final void c(@NotNull String pathSegments) {
            Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
            int i11 = 0;
            while (true) {
                int g10 = Ye.b.g(i11, pathSegments.length(), pathSegments, "/\\");
                String str = pathSegments;
                n(i11, g10, str, g10 < pathSegments.length(), false);
                i11 = g10 + 1;
                if (i11 > str.length()) {
                    return;
                } else {
                    pathSegments = str;
                }
            }
        }

        @NotNull
        public final void d(@NotNull String name, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (this.f33532g == null) {
                this.f33532g = new ArrayList();
            }
            ArrayList arrayList = this.f33532g;
            Intrinsics.f(arrayList);
            b bVar = A.f33515l;
            arrayList.add(b.a(bVar, name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, 219));
            ArrayList arrayList2 = this.f33532g;
            Intrinsics.f(arrayList2);
            arrayList2.add(str != null ? b.a(bVar, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, 219) : null);
        }

        @NotNull
        public final A e() {
            ArrayList arrayList;
            String str = this.f33526a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            b bVar = A.f33515l;
            String f7 = b.f(bVar, this.f33527b, 0, 0, 7);
            String f11 = b.f(bVar, this.f33528c, 0, 0, 7);
            String str2 = this.f33529d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int i11 = this.f33530e;
            if (i11 == -1) {
                String str3 = this.f33526a;
                Intrinsics.f(str3);
                bVar.getClass();
                i11 = b.b(str3);
            }
            ArrayList arrayList2 = this.f33531f;
            ArrayList arrayList3 = new ArrayList(C7714v.z(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(b.f(A.f33515l, (String) it.next(), 0, 0, 7));
            }
            ArrayList<String> arrayList4 = this.f33532g;
            if (arrayList4 != null) {
                arrayList = new ArrayList(C7714v.z(arrayList4, 10));
                for (String str4 : arrayList4) {
                    arrayList.add(str4 != null ? b.f(A.f33515l, str4, 0, 0, 3) : null);
                }
            } else {
                arrayList = null;
            }
            String str5 = this.f33533h;
            return new A(str, f7, f11, str2, i11, arrayList3, arrayList, str5 != null ? b.f(A.f33515l, str5, 0, 0, 7) : null, toString());
        }

        @NotNull
        public final void f() {
            Intrinsics.checkNotNullParameter("/abt/result-mobile", "encodedPath");
            if (!kotlin.text.h.e0("/abt/result-mobile", "/", false)) {
                throw new IllegalArgumentException("unexpected encodedPath: ".concat("/abt/result-mobile").toString());
            }
            r(0, 18, "/abt/result-mobile");
        }

        @NotNull
        public final void g(String str) {
            String a11;
            this.f33532g = (str == null || (a11 = b.a(A.f33515l, str, 0, 0, " \"'<>#", true, 211)) == null) ? null : b.g(a11);
        }

        @NotNull
        public final void h() {
            this.f33533h = null;
        }

        @NotNull
        public final ArrayList i() {
            return this.f33531f;
        }

        @NotNull
        public final void j(@NotNull String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String b11 = Ye.a.b(b.f(A.f33515l, host, 0, 0, 7));
            if (b11 == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(host));
            }
            this.f33529d = b11;
        }

        /* JADX WARN: Code restructure failed: missing block: B:116:0x0208, code lost:
        
            if (65535 < r1) goto L122;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
        
            if (r7 == ':') goto L43;
         */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void k(A a11, @NotNull String str) {
            int i11;
            char c11;
            char c12;
            int g10;
            int i12;
            int i13;
            int i14;
            char charAt;
            String input = str;
            Intrinsics.checkNotNullParameter(input, "input");
            byte[] bArr = Ye.b.f34900a;
            int p11 = Ye.b.p(0, input.length(), input);
            int q11 = Ye.b.q(p11, input.length(), input);
            if (q11 - p11 >= 2) {
                char charAt2 = input.charAt(p11);
                if ((Intrinsics.i(charAt2, 97) >= 0 && Intrinsics.i(charAt2, 122) <= 0) || (Intrinsics.i(charAt2, 65) >= 0 && Intrinsics.i(charAt2, 90) <= 0)) {
                    i11 = p11 + 1;
                    while (true) {
                        if (i11 >= q11) {
                            break;
                        }
                        char charAt3 = input.charAt(i11);
                        if (('a' <= charAt3 && 'z' >= charAt3) || (('A' <= charAt3 && 'Z' >= charAt3) || (('0' <= charAt3 && '9' >= charAt3) || charAt3 == '+' || charAt3 == '-' || charAt3 == '.'))) {
                            i11++;
                        }
                    }
                }
            }
            i11 = -1;
            if (i11 != -1) {
                if (kotlin.text.h.d0(p11, input, "https:", true)) {
                    this.f33526a = "https";
                    p11 += 6;
                } else {
                    if (!kotlin.text.h.d0(p11, input, "http:", true)) {
                        StringBuilder sb2 = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                        String substring = input.substring(0, i11);
                        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb2.append(substring);
                        sb2.append("'");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.f33526a = "http";
                    p11 += 5;
                }
            } else {
                if (a11 == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.f33526a = a11.u();
            }
            int i15 = p11;
            int i16 = 0;
            while (true) {
                c11 = '/';
                c12 = '\\';
                if (i15 >= q11 || !((charAt = input.charAt(i15)) == '\\' || charAt == '/')) {
                    break;
                }
                i16++;
                i15++;
            }
            char c13 = '#';
            if (i16 >= 2 || a11 == null || !Intrinsics.d(a11.u(), this.f33526a)) {
                boolean z11 = false;
                boolean z12 = false;
                int i17 = p11 + i16;
                while (true) {
                    g10 = Ye.b.g(i17, q11, input, "@/\\?#");
                    char charAt4 = g10 != q11 ? input.charAt(g10) : (char) 65535;
                    if (charAt4 == 65535 || charAt4 == c13 || charAt4 == c11 || charAt4 == c12 || charAt4 == '?') {
                        break;
                    }
                    if (charAt4 == '@') {
                        if (z11) {
                            i14 = g10;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f33528c);
                            sb3.append("%40");
                            input = str;
                            sb3.append(b.a(A.f33515l, input, i17, i14, " \"':;<=>@[]^`{}|/\\?#", true, 240));
                            this.f33528c = sb3.toString();
                        } else {
                            int h11 = Ye.b.h(input, ':', i17, g10);
                            b bVar = A.f33515l;
                            String a12 = b.a(bVar, input, i17, h11, " \"':;<=>@[]^`{}|/\\?#", true, 240);
                            if (z12) {
                                a12 = C6594f.a(this.f33527b, "%40", a12, new StringBuilder());
                            }
                            this.f33527b = a12;
                            if (h11 != g10) {
                                int i18 = h11 + 1;
                                i14 = g10;
                                this.f33528c = b.a(bVar, str, i18, i14, " \"':;<=>@[]^`{}|/\\?#", true, 240);
                                z11 = true;
                            } else {
                                i14 = g10;
                            }
                            input = str;
                            z12 = true;
                        }
                        i17 = i14 + 1;
                    }
                    c13 = '#';
                    c11 = '/';
                    c12 = '\\';
                }
                int i19 = i17;
                int i21 = i19;
                while (true) {
                    if (i21 < g10) {
                        char charAt5 = input.charAt(i21);
                        if (charAt5 == ':') {
                            i12 = i21;
                            break;
                        }
                        if (charAt5 == '[') {
                            do {
                                i21++;
                                if (i21 < g10) {
                                }
                            } while (input.charAt(i21) != ']');
                        }
                        i21++;
                    } else {
                        i12 = g10;
                        break;
                    }
                }
                int i22 = i12 + 1;
                if (i22 < g10) {
                    b bVar2 = A.f33515l;
                    this.f33529d = Ye.a.b(b.f(bVar2, input, i19, i12, 4));
                    try {
                        i13 = Integer.parseInt(b.a(bVar2, input, i22, g10, "", false, 248));
                        if (1 <= i13) {
                        }
                    } catch (NumberFormatException unused) {
                    }
                    i13 = -1;
                    this.f33530e = i13;
                    if (i13 == -1) {
                        StringBuilder sb4 = new StringBuilder("Invalid URL port: \"");
                        String substring2 = input.substring(i22, g10);
                        Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    this.f33529d = Ye.a.b(b.f(A.f33515l, input, i19, i12, 4));
                    String str2 = this.f33526a;
                    Intrinsics.f(str2);
                    this.f33530e = b.b(str2);
                }
                if (this.f33529d == null) {
                    StringBuilder sb5 = new StringBuilder("Invalid URL host: \"");
                    String substring3 = input.substring(i19, i12);
                    Intrinsics.checkNotNullExpressionValue(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                p11 = g10;
            } else {
                this.f33527b = a11.f();
                this.f33528c = a11.b();
                this.f33529d = a11.h();
                this.f33530e = a11.n();
                ArrayList arrayList = this.f33531f;
                arrayList.clear();
                arrayList.addAll(a11.d());
                if (p11 == q11 || input.charAt(p11) == '#') {
                    g(a11.e());
                }
            }
            int g11 = Ye.b.g(p11, q11, input, "?#");
            r(p11, g11, input);
            if (g11 < q11 && input.charAt(g11) == '?') {
                int h12 = Ye.b.h(input, '#', g11, q11);
                this.f33532g = b.g(b.a(A.f33515l, input, g11 + 1, h12, " \"'<>#", true, 208));
                g11 = h12;
            }
            if (g11 >= q11 || input.charAt(g11) != '#') {
                return;
            }
            this.f33533h = b.a(A.f33515l, input, g11 + 1, q11, "", true, 176);
        }

        @NotNull
        public final void l() {
            Intrinsics.checkNotNullParameter("", "password");
            this.f33528c = b.a(A.f33515l, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, 251);
        }

        @NotNull
        public final void m(int i11) {
            if (1 > i11 || 65535 < i11) {
                throw new IllegalArgumentException(Ej.b.a(i11, "unexpected port: ").toString());
            }
            this.f33530e = i11;
        }

        @NotNull
        public final void o() {
            this.f33532g = null;
        }

        @NotNull
        public final void p() {
            String str = this.f33529d;
            this.f33529d = str != null ? C3143a.g("[\"<>^`{|}]", str, "") : null;
            ArrayList arrayList = this.f33531f;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.set(i11, b.a(A.f33515l, (String) arrayList.get(i11), 0, 0, "[]", true, 227));
            }
            ArrayList arrayList2 = this.f33532g;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    String str2 = (String) arrayList2.get(i12);
                    arrayList2.set(i12, str2 != null ? b.a(A.f33515l, str2, 0, 0, "\\^`{|}", true, 195) : null);
                }
            }
            String str3 = this.f33533h;
            this.f33533h = str3 != null ? b.a(A.f33515l, str3, 0, 0, " \"#<>\\^`{|}", true, 163) : null;
        }

        @NotNull
        public final void q(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (this.f33532g == null) {
                return;
            }
            String a11 = b.a(A.f33515l, name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, 219);
            ArrayList arrayList = this.f33532g;
            Intrinsics.f(arrayList);
            kotlin.ranges.e m11 = kotlin.ranges.h.m(kotlin.ranges.h.j(arrayList.size() - 2, 0), 2);
            int f71842a = m11.getF71842a();
            int f71843b = m11.getF71843b();
            int f71844c = m11.getF71844c();
            if (f71844c >= 0) {
                if (f71842a > f71843b) {
                    return;
                }
            } else if (f71842a < f71843b) {
                return;
            }
            while (true) {
                ArrayList arrayList2 = this.f33532g;
                Intrinsics.f(arrayList2);
                if (Intrinsics.d(a11, (String) arrayList2.get(f71842a))) {
                    ArrayList arrayList3 = this.f33532g;
                    Intrinsics.f(arrayList3);
                    arrayList3.remove(f71842a + 1);
                    ArrayList arrayList4 = this.f33532g;
                    Intrinsics.f(arrayList4);
                    arrayList4.remove(f71842a);
                    ArrayList arrayList5 = this.f33532g;
                    Intrinsics.f(arrayList5);
                    if (arrayList5.isEmpty()) {
                        this.f33532g = null;
                        return;
                    }
                }
                if (f71842a == f71843b) {
                    return;
                } else {
                    f71842a += f71844c;
                }
            }
        }

        @NotNull
        public final void s(@NotNull String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (kotlin.text.h.D(scheme, "http", true)) {
                this.f33526a = "http";
            } else {
                if (!kotlin.text.h.D(scheme, "https", true)) {
                    throw new IllegalArgumentException(Nk.a.b("unexpected scheme: ", scheme));
                }
                this.f33526a = "https";
            }
        }

        public final void t(String str) {
            this.f33533h = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
        
            if (r1 != We.A.b.b(r3)) goto L32;
         */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String toString() {
            StringBuilder out = new StringBuilder();
            String str = this.f33526a;
            if (str != null) {
                out.append(str);
                out.append("://");
            } else {
                out.append("//");
            }
            if (this.f33527b.length() > 0 || this.f33528c.length() > 0) {
                out.append(this.f33527b);
                if (this.f33528c.length() > 0) {
                    out.append(':');
                    out.append(this.f33528c);
                }
                out.append('@');
            }
            String str2 = this.f33529d;
            if (str2 != null) {
                if (kotlin.text.h.u(str2, ':')) {
                    out.append('[');
                    out.append(this.f33529d);
                    out.append(']');
                } else {
                    out.append(this.f33529d);
                }
            }
            int i11 = this.f33530e;
            if (i11 != -1 || this.f33526a != null) {
                if (i11 == -1) {
                    b bVar = A.f33515l;
                    String str3 = this.f33526a;
                    Intrinsics.f(str3);
                    bVar.getClass();
                    i11 = b.b(str3);
                }
                String str4 = this.f33526a;
                if (str4 != null) {
                    A.f33515l.getClass();
                }
                out.append(':');
                out.append(i11);
            }
            b bVar2 = A.f33515l;
            ArrayList toPathString = this.f33531f;
            bVar2.getClass();
            Intrinsics.checkNotNullParameter(toPathString, "$this$toPathString");
            Intrinsics.checkNotNullParameter(out, "out");
            int size = toPathString.size();
            for (int i12 = 0; i12 < size; i12++) {
                out.append('/');
                out.append((String) toPathString.get(i12));
            }
            if (this.f33532g != null) {
                out.append('?');
                b bVar3 = A.f33515l;
                ArrayList arrayList = this.f33532g;
                Intrinsics.f(arrayList);
                bVar3.getClass();
                b.h(arrayList, out);
            }
            if (this.f33533h != null) {
                out.append('#');
                out.append(this.f33533h);
            }
            String sb2 = out.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }

        public final void u(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f33528c = str;
        }

        public final void v(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f33527b = str;
        }

        public final void w(String str) {
            this.f33529d = str;
        }

        public final void x(int i11) {
            this.f33530e = i11;
        }

        @NotNull
        public final void y(@NotNull String name, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            q(name);
            d(name, str);
        }

        public final void z(String str) {
            this.f33526a = str;
        }
    }

    public static final class b {
        public static String a(b bVar, String canonicalize, int i11, int i12, String encodeSet, boolean z11, int i13) {
            int i14 = (i13 & 1) != 0 ? 0 : i11;
            int length = (i13 & 2) != 0 ? canonicalize.length() : i12;
            boolean z12 = (i13 & 8) != 0 ? false : z11;
            boolean z13 = (i13 & 16) == 0;
            boolean z14 = (i13 & 32) == 0;
            boolean z15 = (i13 & 64) == 0;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(canonicalize, "$this$canonicalize");
            Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
            int i15 = i14;
            while (i15 < length) {
                int codePointAt = canonicalize.codePointAt(i15);
                int i16 = 32;
                int i17 = UserVerificationMethods.USER_VERIFY_PATTERN;
                if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z15) || kotlin.text.h.u(encodeSet, (char) codePointAt) || ((codePointAt == 37 && (!z12 || (z13 && !d(i15, length, canonicalize)))) || (codePointAt == 43 && z14)))) {
                    C9681g c9681g = new C9681g();
                    c9681g.D0(i14, i15, canonicalize);
                    C9681g c9681g2 = null;
                    while (i15 < length) {
                        int codePointAt2 = canonicalize.codePointAt(i15);
                        if (!z12 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                            if (codePointAt2 == 43 && z14) {
                                c9681g.H0(z12 ? "+" : "%2B");
                            } else if (codePointAt2 < i16 || codePointAt2 == 127 || ((codePointAt2 >= i17 && !z15) || kotlin.text.h.u(encodeSet, (char) codePointAt2) || (codePointAt2 == 37 && (!z12 || (z13 && !d(i15, length, canonicalize)))))) {
                                if (c9681g2 == null) {
                                    c9681g2 = new C9681g();
                                }
                                c9681g2.K0(codePointAt2);
                                while (!c9681g2.m()) {
                                    byte readByte = c9681g2.readByte();
                                    c9681g.d0(37);
                                    c9681g.d0(A.f33514k[((readByte & 255) >> 4) & 15]);
                                    c9681g.d0(A.f33514k[readByte & 15]);
                                }
                            } else {
                                c9681g.K0(codePointAt2);
                            }
                        }
                        i15 += Character.charCount(codePointAt2);
                        i16 = 32;
                        i17 = UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    return c9681g.G0();
                }
                i15 += Character.charCount(codePointAt);
            }
            String substring = canonicalize.substring(i14, length);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public static int b(@NotNull String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            int hashCode = scheme.hashCode();
            return hashCode != 3213448 ? (hashCode == 99617003 && scheme.equals("https")) ? 443 : -1 : scheme.equals("http") ? 80 : -1;
        }

        @NotNull
        public static A c(@NotNull String toHttpUrl) {
            Intrinsics.checkNotNullParameter(toHttpUrl, "$this$toHttpUrl");
            a aVar = new a();
            aVar.k(null, toHttpUrl);
            return aVar.e();
        }

        private static boolean d(int i11, int i12, String str) {
            int i13 = i11 + 2;
            return i13 < i12 && str.charAt(i11) == '%' && Ye.b.t(str.charAt(i11 + 1)) != -1 && Ye.b.t(str.charAt(i13)) != -1;
        }

        public static A e(@NotNull String toHttpUrlOrNull) {
            Intrinsics.checkNotNullParameter(toHttpUrlOrNull, "$this$toHttpUrlOrNull");
            try {
                return c(toHttpUrlOrNull);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public static String f(b bVar, String percentDecode, int i11, int i12, int i13) {
            int i14;
            if ((i13 & 1) != 0) {
                i11 = 0;
            }
            if ((i13 & 2) != 0) {
                i12 = percentDecode.length();
            }
            boolean z11 = (i13 & 4) == 0;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(percentDecode, "$this$percentDecode");
            int i15 = i11;
            while (i15 < i12) {
                char charAt = percentDecode.charAt(i15);
                if (charAt == '%' || (charAt == '+' && z11)) {
                    C9681g c9681g = new C9681g();
                    c9681g.D0(i11, i15, percentDecode);
                    while (i15 < i12) {
                        int codePointAt = percentDecode.codePointAt(i15);
                        if (codePointAt != 37 || (i14 = i15 + 2) >= i12) {
                            if (codePointAt == 43 && z11) {
                                c9681g.d0(32);
                                i15++;
                            }
                            c9681g.K0(codePointAt);
                            i15 += Character.charCount(codePointAt);
                        } else {
                            int t2 = Ye.b.t(percentDecode.charAt(i15 + 1));
                            int t11 = Ye.b.t(percentDecode.charAt(i14));
                            if (t2 != -1 && t11 != -1) {
                                c9681g.d0((t2 << 4) + t11);
                                i15 = Character.charCount(codePointAt) + i14;
                            }
                            c9681g.K0(codePointAt);
                            i15 += Character.charCount(codePointAt);
                        }
                    }
                    return c9681g.G0();
                }
                i15++;
            }
            String substring = percentDecode.substring(i11, i12);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        @NotNull
        public static ArrayList g(@NotNull String toQueryNamesAndValues) {
            Intrinsics.checkNotNullParameter(toQueryNamesAndValues, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            while (i11 <= toQueryNamesAndValues.length()) {
                int I11 = kotlin.text.h.I('&', i11, 4, toQueryNamesAndValues);
                if (I11 == -1) {
                    I11 = toQueryNamesAndValues.length();
                }
                int I12 = kotlin.text.h.I('=', i11, 4, toQueryNamesAndValues);
                if (I12 == -1 || I12 > I11) {
                    String substring = toQueryNamesAndValues.substring(i11, I11);
                    Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add(null);
                } else {
                    String substring2 = toQueryNamesAndValues.substring(i11, I12);
                    Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = toQueryNamesAndValues.substring(I12 + 1, I11);
                    Intrinsics.checkNotNullExpressionValue(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i11 = I11 + 1;
            }
            return arrayList;
        }

        public static void h(@NotNull ArrayList toQueryString, @NotNull StringBuilder out) {
            Intrinsics.checkNotNullParameter(toQueryString, "$this$toQueryString");
            Intrinsics.checkNotNullParameter(out, "out");
            kotlin.ranges.e m11 = kotlin.ranges.h.m(kotlin.ranges.h.o(0, toQueryString.size()), 2);
            int f71842a = m11.getF71842a();
            int f71843b = m11.getF71843b();
            int f71844c = m11.getF71844c();
            if (f71844c >= 0) {
                if (f71842a > f71843b) {
                    return;
                }
            } else if (f71842a < f71843b) {
                return;
            }
            while (true) {
                String str = (String) toQueryString.get(f71842a);
                String str2 = (String) toQueryString.get(f71842a + 1);
                if (f71842a > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (f71842a == f71843b) {
                    return;
                } else {
                    f71842a += f71844c;
                }
            }
        }
    }

    public A(@NotNull String scheme, @NotNull String username, @NotNull String password, @NotNull String host, int i11, @NotNull ArrayList pathSegments, ArrayList arrayList, String str, @NotNull String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f33517b = scheme;
        this.f33518c = username;
        this.f33519d = password;
        this.f33520e = host;
        this.f33521f = i11;
        this.f33522g = pathSegments;
        this.f33523h = arrayList;
        this.f33524i = str;
        this.f33525j = url;
        this.f33516a = Intrinsics.d(scheme, "https");
    }

    @NotNull
    public final String b() {
        if (this.f33519d.length() == 0) {
            return "";
        }
        int length = this.f33517b.length() + 3;
        String str = this.f33525j;
        int I11 = kotlin.text.h.I(':', length, 4, str) + 1;
        int I12 = kotlin.text.h.I('@', 0, 6, str);
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = str.substring(I11, I12);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public final String c() {
        int length = this.f33517b.length() + 3;
        String str = this.f33525j;
        int I11 = kotlin.text.h.I('/', length, 4, str);
        String substring = str.substring(I11, Ye.b.g(I11, str.length(), str, "?#"));
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public final ArrayList d() {
        int length = this.f33517b.length() + 3;
        String str = this.f33525j;
        int I11 = kotlin.text.h.I('/', length, 4, str);
        int g10 = Ye.b.g(I11, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (I11 < g10) {
            int i11 = I11 + 1;
            int h11 = Ye.b.h(str, '/', i11, g10);
            String substring = str.substring(i11, h11);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            I11 = h11;
        }
        return arrayList;
    }

    public final String e() {
        if (this.f33523h == null) {
            return null;
        }
        String str = this.f33525j;
        int I11 = kotlin.text.h.I('?', 0, 6, str) + 1;
        String substring = str.substring(I11, Ye.b.h(str, '#', I11, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof A) && Intrinsics.d(((A) obj).f33525j, this.f33525j);
    }

    @NotNull
    public final String f() {
        if (this.f33518c.length() == 0) {
            return "";
        }
        int length = this.f33517b.length() + 3;
        String str = this.f33525j;
        int g10 = Ye.b.g(length, str.length(), str, ":@");
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = str.substring(length, g10);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String g() {
        return this.f33524i;
    }

    @NotNull
    public final String h() {
        return this.f33520e;
    }

    public final int hashCode() {
        return this.f33525j.hashCode();
    }

    public final boolean i() {
        return this.f33516a;
    }

    @NotNull
    public final a j() {
        String substring;
        a aVar = new a();
        String str = this.f33517b;
        aVar.z(str);
        aVar.v(f());
        aVar.u(b());
        aVar.w(this.f33520e);
        f33515l.getClass();
        int b11 = b.b(str);
        int i11 = this.f33521f;
        if (i11 == b11) {
            i11 = -1;
        }
        aVar.x(i11);
        aVar.i().clear();
        aVar.i().addAll(d());
        aVar.g(e());
        if (this.f33524i == null) {
            substring = null;
        } else {
            String str2 = this.f33525j;
            int I11 = kotlin.text.h.I('#', 0, 6, str2) + 1;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            substring = str2.substring(I11);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
        }
        aVar.t(substring);
        return aVar;
    }

    public final a k(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            a aVar = new a();
            aVar.k(this, link);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @NotNull
    public final List<String> l() {
        return this.f33522g;
    }

    public final int m() {
        return this.f33522g.size();
    }

    public final int n() {
        return this.f33521f;
    }

    public final String o() {
        ArrayList arrayList = this.f33523h;
        if (arrayList == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f33515l.getClass();
        b.h(arrayList, sb2);
        return sb2.toString();
    }

    public final String p(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ArrayList arrayList = this.f33523h;
        if (arrayList == null) {
            return null;
        }
        kotlin.ranges.e m11 = kotlin.ranges.h.m(kotlin.ranges.h.o(0, arrayList.size()), 2);
        int f71842a = m11.getF71842a();
        int f71843b = m11.getF71843b();
        int f71844c = m11.getF71844c();
        if (f71844c >= 0) {
            if (f71842a > f71843b) {
                return null;
            }
        } else if (f71842a < f71843b) {
            return null;
        }
        while (!Intrinsics.d(name, (String) arrayList.get(f71842a))) {
            if (f71842a == f71843b) {
                return null;
            }
            f71842a += f71844c;
        }
        return (String) arrayList.get(f71842a + 1);
    }

    @NotNull
    public final Set<String> q() {
        ArrayList arrayList = this.f33523h;
        if (arrayList == null) {
            return kotlin.collections.M.f71699a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        kotlin.ranges.e m11 = kotlin.ranges.h.m(kotlin.ranges.h.o(0, arrayList.size()), 2);
        int f71842a = m11.getF71842a();
        int f71843b = m11.getF71843b();
        int f71844c = m11.getF71844c();
        if (f71844c < 0 ? f71842a >= f71843b : f71842a <= f71843b) {
            while (true) {
                Object obj = arrayList.get(f71842a);
                Intrinsics.f(obj);
                linkedHashSet.add(obj);
                if (f71842a == f71843b) {
                    break;
                }
                f71842a += f71844c;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "Collections.unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public final int r() {
        ArrayList arrayList = this.f33523h;
        if (arrayList != null) {
            return arrayList.size() / 2;
        }
        return 0;
    }

    @NotNull
    public final String s() {
        a k11 = k("/...");
        Intrinsics.f(k11);
        k11.A();
        k11.l();
        return k11.e().f33525j;
    }

    public final A t(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        a k11 = k(link);
        if (k11 != null) {
            return k11.e();
        }
        return null;
    }

    @NotNull
    public final String toString() {
        return this.f33525j;
    }

    @NotNull
    public final String u() {
        return this.f33517b;
    }

    public final String v() {
        PublicSuffixDatabase publicSuffixDatabase;
        String str = this.f33520e;
        if (Ye.b.b(str)) {
            return null;
        }
        int i11 = PublicSuffixDatabase.f78419h;
        publicSuffixDatabase = PublicSuffixDatabase.f78418g;
        return publicSuffixDatabase.b(str);
    }

    @NotNull
    public final URI w() {
        a j11 = j();
        j11.p();
        String aVar = j11.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e11) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(aVar, ""));
                Intrinsics.checkNotNullExpressionValue(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e11);
            }
        }
    }

    @NotNull
    public final URL x() {
        try {
            return new URL(this.f33525j);
        } catch (MalformedURLException e11) {
            throw new RuntimeException(e11);
        }
    }
}
