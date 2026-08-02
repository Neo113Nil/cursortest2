package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.hc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4297hc extends AbstractC4599rq {

    /* renamed from: d, reason: collision with root package name */
    public final Y9 f31181d;

    /* renamed from: e, reason: collision with root package name */
    public final C4258g2 f31182e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4297hc(Te metricFacade, Vm sPayDataContract, Y9 sPaySdkReducer, Ib sPayStorage) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        this.f31181d = sPaySdkReducer;
        C4673ud c4673ud = (C4673ud) sPayStorage;
        AbstractC4245fi abstractC4245fi = c4673ud.a().f29004a;
        if (!(abstractC4245fi instanceof Ya)) {
            throw new C4581r8(c4673ud.a().toString());
        }
        this.f31182e = new C4258g2(((Ya) abstractC4245fi).f30448b);
    }
}
