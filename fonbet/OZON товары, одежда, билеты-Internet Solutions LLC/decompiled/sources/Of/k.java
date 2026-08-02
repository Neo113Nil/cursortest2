package Of;

import E0.C2942q;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    static final String[] f20357a = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f20358b = Pattern.compile("^/(?>(?>\\.\\.?/)+)");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f20359c = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f20360d = Pattern.compile("[\\x00-\\x1f]*");

    /* renamed from: e, reason: collision with root package name */
    private static final e<StringBuilder> f20361e = new e<>(new f());

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f20362f = 0;

    public static class a {

        /* renamed from: b, reason: collision with root package name */
        final String f20364b;

        /* renamed from: a, reason: collision with root package name */
        StringBuilder f20363a = k.b();

        /* renamed from: c, reason: collision with root package name */
        boolean f20365c = true;

        public a(String str) {
            this.f20364b = str;
        }
    }

    public static void a(String str, StringBuilder sb2, boolean z11) {
        int length = str.length();
        int i11 = 0;
        boolean z12 = false;
        boolean z13 = false;
        while (i11 < length) {
            int codePointAt = str.codePointAt(i11);
            if (codePointAt == 32 || codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13 || codePointAt == 160) {
                if ((!z11 || z12) && !z13) {
                    sb2.append(' ');
                    z13 = true;
                }
            } else if (codePointAt != 8203 && codePointAt != 173) {
                sb2.appendCodePoint(codePointAt);
                z13 = false;
                z12 = true;
            }
            i11 += Character.charCount(codePointAt);
        }
    }

    public static StringBuilder b() {
        return f20361e.a();
    }

    public static boolean c(String str, String... strArr) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    public static boolean e(char c11) {
        if (c11 < 'a' || c11 > 'z') {
            return c11 >= 'A' && c11 <= 'Z';
        }
        return true;
    }

    public static boolean f(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i11 = 0; i11 < length; i11++) {
                if (!i(str.codePointAt(i11))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean g(char c11) {
        return c11 >= '0' && c11 <= '9';
    }

    public static boolean h(char c11) {
        if (g(c11)) {
            return true;
        }
        if (c11 < 'a' || c11 > 'f') {
            return c11 >= 'A' && c11 <= 'F';
        }
        return true;
    }

    public static boolean i(int i11) {
        return i11 == 32 || i11 == 9 || i11 == 10 || i11 == 12 || i11 == 13;
    }

    public static String j(String str, List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return "";
        }
        String obj = it.next().toString();
        if (!it.hasNext()) {
            return obj;
        }
        StringBuilder b11 = b();
        Nf.b.d(b11);
        b11.append((Object) obj);
        while (it.hasNext()) {
            Object next = it.next();
            b11.append(str);
            b11.append(next);
        }
        return l(b11);
    }

    public static String k(int i11, int i12) {
        if (!(i11 >= 0)) {
            throw new Nf.c("width must be >= 0");
        }
        Nf.b.a(i12 >= -1);
        if (i12 != -1) {
            i11 = Math.min(i11, i12);
        }
        if (i11 < 21) {
            return f20357a[i11];
        }
        char[] cArr = new char[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            cArr[i13] = ' ';
        }
        return String.valueOf(cArr);
    }

    public static String l(StringBuilder sb2) {
        Nf.b.d(sb2);
        String sb3 = sb2.toString();
        m(sb2);
        return sb3;
    }

    public static void m(StringBuilder sb2) {
        if (sb2.length() <= 8192) {
            sb2.delete(0, sb2.length());
            f20361e.b(sb2);
        }
    }

    public static String n(String str, String str2) {
        Pattern pattern = f20360d;
        String replaceAll = pattern.matcher(str).replaceAll("");
        String replaceAll2 = pattern.matcher(str2).replaceAll("");
        try {
            try {
                return o(new URL(replaceAll), replaceAll2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(replaceAll2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return f20359c.matcher(replaceAll2).find() ? replaceAll2 : "";
        }
    }

    public static URL o(URL url, String str) throws MalformedURLException {
        String replaceAll = f20360d.matcher(str).replaceAll("");
        if (replaceAll.startsWith("?")) {
            replaceAll = url.getPath() + replaceAll;
        }
        URL url2 = new URL(url, replaceAll);
        String replaceFirst = f20358b.matcher(url2.getFile()).replaceFirst("/");
        if (url2.getRef() != null) {
            StringBuilder e11 = C2942q.e(replaceFirst, "#");
            e11.append(url2.getRef());
            replaceFirst = e11.toString();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), replaceFirst);
    }
}
