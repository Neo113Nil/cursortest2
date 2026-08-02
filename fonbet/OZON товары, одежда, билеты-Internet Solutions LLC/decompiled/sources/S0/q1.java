package S0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3$1", f = "ProduceState.kt", l = {150}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class q1 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f25506d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f25507e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function2<E0<Object>, kotlin.coroutines.d<? super Unit>, Object> f25508f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Object> f25509g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    q1(Function2<? super E0<Object>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, InterfaceC3978p0<Object> interfaceC3978p0, kotlin.coroutines.d<? super q1> dVar) {
        super(2, dVar);
        this.f25508f = function2;
        this.f25509g = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        q1 q1Var = new q1(this.f25508f, this.f25509g, dVar);
        q1Var.f25507e = obj;
        return q1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((q1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f25506d;
        if (i11 == 0) {
            Sc.s.b(obj);
            F0 f02 = new F0(this.f25509g, ((xe.M) this.f25507e).getCoroutineContext());
            this.f25506d = 1;
            if (this.f25508f.invoke(f02, this) == aVar) {
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
