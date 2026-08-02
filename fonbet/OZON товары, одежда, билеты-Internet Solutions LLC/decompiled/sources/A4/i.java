package A4;

import Sc.s;
import j3.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "androidx.media3.ui.compose.state.PresentationStateKt$rememberPresentationState$1$1", f = "PresentationState.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class i extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f415d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f416e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ y f417f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(h hVar, y yVar, kotlin.coroutines.d<? super i> dVar) {
        super(2, dVar);
        this.f416e = hVar;
        this.f417f = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new i(this.f416e, this.f417f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f415d;
        if (i11 == 0) {
            s.b(obj);
            this.f415d = 1;
            if (this.f416e.f(this.f417f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
