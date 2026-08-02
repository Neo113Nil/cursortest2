package Ve;

import android.content.Intent;
import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.FraudMonInfo;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;
import xe.C10727i;

/* renamed from: Ve.u7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4667u7 extends AbstractC4642tb {

    /* renamed from: e, reason: collision with root package name */
    public final Y9 f32185e;

    /* renamed from: f, reason: collision with root package name */
    public final Pn f32186f;

    /* renamed from: g, reason: collision with root package name */
    public final Ae.x0 f32187g;

    /* renamed from: h, reason: collision with root package name */
    public String f32188h;

    /* renamed from: i, reason: collision with root package name */
    public final Ae.x0 f32189i;

    /* renamed from: j, reason: collision with root package name */
    public final Ae.x0 f32190j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4667u7(Te metricFacade, Vm sPayDataContract, Yc clearSdkUtil, Y9 sPaySdkReducer, Ib sPayStorage) {
        super(metricFacade, sPayDataContract, clearSdkUtil, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(clearSdkUtil, "clearSdkUtil");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        this.f32185e = sPaySdkReducer;
        AbstractC4245fi abstractC4245fi = ((Fh) ((C4673ud) sPayStorage).f32205b.getValue()).f29004a;
        Intrinsics.g(abstractC4245fi, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.FraudMonReview");
        this.f32186f = (Pn) abstractC4245fi;
        this.f32187g = Ae.O0.a(null);
        Ae.x0 a11 = Ae.O0.a(null);
        this.f32189i = a11;
        this.f32190j = a11;
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new C4551q6(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e0(kotlin.coroutines.jvm.internal.c cVar) {
        T6 t62;
        int i11;
        FraudMonCheckResult.FormParameters formParameters;
        if (cVar instanceof T6) {
            t62 = (T6) cVar;
            int i12 = t62.f30025f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                t62.f30025f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = t62.f30023d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = t62.f30025f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    FraudMonCheckResult a11 = this.f32186f.f29733a.a();
                    if (a11 != null && (formParameters = a11.getFormParameters()) != null) {
                        this.f32188h = formParameters.getCybercabinetUrlAndroid();
                        Ae.x0 x0Var = this.f32187g;
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
                        if (buttonDeclineText == null) {
                            buttonDeclineText = "";
                        }
                        String buttonInformText = formParameters.getButtonInformText();
                        Wb wb2 = new Wb(header, text, null, buttonConfirmText, buttonDeclineText, buttonInformText == null ? "" : buttonInformText, 196);
                        t62.f30025f = 1;
                        if (x0Var.emit(wb2, t62) == aVar) {
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
        t62 = new T6(this, cVar);
        Object obj2 = t62.f30023d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = t62.f30025f;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    public final void f0(Hm fraudMonReviewEvent) {
        Intrinsics.checkNotNullParameter(fraudMonReviewEvent, "fraudMonReviewEvent");
        J1 j12 = (J1) fraudMonReviewEvent;
        boolean equals = j12.equals(C4171d1.f30845b);
        Y9 y92 = this.f32185e;
        Vm vm = this.f30498b;
        Te te2 = this.f30497a;
        if (equals) {
            FraudMonInfo fraudMonInfo = new FraudMonInfo(FraudMonInfo.CONFIRMED_GENUINE);
            C4654tn c4654tn = (C4654tn) vm;
            c4654tn.getClass();
            Intrinsics.checkNotNullParameter(fraudMonInfo, "fraudMonInfo");
            c4654tn.f32147p = fraudMonInfo;
            ((C4238fb) y92).b(new C4263g7(Boolean.FALSE, null, null, null));
            te2.b(new Bi(Vd.TOUCH_CONFIRM_OPERATION_BUTTON, Ur.REVIEW_HINT_VIEW, Pe.TOUCH, null, null, null, null, 120));
            return;
        }
        if (j12.equals(C4313i.f31222a)) {
            FraudMonInfo fraudMonInfo2 = new FraudMonInfo(FraudMonInfo.UNKNOWN);
            C4654tn c4654tn2 = (C4654tn) vm;
            c4654tn2.getClass();
            Intrinsics.checkNotNullParameter(fraudMonInfo2, "fraudMonInfo");
            c4654tn2.f32147p = fraudMonInfo2;
            ((C4238fb) y92).b(B5.f28668a);
            te2.b(new Bi(Vd.TOUCH_CANCEL_BUTTON, Ur.REVIEW_HINT_VIEW, Pe.TOUCH, null, null, null, null, 120));
            return;
        }
        if (!j12.equals(P.f29657a)) {
            if (j12.equals(C4745x0.f32438a)) {
                te2.b(new Bi(Vd.LC_REVIEW_HINT_VIEW_APPEARED, Ur.REVIEW_HINT_VIEW, Pe.LCStart, null, null, null, null, 120));
                return;
            } else {
                if (j12.equals(C4171d1.f30844a)) {
                    te2.b(new Bi(Vd.LC_REVIEW_HINT_VIEW_DISAPPEARED, Ur.REVIEW_HINT_VIEW, Pe.LCEnd, null, null, null, null, 120));
                    return;
                }
                return;
            }
        }
        FraudMonInfo fraudMonInfo3 = new FraudMonInfo(FraudMonInfo.CONFIRMED_FRAUD);
        C4654tn c4654tn3 = (C4654tn) vm;
        c4654tn3.getClass();
        Intrinsics.checkNotNullParameter(fraudMonInfo3, "fraudMonInfo");
        c4654tn3.f32147p = fraudMonInfo3;
        ((C4238fb) y92).b(B5.f28668a);
        this.f32189i.setValue(new Intent("android.intent.action.VIEW", Uri.parse(this.f32188h)));
        te2.b(new Bi(Vd.TOUCH_HYPERLINK, Ur.REVIEW_HINT_VIEW, Pe.TOUCH, null, null, null, null, 120));
    }
}
