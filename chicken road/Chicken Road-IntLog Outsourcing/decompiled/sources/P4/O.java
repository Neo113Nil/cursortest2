package P4;

import f4.C0430g;
import f4.C0436m;
import f4.C0437n;
import f4.C0438o;
import f4.C0439p;
import f4.C0440q;
import f4.C0441r;
import f4.C0443t;
import g4.AbstractC0476u;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2338a;

    static {
        C0430g c0430g = new C0430g(kotlin.jvm.internal.t.a(String.class), T.f2344a);
        C0430g c0430g2 = new C0430g(kotlin.jvm.internal.t.a(Character.TYPE), C0133l.f2382a);
        C0430g c0430g3 = new C0430g(kotlin.jvm.internal.t.a(char[].class), C0132k.f2381c);
        C0430g c0430g4 = new C0430g(kotlin.jvm.internal.t.a(Double.TYPE), C0137p.f2388a);
        C0430g c0430g5 = new C0430g(kotlin.jvm.internal.t.a(double[].class), C0136o.f2387c);
        C0430g c0430g6 = new C0430g(kotlin.jvm.internal.t.a(Float.TYPE), C0141u.f2400a);
        C0430g c0430g7 = new C0430g(kotlin.jvm.internal.t.a(float[].class), C0140t.f2399c);
        C0430g c0430g8 = new C0430g(kotlin.jvm.internal.t.a(Long.TYPE), F.f2325a);
        C0430g c0430g9 = new C0430g(kotlin.jvm.internal.t.a(long[].class), E.f2324c);
        C0430g c0430g10 = new C0430g(kotlin.jvm.internal.t.a(C0440q.class), c0.f2360a);
        C0430g c0430g11 = new C0430g(kotlin.jvm.internal.t.a(C0441r.class), b0.f2358c);
        C0430g c0430g12 = new C0430g(kotlin.jvm.internal.t.a(Integer.TYPE), C0146z.f2416a);
        C0430g c0430g13 = new C0430g(kotlin.jvm.internal.t.a(int[].class), C0145y.f2415c);
        C0430g c0430g14 = new C0430g(kotlin.jvm.internal.t.a(C0438o.class), Z.f2354a);
        C0430g c0430g15 = new C0430g(kotlin.jvm.internal.t.a(C0439p.class), Y.f2353c);
        C0430g c0430g16 = new C0430g(kotlin.jvm.internal.t.a(Short.TYPE), S.f2342a);
        C0430g c0430g17 = new C0430g(kotlin.jvm.internal.t.a(short[].class), Q.f2341c);
        C0430g c0430g18 = new C0430g(kotlin.jvm.internal.t.a(C0443t.class), f0.f2370a);
        C0430g c0430g19 = new C0430g(kotlin.jvm.internal.t.a(f4.u.class), e0.f2367c);
        C0430g c0430g20 = new C0430g(kotlin.jvm.internal.t.a(Byte.TYPE), C0130i.f2377a);
        C0430g c0430g21 = new C0430g(kotlin.jvm.internal.t.a(byte[].class), C0129h.f2376c);
        C0430g c0430g22 = new C0430g(kotlin.jvm.internal.t.a(C0436m.class), W.f2349a);
        C0430g c0430g23 = new C0430g(kotlin.jvm.internal.t.a(C0437n.class), V.f2348c);
        C0430g c0430g24 = new C0430g(kotlin.jvm.internal.t.a(Boolean.TYPE), C0127f.f2368a);
        C0430g c0430g25 = new C0430g(kotlin.jvm.internal.t.a(boolean[].class), C0126e.f2366c);
        C0430g c0430g26 = new C0430g(kotlin.jvm.internal.t.a(f4.v.class), g0.f2374b);
        C0430g c0430g27 = new C0430g(kotlin.jvm.internal.t.a(Void.class), H.f2328a);
        kotlin.jvm.internal.d a6 = kotlin.jvm.internal.t.a(C4.a.class);
        int i2 = C4.a.f392d;
        f2338a = AbstractC0476u.Y(c0430g, c0430g2, c0430g3, c0430g4, c0430g5, c0430g6, c0430g7, c0430g8, c0430g9, c0430g10, c0430g11, c0430g12, c0430g13, c0430g14, c0430g15, c0430g16, c0430g17, c0430g18, c0430g19, c0430g20, c0430g21, c0430g22, c0430g23, c0430g24, c0430g25, c0430g26, c0430g27, new C0430g(a6, C0138q.f2390a));
    }

    public static final String a(String str) {
        String valueOf;
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        if (Character.isLowerCase(charAt)) {
            String valueOf2 = String.valueOf(charAt);
            kotlin.jvm.internal.i.c(valueOf2, "null cannot be cast to non-null type java.lang.String");
            Locale locale = Locale.ROOT;
            valueOf = valueOf2.toUpperCase(locale);
            kotlin.jvm.internal.i.d(valueOf, "toUpperCase(...)");
            if (valueOf.length() <= 1) {
                valueOf = String.valueOf(Character.toTitleCase(charAt));
            } else if (charAt != 329) {
                char charAt2 = valueOf.charAt(0);
                String substring = valueOf.substring(1);
                kotlin.jvm.internal.i.d(substring, "substring(...)");
                String lowerCase = substring.toLowerCase(locale);
                kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                valueOf = charAt2 + lowerCase;
            }
        } else {
            valueOf = String.valueOf(charAt);
        }
        sb.append((Object) valueOf);
        String substring2 = str.substring(1);
        kotlin.jvm.internal.i.d(substring2, "substring(...)");
        sb.append(substring2);
        return sb.toString();
    }
}
