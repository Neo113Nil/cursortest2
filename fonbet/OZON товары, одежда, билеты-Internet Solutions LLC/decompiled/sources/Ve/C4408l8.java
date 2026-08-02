package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.PayBindingRequestBody;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.binding.PayBindingResponseBody;

/* renamed from: Ve.l8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4408l8 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O8 f31513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PayBindingRequestBody f31514f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f31515g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4408l8(O8 o82, PayBindingRequestBody payBindingRequestBody, xe.I i11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f31513e = o82;
        this.f31514f = payBindingRequestBody;
        this.f31515g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4408l8(this.f31513e, this.f31514f, this.f31515g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4408l8) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Ki dp;
        Ki c4085a2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31512d;
        PayBindingRequestBody payBindingRequestBody = this.f31514f;
        O8 o82 = this.f31513e;
        if (i11 == 0) {
            Sc.s.b(obj);
            ((C4238fb) o82.f29599b).b(new C4209eb(new C4351j9()));
            InterfaceC4524p8 interfaceC4524p8 = o82.f29598a;
            this.f31512d = 1;
            obj = ((C4710vl) interfaceC4524p8).w(payBindingRequestBody, this);
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
                c4085a2 = new O0(new Jr(new G7(o82, payBindingRequestBody, this.f31515g, null)));
            } else {
                dp = new Dp(failure.getError(), false);
                c4085a2 = dp;
            }
        } else {
            if (!(contentResponse instanceof ContentResponse.Success)) {
                throw new Sc.o();
            }
            Object data = ((ContentResponse.Success) contentResponse).getData();
            Intrinsics.f(data);
            PayBindingResponseBody payBindingResponseBody = (PayBindingResponseBody) data;
            if (payBindingResponseBody.getFormUrl() != null) {
                dp = new Vn(payBindingResponseBody.getFormUrl());
            } else if (Intrinsics.d(payBindingResponseBody.getResult(), "success")) {
                c4085a2 = new C4085a2(Ze.f30586a);
            } else {
                dp = new Dp(new ErrorEntity.BindingPaymentFailed(Nk.a.b("Unknown pay result ", payBindingResponseBody.getResult())), false);
            }
            c4085a2 = dp;
        }
        ((C4238fb) o82.f29599b).b(c4085a2);
        return Unit.f71690a;
    }
}
