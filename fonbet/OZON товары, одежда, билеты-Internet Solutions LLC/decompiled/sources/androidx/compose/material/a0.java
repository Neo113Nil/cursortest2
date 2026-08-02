package androidx.compose.material;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import t0.C9712a;
import t0.C9713b;
import t0.C9714c;
import t0.s;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.SwitchKt$SwitchImpl$1$1", f = "Switch.kt", l = {225}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class a0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f39977d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ t0.q f39978e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c1.u<t0.n> f39979f;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c1.u<t0.n> f39980a;

        a(c1.u<t0.n> uVar) {
            this.f39980a = uVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            t0.n nVar = (t0.n) obj;
            boolean z11 = nVar instanceof s.b;
            c1.u<t0.n> uVar = this.f39980a;
            if (z11) {
                uVar.add(nVar);
            } else if (nVar instanceof s.c) {
                uVar.remove(((s.c) nVar).a());
            } else if (nVar instanceof s.a) {
                uVar.remove(((s.a) nVar).a());
            } else if (nVar instanceof C9713b) {
                uVar.add(nVar);
            } else if (nVar instanceof C9714c) {
                uVar.remove(((C9714c) nVar).a());
            } else if (nVar instanceof C9712a) {
                uVar.remove(((C9712a) nVar).a());
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a0(t0.q qVar, c1.u uVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f39978e = qVar;
        this.f39979f = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new a0(this.f39978e, this.f39979f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((a0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f39977d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC2395h<t0.n> interactions = this.f39978e.getInteractions();
            a aVar2 = new a(this.f39979f);
            this.f39977d = 1;
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
