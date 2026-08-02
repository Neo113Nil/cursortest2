package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.FraudMonInfo;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;
import xe.C10727i;

/* loaded from: classes6.dex */
public final class Vh extends AbstractC4642tb {

    /* renamed from: e, reason: collision with root package name */
    public final Y9 f30203e;

    /* renamed from: f, reason: collision with root package name */
    public final Pn f30204f;

    /* renamed from: g, reason: collision with root package name */
    public final Ae.x0 f30205g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vh(Te metricFacade, Vm sPayDataContract, Yc clearSdkUtil, Y9 sPaySdkReducer, Ib sPayStorage, C4248fl featuresHandler, InterfaceC4686uq authHandler) {
        super(metricFacade, sPayDataContract, clearSdkUtil, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(clearSdkUtil, "clearSdkUtil");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(authHandler, "authHandler");
        this.f30203e = sPaySdkReducer;
        AbstractC4245fi abstractC4245fi = ((Fh) ((C4673ud) sPayStorage).f32205b.getValue()).f29004a;
        Intrinsics.g(abstractC4245fi, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.FraudMonReview");
        this.f30204f = (Pn) abstractC4245fi;
        this.f30205g = Ae.O0.a(null);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new Pg(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e0(kotlin.coroutines.jvm.internal.c cVar) {
        C4706vh c4706vh;
        int i11;
        FraudMonCheckResult.FormParameters formParameters;
        if (cVar instanceof C4706vh) {
            c4706vh = (C4706vh) cVar;
            int i12 = c4706vh.f32283f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4706vh.f32283f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4706vh.f32281d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4706vh.f32283f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    FraudMonCheckResult a11 = this.f30204f.f29733a.a();
                    if (a11 != null && (formParameters = a11.getFormParameters()) != null) {
                        Ae.x0 x0Var = this.f30205g;
                        String header = formParameters.getHeader();
                        if (header == null) {
                            header = "";
                        }
                        String text = formParameters.getText();
                        if (text == null) {
                            text = "";
                        }
                        String buttonConfirmText = formParameters.getButtonConfirmText();
                        if (buttonConfirmText == null) {
                            buttonConfirmText = "";
                        }
                        String buttonDeclineText = formParameters.getButtonDeclineText();
                        Wb wb2 = new Wb(header, text, null, buttonConfirmText, buttonDeclineText == null ? "" : buttonDeclineText, null, 228);
                        c4706vh.f32283f = 1;
                        if (x0Var.emit(wb2, c4706vh) == aVar) {
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
        c4706vh = new C4706vh(this, cVar);
        Object obj2 = c4706vh.f32281d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4706vh.f32283f;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    public final void f0(Hm fraudMonReviewEvent) {
        Intrinsics.checkNotNullParameter(fraudMonReviewEvent, "fraudMonReviewEvent");
        InterfaceC4385ke interfaceC4385ke = (InterfaceC4385ke) fraudMonReviewEvent;
        boolean equals = interfaceC4385ke.equals(Vb.f30191a);
        Y9 y92 = this.f30203e;
        Te te2 = this.f30497a;
        if (equals) {
            FraudMonInfo fraudMonInfo = new FraudMonInfo(FraudMonInfo.CONFIRMED_GENUINE);
            C4654tn c4654tn = (C4654tn) this.f30498b;
            c4654tn.getClass();
            Intrinsics.checkNotNullParameter(fraudMonInfo, "fraudMonInfo");
            c4654tn.f32147p = fraudMonInfo;
            ((C4238fb) y92).b(new C4263g7(Boolean.TRUE, null, null, null));
            te2.b(new Bi(Zg.TOUCH_CONFIRM_OPERATION_BUTTON, Ur.OTP_REVIEW_VIEW, Pe.TOUCH, null, null, null, null, 120));
            return;
        }
        if (interfaceC4385ke.equals(C4785yc.f32567a)) {
            te2.b(new Bi(Zg.TOUCH_CANCEL_BUTTON, Ur.OTP_REVIEW_VIEW, Pe.TOUCH, null, null, null, null, 120));
            ((C4238fb) y92).b(C4825zo.f32678a);
        } else if (interfaceC4385ke.equals(C4125bd.f30729a)) {
            te2.b(new Bi(Zg.LC_OTP_REVIEW_VIEW_APPEARED, Ur.OTP_REVIEW_VIEW, Pe.LCStart, null, null, null, null, 120));
        } else if (interfaceC4385ke.equals(Fd.f28995a)) {
            te2.b(new Bi(Zg.LC_OTP_REVIEW_VIEW_DISAPPEARED, Ur.OTP_REVIEW_VIEW, Pe.LCEnd, null, null, null, null, 120));
        }
    }
}
