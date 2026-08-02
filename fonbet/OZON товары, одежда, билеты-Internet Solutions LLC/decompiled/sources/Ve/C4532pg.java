package Ve;

import Ae.C2399j;
import Ae.C2417s0;
import Ae.I0;
import h3.C6788a;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.domain.model.PayStrategy;

/* renamed from: Ve.pg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4532pg extends AbstractC4599rq implements InterfaceC4693v4 {

    /* renamed from: d, reason: collision with root package name */
    public final Y9 f31790d;

    /* renamed from: e, reason: collision with root package name */
    public final Ae.M0 f31791e;

    /* renamed from: f, reason: collision with root package name */
    public final Ae.x0 f31792f;

    /* renamed from: g, reason: collision with root package name */
    public final Ae.M0 f31793g;

    /* renamed from: h, reason: collision with root package name */
    public final Ae.M0 f31794h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4532pg(Te metricFacade, Vm sPayDataContract, Y9 sPaySdkReducer, Ib sPayStorage) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        this.f31790d = sPaySdkReducer;
        Ae.M0 b11 = C2399j.b(((C4654tn) sPayDataContract).f32142k);
        Ae.x0 a11 = Ae.O0.a(null);
        Ae.M0 b12 = C2399j.b(a11);
        this.f31791e = b12;
        Ae.x0 a12 = Ae.O0.a(null);
        this.f31792f = a12;
        this.f31793g = C2399j.b(a12);
        C2417s0 c2417s0 = new C2417s0(b11, b12, new C4725w8(1));
        C6788a a13 = androidx.lifecycle.x0.a(this);
        int i11 = Ae.I0.f818a;
        this.f31794h = C2399j.M(c2417s0, a13, I0.a.b(3), null);
        C4673ud c4673ud = (C4673ud) sPayStorage;
        if (!(c4673ud.a().f29004a instanceof C4144c3)) {
            throw new C4581r8(c4673ud.a().toString());
        }
        AbstractC4245fi abstractC4245fi = c4673ud.a().f29004a;
        Intrinsics.g(abstractC4245fi, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.OrderScreenData");
        a11.setValue(((C4144c3) abstractC4245fi).f30774b);
    }

    public final void e0(Lf.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean equals = event.equals(C4629sr.f32072b);
        Te te2 = this.f30497a;
        if (equals) {
            Bi event2 = new Bi(G.TOUCH_BACK, Ur.WEB_VIEW, Pe.TOUCH, null, null, null, null, 120);
            Intrinsics.checkNotNullParameter(event2, "event");
            te2.b(event2);
            ((C4238fb) this.f31790d).b(((C4654tn) this.f30498b).j() instanceof PayStrategy.PayWithPartsOnly ? Hb.f29136a : new Oc(C4788yf.f32570a, false));
            return;
        }
        if (event.equals(C4082a.f30620b)) {
            Bi event3 = new Bi(G.TOUCH_SHARE, Ur.WEB_VIEW, Pe.TOUCH, null, null, null, null, 120);
            Intrinsics.checkNotNullParameter(event3, "event");
            te2.b(event3);
            String str = (String) this.f31791e.getValue();
            if (str != null) {
                int i11 = R.string.spay_bnpl_share_link_message;
                Object[] args = {str};
                Intrinsics.checkNotNullParameter(args, "args");
                this.f31792f.setValue(new L5(new Pq(i11, C7705l.f0(args))));
                return;
            }
            return;
        }
        if (event.equals(H.f29097b)) {
            Bi event4 = new Bi(G.LC_WEB_VIEW_APPEARED, Ur.WEB_VIEW, Pe.LC, null, null, null, null, 120);
            Intrinsics.checkNotNullParameter(event4, "event");
            te2.b(event4);
        } else {
            if (!event.equals(C4516p0.f31753b)) {
                throw new Sc.o();
            }
            Bi event5 = new Bi(G.LC_WEB_VIEW_DISAPPEARED, Ur.WEB_VIEW, Pe.LC, null, null, null, null, 120);
            Intrinsics.checkNotNullParameter(event5, "event");
            te2.b(event5);
        }
    }
}
