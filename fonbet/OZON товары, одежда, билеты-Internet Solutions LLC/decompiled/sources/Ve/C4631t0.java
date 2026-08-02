package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.domain.model.request.ConfirmBindingOtpRequestBody;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.otp.OneTimePasswordStateBuilderKt;

/* renamed from: Ve.t0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4631t0 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z0 f32075e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F1 f32076f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f32077g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4631t0(Z0 z02, F1 f12, xe.I i11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f32075e = z02;
        this.f32076f = f12;
        this.f32077g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4631t0(this.f32075e, this.f32076f, this.f32077g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4631t0) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Ki c4398kr;
        String errorCode;
        Integer w02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32074d;
        Z0 z02 = this.f32075e;
        F1 f12 = this.f32076f;
        if (i11 == 0) {
            Sc.s.b(obj);
            ((C4238fb) z02.f30528b).b(new C4209eb(new C4178d8()));
            InterfaceC4524p8 interfaceC4524p8 = z02.f30527a;
            ConfirmBindingOtpRequestBody confirmBindingOtpRequestBody = f12.f28957a;
            this.f32074d = 1;
            obj = ((C4710vl) interfaceC4524p8).h(confirmBindingOtpRequestBody, this);
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
            if (failure.getError() instanceof ErrorEntity.NoInternet) {
                c4398kr = new O0(new Jr(new L(z02, f12, this.f32077g, null)));
            } else {
                String str = f12.f28958b;
                ErrorEntity error = failure.getError();
                ErrorEntity.ApiError apiError = error instanceof ErrorEntity.ApiError ? (ErrorEntity.ApiError) error : null;
                AbstractC4182dc confirmationOneTimePasswordState$default = OneTimePasswordStateBuilderKt.confirmationOneTimePasswordState$default(str, (apiError == null || (errorCode = apiError.getErrorCode()) == null || (w02 = kotlin.text.h.w0(errorCode)) == null) ? 2 : w02.intValue(), null, 4, null);
                c4398kr = ((confirmationOneTimePasswordState$default instanceof Z6) || (confirmationOneTimePasswordState$default instanceof M4)) ? new C4398kr(confirmationOneTimePasswordState$default, f12.f28959c) : new Dp(failure.getError(), false);
            }
        } else {
            if (!(contentResponse instanceof ContentResponse.Success)) {
                throw new Sc.o();
            }
            c4398kr = new C4398kr(OneTimePasswordStateBuilderKt.confirmationOneTimePasswordState$default(f12.f28958b, 0, null, 4, null), f12.f28959c);
        }
        ((C4238fb) z02.f30528b).b(c4398kr);
        return Unit.f71690a;
    }
}
