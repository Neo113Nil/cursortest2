package Ve;

import Ae.C2399j;
import Lm0.a;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.SPaySdkConfig;

/* renamed from: Ve.q5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4550q5 extends AbstractC4599rq {

    /* renamed from: d, reason: collision with root package name */
    public final Ae.M0 f31842d;

    /* renamed from: e, reason: collision with root package name */
    public final Ae.M0 f31843e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4550q5(Te metricFacade, Vm sPayDataContract, Y9 sPaySdkReducer, Vl sPaySdkConfigRepository) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        String str;
        SPaySdkConfig sPaySdkConfig;
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        this.f31842d = C2399j.b(Ae.O0.a(new L5(Boolean.FALSE)));
        try {
            sPaySdkConfig = ((C4712vn) sPaySdkConfigRepository).f32313c;
        } catch (Exception e11) {
            a.b bVar = Lm0.a.f17149a;
            bVar.b("CATCH_BLOCK_EXCEPTION_TAG");
            bVar.i(e11);
            str = null;
        }
        if (sPaySdkConfig == null) {
            throw C4317i3.f31235a;
        }
        str = sPaySdkConfig.getLocalization().getPayError();
        this.f31843e = C2399j.b(Ae.O0.a(str));
    }
}
