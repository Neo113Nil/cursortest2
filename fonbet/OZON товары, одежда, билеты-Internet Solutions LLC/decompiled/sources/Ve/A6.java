package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.domain.model.request.PayBindingRequestBody;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;

/* loaded from: classes10.dex */
public final class A6 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f28581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4177d7 f28582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PayBindingRequestBody f28583f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f28584g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A6(C4177d7 c4177d7, PayBindingRequestBody payBindingRequestBody, xe.I i11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f28582e = c4177d7;
        this.f28583f = payBindingRequestBody;
        this.f28584g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new A6(this.f28582e, this.f28583f, this.f28584g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((A6) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Ki c4085a2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f28581d;
        PayBindingRequestBody payBindingRequestBody = this.f28583f;
        C4177d7 c4177d7 = this.f28582e;
        if (i11 == 0) {
            Sc.s.b(obj);
            ((C4238fb) c4177d7.f30858b).b(new C4209eb(new C4351j9()));
            InterfaceC4524p8 interfaceC4524p8 = c4177d7.f30857a;
            this.f28581d = 1;
            obj = ((C4710vl) interfaceC4524p8).m(payBindingRequestBody, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        ContentResponse contentResponse = (ContentResponse) obj;
        if (contentResponse instanceof ContentResponse.Failure) {
            ContentResponse.Failure failure = (ContentResponse.Failure) contentResponse;
            c4085a2 = failure.getError() instanceof ErrorEntity.NoInternet ? new O0(new Jr(new Z5(c4177d7, payBindingRequestBody, this.f28584g, null))) : new Dp(failure.getError(), false);
        } else {
            if (!(contentResponse instanceof ContentResponse.Success)) {
                throw new Sc.o();
            }
            c4085a2 = new C4085a2(Ze.f30586a);
        }
        ((C4238fb) c4177d7.f30858b).b(c4085a2);
        return Unit.f71690a;
    }
}
