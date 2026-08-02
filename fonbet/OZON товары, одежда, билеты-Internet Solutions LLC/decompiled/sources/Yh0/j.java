package Yh0;

import Qj0.U;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.tracker.performance.MetricType;

/* loaded from: classes7.dex */
final class j extends AbstractC7737t implements Function1<U, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Xh0.a f35101b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(Xh0.a aVar) {
        super(1);
        this.f35101b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(U u11) {
        U createTraceWithValues = u11;
        Intrinsics.checkNotNullParameter(createTraceWithValues, "$this$createTraceWithValues");
        MetricType metricType = MetricType.TOTAL_TIME_START;
        Xh0.a aVar = this.f35101b;
        U.p(createTraceWithValues, metricType, aVar.b(), false, 4);
        U.p(createTraceWithValues, MetricType.TOTAL_TIME_END, aVar.a(), false, 4);
        return Unit.f71690a;
    }
}
