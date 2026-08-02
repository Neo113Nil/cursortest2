package Ve;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2417s0;
import Ae.I0;
import h3.C6788a;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.domain.model.MerchantData;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.request.CreateOtpSdkRequestBody;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* loaded from: classes6.dex */
public final class Z2 extends AbstractC4599rq {

    /* renamed from: A, reason: collision with root package name */
    public final Ae.M0 f30533A;

    /* renamed from: B, reason: collision with root package name */
    public final Ae.M0 f30534B;

    /* renamed from: d, reason: collision with root package name */
    public final Y9 f30535d;

    /* renamed from: e, reason: collision with root package name */
    public final Ib f30536e;

    /* renamed from: f, reason: collision with root package name */
    public final C4605s3 f30537f;

    /* renamed from: g, reason: collision with root package name */
    public final C4473nf f30538g;

    /* renamed from: h, reason: collision with root package name */
    public final Zc f30539h;

    /* renamed from: i, reason: collision with root package name */
    public final Z0 f30540i;

    /* renamed from: j, reason: collision with root package name */
    public final C4512op f30541j;

    /* renamed from: k, reason: collision with root package name */
    public CountDownTimerC4352ja f30542k;

    /* renamed from: l, reason: collision with root package name */
    public final Ae.x0 f30543l;

    /* renamed from: m, reason: collision with root package name */
    public final long f30544m;

    /* renamed from: n, reason: collision with root package name */
    public final Ae.x0 f30545n;

    /* renamed from: o, reason: collision with root package name */
    public final Ae.M0 f30546o;

    /* renamed from: p, reason: collision with root package name */
    public final C4372k1 f30547p;

    /* renamed from: q, reason: collision with root package name */
    public final F0 f30548q;

    /* renamed from: r, reason: collision with root package name */
    public final String f30549r;

    /* renamed from: s, reason: collision with root package name */
    public final String f30550s;

    /* renamed from: t, reason: collision with root package name */
    public final Ae.M0 f30551t;

    /* renamed from: u, reason: collision with root package name */
    public final Ae.x0 f30552u;

    /* renamed from: v, reason: collision with root package name */
    public final Ae.M0 f30553v;

    /* renamed from: w, reason: collision with root package name */
    public final Ae.x0 f30554w;

    /* renamed from: x, reason: collision with root package name */
    public final Ae.M0 f30555x;

    /* renamed from: y, reason: collision with root package name */
    public final Ae.x0 f30556y;

    /* renamed from: z, reason: collision with root package name */
    public final Ae.M0 f30557z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z2(Te metricFacade, Vm sPayDataContract, Y9 sPaySdkReducer, Ib sPayStorage, C4605s3 confirmOtpCodeUseCase, C4473nf createOtpSdkCodeUseCase, Zc createBindingOtpUseCase, Z0 confirmBindingOtpCodeUseCase, C4512op hashUtility) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(confirmOtpCodeUseCase, "confirmOtpCodeUseCase");
        Intrinsics.checkNotNullParameter(createOtpSdkCodeUseCase, "createOtpSdkCodeUseCase");
        Intrinsics.checkNotNullParameter(createBindingOtpUseCase, "createBindingOtpUseCase");
        Intrinsics.checkNotNullParameter(confirmBindingOtpCodeUseCase, "confirmBindingOtpCodeUseCase");
        Intrinsics.checkNotNullParameter(hashUtility, "hashUtility");
        this.f30535d = sPaySdkReducer;
        this.f30536e = sPayStorage;
        this.f30537f = confirmOtpCodeUseCase;
        this.f30538g = createOtpSdkCodeUseCase;
        this.f30539h = createBindingOtpUseCase;
        this.f30540i = confirmBindingOtpCodeUseCase;
        this.f30541j = hashUtility;
        Ae.x0 a11 = Ae.O0.a(45000L);
        this.f30543l = a11;
        this.f30544m = 1000L;
        Ae.x0 a12 = Ae.O0.a(new L5(null));
        this.f30545n = a12;
        this.f30546o = C2399j.b(a12);
        this.f30547p = new C4372k1(this, 0);
        this.f30548q = new F0(this, 0);
        Be.m D11 = C2399j.D(((C4654tn) sPayDataContract).f32141j, new Y());
        C6788a a13 = androidx.lifecycle.x0.a(this);
        int i11 = Ae.I0.f818a;
        C2399j.M(D11, a13, I0.a.b(3), null);
        Ae.x0 a14 = Ae.O0.a(null);
        this.f30551t = C2399j.b(a14);
        Ae.x0 a15 = Ae.O0.a(null);
        this.f30552u = a15;
        Ae.M0 b11 = C2399j.b(a15);
        this.f30553v = b11;
        Ae.x0 a16 = Ae.O0.a(null);
        this.f30554w = a16;
        Boolean bool = Boolean.TRUE;
        this.f30555x = C2399j.b(Ae.O0.a(bool));
        Ae.x0 a17 = Ae.O0.a(null);
        this.f30556y = a17;
        this.f30557z = C2399j.M(C2399j.D(new C2406m0(a17), new R1()), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        this.f30533A = C2399j.M(new C2417s0(a16, b11, new C4544q()), androidx.lifecycle.x0.a(this), I0.a.b(3), Boolean.FALSE);
        this.f30534B = C2399j.M(C2399j.D(a11, new C4691v2()), androidx.lifecycle.x0.a(this), I0.a.b(3), new C4481nn(R.string.spay_empty_string, null, 0, null, 30));
        C4673ud c4673ud = (C4673ud) sPayStorage;
        if (!(c4673ud.a().f29004a instanceof U1)) {
            throw new C4581r8(c4673ud.a().toString());
        }
        AbstractC4245fi abstractC4245fi = c4673ud.a().f29004a;
        Intrinsics.g(abstractC4245fi, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.OneTimePassword");
        U1 u12 = (U1) abstractC4245fi;
        a11.setValue(Long.valueOf(u12.f30090b));
        AbstractC4182dc abstractC4182dc = u12.f30089a;
        if (abstractC4182dc instanceof C4467n9) {
            String str = abstractC4182dc.f30869a;
            Intrinsics.f(str);
            this.f30549r = str;
            this.f30550s = ((C4467n9) abstractC4182dc).f31649c;
            a12.setValue(new L5(bool));
        } else if (abstractC4182dc instanceof M4) {
            M4 m42 = (M4) abstractC4182dc;
            this.f30549r = m42.f29459c;
            a15.setValue(m42.f29458b);
        } else if (abstractC4182dc instanceof Z6) {
            Z6 z62 = (Z6) abstractC4182dc;
            this.f30549r = z62.f30571c;
            a15.setValue(z62.f30570b);
            a12.setValue(new L5(bool));
        } else if ((abstractC4182dc instanceof C4578r5) && !(((C4654tn) this.f30498b).j() instanceof PayStrategy.PayWithBinding)) {
            ((C4238fb) sPaySdkReducer).b(new Oc(Vf.f30201a, false));
        }
        int i12 = R.string.spay_otp_code_sent_message;
        String str2 = this.f30549r;
        if (str2 == null) {
            Intrinsics.n("mobilePhone");
            throw null;
        }
        Object[] args = {str2};
        Intrinsics.checkNotNullParameter(args, "args");
        a14.setValue(new Pq(i12, C7705l.f0(args)));
    }

    @Override // Ve.Yk
    public final void d0(M1.b viewState) {
        CountDownTimerC4352ja countDownTimerC4352ja;
        Intrinsics.checkNotNullParameter(viewState, "event");
        super.d0(viewState);
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        if (!viewState.equals(C4650tj.f32117a)) {
            if (!viewState.equals(Ph.f29719a) || (countDownTimerC4352ja = this.f30542k) == null) {
                return;
            }
            countDownTimerC4352ja.cancel();
            return;
        }
        Ae.x0 x0Var = this.f30543l;
        x0Var.setValue(Long.valueOf(((Number) x0Var.getValue()).longValue()));
        CountDownTimerC4352ja countDownTimerC4352ja2 = new CountDownTimerC4352ja(((Number) x0Var.getValue()).longValue(), this.f30544m, new N1(this, 1), new C4498ob(this));
        this.f30542k = countDownTimerC4352ja2;
        countDownTimerC4352ja2.start();
        CountDownTimerC4352ja countDownTimerC4352ja3 = this.f30542k;
        if (countDownTimerC4352ja3 != null) {
            countDownTimerC4352ja3.start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a8, code lost:
    
        r3 = (java.lang.String) r5.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
    
        if (r3 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b5, code lost:
    
        if (r3.length() != 5) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b9, code lost:
    
        if (Ve.Wk.f30290b != 5) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bb, code lost:
    
        r1 = "119950526";
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:
    
        r21.f30541j.getClass();
        r1 = Ve.C4512op.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d4, code lost:
    
        if (r1 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d6, code lost:
    
        r14 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0105, code lost:
    
        r1 = r9.j() instanceof spay.sdk.domain.model.PayStrategy.PayWithBinding;
        r2 = r21.f30543l;
        r4 = r21.f30549r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0111, code lost:
    
        if (r1 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0113, code lost:
    
        r5 = new spay.sdk.domain.model.request.ConfirmBindingOtpRequestBody(r14, r9.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x011e, code lost:
    
        if (r4 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0120, code lost:
    
        r2 = new Ve.C4176d6(new Ve.C4569qo(r21, new Ve.F1(r5, r4, ((java.lang.Number) r2.getValue()).longValue())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0182, code lost:
    
        ((Ve.C4238fb) r8).b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0187, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0138, code lost:
    
        kotlin.jvm.internal.Intrinsics.n("mobilePhone");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x013b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013c, code lost:
    
        r1 = r9.f32130G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013e, code lost:
    
        if (r1 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0140, code lost:
    
        r7 = r1.getAuthorization();
        r17 = new spay.sdk.domain.model.request.ConfirmOtpRequestBody(r1.getOrderId(), null, null, r14, null, r1.getMerchantLogin(), r9.k(), 22, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0164, code lost:
    
        if (r4 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0166, code lost:
    
        r2 = new Ve.C4176d6(new Ve.C4685up(r21, new Ve.V3(r7, r17, r4, ((java.lang.Number) r2.getValue()).longValue())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0188, code lost:
    
        kotlin.jvm.internal.Intrinsics.n("mobilePhone");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x018b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x018e, code lost:
    
        throw Ve.L3.f29386a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d8, code lost:
    
        r14 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00be, code lost:
    
        r3 = (java.lang.String) r5.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c4, code lost:
    
        if (r3 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c6, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c7, code lost:
    
        r1 = r3.concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e1, code lost:
    
        if (r5.getValue() != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e3, code lost:
    
        r1 = Lm0.a.f17149a;
        r1.b("OTP CODE GENERATION EXCEPTION");
        r1.e("Trying to generate hash code from null entered code string", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f0, code lost:
    
        r1 = Lm0.a.f17149a;
        r1.b("OTP CODE GENERATION EXCEPTION");
        r1.e(U7.m.b(r5.getValue(), "Trying to generate hash code from wrong length string "), new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a5, code lost:
    
        if (r1 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e0(M1.b event) {
        E6 e62;
        String cardNumber;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean equals = event.equals(C4662u2.f32174a);
        Te te2 = this.f30497a;
        if (equals) {
            Bi event2 = new Bi(Fr.TOUCH_BACK, Ur.OTP_VIEW, Pe.TOUCH, null, null, null, null, 120);
            Intrinsics.checkNotNullParameter(event2, "event");
            te2.b(event2);
            ((C4238fb) this.f31988c).b(C4825zo.f32678a);
            return;
        }
        boolean equals2 = event.equals(Y2.f30427a);
        Ae.x0 x0Var = this.f30554w;
        Ib ib2 = this.f30536e;
        Y9 y92 = this.f30535d;
        Vm vm = this.f30498b;
        if (!equals2) {
            if (event instanceof C3) {
                Object value = x0Var.getValue();
                String str = ((C3) event).f28736a;
                if (!Intrinsics.d(str, value)) {
                    this.f30552u.setValue(null);
                    ((C4238fb) y92).b(new L7());
                }
                x0Var.setValue(str);
                return;
            }
            if (event instanceof C4260g4) {
                this.f30556y.setValue(((C4260g4) event).f31077a);
                return;
            }
            if (!event.equals(U5.f30101a)) {
                if (event.equals(L4.f29387a)) {
                    Bi event3 = new Bi(Fr.LC_OTP_VIEW_APPEARED, Ur.OTP_VIEW, Pe.LC, null, null, null, null, 120);
                    Intrinsics.checkNotNullParameter(event3, "event");
                    te2.b(event3);
                    return;
                } else {
                    if (!event.equals(Y2.f30428b)) {
                        throw new Sc.o();
                    }
                    Bi event4 = new Bi(Fr.LC_OTP_VIEW_DISAPPEARED, Ur.OTP_VIEW, Pe.LC, null, null, null, null, 120);
                    Intrinsics.checkNotNullParameter(event4, "event");
                    te2.b(event4);
                    return;
                }
            }
            C4654tn c4654tn = (C4654tn) vm;
            if (c4654tn.j() instanceof PayStrategy.PayWithBinding) {
                e62 = new E6(new Bd(1, this, c4654tn.k()));
            } else {
                ListOfCardsResponseBody.PaymentToolInfo.Tool tool = ((C4673ud) ib2).a().f29005b;
                if (tool == null) {
                    throw new Mn();
                }
                int paymentId = tool.getPaymentId();
                MerchantData merchantData = c4654tn.f32130G;
                if (merchantData == null) {
                    throw L3.f29386a;
                }
                e62 = new E6(new Gr(this, new Mf(merchantData.getAuthorization(), new CreateOtpSdkRequestBody(merchantData.getOrderId(), c4654tn.k(), paymentId))));
            }
            ((C4238fb) y92).b(e62);
            return;
        }
        Bi event5 = new Bi(Fr.TOUCH_NEXT, Ur.OTP_VIEW, Pe.TOUCH, null, null, null, null, 120);
        Intrinsics.checkNotNullParameter(event5, "event");
        te2.b(event5);
        C4654tn c4654tn2 = (C4654tn) vm;
        MerchantData merchantData2 = c4654tn2.f32130G;
        if (merchantData2 == null) {
            throw L3.f29386a;
        }
        if (merchantData2.getBindingId() == null && (c4654tn2.j() instanceof PayStrategy.PayWithBinding)) {
            throw new C4509om();
        }
        this.f30545n.setValue(new L5(Boolean.FALSE));
        if (c4654tn2.j() instanceof PayStrategy.PayWithBinding) {
            cardNumber = this.f30550s;
        } else {
            ListOfCardsResponseBody.PaymentToolInfo.Tool tool2 = ((C4673ud) ib2).a().f29005b;
            cardNumber = tool2 != null ? tool2.getCardNumber() : null;
        }
    }
}
