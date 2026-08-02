package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;
import xe.C10727i;

/* loaded from: classes6.dex */
public final class Na extends AbstractC4642tb {

    /* renamed from: e, reason: collision with root package name */
    public final Y9 f29545e;

    /* renamed from: f, reason: collision with root package name */
    public final Pn f29546f;

    /* renamed from: g, reason: collision with root package name */
    public final Ae.x0 f29547g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Na(Te metricFacade, Vm sPayDataContract, Yc clearSdkUtil, Y9 sPaySdkReducer, Ib sPayStorage) {
        super(metricFacade, sPayDataContract, clearSdkUtil, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(clearSdkUtil, "clearSdkUtil");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        this.f29545e = sPaySdkReducer;
        AbstractC4245fi abstractC4245fi = ((Fh) ((C4673ud) sPayStorage).f32205b.getValue()).f29004a;
        Intrinsics.g(abstractC4245fi, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.FraudMonReview");
        this.f29546f = (Pn) abstractC4245fi;
        this.f29547g = Ae.O0.a(null);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new H9(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e0(kotlin.coroutines.jvm.internal.c cVar) {
        C4410la c4410la;
        int i11;
        FraudMonCheckResult.FormParameters formParameters;
        if (cVar instanceof C4410la) {
            c4410la = (C4410la) cVar;
            int i12 = c4410la.f31519f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4410la.f31519f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4410la.f31517d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4410la.f31519f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    FraudMonCheckResult a11 = this.f29546f.f29733a.a();
                    if (a11 != null && (formParameters = a11.getFormParameters()) != null) {
                        Ae.x0 x0Var = this.f29547g;
                        String header = formParameters.getHeader();
                        if (header == null) {
                            header = "";
                        }
                        String textDecline = formParameters.getTextDecline();
                        if (textDecline == null) {
                            textDecline = "";
                        }
                        String buttonDeclineText = formParameters.getButtonDeclineText();
                        Wb wb2 = new Wb(header, null, textDecline, null, buttonDeclineText == null ? "" : buttonDeclineText, null, 234);
                        c4410la.f31519f = 1;
                        if (x0Var.emit(wb2, c4410la) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            }
        }
        c4410la = new C4410la(this, cVar);
        Object obj2 = c4410la.f31517d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4410la.f31519f;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    public final void f0(Hm fraudMonReviewEvent) {
        Intrinsics.checkNotNullParameter(fraudMonReviewEvent, "fraudMonReviewEvent");
        S6 s62 = (S6) fraudMonReviewEvent;
        boolean equals = s62.equals(C4376k5.f31419a);
        Te te2 = this.f30497a;
        if (equals) {
            te2.b(new Bi(EnumC4648th.TOUCH_TO_PAYMENT_METHODS_BUTTON, Ur.DENY_VIEW, Pe.TOUCH, null, null, null, null, 120));
            ((C4238fb) this.f29545e).b(C4825zo.f32678a);
        } else if (s62.equals(M5.f29460a)) {
            te2.b(new Bi(EnumC4648th.LC_DENY_VIEW_APPEARED, Ur.DENY_VIEW, Pe.LCStart, null, null, null, null, 120));
        } else if (s62.equals(C4522p6.f31763a)) {
            te2.b(new Bi(EnumC4648th.LC_DENY_VIEW_DISAPPEARED, Ur.DENY_VIEW, Pe.LCEnd, null, null, null, null, 120));
        }
    }
}
