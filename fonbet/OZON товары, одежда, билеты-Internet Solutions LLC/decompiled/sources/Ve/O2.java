package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.ConfirmOtpRequestBody;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.otp.ConfirmOtpResponseBody;
import spay.sdk.domain.model.response.otp.OneTimePasswordStateBuilderKt;

/* loaded from: classes10.dex */
public final class O2 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4605s3 f29578e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ V3 f29579f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f29580g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O2(C4605s3 c4605s3, V3 v32, xe.I i11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29578e = c4605s3;
        this.f29579f = v32;
        this.f29580g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new O2(this.f29578e, this.f29579f, this.f29580g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((O2) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Ki c4398kr;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29577d;
        V3 v32 = this.f29579f;
        C4605s3 c4605s3 = this.f29578e;
        if (i11 == 0) {
            Sc.s.b(obj);
            ((C4238fb) c4605s3.f32004b).b(new C4209eb(new C4351j9()));
            InterfaceC4524p8 interfaceC4524p8 = c4605s3.f32003a;
            ConfirmOtpRequestBody confirmOtpRequestBody = v32.f30173b;
            this.f29577d = 1;
            obj = ((C4710vl) interfaceC4524p8).i(confirmOtpRequestBody, this);
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
            if (error instanceof ErrorEntity.ApiError) {
                c4398kr = new Gq(failure.getError());
            } else if (Intrinsics.d(error, ErrorEntity.NoInternet.INSTANCE)) {
                c4398kr = new O0(new Jr(new C4373k2(c4605s3, v32, this.f29580g, null)));
            } else {
                c4398kr = Intrinsics.d(error, ErrorEntity.NotFound.INSTANCE) ? true : Intrinsics.d(error, ErrorEntity.ServiceUnavailable.INSTANCE) ? new O0(new Sm("Некорректный формат запроса или ответа")) : Intrinsics.d(error, ErrorEntity.TimeOut.INSTANCE) ? new O0(new C4761xg()) : new O0(new Sm("Системная или внутренняя ошибка"));
            }
        } else {
            if (!(contentResponse instanceof ContentResponse.Success)) {
                throw new Sc.o();
            }
            String str = v32.f30174c;
            ContentResponse.Success success = (ContentResponse.Success) contentResponse;
            Object data = success.getData();
            Intrinsics.f(data);
            c4398kr = new C4398kr(OneTimePasswordStateBuilderKt.confirmationOneTimePasswordState(str, ((ConfirmOtpResponseBody) data).getErrorCode(), ((ConfirmOtpResponseBody) success.getData()).getMessage()), v32.f30175d);
        }
        ((C4238fb) c4605s3.f32004b).b(c4398kr);
        return Unit.f71690a;
    }
}
