package P0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import t0.C9717f;
import t0.C9718g;
import t0.s;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.ButtonElevation$animateElevation$1$1", f = "Button.kt", l = {942}, m = "invokeSuspend")
/* renamed from: P0.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3726d extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f20994d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ t0.q f20995e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c1.u<t0.n> f20996f;

    /* renamed from: P0.d$a */
    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c1.u<t0.n> f20997a;

        a(c1.u<t0.n> uVar) {
            this.f20997a = uVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            t0.n nVar = (t0.n) obj;
            boolean z11 = nVar instanceof t0.j;
            c1.u<t0.n> uVar = this.f20997a;
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
    C3726d(t0.q qVar, c1.u uVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f20995e = qVar;
        this.f20996f = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C3726d(this.f20995e, this.f20996f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C3726d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f20994d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC2395h<t0.n> interactions = this.f20995e.getInteractions();
            a aVar2 = new a(this.f20996f);
            this.f20994d = 1;
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
