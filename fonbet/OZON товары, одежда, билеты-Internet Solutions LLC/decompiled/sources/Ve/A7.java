package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class A7 extends AbstractC4599rq {

    /* renamed from: d, reason: collision with root package name */
    public final Y9 f28585d;

    /* renamed from: e, reason: collision with root package name */
    public final C4258g2 f28586e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
    public A7(Te metricFacade, Vm sPayDataContract, Y9 sPaySdkReducer, Ib sPayStorage) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        this.f28585d = sPaySdkReducer;
        C4673ud c4673ud = (C4673ud) sPayStorage;
        AbstractC4245fi abstractC4245fi = c4673ud.a().f29004a;
        if (!(abstractC4245fi instanceof Jr)) {
            throw new C4581r8(c4673ud.a().toString());
        }
        this.f28586e = new C4258g2(((Jr) abstractC4245fi).f29320a);
    }
}
