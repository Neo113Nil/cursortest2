package Ve;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.I0;
import Sc.InterfaceC4008j;
import h3.C6788a;
import id.C7048a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;
import xe.C10727i;

/* renamed from: Ve.g5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4261g5 extends AbstractC4599rq {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.m[] f31078l = {I1.w.c(C4261g5.class, "screenMode", "getScreenMode()Lspay/sdk/domain/OrderScreenMode;", 0)};

    /* renamed from: d, reason: collision with root package name */
    public final Ib f31079d;

    /* renamed from: e, reason: collision with root package name */
    public final Y9 f31080e;

    /* renamed from: f, reason: collision with root package name */
    public final C4248fl f31081f;

    /* renamed from: g, reason: collision with root package name */
    public final id.f f31082g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC4008j f31083h;

    /* renamed from: i, reason: collision with root package name */
    public final Ae.M0 f31084i;

    /* renamed from: j, reason: collision with root package name */
    public final Ae.M0 f31085j;

    /* renamed from: k, reason: collision with root package name */
    public final Ae.M0 f31086k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4261g5(Te metricFacade, Vm sPayDataContract, Ib sPayStorage, Y9 sPaySdkReducer, C4248fl featuresHandler) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        this.f31079d = sPayStorage;
        this.f31080e = sPaySdkReducer;
        this.f31081f = featuresHandler;
        C7048a.f66242a.getClass();
        id.f a11 = C7048a.a();
        this.f31082g = a11;
        C4654tn c4654tn = (C4654tn) sPayDataContract;
        Ae.x0 x0Var = c4654tn.f32149r;
        this.f31083h = Sc.k.b(new N2(sPayDataContract, this));
        Be.m D11 = C2399j.D(x0Var, new C4576r3());
        C6788a a12 = androidx.lifecycle.x0.a(this);
        int i11 = Ae.I0.f818a;
        this.f31084i = C2399j.M(D11, a12, I0.a.c(), null);
        this.f31085j = C2399j.M(C2399j.i(new C2406m0(C2399j.b(c4654tn.f32145n)), new C2406m0(x0Var), c4654tn.f32127D, new U3()), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        Ae.x0 a13 = Ae.O0.a(null);
        this.f31086k = C2399j.b(a13);
        C4673ud c4673ud = (C4673ud) sPayStorage;
        if (!(c4673ud.a().f29004a instanceof F3)) {
            throw new C4581r8(c4673ud.a().toString());
        }
        AbstractC4245fi abstractC4245fi = c4673ud.a().f29004a;
        Intrinsics.g(abstractC4245fi, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.OrderScreenSelectCard");
        F3 f32 = (F3) abstractC4245fi;
        a11.setValue(this, f31078l[0], f32.f28964a);
        a13.setValue(f32.f28965b);
    }

    public final void e0(M1.b event) {
        Object obj;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean equals = event.equals(Kl.f29363a);
        Te te2 = this.f30497a;
        if (equals) {
            Bi event2 = new Bi(Jn.LC_LIST_CARD_VIEW_APPEARED, Ur.LIST_CARD_VIEW, Pe.LC, null, null, null, null, 120);
            Intrinsics.checkNotNullParameter(event2, "event");
            te2.b(event2);
            return;
        }
        if (event.equals(C4451mm.f31606a)) {
            Bi event3 = new Bi(Jn.LC_LIST_CARD_VIEW_DISAPPEARED, Ur.LIST_CARD_VIEW, Pe.LC, null, null, null, null, 120);
            Intrinsics.checkNotNullParameter(event3, "event");
            te2.b(event3);
            return;
        }
        if (!(event instanceof Lm)) {
            throw new Sc.o();
        }
        Lm lm2 = (Lm) event;
        Bi event4 = new Bi(Jn.TOUCH_CARD, Ur.LIST_CARD_VIEW, Pe.TOUCH, null, null, null, null, 120);
        Intrinsics.checkNotNullParameter(event4, "event");
        te2.b(event4);
        List list = (List) this.f31084i.getValue();
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.d(((ListOfCardsResponseBody.PaymentToolInfo.Tool) obj).getCardNumber(), lm2.f29435a.f32018o)) {
                        break;
                    }
                }
            }
            ListOfCardsResponseBody.PaymentToolInfo.Tool incomeSelectedCard = (ListOfCardsResponseBody.PaymentToolInfo.Tool) obj;
            if (incomeSelectedCard != null) {
                C4673ud c4673ud = (C4673ud) this.f31079d;
                c4673ud.getClass();
                Intrinsics.checkNotNullParameter(incomeSelectedCard, "incomeSelectedCard");
                Ae.x0 x0Var = c4673ud.f32204a;
                x0Var.setValue(Fh.a((Fh) x0Var.getValue(), null, incomeSelectedCard, false, 5));
            }
        }
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new C4805z4(this, null), 3);
    }
}
