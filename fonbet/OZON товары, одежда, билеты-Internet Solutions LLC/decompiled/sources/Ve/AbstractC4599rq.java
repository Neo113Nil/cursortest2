package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.rq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4599rq extends Yk {

    /* renamed from: c, reason: collision with root package name */
    public final Y9 f31988c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4599rq(Te metricFacade, Vm sPayDataContract, Y9 sPaySdkReducer) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        this.f31988c = sPaySdkReducer;
    }
}
