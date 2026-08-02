package Ve;

import Ae.C2399j;
import Ae.C2417s0;
import Ae.I0;
import h3.C6788a;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import xe.C10720e0;
import xe.C10727i;

/* renamed from: Ve.a9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4092a9 extends AbstractC4599rq {

    /* renamed from: d, reason: collision with root package name */
    public final Y9 f30646d;

    /* renamed from: e, reason: collision with root package name */
    public final C4248fl f30647e;

    /* renamed from: f, reason: collision with root package name */
    public final C4154cd f30648f;

    /* renamed from: g, reason: collision with root package name */
    public final Ae.M0 f30649g;

    /* renamed from: h, reason: collision with root package name */
    public final Ae.M0 f30650h;

    /* renamed from: i, reason: collision with root package name */
    public final Ae.M0 f30651i;

    /* renamed from: j, reason: collision with root package name */
    public final Ae.M0 f30652j;

    /* renamed from: k, reason: collision with root package name */
    public final Ae.M0 f30653k;

    /* renamed from: l, reason: collision with root package name */
    public final Ae.M0 f30654l;

    /* renamed from: m, reason: collision with root package name */
    public final Ae.M0 f30655m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4092a9(Te metricFacade, Vm sPayDataContract, Ib sPayStorage, Y9 sPaySdkReducer, C4248fl featuresHandler, C4154cd getAgreementLinksTitlesUseCase) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        String offerText;
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(getAgreementLinksTitlesUseCase, "getAgreementLinksTitlesUseCase");
        this.f30646d = sPaySdkReducer;
        this.f30647e = featuresHandler;
        this.f30648f = getAgreementLinksTitlesUseCase;
        C4654tn c4654tn = (C4654tn) sPayDataContract;
        Ae.M0 m02 = c4654tn.f32141j;
        this.f30649g = C2399j.b(Ae.O0.a(Integer.valueOf(c4654tn.f32154w)));
        Be.m D11 = C2399j.D(m02, new M6(0));
        C6788a a11 = androidx.lifecycle.x0.a(this);
        int i11 = Ae.I0.f818a;
        Ae.M0 M11 = C2399j.M(D11, a11, I0.a.b(3), null);
        this.f30650h = M11;
        Ae.M0 M12 = C2399j.M(C2399j.D(M11, new C4523p7()), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        this.f30651i = M12;
        Ae.M0 M13 = C2399j.M(C2399j.D(M12, new T7()), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        Ae.M0 M14 = C2399j.M(C2399j.D(M11, new C4716w(this, null)), androidx.lifecycle.x0.a(this), I0.a.c(), null);
        PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = (PaymentPlanBnplResponseBody) M11.getValue();
        this.f30652j = C2399j.M(new C2417s0(M14, Ae.O0.a((paymentPlanBnplResponseBody == null || (offerText = paymentPlanBnplResponseBody.getOfferText()) == null) ? null : M1.b.p(offerText)), new C4519p3()), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        this.f30653k = C2399j.M(new C2417s0(M13, C2399j.M(C2399j.D(m02, new H5()), androidx.lifecycle.x0.a(this), I0.a.b(3), null), new C4725w8(0)), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        Ae.M0 m03 = c4654tn.f32139h;
        this.f30654l = m03;
        this.f30655m = C2399j.M(C2399j.D(m03, new C4203e5()), androidx.lifecycle.x0.a(this), I0.a.b(3), Boolean.FALSE);
        C4673ud c4673ud = (C4673ud) sPayStorage;
        if (!(c4673ud.a().f29004a instanceof C4144c3)) {
            throw new C4581r8(c4673ud.a().toString());
        }
    }

    public final void e0(E event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.equals(Ge.f29073a)) {
            C6788a a11 = androidx.lifecycle.x0.a(this);
            C10720e0 c10720e0 = C10720e0.f105451a;
            C10727i.c(a11, He.b.f10879b, null, new C4749x4(this, null), 2);
            return;
        }
        if (event.equals(C4386kf.f31438a)) {
            C6788a a12 = androidx.lifecycle.x0.a(this);
            C10720e0 c10720e02 = C10720e0.f105451a;
            C10727i.c(a12, He.b.f10879b, null, new C4377k6(this, null), 2);
            return;
        }
        boolean equals = event.equals(Kf.f29351a);
        Te te2 = this.f30497a;
        if (equals) {
            Bi event2 = new Bi(EnumC4547q2.LC_BNPL_VIEW_APPEARED, Ur.BNPL_VIEW, Pe.LC, null, null, null, null, 120);
            Intrinsics.checkNotNullParameter(event2, "event");
            te2.b(event2);
            return;
        }
        if (event.equals(C4301hg.f31192a)) {
            Bi event3 = new Bi(EnumC4547q2.LC_BNPL_VIEW_DISAPPEARED, Ur.BNPL_VIEW, Pe.LC, null, null, null, null, 120);
            Intrinsics.checkNotNullParameter(event3, "event");
            te2.b(event3);
            return;
        }
        if (!(event instanceof Kg)) {
            if (!(event instanceof C4504oh)) {
                throw new Sc.o();
            }
            ((C4654tn) this.f30498b).f32138g.setValue(Boolean.valueOf(((C4504oh) event).f31729a));
            Bi event4 = new Bi(EnumC4547q2.TOUCH_APPROVE_BNPL, Ur.BNPL_VIEW, Pe.TOUCH, null, null, null, null, 120);
            Intrinsics.checkNotNullParameter(event4, "event");
            te2.b(event4);
            return;
        }
        Kg kg2 = (Kg) event;
        int i11 = kg2.f29352a;
        if (i11 == 0) {
            Bi event5 = new Bi(EnumC4547q2.TOUCH_CONTRACT_VIEW, Ur.BNPL_VIEW, Pe.TOUCH, null, null, null, null, 120);
            Intrinsics.checkNotNullParameter(event5, "event");
            te2.b(event5);
        } else if (i11 == 1) {
            Bi event6 = new Bi(EnumC4547q2.TOUCH_AGREEMENT_VIEW, Ur.BNPL_VIEW, Pe.TOUCH, null, null, null, null, 120);
            Intrinsics.checkNotNullParameter(event6, "event");
            te2.b(event6);
        }
        ((C4238fb) this.f30646d).b(new C4441mc(kg2.f29353b));
    }
}
