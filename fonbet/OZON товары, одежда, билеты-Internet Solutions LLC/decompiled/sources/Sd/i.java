package Sd;

import io.sentry.protocol.DebugImage;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final c f26151a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final c f26152b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final c f26153c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final c f26154d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final c f26155e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final c f26156f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final c f26157g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final Set<c> f26158h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final Set<c> f26159i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final b f26160j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private static final b f26161k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private static final b f26162l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private static final b f26163m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private static final b f26164n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private static final b f26165o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private static final b f26166p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private static final b f26167q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private static final b f26168r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private static final b f26169s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private static final Set<b> f26170t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private static final Set<b> f26171u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private static final Set<b> f26172v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private static final b f26173w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private static final b f26174x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private static final b f26175y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private static final b f26176z;

    static {
        c cVar = new c("kotlin");
        f26151a = cVar;
        c c11 = cVar.c(f.f("reflect"));
        Intrinsics.checkNotNullExpressionValue(c11, "child(...)");
        f26152b = c11;
        c c12 = cVar.c(f.f("collections"));
        Intrinsics.checkNotNullExpressionValue(c12, "child(...)");
        f26153c = c12;
        c c13 = cVar.c(f.f("ranges"));
        Intrinsics.checkNotNullExpressionValue(c13, "child(...)");
        f26154d = c13;
        c c14 = cVar.c(f.f(DebugImage.JVM));
        Intrinsics.checkNotNullExpressionValue(c14, "child(...)");
        Intrinsics.checkNotNullExpressionValue(c14.c(f.f("internal")), "child(...)");
        Intrinsics.checkNotNullExpressionValue(c14.c(f.f("functions")), "child(...)");
        c c15 = cVar.c(f.f("annotation"));
        Intrinsics.checkNotNullExpressionValue(c15, "child(...)");
        f26155e = c15;
        c c16 = cVar.c(f.f("internal"));
        Intrinsics.checkNotNullExpressionValue(c16, "child(...)");
        Intrinsics.checkNotNullExpressionValue(c16.c(f.f("ir")), "child(...)");
        c c17 = cVar.c(f.f("coroutines"));
        Intrinsics.checkNotNullExpressionValue(c17, "child(...)");
        f26156f = c17;
        c c18 = cVar.c(f.f("enums"));
        Intrinsics.checkNotNullExpressionValue(c18, "child(...)");
        f26157g = c18;
        Intrinsics.checkNotNullExpressionValue(cVar.c(f.f("contracts")), "child(...)");
        Intrinsics.checkNotNullExpressionValue(cVar.c(f.f("concurrent")), "child(...)");
        Intrinsics.checkNotNullExpressionValue(cVar.c(f.f("test")), "child(...)");
        c[] elements = {cVar, c12, c13, c15};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f26158h = C7705l.j0(elements);
        c[] elements2 = {cVar, c12, c13, c15, c11, c16, c17};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        f26159i = C7705l.j0(elements2);
        j.a("Nothing");
        f26160j = j.a("Unit");
        f26161k = j.a("Any");
        f26162l = j.a("Enum");
        j.a("Annotation");
        f26163m = j.a("Array");
        b a11 = j.a("Boolean");
        b a12 = j.a("Char");
        b a13 = j.a("Byte");
        b a14 = j.a("Short");
        b a15 = j.a("Int");
        b a16 = j.a("Long");
        b a17 = j.a("Float");
        b a18 = j.a("Double");
        f26164n = j.g(a13);
        f26165o = j.g(a14);
        f26166p = j.g(a15);
        f26167q = j.g(a16);
        j.a("CharSequence");
        f26168r = j.a("String");
        j.a("Throwable");
        j.a("Cloneable");
        j.f("KProperty");
        j.f("KMutableProperty");
        j.f("KProperty0");
        j.f("KMutableProperty0");
        j.f("KProperty1");
        j.f("KMutableProperty1");
        j.f("KProperty2");
        j.f("KMutableProperty2");
        f26169s = j.f("KFunction");
        j.f("KClass");
        j.f("KCallable");
        j.f("KType");
        j.a("Comparable");
        j.a("Number");
        j.a("Function");
        b[] elements3 = {a11, a12, a13, a14, a15, a16, a17, a18};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        Set<b> j02 = C7705l.j0(elements3);
        f26170t = j02;
        b[] elements4 = {a13, a14, a15, a16};
        Intrinsics.checkNotNullParameter(elements4, "elements");
        f26171u = C7705l.j0(elements4);
        Set<b> set = j02;
        int h11 = U.h(C7714v.z(set, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (Object obj : set) {
            linkedHashMap.put(obj, j.d(((b) obj).h()));
        }
        j.c(linkedHashMap);
        b[] elements5 = {f26164n, f26165o, f26166p, f26167q};
        Intrinsics.checkNotNullParameter(elements5, "elements");
        Set<b> j03 = C7705l.j0(elements5);
        f26172v = j03;
        Set<b> set2 = j03;
        int h12 = U.h(C7714v.z(set2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(h12 >= 16 ? h12 : 16);
        for (Object obj2 : set2) {
            linkedHashMap2.put(obj2, j.d(((b) obj2).h()));
        }
        j.c(linkedHashMap2);
        Set<b> set3 = f26170t;
        Set<b> set4 = f26172v;
        LinkedHashSet f7 = e0.f(set3, set4);
        b bVar = f26168r;
        e0.g(f7, bVar);
        c cVar2 = f26156f;
        f f11 = f.f("Continuation");
        Intrinsics.checkNotNullExpressionValue(f11, "identifier(...)");
        new b(cVar2, f11);
        j.b("Iterator");
        j.b("Iterable");
        j.b("Collection");
        j.b("List");
        j.b("ListIterator");
        j.b("Set");
        b b11 = j.b("Map");
        j.b("MutableIterator");
        j.b("CharIterator");
        j.b("MutableIterable");
        j.b("MutableCollection");
        f26173w = j.b("MutableList");
        j.b("MutableListIterator");
        f26174x = j.b("MutableSet");
        b b12 = j.b("MutableMap");
        f26175y = b12;
        f f12 = f.f("Entry");
        Intrinsics.checkNotNullExpressionValue(f12, "identifier(...)");
        b11.d(f12);
        f f13 = f.f("MutableEntry");
        Intrinsics.checkNotNullExpressionValue(f13, "identifier(...)");
        b12.d(f13);
        j.a("Result");
        j.e("IntRange");
        j.e("LongRange");
        j.e("CharRange");
        c b13 = b();
        f f14 = f.f("AnnotationRetention");
        Intrinsics.checkNotNullExpressionValue(f14, "identifier(...)");
        new b(b13, f14);
        c b14 = b();
        f f15 = f.f("AnnotationTarget");
        Intrinsics.checkNotNullExpressionValue(f15, "identifier(...)");
        new b(b14, f15);
        j.a("DeprecationLevel");
        c cVar3 = f26157g;
        f f16 = f.f("EnumEntries");
        Intrinsics.checkNotNullExpressionValue(f16, "identifier(...)");
        f26176z = new b(cVar3, f16);
        e0.g(e0.g(e0.g(e0.g(e0.f(set3, set4), bVar), f26160j), f26161k), f26162l);
    }

    @NotNull
    public static b a() {
        return f26163m;
    }

    @NotNull
    public static c b() {
        return f26155e;
    }

    @NotNull
    public static c c() {
        return f26153c;
    }

    @NotNull
    public static c d() {
        return f26151a;
    }

    @NotNull
    public static c e() {
        return f26154d;
    }

    @NotNull
    public static c f() {
        return f26152b;
    }

    @NotNull
    public static b g() {
        return f26176z;
    }

    @NotNull
    public static b h() {
        return f26169s;
    }

    @NotNull
    public static b i() {
        return f26173w;
    }

    @NotNull
    public static b j() {
        return f26175y;
    }

    @NotNull
    public static b k() {
        return f26174x;
    }
}
