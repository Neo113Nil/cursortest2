package Ve;

import Ae.C2399j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.lp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4425lp extends AbstractC4599rq {

    /* renamed from: d, reason: collision with root package name */
    public final Ae.x0 f31540d;

    /* renamed from: e, reason: collision with root package name */
    public final Ae.M0 f31541e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4425lp(Te metricFacade, Vm sPayDataContract, Y9 sPaySdkReducer) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        this.f31540d = Ae.O0.a(new L5(null));
        this.f31541e = C2399j.b(((C4654tn) sPayDataContract).f32157z);
    }

    public static void f0(AbstractC4425lp abstractC4425lp, Yl action) {
        abstractC4425lp.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        Bi event = new Bi(action, Ur.STATUS_VIEW, Pe.LC, null, null, null, null, 112);
        Intrinsics.checkNotNullParameter(event, "event");
        abstractC4425lp.f30497a.b(event);
    }

    public Unit e0(E event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.equals(C4308hn.f31208a)) {
            f0(this, Yl.LC_STATUS_VIEW_DISAPPEARED);
        } else if (event.equals(C4307hm.f31207a)) {
            ((C4238fb) this.f31988c).b(C4825zo.f32678a);
        }
        return Unit.f71690a;
    }
}
