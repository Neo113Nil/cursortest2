package O4;

import Q2.C0375o;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f4156x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f4157y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: a, reason: collision with root package name */
    public final C0375o f4158a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f4159b;

    /* renamed from: c, reason: collision with root package name */
    public final Annotation[] f4160c;

    /* renamed from: d, reason: collision with root package name */
    public final Annotation[][] f4161d;

    /* renamed from: e, reason: collision with root package name */
    public final Type[] f4162e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4163g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4164h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4165j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4166k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4167l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4168m;

    /* renamed from: n, reason: collision with root package name */
    public String f4169n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4170o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4171p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4172q;

    /* renamed from: r, reason: collision with root package name */
    public String f4173r;

    /* renamed from: s, reason: collision with root package name */
    public y4.m f4174s;

    /* renamed from: t, reason: collision with root package name */
    public y4.q f4175t;

    /* renamed from: u, reason: collision with root package name */
    public LinkedHashSet f4176u;

    /* renamed from: v, reason: collision with root package name */
    public Z[] f4177v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4178w;

    public P(C0375o c0375o, Method method) {
        this.f4158a = c0375o;
        this.f4159b = method;
        this.f4160c = method.getAnnotations();
        this.f4162e = method.getGenericParameterTypes();
        this.f4161d = method.getParameterAnnotations();
    }

    public static Class a(Class cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    public final void b(String str, String str2, boolean z3) {
        String str3 = this.f4169n;
        Method method = this.f4159b;
        if (str3 != null) {
            throw Z.n(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.f4169n = str;
        this.f4170o = z3;
        if (str2.isEmpty()) {
            return;
        }
        int indexOf = str2.indexOf(63);
        Pattern pattern = f4156x;
        if (indexOf != -1 && indexOf < str2.length() - 1) {
            String substring = str2.substring(indexOf + 1);
            if (pattern.matcher(substring).find()) {
                throw Z.n(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
            }
        }
        this.f4173r = str2;
        Matcher matcher = pattern.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.f4176u = linkedHashSet;
    }

    public final void c(int i, Type type) {
        if (Z.j(type)) {
            throw Z.o(this.f4159b, i, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
