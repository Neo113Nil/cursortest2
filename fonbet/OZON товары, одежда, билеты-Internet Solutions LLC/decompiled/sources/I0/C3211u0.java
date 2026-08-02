package I0;

import Ae.AbstractC2381a;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import S0.A1;
import S0.n1;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import m0.C7980b;
import m0.C8010q;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", f = "SelectionMagnifier.kt", l = {86}, m = "invokeSuspend")
/* renamed from: I0.u0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3211u0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f11611d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f11612e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ A1<C7459e> f11613f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C7980b<C7459e, C8010q> f11614g;

    /* renamed from: I0.u0$a */
    static final class a extends AbstractC7737t implements Function0<C7459e> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A1<C7459e> f11615b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(A1<C7459e> a12) {
            super(0);
            this.f11615b = a12;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C7459e invoke() {
            int i11 = C3205r0.f11590e;
            return C7459e.a(this.f11615b.getValue().n());
        }
    }

    /* renamed from: I0.u0$b */
    static final class b<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7980b<C7459e, C8010q> f11616a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ xe.M f11617b;

        b(xe.M m11, C7980b c7980b) {
            this.f11616a = c7980b;
            this.f11617b = m11;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            long n11 = ((C7459e) obj).n();
            C7980b<C7459e, C8010q> c7980b = this.f11616a;
            if (P9.a.d(c7980b.k().n()) && P9.a.d(n11) && C7459e.h(c7980b.k().n()) != C7459e.h(n11)) {
                C10727i.c(this.f11617b, null, null, new C3213v0(c7980b, n11, null), 3);
                return Unit.f71690a;
            }
            Object m11 = c7980b.m(C7459e.a(n11), dVar);
            return m11 == Wc.a.COROUTINE_SUSPENDED ? m11 : Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3211u0(C7980b c7980b, A1 a12, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f11613f = a12;
        this.f11614g = c7980b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C3211u0 c3211u0 = new C3211u0(this.f11614g, this.f11613f, dVar);
        c3211u0.f11612e = obj;
        return c3211u0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C3211u0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f11611d;
        if (i11 == 0) {
            Sc.s.b(obj);
            xe.M m11 = (xe.M) this.f11612e;
            InterfaceC2395h m12 = n1.m(new a(this.f11613f));
            b bVar = new b(m11, this.f11614g);
            this.f11611d = 1;
            if (((AbstractC2381a) m12).collect(bVar, this) == aVar) {
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
