package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.PaymentTokenRequestBody;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.paymentToken.successResponse.PaymentTokenResponseBody;

/* loaded from: classes10.dex */
public final class Ac extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f28596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4183dd f28597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Hd f28598f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f28599g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ac(C4183dd c4183dd, Hd hd2, xe.I i11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f28597e = c4183dd;
        this.f28598f = hd2;
        this.f28599g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Ac(this.f28597e, this.f28598f, this.f28599g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Ac) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0114, code lost:
    
        if (r2 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0116, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0047, code lost:
    
        if (r2 == r1) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object r11;
        Ki e22;
        Object e11;
        E2 e23;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f28596d;
        Hd hd2 = this.f28598f;
        C4183dd c4183dd = this.f28597e;
        if (i11 == 0) {
            Sc.s.b(obj);
            ((C4238fb) c4183dd.f30871b).b(new C4209eb(new C4351j9()));
            InterfaceC4524p8 interfaceC4524p8 = c4183dd.f30870a;
            PaymentTokenRequestBody paymentTokenRequestBody = hd2.f29150b;
            this.f28596d = 1;
            r11 = ((C4710vl) interfaceC4524p8).r(paymentTokenRequestBody, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                e11 = obj;
                e22 = (Ki) e11;
                ((C4238fb) c4183dd.f30871b).b(e22);
                return Unit.f71690a;
            }
            Sc.s.b(obj);
            r11 = obj;
        }
        ContentResponse contentResponse = (ContentResponse) r11;
        if (!(contentResponse instanceof ContentResponse.Failure)) {
            if (!(contentResponse instanceof ContentResponse.Success)) {
                throw new Sc.o();
            }
            Object data = ((ContentResponse.Success) contentResponse).getData();
            Intrinsics.f(data);
            e22 = new E2(new C4594rl((PaymentTokenResponseBody) data));
            ((C4238fb) c4183dd.f30871b).b(e22);
            return Unit.f71690a;
        }
        this.f28596d = 2;
        c4183dd.getClass();
        Intrinsics.g(contentResponse, "null cannot be cast to non-null type spay.sdk.domain.model.response.ContentResponse.Failure<spay.sdk.domain.model.response.paymentToken.successResponse.PaymentTokenResponseBody>");
        ContentResponse.Failure failure = (ContentResponse.Failure) contentResponse;
        ErrorEntity error = failure.getError();
        boolean z11 = error instanceof ErrorEntity.ApiError;
        xe.I i12 = this.f28599g;
        if (z11) {
            if (hd2.f29150b.isBnplEnabled()) {
                PaymentTokenRequestBody paymentTokenRequestBody2 = PaymentTokenRequestBody.copy$default(hd2.f29150b, null, null, 0, null, null, false, null, 95, null);
                String authorization = hd2.f29149a;
                Intrinsics.checkNotNullParameter(authorization, "authorization");
                Intrinsics.checkNotNullParameter(paymentTokenRequestBody2, "paymentTokenRequestBody");
                e23 = new E2(new Nk(failure.getError(), new C4613sb(c4183dd, new Hd(authorization, paymentTokenRequestBody2), i12, null)));
            } else {
                e23 = new E2(new C4420lk(failure.getError()));
            }
            e11 = e23;
        } else {
            e11 = error instanceof ErrorEntity.BadRequest ? M1.b.e(((ErrorEntity.BadRequest) error).getFraudMonCheckResult(), c4183dd.f30872c) : Intrinsics.d(error, ErrorEntity.NoInternet.INSTANCE) ? new O0(new Jr(new Xb(c4183dd, hd2, i12, null))) : Intrinsics.d(error, ErrorEntity.TimeOut.INSTANCE) ? new O0(new C4761xg()) : Intrinsics.d(error, ErrorEntity.Unknown.INSTANCE) ? new O0(new Sm("Системная или внутренняя ошибка")) : new O0(new Sm("Некорректный формат запроса или ответа"));
        }
    }
}
