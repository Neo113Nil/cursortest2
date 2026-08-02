package Qj0;

import We.B;
import ei0.InterfaceC6369b;
import java.util.Iterator;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.Metric;
import ru.ozon.tracker.performance.MetricType;

/* loaded from: classes7.dex */
public final class M implements We.B {
    private static long a(TreeSet treeSet, MetricType metricType) {
        Object obj;
        Iterator it = treeSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Metric) obj).getType() == metricType) {
                break;
            }
        }
        Metric metric = (Metric) obj;
        if (metric != null) {
            return metric.getValue();
        }
        return 0L;
    }

    @Override // We.B
    @NotNull
    public final We.L intercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        String a11 = s0.a(chain.request());
        InterfaceC6369b b11 = InterfaceC6369b.f62344a.b();
        if (b11 != null && b11.hasTrace(a11)) {
            U beginTrace = b11.beginTrace(a11);
            TreeSet j11 = beginTrace.j();
            long a12 = a(j11, MetricType.DNS_TIME_END) - a(j11, MetricType.DNS_TIME_START);
            if (a12 < 0) {
                a12 = 0;
            }
            long a13 = a(j11, MetricType.TCP_TIME_END) - a(j11, MetricType.TCP_TIME_START);
            if (a13 < 0) {
                a13 = 0;
            }
            long a14 = a(j11, MetricType.TLS_TIME_END) - a(j11, MetricType.TLS_TIME_START);
            long nanoTime = System.nanoTime() - ((a12 + a13) + (a14 >= 0 ? a14 : 0L));
            beginTrace.o(MetricType.REQUEST_PREPARE_TIME_END, nanoTime, false);
            beginTrace.o(MetricType.TIME_TO_FIRST_BYTE_START, nanoTime, true);
            beginTrace.o(MetricType.TIME_TO_LAST_BYTE_START, nanoTime, true);
            beginTrace.o(MetricType.ADDITIONAL_REQUESTS_TIME_START, nanoTime, false);
            beginTrace.o(MetricType.ADDITIONAL_REQUESTS_TIME_END, nanoTime, true);
            beginTrace.o(MetricType.NETWORK_ANTIBOT_TIME_START, nanoTime, false);
            beginTrace.o(MetricType.NETWORK_ANTIBOT_TIME_END, nanoTime, false);
            beginTrace.o(MetricType.NETWORK_LB_REDIRECT_TIME_START, nanoTime, false);
            beginTrace.o(MetricType.NETWORK_LB_REDIRECT_TIME_END, nanoTime, false);
        }
        return chain.proceed(chain.request());
    }
}
