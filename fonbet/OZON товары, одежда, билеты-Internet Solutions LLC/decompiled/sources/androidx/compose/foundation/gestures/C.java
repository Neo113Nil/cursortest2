package androidx.compose.foundation.gestures;

import D1.C2805i;
import S0.B1;
import androidx.compose.foundation.gestures.AbstractC5172o;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.platform.c2;
import fd.InterfaceC6511n;
import java.util.concurrent.CancellationException;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import r0.C9135o;
import r0.C9140t;
import r0.EnumC9142v;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1", f = "Draggable.kt", l = {524}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class C extends kotlin.coroutines.jvm.internal.j implements Function2<x1.F, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f38961d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f38962e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ B f38963f;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", f = "Draggable.kt", l = {526}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f38964d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f38965e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B f38966f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ x1.F f38967g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6511n<x1.x, x1.x, C7459e, Unit> f38968h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<x1.x, Unit> f38969i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f38970j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Boolean> f38971k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2<x1.x, C7459e, Unit> f38972l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(B b11, x1.F f7, InterfaceC6511n<? super x1.x, ? super x1.x, ? super C7459e, Unit> interfaceC6511n, Function1<? super x1.x, Unit> function1, Function0<Unit> function0, Function0<Boolean> function02, Function2<? super x1.x, ? super C7459e, Unit> function2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f38966f = b11;
            this.f38967g = f7;
            this.f38968h = interfaceC6511n;
            this.f38969i = function1;
            this.f38970j = function0;
            this.f38971k = function02;
            this.f38972l = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f38966f, this.f38967g, this.f38968h, this.f38969i, this.f38970j, this.f38971k, this.f38972l, dVar);
            aVar.f38965e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, xe.M] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            ze.h hVar;
            EnumC9142v enumC9142v;
            Object obj2 = Wc.a.COROUTINE_SUSPENDED;
            ?? r12 = this.f38964d;
            B b11 = this.f38966f;
            try {
                if (r12 == 0) {
                    Sc.s.b(obj);
                    xe.M m11 = (xe.M) this.f38965e;
                    enumC9142v = b11.f38951c;
                    x1.F f7 = this.f38967g;
                    InterfaceC6511n<x1.x, x1.x, C7459e, Unit> interfaceC6511n = this.f38968h;
                    Function1<x1.x, Unit> function1 = this.f38969i;
                    Function0<Unit> function0 = this.f38970j;
                    Function0<Boolean> function02 = this.f38971k;
                    Function2<x1.x, C7459e, Unit> function2 = this.f38972l;
                    this.f38965e = m11;
                    this.f38964d = 1;
                    int i11 = C5177u.f39246b;
                    Object b12 = C9140t.b(f7, new v(function02, new kotlin.jvm.internal.L(), enumC9142v, interfaceC6511n, function2, function0, function1, null), this);
                    if (b12 != obj2) {
                        b12 = Unit.f71690a;
                    }
                    if (b12 == obj2) {
                        return obj2;
                    }
                } else {
                    if (r12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
            } catch (CancellationException e11) {
                hVar = b11.f38956h;
                if (hVar != null) {
                    hVar.b(AbstractC5172o.a.f39211a);
                }
                if (!xe.N.f(r12)) {
                    throw e11;
                }
            }
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function2<x1.x, C7459e, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y1.d f38973b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ B f38974c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(B b11, y1.d dVar) {
            super(2);
            this.f38973b = dVar;
            this.f38974c = b11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(x1.x xVar, C7459e c7459e) {
            ze.h hVar;
            long n11 = c7459e.n();
            y1.e.a(this.f38973b, xVar);
            hVar = this.f38974c.f38956h;
            if (hVar != null) {
                hVar.b(new AbstractC5172o.b(n11));
            }
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B f38975b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(B b11) {
            super(0);
            this.f38975b = b11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ze.h hVar;
            hVar = this.f38975b.f38956h;
            if (hVar != null) {
                hVar.b(AbstractC5172o.a.f39211a);
            }
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function1<x1.x, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y1.d f38976b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ B f38977c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(B b11, y1.d dVar) {
            super(1);
            this.f38976b = dVar;
            this.f38977c = b11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(x1.x xVar) {
            ze.h hVar;
            y1.d dVar = this.f38976b;
            y1.e.a(dVar, xVar);
            B1 r11 = K0.r();
            B b11 = this.f38977c;
            float g10 = ((c2) C2805i.a(b11, r11)).g();
            long b12 = dVar.b(Fl0.b.a(g10, g10));
            dVar.d();
            hVar = b11.f38956h;
            if (hVar != null) {
                int i11 = C9135o.f82634c;
                hVar.b(new AbstractC5172o.d(Fl0.b.a(Float.isNaN(Z1.w.c(b12)) ? 0.0f : Z1.w.c(b12), Float.isNaN(Z1.w.d(b12)) ? 0.0f : Z1.w.d(b12))));
            }
            return Unit.f71690a;
        }
    }

    static final class e extends AbstractC7737t implements InterfaceC6511n<x1.x, x1.x, C7459e, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B f38978b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ y1.d f38979c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(B b11, y1.d dVar) {
            super(3);
            this.f38978b = b11;
            this.f38979c = dVar;
        }

        @Override // fd.InterfaceC6511n
        public final Unit invoke(x1.x xVar, x1.x xVar2, C7459e c7459e) {
            boolean z11;
            ze.h hVar;
            ze.h hVar2;
            x1.x xVar3 = xVar;
            x1.x xVar4 = xVar2;
            long n11 = c7459e.n();
            B b11 = this.f38978b;
            if (b11.X1().invoke(xVar3).booleanValue()) {
                z11 = b11.f38958j;
                if (!z11) {
                    hVar2 = b11.f38956h;
                    if (hVar2 == null) {
                        b11.f38956h = ze.k.a(Integer.MAX_VALUE, 6, null);
                    }
                    B.U1(b11);
                }
                y1.e.a(this.f38979c, xVar3);
                long j11 = C7459e.j(xVar4.f(), n11);
                hVar = b11.f38956h;
                if (hVar != null) {
                    hVar.b(new AbstractC5172o.c(j11));
                }
            }
            return Unit.f71690a;
        }
    }

    static final class f extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B f38980b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(B b11) {
            super(0);
            this.f38980b = b11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(!this.f38980b.b2());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C(B b11, kotlin.coroutines.d<? super C> dVar) {
        super(2, dVar);
        this.f38963f = b11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C c11 = new C(this.f38963f, dVar);
        c11.f38962e = obj;
        return c11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(x1.F f7, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C) create(f7, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f38961d;
        if (i11 == 0) {
            Sc.s.b(obj);
            x1.F f7 = (x1.F) this.f38962e;
            y1.d dVar = new y1.d();
            B b11 = this.f38963f;
            a aVar2 = new a(this.f38963f, f7, new e(b11, dVar), new d(b11, dVar), new c(b11), new f(b11), new b(b11, dVar), null);
            this.f38961d = 1;
            if (xe.N.d(aVar2, this) == aVar) {
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
