package androidx.compose.foundation;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.AbstractClickableNode$emitHoverExit$1$1$1", f = "Clickable.kt", l = {1186}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f38913d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ t0.q f38914e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ t0.k f38915f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(t0.q qVar, t0.k kVar, kotlin.coroutines.d<? super c> dVar) {
        super(2, dVar);
        this.f38914e = qVar;
        this.f38915f = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new c(this.f38914e, this.f38915f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f38913d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f38913d = 1;
            if (this.f38914e.emit(this.f38915f, this) == aVar) {
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
