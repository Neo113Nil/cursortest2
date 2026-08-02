package O0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import t0.s;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1", f = "Ripple.kt", l = {219}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f19750d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f19751e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ t0.q f19752f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ androidx.compose.material.ripple.b f19753g;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material.ripple.b f19754a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M f19755b;

        a(androidx.compose.material.ripple.b bVar, M m11) {
            this.f19754a = bVar;
            this.f19755b = m11;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            t0.n nVar = (t0.n) obj;
            boolean z11 = nVar instanceof s.b;
            androidx.compose.material.ripple.b bVar = this.f19754a;
            if (z11) {
                bVar.c((s.b) nVar);
            } else if (nVar instanceof s.c) {
                bVar.g(((s.c) nVar).a());
            } else if (nVar instanceof s.a) {
                bVar.g(((s.a) nVar).a());
            } else {
                bVar.h(nVar, this.f19755b);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(t0.q qVar, androidx.compose.material.ripple.b bVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f19752f = qVar;
        this.f19753g = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        g gVar = new g(this.f19752f, this.f19753g, dVar);
        gVar.f19751e = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f19750d;
        if (i11 == 0) {
            Sc.s.b(obj);
            M m11 = (M) this.f19751e;
            InterfaceC2395h<t0.n> interactions = this.f19752f.getInteractions();
            a aVar2 = new a(this.f19753g, m11);
            this.f19750d = 1;
            if (interactions.collect(aVar2, this) == aVar) {
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
