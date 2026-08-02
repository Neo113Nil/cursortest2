package Ve;

import Ae.C2399j;
import Ae.I0;
import h3.C6788a;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.ErrorEntity;

/* renamed from: Ve.dp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4194dp extends Yk {

    /* renamed from: c, reason: collision with root package name */
    public final Y9 f30894c;

    /* renamed from: d, reason: collision with root package name */
    public final Ae.M0 f30895d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4194dp(Te metricFacade, Vm sPayDataContract, Y9 sPaySdkReducer, Ib sPayStorage) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        this.f30894c = sPaySdkReducer;
        Eo eo = new Eo(new C4822zl(new T1(((C4673ud) sPayStorage).f32205b, 1)));
        C6788a a11 = androidx.lifecycle.x0.a(this);
        int i11 = Ae.I0.f818a;
        this.f30895d = C2399j.M(eo, a11, I0.a.b(3), null);
    }

    public final void e0(InterfaceC4126be event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z11 = event instanceof Tc;
        Y9 y92 = this.f30894c;
        if (z11) {
            String str = (String) this.f30895d.getValue();
            if (str == null) {
                return;
            }
            ((C4238fb) y92).b(new O0(new Jr(new Tj(this, str, null))));
            return;
        }
        if (event instanceof C4758xd) {
            String queryParameter = ((C4758xd) event).f32484a.getQueryParameter("state");
            ((C4238fb) y92).b(kotlin.text.h.D(queryParameter, "success", true) ? new C4085a2(Ze.f30586a) : new Dp(new ErrorEntity.BindingPaymentFailed(Nk.a.b("Incorrect redirect state ", queryParameter)), false));
        } else if (event.equals(C4585rc.f31974a)) {
            Bi event2 = new Bi(Fr.TOUCH_BACK, Ur.OTP_VIEW, Pe.TOUCH, null, null, null, null, 120);
            Intrinsics.checkNotNullParameter(event2, "event");
            this.f30497a.b(event2);
            ((C4238fb) y92).b(C4825zo.f32678a);
        }
    }
}
