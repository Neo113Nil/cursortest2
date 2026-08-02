package J0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import t0.C9717f;
import t0.C9718g;
import t0.s;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.DefaultButtonElevation$elevation$1$1", f = "Button.kt", l = {510}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class A extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f12654d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ t0.q f12655e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c1.u<t0.n> f12656f;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c1.u<t0.n> f12657a;

        a(c1.u<t0.n> uVar) {
            this.f12657a = uVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            t0.n nVar = (t0.n) obj;
            boolean z11 = nVar instanceof t0.j;
            c1.u<t0.n> uVar = this.f12657a;
            if (z11) {
                uVar.add(nVar);
            } else if (nVar instanceof t0.k) {
                uVar.remove(((t0.k) nVar).a());
            } else if (nVar instanceof C9717f) {
                uVar.add(nVar);
            } else if (nVar instanceof C9718g) {
                uVar.remove(((C9718g) nVar).a());
            } else if (nVar instanceof s.b) {
                uVar.add(nVar);
            } else if (nVar instanceof s.c) {
                uVar.remove(((s.c) nVar).a());
            } else if (nVar instanceof s.a) {
                uVar.remove(((s.a) nVar).a());
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A(t0.q qVar, c1.u uVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f12655e = qVar;
        this.f12656f = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new A(this.f12655e, this.f12656f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((A) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f12654d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC2395h<t0.n> interactions = this.f12655e.getInteractions();
            a aVar2 = new a(this.f12656f);
            this.f12654d = 1;
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
