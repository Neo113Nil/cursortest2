package Ve;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2417s0;
import Ae.I0;
import h3.C6788a;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;
import xe.C10720e0;
import xe.C10727i;

/* loaded from: classes6.dex */
public final class D1 extends AbstractC4599rq {

    /* renamed from: d, reason: collision with root package name */
    public final Ib f28800d;

    /* renamed from: e, reason: collision with root package name */
    public final Y9 f28801e;

    /* renamed from: f, reason: collision with root package name */
    public final C4248fl f28802f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4686uq f28803g;

    /* renamed from: h, reason: collision with root package name */
    public final C4154cd f28804h;

    /* renamed from: i, reason: collision with root package name */
    public final Vf f28805i;

    /* renamed from: j, reason: collision with root package name */
    public final Ae.M0 f28806j;

    /* renamed from: k, reason: collision with root package name */
    public final Ae.M0 f28807k;

    /* renamed from: l, reason: collision with root package name */
    public final Ae.M0 f28808l;

    /* renamed from: m, reason: collision with root package name */
    public final Ae.M0 f28809m;

    /* renamed from: n, reason: collision with root package name */
    public final Ae.M0 f28810n;

    /* renamed from: o, reason: collision with root package name */
    public final Ae.M0 f28811o;

    /* renamed from: p, reason: collision with root package name */
    public final Ae.M0 f28812p;

    /* renamed from: q, reason: collision with root package name */
    public final Ae.M0 f28813q;

    /* renamed from: r, reason: collision with root package name */
    public final Ae.M0 f28814r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D1(Te metricFacade, Vm sPayDataContract, Ib sPayStorage, Y9 sPaySdkReducer, C4248fl featuresHandler, InterfaceC4686uq authHandler, C4154cd getAgreementLinksTitlesUseCase) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        String offerText;
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(authHandler, "authHandler");
        Intrinsics.checkNotNullParameter(getAgreementLinksTitlesUseCase, "getAgreementLinksTitlesUseCase");
        this.f28800d = sPayStorage;
        this.f28801e = sPaySdkReducer;
        this.f28802f = featuresHandler;
        this.f28803g = authHandler;
        this.f28804h = getAgreementLinksTitlesUseCase;
        this.f28805i = Vf.f30201a;
        C4654tn c4654tn = (C4654tn) sPayDataContract;
        Ae.M0 m02 = c4654tn.f32141j;
        this.f28806j = C2399j.b(Ae.O0.a(Integer.valueOf(c4654tn.f32154w)));
        this.f28807k = c4654tn.f32139h;
        PayStrategy payStrategyStatus = ((C4654tn) this.f30498b).j();
        Intrinsics.checkNotNullParameter(payStrategyStatus, "payStrategyStatus");
        T0.g.f26423a = false;
        Be.m D11 = C2399j.D(m02, new C4310hp(0));
        C6788a a11 = androidx.lifecycle.x0.a(this);
        int i11 = Ae.I0.f818a;
        Ae.M0 M11 = C2399j.M(D11, a11, I0.a.b(3), null);
        this.f28808l = M11;
        Ae.M0 M12 = C2399j.M(C2399j.D(m02, new Np(sPayDataContract, null)), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        this.f28809m = M12;
        Ae.M0 M13 = C2399j.M(C2399j.D(M12, new C4455mq()), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        this.f28810n = M13;
        Ae.M0 M14 = C2399j.M(C2399j.D(M13, new C4310hp(1)), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        Ae.M0 M15 = C2399j.M(C2399j.D(m02, new Ho()), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        C2399j.M(new C4573r0(m02), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        Ae.M0 M16 = C2399j.M(C2399j.D(M11, new C4687ur(this, sPayDataContract, null)), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        this.f28811o = M16;
        this.f28812p = C2399j.M(new C2417s0(new C2406m0(M11), new C2406m0(M16), new C4222eo(this, null)), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        this.f28813q = C2399j.M(new C2417s0(M14, M15, new X0()), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        Ae.M0 M17 = C2399j.M(C2399j.D(M12, new Li(this, null)), androidx.lifecycle.x0.a(this), I0.a.c(), null);
        PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = (PaymentPlanBnplResponseBody) M12.getValue();
        this.f28814r = C2399j.M(new C2417s0(M17, Ae.O0.a((paymentPlanBnplResponseBody == null || (offerText = paymentPlanBnplResponseBody.getOfferText()) == null) ? null : M1.b.p(offerText)), new Bm()), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e0(E event) {
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList;
        ListOfCardsResponseBody listOfCardsResponseBody;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo2;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList2;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z11 = event instanceof Mk;
        Ae.M0 m02 = this.f28808l;
        Y9 y92 = this.f28801e;
        Object[] objArr = 0;
        kotlin.coroutines.d dVar = null;
        Te te2 = this.f30497a;
        if (z11) {
            Bi event2 = new Bi(M2.TOUCH_PAY, Ur.BNPL_PARTS_VIEW, Pe.TOUCH, null, null, null, null, 120);
            Intrinsics.checkNotNullParameter(event2, "event");
            te2.b(event2);
            ListOfCardsResponseBody.PaymentToolInfo.Tool tool = (ListOfCardsResponseBody.PaymentToolInfo.Tool) this.f28811o.getValue();
            if (tool == null || (listOfCardsResponseBody = (ListOfCardsResponseBody) m02.getValue()) == null || (paymentToolInfo2 = listOfCardsResponseBody.getPaymentToolInfo()) == null || (toolList2 = paymentToolInfo2.getToolList()) == null) {
                return;
            }
            for (ListOfCardsResponseBody.PaymentToolInfo.Tool tool2 : toolList2) {
                if (Intrinsics.d(tool2.getCardNumber(), tool.getCardNumber())) {
                    EnumC4290h5 enumC4290h5 = EnumC4290h5.BNPL;
                    Z8 z82 = Z8.f30578b;
                    C4248fl c4248fl = this.f28802f;
                    ((C4238fb) y92).b(new C4263g7(Boolean.valueOf(Lf.a.r0(c4248fl, EnumC4290h5.REFRESH_TOKEN, null) ? ((Yq) this.f28803g).f30524e : false), tool2, Boolean.valueOf(Lf.a.r0(c4248fl, enumC4290h5, z82) && Lf.a.r0(c4248fl, enumC4290h5, Z8.f30577a)), null));
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (event instanceof C4391kk) {
            C6788a a11 = androidx.lifecycle.x0.a(this);
            C10720e0 c10720e0 = C10720e0.f105451a;
            C10727i.c(a11, He.b.f10879b, null, new Cn(this, dVar, objArr == true ? 1 : 0), 2);
            return;
        }
        if (event instanceof Rl) {
            ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) m02.getValue();
            if (AbstractC4656tp.a((listOfCardsResponseBody2 == null || (paymentToolInfo = listOfCardsResponseBody2.getPaymentToolInfo()) == null || (toolList = paymentToolInfo.getToolList()) == null) ? null : Integer.valueOf(toolList.size())) <= 1) {
                return;
            }
            Bi event3 = new Bi(M2.TOUCH_CARD, Ur.BNPL_PARTS_VIEW, Pe.TOUCH, null, null, null, null, 120);
            Intrinsics.checkNotNullParameter(event3, "event");
            te2.b(event3);
            ((C4238fb) y92).b(new Wm(this.f28805i, null, false));
            return;
        }
        if (event instanceof C4624sm) {
            ((C4654tn) this.f30498b).f32138g.setValue(Boolean.valueOf(((C4624sm) event).f32064a));
            Bi event4 = new Bi(M2.TOUCH_APPROVE_BNPL, Ur.BNPL_PARTS_VIEW, Pe.TOUCH, null, null, null, null, 120);
            Intrinsics.checkNotNullParameter(event4, "event");
            te2.b(event4);
            return;
        }
        if (!(event instanceof C4566ql)) {
            throw new Sc.o();
        }
        C4566ql c4566ql = (C4566ql) event;
        int i11 = c4566ql.f31882a;
        if (i11 == 0) {
            Bi event5 = new Bi(M2.TOUCH_CONTRACT_VIEW, Ur.BNPL_PARTS_VIEW, Pe.TOUCH, null, null, null, null, 120);
            Intrinsics.checkNotNullParameter(event5, "event");
            te2.b(event5);
        } else if (i11 == 1) {
            Bi event6 = new Bi(M2.TOUCH_AGREEMENT_VIEW, Ur.BNPL_PARTS_VIEW, Pe.TOUCH, null, null, null, null, 120);
            Intrinsics.checkNotNullParameter(event6, "event");
            te2.b(event6);
        }
        ((C4238fb) y92).b(new C4441mc(c4566ql.f31883b));
    }
}
