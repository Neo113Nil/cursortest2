package Bl0;

import Bl0.b0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final C2662x f3920a;

    public H(C2662x persistentMetricsEventDataSource, B persistentMetricsEventDtoFactory, D persistentMetricsEventMapper, b0.b logger) {
        Intrinsics.checkNotNullParameter(persistentMetricsEventDataSource, "persistentMetricsEventDataSource");
        Intrinsics.checkNotNullParameter(persistentMetricsEventDtoFactory, "persistentMetricsEventDtoFactory");
        Intrinsics.checkNotNullParameter(persistentMetricsEventMapper, "persistentMetricsEventMapper");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f3920a = persistentMetricsEventDataSource;
    }
}
