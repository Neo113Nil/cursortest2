package Ve;

import Ae.C2399j;
import kotlin.jvm.internal.Intrinsics;
import xe.C10727i;

/* renamed from: Ve.sq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4628sq extends AbstractC4642tb {

    /* renamed from: e, reason: collision with root package name */
    public final Pn f32069e;

    /* renamed from: f, reason: collision with root package name */
    public final Ae.x0 f32070f;

    /* renamed from: g, reason: collision with root package name */
    public final Ae.M0 f32071g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4628sq(Te metricFacade, Vm sPayDataContract, Yc clearSdkUtil, Y9 sPaySdkReducer, Ib sPayStorage) {
        super(metricFacade, sPayDataContract, clearSdkUtil, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(clearSdkUtil, "clearSdkUtil");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        AbstractC4245fi abstractC4245fi = ((Fh) ((C4673ud) sPayStorage).f32205b.getValue()).f29004a;
        Intrinsics.g(abstractC4245fi, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.FraudMonReview");
        this.f32069e = (Pn) abstractC4245fi;
        Ae.x0 a11 = Ae.O0.a(null);
        this.f32070f = a11;
        this.f32071g = C2399j.b(a11);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new C4454mp(this, null), 3);
    }
}
