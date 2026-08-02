package bc0;

import Ae.C0;
import Sc.s;
import bc0.AbstractC5649h;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.logout.presentation.viewModel.LogoutViewModel$onBackButtonClicked$1", f = "LogoutViewModel.kt", l = {121}, m = "invokeSuspend")
/* renamed from: bc0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5646e extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f55912d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C5643b f55913e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5646e(C5643b c5643b, kotlin.coroutines.d<? super C5646e> dVar) {
        super(2, dVar);
        this.f55913e = c5643b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C5646e(this.f55913e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C5646e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f55912d;
        if (i11 == 0) {
            s.b(obj);
            C0 c02 = this.f55913e.f55896h;
            AbstractC5649h.a aVar2 = new AbstractC5649h.a(null);
            this.f55912d = 1;
            if (c02.emit(aVar2, this) == aVar) {
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
