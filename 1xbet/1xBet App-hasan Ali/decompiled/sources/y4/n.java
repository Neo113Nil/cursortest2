package y4;

import com.google.android.gms.internal.ads.C1234l6;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import o4.AbstractC2227e;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: k, reason: collision with root package name */
    public static final char[] f21361k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f21362a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21363b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21364c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21365d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21366e;
    public final ArrayList f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f21367g;

    /* renamed from: h, reason: collision with root package name */
    public final String f21368h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f21369j;

    public n(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        kotlin.jvm.internal.l.f("scheme", str);
        kotlin.jvm.internal.l.f("host", str4);
        this.f21362a = str;
        this.f21363b = str2;
        this.f21364c = str3;
        this.f21365d = str4;
        this.f21366e = i;
        this.f = arrayList;
        this.f21367g = arrayList2;
        this.f21368h = str5;
        this.i = str6;
        this.f21369j = str.equals("https");
    }

    public final String a() {
        if (this.f21364c.length() == 0) {
            return "";
        }
        int length = this.f21362a.length() + 3;
        String str = this.i;
        String substring = str.substring(AbstractC2227e.F0(str, ':', length, 4) + 1, AbstractC2227e.F0(str, '@', 0, 6));
        kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", substring);
        return substring;
    }

    public final String b() {
        int length = this.f21362a.length() + 3;
        String str = this.i;
        int F02 = AbstractC2227e.F0(str, '/', length, 4);
        String substring = str.substring(F02, z4.b.e(F02, str.length(), str, "?#"));
        kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", substring);
        return substring;
    }

    public final ArrayList c() {
        int length = this.f21362a.length() + 3;
        String str = this.i;
        int F02 = AbstractC2227e.F0(str, '/', length, 4);
        int e3 = z4.b.e(F02, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (F02 < e3) {
            int i = F02 + 1;
            int f = z4.b.f(str, '/', i, e3);
            String substring = str.substring(i, f);
            kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", substring);
            arrayList.add(substring);
            F02 = f;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f21367g == null) {
            return null;
        }
        String str = this.i;
        int F02 = AbstractC2227e.F0(str, '?', 0, 6) + 1;
        String substring = str.substring(F02, z4.b.f(str, '#', F02, str.length()));
        kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", substring);
        return substring;
    }

    public final String e() {
        if (this.f21363b.length() == 0) {
            return "";
        }
        int length = this.f21362a.length() + 3;
        String str = this.i;
        String substring = str.substring(length, z4.b.e(length, str.length(), str, ":@"));
        kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", substring);
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n) && kotlin.jvm.internal.l.a(((n) obj).i, this.i);
    }

    public final C1234l6 f(String str) {
        kotlin.jvm.internal.l.f("link", str);
        try {
            C1234l6 c1234l6 = new C1234l6();
            c1234l6.c(this, str);
            return c1234l6;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String g() {
        C1234l6 f = f("/...");
        kotlin.jvm.internal.l.c(f);
        f.f14325d = C2674b.b(0, 0, 251, "", " \"':;<=>@[]^`{}|/\\?#");
        f.f14326e = C2674b.b(0, 0, 251, "", " \"':;<=>@[]^`{}|/\\?#");
        return f.a().i;
    }

    public final URI h() {
        String substring;
        String str;
        C1234l6 c1234l6 = new C1234l6();
        String str2 = this.f21362a;
        c1234l6.f14323b = str2;
        c1234l6.f14325d = e();
        c1234l6.f14326e = a();
        c1234l6.f = this.f21365d;
        kotlin.jvm.internal.l.f("scheme", str2);
        int i = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
        int i5 = this.f21366e;
        c1234l6.f14324c = i5 != i ? i5 : -1;
        ArrayList arrayList = (ArrayList) c1234l6.f14327g;
        arrayList.clear();
        arrayList.addAll(c());
        String d5 = d();
        c1234l6.f14328h = d5 != null ? C2674b.f(C2674b.b(0, 0, 211, d5, " \"'<>#")) : null;
        if (this.f21368h == null) {
            substring = null;
        } else {
            String str3 = this.i;
            substring = str3.substring(AbstractC2227e.F0(str3, '#', 0, 6) + 1);
            kotlin.jvm.internal.l.e("this as java.lang.String).substring(startIndex)", substring);
        }
        c1234l6.i = substring;
        String str4 = (String) c1234l6.f;
        if (str4 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            kotlin.jvm.internal.l.e("compile(...)", compile);
            str = compile.matcher(str4).replaceAll("");
            kotlin.jvm.internal.l.e("replaceAll(...)", str);
        } else {
            str = null;
        }
        c1234l6.f = str;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.set(i6, C2674b.b(0, 0, 227, (String) arrayList.get(i6), "[]"));
        }
        ArrayList arrayList2 = (ArrayList) c1234l6.f14328h;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                String str5 = (String) arrayList2.get(i7);
                arrayList2.set(i7, str5 != null ? C2674b.b(0, 0, 195, str5, "\\^`{|}") : null);
            }
        }
        String str6 = (String) c1234l6.i;
        c1234l6.i = str6 != null ? C2674b.b(0, 0, 163, str6, " \"#<>\\^`{|}") : null;
        String c1234l62 = c1234l6.toString();
        try {
            return new URI(c1234l62);
        } catch (URISyntaxException e3) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                kotlin.jvm.internal.l.e("compile(...)", compile2);
                String replaceAll = compile2.matcher(c1234l62).replaceAll("");
                kotlin.jvm.internal.l.e("replaceAll(...)", replaceAll);
                URI create = URI.create(replaceAll);
                kotlin.jvm.internal.l.e("{\n      // Unlikely edge…Unexpected!\n      }\n    }", create);
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e3);
            }
        }
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String toString() {
        return this.i;
    }
}
