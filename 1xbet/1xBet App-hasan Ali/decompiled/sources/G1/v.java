package G1;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o4.AbstractC2227e;
import o4.AbstractC2234l;
import r0.AbstractC2346c;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f1940m = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f1941n = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: o, reason: collision with root package name */
    public static final String f1942o = "http[s]?://";

    /* renamed from: p, reason: collision with root package name */
    public static final String f1943p = ".*";

    /* renamed from: q, reason: collision with root package name */
    public static final String f1944q = L1.a.n("\\E", ".*", "\\Q");

    /* renamed from: r, reason: collision with root package name */
    public static final String f1945r = "([^/]*?|)";

    /* renamed from: a, reason: collision with root package name */
    public final String f1946a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1947b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1948c;

    /* renamed from: d, reason: collision with root package name */
    public final W3.m f1949d;

    /* renamed from: e, reason: collision with root package name */
    public final W3.m f1950e;
    public final Object f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1951g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1952h;
    public final Object i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f1953j;

    /* renamed from: k, reason: collision with root package name */
    public final W3.m f1954k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1955l;

    public v(String str) {
        this.f1946a = str;
        ArrayList arrayList = new ArrayList();
        this.f1947b = arrayList;
        this.f1949d = G4.d.E(new t(this, 6));
        this.f1950e = G4.d.E(new t(this, 4));
        W3.f fVar = W3.f.f6034k;
        this.f = G4.d.D(fVar, new t(this, 7));
        this.f1952h = G4.d.D(fVar, new t(this, 1));
        this.i = G4.d.D(fVar, new t(this, 0));
        this.f1953j = G4.d.D(fVar, new t(this, 3));
        this.f1954k = G4.d.E(new t(this, 2));
        G4.d.E(new t(this, 5));
        StringBuilder sb = new StringBuilder("^");
        if (!f1940m.matcher(str).find()) {
            sb.append(f1942o);
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
        matcher.find();
        boolean z3 = false;
        String substring = str.substring(0, matcher.start());
        kotlin.jvm.internal.l.e("substring(...)", substring);
        a(substring, arrayList, sb);
        String str2 = f1943p;
        if (!AbstractC2227e.B0(sb, str2) && !AbstractC2227e.B0(sb, f1945r)) {
            z3 = true;
        }
        this.f1955l = z3;
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("uriRegex.toString()", sb2);
        this.f1948c = AbstractC2234l.v0(sb2, str2, f1944q);
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        Matcher matcher = f1941n.matcher(str);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.String", group);
            arrayList.add(group);
            if (matcher.start() > i) {
                String substring = str.substring(i, matcher.start());
                kotlin.jvm.internal.l.e("substring(...)", substring);
                sb.append(Pattern.quote(substring));
            }
            sb.append(f1945r);
            i = matcher.end();
        }
        if (i < str.length()) {
            String substring2 = str.substring(i);
            kotlin.jvm.internal.l.e("substring(...)", substring2);
            sb.append(Pattern.quote(substring2));
        }
    }

    public static void g(Bundle bundle, String str, String str2, C0135f c0135f) {
        if (c0135f == null) {
            bundle.putString(str, str2);
            return;
        }
        M m5 = c0135f.f1891a;
        kotlin.jvm.internal.l.f("key", str);
        m5.e(bundle, str, m5.c(str2));
    }

    public final int b(Uri uri) {
        String str;
        if (uri == null || (str = this.f1946a) == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        List<String> pathSegments2 = Uri.parse(str).getPathSegments();
        kotlin.jvm.internal.l.e("requestedPathSegments", pathSegments);
        kotlin.jvm.internal.l.e("uriPathSegments", pathSegments2);
        LinkedHashSet linkedHashSet = new LinkedHashSet(pathSegments);
        linkedHashSet.retainAll(pathSegments2);
        return linkedHashSet.size();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [W3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [W3.e, java.lang.Object] */
    public final ArrayList c() {
        ArrayList arrayList = this.f1947b;
        Collection values = ((Map) this.f.getValue()).values();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            X3.s.U(((s) it.next()).f1935b, arrayList2);
        }
        return X3.m.i0(X3.m.i0(arrayList, arrayList2), (List) this.i.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [W3.e, java.lang.Object] */
    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        kotlin.jvm.internal.l.f("deepLink", uri);
        kotlin.jvm.internal.l.f("arguments", linkedHashMap);
        Pattern pattern = (Pattern) this.f1949d.getValue();
        Matcher matcher = pattern != null ? pattern.matcher(uri.toString()) : null;
        if (matcher != null && matcher.matches()) {
            Bundle bundle = new Bundle();
            if (e(matcher, bundle, linkedHashMap) && (!((Boolean) this.f1950e.getValue()).booleanValue() || f(uri, bundle, linkedHashMap))) {
                String fragment = uri.getFragment();
                Pattern pattern2 = (Pattern) this.f1954k.getValue();
                Matcher matcher2 = pattern2 != null ? pattern2.matcher(String.valueOf(fragment)) : null;
                if (matcher2 != null && matcher2.matches()) {
                    List list = (List) this.i.getValue();
                    ArrayList arrayList = new ArrayList(X3.o.S(list, 10));
                    int i = 0;
                    for (Object obj : list) {
                        int i5 = i + 1;
                        if (i < 0) {
                            X3.n.R();
                            throw null;
                        }
                        String str = (String) obj;
                        String decode = Uri.decode(matcher2.group(i5));
                        C0135f c0135f = (C0135f) linkedHashMap.get(str);
                        try {
                            kotlin.jvm.internal.l.e("value", decode);
                            g(bundle, str, decode, c0135f);
                            arrayList.add(W3.o.f6046a);
                            i = i5;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (AbstractC0136g.d(linkedHashMap, new u(0, bundle)).isEmpty()) {
                    return bundle;
                }
            }
        }
        return null;
    }

    public final boolean e(Matcher matcher, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.f1947b;
        ArrayList arrayList2 = new ArrayList(X3.o.S(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            int i6 = i + 1;
            if (i < 0) {
                X3.n.R();
                throw null;
            }
            String str = (String) obj;
            String decode = Uri.decode(matcher.group(i6));
            C0135f c0135f = (C0135f) linkedHashMap.get(str);
            try {
                kotlin.jvm.internal.l.e("value", decode);
                g(bundle, str, decode, c0135f);
                arrayList2.add(W3.o.f6046a);
                i = i6;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof v)) {
            return false;
        }
        return this.f1946a.equals(((v) obj).f1946a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [W3.e, java.lang.Object] */
    public final boolean f(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        Object obj;
        boolean z3;
        Object obj2;
        String query;
        v vVar = this;
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        for (Map.Entry entry : ((Map) vVar.f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            s sVar = (s) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (vVar.f1951g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = AbstractC2346c.A(query);
            }
            kotlin.jvm.internal.l.e("inputParams", queryParameters);
            W3.o oVar = W3.o.f6046a;
            int i = 0;
            Bundle l5 = AbstractC2425d.l(new W3.h[0]);
            ArrayList arrayList = sVar.f1935b;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj3 = arrayList.get(i5);
                i5++;
                String str2 = (String) obj3;
                C0135f c0135f = (C0135f) linkedHashMap2.get(str2);
                M m5 = c0135f != null ? c0135f.f1891a : null;
                if ((m5 instanceof J) && !c0135f.f1892b) {
                    ((J) m5).getClass();
                    boolean z5 = false;
                    switch (z5) {
                        case false:
                            obj2 = new boolean[0];
                            break;
                        case true:
                            obj2 = new float[0];
                            break;
                        case true:
                            obj2 = new int[0];
                            break;
                        case true:
                            obj2 = new long[0];
                            break;
                        default:
                            obj2 = new String[0];
                            break;
                    }
                    m5.e(l5, str2, obj2);
                }
            }
            for (String str3 : queryParameters) {
                String str4 = sVar.f1934a;
                Matcher matcher = str4 != null ? Pattern.compile(str4, 32).matcher(str3) : null;
                if (matcher == null || !matcher.matches()) {
                    return i;
                }
                ArrayList arrayList2 = sVar.f1935b;
                ArrayList arrayList3 = new ArrayList(X3.o.S(arrayList2, 10));
                int size2 = arrayList2.size();
                int i6 = i;
                int i7 = i6;
                while (i7 < size2) {
                    Object obj4 = arrayList2.get(i7);
                    i7++;
                    int i8 = i;
                    int i9 = i6 + 1;
                    if (i6 < 0) {
                        X3.n.R();
                        throw null;
                    }
                    String str5 = (String) obj4;
                    String group = matcher.group(i9);
                    if (group == null) {
                        group = "";
                    }
                    String str6 = group;
                    C0135f c0135f2 = (C0135f) linkedHashMap2.get(str5);
                    if (l5.containsKey(str5)) {
                        if (l5.containsKey(str5)) {
                            if (c0135f2 != null) {
                                M m6 = c0135f2.f1891a;
                                Object a5 = m6.a(str5, l5);
                                if (!l5.containsKey(str5)) {
                                    throw new IllegalArgumentException("There is no previous value in this bundle.");
                                }
                                m6.e(l5, str5, m6.d(str6, a5));
                            }
                            z3 = i8;
                        } else {
                            z3 = 1;
                        }
                        obj = Boolean.valueOf(z3);
                        arrayList3.add(obj);
                        linkedHashMap2 = linkedHashMap;
                        i6 = i9;
                        i = i8;
                    } else {
                        g(l5, str5, str6, c0135f2);
                        obj = oVar;
                        arrayList3.add(obj);
                        linkedHashMap2 = linkedHashMap;
                        i6 = i9;
                        i = i8;
                    }
                }
                linkedHashMap2 = linkedHashMap;
            }
            bundle.putAll(l5);
            vVar = this;
            linkedHashMap2 = linkedHashMap;
        }
        return true;
    }

    public final int hashCode() {
        return this.f1946a.hashCode() * 961;
    }
}
