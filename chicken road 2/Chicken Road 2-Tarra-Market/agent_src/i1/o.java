package i1;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: i, reason: collision with root package name */
    public static final char[] f1375i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f1376a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1377b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1378c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1379d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1380e;

    /* renamed from: f, reason: collision with root package name */
    public final List f1381f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1382g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1383h;

    public o(n nVar) {
        this.f1376a = nVar.f1367a;
        String str = nVar.f1368b;
        this.f1377b = g(str, 0, str.length(), false);
        String str2 = nVar.f1369c;
        this.f1378c = g(str2, 0, str2.length(), false);
        this.f1379d = nVar.f1370d;
        int i2 = nVar.f1371e;
        this.f1380e = i2 == -1 ? b(nVar.f1367a) : i2;
        h(nVar.f1372f, false);
        ArrayList arrayList = nVar.f1373g;
        this.f1381f = arrayList != null ? h(arrayList, true) : null;
        String str3 = nVar.f1374h;
        this.f1382g = str3 != null ? g(str3, 0, str3.length(), false) : null;
        this.f1383h = nVar.toString();
    }

    public static String a(String str, int i2, int i3, String str2, boolean z2, boolean z3, boolean z4, boolean z5) {
        int i4 = i2;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z5) || str2.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z2 || (z3 && !i(str, i4, i3)))) || (codePointAt == 43 && z4)))) {
                s1.e eVar = new s1.e();
                eVar.v(str, i2, i4);
                s1.e eVar2 = null;
                while (i4 < i3) {
                    int codePointAt2 = str.codePointAt(i4);
                    if (!z2 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z4) {
                            String str3 = z2 ? "+" : "%2B";
                            eVar.v(str3, 0, str3.length());
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z5) || str2.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && (!z2 || (z3 && !i(str, i4, i3)))))) {
                            if (eVar2 == null) {
                                eVar2 = new s1.e();
                            }
                            eVar2.w(codePointAt2);
                            while (!eVar2.a()) {
                                byte i5 = eVar2.i();
                                eVar.t(37);
                                char[] cArr = f1375i;
                                eVar.t(cArr[((i5 & 255) >> 4) & 15]);
                                eVar.t(cArr[i5 & 15]);
                            }
                        } else {
                            eVar.w(codePointAt2);
                        }
                    }
                    i4 += Character.charCount(codePointAt2);
                }
                return eVar.o();
            }
            i4 += Character.charCount(codePointAt);
        }
        return str.substring(i2, i3);
    }

    public static int b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static String g(String str, int i2, int i3, boolean z2) {
        int i4;
        int i5 = i2;
        while (i5 < i3) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z2)) {
                s1.e eVar = new s1.e();
                eVar.v(str, i2, i5);
                while (i5 < i3) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt != 37 || (i4 = i5 + 2) >= i3) {
                        if (codePointAt == 43 && z2) {
                            eVar.t(32);
                        }
                        eVar.w(codePointAt);
                    } else {
                        int e2 = j1.d.e(str.charAt(i5 + 1));
                        int e3 = j1.d.e(str.charAt(i4));
                        if (e2 != -1 && e3 != -1) {
                            eVar.t((e2 << 4) + e3);
                            i5 = i4;
                        }
                        eVar.w(codePointAt);
                    }
                    i5 += Character.charCount(codePointAt);
                }
                return eVar.o();
            }
            i5++;
        }
        return str.substring(i2, i3);
    }

    public static List h(ArrayList arrayList, boolean z2) {
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) arrayList.get(i2);
            arrayList2.add(str != null ? g(str, 0, str.length(), z2) : null);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public static boolean i(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && j1.d.e(str.charAt(i2 + 1)) != -1 && j1.d.e(str.charAt(i4)) != -1;
    }

    public static ArrayList j(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i2, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    public final String c() {
        if (this.f1378c.isEmpty()) {
            return "";
        }
        int length = this.f1376a.length() + 3;
        String str = this.f1383h;
        return str.substring(str.indexOf(58, length) + 1, str.indexOf(64));
    }

    public final ArrayList d() {
        int length = this.f1376a.length() + 3;
        String str = this.f1383h;
        int indexOf = str.indexOf(47, length);
        int h2 = j1.d.h(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < h2) {
            int i2 = indexOf + 1;
            int g2 = j1.d.g(str, i2, h2, '/');
            arrayList.add(str.substring(i2, g2));
            indexOf = g2;
        }
        return arrayList;
    }

    public final String e() {
        if (this.f1381f == null) {
            return null;
        }
        String str = this.f1383h;
        int indexOf = str.indexOf(63) + 1;
        return str.substring(indexOf, j1.d.g(str, indexOf, str.length(), '#'));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o) && ((o) obj).f1383h.equals(this.f1383h);
    }

    public final String f() {
        if (this.f1377b.isEmpty()) {
            return "";
        }
        int length = this.f1376a.length() + 3;
        String str = this.f1383h;
        return str.substring(length, j1.d.h(str, length, str.length(), ":@"));
    }

    public final int hashCode() {
        return this.f1383h.hashCode();
    }

    public final URI k() {
        n nVar = new n();
        String str = this.f1376a;
        nVar.f1367a = str;
        nVar.f1368b = f();
        nVar.f1369c = c();
        nVar.f1370d = this.f1379d;
        int b2 = b(str);
        int i2 = this.f1380e;
        if (i2 == b2) {
            i2 = -1;
        }
        nVar.f1371e = i2;
        ArrayList arrayList = nVar.f1372f;
        arrayList.clear();
        arrayList.addAll(d());
        String e2 = e();
        String str2 = null;
        nVar.f1373g = e2 != null ? j(a(e2, 0, e2.length(), " \"'<>#", true, false, true, true)) : null;
        if (this.f1382g != null) {
            String str3 = this.f1383h;
            str2 = str3.substring(str3.indexOf(35) + 1);
        }
        nVar.f1374h = str2;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            String str4 = (String) arrayList.get(i3);
            arrayList.set(i3, a(str4, 0, str4.length(), "[]", true, true, false, true));
        }
        ArrayList arrayList2 = nVar.f1373g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str5 = (String) nVar.f1373g.get(i4);
                if (str5 != null) {
                    nVar.f1373g.set(i4, a(str5, 0, str5.length(), "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str6 = nVar.f1374h;
        if (str6 != null) {
            nVar.f1374h = a(str6, 0, str6.length(), " \"#<>\\^`{|}", true, true, false, false);
        }
        String nVar2 = nVar.toString();
        try {
            return new URI(nVar2);
        } catch (URISyntaxException e3) {
            try {
                return URI.create(nVar2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e3);
            }
        }
    }

    public final String toString() {
        return this.f1383h;
    }
}
