package androidx.compose.material;

import J0.InterfaceC3268b;
import S0.A1;
import S0.C0;
import S0.C3985t0;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import androidx.compose.material.C5204b;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.InterfaceC8002m;
import m0.T0;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.material.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5210h<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f40042a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f40043b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final T0 f40044c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<T, Boolean> f40045d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C5221t f40046e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C5213k f40047f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C3991w0 f40048g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final A1 f40049h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final A1 f40050i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C3985t0 f40051j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final A1 f40052k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C3985t0 f40053l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final C3991w0 f40054m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final C3991w0 f40055n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final C5211i f40056o;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {585}, m = "anchoredDrag")
    /* renamed from: androidx.compose.material.h$a */
    static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        C5210h f40057d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f40058e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C5210h<T> f40059f;

        /* renamed from: g, reason: collision with root package name */
        int f40060g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5210h<T> c5210h, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f40059f = c5210h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40058e = obj;
            this.f40060g |= LinearLayoutManager.INVALID_OFFSET;
            return this.f40059f.h(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {587}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.h$b */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f40061d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C5210h<T> f40062e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f40063f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6512o<InterfaceC3268b, J0.M<T>, T, kotlin.coroutines.d<? super Unit>, Object> f40064g;

        /* renamed from: androidx.compose.material.h$b$a */
        static final class a extends AbstractC7737t implements Function0<Pair<? extends J0.M<T>, ? extends T>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C5210h<T> f40065b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C5210h<T> c5210h) {
                super(0);
                this.f40065b = c5210h;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                C5210h<T> c5210h = this.f40065b;
                return new Pair(c5210h.l(), c5210h.t());
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {590}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material.h$b$b, reason: collision with other inner class name */
        static final class C0740b extends kotlin.coroutines.jvm.internal.j implements Function2<Pair<? extends J0.M<T>, ? extends T>, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f40066d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f40067e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC6512o<InterfaceC3268b, J0.M<T>, T, kotlin.coroutines.d<? super Unit>, Object> f40068f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C5210h<T> f40069g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0740b(InterfaceC6512o<? super InterfaceC3268b, ? super J0.M<T>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6512o, C5210h<T> c5210h, kotlin.coroutines.d<? super C0740b> dVar) {
                super(2, dVar);
                this.f40068f = interfaceC6512o;
                this.f40069g = c5210h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                C0740b c0740b = new C0740b(this.f40068f, this.f40069g, dVar);
                c0740b.f40067e = obj;
                return c0740b;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0740b) create((Pair) obj, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f40066d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    Pair pair = (Pair) this.f40067e;
                    J0.M m11 = (J0.M) pair.a();
                    Object b11 = pair.b();
                    C5211i c5211i = ((C5210h) this.f40069g).f40056o;
                    this.f40066d = 1;
                    if (((C5204b.a) this.f40068f).invoke(c5211i, m11, b11, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(C5210h<T> c5210h, T t2, InterfaceC6512o<? super InterfaceC3268b, ? super J0.M<T>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6512o, kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
            this.f40062e = c5210h;
            this.f40063f = t2;
            this.f40064g = interfaceC6512o;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
            return new b(this.f40062e, this.f40063f, this.f40064g, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f40061d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C5210h<T> c5210h = this.f40062e;
                C5210h.e(c5210h, this.f40063f);
                a aVar2 = new a(c5210h);
                C0740b c0740b = new C0740b(this.f40064g, c5210h, null);
                this.f40061d = 1;
                if (C5204b.b(aVar2, c0740b, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public C5210h() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5210h(Object obj, @NotNull Function1 function1, @NotNull Function0 function0, @NotNull T0 t02, @NotNull Function1 function12) {
        C3991w0 f7;
        C3991w0 f11;
        C3991w0 f12;
        this.f40042a = (AbstractC7737t) function1;
        this.f40043b = (AbstractC7737t) function0;
        this.f40044c = t02;
        this.f40045d = function12;
        this.f40046e = new C5221t();
        this.f40047f = new C5213k(this);
        f7 = n1.f(obj, D1.f25195a);
        this.f40048g = f7;
        this.f40049h = n1.e(new C5215m(this));
        this.f40050i = n1.e(new C5212j(this));
        this.f40051j = C0.a(Float.NaN);
        this.f40052k = n1.d(n1.n(), new C5214l(this));
        this.f40053l = C0.a(0.0f);
        f11 = n1.f(null, D1.f25195a);
        this.f40054m = f11;
        f12 = n1.f(new C5223v(kotlin.collections.U.c()), D1.f25195a);
        this.f40055n = f12;
        this.f40056o = new C5211i(this);
    }

    public static final Object c(C5210h c5210h) {
        return c5210h.f40054m.getValue();
    }

    public static final void e(C5210h c5210h, Object obj) {
        c5210h.f40054m.setValue(obj);
    }

    public static final void f(C5210h c5210h, float f7) {
        c5210h.f40053l.h(f7);
    }

    public static final void g(C5210h c5210h, float f7) {
        c5210h.f40051j.h(f7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    public final Object j(float f7, float f11, Object obj) {
        J0.M<T> l11 = l();
        float e11 = l11.e(obj);
        float floatValue = ((Number) this.f40043b.invoke()).floatValue();
        if (e11 != f7 && !Float.isNaN(e11)) {
            ?? r42 = this.f40042a;
            if (e11 < f7) {
                if (f11 >= floatValue) {
                    T a11 = l11.a(f7, true);
                    Intrinsics.f(a11);
                    return a11;
                }
                T a12 = l11.a(f7, true);
                Intrinsics.f(a12);
                if (f7 >= Math.abs(Math.abs(((Number) r42.invoke(Float.valueOf(Math.abs(l11.e(a12) - e11)))).floatValue()) + e11)) {
                    return a12;
                }
            } else {
                if (f11 <= (-floatValue)) {
                    T a13 = l11.a(f7, false);
                    Intrinsics.f(a13);
                    return a13;
                }
                T a14 = l11.a(f7, false);
                Intrinsics.f(a14);
                float abs = Math.abs(e11 - Math.abs(((Number) r42.invoke(Float.valueOf(Math.abs(e11 - l11.e(a14))))).floatValue()));
                if (f7 >= 0.0f ? f7 <= abs : Math.abs(f7) >= abs) {
                    return a14;
                }
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(T t2) {
        this.f40048g.setValue(t2);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(T t2, @NotNull EnumC8372M enumC8372M, @NotNull InterfaceC6512o<? super InterfaceC3268b, ? super J0.M<T>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6512o, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        int i11;
        C5210h<T> c5210h;
        C5221t c5221t;
        b bVar;
        T b11;
        T b12;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f40060g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f40060g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f40058e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f40060g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (!l().c(t2)) {
                        x(t2);
                        return Unit.f71690a;
                    }
                    try {
                        c5221t = this.f40046e;
                        bVar = new b(this, t2, interfaceC6512o, null);
                        aVar.f40057d = this;
                        aVar.f40060g = 1;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        c5221t.getClass();
                        if (xe.N.d(new C5222u(enumC8372M, c5221t, bVar, null), aVar) == aVar2) {
                            return aVar2;
                        }
                        c5210h = this;
                    } catch (Throwable th3) {
                        th = th3;
                        c5210h = this;
                        c5210h.f40054m.setValue(null);
                        J0.M<T> l11 = c5210h.l();
                        C3985t0 c3985t0 = c5210h.f40051j;
                        b11 = l11.b(c3985t0.getFloatValue());
                        if (b11 != null) {
                            c5210h.x(b11);
                        }
                        throw th;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c5210h = aVar.f40057d;
                    try {
                        Sc.s.b(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        c5210h.f40054m.setValue(null);
                        J0.M<T> l112 = c5210h.l();
                        C3985t0 c3985t02 = c5210h.f40051j;
                        b11 = l112.b(c3985t02.getFloatValue());
                        if (b11 != null && Math.abs(c3985t02.getFloatValue() - c5210h.l().e(b11)) <= 0.5f && c5210h.f40045d.invoke(b11).booleanValue()) {
                            c5210h.x(b11);
                        }
                        throw th;
                    }
                }
                c5210h.f40054m.setValue(null);
                J0.M<T> l12 = c5210h.l();
                C3985t0 c3985t03 = c5210h.f40051j;
                b12 = l12.b(c3985t03.getFloatValue());
                if (b12 != null && Math.abs(c3985t03.getFloatValue() - c5210h.l().e(b12)) <= 0.5f && c5210h.f40045d.invoke(b12).booleanValue()) {
                    c5210h.x(b12);
                }
                return Unit.f71690a;
            }
        }
        aVar = new a(this, dVar);
        Object obj2 = aVar.f40058e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f40060g;
        if (i11 != 0) {
        }
        c5210h.f40054m.setValue(null);
        J0.M<T> l122 = c5210h.l();
        C3985t0 c3985t032 = c5210h.f40051j;
        b12 = l122.b(c3985t032.getFloatValue());
        if (b12 != null) {
            c5210h.x(b12);
        }
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(@NotNull EnumC8372M enumC8372M, @NotNull InterfaceC6511n interfaceC6511n, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C5208f c5208f;
        int i11;
        C5210h<T> c5210h;
        C5221t c5221t;
        C5209g c5209g;
        T b11;
        T b12;
        if (cVar instanceof C5208f) {
            c5208f = (C5208f) cVar;
            int i12 = c5208f.f40033g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c5208f.f40033g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c5208f.f40031e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c5208f.f40033g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    try {
                        c5221t = this.f40046e;
                        c5209g = new C5209g(this, interfaceC6511n, null);
                        c5208f.f40030d = this;
                        c5208f.f40033g = 1;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        c5221t.getClass();
                        if (xe.N.d(new C5222u(enumC8372M, c5221t, c5209g, null), c5208f) == aVar) {
                            return aVar;
                        }
                        c5210h = this;
                    } catch (Throwable th3) {
                        th = th3;
                        c5210h = this;
                        J0.M<T> l11 = c5210h.l();
                        C3985t0 c3985t0 = c5210h.f40051j;
                        b11 = l11.b(c3985t0.getFloatValue());
                        if (b11 != null) {
                            c5210h.x(b11);
                        }
                        throw th;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c5210h = c5208f.f40030d;
                    try {
                        Sc.s.b(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        J0.M<T> l112 = c5210h.l();
                        C3985t0 c3985t02 = c5210h.f40051j;
                        b11 = l112.b(c3985t02.getFloatValue());
                        if (b11 != null && Math.abs(c3985t02.getFloatValue() - c5210h.l().e(b11)) <= 0.5f && c5210h.f40045d.invoke(b11).booleanValue()) {
                            c5210h.x(b11);
                        }
                        throw th;
                    }
                }
                J0.M<T> l12 = c5210h.l();
                C3985t0 c3985t03 = c5210h.f40051j;
                b12 = l12.b(c3985t03.getFloatValue());
                if (b12 != null && Math.abs(c3985t03.getFloatValue() - c5210h.l().e(b12)) <= 0.5f && c5210h.f40045d.invoke(b12).booleanValue()) {
                    c5210h.x(b12);
                }
                return Unit.f71690a;
            }
        }
        c5208f = new C5208f(this, cVar);
        Object obj2 = c5208f.f40031e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c5208f.f40033g;
        if (i11 != 0) {
        }
        J0.M<T> l122 = c5210h.l();
        C3985t0 c3985t032 = c5210h.f40051j;
        b12 = l122.b(c3985t032.getFloatValue());
        if (b12 != null) {
            c5210h.x(b12);
        }
        return Unit.f71690a;
    }

    public final float k(float f7) {
        float v11 = v(f7);
        C3985t0 c3985t0 = this.f40051j;
        float floatValue = Float.isNaN(c3985t0.getFloatValue()) ? 0.0f : c3985t0.getFloatValue();
        c3985t0.h(v11);
        return v11 - floatValue;
    }

    @NotNull
    public final J0.M<T> l() {
        return (J0.M) this.f40055n.getValue();
    }

    @NotNull
    public final InterfaceC8002m<Float> m() {
        return this.f40044c;
    }

    public final T n() {
        return (T) this.f40050i.getValue();
    }

    @NotNull
    public final Function1<T, Boolean> o() {
        return this.f40045d;
    }

    public final T p() {
        return this.f40048g.getValue();
    }

    @NotNull
    public final C5213k q() {
        return this.f40047f;
    }

    public final float r() {
        return this.f40053l.getFloatValue();
    }

    public final float s() {
        return this.f40051j.getFloatValue();
    }

    public final T t() {
        return (T) this.f40049h.getValue();
    }

    public final boolean u() {
        return this.f40054m.getValue() != null;
    }

    public final float v(float f7) {
        C3985t0 c3985t0 = this.f40051j;
        return kotlin.ranges.h.d((Float.isNaN(c3985t0.getFloatValue()) ? 0.0f : c3985t0.getFloatValue()) + f7, l().d(), l().f());
    }

    public final float w() {
        C3985t0 c3985t0 = this.f40051j;
        if (Float.isNaN(c3985t0.getFloatValue())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return c3985t0.getFloatValue();
    }

    public final Object y(float f7, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        T value = this.f40048g.getValue();
        Object j11 = j(w(), f7, value);
        if (((Boolean) this.f40045d.invoke(j11)).booleanValue()) {
            Object c11 = C5204b.c(this, j11, f7, cVar);
            return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : Unit.f71690a;
        }
        Object c12 = C5204b.c(this, value, f7, cVar);
        return c12 == Wc.a.COROUTINE_SUSPENDED ? c12 : Unit.f71690a;
    }

    public final void z(@NotNull J0.M<T> m11, T t2) {
        if (Intrinsics.d(l(), m11)) {
            return;
        }
        this.f40055n.setValue(m11);
        if (this.f40046e.d(new C5216n(this, t2))) {
            return;
        }
        this.f40054m.setValue(t2);
    }

    public C5210h(Boolean bool, J0.M m11, Function1 function1, Function0 function0, T0 t02) {
        this(bool, function1, function0, t02, C5207e.f40016b);
        this.f40055n.setValue(m11);
        this.f40046e.d(new C5216n(this, bool));
    }
}
