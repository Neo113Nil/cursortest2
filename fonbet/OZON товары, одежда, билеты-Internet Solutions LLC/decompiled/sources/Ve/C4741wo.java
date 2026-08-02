package Ve;

import Ae.C2399j;
import Ae.I0;
import h3.C6788a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.wo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4741wo extends AbstractC4425lp {

    /* renamed from: f, reason: collision with root package name */
    public final Ae.M0 f32387f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4741wo(Te metricFacade, Vm sPayDataContract, Y9 sPaySdkReducer, Vl sPaySdkConfigRepository) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        Be.m D11 = C2399j.D(C2399j.b(this.f31540d), new Sn(sPaySdkConfigRepository, null));
        C6788a a11 = androidx.lifecycle.x0.a(this);
        int i11 = Ae.I0.f818a;
        this.f32387f = C2399j.M(D11, a11, I0.a.b(3), null);
    }

    @Override // Ve.AbstractC4425lp
    public final Unit e0(E event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(event instanceof Gm)) {
            return super.e0(event);
        }
        AbstractC4425lp.f0(this, Yl.LC_STATUS_IN_PROGRESS_VIEW_APPEARED);
        return Unit.f71690a;
    }
}
