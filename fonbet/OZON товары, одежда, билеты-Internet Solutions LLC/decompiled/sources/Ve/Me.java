package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.domain.model.FakeBankAuthData;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.SessionIdResponseBody;
import xe.C10720e0;

/* loaded from: classes10.dex */
public final class Me extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4531pf f29472e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Me(C4531pf c4531pf, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29472e = c4531pf;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Me(this.f29472e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Me(this.f29472e, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29471d;
        C4531pf c4531pf = this.f29472e;
        if (i11 == 0) {
            Sc.s.b(obj);
            J7 j72 = c4531pf.f31782d;
            this.f29471d = 1;
            C10720e0 c10720e0 = C10720e0.f105451a;
            He.b bVar = He.b.f10879b;
            ContentResponse.Success success = ((C4654tn) j72.f29278a).f32134c;
            if (success == null) {
                success = null;
            }
            obj = success != null ? (SessionIdResponseBody) success.getData() : null;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        SessionIdResponseBody sessionIdResponseBody = (SessionIdResponseBody) obj;
        c4531pf.f31783e.setValue(new FakeBankAuthData(Boolean.TRUE, sessionIdResponseBody != null ? sessionIdResponseBody.getState() : null, sessionIdResponseBody != null ? sessionIdResponseBody.getNonce() : null, "E9604229-C3CC-D584-070A-DE59D36A78C3", null, null, 48, null));
        return Unit.f71690a;
    }
}
