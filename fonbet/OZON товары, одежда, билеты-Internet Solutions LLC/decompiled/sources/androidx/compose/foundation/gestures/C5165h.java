package androidx.compose.foundation.gestures;

import D1.C2809k;
import androidx.compose.foundation.gestures.AbstractC5172o;
import androidx.compose.foundation.gestures.G;
import fd.InterfaceC6511n;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import r0.InterfaceC9122b;
import r0.InterfaceC9133m;
import xe.C10727i;

/* renamed from: androidx.compose.foundation.gestures.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5165h<T> extends B {

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private C5167j<T> f39154l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private EnumC9142v f39155m;

    /* renamed from: n, reason: collision with root package name */
    private Boolean f39156n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f39157o;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", f = "AnchoredDraggable.kt", l = {251}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.h$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC9122b, InterfaceC9133m<T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f39158d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ InterfaceC9122b f39159e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Function1<? super AbstractC5172o.b, Unit>, kotlin.coroutines.d<? super Unit>, Object> f39160f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C5165h<T> f39161g;

        /* renamed from: androidx.compose.foundation.gestures.h$a$a, reason: collision with other inner class name */
        static final class C0726a extends AbstractC7737t implements Function1<AbstractC5172o.b, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C5165h<T> f39162b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC9122b f39163c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0726a(C5165h<T> c5165h, InterfaceC9122b interfaceC9122b) {
                super(1);
                this.f39162b = c5165h;
                this.f39163c = interfaceC9122b;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(AbstractC5172o.b bVar) {
                C5165h<T> c5165h = this.f39162b;
                c5165h.getClass();
                this.f39163c.a(((C5165h) c5165h).f39154l.t(C5165h.i2(c5165h, C5165h.g2(c5165h, bVar.a()))), 0.0f);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super Function1<? super AbstractC5172o.b, Unit>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, C5165h<T> c5165h, kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
            this.f39160f = function2;
            this.f39161g = c5165h;
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC9122b interfaceC9122b, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = new a(this.f39160f, this.f39161g, dVar);
            aVar.f39159e = interfaceC9122b;
            return aVar.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f39158d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C0726a c0726a = new C0726a(this.f39161g, this.f39159e);
                this.f39158d = 1;
                if (((G.a) this.f39160f).invoke(c0726a, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", f = "AnchoredDraggable.kt", l = {275, 277}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.h$b */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        Object f39164d;

        /* renamed from: e, reason: collision with root package name */
        int f39165e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C5165h<T> f39166f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f39167g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C5165h<T> c5165h, long j11, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f39166f = c5165h;
            this.f39167g = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new b(this.f39166f, this.f39167g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            C5165h<T> c5165h;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f39165e;
            if (i11 == 0) {
                Sc.s.b(obj);
                C5165h<T> c5165h2 = this.f39166f;
                c5165h2.getClass();
                C5167j c5167j = ((C5165h) c5165h2).f39154l;
                float h22 = C5165h.h2(c5165h2, C5165h.f2(c5165h2, this.f39167g));
                this.f39164d = c5165h2;
                this.f39165e = 1;
                Object v11 = c5167j.v(h22, this);
                if (v11 == aVar) {
                    return aVar;
                }
                c5165h = c5165h2;
                obj = v11;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                c5165h = (C5165h) this.f39164d;
                Sc.s.b(obj);
            }
            C5165h.j2(c5165h, ((Number) obj).floatValue());
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5165h(@NotNull C5167j c5167j, @NotNull EnumC9142v enumC9142v, boolean z11, Boolean bool, boolean z12) {
        super(r0, z11, null, enumC9142v);
        Function1 function1;
        function1 = C5158a.f39110a;
        this.f39154l = c5167j;
        this.f39155m = enumC9142v;
        this.f39156n = bool;
        this.f39157o = z12;
    }

    public static final long f2(C5165h c5165h, long j11) {
        return Z1.w.g(c5165h.k2() ? -1.0f : 1.0f, j11);
    }

    public static final long g2(C5165h c5165h, long j11) {
        return C7459e.l(c5165h.k2() ? -1.0f : 1.0f, j11);
    }

    public static final float h2(C5165h c5165h, long j11) {
        return c5165h.f39155m == EnumC9142v.Vertical ? Z1.w.d(j11) : Z1.w.c(j11);
    }

    public static final float i2(C5165h c5165h, long j11) {
        return c5165h.f39155m == EnumC9142v.Vertical ? C7459e.h(j11) : C7459e.g(j11);
    }

    public static final long j2(C5165h c5165h, float f7) {
        EnumC9142v enumC9142v = c5165h.f39155m;
        float f11 = enumC9142v == EnumC9142v.Horizontal ? f7 : 0.0f;
        if (enumC9142v != EnumC9142v.Vertical) {
            f7 = 0.0f;
        }
        return Fl0.b.a(f11, f7);
    }

    private final boolean k2() {
        Boolean bool = this.f39156n;
        if (bool == null) {
            return C2809k.f(this).O() == Z1.s.Rtl && this.f39155m == EnumC9142v.Horizontal;
        }
        Intrinsics.f(bool);
        return bool.booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.B
    public final Object W1(@NotNull Function2<? super Function1<? super AbstractC5172o.b, Unit>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object i11 = C5167j.i(this.f39154l, new a(function2, this, null), dVar);
        return i11 == Wc.a.COROUTINE_SUSPENDED ? i11 : Unit.f71690a;
    }

    @Override // androidx.compose.foundation.gestures.B
    public final void Z1(long j11) {
    }

    @Override // androidx.compose.foundation.gestures.B
    public final void a2(long j11) {
        if (isAttached()) {
            C10727i.c(getCoroutineScope(), null, null, new b(this, j11, null), 3);
        }
    }

    @Override // androidx.compose.foundation.gestures.B
    public final boolean b2() {
        return this.f39157o;
    }

    public final void l2(@NotNull C5167j c5167j, @NotNull EnumC9142v enumC9142v, boolean z11, Boolean bool, boolean z12) {
        boolean z13;
        boolean z14 = true;
        if (Intrinsics.d(this.f39154l, c5167j)) {
            z13 = false;
        } else {
            this.f39154l = c5167j;
            z13 = true;
        }
        if (this.f39155m != enumC9142v) {
            this.f39155m = enumC9142v;
            z13 = true;
        }
        if (Intrinsics.d(this.f39156n, bool)) {
            z14 = z13;
        } else {
            this.f39156n = bool;
        }
        this.f39157o = z12;
        c2(this.f38952d, z11, null, enumC9142v, z14);
    }
}
