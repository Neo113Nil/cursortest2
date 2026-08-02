package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.SdkAuthRequestBody;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.SdkAuthResponseBody;

/* loaded from: classes10.dex */
public final class Qe extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4646tf f29774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Rf f29775f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f29776g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qe(C4646tf c4646tf, Rf rf2, xe.I i11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29774e = c4646tf;
        this.f29775f = rf2;
        this.f29776g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Qe(this.f29774e, this.f29775f, this.f29776g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Qe) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Ki k32;
        Ki ki2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29773d;
        Rf rf2 = this.f29775f;
        C4646tf c4646tf = this.f29774e;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC4524p8 interfaceC4524p8 = c4646tf.f32101a;
            SdkAuthRequestBody sdkAuthRequestBody = rf2.f29851b;
            this.f29773d = 1;
            obj = ((C4710vl) interfaceC4524p8).s(sdkAuthRequestBody, this);
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
            ErrorEntity error = failure.getError();
            if (error instanceof ErrorEntity.BadRequest) {
                ki2 = M1.b.e(((ErrorEntity.BadRequest) failure.getError()).getFraudMonCheckResult(), c4646tf.f32105e);
            } else if (error instanceof ErrorEntity.ApiError) {
                if (((Yq) c4646tf.f32103c).f30522c) {
                    ((C4238fb) c4646tf.f32102b).b(Lh.f29425a);
                    Y4 y42 = c4646tf.f32104d;
                    y42.f30435d = null;
                    y42.f30436e = "";
                    ((Yq) c4646tf.f32103c).f30522c = false;
                    return Unit.f71690a;
                }
                k32 = new O0(new Cb(failure.getError()));
            } else if (Intrinsics.d(error, ErrorEntity.NoInternet.INSTANCE)) {
                ki2 = new O0(new Jr(new C4472ne(c4646tf, rf2, this.f29776g, null)));
            } else {
                if (Intrinsics.d(error, ErrorEntity.NotFound.INSTANCE) ? true : Intrinsics.d(error, ErrorEntity.ServiceUnavailable.INSTANCE)) {
                    k32 = new O0(new Sm("Некорректный формат запроса или ответа"));
                } else if (Intrinsics.d(error, ErrorEntity.TimeOut.INSTANCE)) {
                    ki2 = new O0(new C4761xg());
                } else if (Intrinsics.d(error, ErrorEntity.Unknown.INSTANCE)) {
                    ki2 = new O0(new Sm("Системная или внутренняя ошибка"));
                } else {
                    k32 = new O0(new Sm("Некорректный формат запроса или ответа"));
                }
            }
            ((C4238fb) c4646tf.f32102b).b(ki2);
            return Unit.f71690a;
        }
        if (!(contentResponse instanceof ContentResponse.Success)) {
            throw new Sc.o();
        }
        Object data = ((ContentResponse.Success) contentResponse).getData();
        Intrinsics.f(data);
        k32 = new K3((SdkAuthResponseBody) data);
        ki2 = k32;
        ((C4238fb) c4646tf.f32102b).b(ki2);
        return Unit.f71690a;
    }
}
