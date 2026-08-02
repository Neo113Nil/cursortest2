package androidx.compose.foundation;

import D1.C2809k;
import I1.C3222a;
import I1.D;
import fd.InterfaceC6511n;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import r0.C9115P;
import r0.InterfaceC9143w;
import x1.F;

/* loaded from: classes8.dex */
final class n extends AbstractC5157a {

    /* renamed from: u, reason: collision with root package name */
    private Function0<Unit> f39705u;

    static final class a extends AbstractC7737t implements Function0<Boolean> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Function0 function0 = n.this.f39705u;
            if (function0 != null) {
                function0.invoke();
            }
            return Boolean.TRUE;
        }
    }

    static final class b extends AbstractC7737t implements Function1<C7459e, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C7459e c7459e) {
            c7459e.n();
            Function0 function0 = n.this.f39705u;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.CombinedClickableNodeImpl$clickPointerInput$4", f = "Clickable.kt", l = {787}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC9143w, C7459e, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f39708d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ InterfaceC9143w f39709e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ long f39710f;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC9143w interfaceC9143w, C7459e c7459e, kotlin.coroutines.d<? super Unit> dVar) {
            long n11 = c7459e.n();
            c cVar = n.this.new c(dVar);
            cVar.f39709e = interfaceC9143w;
            cVar.f39710f = n11;
            return cVar.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f39708d;
            if (i11 == 0) {
                Sc.s.b(obj);
                InterfaceC9143w interfaceC9143w = this.f39709e;
                long j11 = this.f39710f;
                n nVar = n.this;
                if (nVar.V1()) {
                    this.f39708d = 1;
                    if (nVar.X1(interfaceC9143w, j11, this) == aVar) {
                        return aVar;
                    }
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

    static final class d extends AbstractC7737t implements Function1<C7459e, Unit> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C7459e c7459e) {
            c7459e.n();
            n nVar = n.this;
            if (nVar.V1()) {
                nVar.W1().invoke();
            }
            return Unit.f71690a;
        }
    }

    private n() {
        throw null;
    }

    public n(Function0 function0, Function0 function02, t0.q qVar, boolean z11) {
        super(qVar, null, z11, null, null, function0);
        this.f39705u = function02;
    }

    @Override // androidx.compose.foundation.AbstractC5157a
    public final void S1(@NotNull D d11) {
        if (this.f39705u != null) {
            a aVar = new a();
            int i11 = I1.z.f11793b;
            d11.b(I1.k.m(), new C3222a(null, aVar));
        }
    }

    @Override // androidx.compose.foundation.AbstractC5157a
    public final Object T1(@NotNull F f7, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object f11 = C9115P.f(new c(null), dVar, null, (!V1() || this.f39705u == null) ? null : new b(), new d(), f7);
        return f11 == Wc.a.COROUTINE_SUSPENDED ? f11 : Unit.f71690a;
    }

    public final void c2(@NotNull Function0 function0, Function0 function02, t0.q qVar, boolean z11) {
        boolean z12 = false;
        if ((this.f39705u == null) != (function02 == null)) {
            U1();
            C2809k.f(this).x0();
            z12 = true;
        }
        this.f39705u = function02;
        boolean z13 = V1() == z11 ? z12 : true;
        a2(qVar, null, z11, null, null, function0);
        if (z13) {
            Z1();
        }
    }
}
