package Xa0;

import ef0.C6361a;
import gf0.AbstractC6729a;
import jf0.AbstractC7421a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Function1<kf0.c, Unit> f34235a = c.f34238b;

    /* renamed from: Xa0.a$a, reason: collision with other inner class name */
    public static final class C0612a extends AbstractC6729a {

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public static final C0612a f34236d = new C0612a("host_config_debug_menu_main_screen");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0612a);
        }

        public final int hashCode() {
            return -1890827470;
        }

        @NotNull
        public final String toString() {
            return "MainScreenDestination";
        }
    }

    public static final class b extends AbstractC7421a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f34237b = new b("host_config_debug_menu");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 745498179;
        }

        @NotNull
        public final String toString() {
            return "NavigationGraph";
        }
    }

    static final class c extends AbstractC7737t implements Function1<kf0.c, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f34238b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(kf0.c cVar) {
            kf0.c cVar2 = cVar;
            Intrinsics.checkNotNullParameter(cVar2, "<this>");
            C6361a.a(cVar2, b.f34237b, C0612a.f34236d, Xa0.c.f34240b);
            return Unit.f71690a;
        }
    }

    @NotNull
    public static Function1 a() {
        return f34235a;
    }
}
