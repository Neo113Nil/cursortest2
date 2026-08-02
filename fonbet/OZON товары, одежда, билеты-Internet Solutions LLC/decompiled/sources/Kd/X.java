package Kd;

import Kd.f0;
import ae.EnumC5003e;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C3511h f15867a = new C3511h(EnumC3514k.NULLABLE, false);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C3511h f15868b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final C3511h f15869c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final LinkedHashMap f15870d;

    static {
        EnumC3514k enumC3514k = EnumC3514k.NOT_NULL;
        f15868b = new C3511h(enumC3514k, false);
        f15869c = new C3511h(enumC3514k, true);
        String f7 = Ld.G.f("Object");
        String e11 = Ld.G.e("Predicate");
        String e12 = Ld.G.e("Function");
        String e13 = Ld.G.e("Consumer");
        String e14 = Ld.G.e("BiFunction");
        String e15 = Ld.G.e("BiConsumer");
        String e16 = Ld.G.e("UnaryOperator");
        String g10 = Ld.G.g("stream/Stream");
        String g11 = Ld.G.g("Optional");
        f0 f0Var = new f0();
        new f0.a(f0Var, Ld.G.g("Iterator")).a("forEachRemaining", null, new C3516m(e13));
        new f0.a(f0Var, Ld.G.f("Iterable")).a("spliterator", null, new C3526x());
        f0.a aVar = new f0.a(f0Var, Ld.G.g("Collection"));
        aVar.a("removeIf", null, new C3502I(e11));
        aVar.a("stream", null, new P(g10));
        aVar.a("parallelStream", null, new Q(g10));
        f0.a aVar2 = new f0.a(f0Var, Ld.G.g("List"));
        aVar2.a("replaceAll", null, new S(e16));
        aVar2.a("addFirst", "2.1", new T(f7));
        aVar2.a("addLast", "2.1", new U(f7));
        aVar2.a("removeFirst", "2.1", new V(f7));
        aVar2.a("removeLast", "2.1", new W(f7));
        f0.a aVar3 = new f0.a(f0Var, Ld.G.g("LinkedList"));
        aVar3.a("addFirst", "2.1", new C3517n(f7));
        aVar3.a("addLast", "2.1", new C3518o(f7));
        aVar3.a("removeFirst", "2.1", new C3519p(f7));
        aVar3.a("removeLast", "2.1", new C3520q(f7));
        f0.a aVar4 = new f0.a(f0Var, Ld.G.g("Map"));
        aVar4.a("forEach", null, new r(e15));
        aVar4.a("putIfAbsent", null, new C3521s(f7));
        aVar4.a("replace", null, new C3522t(f7));
        aVar4.a("replace", null, new C3523u(f7));
        aVar4.a("replaceAll", null, new C3524v(e14));
        aVar4.a("compute", null, new C3525w(f7, e14));
        aVar4.a("computeIfAbsent", null, new C3527y(f7, e12));
        aVar4.a("computeIfPresent", null, new C3528z(f7, e14));
        aVar4.a("merge", null, new C3494A(f7, e14));
        f0.a aVar5 = new f0.a(f0Var, g11);
        aVar5.a("empty", null, new C3495B(g11));
        aVar5.a("of", null, new C3496C(f7, g11));
        aVar5.a("ofNullable", null, new C3497D(f7, g11));
        aVar5.a("get", null, new C3498E(f7));
        aVar5.a("ifPresent", null, new C3499F(e13));
        new f0.a(f0Var, Ld.G.f("ref/Reference")).a("get", null, new C3500G(f7));
        new f0.a(f0Var, e11).a("test", null, new C3501H(f7));
        new f0.a(f0Var, Ld.G.e("BiPredicate")).a("test", null, new C3503J(f7));
        new f0.a(f0Var, e13).a("accept", null, new K(f7));
        new f0.a(f0Var, e15).a("accept", null, new L(f7));
        new f0.a(f0Var, e12).a("apply", null, new M(f7));
        new f0.a(f0Var, e14).a("apply", null, new N(f7));
        new f0.a(f0Var, Ld.G.e("Supplier")).a("get", null, new O(f7));
        f15870d = f0Var.b();
    }

    static Unit A(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C3511h c3511h = f15868b;
        function.b(str, c3511h);
        function.b(str, c3511h);
        return Unit.f71690a;
    }

    static Unit B(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C3511h c3511h = f15868b;
        function.b(str, c3511h);
        function.d(str, c3511h);
        return Unit.f71690a;
    }

    static Unit C(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C3511h c3511h = f15868b;
        function.b(str, c3511h);
        function.b(str, c3511h);
        function.d(str, c3511h);
        return Unit.f71690a;
    }

    static Unit D(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.d(str, f15868b);
        return Unit.f71690a;
    }

    static Unit E(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C3511h c3511h = f15868b;
        function.d(str, c3511h, c3511h);
        return Unit.f71690a;
    }

    static Unit F(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C3511h c3511h = f15868b;
        function.b(str, c3511h, c3511h);
        return Unit.f71690a;
    }

    static Unit G(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.b(str, f15868b);
        return Unit.f71690a;
    }

    static Unit H(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.b(str, f15868b);
        return Unit.f71690a;
    }

    static Unit I(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.d(str, f15868b);
        return Unit.f71690a;
    }

    static Unit J(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.d(str, f15868b);
        return Unit.f71690a;
    }

    @NotNull
    public static final LinkedHashMap K() {
        return f15870d;
    }

    static Unit a(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C3511h c3511h = f15868b;
        function.b(str, c3511h, c3511h);
        return Unit.f71690a;
    }

    static Unit b(f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        String g10 = Ld.G.g("Spliterator");
        C3511h c3511h = f15868b;
        function.d(g10, c3511h, c3511h);
        return Unit.f71690a;
    }

    static Unit c(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.b(str, f15868b);
        return Unit.f71690a;
    }

    static Unit d(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.b(str, f15868b);
        return Unit.f71690a;
    }

    static Unit e(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.d(str, f15868b);
        return Unit.f71690a;
    }

    static Unit f(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.d(str, f15868b);
        return Unit.f71690a;
    }

    static Unit g(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C3511h c3511h = f15868b;
        function.b(str, c3511h, c3511h, c3511h);
        return Unit.f71690a;
    }

    static Unit h(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C3511h c3511h = f15868b;
        function.b(str, c3511h);
        function.b(str, c3511h);
        function.d(str, f15867a);
        return Unit.f71690a;
    }

    static Unit i(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C3511h c3511h = f15868b;
        function.b(str, c3511h);
        function.b(str, c3511h);
        function.d(str, f15867a);
        return Unit.f71690a;
    }

    static Unit j(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C3511h c3511h = f15868b;
        function.b(str, c3511h);
        function.b(str, c3511h);
        function.b(str, c3511h);
        function.c(EnumC5003e.BOOLEAN);
        return Unit.f71690a;
    }

    static Unit k(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C3511h c3511h = f15868b;
        function.b(str, c3511h, c3511h, c3511h, c3511h);
        return Unit.f71690a;
    }

    static Unit l(String str, String str2, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C3511h c3511h = f15868b;
        function.b(str, c3511h);
        C3511h c3511h2 = f15867a;
        function.b(str2, c3511h, c3511h, c3511h2, c3511h2);
        function.d(str, c3511h2);
        return Unit.f71690a;
    }

    static Unit m(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C3511h c3511h = f15868b;
        function.b(str, c3511h, c3511h);
        function.c(EnumC5003e.BOOLEAN);
        return Unit.f71690a;
    }

    static Unit n(String str, String str2, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C3511h c3511h = f15868b;
        function.b(str, c3511h);
        function.b(str2, c3511h, c3511h, c3511h);
        function.d(str, c3511h);
        return Unit.f71690a;
    }

    static Unit o(String str, String str2, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C3511h c3511h = f15868b;
        function.b(str, c3511h);
        C3511h c3511h2 = f15869c;
        C3511h c3511h3 = f15867a;
        function.b(str2, c3511h, c3511h, c3511h2, c3511h3);
        function.d(str, c3511h3);
        return Unit.f71690a;
    }

    static Unit p(String str, String str2, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C3511h c3511h = f15868b;
        function.b(str, c3511h);
        C3511h c3511h2 = f15869c;
        function.b(str, c3511h2);
        C3511h c3511h3 = f15867a;
        function.b(str2, c3511h, c3511h2, c3511h2, c3511h3);
        function.d(str, c3511h3);
        return Unit.f71690a;
    }

    static Unit q(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.d(str, f15868b, f15869c);
        return Unit.f71690a;
    }

    static Unit r(String str, String str2, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C3511h c3511h = f15869c;
        function.b(str, c3511h);
        function.d(str2, f15868b, c3511h);
        return Unit.f71690a;
    }

    static Unit s(String str, String str2, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.b(str, f15867a);
        function.d(str2, f15868b, f15869c);
        return Unit.f71690a;
    }

    static Unit t(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.d(str, f15869c);
        return Unit.f71690a;
    }

    static Unit u(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.b(str, f15868b, f15869c);
        return Unit.f71690a;
    }

    static Unit v(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.d(str, f15867a);
        return Unit.f71690a;
    }

    static Unit w(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.b(str, f15868b);
        function.c(EnumC5003e.BOOLEAN);
        return Unit.f71690a;
    }

    static Unit x(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C3511h c3511h = f15868b;
        function.d(str, c3511h, c3511h);
        return Unit.f71690a;
    }

    static Unit y(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C3511h c3511h = f15868b;
        function.b(str, c3511h);
        function.b(str, c3511h);
        function.c(EnumC5003e.BOOLEAN);
        return Unit.f71690a;
    }

    static Unit z(String str, f0.a.C0302a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.b(str, f15868b);
        return Unit.f71690a;
    }
}
