package Ve;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2415r0;
import Ae.C2417s0;
import Ae.I0;
import Ae.InterfaceC2395h;
import h3.C6788a;
import id.C7048a;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;
import xe.C10727i;

/* renamed from: Ve.i4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4318i4 extends AbstractC4599rq {

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.m[] f31236E = {I1.w.c(C4318i4.class, "screenMode", "getScreenMode()Lspay/sdk/domain/OrderScreenMode;", 0)};

    /* renamed from: A, reason: collision with root package name */
    public final Ae.x0 f31237A;

    /* renamed from: B, reason: collision with root package name */
    public final Ae.M0 f31238B;

    /* renamed from: C, reason: collision with root package name */
    public final Ae.x0 f31239C;

    /* renamed from: D, reason: collision with root package name */
    public final Ae.M0 f31240D;

    /* renamed from: d, reason: collision with root package name */
    public final C4248fl f31241d;

    /* renamed from: e, reason: collision with root package name */
    public final Ib f31242e;

    /* renamed from: f, reason: collision with root package name */
    public final Y9 f31243f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4686uq f31244g;

    /* renamed from: h, reason: collision with root package name */
    public final H4 f31245h;

    /* renamed from: i, reason: collision with root package name */
    public final Nl f31246i;

    /* renamed from: j, reason: collision with root package name */
    public final id.f f31247j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f31248k;

    /* renamed from: l, reason: collision with root package name */
    public final Ae.x0 f31249l;

    /* renamed from: m, reason: collision with root package name */
    public final Ae.M0 f31250m;

    /* renamed from: n, reason: collision with root package name */
    public final Ae.M0 f31251n;

    /* renamed from: o, reason: collision with root package name */
    public final Ae.M0 f31252o;

    /* renamed from: p, reason: collision with root package name */
    public final Ae.M0 f31253p;

    /* renamed from: q, reason: collision with root package name */
    public final Ae.M0 f31254q;

    /* renamed from: r, reason: collision with root package name */
    public final Ae.M0 f31255r;

    /* renamed from: s, reason: collision with root package name */
    public final Ae.M0 f31256s;

    /* renamed from: t, reason: collision with root package name */
    public final Ae.M0 f31257t;

    /* renamed from: u, reason: collision with root package name */
    public final Ae.M0 f31258u;

    /* renamed from: v, reason: collision with root package name */
    public final PayStrategy f31259v;

    /* renamed from: w, reason: collision with root package name */
    public final Ae.M0 f31260w;

    /* renamed from: x, reason: collision with root package name */
    public final Ae.M0 f31261x;

    /* renamed from: y, reason: collision with root package name */
    public final Ae.x0 f31262y;

    /* renamed from: z, reason: collision with root package name */
    public final Ae.M0 f31263z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4318i4(Te metricFacade, Vm sPayDataContract, C4248fl featuresHandler, Ib sPayStorage, Y9 sPaySdkReducer, InterfaceC4686uq authHandler, H4 helperManager, Vl sPaySdkConfigRepository, Nq selectCardPreparationHelper, Nl notEnoughMoneyCheckUseCase) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(authHandler, "authHandler");
        Intrinsics.checkNotNullParameter(helperManager, "helperManager");
        Intrinsics.checkNotNullParameter(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        Intrinsics.checkNotNullParameter(selectCardPreparationHelper, "selectCardPreparationHelper");
        Intrinsics.checkNotNullParameter(notEnoughMoneyCheckUseCase, "notEnoughMoneyCheckUseCase");
        this.f31241d = featuresHandler;
        this.f31242e = sPayStorage;
        this.f31243f = sPaySdkReducer;
        this.f31244g = authHandler;
        this.f31245h = helperManager;
        this.f31246i = notEnoughMoneyCheckUseCase;
        C7048a.f66242a.getClass();
        id.f a11 = C7048a.a();
        this.f31247j = a11;
        C4654tn c4654tn = (C4654tn) sPayDataContract;
        Ae.x0 a12 = Ae.O0.a(Boolean.valueOf(((C4487o0) c4654tn.f32127D.getValue()).f31693a));
        this.f31249l = a12;
        Ae.M0 m02 = c4654tn.f32141j;
        Be.m D11 = C2399j.D(m02, new Pl());
        C6788a a13 = androidx.lifecycle.x0.a(this);
        int i11 = Ae.I0.f818a;
        Ae.M0 M11 = C2399j.M(D11, a13, I0.a.b(3), null);
        this.f31250m = M11;
        Ae.M0 M12 = C2399j.M(C2399j.D(M11, new Rm(this, null)), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        this.f31251n = M12;
        Ae.M0 M13 = C2399j.M(C2399j.D(m02, new M6(1)), androidx.lifecycle.x0.a(this), I0.a.c(), null);
        this.f31252o = C2399j.M(new C2415r0(new InterfaceC2395h[]{M12, M13, a12, M11}, new C4333ik(this, sPayDataContract, null)), androidx.lifecycle.x0.a(this), I0.a.b(3), 0);
        Ae.M0 M14 = C2399j.M(C2399j.D(m02, new Hj()), androidx.lifecycle.x0.a(this), I0.a.c(), null);
        this.f31253p = M14;
        this.f31254q = C2399j.M(new C4742wp(new C2406m0(M11)), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        this.f31255r = C2399j.M(new C2417s0(new C2406m0(M11), new C2406m0(M12), new Kk(this, sPayDataContract, null)), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        Ae.M0 M15 = C2399j.M(new C4225er(m02), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        this.f31256s = M15;
        this.f31257t = C2399j.M(new C4083a0(M15), androidx.lifecycle.x0.a(this), I0.a.b(3), Boolean.FALSE);
        this.f31258u = C2399j.M(new T1(new C2406m0(M11), 0), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        this.f31259v = c4654tn.j();
        this.f31260w = C2399j.M(new E3(M14, this, sPayDataContract, sPaySdkConfigRepository), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        Ae.M0 M16 = C2399j.M(C2399j.i(new C2406m0(M13), a12, new C2406m0(M11), new On(this, null)), androidx.lifecycle.x0.a(this), I0.a.c(), null);
        this.f31261x = M16;
        Ae.x0 a14 = Ae.O0.a(null);
        this.f31262y = a14;
        this.f31263z = C2399j.M(new C2417s0(a14, c4654tn.f32129F, new C4567qm()), androidx.lifecycle.x0.a(this), I0.a.d(), E.d(R.string.spay_pay_text));
        kotlin.collections.K k11 = kotlin.collections.K.f71697a;
        Ae.x0 a15 = Ae.O0.a(k11);
        this.f31237A = a15;
        this.f31238B = C2399j.M(C2399j.i(a15, M16, M11, new C4246fj()), androidx.lifecycle.x0.a(this), I0.a.c(), k11);
        Ae.x0 a16 = Ae.O0.a(kotlin.collections.M.f71699a);
        this.f31239C = a16;
        this.f31240D = C2399j.b(a16);
        C4673ud c4673ud = (C4673ud) sPayStorage;
        if (!(c4673ud.a().f29004a instanceof C4144c3)) {
            throw new C4581r8(c4673ud.a().toString());
        }
        AbstractC4245fi abstractC4245fi = c4673ud.a().f29004a;
        Intrinsics.g(abstractC4245fi, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.OrderScreenData");
        a11.setValue(this, f31236E[0], ((C4144c3) abstractC4245fi).f30773a);
        AbstractC4245fi abstractC4245fi2 = c4673ud.a().f29004a;
        Intrinsics.g(abstractC4245fi2, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.OrderScreenData");
        this.f31248k = ((C4144c3) abstractC4245fi2).f30775c;
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new C4705vg(this, null), 3);
    }

    public static final void e0(C4318i4 c4318i4, Boolean bool) {
        PayStrategy payStrategyStatus = ((C4654tn) c4318i4.f30498b).j();
        Intrinsics.checkNotNullParameter(payStrategyStatus, "payStrategyStatus");
        T0.g.f26423a = bool.booleanValue() && !(payStrategyStatus instanceof PayStrategy.PayWithPartsOnly);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final void f0(M1.b orderFragmentEvent) {
        ListOfCardsResponseBody listOfCardsResponseBody;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList;
        Fi fi2;
        Intrinsics.checkNotNullParameter(orderFragmentEvent, "orderFragmentEvent");
        boolean equals = orderFragmentEvent.equals(We.f30271a);
        Te te2 = this.f30497a;
        if (equals) {
            te2.b(new Bi(Xf.LC_PAY_VIEW_APPEARED, Ur.PAY_VIEW, Pe.LC, null, null, null, null, 120));
            return;
        }
        if (orderFragmentEvent.equals(C4760xf.f32487a)) {
            te2.b(new Bi(Xf.LC_PAY_VIEW_DISAPPEARED, Ur.PAY_VIEW, Pe.LC, null, null, null, null, 120));
            return;
        }
        Integer num = 0;
        num = 0;
        num = 0;
        num = 0;
        if (orderFragmentEvent instanceof C4210ec) {
            if (((Collection) this.f31239C.getValue()).isEmpty()) {
                return;
            }
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new C4508ol(this, num, 0), 3);
            return;
        }
        boolean equals2 = orderFragmentEvent.equals(Gc.f29071a);
        Y9 y92 = this.f31243f;
        boolean z11 = false;
        if (!equals2) {
            if (orderFragmentEvent.equals(Ab.f28595a)) {
                Bi event = new Bi(Xf.TOUCH_CANCEL, Ur.PAY_VIEW, Pe.TOUCH, null, null, null, null, 120);
                Intrinsics.checkNotNullParameter(event, "event");
                te2.b(event);
                ((C4238fb) this.f31988c).b(C4825zo.f32678a);
                return;
            }
            if (orderFragmentEvent.equals(Wa.f30255a)) {
                Bi event2 = new Bi(Xf.TOUCH_BNPL, Ur.PAY_VIEW, Pe.TOUCH, null, null, null, null, 120);
                Intrinsics.checkNotNullParameter(event2, "event");
                te2.b(event2);
                if (((PaymentPlanBnplResponseBody) this.f31253p.getValue()) != null) {
                    ((C4238fb) y92).b(new Oc(C4788yf.f32570a, false));
                    return;
                }
                return;
            }
            if (orderFragmentEvent.equals(C4413ld.f31524a)) {
                g0();
                Bi event3 = new Bi(Xf.TOUCH_CARD, Ur.PAY_VIEW, Pe.TOUCH, null, null, null, null, 120);
                Intrinsics.checkNotNullParameter(event3, "event");
                te2.b(event3);
                ((C4238fb) y92).b(new Wm((InterfaceC4733wg) this.f31247j.getValue(this, f31236E[0]), null, false));
                return;
            }
            if (orderFragmentEvent.equals(C4645te.f32100a)) {
                ((C4238fb) y92).b(new Ae(new Mc()));
                return;
            } else {
                if (orderFragmentEvent.equals(Pd.f29691a)) {
                    Ae.x0 x0Var = this.f31249l;
                    do {
                    } while (!x0Var.b(x0Var.getValue(), Boolean.valueOf(!((Boolean) r2).booleanValue())));
                    return;
                }
                return;
            }
        }
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool = (ListOfCardsResponseBody.PaymentToolInfo.Tool) this.f31251n.getValue();
        if (tool == null || (listOfCardsResponseBody = (ListOfCardsResponseBody) this.f31250m.getValue()) == null || (paymentToolInfo = listOfCardsResponseBody.getPaymentToolInfo()) == null || (toolList = paymentToolInfo.getToolList()) == null) {
            return;
        }
        for (ListOfCardsResponseBody.PaymentToolInfo.Tool tool2 : toolList) {
            if (Intrinsics.d(tool2.getCardNumber(), tool.getCardNumber())) {
                Xf xf2 = Xf.TOUCH_PAY;
                Ur ur = Ur.PAY_VIEW;
                Bi event4 = new Bi(xf2, ur, Pe.TOUCH, null, null, null, null, 120);
                Intrinsics.checkNotNullParameter(event4, "event");
                te2.b(event4);
                EnumC4290h5 enumC4290h5 = EnumC4290h5.BNPL;
                Z8 z82 = Z8.f30578b;
                C4248fl c4248fl = this.f31241d;
                boolean z12 = Lf.a.r0(c4248fl, enumC4290h5, z82) && Lf.a.r0(c4248fl, enumC4290h5, Z8.f30577a);
                if (z12) {
                    Bi event5 = new Bi(Xf.LC_PAY_BNPL_START, ur, Pe.LC, null, null, null, null, 120);
                    Intrinsics.checkNotNullParameter(event5, "event");
                    te2.b(event5);
                }
                Ae.M0 m02 = this.f31261x;
                Fi fi3 = (Fi) m02.getValue();
                if (fi3 != null && fi3.f29008b) {
                    Bi event6 = new Bi(Xf.LC_PAY_SPASIBO_START, ur, Pe.LC, null, null, null, null, 120);
                    Intrinsics.checkNotNullParameter(event6, "event");
                    te2.b(event6);
                }
                ((C4654tn) this.f30498b).f32124A.setValue(Integer.valueOf(((Number) this.f31252o.getValue()).intValue()));
                g0();
                Boolean valueOf = Boolean.valueOf(Lf.a.r0(c4248fl, EnumC4290h5.REFRESH_TOKEN, null) ? ((Yq) this.f31244g).f30524e : false);
                Boolean valueOf2 = Boolean.valueOf(z12);
                Fi fi4 = (Fi) m02.getValue();
                if (fi4 != null && fi4.f29008b) {
                    z11 = true;
                }
                Fi fi5 = (Fi) m02.getValue();
                if (fi5 != null) {
                    Integer valueOf3 = Integer.valueOf(fi5.f29007a);
                    Fi fi6 = (Fi) m02.getValue();
                    if (fi6 != null && fi6.f29008b && ((fi2 = (Fi) m02.getValue()) == null || !fi2.f29009c)) {
                        num = valueOf3;
                    }
                }
                ((C4238fb) y92).b(new C4263g7(valueOf, tool2, valueOf2, new C4112b0(z11, num)));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final void g0() {
        Fi fi2 = (Fi) this.f31261x.getValue();
        if (fi2 != null) {
            Integer valueOf = Integer.valueOf(fi2.f29007a);
            boolean h02 = h0();
            boolean z11 = fi2.f29008b;
            if (!h02 || !z11) {
                valueOf = null;
            }
            C4487o0 bonuses = new C4487o0(z11, valueOf);
            C4654tn c4654tn = (C4654tn) this.f30498b;
            c4654tn.getClass();
            Intrinsics.checkNotNullParameter(bonuses, "bonuses");
            c4654tn.f32126C.setValue(bonuses);
        }
    }

    public final boolean h0() {
        return Lf.a.u0(this.f31241d, Qk.f29796d) && (((C4654tn) this.f30498b).f32129F.getValue() instanceof PayStrategy.PayWithBonuses);
    }
}
