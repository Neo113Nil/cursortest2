package B1;

import S0.AbstractC3984t;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final A0 f2165a;

    /* renamed from: b, reason: collision with root package name */
    private L f2166b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<D1.H, y0, Unit> f2167c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<D1.H, AbstractC3984t, Unit> f2168d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function2<D1.H, Function2<? super z0, ? super Z1.b, ? extends W>, Unit> f2169e;

    public interface a {
        default int b() {
            return 0;
        }

        default void c(@NotNull Function1 function1) {
        }

        default void d(int i11, long j11) {
        }

        void dispose();
    }

    static final class b extends AbstractC7737t implements Function2<D1.H, AbstractC3984t, Unit> {
        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(D1.H h11, AbstractC3984t abstractC3984t) {
            y0.b(y0.this).A(abstractC3984t);
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function2<D1.H, Function2<? super z0, ? super Z1.b, ? extends W>, Unit> {
        c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(D1.H h11, Function2<? super z0, ? super Z1.b, ? extends W> function2) {
            h11.h(y0.b(y0.this).t(function2));
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function2<D1.H, y0, Unit> {
        d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(D1.H h11, y0 y0Var) {
            D1.H h12 = h11;
            L j02 = h12.j0();
            y0 y0Var2 = y0.this;
            if (j02 == null) {
                j02 = new L(h12, y0Var2.f2165a);
                h12.q1(j02);
            }
            y0Var2.f2166b = j02;
            y0.b(y0Var2).w();
            y0.b(y0Var2).B(y0Var2.f2165a);
            return Unit.f71690a;
        }
    }

    public y0(@NotNull A0 a02) {
        this.f2165a = a02;
        this.f2167c = new d();
        this.f2168d = new b();
        this.f2169e = new c();
    }

    public static final L b(y0 y0Var) {
        L l11 = y0Var.f2166b;
        if (l11 != null) {
            return l11;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public final void d() {
        L l11 = this.f2166b;
        if (l11 == null) {
            throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
        }
        l11.v();
    }

    @NotNull
    public final Function2<D1.H, AbstractC3984t, Unit> e() {
        return this.f2168d;
    }

    @NotNull
    public final Function2<D1.H, Function2<? super z0, ? super Z1.b, ? extends W>, Unit> f() {
        return this.f2169e;
    }

    @NotNull
    public final Function2<D1.H, y0, Unit> g() {
        return this.f2167c;
    }

    @NotNull
    public final a h(Object obj, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> function2) {
        L l11 = this.f2166b;
        if (l11 != null) {
            return l11.z(obj, function2);
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public y0() {
        this(e0.f2109a);
    }
}
