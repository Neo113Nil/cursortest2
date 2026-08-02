package S0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1$1", f = "ProduceState.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class p1 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f25501d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f25502e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function2<E0<Object>, kotlin.coroutines.d<? super Unit>, Object> f25503f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Object> f25504g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    p1(Function2<? super E0<Object>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, InterfaceC3978p0<Object> interfaceC3978p0, kotlin.coroutines.d<? super p1> dVar) {
        super(2, dVar);
        this.f25503f = function2;
        this.f25504g = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        p1 p1Var = new p1(this.f25503f, this.f25504g, dVar);
        p1Var.f25502e = obj;
        return p1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((p1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f25501d;
        if (i11 == 0) {
            Sc.s.b(obj);
            F0 f02 = new F0(this.f25504g, ((xe.M) this.f25502e).getCoroutineContext());
            this.f25501d = 1;
            if (this.f25503f.invoke(f02, this) == aVar) {
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
