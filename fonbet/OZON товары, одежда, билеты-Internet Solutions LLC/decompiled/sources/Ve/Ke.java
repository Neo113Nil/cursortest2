package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.CreateOtpSdkRequestBody;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.otp.CreateOtpSdkResponseBody;
import spay.sdk.domain.model.response.otp.OneTimePasswordStateBuilderKt;

/* loaded from: classes10.dex */
public final class Ke extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4473nf f29348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Mf f29349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f29350g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ke(C4473nf c4473nf, Mf mf2, xe.I i11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29348e = c4473nf;
        this.f29349f = mf2;
        this.f29350g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Ke(this.f29348e, this.f29349f, this.f29350g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Ke) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Ki c4800z;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29347d;
        Mf mf2 = this.f29349f;
        C4473nf c4473nf = this.f29348e;
        if (i11 == 0) {
            Sc.s.b(obj);
            ((C4238fb) c4473nf.f31660b).b(new C4209eb(new C4178d8()));
            InterfaceC4524p8 interfaceC4524p8 = c4473nf.f31659a;
            CreateOtpSdkRequestBody createOtpSdkRequestBody = mf2.f29474b;
            this.f29347d = 1;
            obj = ((C4710vl) interfaceC4524p8).k(createOtpSdkRequestBody, this);
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
            c4800z = error instanceof ErrorEntity.ApiError ? new Nr(failure.getError()) : Intrinsics.d(error, ErrorEntity.NoInternet.INSTANCE) ? new O0(new Jr(new C4328ie(c4473nf, mf2, this.f29350g, null))) : Intrinsics.d(error, ErrorEntity.TimeOut.INSTANCE) ? new O0(new C4761xg()) : Intrinsics.d(error, ErrorEntity.Unknown.INSTANCE) ? new O0(new Sm("Системная или внутренняя ошибка")) : new O0(new Sm("Некорректный формат запроса или ответа"));
        } else {
            if (!(contentResponse instanceof ContentResponse.Success)) {
                throw new Sc.o();
            }
            Object data = ((ContentResponse.Success) contentResponse).getData();
            Intrinsics.f(data);
            CreateOtpSdkResponseBody createOtpSdkResponseBody = (CreateOtpSdkResponseBody) data;
            AbstractC4182dc creationOneTimePasswordState$default = OneTimePasswordStateBuilderKt.creationOneTimePasswordState$default(createOtpSdkResponseBody.getMobilePhone(), createOtpSdkResponseBody.getErrorCode(), createOtpSdkResponseBody.getErrorMessage(), null, 8, null);
            mf2.getClass();
            c4800z = new C4800z(creationOneTimePasswordState$default);
        }
        ((C4238fb) c4473nf.f31660b).b(c4800z);
        return Unit.f71690a;
    }
}
