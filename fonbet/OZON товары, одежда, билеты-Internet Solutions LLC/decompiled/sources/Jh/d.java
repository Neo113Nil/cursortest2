package Jh;

import Bl0.c0;
import Qj0.U;
import di0.C6203c;
import k10.EnumC7467b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.MetricType;

/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private Long f14776a;

    public final void a() {
        this.f14776a = null;
    }

    public final void b() {
        if (this.f14776a != null) {
            return;
        }
        this.f14776a = Long.valueOf(System.nanoTime());
    }

    public final void c(@NotNull String traceId, @NotNull U trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Long l11 = this.f14776a;
        if (l11 != null) {
            long longValue = l11.longValue();
            C6203c c6203c = C6203c.f61631a;
            c0.c(traceId, EnumC7467b.LOADER_TIME_START, longValue, 8);
            U.p(trace, MetricType.LOADER_TIME_START, longValue, false, 4);
            this.f14776a = null;
        }
    }
}
