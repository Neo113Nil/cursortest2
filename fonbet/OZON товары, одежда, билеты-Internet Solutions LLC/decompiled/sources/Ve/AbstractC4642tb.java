package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.tb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4642tb extends Yk {

    /* renamed from: c, reason: collision with root package name */
    public E8 f32097c;

    /* renamed from: d, reason: collision with root package name */
    public K9 f32098d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4642tb(Te metricFacade, Vm sPayDataContract, Yc clearUtil, Y9 sPaySdkReducer) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(clearUtil, "clearUtil");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
    }

    @Override // Ve.Yk
    public void d0(M1.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.d0(event);
        event.equals(Qa.f29764a);
    }
}
