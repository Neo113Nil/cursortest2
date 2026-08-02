package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.cb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4152cb extends AbstractC4599rq {

    /* renamed from: d, reason: collision with root package name */
    public final Y9 f30791d;

    /* renamed from: e, reason: collision with root package name */
    public final C4613sb f30792e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4152cb(Te metricFacade, Vm sPayDataContract, Y9 sPaySdkReducer, Ib sPayStorage) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        this.f30791d = sPaySdkReducer;
        C4673ud c4673ud = (C4673ud) sPayStorage;
        if (!(c4673ud.a().f29004a instanceof C4694v5)) {
            throw new C4581r8(c4673ud.a().toString());
        }
        AbstractC4245fi abstractC4245fi = c4673ud.a().f29004a;
        Intrinsics.g(abstractC4245fi, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.PaymentTokenResult");
        M1.b bVar = ((C4694v5) abstractC4245fi).f32258a;
        Intrinsics.g(bVar, "null cannot be cast to non-null type spay.sdk.domain.PaymentTokenStatus.ErrorWithBnplEnabled");
        this.f30792e = ((Nk) bVar).f29563b;
    }
}
