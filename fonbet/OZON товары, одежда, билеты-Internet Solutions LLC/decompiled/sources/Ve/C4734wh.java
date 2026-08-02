package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.request.BindingV3SessionIdRequestBody;
import spay.sdk.domain.model.response.BindingCheckResult;
import spay.sdk.domain.model.response.BindingSessionId;
import spay.sdk.domain.model.response.CardRegion;
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;
import xe.C10720e0;

/* renamed from: Ve.wh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4734wh extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC4524p8 f32366d;

    /* renamed from: e, reason: collision with root package name */
    public String f32367e;

    /* renamed from: f, reason: collision with root package name */
    public String f32368f;

    /* renamed from: g, reason: collision with root package name */
    public int f32369g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Wh f32370h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Al f32371i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ xe.I f32372j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4734wh(Wh wh2, Al al, xe.I i11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f32370h = wh2;
        this.f32371i = al;
        this.f32372j = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4734wh(this.f32370h, this.f32371i, this.f32372j, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4734wh) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0087, code lost:
    
        if (r15 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0089, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x006f, code lost:
    
        if (r15 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC4524p8 interfaceC4524p8;
        String str;
        String str2;
        Ki ki2;
        Ki c4213ef;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32369g;
        Al al = this.f32371i;
        Wh wh2 = this.f32370h;
        if (i11 == 0) {
            Sc.s.b(obj);
            ((C4238fb) wh2.f30280b).b(new C4209eb(new W6()));
            if (!Lf.a.r0(wh2.f30281c, EnumC4290h5.PAY_BINDING_V2, null)) {
                ((C4238fb) wh2.f30280b).b(new Dp(ErrorEntity.AccessDenied.INSTANCE, false));
                return Unit.f71690a;
            }
            interfaceC4524p8 = wh2.f30279a;
            str = al.f28629a;
            this.f32366d = interfaceC4524p8;
            this.f32367e = str;
            str2 = al.f28630b;
            this.f32368f = str2;
            this.f32369g = 1;
            C10720e0 c10720e0 = C10720e0.f105451a;
            obj = wh2.f30283e.i(He.b.f10879b, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                ContentResponse contentResponse = (ContentResponse) obj;
                if (contentResponse instanceof ContentResponse.Failure) {
                    ContentResponse.Failure failure = (ContentResponse.Failure) contentResponse;
                    if (failure.getError() instanceof ErrorEntity.NoInternet) {
                        ki2 = new O0(new Jr(new Qg(wh2, al, this.f32372j, null)));
                    } else {
                        c4213ef = new Dp(failure.getError(), false);
                        ki2 = c4213ef;
                    }
                } else {
                    if (!(contentResponse instanceof ContentResponse.Success)) {
                        throw new Sc.o();
                    }
                    Object data = ((ContentResponse.Success) contentResponse).getData();
                    Intrinsics.f(data);
                    BindingSessionId bindingSessionId = (BindingSessionId) data;
                    Vi vi2 = wh2.f30284f;
                    FraudMonCheckResult fraudMonCheckResult = bindingSessionId.getFraudMonCheckResult();
                    mg.e eVar = I9.f29222b;
                    if (fraudMonCheckResult != null) {
                        if (kotlin.text.h.D(fraudMonCheckResult.getActionCode(), "REVIEW", true) && Intrinsics.d(fraudMonCheckResult.getConfirmMethodFactor(), M1.b.m("U0JFUlBBWV9PVFA="))) {
                            eVar = new C4439ma(fraudMonCheckResult);
                        } else if (kotlin.text.h.D(fraudMonCheckResult.getActionCode(), "DENY", true) || (kotlin.text.h.D(fraudMonCheckResult.getActionCode(), "REVIEW", true) && Intrinsics.d(fraudMonCheckResult.getConfirmMethodFactor(), M1.b.m("U0JFUlBBWV9TQk9M")))) {
                            eVar = new C8(fraudMonCheckResult);
                        }
                    }
                    if (eVar instanceof C8) {
                        ki2 = new Dp(new ErrorEntity.BindingPaymentFailed("Deny by fraudMon"), false);
                    } else {
                        if (eVar instanceof C4439ma) {
                            c4213ef = new C4213ef(bindingSessionId.getSessionId());
                            C4654tn c4654tn = (C4654tn) wh2.f30282d;
                            PayStrategy payStrategy = (PayStrategy) c4654tn.f32129F.getValue();
                            if (payStrategy instanceof PayStrategy.PayWithBinding) {
                                PayStrategy.PayWithBinding status = PayStrategy.PayWithBinding.copy$default((PayStrategy.PayWithBinding) payStrategy, null, null, true, 3, null);
                                c4654tn.getClass();
                                Intrinsics.checkNotNullParameter(status, "status");
                                c4654tn.f32128E.setValue(status);
                            }
                        } else if (bindingSessionId.getCardRegion() != CardRegion.LOCAL) {
                            ki2 = V4.f30176a;
                        } else if (bindingSessionId.getCheckResult() == null) {
                            ki2 = new Dp(new ErrorEntity.BindingPaymentFailed("Deny by check binding result (null)"), false);
                        } else if (bindingSessionId.getCheckResult() instanceof BindingCheckResult.NotAvailable) {
                            c4213ef = new Dp(new ErrorEntity.BindingPaymentFailed("Deny by check binding result"), ((BindingCheckResult.NotAvailable) bindingSessionId.getCheckResult()).getNeedUpdateBinding());
                        } else if (bindingSessionId.getFeatures().getNeedConfirmation() && bindingSessionId.getCheckResult().getIsSPayBinding()) {
                            c4213ef = new C4213ef(bindingSessionId.getSessionId());
                        } else {
                            ki2 = V4.f30176a;
                        }
                        ki2 = c4213ef;
                    }
                }
                ((C4238fb) wh2.f30280b).b(ki2);
                return Unit.f71690a;
            }
            str2 = this.f32368f;
            str = this.f32367e;
            interfaceC4524p8 = this.f32366d;
            Sc.s.b(obj);
        }
        BindingV3SessionIdRequestBody bindingV3SessionIdRequestBody = new BindingV3SessionIdRequestBody(str, str2, (String) obj);
        this.f32366d = null;
        this.f32367e = null;
        this.f32368f = null;
        this.f32369g = 2;
        obj = ((C4710vl) interfaceC4524p8).g(bindingV3SessionIdRequestBody, this);
    }
}
