package I0;

import S0.A1;
import S0.InterfaceC3967k;
import S0.n1;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import m0.C7980b;
import m0.C8006o;
import m0.C8010q;
import m0.C8011q0;
import org.jetbrains.annotations.NotNull;

/* renamed from: I0.r0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3205r0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C8010q f11586a = new C8010q(Float.NaN, Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final m0.U0<C7459e, C8010q> f11587b = m0.W0.a(a.f11591b, b.f11592b);

    /* renamed from: c, reason: collision with root package name */
    private static final long f11588c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final C8011q0<C7459e> f11589d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f11590e = 0;

    /* renamed from: I0.r0$a */
    static final class a extends AbstractC7737t implements Function1<C7459e, C8010q> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f11591b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final C8010q invoke(C7459e c7459e) {
            long n11 = c7459e.n();
            return P9.a.d(n11) ? new C8010q(C7459e.g(n11), C7459e.h(n11)) : C3205r0.f11586a;
        }
    }

    /* renamed from: I0.r0$b */
    static final class b extends AbstractC7737t implements Function1<C8010q, C7459e> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f11592b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final C7459e invoke(C8010q c8010q) {
            C8010q c8010q2 = c8010q;
            return C7459e.a(P9.a.a(c8010q2.f(), c8010q2.g()));
        }
    }

    static {
        long a11 = P9.a.a(0.01f, 0.01f);
        f11588c = a11;
        f11589d = new C8011q0<>(C7459e.a(a11), 3);
    }

    public static final C8006o b(Function0 function0, InterfaceC3967k interfaceC3967k) {
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = n1.e(function0);
            interfaceC3967k.x(C11);
        }
        A1 a12 = (A1) C11;
        Object C12 = interfaceC3967k.C();
        if (C12 == InterfaceC3967k.a.a()) {
            C12 = new C7980b(C7459e.a(((C7459e) a12.getValue()).n()), f11587b, C7459e.a(f11588c), 8);
            interfaceC3967k.x(C12);
        }
        C7980b c7980b = (C7980b) C12;
        Unit unit = Unit.f71690a;
        boolean F11 = interfaceC3967k.F(c7980b);
        Object C13 = interfaceC3967k.C();
        if (F11 || C13 == InterfaceC3967k.a.a()) {
            C13 = new C3211u0(c7980b, a12, null);
            interfaceC3967k.x(C13);
        }
        S0.Q.e(interfaceC3967k, unit, (Function2) C13);
        return c7980b.g();
    }

    @NotNull
    public static final C8011q0<C7459e> c() {
        return f11589d;
    }

    public static final long d() {
        return f11588c;
    }

    @NotNull
    public static final m0.U0<C7459e, C8010q> e() {
        return f11587b;
    }
}
