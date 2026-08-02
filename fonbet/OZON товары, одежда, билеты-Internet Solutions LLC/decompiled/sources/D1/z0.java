package D1;

import c2.C5728b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c1.y f5577a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<H, Unit> f5578b = f.f5590b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<H, Unit> f5579c = g.f5591b;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<H, Unit> f5580d = h.f5592b;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<H, Unit> f5581e = b.f5586b;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function1<H, Unit> f5582f = c.f5587b;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Function1<H, Unit> f5583g = d.f5588b;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Function1<H, Unit> f5584h = e.f5589b;

    static final class a extends AbstractC7737t implements Function1<Object, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f5585b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
            return Boolean.valueOf(!((y0) obj).m0());
        }
    }

    static final class b extends AbstractC7737t implements Function1<H, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f5586b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(H h11) {
            H h12 = h11;
            if (h12.z0()) {
                h12.e1(false);
            }
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function1<H, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f5587b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(H h11) {
            H h12 = h11;
            if (h12.z0()) {
                h12.e1(false);
            }
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function1<H, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f5588b = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(H h11) {
            H h12 = h11;
            if (h12.z0()) {
                h12.c1(false);
            }
            return Unit.f71690a;
        }
    }

    static final class e extends AbstractC7737t implements Function1<H, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f5589b = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(H h11) {
            H h12 = h11;
            if (h12.z0()) {
                h12.c1(false);
            }
            return Unit.f71690a;
        }
    }

    static final class f extends AbstractC7737t implements Function1<H, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f5590b = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(H h11) {
            H h12 = h11;
            if (h12.z0()) {
                H.d1(h12, false, 7);
            }
            return Unit.f71690a;
        }
    }

    static final class g extends AbstractC7737t implements Function1<H, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f5591b = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(H h11) {
            H h12 = h11;
            if (h12.z0()) {
                H.f1(h12, false, 7);
            }
            return Unit.f71690a;
        }
    }

    static final class h extends AbstractC7737t implements Function1<H, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f5592b = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(H h11) {
            H h12 = h11;
            if (h12.z0()) {
                h12.x0();
            }
            return Unit.f71690a;
        }
    }

    public z0(@NotNull Function1<? super Function0<Unit>, Unit> function1) {
        this.f5577a = new c1.y(function1);
    }

    public final void a(@NotNull C5728b c5728b) {
        this.f5577a.i(c5728b);
    }

    public final void b() {
        this.f5577a.j(a.f5585b);
    }

    public final void c(@NotNull H h11, boolean z11, @NotNull Function0<Unit> function0) {
        if (!z11 || h11.U() == null) {
            f(h11, this.f5582f, function0);
        } else {
            f(h11, this.f5583g, function0);
        }
    }

    public final void d(@NotNull H h11, boolean z11, @NotNull Function0<Unit> function0) {
        if (!z11 || h11.U() == null) {
            f(h11, this.f5581e, function0);
        } else {
            f(h11, this.f5584h, function0);
        }
    }

    public final void e(@NotNull H h11, boolean z11, @NotNull Function0<Unit> function0) {
        if (!z11 || h11.U() == null) {
            f(h11, this.f5579c, function0);
        } else {
            f(h11, this.f5578b, function0);
        }
    }

    public final <T extends y0> void f(@NotNull T t2, @NotNull Function1<? super T, Unit> function1, @NotNull Function0<Unit> function0) {
        this.f5577a.k(t2, function1, function0);
    }

    public final void g(@NotNull H h11, @NotNull Function0<Unit> function0) {
        f(h11, this.f5580d, function0);
    }

    public final void h() {
        this.f5577a.l();
    }

    public final void i() {
        c1.y yVar = this.f5577a;
        yVar.m();
        yVar.h();
    }
}
