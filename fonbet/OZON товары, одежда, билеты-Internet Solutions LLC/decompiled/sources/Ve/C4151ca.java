package Ve;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2414q0;
import Ae.I0;
import h3.C6788a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.ca, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4151ca extends AbstractC4425lp {

    /* renamed from: f, reason: collision with root package name */
    public final Ae.M0 f30788f;

    /* renamed from: g, reason: collision with root package name */
    public final Ae.M0 f30789g;

    /* renamed from: h, reason: collision with root package name */
    public final C2414q0 f30790h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4151ca(Te metricFacade, Vm sPayDataContract, Y9 sPaySdkReducer, H4 helperManager, C4248fl featuresHandler, Ib sPayStorage, Vl sPaySdkConfigRepository) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(helperManager, "helperManager");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        C4654tn c4654tn = (C4654tn) sPayDataContract;
        Be.m D11 = C2399j.D(c4654tn.f32141j, new S5(1));
        C6788a a11 = androidx.lifecycle.x0.a(this);
        int i11 = Ae.I0.f818a;
        Ae.M0 M11 = C2399j.M(D11, a11, I0.a.b(3), null);
        this.f30788f = C2399j.M(C2399j.i(C2399j.b(c4654tn.f32145n), M11, c4654tn.f32127D, new C4810z9(sPayDataContract, helperManager, sPaySdkConfigRepository, sPayStorage, null)), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        this.f30789g = C2399j.M(C2399j.D(new C2406m0(M11), new X8(helperManager, null)), androidx.lifecycle.x0.a(this), I0.a.b(3), null);
        this.f30790h = C2399j.i(((C4673ud) sPayStorage).f32205b, c4654tn.f32125B, c4654tn.f32129F, new Q7(featuresHandler, null));
    }

    @Override // Ve.AbstractC4425lp
    public final Unit e0(E event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(event instanceof Gm)) {
            return super.e0(event);
        }
        AbstractC4425lp.f0(this, Yl.LC_STATUS_SUCCESS_VIEW_APPEARED);
        return Unit.f71690a;
    }
}
