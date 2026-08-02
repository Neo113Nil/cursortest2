package J0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1$1$1", f = "FloatingActionButton.kt", l = {319}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class F extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f12766d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ G0 f12767e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ t0.n f12768f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F(G0 g02, t0.n nVar, kotlin.coroutines.d<? super F> dVar) {
        super(2, dVar);
        this.f12767e = g02;
        this.f12768f = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new F(this.f12767e, this.f12768f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((F) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f12766d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f12766d = 1;
            if (this.f12767e.b(this.f12768f, this) == aVar) {
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
