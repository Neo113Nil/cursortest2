package Pc0;

import Pc0.g;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.ui.input.CounterView;
import xe.M;
import ze.C11115c;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.navigation.AuthRouter$openFintechRecoveryCameraDialog$1", f = "AuthRouter.kt", l = {CounterView.COUNTER_MAX_DEFAULT}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f22195d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ c f22196e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ g.h f22197f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(c cVar, g.h hVar, kotlin.coroutines.d<? super e> dVar) {
        super(2, dVar);
        this.f22196e = cVar;
        this.f22197f = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new e(this.f22196e, this.f22197f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f22195d;
        if (i11 == 0) {
            s.b(obj);
            C11115c c11115c = this.f22196e.f22169i;
            this.f22195d = 1;
            if (c11115c.n(this.f22197f, this) == aVar) {
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
