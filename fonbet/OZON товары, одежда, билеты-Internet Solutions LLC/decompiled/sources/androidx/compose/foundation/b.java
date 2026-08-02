package androidx.compose.foundation;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.AbstractClickableNode$emitHoverEnter$1$1", f = "Clickable.kt", l = {1174}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f38910d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ t0.q f38911e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ t0.j f38912f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(t0.q qVar, t0.j jVar, kotlin.coroutines.d<? super b> dVar) {
        super(2, dVar);
        this.f38911e = qVar;
        this.f38912f = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new b(this.f38911e, this.f38912f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f38910d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f38910d = 1;
            if (this.f38911e.emit(this.f38912f, this) == aVar) {
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
