package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Yk extends androidx.lifecycle.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final Te f30497a;

    /* renamed from: b, reason: collision with root package name */
    public final Vm f30498b;

    public Yk(Te metricFacade, Vm sPayDataContract, Y9 sPaySdkReducer) {
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        this.f30497a = metricFacade;
        this.f30498b = sPayDataContract;
    }

    public void d0(M1.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.equals(C4475nh.f31661a) || event.equals(Ph.f29719a) || event.equals(C4534pi.f31799a) || event.equals(Qi.f29790a) || event.equals(C4650tj.f32117a)) {
            return;
        }
        event.equals(Vj.f30206a);
    }
}
