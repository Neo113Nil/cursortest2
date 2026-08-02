package Sb0;

import Db0.f;
import Sc.InterfaceC4008j;
import Sc.s;
import android.app.Activity;
import dc0.C6178x;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.nativeauth.data.models.AuthTokenDTO;
import ru.ozon.id.nativeauth.main.activity.AuthFlowActivity;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.limb.linkHandlers.OzonIdLinkHandlerLogin$login$1", f = "OzonIdLinkHandlerLogin.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f26079d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ b f26080e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(b bVar, kotlin.coroutines.d<? super a> dVar) {
        super(2, dVar);
        this.f26080e = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new a(this.f26080e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        C6178x c6178x;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f26079d;
        b bVar = this.f26080e;
        if (i11 == 0) {
            s.b(obj);
            interfaceC4008j = bVar.f26081a;
            f fVar = (f) interfaceC4008j.getValue();
            this.f26079d = 1;
            obj = fVar.g(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        Activity activity = (Activity) obj;
        if (activity != null) {
            c6178x = bVar.f26084d;
            if (c6178x.b().j()) {
                Fb0.d.a(new Fb0.c(true, (AuthTokenDTO) null, 6), Gb0.d.LOGIN, true);
            } else {
                int i12 = AuthFlowActivity.f97290u;
                AuthFlowActivity.a.d(activity, null, true, null);
            }
        }
        return Unit.f71690a;
    }
}
