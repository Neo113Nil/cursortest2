package Lc0;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.nativeauth.data.models.DeeplinkOtpFlowDTO;
import xc0.C10702a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.main.AuthFlowViewModel$startOtpFlow$1", f = "AuthFlowViewModel.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f16731d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ a f16732e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f16733f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(a aVar, String str, kotlin.coroutines.d<? super d> dVar) {
        super(2, dVar);
        this.f16732e = aVar;
        this.f16733f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new d(this.f16732e, this.f16733f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f16731d;
        a aVar2 = this.f16732e;
        if (i11 == 0) {
            s.b(obj);
            C10702a value = aVar2.h0().j().W().h().getValue();
            this.f16731d = 1;
            obj = value.b(this.f16733f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        aVar2.g0().v(((DeeplinkOtpFlowDTO) obj).getDeeplink());
        return Unit.f71690a;
    }
}
