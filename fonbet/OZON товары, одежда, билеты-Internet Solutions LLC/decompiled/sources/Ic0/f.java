package Ic0;

import Ib0.h;
import Ic0.d;
import Sc.InterfaceC4008j;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.nativeauth.data.models.AuthTokenDTO;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.initAuth.InitAuthUseCase$onExecute$finishOnMain$2", f = "InitAuthUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ d.a f12209d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AuthTokenDTO f12210e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ d f12211f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(d.a aVar, AuthTokenDTO authTokenDTO, d dVar, kotlin.coroutines.d<? super f> dVar2) {
        super(2, dVar2);
        this.f12209d = aVar;
        this.f12210e = authTokenDTO;
        this.f12211f = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new f(this.f12209d, this.f12210e, this.f12211f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        d.a aVar2 = this.f12209d;
        Function1<b, Unit> a11 = aVar2.a();
        AuthTokenDTO authTokenDTO = this.f12210e;
        if (a11 != null) {
            a11.invoke(new b(authTokenDTO));
        }
        if (aVar2.d()) {
            Ib0.h cVar = authTokenDTO != null ? new h.c(Gb0.c.LOGOUT) : new h.b(Gb0.c.LOGOUT);
            interfaceC4008j = this.f12211f.f12190c;
            ((Ib0.e) interfaceC4008j.getValue()).i(cVar);
        }
        return Unit.f71690a;
    }
}
