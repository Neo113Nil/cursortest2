package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;
import xe.C10727i;

/* loaded from: classes6.dex */
public final class Y3 extends AbstractC4642tb {

    /* renamed from: e, reason: collision with root package name */
    public final Y9 f30429e;

    /* renamed from: f, reason: collision with root package name */
    public final Pn f30430f;

    /* renamed from: g, reason: collision with root package name */
    public final Ae.x0 f30431g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y3(Te metricFacade, Vm sPayDataContract, Yc clearSdkUtil, Y9 sPaySdkReducer, Ib sPayStorage) {
        super(metricFacade, sPayDataContract, clearSdkUtil, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(clearSdkUtil, "clearSdkUtil");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        this.f30429e = sPaySdkReducer;
        AbstractC4245fi abstractC4245fi = ((Fh) ((C4673ud) sPayStorage).f32205b.getValue()).f29004a;
        Intrinsics.g(abstractC4245fi, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.FraudMonReview");
        this.f30430f = (Pn) abstractC4245fi;
        this.f30431g = Ae.O0.a(null);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new R2(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e0(kotlin.coroutines.jvm.internal.c cVar) {
        C4692v3 c4692v3;
        int i11;
        FraudMonCheckResult.FormParameters formParameters;
        if (cVar instanceof C4692v3) {
            c4692v3 = (C4692v3) cVar;
            int i12 = c4692v3.f32257f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4692v3.f32257f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4692v3.f32255d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4692v3.f32257f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    FraudMonCheckResult a11 = this.f30430f.f29733a.a();
                    if (a11 != null && (formParameters = a11.getFormParameters()) != null) {
                        Ae.x0 x0Var = this.f30431g;
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
                        c4692v3.f32257f = 1;
                        if (x0Var.emit(wb2, c4692v3) == aVar) {
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
        c4692v3 = new C4692v3(this, cVar);
        Object obj2 = c4692v3.f32255d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4692v3.f32257f;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    public final void f0(Hm fraudMonReviewEvent) {
        Intrinsics.checkNotNullParameter(fraudMonReviewEvent, "fraudMonReviewEvent");
        O o11 = (O) fraudMonReviewEvent;
        boolean equals = o11.equals(Vq.f30228a);
        Te te2 = this.f30497a;
        if (equals) {
            te2.b(new Bi(Og.TOUCH_CLOSE_SDK_BUTTON, Ur.DENY_BLOCK_VIEW, Pe.TOUCH, null, null, null, null, 120));
            ((C4238fb) this.f30429e).b(C4825zo.f32678a);
        } else if (o11.equals(zr.f32685a)) {
            te2.b(new Bi(Og.LC_DENY_BLOCK_VIEW_APPEARED, Ur.DENY_BLOCK_VIEW, Pe.LCStart, null, null, null, null, 120));
        } else if (o11.equals(C4284h.f31130a)) {
            te2.b(new Bi(Og.LC_DENY_BLOCK_VIEW_DISAPPEARED, Ur.DENY_BLOCK_VIEW, Pe.LCEnd, null, null, null, null, 120));
        }
    }
}
