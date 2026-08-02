package B4;

import B0.A0;
import C.o0;
import E0.C2942q;
import Sc.InterfaceC4008j;
import android.net.Uri;
import android.os.Bundle;
import io.sentry.W2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class A {

    /* renamed from: q, reason: collision with root package name */
    private static final Pattern f2456q = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f2457r = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: a, reason: collision with root package name */
    private final String f2458a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2459b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2460c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayList f2461d;

    /* renamed from: e, reason: collision with root package name */
    private String f2462e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f2463f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f2464g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Object f2465h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f2466i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Object f2467j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Object f2468k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Object f2469l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f2470m;

    /* renamed from: n, reason: collision with root package name */
    private String f2471n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f2472o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f2473p;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f2474a;

        /* renamed from: b, reason: collision with root package name */
        private String f2475b;

        /* renamed from: c, reason: collision with root package name */
        private String f2476c;

        @NotNull
        public final A a() {
            return new A(this.f2474a, this.f2475b, this.f2476c);
        }

        @NotNull
        public final void b(@NotNull String action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (action.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.f2475b = action;
        }

        @NotNull
        public final void c(@NotNull String mimeType) {
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            this.f2476c = mimeType;
        }

        @NotNull
        public final void d(@NotNull String uriPattern) {
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            this.f2474a = uriPattern;
        }
    }

    private static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private String f2477a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private String f2478b;

        public b(@NotNull String mimeType) {
            List list;
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            List i11 = new Regex("/").i(mimeType);
            if (!i11.isEmpty()) {
                ListIterator listIterator = i11.listIterator(i11.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        list = C7714v.K0(i11, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list = kotlin.collections.K.f71697a;
            this.f2477a = (String) list.get(0);
            this.f2478b = (String) list.get(1);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(@NotNull b other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int i11 = Intrinsics.d(this.f2477a, other.f2477a) ? 2 : 0;
            return Intrinsics.d(this.f2478b, other.f2478b) ? i11 + 1 : i11;
        }

        @NotNull
        public final String b() {
            return this.f2478b;
        }

        @NotNull
        public final String c() {
            return this.f2477a;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private String f2479a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ArrayList f2480b = new ArrayList();

        public final void a(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f2480b.add(name);
        }

        @NotNull
        public final ArrayList b() {
            return this.f2480b;
        }

        public final String c() {
            return this.f2479a;
        }

        public final void d(String str) {
            this.f2479a = str;
        }
    }

    static final class d extends AbstractC7737t implements Function0<List<String>> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<String> invoke() {
            List<String> list;
            Pair a11 = A.a(A.this);
            return (a11 == null || (list = (List) a11.e()) == null) ? new ArrayList() : list;
        }
    }

    static final class e extends AbstractC7737t implements Function0<Pair<? extends List<String>, ? extends String>> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Pair<? extends List<String>, ? extends String> invoke() {
            return A.e(A.this);
        }
    }

    static final class f extends AbstractC7737t implements Function0<Pattern> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Pattern invoke() {
            String b11 = A.b(A.this);
            if (b11 != null) {
                return Pattern.compile(b11, 2);
            }
            return null;
        }
    }

    static final class g extends AbstractC7737t implements Function0<String> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            Pair a11 = A.a(A.this);
            if (a11 != null) {
                return (String) a11.f();
            }
            return null;
        }
    }

    static final class h extends AbstractC7737t implements Function0<Boolean> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            A a11 = A.this;
            return Boolean.valueOf((a11.q() == null || Uri.parse(a11.q()).getQuery() == null) ? false : true);
        }
    }

    static final class i extends AbstractC7737t implements Function0<Pattern> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Pattern invoke() {
            String str = A.this.f2471n;
            if (str != null) {
                return Pattern.compile(str);
            }
            return null;
        }
    }

    static final class j extends AbstractC7737t implements Function0<Pattern> {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Pattern invoke() {
            String str = A.this.f2462e;
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    }

    static final class k extends AbstractC7737t implements Function0<Map<String, c>> {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, c> invoke() {
            return A.f(A.this);
        }
    }

    public A(String str, String str2, String str3) {
        this.f2458a = str;
        this.f2459b = str2;
        this.f2460c = str3;
        ArrayList arrayList = new ArrayList();
        this.f2461d = arrayList;
        this.f2463f = Sc.k.b(new j());
        this.f2464g = Sc.k.b(new h());
        Sc.n nVar = Sc.n.NONE;
        this.f2465h = Sc.k.a(nVar, new k());
        this.f2467j = Sc.k.a(nVar, new e());
        this.f2468k = Sc.k.a(nVar, new d());
        this.f2469l = Sc.k.a(nVar, new g());
        this.f2470m = Sc.k.b(new f());
        this.f2472o = Sc.k.b(new i());
        if (str != null) {
            StringBuilder sb2 = new StringBuilder("^");
            if (!f2456q.matcher(str).find()) {
                sb2.append("http[s]?://");
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
            matcher.find();
            String substring = str.substring(0, matcher.start());
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            g(substring, sb2, arrayList);
            this.f2473p = (kotlin.text.h.t(sb2, W2.DEFAULT_PROPAGATION_TARGETS, false) || kotlin.text.h.t(sb2, "([^/]+?)", false)) ? false : true;
            this.f2462e = kotlin.text.h.X(C2942q.c(sb2, "($|(\\?(.)*)|(\\#(.)*))", "uriRegex.toString()"), W2.DEFAULT_PROPAGATION_TARGETS, "\\E.*\\Q", false);
        }
        if (str3 == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
            throw new IllegalArgumentException(A0.b("The given mimeType ", str3, " does not match to required \"type/subtype\" format").toString());
        }
        b bVar = new b(str3);
        StringBuilder sb3 = new StringBuilder("^(");
        sb3.append(bVar.c());
        sb3.append("|[*]+)/(");
        this.f2471n = kotlin.text.h.X(o0.c(sb3, bVar.b(), "|[*]+)$"), "*|[*]", "[\\s\\S]", false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final Pair a(A a11) {
        return (Pair) a11.f2467j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final String b(A a11) {
        return (String) a11.f2469l.getValue();
    }

    public static final Pair e(A a11) {
        String str = a11.f2458a;
        if (str == null || Uri.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = Uri.parse(str).getFragment();
        StringBuilder sb2 = new StringBuilder();
        Intrinsics.f(fragment);
        g(fragment, sb2, arrayList);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "fragRegex.toString()");
        return new Pair(arrayList, sb3);
    }

    public static final LinkedHashMap f(A a11) {
        a11.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (((Boolean) a11.f2464g.getValue()).booleanValue()) {
            String str = a11.f2458a;
            Uri parse = Uri.parse(str);
            for (String paramName : parse.getQueryParameterNames()) {
                StringBuilder sb2 = new StringBuilder();
                List<String> queryParams = parse.getQueryParameters(paramName);
                int i11 = 1;
                if (queryParams.size() > 1) {
                    throw new IllegalArgumentException(V.e.a("Query parameter ", paramName, " must only be present once in ", str, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                }
                Intrinsics.checkNotNullExpressionValue(queryParams, "queryParams");
                String queryParam = (String) C7714v.M(queryParams);
                if (queryParam == null) {
                    a11.f2466i = true;
                    queryParam = paramName;
                }
                Matcher matcher = f2457r.matcher(queryParam);
                c cVar = new c();
                int i12 = 0;
                while (matcher.find()) {
                    String group = matcher.group(i11);
                    Intrinsics.g(group, "null cannot be cast to non-null type kotlin.String");
                    cVar.a(group);
                    Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                    String substring = queryParam.substring(i12, matcher.start());
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    sb2.append(Pattern.quote(substring));
                    sb2.append("(.+?)?");
                    i12 = matcher.end();
                    i11 = 1;
                }
                if (i12 < queryParam.length()) {
                    Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                    String substring2 = queryParam.substring(i12);
                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                    sb2.append(Pattern.quote(substring2));
                }
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "argRegex.toString()");
                cVar.d(kotlin.text.h.X(sb3, W2.DEFAULT_PROPAGATION_TARGETS, "\\E.*\\Q", false));
                Intrinsics.checkNotNullExpressionValue(paramName, "paramName");
                linkedHashMap.put(paramName, cVar);
            }
        }
        return linkedHashMap;
    }

    private static void g(String str, StringBuilder sb2, ArrayList arrayList) {
        Matcher matcher = f2457r.matcher(str);
        int i11 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            Intrinsics.g(group, "null cannot be cast to non-null type kotlin.String");
            arrayList.add(group);
            if (matcher.start() > i11) {
                String substring = str.substring(i11, matcher.start());
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                sb2.append(Pattern.quote(substring));
            }
            sb2.append("([^/]*?|)");
            i11 = matcher.end();
        }
        if (i11 < str.length()) {
            String substring2 = str.substring(i11);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            sb2.append(Pattern.quote(substring2));
        }
    }

    private final boolean m(Matcher matcher, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.f2461d;
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            String str = (String) next;
            String value = Uri.decode(matcher.group(i12));
            C2578g c2578g = (C2578g) linkedHashMap.get(str);
            try {
                Intrinsics.checkNotNullExpressionValue(value, "value");
                s(bundle, str, value, c2578g);
                arrayList2.add(Unit.f71690a);
                i11 = i12;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [Sc.j, java.lang.Object] */
    private final boolean n(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        boolean z11;
        int i11;
        Object obj;
        boolean z12;
        String query;
        for (Map.Entry entry : ((Map) this.f2465h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            c cVar = (c) entry.getValue();
            List<String> inputParams = uri.getQueryParameters(str);
            if (this.f2466i && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                inputParams = C7714v.a0(query);
            }
            Intrinsics.checkNotNullExpressionValue(inputParams, "inputParams");
            int i12 = 0;
            Bundle bundle2 = androidx.core.os.d.b(new Pair[0]);
            Iterator it = cVar.b().iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                C2578g c2578g = (C2578g) linkedHashMap.get(str2);
                W<Object> a11 = c2578g != null ? c2578g.a() : null;
                if ((a11 instanceof AbstractC2574c) && !c2578g.b()) {
                    a11.f(bundle2, str2, ((AbstractC2574c) a11).g());
                }
            }
            for (String str3 : inputParams) {
                String c11 = cVar.c();
                Matcher matcher = c11 != null ? Pattern.compile(c11, 32).matcher(str3) : null;
                if (matcher == null || !matcher.matches()) {
                    return i12;
                }
                ArrayList b11 = cVar.b();
                ArrayList arrayList = new ArrayList(C7714v.z(b11, 10));
                Iterator it2 = b11.iterator();
                int i13 = i12;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    String key = (String) next;
                    String group = matcher.group(i14);
                    if (group == null) {
                        group = "";
                        z11 = true;
                    } else {
                        z11 = true;
                        Intrinsics.checkNotNullExpressionValue(group, "argMatcher.group(index + 1) ?: \"\"");
                    }
                    C2578g c2578g2 = (C2578g) linkedHashMap.get(key);
                    try {
                        if (bundle2.containsKey(key)) {
                            if (bundle2.containsKey(key)) {
                                if (c2578g2 != null) {
                                    W<Object> a12 = c2578g2.a();
                                    i11 = i12;
                                    try {
                                        Object a13 = a12.a(bundle2, key);
                                        Intrinsics.checkNotNullParameter(bundle2, "bundle");
                                        Intrinsics.checkNotNullParameter(key, "key");
                                        if (!bundle2.containsKey(key)) {
                                            throw new IllegalArgumentException("There is no previous value in this bundle.");
                                        }
                                        a12.f(bundle2, key, a12.d(a13, group));
                                    } catch (IllegalArgumentException unused) {
                                        obj = Unit.f71690a;
                                        arrayList.add(obj);
                                        i13 = i14;
                                        i12 = i11;
                                    }
                                } else {
                                    i11 = i12;
                                }
                                z12 = i11;
                            } else {
                                i11 = i12;
                                z12 = z11;
                            }
                            try {
                                obj = Boolean.valueOf(z12);
                            } catch (IllegalArgumentException unused2) {
                                obj = Unit.f71690a;
                                arrayList.add(obj);
                                i13 = i14;
                                i12 = i11;
                            }
                        } else {
                            s(bundle2, key, group, c2578g2);
                            obj = Unit.f71690a;
                            i11 = i12;
                        }
                    } catch (IllegalArgumentException unused3) {
                        i11 = i12;
                    }
                    arrayList.add(obj);
                    i13 = i14;
                    i12 = i11;
                }
            }
            bundle.putAll(bundle2);
        }
        return true;
    }

    private static void s(Bundle bundle, String key, String value, C2578g c2578g) {
        if (c2578g == null) {
            bundle.putString(key, value);
            return;
        }
        W<Object> a11 = c2578g.a();
        a11.getClass();
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        a11.f(bundle, key, a11.g(value));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof A)) {
            A a11 = (A) obj;
            if (Intrinsics.d(this.f2458a, a11.f2458a) && Intrinsics.d(this.f2459b, a11.f2459b) && Intrinsics.d(this.f2460c, a11.f2460c)) {
                return true;
            }
        }
        return false;
    }

    public final int h(Uri uri) {
        String str;
        if (uri == null || (str = this.f2458a) == null) {
            return 0;
        }
        List<String> requestedPathSegments = uri.getPathSegments();
        List<String> uriPathSegments = Uri.parse(str).getPathSegments();
        Intrinsics.checkNotNullExpressionValue(requestedPathSegments, "requestedPathSegments");
        Intrinsics.checkNotNullExpressionValue(uriPathSegments, "uriPathSegments");
        return C7714v.T(requestedPathSegments, uriPathSegments).size();
    }

    public final int hashCode() {
        String str = this.f2458a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f2459b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f2460c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String i() {
        return this.f2459b;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final ArrayList j() {
        ArrayList arrayList = this.f2461d;
        Collection values = ((Map) this.f2465h.getValue()).values();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            C7714v.p(((c) it.next()).b(), arrayList2);
        }
        return C7714v.p0((List) this.f2468k.getValue(), C7714v.p0(arrayList2, arrayList));
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [Sc.j, java.lang.Object] */
    public final Bundle k(@NotNull Uri deepLink, @NotNull LinkedHashMap arguments) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Pattern pattern = (Pattern) this.f2463f.getValue();
        Matcher matcher = pattern != null ? pattern.matcher(deepLink.toString()) : null;
        if (matcher != null && matcher.matches()) {
            Bundle bundle = new Bundle();
            if (m(matcher, bundle, arguments) && (!((Boolean) this.f2464g.getValue()).booleanValue() || n(deepLink, bundle, arguments))) {
                String fragment = deepLink.getFragment();
                Pattern pattern2 = (Pattern) this.f2470m.getValue();
                Matcher matcher2 = pattern2 != null ? pattern2.matcher(String.valueOf(fragment)) : null;
                if (matcher2 != null && matcher2.matches()) {
                    List list = (List) this.f2468k.getValue();
                    ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                    int i11 = 0;
                    for (Object obj : list) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            C7714v.O0();
                            throw null;
                        }
                        String str = (String) obj;
                        String value = Uri.decode(matcher2.group(i12));
                        C2578g c2578g = (C2578g) arguments.get(str);
                        try {
                            Intrinsics.checkNotNullExpressionValue(value, "value");
                            s(bundle, str, value, c2578g);
                            arrayList.add(Unit.f71690a);
                            i11 = i12;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (C2580i.a(arguments, new B(bundle)).isEmpty()) {
                    return bundle;
                }
            }
        }
        return null;
    }

    @NotNull
    public final Bundle l(Uri uri, @NotNull LinkedHashMap arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Bundle bundle = new Bundle();
        if (uri != null) {
            Pattern pattern = (Pattern) this.f2463f.getValue();
            Matcher matcher = pattern != null ? pattern.matcher(uri.toString()) : null;
            if (matcher != null && matcher.matches()) {
                m(matcher, bundle, arguments);
                if (((Boolean) this.f2464g.getValue()).booleanValue()) {
                    n(uri, bundle, arguments);
                }
            }
        }
        return bundle;
    }

    public final String o() {
        return this.f2460c;
    }

    public final int p(@NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        String str = this.f2460c;
        if (str == null) {
            return -1;
        }
        Pattern pattern = (Pattern) this.f2472o.getValue();
        Intrinsics.f(pattern);
        if (pattern.matcher(mimeType).matches()) {
            return new b(str).compareTo(new b(mimeType));
        }
        return -1;
    }

    public final String q() {
        return this.f2458a;
    }

    public final boolean r() {
        return this.f2473p;
    }
}
