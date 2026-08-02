package androidx.compose.foundation.gestures;

import S0.A1;
import S0.C0;
import S0.C3985t0;
import S0.C3991w0;
import S0.D1;
import S0.n1;
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
import m0.InterfaceC7976A;
import m0.InterfaceC8002m;
import m0.T0;
import n0.C8374O;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;
import r0.InterfaceC9122b;
import r0.InterfaceC9133m;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarVisibility;

/* renamed from: androidx.compose.foundation.gestures.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5167j<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<Float, Float> f39176a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Float> f39177b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final T0 f39178c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC7976A<Float> f39179d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<T, Boolean> f39180e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C8374O f39181f = new C8374O();

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C3991w0 f39182g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C3991w0 f39183h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final A1 f39184i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C3985t0 f39185j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final A1 f39186k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C3985t0 f39187l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final C3991w0 f39188m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final C3991w0 f39189n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final C5168k f39190o;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {880}, m = "anchoredDrag")
    /* renamed from: androidx.compose.foundation.gestures.j$a */
    static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        C5167j f39191d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f39192e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C5167j<T> f39193f;

        /* renamed from: g, reason: collision with root package name */
        int f39194g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5167j<T> c5167j, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f39193f = c5167j;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f39192e = obj;
            this.f39194g |= LinearLayoutManager.INVALID_OFFSET;
            return this.f39193f.h(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {882}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.j$b */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f39195d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C5167j<T> f39196e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f39197f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.jvm.internal.j f39198g;

        /* renamed from: androidx.compose.foundation.gestures.j$b$a */
        static final class a extends AbstractC7737t implements Function0<Pair<? extends InterfaceC9133m<T>, ? extends T>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C5167j<T> f39199b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C5167j<T> c5167j) {
                super(0);
                this.f39199b = c5167j;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                C5167j<T> c5167j = this.f39199b;
                return new Pair(c5167j.j(), c5167j.r());
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {885}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.j$b$b, reason: collision with other inner class name */
        static final class C0727b extends kotlin.coroutines.jvm.internal.j implements Function2<Pair<? extends InterfaceC9133m<T>, ? extends T>, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f39200d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f39201e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ kotlin.coroutines.jvm.internal.j f39202f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C5167j<T> f39203g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0727b(InterfaceC6512o<? super InterfaceC9122b, ? super InterfaceC9133m<T>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6512o, C5167j<T> c5167j, kotlin.coroutines.d<? super C0727b> dVar) {
                super(2, dVar);
                this.f39202f = (kotlin.coroutines.jvm.internal.j) interfaceC6512o;
                this.f39203g = c5167j;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [fd.o, kotlin.coroutines.jvm.internal.j] */
            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                C0727b c0727b = new C0727b(this.f39202f, this.f39203g, dVar);
                c0727b.f39201e = obj;
                return c0727b;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0727b) create((Pair) obj, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [fd.o, kotlin.coroutines.jvm.internal.j] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f39200d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    Pair pair = (Pair) this.f39201e;
                    InterfaceC9133m interfaceC9133m = (InterfaceC9133m) pair.a();
                    Object b11 = pair.b();
                    C5168k c5168k = ((C5167j) this.f39203g).f39190o;
                    this.f39200d = 1;
                    if (this.f39202f.invoke(c5168k, interfaceC9133m, b11, this) == aVar) {
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
        b(C5167j<T> c5167j, T t2, InterfaceC6512o<? super InterfaceC9122b, ? super InterfaceC9133m<T>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6512o, kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
            this.f39196e = c5167j;
            this.f39197f = t2;
            this.f39198g = (kotlin.coroutines.jvm.internal.j) interfaceC6512o;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [fd.o, kotlin.coroutines.jvm.internal.j] */
        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
            return new b(this.f39196e, this.f39197f, this.f39198g, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Type inference failed for: r5v0, types: [fd.o, kotlin.coroutines.jvm.internal.j] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f39195d;
            T t2 = this.f39197f;
            C5167j<T> c5167j = this.f39196e;
            if (i11 == 0) {
                Sc.s.b(obj);
                C5167j.d(c5167j, t2);
                a aVar2 = new a(c5167j);
                C0727b c0727b = new C0727b(this.f39198g, c5167j, null);
                this.f39195d = 1;
                if (C5158a.d(aVar2, c0727b, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            if (c5167j.k().invoke(t2).booleanValue()) {
                ((C5167j) c5167j).f39190o.a(c5167j.j().e(t2), c5167j.n());
                C5167j.g(c5167j, t2);
                C5167j.c(c5167j, t2);
            }
            return Unit.f71690a;
        }
    }

    public C5167j(OziNotificationBarVisibility oziNotificationBarVisibility, @NotNull Function1 function1, @NotNull Function0 function0, @NotNull T0 t02, @NotNull InterfaceC7976A interfaceC7976A, @NotNull Function1 function12) {
        C3991w0 f7;
        C3991w0 f11;
        C3991w0 f12;
        C3991w0 f13;
        this.f39176a = function1;
        this.f39177b = function0;
        this.f39178c = t02;
        this.f39179d = interfaceC7976A;
        this.f39180e = function12;
        f7 = n1.f(oziNotificationBarVisibility, D1.f25195a);
        this.f39182g = f7;
        f11 = n1.f(oziNotificationBarVisibility, D1.f25195a);
        this.f39183h = f11;
        this.f39184i = n1.e(new C5170m(this));
        this.f39185j = C0.a(Float.NaN);
        this.f39186k = n1.d(n1.n(), new C5169l(this));
        this.f39187l = C0.a(0.0f);
        f12 = n1.f(null, D1.f25195a);
        this.f39188m = f12;
        int i11 = C5158a.f39111b;
        f13 = n1.f(new I(new androidx.collection.H()), D1.f25195a);
        this.f39189n = f13;
        this.f39190o = new C5168k(this);
    }

    public static final Object b(C5167j c5167j) {
        return c5167j.f39188m.getValue();
    }

    public static final void c(C5167j c5167j, Object obj) {
        c5167j.f39182g.setValue(obj);
    }

    public static final void d(C5167j c5167j, Object obj) {
        c5167j.f39188m.setValue(obj);
    }

    public static final void e(C5167j c5167j, float f7) {
        c5167j.f39187l.h(f7);
    }

    public static final void f(C5167j c5167j, float f7) {
        c5167j.f39185j.h(f7);
    }

    public static final void g(C5167j c5167j, Object obj) {
        c5167j.f39183h.setValue(obj);
    }

    public static Object i(C5167j c5167j, InterfaceC6511n interfaceC6511n, kotlin.coroutines.d dVar) {
        EnumC8372M enumC8372M = EnumC8372M.Default;
        c5167j.getClass();
        Object d11 = c5167j.f39181f.d(enumC8372M, new C5166i(c5167j, interfaceC6511n, null), (kotlin.coroutines.jvm.internal.c) dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void w(C5167j c5167j, InterfaceC9133m interfaceC9133m) {
        Object value;
        boolean isNaN = Float.isNaN(c5167j.f39185j.getFloatValue());
        A1 a12 = c5167j.f39184i;
        if (isNaN) {
            value = a12.getValue();
        } else {
            value = interfaceC9133m.b(c5167j.f39185j.getFloatValue());
            if (value == null) {
                value = a12.getValue();
            }
        }
        if (Intrinsics.d(c5167j.j(), interfaceC9133m)) {
            return;
        }
        c5167j.f39189n.setValue(interfaceC9133m);
        C8374O c8374o = c5167j.f39181f;
        boolean f7 = c8374o.f();
        C3991w0 c3991w0 = c5167j.f39188m;
        if (f7) {
            try {
                C5168k c5168k = c5167j.f39190o;
                float e11 = c5167j.j().e(value);
                if (!Float.isNaN(e11)) {
                    c5168k.a(e11, 0.0f);
                    c3991w0.setValue(null);
                }
                c5167j.f39182g.setValue(value);
                c5167j.f39183h.setValue(value);
                c8374o.g();
            } catch (Throwable th2) {
                c8374o.g();
                throw th2;
            }
        }
        if (f7) {
            return;
        }
        c3991w0.setValue(value);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(T t2, @NotNull EnumC8372M enumC8372M, @NotNull InterfaceC6512o<? super InterfaceC9122b, ? super InterfaceC9133m<T>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6512o, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        int i11;
        C5167j<T> c5167j;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f39194g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f39194g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f39192e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f39194g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (!j().c(t2)) {
                        if (this.f39180e.invoke(t2).booleanValue()) {
                            this.f39183h.setValue(t2);
                            this.f39182g.setValue(t2);
                        }
                        return Unit.f71690a;
                    }
                    try {
                        C8374O c8374o = this.f39181f;
                        b bVar = new b(this, t2, interfaceC6512o, null);
                        aVar.f39191d = this;
                        aVar.f39194g = 1;
                        if (c8374o.d(enumC8372M, bVar, aVar) == aVar2) {
                            return aVar2;
                        }
                        c5167j = this;
                    } catch (Throwable th2) {
                        th = th2;
                        c5167j = this;
                        c5167j.f39188m.setValue(null);
                        throw th;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c5167j = aVar.f39191d;
                    try {
                        Sc.s.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        c5167j.f39188m.setValue(null);
                        throw th;
                    }
                }
                c5167j.f39188m.setValue(null);
                return Unit.f71690a;
            }
        }
        aVar = new a(this, dVar);
        Object obj2 = aVar.f39192e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f39194g;
        if (i11 != 0) {
        }
        c5167j.f39188m.setValue(null);
        return Unit.f71690a;
    }

    @NotNull
    public final InterfaceC9133m<T> j() {
        return (InterfaceC9133m) this.f39189n.getValue();
    }

    @NotNull
    public final Function1<T, Boolean> k() {
        return this.f39180e;
    }

    public final T l() {
        return this.f39182g.getValue();
    }

    @NotNull
    public final InterfaceC7976A<Float> m() {
        return this.f39179d;
    }

    public final float n() {
        return this.f39187l.getFloatValue();
    }

    public final float o() {
        return this.f39185j.getFloatValue();
    }

    public final T p() {
        return this.f39183h.getValue();
    }

    @NotNull
    public final InterfaceC8002m<Float> q() {
        return this.f39178c;
    }

    public final T r() {
        return (T) this.f39184i.getValue();
    }

    public final boolean s() {
        return this.f39188m.getValue() != null;
    }

    public final float t(float f7) {
        C3985t0 c3985t0 = this.f39185j;
        return kotlin.ranges.h.d((Float.isNaN(c3985t0.getFloatValue()) ? 0.0f : c3985t0.getFloatValue()) + f7, j().d(), j().f());
    }

    public final float u() {
        C3985t0 c3985t0 = this.f39185j;
        if (Float.isNaN(c3985t0.getFloatValue())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return c3985t0.getFloatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(float f7, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        T t2;
        T value = this.f39182g.getValue();
        float u11 = u();
        InterfaceC9133m<T> j11 = j();
        float e11 = j11.e(value);
        float floatValue = this.f39177b.invoke().floatValue();
        if (e11 != u11 && !Float.isNaN(e11)) {
            if (Math.abs(f7) >= Math.abs(floatValue)) {
                t2 = j11.a(u11, Math.signum(f7) > 0.0f);
                Intrinsics.f(t2);
            } else {
                T a11 = j11.a(u11, u11 - e11 > 0.0f);
                Intrinsics.f(a11);
                if (Math.abs(e11 - u11) > Math.abs(this.f39176a.invoke(Float.valueOf(Math.abs(e11 - j11.e(a11)))).floatValue())) {
                    t2 = a11;
                }
            }
            return !this.f39180e.invoke(t2).booleanValue() ? C5158a.g(this, t2, f7, jVar) : C5158a.g(this, value, f7, jVar);
        }
        t2 = value;
        if (!this.f39180e.invoke(t2).booleanValue()) {
        }
    }
}
