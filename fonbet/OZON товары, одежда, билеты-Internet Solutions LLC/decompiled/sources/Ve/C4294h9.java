package Ve;

import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.BnplMethod;
import spay.sdk.domain.model.request.PaymentBnplPlanRequestBody;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;

/* renamed from: Ve.h9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4294h9 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31175d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f31176e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ J9 f31177f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4468na f31178g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4294h9(J9 j92, C4468na c4468na, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f31177f = j92;
        this.f31178g = c4468na;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        C4294h9 c4294h9 = new C4294h9(this.f31177f, this.f31178g, dVar);
        c4294h9.f31176e = obj;
        return c4294h9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4294h9) create((InterfaceC2397i) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0109, code lost:
    
        if (r1.emit(r2, r8) == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x010b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
    
        if (r9 == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0056, code lost:
    
        if (r9.emit(r1, r8) == r0) goto L47;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2397i interfaceC2397i;
        AbstractC4245fi gi2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31175d;
        J9 j92 = this.f31177f;
        Vm vm = j92.f29282c;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC2397i interfaceC2397i2 = (InterfaceC2397i) this.f31176e;
            if (((C4654tn) vm).f32141j.getValue() == null) {
                Bq bq = new Bq(new G8());
                this.f31176e = interfaceC2397i2;
                this.f31175d = 1;
            }
            interfaceC2397i = interfaceC2397i2;
        } else if (i11 == 1) {
            interfaceC2397i = (InterfaceC2397i) this.f31176e;
            Sc.s.b(obj);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            interfaceC2397i = (InterfaceC2397i) this.f31176e;
            Sc.s.b(obj);
            ContentResponse contentResponse = (ContentResponse) obj;
            if (contentResponse instanceof ContentResponse.Failure) {
                ContentResponse.Failure failure = (ContentResponse.Failure) contentResponse;
                ErrorEntity error = failure.getError();
                gi2 = error instanceof ErrorEntity.ApiError ? new Cb(new ErrorEntity.NoBnplResponse(((ErrorEntity.ApiError) failure.getError()).getErrorCode(), ((ErrorEntity.ApiError) failure.getError()).getDescription())) : Intrinsics.d(error, ErrorEntity.TimeOut.INSTANCE) ? new C4761xg() : Intrinsics.d(error, ErrorEntity.Unknown.INSTANCE) ? new Sm("Системная или внутренняя ошибка") : new Sm("Некорректный формат запроса или ответа");
            } else {
                if (!(contentResponse instanceof ContentResponse.Success)) {
                    throw new Sc.o();
                }
                Object data = ((ContentResponse.Success) contentResponse).getData();
                Intrinsics.f(data);
                gi2 = new Gi((PaymentPlanBnplResponseBody) data);
            }
            this.f31176e = null;
            this.f31175d = 3;
        }
        Object j11 = ((C4654tn) vm).j();
        this.f31176e = interfaceC2397i;
        this.f31175d = 2;
        Intrinsics.g(j11, "null cannot be cast to non-null type spay.sdk.domain.model.BnplMethod");
        BnplMethod bnplMethod = (BnplMethod) j11;
        boolean z11 = bnplMethod instanceof BnplMethod.SixPartPayment;
        C4468na c4468na = this.f31178g;
        InterfaceC4524p8 interfaceC4524p8 = j92.f29281b;
        PaymentBnplPlanRequestBody paymentBnplPlanRequestBody = c4468na.f31651b;
        if (z11) {
            obj = ((C4710vl) interfaceC4524p8).x(paymentBnplPlanRequestBody, this);
        } else if (bnplMethod instanceof BnplMethod.FourPartPayment) {
            obj = ((C4710vl) interfaceC4524p8).o(paymentBnplPlanRequestBody, this);
        } else {
            if (!(bnplMethod instanceof BnplMethod.NoPartPayment)) {
                throw new Sc.o();
            }
            obj = new ContentResponse.Failure(ErrorEntity.PayBnplPartsFail.INSTANCE);
        }
    }
}
